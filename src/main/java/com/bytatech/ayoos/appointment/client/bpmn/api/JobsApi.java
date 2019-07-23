/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.appointment.client.bpmn.api;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import com.bytatech.ayoos.appointment.client.bpmn.model.DataResponse;
import com.bytatech.ayoos.appointment.client.bpmn.model.JobResponse;
import com.bytatech.ayoos.appointment.client.bpmn.model.RestActionRequest;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-11-13T13:06:04.659+05:30[Asia/Kolkata]")

@Api(value = "Jobs", description = "the Jobs API")
public interface JobsApi {

    @ApiOperation(value = "Delete a deadletter job", nickname = "deleteDeadLetterJob", notes = "", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Indicates the job was found and has been deleted. Response-body is intentionally empty."),
        @ApiResponse(code = 404, message = "Indicates the requested job was not found.") })
    @RequestMapping(value = "/management/deadletter-jobs/{jobId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteDeadLetterJob(@ApiParam(value = "",required=true) @PathVariable("jobId") String jobId);


    @ApiOperation(value = "Delete a job", nickname = "deleteJob", notes = "", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Indicates the job was found and has been deleted. Response-body is intentionally empty."),
        @ApiResponse(code = 404, message = "Indicates the requested job was not found..") })
    @RequestMapping(value = "/management/jobs/{jobId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteJob(@ApiParam(value = "The id of the job to delete.",required=true) @PathVariable("jobId") String jobId);


    @ApiOperation(value = "Delete a timer job", nickname = "deleteTimerJob", notes = "", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Indicates the job was found and has been deleted. Response-body is intentionally empty."),
        @ApiResponse(code = 404, message = "Indicates the requested job was not found.") })
    @RequestMapping(value = "/management/timer-jobs/{jobId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteTimerJob(@ApiParam(value = "",required=true) @PathVariable("jobId") String jobId);


    @ApiOperation(value = "Execute a single job", nickname = "executeJobAction", notes = "", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Indicates the job was executed. Response-body is intentionally empty."),
        @ApiResponse(code = 404, message = "Indicates the requested job was not found."),
        @ApiResponse(code = 500, message = "Indicates the an exception occurred while executing the job. The status-description contains additional detail about the error. The full error-stacktrace can be fetched later on if needed.") })
    @RequestMapping(value = "/management/jobs/{jobId}",
        method = RequestMethod.POST)
    ResponseEntity<Void> executeJobAction(@ApiParam(value = "",required=true) @PathVariable("jobId") String jobId,@ApiParam(value = "Action to perform. Only execute is supported."  )  @Valid @RequestBody RestActionRequest restActionRequest);


    @ApiOperation(value = "Get the exception stacktrace for a deadletter job", nickname = "getDeadLetterJobStacktrace", notes = "", response = String.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the requested job was not found and the stacktrace has been returned. The response contains the raw stacktrace and always has a Content-type of text/plain.", response = String.class),
        @ApiResponse(code = 404, message = "Indicates the requested job was not found or the job doesn�t have an exception stacktrace. Status-description contains additional information about the error.") })
    @RequestMapping(value = "/management/deadletter-jobs/{jobId}/exception-stacktrace",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<String> getDeadLetterJobStacktrace(@ApiParam(value = "",required=true) @PathVariable("jobId") String jobId);


    @ApiOperation(value = "Get a single deadletter job", nickname = "getDeadletterJob", notes = "", response = JobResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the suspended job exists and is returned.", response = JobResponse.class),
        @ApiResponse(code = 404, message = "Indicates the requested job does not exist.") })
    @RequestMapping(value = "/management/deadletter-jobs/{jobId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<JobResponse> getDeadletterJob(@ApiParam(value = "",required=true) @PathVariable("jobId") String jobId);


    @ApiOperation(value = "Get a single job", nickname = "getJob", notes = "", response = JobResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the job exists and is returned.", response = JobResponse.class),
        @ApiResponse(code = 404, message = "Indicates the requested job does not exist.") })
    @RequestMapping(value = "/management/jobs/{jobId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<JobResponse> getJob(@ApiParam(value = "The id of the job to get.",required=true) @PathVariable("jobId") String jobId);


    @ApiOperation(value = "Get the exception stacktrace for a job", nickname = "getJobStacktrace", notes = "", response = String.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the requested job was not found and the stacktrace has been returned. The response contains the raw stacktrace and always has a Content-type of text/plain.", response = String.class),
        @ApiResponse(code = 404, message = "Indicates the requested job was not found or the job doesn�t have an exception stacktrace. Status-description contains additional information about the error.") })
    @RequestMapping(value = "/management/jobs/{jobId}/exception-stacktrace",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<String> getJobStacktrace(@ApiParam(value = "Id of the job to get the stacktrace for.",required=true) @PathVariable("jobId") String jobId);


    @ApiOperation(value = "Get a single suspended job", nickname = "getSuspendedJob", notes = "", response = JobResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the suspended job exists and is returned.", response = JobResponse.class),
        @ApiResponse(code = 404, message = "Indicates the requested job does not exist.") })
    @RequestMapping(value = "/management/suspended-jobs/{jobId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<JobResponse> getSuspendedJob(@ApiParam(value = "",required=true) @PathVariable("jobId") String jobId);


    @ApiOperation(value = "Get the exception stacktrace for a suspended job", nickname = "getSuspendedJobStacktrace", notes = "", response = String.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the requested job was not found and the stacktrace has been returned. The response contains the raw stacktrace and always has a Content-type of text/plain.", response = String.class),
        @ApiResponse(code = 404, message = "Indicates the requested job was not found or the job doesn�t have an exception stacktrace. Status-description contains additional information about the error.") })
    @RequestMapping(value = "/management/suspended-jobs/{jobId}/exception-stacktrace",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<String> getSuspendedJobStacktrace(@ApiParam(value = "",required=true) @PathVariable("jobId") String jobId);


    @ApiOperation(value = "Get a single timer job", nickname = "getTimerJob", notes = "", response = JobResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the timer job exists and is returned.", response = JobResponse.class),
        @ApiResponse(code = 404, message = "Indicates the requested job does not exist.") })
    @RequestMapping(value = "/management/timer-jobs/{jobId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<JobResponse> getTimerJob(@ApiParam(value = "",required=true) @PathVariable("jobId") String jobId);


    @ApiOperation(value = "Get the exception stacktrace for a timer job", nickname = "getTimerJobStacktrace", notes = "", response = String.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the requested job was not found and the stacktrace has been returned. The response contains the raw stacktrace and always has a Content-type of text/plain.", response = String.class),
        @ApiResponse(code = 404, message = "Indicates the requested job was not found or the job doesn�t have an exception stacktrace. Status-description contains additional information about the error.") })
    @RequestMapping(value = "/management/timer-jobs/{jobId}/exception-stacktrace",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<String> getTimerJobStacktrace(@ApiParam(value = "",required=true) @PathVariable("jobId") String jobId);


    @ApiOperation(value = "Get a list of deadletter jobs", nickname = "listDeadLetterJobs", notes = "", response = DataResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the requested jobs were returned.", response = DataResponse.class),
        @ApiResponse(code = 400, message = "Indicates an illegal value has been used in a url query parameter or the both 'messagesOnly' and 'timersOnly' are used as parameters. Status description contains additional details about the error.") })
    @RequestMapping(value = "/management/deadletter-jobs",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<DataResponse> listDeadLetterJobs(@ApiParam(value = "Only return job with the given id") @Valid @RequestParam(value = "id", required = false) String id,@ApiParam(value = "Only return jobs part of a process with the given id") @Valid @RequestParam(value = "processInstanceId", required = false) String processInstanceId,@ApiParam(value = "Only return jobs part of an execution with the given id") @Valid @RequestParam(value = "executionId", required = false) String executionId,@ApiParam(value = "Only return jobs with the given process definition id") @Valid @RequestParam(value = "processDefinitionId", required = false) String processDefinitionId,@ApiParam(value = "If true, only return jobs which are timers. If false, this parameter is ignored. Cannot be used together with 'messagesOnly'.") @Valid @RequestParam(value = "timersOnly", required = false) Boolean timersOnly,@ApiParam(value = "If true, only return jobs which are messages. If false, this parameter is ignored. Cannot be used together with 'timersOnly'") @Valid @RequestParam(value = "messagesOnly", required = false) Boolean messagesOnly,@ApiParam(value = "If true, only return jobs for which an exception occurred while executing it. If false, this parameter is ignored.") @Valid @RequestParam(value = "withException", required = false) Boolean withException,@ApiParam(value = "Only return jobs which are due to be executed before the given date. Jobs without duedate are never returned using this parameter.") @Valid @RequestParam(value = "dueBefore", required = false) String dueBefore,@ApiParam(value = "Only return jobs which are due to be executed after the given date. Jobs without duedate are never returned using this parameter.") @Valid @RequestParam(value = "dueAfter", required = false) String dueAfter,@ApiParam(value = "Only return jobs with the given exception message") @Valid @RequestParam(value = "exceptionMessage", required = false) String exceptionMessage,@ApiParam(value = "Only return jobs with the given tenantId.") @Valid @RequestParam(value = "tenantId", required = false) String tenantId,@ApiParam(value = "Only return jobs with a tenantId like the given value.") @Valid @RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,@ApiParam(value = "If true, only returns jobs without a tenantId set. If false, the withoutTenantId parameter is ignored.") @Valid @RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId,@ApiParam(value = "If true, only return jobs which are locked.  If false, this parameter is ignored.") @Valid @RequestParam(value = "locked", required = false) Boolean locked,@ApiParam(value = "If true, only return jobs which are unlocked. If false, this parameter is ignored.") @Valid @RequestParam(value = "unlocked", required = false) Boolean unlocked,@ApiParam(value = "Property to sort on, to be used together with the order.", allowableValues = "id, dueDate, executionId, processInstanceId, retries, tenantId") @Valid @RequestParam(value = "sort", required = false) String sort);


    @ApiOperation(value = "Get a list of jobs", nickname = "listJobs", notes = "", response = DataResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the requested jobs were returned.", response = DataResponse.class),
        @ApiResponse(code = 400, message = "Indicates an illegal value has been used in a url query parameter or the both 'messagesOnly' and 'timersOnly' are used as parameters. Status description contains additional details about the error.") })
    @RequestMapping(value = "/management/jobs",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<DataResponse> listJobs(@ApiParam(value = "Only return job with the given id") @Valid @RequestParam(value = "id", required = false) String id,@ApiParam(value = "Only return jobs part of a process with the given id") @Valid @RequestParam(value = "processInstanceId", required = false) String processInstanceId,@ApiParam(value = "Only return jobs part of an execution with the given id") @Valid @RequestParam(value = "executionId", required = false) String executionId,@ApiParam(value = "Only return jobs with the given process definition id") @Valid @RequestParam(value = "processDefinitionId", required = false) String processDefinitionId,@ApiParam(value = "If true, only return jobs which are timers. If false, this parameter is ignored. Cannot be used together with 'messagesOnly'.") @Valid @RequestParam(value = "timersOnly", required = false) Boolean timersOnly,@ApiParam(value = "If true, only return jobs which are messages. If false, this parameter is ignored. Cannot be used together with 'timersOnly'") @Valid @RequestParam(value = "messagesOnly", required = false) Boolean messagesOnly,@ApiParam(value = "If true, only return jobs for which an exception occurred while executing it. If false, this parameter is ignored.") @Valid @RequestParam(value = "withException", required = false) Boolean withException,@ApiParam(value = "Only return jobs which are due to be executed before the given date. Jobs without duedate are never returned using this parameter.") @Valid @RequestParam(value = "dueBefore", required = false) String dueBefore,@ApiParam(value = "Only return jobs which are due to be executed after the given date. Jobs without duedate are never returned using this parameter.") @Valid @RequestParam(value = "dueAfter", required = false) String dueAfter,@ApiParam(value = "Only return jobs with the given exception message") @Valid @RequestParam(value = "exceptionMessage", required = false) String exceptionMessage,@ApiParam(value = "Only return jobs with the given tenantId.") @Valid @RequestParam(value = "tenantId", required = false) String tenantId,@ApiParam(value = "Only return jobs with a tenantId like the given value.") @Valid @RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,@ApiParam(value = "If true, only returns jobs without a tenantId set. If false, the withoutTenantId parameter is ignored.") @Valid @RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId,@ApiParam(value = "If true, only return jobs which are locked.  If false, this parameter is ignored.") @Valid @RequestParam(value = "locked", required = false) Boolean locked,@ApiParam(value = "If true, only return jobs which are unlocked. If false, this parameter is ignored.") @Valid @RequestParam(value = "unlocked", required = false) Boolean unlocked,@ApiParam(value = "Property to sort on, to be used together with the order.", allowableValues = "id, dueDate, executionId, processInstanceId, retries, tenantId") @Valid @RequestParam(value = "sort", required = false) String sort);


    @ApiOperation(value = "Get a list of suspended jobs", nickname = "listSuspendedJobs", notes = "", response = DataResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the requested jobs were returned.", response = DataResponse.class),
        @ApiResponse(code = 400, message = "Indicates an illegal value has been used in a url query parameter or the both 'messagesOnly' and 'timersOnly' are used as parameters. Status description contains additional details about the error.") })
    @RequestMapping(value = "/management/suspended-jobs",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<DataResponse> listSuspendedJobs(@ApiParam(value = "Only return job with the given id") @Valid @RequestParam(value = "id", required = false) String id,@ApiParam(value = "Only return jobs part of a process with the given id") @Valid @RequestParam(value = "processInstanceId", required = false) String processInstanceId,@ApiParam(value = "Only return jobs part of an execution with the given id") @Valid @RequestParam(value = "executionId", required = false) String executionId,@ApiParam(value = "Only return jobs with the given process definition id") @Valid @RequestParam(value = "processDefinitionId", required = false) String processDefinitionId,@ApiParam(value = "If true, only return jobs which are timers. If false, this parameter is ignored. Cannot be used together with 'messagesOnly'.") @Valid @RequestParam(value = "timersOnly", required = false) Boolean timersOnly,@ApiParam(value = "If true, only return jobs which are messages. If false, this parameter is ignored. Cannot be used together with 'timersOnly'") @Valid @RequestParam(value = "messagesOnly", required = false) Boolean messagesOnly,@ApiParam(value = "If true, only return jobs for which an exception occurred while executing it. If false, this parameter is ignored.") @Valid @RequestParam(value = "withException", required = false) Boolean withException,@ApiParam(value = "Only return jobs which are due to be executed before the given date. Jobs without duedate are never returned using this parameter.") @Valid @RequestParam(value = "dueBefore", required = false) String dueBefore,@ApiParam(value = "Only return jobs which are due to be executed after the given date. Jobs without duedate are never returned using this parameter.") @Valid @RequestParam(value = "dueAfter", required = false) String dueAfter,@ApiParam(value = "Only return jobs with the given exception message") @Valid @RequestParam(value = "exceptionMessage", required = false) String exceptionMessage,@ApiParam(value = "Only return jobs with the given tenantId.") @Valid @RequestParam(value = "tenantId", required = false) String tenantId,@ApiParam(value = "Only return jobs with a tenantId like the given value.") @Valid @RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,@ApiParam(value = "If true, only returns jobs without a tenantId set. If false, the withoutTenantId parameter is ignored.") @Valid @RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId,@ApiParam(value = "If true, only return jobs which are locked.  If false, this parameter is ignored.") @Valid @RequestParam(value = "locked", required = false) Boolean locked,@ApiParam(value = "If true, only return jobs which are unlocked. If false, this parameter is ignored.") @Valid @RequestParam(value = "unlocked", required = false) Boolean unlocked,@ApiParam(value = "Property to sort on, to be used together with the order.", allowableValues = "id, dueDate, executionId, processInstanceId, retries, tenantId") @Valid @RequestParam(value = "sort", required = false) String sort);


    @ApiOperation(value = "Get a list of timer jobs", nickname = "listTimerJobs", notes = "", response = DataResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the requested jobs were returned.", response = DataResponse.class),
        @ApiResponse(code = 400, message = "Indicates an illegal value has been used in a url query parameter or the both 'messagesOnly' and 'timersOnly' are used as parameters. Status description contains additional details about the error.") })
    @RequestMapping(value = "/management/timer-jobs",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<DataResponse> listTimerJobs(@ApiParam(value = "Only return job with the given id") @Valid @RequestParam(value = "id", required = false) String id,@ApiParam(value = "Only return jobs part of a process with the given id") @Valid @RequestParam(value = "processInstanceId", required = false) String processInstanceId,@ApiParam(value = "Only return jobs part of an execution with the given id") @Valid @RequestParam(value = "executionId", required = false) String executionId,@ApiParam(value = "Only return jobs with the given process definition id") @Valid @RequestParam(value = "processDefinitionId", required = false) String processDefinitionId,@ApiParam(value = "If true, only return jobs which are timers. If false, this parameter is ignored. Cannot be used together with 'messagesOnly'.") @Valid @RequestParam(value = "timersOnly", required = false) Boolean timersOnly,@ApiParam(value = "If true, only return jobs which are messages. If false, this parameter is ignored. Cannot be used together with 'timersOnly'") @Valid @RequestParam(value = "messagesOnly", required = false) Boolean messagesOnly,@ApiParam(value = "If true, only return jobs for which an exception occurred while executing it. If false, this parameter is ignored.") @Valid @RequestParam(value = "withException", required = false) Boolean withException,@ApiParam(value = "Only return jobs which are due to be executed before the given date. Jobs without duedate are never returned using this parameter.") @Valid @RequestParam(value = "dueBefore", required = false) String dueBefore,@ApiParam(value = "Only return jobs which are due to be executed after the given date. Jobs without duedate are never returned using this parameter.") @Valid @RequestParam(value = "dueAfter", required = false) String dueAfter,@ApiParam(value = "Only return jobs with the given exception message") @Valid @RequestParam(value = "exceptionMessage", required = false) String exceptionMessage,@ApiParam(value = "Only return jobs with the given tenantId.") @Valid @RequestParam(value = "tenantId", required = false) String tenantId,@ApiParam(value = "Only return jobs with a tenantId like the given value.") @Valid @RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,@ApiParam(value = "If true, only returns jobs without a tenantId set. If false, the withoutTenantId parameter is ignored.") @Valid @RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId,@ApiParam(value = "If true, only return jobs which are locked.  If false, this parameter is ignored.") @Valid @RequestParam(value = "locked", required = false) Boolean locked,@ApiParam(value = "If true, only return jobs which are unlocked. If false, this parameter is ignored.") @Valid @RequestParam(value = "unlocked", required = false) Boolean unlocked,@ApiParam(value = "Property to sort on, to be used together with the order.", allowableValues = "id, dueDate, executionId, processInstanceId, retries, tenantId") @Valid @RequestParam(value = "sort", required = false) String sort);

}
