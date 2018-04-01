package br.wjangoo.divertidamente.repositories.pesquisa;

import br.wjangoo.divertidamente.models.pesquisa.Resposta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespostaRepository extends CrudRepository<Resposta,Long> {
}
