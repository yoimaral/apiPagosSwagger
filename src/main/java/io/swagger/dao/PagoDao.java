package io.swagger.dao;

import io.swagger.model.Pago;
import org.springframework.data.repository.CrudRepository;

public interface PagoDao extends CrudRepository<Pago, Long> {
}
