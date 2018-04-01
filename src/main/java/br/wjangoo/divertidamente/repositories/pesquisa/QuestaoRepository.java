package br.wjangoo.divertidamente.repositories.pesquisa;

import br.wjangoo.divertidamente.models.pesquisa.Questao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestaoRepository extends CrudRepository<Questao,Long> {
}
