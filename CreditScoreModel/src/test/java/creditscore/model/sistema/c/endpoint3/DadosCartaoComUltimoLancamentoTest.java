package creditscore.model.sistema.c.endpoint3;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.google.gson.Gson;

public class DadosCartaoComUltimoLancamentoTest {

	@Test
	public void test() {
	      var lancamentoCartao = LancamentoCartaoCredito.builder().data(new Date()).descricao("UBER").valor(21.00).build();
	      
	      var dadosCartao = CartaoCredito.builder().bandeira("MASTERCARD").banco("ITAU").numeromascarado("****.****.****.1234").build();
	      
	      var dadosUltimaCompraCartao = DadosCartaoComUltimoLancamento.builder().cartao(dadosCartao).lancamentoCartao(lancamentoCartao).build();
	              
	      String jsonClienteResponse = new Gson().toJson(dadosUltimaCompraCartao);
	      
	      System.out.println(jsonClienteResponse);
	      
	      assertNotNull(jsonClienteResponse);
	      
	}

}
