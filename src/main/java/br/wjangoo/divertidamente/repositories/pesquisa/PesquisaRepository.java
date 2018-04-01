package br.wjangoo.divertidamente.repositories.pesquisa;

import br.wjangoo.divertidamente.models.pesquisa.Pesquisa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PesquisaRepository extends CrudRepository<Pesquisa,Long> {
}
