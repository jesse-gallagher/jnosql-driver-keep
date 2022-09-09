# OpenAPI Generator

This directory contains working files and scripts for generating the stub classes based on a Keep OpenAPI definition.

They make use of `openapi-generator` from [https://openapi-generator.tech/](https://openapi-generator.tech/), which is available in most package managers.

As configured, the generator uses the Apache HttpClient and Java 8+ date/time classes, as well as Jackson for its JSON handling. Apache HttpClient and Jackson are already present in Volt MX's dependencies, so this means we don't have to deploy any new third-party components.

### OpenAPI File Requirements

Generation requires a version of the Keep OpenAPI spec that includes all `schema` attributes filled in, and one such example is included in the repository. Once Keep has this in its default form, a normal OpenAPI spec from there can be used - until then, it will hit an exception during generation.

The process for this is to find each part of the schema that declares a request or response payload but does not have a `schema` attribute. For example, one current offender is the `/attachments/{unid}` endpoint, which lists its `post` payload as:

```json
"requestBody": {
    "description": "It's a file requested. The fieldName is not required. ",
    "content": {
        "multipart/form-data": {

        }
    },
    "required": true
}
```

The `multipart/form-data` section has no definition, and the generator chokes on this. Fortunately, we don't currently need true schemas for any such method, so this can be filled in generically:

```json
"requestBody": {
    "description": "It's a file requested. The fieldName is not required. ",
    "content": {
        "multipart/form-data": {
            "schema": {
                "type": "object"
            }
        }
    },
    "required": true
}
```

For now, an expedient way to identify these is to search for the string `"content"` (with the quotes) in an editor and find the objects that don't have a `schema` property.

### Post-Generation Tweaks

The generated code will _mostly_ work within the project as-is, but there are several required steps to get the code to compile and run:

1. Several methods resolve to using `UNKNOWN_BASE_TYPE`, which shows up in code but is not an actual model. Fortunately, these methods are related to agent access specifically and not (yet) important for this adapter's work. The most expedient route for now is to delete or comment out the errant import line and offending methods.
2. Some properties resolve as `AnyOfarrayarray`. These should be changed to `List<Object>` and should have a default assignment of `= new ArrayList<>()`.
3. Some method arguments resolve as `AnyOfDocumentMeta` and similar. These can be changed to `Object` for now, and callers can pass in a `Map<String, Object>`.
4. Similarly, some classes may end up extending `HashMap` with unknown types like `AnyOfnumberstringbooleanobjectarray`. These can be changed to `Object` as a generic parameter as well.
5. Remove the `com.hcl.keepclient.model.DominoDocument` class entirely and replace all references with `Map<String, Object>`. This is because the generated object maps names like `@unid` to `atUnid`.
6. Change the `imageBuild` property of `com.hcl.keepclient.model.KeepInfoKeepProperties` from `OffsetDatTime` to `String` (PJAN-867)
7. Change the return type of `getDesign` in `com.hcl.keepclient.api.DesignApi` to `Map<String, Object>`

There are also several changes that are likely due to upstream bugs in Keep (thanks to recent changes to the OpenAPI spec), as of 2022-04-04:

1. The generated property names in `com.hcl.keepclient.model.DatabaseEntry` are incorrect. They're generated as `apiNames` and `filePath`, but their JSON names (the string constants) should be changed to `apinames` and `filepath`, respectively (PJAN-1001).
2. The generated parameter name used in `com.hcl.keepclient.api.DataApi#createDocument` is incorrectly capitalized. The string inside that method should be changed from `"parentUnid"` to `"parentunid"` (PJAN-1000).

Additionally, in order to pass style-checking rules at compile time, several classes need imports cleaned and `serialVersionUID` properties added. These will be made specific during compilation, but the general rule is that compilation is configured to disallow any warnings. Missing serialization versions can be added, imports can be cleaned, and non-generic variables can be marked with `@SuppressWarnings("unchecked")` and `@SuppressWarnings("rawtypes")`.