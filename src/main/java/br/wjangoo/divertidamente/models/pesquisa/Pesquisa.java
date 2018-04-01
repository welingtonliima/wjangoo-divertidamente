package br.wjangoo.divertidamente.models.pesquisa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Pesquisa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter private Long id;

    @NotBlank(message = "Forneça o seu nome")
    @Getter @Setter private String nome;

    @Temporal(TemporalType.TIMESTAMP)
    @Getter @Setter private Date dataHoraInicioPesquisa;

    @Temporal(TemporalType.TIMESTAMP)
    @Getter @Setter private  Date dataHoraTerminoPesquisa;

    @Getter @Setter private  Paciente paciente;

    @Getter @Setter private  TipoPesquisa tipoPesquisa;

    @OneToMany(mappedBy = "resposta", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Getter @Setter private List<Resposta> respostas;

    @Override
    public String toString() {
        return "Pesquisa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataHoraInicioPesquisa=" + dataHoraInicioPesquisa +
                ", dataHoraTerminoPesquisa=" + dataHoraTerminoPesquisa +
                ", paciente=" + paciente +
                ", tipoPesquisa=" + tipoPesquisa +
                ", respostas=" + respostas +
                '}';
    }
}
