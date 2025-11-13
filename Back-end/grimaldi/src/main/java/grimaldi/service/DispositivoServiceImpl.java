package grimaldi.service;

import grimaldi.model.Dispositivo;
import grimaldi.repository.DispositivoRepository;
import grimaldi.service.interfaces.DispositivoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DispositivoServiceImpl implements DispositivoService {


    private final DispositivoRepository dispositivoRepository;

    public DispositivoServiceImpl(DispositivoRepository dispositivoRepository) {
        this.dispositivoRepository = dispositivoRepository;
    }


    @Override
    public List<Dispositivo> findAll() {
        return dispositivoRepository.findAll();
    }

    @Override
    public List<Dispositivo> findByStatoTrue() {
        return dispositivoRepository.findByStatoTrue();
    }
}
