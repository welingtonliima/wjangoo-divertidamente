package br.wjangoo.divertidamente.repositories.pesquisa;

import br.wjangoo.divertidamente.models.pesquisa.Imagem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagemRepository extends CrudRepository<Imagem,Long>{
}
