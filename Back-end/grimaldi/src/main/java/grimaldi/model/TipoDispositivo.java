package grimaldi.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tipo_dispositivo")
@Data
public class TipoDispositivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descrizione;



}
