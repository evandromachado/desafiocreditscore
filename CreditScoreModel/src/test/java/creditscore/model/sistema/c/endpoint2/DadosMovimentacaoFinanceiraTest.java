package creditscore.model.sistema.c.endpoint2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.google.gson.Gson;

public class DadosMovimentacaoFinanceiraTest {

	@Test
	public void test() {
	      var lancamento = Lancamento.builder().data(new Date()).descricao("TRANSFERENCIA BANCARIA").destino("Conta Corrente 0033 0001 234567891").origem("Conta Corrente 0341 0002 12344343").tipo("1").valor(2000.00).build();
	      var lancamento2 = Lancamento.builder().data(new Date()).descricao("TRANSFERENCIA BANCARIA").destino("Conta Corrente 0033 0001 234567891").origem("Conta Corrente 0341 0002 12344343").tipo("1").valor(2000.00).build();
	      var lancamento3 = Lancamento.builder().data(new Date()).descricao("SAQUE").origem("Conta Corrente 0341 0002 12344343").tipo("2").valor(1000.00).build();
	      
	      List<Lancamento> lancamentos = new ArrayList<>();
	      lancamentos.add(lancamento);
	      lancamentos.add(lancamento2);
	      lancamentos.add(lancamento3);
	      
	      
	      var dadosMovimentacaoFinanceira = DadosMovimentacaoFinanceira.builder().lancamentos(lancamentos);
	              
	      String jsonClienteResponse = new Gson().toJson(dadosMovimentacaoFinanceira);
	      
	      System.out.println(jsonClienteResponse);
	      assertNotNull(jsonClienteResponse);
	}

}
