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

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.AppInfo;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.KeepInfo;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.UserInfo;

import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.ProcessingException;
import jakarta.ws.rs.Produces;

/**
 * HCL Domino REST API basis
 *
 * <p>REST APIs for Domino and more done right. With declarative security and access to Code, Design and Data
 *
 */

@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("")
public interface AdminApi  {

    /**
     * Get the list of configured OAuth applications
     *
     * Return Application Name/client_name, Description, Icon/logo_URI, Application URL/client_uri of active OAuth applications
     *
     */
    @GET
    @Path("/apps")
    @Produces({ "application/json" })
    List<AppInfo> fetchApps() throws ApiException, ProcessingException;

    /**
     * Get information about Domino and Domino REST API Version
     *
     * JSON element with basic version information
     *
     */
    @GET
    @Path("/info")
    @Produces({ "application/json" })
    KeepInfo getInfo() throws ApiException, ProcessingException;

    /**
     * Get information about the currently-authenticated user
     *
     * JSON element with OIDC-compatible user information
     *
     */
    @GET
    @Path("/userinfo")
    @Produces({ "application/json" })
    UserInfo getUserInfo() throws ApiException, ProcessingException;

    /**
     * Get information about the currently-authenticated user
     *
     * JSON element with OIDC-compatible user information
     *
     */
    @POST
    @Path("/userinfo")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    UserInfo getUserInfoPost(@Valid Object body) throws ApiException, ProcessingException;
}
