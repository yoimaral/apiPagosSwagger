package io.swagger.mapper;

import io.swagger.dto.PagoDto;
import io.swagger.model.Pago;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PagoMapper {

    PagoMapper INSTANCE = Mappers.getMapper(PagoMapper.class);

    PagoDto pagoAPagoDto(Pago pago);

    Pago pagoDtoAPago(PagoDto pagoDto);

    List<Pago> pagosDtoApagos(List<PagoDto> pagosDto);

    List<PagoDto> pagosApagosDto(List<Pago> pagos);
}
