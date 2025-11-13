package grimaldi.service.interfaces;

import grimaldi.model.Dispositivo;

import java.util.List;

public interface DispositivoService {

    List<Dispositivo> findAll();
    List<Dispositivo> findByStatoTrue();
}
