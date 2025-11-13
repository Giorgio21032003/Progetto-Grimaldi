package grimaldi.service;

import grimaldi.model.Utente;
import grimaldi.repository.UtenteRepository;
import grimaldi.service.interfaces.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtenteServiceImpl implements UtenteService {

    @Autowired
    private UtenteRepository utenteRepository;


    @Override
    public List<Utente> findAll() {
        return utenteRepository.findAll();
    }

    @Override
    public Optional<Utente> findById(Long id) {
        return utenteRepository.findById(id);
    }

    @Override
    public Utente save(Utente utente) {
        return utenteRepository.save(utente);
    }

    @Override
    public Optional<Utente> findByUsernamePassword(String username, String password) { return utenteRepository.findByUsernameAndPasswordAndAttivoTrue(username, password); }

    @Override
    public void deleteById(Long id) {
        utenteRepository.deleteById(id);
    }
}
