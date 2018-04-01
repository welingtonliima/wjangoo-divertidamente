package br.wjangoo.divertidamente.models.pesquisa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table
public class Resposta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter private Long id;

    @NotBlank(message = "Forneça uma resposta")
    @Getter @Setter private String resposta;

    @Getter @Setter private String tempoDaResposta;

    @Getter @Setter private String correcao;

    @Override
    public String toString() {
        return "Resposta{" +
                "id=" + id +
                ", resposta='" + resposta + '\'' +
                ", tempoDaResposta='" + tempoDaResposta + '\'' +
                ", correcao='" + correcao + '\'' +
                '}';
    }
}
