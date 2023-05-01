# Jakarta NoSQL Driver For Domino Via Keep

This repository contains a Jakarta NoSQL driver that connects to a Domino server via Keep (the Domino REST API). This driver targets Jakarta EE 10 and assumes that your application includes at least CDI 4.0, Bean Validation 3.0, and JSON-B 3.0. This driver builds on the core driver components developed in the [XPages Jakarta EE Support project](https://github.com/OpenNTF/org.openntf.xsp.jakartaee/).

## Usage

This driver can be retrieved from OpenNTF's Maven repository:

```xml
<repositories>
	<repository>
		<id>openntf</id>
		<url>https://artifactory.openntf.org/openntf</url>
	</repository>
</repositories>

<dependencies>
	<dependency>
		<groupId>org.openntf.jakarta</groupId>
		<artifactId>jnosql-driver-keep</artifactId>
		<version>1.0.0-SNAPSHOT</version>
	</dependency>
</dependencies>
```

To provide access to the contextual database, create a CDI bean that supplies `BaseUriSupplier`, `DataSourceSupplier`, and `AccessTokenSupplier` instances. For example:

```java
@RequestScoped
public class ContextDatabaseSupplier {
  @Inject
  @ConfigProperty(name="keep.apiName")
  private String apiName;
  
  @Inject
  @ConfigProperty(name="keep.baseUri")
  private URI baseUri;
  
  @Inject
  private OidcContextBean oidcContext;
	
  @Produces
  public BaseUriSupplier getBaseUri() {
    return () -> baseUri;
  }
  
  @Produces
  public DataSourceSupplier getDataSource() {
    return () -> apiName;
  }
  
  @Produces
  @Dependent
  public AccessTokenSupplier getAccessToken() {
    return oidcContext::getToken;
  }
}
```

Most likely, it will make sense to configure Keep and your app to use the same external OIDC provider, such as Keycloak.

## Implementation Notes

Currently, this driver is in heavy development, and in particular doesn't properly support rich text or attachments.

#### Upstream Limitations

Because Keep does not expose a number of Domino APIs and concepts, this driver is limited compared to the LSXBE driver. Specifically:

- DominoDocumentCollectionManager#getByNoteId is unavailable
- Folder add/remove methods are not available
- Transaction support is not available
- DominoDocumentCollectionManager#count is much slower than on a local driver
- The `protected` and `signed` item flags are not supported

#### Jakarta NoSQL Dependencies

Because official builds of Jakarta NoSQL and the JNoSQL implementation target JEE8 upstream APIs, this project uses [transformed](https://github.com/eclipse/transformer) artifacts hosted on OpenNTF's Maven repository using different coordinates and version numbers from the standard versions.

## Requirements

- Java 8 or above

## License

The code in the project is licensed under the Apache License 2.0. The dependencies in the binary distribution are licensed under compatible licenses - see NOTICE for details.