package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.dto.PagoDto;
import io.swagger.servicio.PagoServicio;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Generated;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-15T04:20:31.519478174Z[GMT]")
@RestController
public class PagoApiController implements PagoApi {

    private static final Logger log = LoggerFactory.getLogger(PagoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final PagoServicio pagoServicio;


    @Autowired
    public PagoApiController(ObjectMapper objectMapper, HttpServletRequest request, PagoServicio pagoServicio) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.pagoServicio = pagoServicio;
    }

    public ResponseEntity<List<PagoDto>> pagoGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                List<PagoDto> pagoDtos = pagoServicio.obtenerTodosLosPagos();
                return new ResponseEntity<List<PagoDto>>(pagoDtos, HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<PagoDto>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<PagoDto>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> pagoIdDelete(@Parameter(in = ParameterIn.PATH, description = "Eliminar con el ID", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        try {
            pagoServicio.eliminarPago(id);
        } catch (NotFoundException e) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<PagoDto> pagoIdGet(@Parameter(in = ParameterIn.PATH, description = "referencia de pago", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                PagoDto pagoDto = pagoServicio.obtenerPago(id);
                return new ResponseEntity<PagoDto>(pagoDto, HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PagoDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PagoDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> pagoIdPut(@Parameter(in = ParameterIn.PATH, description = "referencia de pago", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "Actualizacion de pago", schema=@Schema()) @Valid @RequestBody PagoDto body) {
        String accept = request.getHeader("Accept");
        try {
            pagoServicio.actualizarPago(id, body);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }catch (NotFoundException exception){
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<PagoDto> pagoPost(@Parameter(in = ParameterIn.DEFAULT, description = "Creacion de pago", schema=@Schema()) @Valid @RequestBody PagoDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                PagoDto pagoDto = pagoServicio.crearPago(body);
                return new ResponseEntity<PagoDto>(pagoDto, HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PagoDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PagoDto>(HttpStatus.NOT_IMPLEMENTED);
    }

}
