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

import java.util.Map;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.ODataDbNameResponse;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.ODataDbResponse;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.ODataDocument;

import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
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
@Path("/odata")
public interface OdataApi  {

    /**
     * ODATA is JSON with defined Meta data
     *
     * ODATA is JSON with defined Meta data
     *
     */
    @POST
    @Path("/{dataSource}/{name}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    ODataDocument createOdata(@PathParam("dataSource") String dataSource, @PathParam("name") String name, @Valid Map<String, Object> requestBody, @HeaderParam("OData-MaxVersion")  String odataMaxVersion, @HeaderParam("OData-Version")  String odataVersion, @HeaderParam("MaxDataServiceVersion")  String maxDataServiceVersion) throws ApiException, ProcessingException;

    /**
     * Get documents for Forms or Views in OData format
     *
     * ODATA is JSON with defined Meta data
     *
     */
    @GET
    @Path("/{dataSource}/{name}")
    @Produces({ "application/json" })
    ODataDbNameResponse fetchOdata(@PathParam("dataSource") String dataSource, @PathParam("name") String name, @HeaderParam("OData-MaxVersion")  String odataMaxVersion, @HeaderParam("OData-Version")  String odataVersion, @HeaderParam("MaxDataServiceVersion")  String maxDataServiceVersion, @QueryParam("$select") String $select, @QueryParam("$top") Integer $top, @QueryParam("$filter") String $filter, @QueryParam("$search") String $search, @QueryParam("$orderby") String $orderby, @QueryParam("$skip") Integer $skip, @QueryParam("$count") Boolean $count) throws ApiException, ProcessingException;

    /**
     * Display scopes that have enabled/created Odata as mode in any of its form in JSONObject.,
     *
     * Retrieve all of the Domino Rest API Database/Scopes that supports Odata in any of its forms along with important Odata details such as url and meta as JSONObject.,
     *
     */
    @GET
    
    @Produces({ "application/json" })
    Object fetchOdataList() throws ApiException, ProcessingException;

    /**
     * Get an document in OData format
     *
     * ODATA is JSON with defined Meta data
     *
     */
    @GET
    @Path("/{dataSource}/{name}/{unid}")
    @Produces({ "application/json" })
    ODataDocument getOdataItem(@PathParam("dataSource") String dataSource, @PathParam("name") String name, @PathParam("unid") String unid, @HeaderParam("OData-MaxVersion")  String odataMaxVersion, @HeaderParam("OData-Version")  String odataVersion, @HeaderParam("MaxDataServiceVersion")  String maxDataServiceVersion, @QueryParam("$select") String $select) throws ApiException, ProcessingException;

    /**
     * ODATA Meta Data is XML
     *
     * Get ODATA Meta Data which is XML
     *
     */
    @GET
    @Path("/{dataSource}/$metadata")
    @Produces({ "application/xml", "text/xml", "application/json" })
    String getOdataMetadata(@PathParam("dataSource") String dataSource, @HeaderParam("OData-MaxVersion")  String odataMaxVersion, @HeaderParam("OData-Version")  String odataVersion, @HeaderParam("MaxDataServiceVersion")  String maxDataServiceVersion) throws ApiException, ProcessingException;

    /**
     * ODATA is JSON with defined Meta data
     *
     * ODATA is JSON with defined Meta data
     *
     */
    @GET
    @Path("/{dataSource}")
    @Produces({ "application/json", "text/plain" })
    ODataDbResponse getOdataServiceInfo(@PathParam("dataSource") String dataSource, @HeaderParam("OData-MaxVersion")  String odataMaxVersion, @HeaderParam("OData-Version")  String odataVersion, @HeaderParam("MaxDataServiceVersion")  String maxDataServiceVersion) throws ApiException, ProcessingException;

    /**
     * Perform an update on the document in OData format
     *
     * Perform an update on the document in OData format
     *
     */
    @PUT
    @Path("/{dataSource}/{name}/{unid}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    ODataDocument updateOdataDocument(@PathParam("dataSource") String dataSource, @PathParam("unid") String unid, @PathParam("name") String name, @Valid Map<String, Object> requestBody, @HeaderParam("OData-MaxVersion")  String odataMaxVersion, @HeaderParam("OData-Version")  String odataVersion, @HeaderParam("MaxDataServiceVersion")  String maxDataServiceVersion, @QueryParam("revision") String revision) throws ApiException, ProcessingException;
}
