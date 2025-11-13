package grimaldi.repository;


import grimaldi.model.Manutenzione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManutenzioneRepository extends JpaRepository<Manutenzione, Long> {
    List<Manutenzione> findByEseguitoDa(String username);
    // puoi aggiungere query custom qui se serve
}
