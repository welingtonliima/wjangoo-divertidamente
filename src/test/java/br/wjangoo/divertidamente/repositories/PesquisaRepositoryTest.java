package br.wjangoo.divertidamente.repositories;

import br.wjangoo.divertidamente.models.pesquisa.Paciente;
import br.wjangoo.divertidamente.models.pesquisa.Pesquisa;
import br.wjangoo.divertidamente.models.pesquisa.Questao;
import br.wjangoo.divertidamente.models.pesquisa.TipoPesquisa;
import br.wjangoo.divertidamente.repositories.pesquisa.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class PesquisaRepositoryTest {

    @Autowired
    private ImagemRepository imagemRepository;

    @Autowired
    private QuestaoRepository questaoRepository;

    @Autowired
    private TipoPesquisaRepository tipoPesquisaRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private PesquisaRepository pesquisaRepository;

    @Autowired
    private RespostaRepository respostaRepository;

    private Long idImagem;
    private Long idQuesta;
    private Long idTipoDePesquisa;
    private Long idPaciente;
    private Long idPesquisa;
    private Long idResposta;

    @Before
    public void setUp () throws Exception{

    }

    @After
    public  void tearDown() throws Exception{
        this.imagemRepository.deleteAll();
        this.questaoRepository.deleteAll();
        this.tipoPesquisaRepository.deleteAll();
        this.pacienteRepository.deleteAll();
        this.pesquisaRepository.deleteAll();
        this.respostaRepository.deleteAll();
    }

    @Test
    public void testBuscarRespostasPorPesquisaId(){

    }


}
