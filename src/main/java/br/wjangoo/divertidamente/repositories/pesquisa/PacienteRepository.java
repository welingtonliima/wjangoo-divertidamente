package br.wjangoo.divertidamente.repositories.pesquisa;

import br.wjangoo.divertidamente.models.pesquisa.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends CrudRepository<Paciente,Long> {
}
