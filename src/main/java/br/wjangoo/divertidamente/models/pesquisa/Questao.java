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
public class Questao implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter private Long id;

    @NotBlank(message = "Forneça uma descrição")
    @Getter @Setter private String descricao;

    @Getter @Setter private int qtdImagem;

    @Getter @Setter private List<Imagem> imagens;

    @Getter @Setter private String status;

    @Enumerated(EnumType.STRING)
    @Getter @Setter private AssuntoEnum respostaCorreta;

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
        return "Questao{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", status='" + status + '\'' +
                ", qtdImagem=" + qtdImagem +
                ", imagens=" + imagens +
                ", dataCriacao=" + dataCriacao +
                ", dataAtualizao=" + dataAtualizao +
                '}';
    }
}
