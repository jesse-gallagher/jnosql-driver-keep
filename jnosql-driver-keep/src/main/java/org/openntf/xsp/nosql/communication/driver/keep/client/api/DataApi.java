/**
 * HCL Domino REST API basis
 * REST APIs for Domino and more done right. With declarative security and access to Code, Design and Data
 *
 * The version of the OpenAPI document: 1.0.10
 * Contact: HeyHCL@pnp-hcl.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openntf.xsp.nosql.communication.driver.keep.client.api;

import java.util.List;
import java.util.Map;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.AttachmentsUNIDResponseMessage;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.BulkCreateDocuments;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.BulkUnids;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.BulkUpdateDocuments;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.DocumentMeta;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.KeepFormMode;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.ListDesignItem;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.QueryRequest;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.RichTextRepresentation;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.StatusMessage;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.ProcessingException;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;

/**
 * HCL Domino REST API basis
 *
 * <p>REST APIs for Domino and more done right. With declarative security and access to Code, Design and Data
 *
 */

@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("")
public interface DataApi extends AutoCloseable {

    /**
     * Create multiple documents in a single call
     *
     * Create multiple documents in a request
     *
     */
    @POST
    @Path("/bulk/create")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    List<Object> bulkCreateDocuments(@QueryParam("dataSource") @NotNull String dataSource, @Valid BulkCreateDocuments bulkCreateDocuments, @QueryParam("richTextAs") RichTextRepresentation richTextAs) throws ApiException, ProcessingException;

    /**
     * Delete multiple documents in a single call
     *
     * Delete multiple documents in a request
     *
     */
    @POST
    @Path("/bulk/delete")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    List<Object> bulkDeleteDocuments(@QueryParam("dataSource") @NotNull String dataSource, @Valid BulkUnids bulkUnids) throws ApiException, ProcessingException;

    /**
     * Retrieve multiple documents in a single call by unid
     *
     * Retrieve multiple documents in a single call by unid
     *
     */
    @POST
    @Path("/bulk/unid")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    List<Object> bulkGetDocumentsByUnid(@QueryParam("dataSource") @NotNull String dataSource, @Valid BulkUnids bulkUnids, @QueryParam("richTextAs") RichTextRepresentation richTextAs, @QueryParam("meta") Boolean meta) throws ApiException, ProcessingException;

