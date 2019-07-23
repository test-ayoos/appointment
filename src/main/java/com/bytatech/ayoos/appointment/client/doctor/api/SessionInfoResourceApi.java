/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.appointment.client.doctor.api;

import java.util.List;

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

import com.bytatech.ayoos.appointment.client.doctor.model.SessionInfo;
import com.bytatech.ayoos.appointment.client.doctor.model.SessionInfoDTO;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-18T10:32:46.727+05:30[Asia/Kolkata]")

@Api(value = "SessionInfoResource", description = "the SessionInfoResource API")
public interface SessionInfoResourceApi {

    @ApiOperation(value = "createSessionInfo", nickname = "createSessionInfoUsingPOST", notes = "", response = SessionInfoDTO.class, tags={ "session-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SessionInfoDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/session-infos",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<SessionInfoDTO> createSessionInfoUsingPOST(@ApiParam(value = "sessionInfoDTO" ,required=true )  @Valid @RequestBody SessionInfoDTO sessionInfoDTO);


    @ApiOperation(value = "deleteSessionInfo", nickname = "deleteSessionInfoUsingDELETE", notes = "", tags={ "session-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/session-infos/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteSessionInfoUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllSessionInfos", nickname = "getAllSessionInfosUsingGET", notes = "", response = SessionInfoDTO.class, responseContainer = "List", tags={ "session-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SessionInfoDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/session-infos",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<SessionInfoDTO>> getAllSessionInfosUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getSessionInfo", nickname = "getSessionInfoUsingGET", notes = "", response = SessionInfoDTO.class, tags={ "session-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SessionInfoDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/session-infos/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<SessionInfoDTO> getSessionInfoUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "listToDto", nickname = "listToDtoUsingPOST6", notes = "", response = SessionInfoDTO.class, responseContainer = "List", tags={ "session-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SessionInfoDTO.class, responseContainer = "List"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/session-infos/toDto",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<List<SessionInfoDTO>> listToDtoUsingPOST6(@ApiParam(value = "sessionInfo" ,required=true )  @Valid @RequestBody List<SessionInfo> sessionInfo);


    @ApiOperation(value = "searchSessionInfos", nickname = "searchSessionInfosUsingGET", notes = "", response = SessionInfoDTO.class, responseContainer = "List", tags={ "session-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SessionInfoDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/session-infos",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<SessionInfoDTO>> searchSessionInfosUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "setSessionToMonth", nickname = "setSessionToMonthUsingPOST", notes = "", response = SessionInfoDTO.class, responseContainer = "List", tags={ "session-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SessionInfoDTO.class, responseContainer = "List"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/createSessionInfo",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<List<SessionInfoDTO>> setSessionToMonthUsingPOST(@NotNull @ApiParam(value = "monthList", required = true) @Valid @RequestParam(value = "monthList", required = true) List<Integer> monthList,@ApiParam(value = "sessionList" ,required=true )  @Valid @RequestBody List<SessionInfoDTO> sessionInfoDTO);


    @ApiOperation(value = "updateSessionInfo", nickname = "updateSessionInfoUsingPUT", notes = "", response = SessionInfoDTO.class, tags={ "session-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SessionInfoDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/session-infos",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<SessionInfoDTO> updateSessionInfoUsingPUT(@ApiParam(value = "sessionInfoDTO" ,required=true )  @Valid @RequestBody SessionInfoDTO sessionInfoDTO);

}
