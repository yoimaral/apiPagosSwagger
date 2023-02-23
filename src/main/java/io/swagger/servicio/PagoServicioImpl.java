package io.swagger.servicio;

import io.swagger.api.NotFoundException;
import io.swagger.dao.PagoDao;
import io.swagger.dto.PagoDto;
import io.swagger.mapper.PagoMapper;
import io.swagger.model.Pago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoServicioImpl implements PagoServicio {

    private final PagoMapper pagoMapper = PagoMapper.INSTANCE;

    private final PagoDao pagoDao;

    @Autowired
    public PagoServicioImpl(PagoDao pagoDao) {
        this.pagoDao = pagoDao;
    }

    @Override
    public List<PagoDto> obtenerTodosLosPagos() {
        List<Pago> pagos = (List<Pago>) pagoDao.findAll();
        return pagoMapper.pagosApagosDto(pagos);
    }

    @Override
    public PagoDto crearPago(PagoDto pagoDto) {
        Pago pago = pagoMapper.pagoDtoAPago(pagoDto);
        pago = pagoDao.save(pago);
        return pagoMapper.pagoAPagoDto(pago);
    }

    @Override
    public void actualizarPago(String id, PagoDto pagoDto) throws NotFoundException {
        if(pagoDao.existsById(Long.parseLong(id))){
            Pago pagoExistente = pagoDao.findById(Long.parseLong(id)).get();
            Pago pago = pagoMapper.pagoDtoAPago(pagoDto);
            pago.setId(pagoExistente.getId());
            pagoDao.save(pago);
        } else {
            throw new NotFoundException(404, "No se encontro el pago");
        }
    }

    @Override
    public void eliminarPago(String id) throws NotFoundException {
        Long pagoId = Long.parseLong(id);
        if(pagoDao.existsById(pagoId)){
            pagoDao.deleteById(Long.parseLong(id));
        } else {
            throw new NotFoundException(404, "No se encontro el pago");
        }
    }

    @Override
    public PagoDto obtenerPago(String id) {
        Long pagoId = Long.parseLong(id);
        Pago pago = pagoDao.findById(pagoId).get();
        return pagoMapper.pagoAPagoDto(pago);
    }
}
