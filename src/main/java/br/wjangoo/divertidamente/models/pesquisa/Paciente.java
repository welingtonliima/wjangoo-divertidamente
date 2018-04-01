package br.wjangoo.divertidamente.models.pesquisa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Paciente implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter private Long id;

    @NotBlank(message = "Forneça o seu nome")
    @Getter @Setter private String nome;


    @NotBlank(message = "Informe a sua data de aniversário")
    @Getter @Setter private Date nascimento;

    @Getter @Setter private String sexo;


    @Email(message = "Forneça um e-mail válido")
    @NotBlank(message = "Por favor forneça um e-mail")
    @Column(unique = true)
    @Getter @Setter private String email;

    @OneToMany(mappedBy = "paciente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Getter @Setter private List<Pesquisa> pesquisas;

    @Getter @Setter private Date dataCriacao;

    @Getter @Setter private Date dataAtualizao;

    @PreUpdate
    public void preUpdate(){
        dataAtualizao = new Date();
    }

    @PrePersist
    public void prePersist(){
        final Date dataAtual = new Date();
        dataCriacao = dataAtual;
        dataAtualizao = dataAtual;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                ", sexo='" + sexo + '\'' +
                ", email='" + email + '\'' +
                ", pesquisas=" + pesquisas +
                ", dataCriacao=" + dataCriacao +
                ", dataAtualizao=" + dataAtualizao +
                '}';
    }
}
