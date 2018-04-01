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
public class TipoPesquisa implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter private Long id;

    @NotBlank(message = "Forneça uma descrição")
    @Getter @Setter private String descricao;

    @Getter @Setter private int qtdQuestao;

    @Getter @Setter private String status;

    @Getter @Setter private Date dataCriacao;

    @Getter @Setter private Date dataAtualizao;

    @OneToMany(mappedBy = "questao", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Getter @Setter private List<Questao> questoes;

    //@Getter @Setter private Usuario usuario;

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
        return "TipoPesquisa{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", qtdQuestao=" + qtdQuestao +
                ", status='" + status + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", dataAtualizao=" + dataAtualizao +
                ", questoes=" + questoes +
                '}';
    }
}
