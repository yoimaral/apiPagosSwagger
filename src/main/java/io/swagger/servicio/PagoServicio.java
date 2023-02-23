package io.swagger.servicio;

import io.swagger.api.NotFoundException;
import io.swagger.dto.PagoDto;

import java.util.List;

public interface PagoServicio {
    List<PagoDto> obtenerTodosLosPagos();

    PagoDto crearPago(PagoDto pagoDto);

    void actualizarPago(String id, PagoDto pagoDto) throws NotFoundException;

    void eliminarPago(String id) throws NotFoundException;

    PagoDto obtenerPago(String id);
}