    /**
     * Update multiple documents in a single call
     *
     * Update multiple documents in a single call
     *
     */
    @PATCH
    @Path("/bulk/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    List<Object> bulkUpdateDocumentsByQuery(@QueryParam("dataSource") @NotNull String dataSource, @Valid BulkUpdateDocuments bulkUpdateDocuments, @QueryParam("richTextAs") RichTextRepresentation richTextAs) throws ApiException, ProcessingException;

    /**
     * Create a new document for a specified form.
     *
     * Create a new document for a specified form.
     *
     */
    @POST
    @Path("/document")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Map<String, Object> createDocument(@QueryParam("dataSource") @NotNull String dataSource, @Valid Map<String, Object> requestBody, @QueryParam("richTextAs") RichTextRepresentation richTextAs, @QueryParam("parentUnid") String parentUnid) throws ApiException, ProcessingException;

    /**
     * Creates a new attachment in an existing document
     *
     * The filename passed will be used, if unique. Otherwise a unique name will be evaluated from the passed filename.
     *
     */
    @POST
    @Path("/attachments/{unid}")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    AttachmentsUNIDResponseMessage createDocumentAttachment(@QueryParam("dataSource") @NotNull String dataSource, @PathParam("unid") String unid, @QueryParam("fieldName") String fieldName) throws ApiException, ProcessingException;

    /**
     * Create a new document for a specified form without data conversion
     *
     * Create a new document for a specified form.
     *
     */
    @POST
    @Path("/raw")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Map<String, Object> createDocumentRaw(@QueryParam("dataSource") @NotNull String dataSource, @QueryParam("form") @NotNull String form, @Valid Object body, @QueryParam("parentUnid") String parentUnid) throws ApiException, ProcessingException;

    /**
     * Delete the given document
     *
     * Delete the given document
     *
     */
    @DELETE
    @Path("/document/{unid}")
    @Produces({ "application/json" })
    StatusMessage deleteDocument(@QueryParam("dataSource") @NotNull String dataSource, @PathParam("unid") String unid, @QueryParam("mode") String mode) throws ApiException, ProcessingException;

    /**
     * Removes an attachment
     *
     * Remove the attachment for the document
     *
     */
    @DELETE
    @Path("/attachments/{unid}/{attachmentName}")
    @Produces({ "application/json" })
    StatusMessage deleteDocumentAttachment(@QueryParam("dataSource") @NotNull String dataSource, @PathParam("attachmentName") String attachmentName, @PathParam("unid") String unid, @QueryParam("fieldName") String fieldName) throws ApiException, ProcessingException;

    /**
     * Pulls in view data
     *
     * Pulls in view data
     *
     */
    @GET
    @Path("/lists/{name}")
    @Produces({ "application/json" })
    List<Object> fetchViewEntries(@PathParam("name") String name, @QueryParam("dataSource") @NotNull String dataSource, @QueryParam("count") Integer count, @QueryParam("scope") String scope, @QueryParam("start") Integer start, @QueryParam("key") String key, @QueryParam("keyAllowPartial") Boolean keyAllowPartial, @QueryParam("documents") Boolean documents, @QueryParam("metaAdditional") Boolean metaAdditional, @QueryParam("column") String column, @QueryParam("direction") String direction, @QueryParam("startsWith") String startsWith, @QueryParam("richTextAs") RichTextRepresentation richTextAs, @QueryParam("distinctDocuments") Boolean distinctDocuments, @QueryParam("mode") String mode, @QueryParam("meta") Boolean meta) throws ApiException, ProcessingException;

    /**
     * Provide information on available views/folders
     *
     * Uses db.getViews() and filters out excluded views
     *
     */
    @GET
    @Path("/lists")
    @Produces({ "application/json" })
    List<ListDesignItem> fetchViews(@QueryParam("dataSource") @NotNull String dataSource, @QueryParam("type") String type, @QueryParam("columns") Boolean columns) throws ApiException, ProcessingException;

    /**
     * Retrieve a given document at its appropriate mode
     *
     * Retrieve a given document at its appropriate mode
     *
     */
    @GET
    @Path("/document/{unid}")
    @Produces({ "application/json" })
    Map<String, Object> getDocument(@PathParam("unid") String unid, @QueryParam("dataSource") @NotNull String dataSource, @QueryParam("mode") String mode, @QueryParam("computeWithForm") Boolean computeWithForm, @QueryParam("meta") Boolean meta, @QueryParam("richTextAs") RichTextRepresentation richTextAs) throws ApiException, ProcessingException;

    /**
     * Retrieve a document&#39;s attachment
     *
     * Get the attachment of a document
     *
     */
    @GET
    @Path("/attachments/{unid}/{attachmentName}")
    @Produces({ "application/json" })
    void getDocumentAttachment(@QueryParam("dataSource") @NotNull String dataSource, @PathParam("attachmentName") String attachmentName, @PathParam("unid") String unid) throws ApiException, ProcessingException;

    /**
     * Returns the modes available and fields that can be edited
     *
     * Returns the modes available and fields that can be edited
     *
     */
    @GET
    @Path("/documentmodes/{unid}")
    @Produces({ "application/json" })
    List<KeepFormMode> getDocumentFormModes(@QueryParam("dataSource") @NotNull String dataSource, @PathParam("unid") String unid) throws ApiException, ProcessingException;

    /**
     * Retrieves document meta data including the form name
     *
     * Retrieves document meta data including the form name
     *
     */
    @GET
    @Path("/docmeta/{unid}")
    @Produces({ "application/json" })
    DocumentMeta getDocumentMetadata(@PathParam("unid") String unid, @QueryParam("dataSource") @NotNull String dataSource) throws ApiException, ProcessingException;

    /**
     * Retrieve a given document with all items
     *
     * All items are returned, no item name normalization or translation is applied No schema to normalize or filter the document is applied. Json is returned as-is from the Note.  To be able to use this endpoint a form mode \&quot;raw\&quot; must exist for the value of \&quot;form\&quot; item in the document and the current user needs the permission (set by formula in the \&quot;raw\&quot; mode) to use the mode  Use on your own risk!
     *
     */
    @GET
    @Path("/raw/{unid}")
    @Produces({ "application/json" })
    Map<String, Object> getDocumentRaw(@PathParam("unid") String unid, @QueryParam("dataSource") @NotNull String dataSource, @QueryParam("computeWithForm") Boolean computeWithForm) throws ApiException, ProcessingException;

    /**
     * Get Domino Database-specific OpenAPI spec
     *
     * Get Domino Database-specific OpenAPI spec
     *
     */
    @GET
    @Path("/openapi")
    @Produces({ "application/json" })
    Object getOpenAPI(@QueryParam("dataSource") @NotNull String dataSource, @QueryParam("voltmx") Boolean voltmx) throws ApiException, ProcessingException;

    /**
     * Shows preview endpoints
     *
     */
    @GET
    @Path("/preview")
    @Produces({ "application/json" })
    List<String> getPreviewFeatures() throws ApiException, ProcessingException;

    /**
     * Retrieve a given document for giving profile name
     *
     * Retrieve a given document for giving profile name
     *
     */
    @GET
    @Path("/profiledocument")
    @Produces({ "application/json" })
    Map<String, Object> getProfileDocument(@QueryParam("dataSource") @NotNull String dataSource, @QueryParam("profileName") @NotNull String profileName, @QueryParam("user") Boolean user) throws ApiException, ProcessingException;

    /**
     * Return RichText as Base64 encoded Markdown
     *
     * Return RichText as Base64 encoded Markdown
     *
     */
    @GET
    @Path("/richtext/markdown/{unid}")
    @Produces({ "text/markdown", "application/json" })
    String getRichTextMarkdown(@QueryParam("dataSource") @NotNull String dataSource, @PathParam("unid") String unid, @QueryParam("mode") String mode, @QueryParam("item") String item) throws ApiException, ProcessingException;

    /**
     * Return RichText as Base64 encoded MIME
     *
     * Return RichText as Base64 encoded MIME
     *
     */
    @GET
    @Path("/richtext/mime/{unid}")
    @Produces({ "application/mime", "application/json" })
    String getRichTextMime(@QueryParam("dataSource") @NotNull String dataSource, @PathParam("unid") String unid, @QueryParam("mode") String mode, @QueryParam("item") String item) throws ApiException, ProcessingException;

    /**
     * Perform a document update on only the fields you specify in the request.
     *
     * Provide a JSON structure that is a subset of the document items. items not mentioned stay untouched, items with null values are removed
     *
     */
    @PATCH
    @Path("/document/{unid}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Map<String, Object> patchDocument(@QueryParam("dataSource") @NotNull String dataSource, @PathParam("unid") String unid, @Valid Map<String, Object> requestBody, @QueryParam("mode") String mode, @QueryParam("parentUnid") String parentUnid, @QueryParam("revision") String revision, @QueryParam("richTextAs") RichTextRepresentation richTextAs) throws ApiException, ProcessingException;

    /**
     * Processes view data as pivot
     *
     * Computes min, max, count, total of retrieved view entries
     *
     */
    @GET
    @Path("/listspivot/{name}")
    @Produces({ "application/json" })
    Object pivotViewEntries(@PathParam("name") String name, @QueryParam("pivotColumn") @NotNull String pivotColumn, @QueryParam("dataSource") @NotNull String dataSource, @QueryParam("count") Integer count, @QueryParam("scope") String scope, @QueryParam("start") Integer start, @QueryParam("key") String key, @QueryParam("column") String column, @QueryParam("direction") String direction, @QueryParam("startsWith") String startsWith, @QueryParam("mode") String mode) throws ApiException, ProcessingException;

    /**
     * Send a DQL query and get JSON documents back
     *
     * Send a DQL query and get JSON documents back
     *
     */
    @POST
    @Path("/query")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    List<Map<String, Object>> query(@QueryParam("dataSource") @NotNull String dataSource, @QueryParam("action") @NotNull String action, @Valid QueryRequest queryRequest, @QueryParam("richTextAs") RichTextRepresentation richTextAs, @QueryParam("count") Integer count, @QueryParam("start") Integer start) throws ApiException, ProcessingException;

    /**
     * Perform an update on the document at the relevant mode
     *
     * Perform an update on the document at the relevant mode
     *
     */
    @PUT
    @Path("/document/{unid}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Map<String, Object> updateDocument(@QueryParam("dataSource") @NotNull String dataSource, @PathParam("unid") String unid, @Valid Map<String, Object> requestBody, @QueryParam("mode") String mode, @QueryParam("parentUnid") String parentUnid, @QueryParam("revision") String revision, @QueryParam("richTextAs") RichTextRepresentation richTextAs) throws ApiException, ProcessingException;

    /**
     * Perform an update on the document with anything that&#39;s in JSON
     *
     * All items are updated, no item name normalization or translation is applied No schema to normalize or filter the document is applied. Json is written as-is into the Note.  To be able to use this endpoint a form mode \&quot;raw\&quot; must exist for the value of \&quot;form\&quot; item in the document and the current user needs the permission (set by formula in the \&quot;raw\&quot; mode) to use the mode  Use on your own risk!
     *
     */
    @PUT
    @Path("/raw/{unid}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Map<String, Object> updateDocumentRaw(@QueryParam("dataSource") @NotNull String dataSource, @PathParam("unid") String unid, @Valid Object body, @QueryParam("parentUnid") String parentUnid) throws ApiException, ProcessingException;
    
    @Override
    void close();
}
