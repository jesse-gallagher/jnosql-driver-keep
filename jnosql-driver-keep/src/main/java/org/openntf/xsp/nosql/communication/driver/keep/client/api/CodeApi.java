/**
 * HCL Project KEEP Core API v1
 * REST APIs for Domino and more done right. With declarative security and access to Code, Design and data
 *
 * The version of the OpenAPI document: 4.3.9
 * Contact: HeyHCL@pnp-hcl.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openntf.xsp.nosql.communication.driver.keep.client.api;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.AgentAsyncMessage;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.AgentPayload;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.AgentPayloadAsync;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.AgentWithContextMessage;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.ExecutionRequest;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.ExecutionResult;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.FormulaRequest;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.FormulaResult;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.StatusMessage;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.ProcessingException;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;

/**
 * HCL Project KEEP Core API v1
 *
 * <p>REST APIs for Domino and more done right. With declarative security and access to Code, Design and data
 *
 */

@RegisterProvider(ApiExceptionMapper.class)
@Path("/run")
public interface CodeApi  {

    /**
     * Aborts an async agent
     *
     */
    @DELETE
    @Path("/agentAsync/{uuid}")
    @Produces({ "application/json" })
    public StatusMessage cancelAgent(@QueryParam("dataSource") @NotNull String dataSource, @PathParam("uuid") String uuid) throws ApiException, ProcessingException;

    /**
     * Send execution request to server
     *
     * Sends JavaScript to a server to be executed in the Domino context
     *
     */
    @POST
    @Path("/code")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public ExecutionResult execute(@QueryParam("dataSource") @NotNull String dataSource, @Valid ExecutionRequest executionRequest) throws ApiException, ProcessingException;

    /**
     * Runs an agent in a database, in real time
     *
     * Runs an existing agent, serverside. Existing limits of agent execution duration apply. This should only be used for short-running agents and simulated calling the agent from a browser.
     *
     */
    @POST
    @Path("/agent")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Object executeAgent(@QueryParam("dataSource") @NotNull String dataSource, @Valid AgentPayload agentPayload) throws ApiException, ProcessingException;

    /**
     * Runs an agent in a database asynchronously
     *
     * Queues an existing agent to run asynchronously, serverside. Existing limits of agent execution duration apply, but the HTTP response will be delivered immediately. The response will include a UUID for the request, which can be used to check progress or cancel the agent.  Content in the payload will be passed to the scheduler to identify run criteria.
     *
     */
    @POST
    @Path("/agentAsync")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public StatusMessage executeAgentAsync(@QueryParam("dataSource") @NotNull String dataSource, @Valid AgentPayloadAsync agentPayloadAsync) throws ApiException, ProcessingException;

    /**
     * Runs an agent in a database, in real time, passing a document for context
     *
     * Runs an existing agent, serverside, passing an UNID of a document to act upon. NotesSession.documentContext can be used in the agent to access the relevant document. Existing limits of agent execution duration apply. This should only be used for short-running agents and simulated calling the agent from a browser.
     *
     */
    @POST
    @Path("/agentWithContext")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Object executeAgentWithContext(@QueryParam("dataSource") @NotNull String dataSource, @Valid AgentWithContextMessage agentWithContextMessage) throws ApiException, ProcessingException;

    /**
     * Send execution request to server
     *
     * Sends JavaScript to a server to be executed in the Domino context
     *
     */
    @POST
    @Path("/codegroovy")
    @Consumes({ "application/javascript" })
    @Produces({ "application/json" })
    public ExecutionResult executeGroovy(@QueryParam("dataSource") @NotNull String dataSource, @Valid String body, @QueryParam("collection") String collection, @QueryParam("document") String document, @QueryParam("view") String view, @QueryParam("query") String query) throws ApiException, ProcessingException;

    /**
     * Send execution request to server
     *
     * Sends JavaScript to a server to be executed in the Domino context
     *
     */
    @POST
    @Path("/codejs")
    @Consumes({ "text/plain" })
    @Produces({ "application/json" })
    public ExecutionResult executeJavaScript(@QueryParam("dataSource") @NotNull String dataSource, @Valid String body, @QueryParam("collection") String collection, @QueryParam("document") String document, @QueryParam("view") String view, @QueryParam("query") String query) throws ApiException, ProcessingException;

    /**
     * Get current status for an async agent
     *
     * Get current status of an agent running asynchronously
     *
     */
    @GET
    @Path("/agentAsync/{uuid}")
    @Produces({ "application/json" })
    public AgentAsyncMessage getAgentInfo(@QueryParam("dataSource") @NotNull String dataSource, @PathParam("uuid") String uuid) throws ApiException, ProcessingException;

    /**
     * Post a formula  to Domino
     *
     * Checks if a formula would execute properly. Mostly used for Keep AdminUI to test formula fields
     *
     */
    @POST
    @Path("/formula")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public FormulaResult runFormula(@QueryParam("dataSource") @NotNull String dataSource, @Valid FormulaRequest formulaRequest) throws ApiException, ProcessingException;
}
