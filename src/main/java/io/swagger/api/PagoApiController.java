package io.swagger.api;

import io.swagger.model.Pago;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-15T04:20:31.519478174Z[GMT]")
@RestController
public class PagoApiController implements PagoApi {

    private static final Logger log = LoggerFactory.getLogger(PagoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;


    @org.springframework.beans.factory.annotation.Autowired
    public PagoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Pago>> pagoGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Pago>>(objectMapper.readValue("[ {\n  \"nombrePagador\" : \"yoimar\",\n  \"valor\" : 5000,\n  \"id\" : \"79459506-9bc2-43c8-bd0c-379239de5fb5\",\n  \"emailPagador\" : \"yoimar@gmail.com\",\n  \"referencia\" : 10\n}, {\n  \"nombrePagador\" : \"yoimar\",\n  \"valor\" : 5000,\n  \"id\" : \"79459506-9bc2-43c8-bd0c-379239de5fb5\",\n  \"emailPagador\" : \"yoimar@gmail.com\",\n  \"referencia\" : 10\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Pago>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Pago>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> pagoIdDelete(@Parameter(in = ParameterIn.PATH, description = "Eliminar con el ID", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Pago> pagoIdGet(@Parameter(in = ParameterIn.PATH, description = "referencia de pago", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Pago>(objectMapper.readValue("{\n  \"nombrePagador\" : \"yoimar\",\n  \"valor\" : 5000,\n  \"id\" : \"79459506-9bc2-43c8-bd0c-379239de5fb5\",\n  \"emailPagador\" : \"yoimar@gmail.com\",\n  \"referencia\" : 10\n}", Pago.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Pago>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Pago>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> pagoIdPut(@Parameter(in = ParameterIn.PATH, description = "referencia de pago", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "Actualizacion de pago", schema=@Schema()) @Valid @RequestBody Pago body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Pago> pagoPost(@Parameter(in = ParameterIn.DEFAULT, description = "Creacion de pago", schema=@Schema()) @Valid @RequestBody Pago body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Pago>(objectMapper.readValue("{\n  \"nombrePagador\" : \"yoimar\",\n  \"valor\" : 5000,\n  \"id\" : \"79459506-9bc2-43c8-bd0c-379239de5fb5\",\n  \"emailPagador\" : \"yoimar@gmail.com\",\n  \"referencia\" : 10\n}", Pago.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Pago>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Pago>(HttpStatus.NOT_IMPLEMENTED);
    }

}
