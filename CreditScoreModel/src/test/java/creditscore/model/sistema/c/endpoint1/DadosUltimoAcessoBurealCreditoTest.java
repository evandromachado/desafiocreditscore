package creditscore.model.sistema.c.endpoint1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.google.gson.Gson;

public class DadosUltimoAcessoBurealCreditoTest {

	@Test
	public void test() {
	      var endereco = Endereco.builder().logradouro("Rua Feliz, 400").bairro("Butantã").cidade("São Paulo").uf("SP").pais("Brasil").build();
	      var credor = Credor.builder().cpfCnpj("33041260065290").nome("Casas Bahia").build();
	      
	      var divida = Divida.builder().credor(credor).valor(10000.00).build();
	      var dividaList = new ArrayList<Divida>();
	      dividaList.add(divida);
	              
	      var acao = AcaoJudicial.builder().vara("001").distribuicao("0000").cidade("São Paulo").uf("SP").natureza("1").build();
	      List<AcaoJudicial> acoes = new ArrayList<>();
	      acoes.add(acao);
	      
	      var falencia = Falencia.builder().cnpj("61.090.492/0001-48").data(new Date()).empresa("Tabajara Consultoria").build();
	      var falencias = new ArrayList<Falencia>();
	      falencias.add(falencia);

	      var chequesSemFundo = ChequesSemFundo.builder().agencia("0001").banco("ITAU").cidade("São  Paulo").uf("SP").dataUltimaOcorrencia(new Date()).quantidade(1).build();
	      
	      var protesto = Protesto.builder().cartorio("001").data(new Date()).valor(10000.00).build();
	      var protestos = new ArrayList<Protesto>();
	      protestos.add(protesto);
	      
	      var dadosUltimoAcessoBurealCredito = DadosUltimoAcessoBurealCredito.builder().endereco(endereco).data(new Date()).identificacaoBureauCredito("Egea").situacaoCPF("A").telefone("11999222299").nome("Joao da Silva").dividas(dividaList).acoesJudiciais(acoes).falencias(falencias).chequesSemFundo(chequesSemFundo).protestos(protestos).build();
	              
	      String jsonClienteResponse = new Gson().toJson(dadosUltimoAcessoBurealCredito);
	      
	      System.out.println(jsonClienteResponse);
	      assertNotNull(jsonClienteResponse);
	}

}
