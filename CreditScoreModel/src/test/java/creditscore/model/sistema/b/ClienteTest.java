package creditscore.model.sistema.b;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.google.gson.Gson;

public class ClienteTest {

	@Test
	public void test() {
	      var endereco = Endereco.builder().logradouro("Rua Feliz, 400").bairro("Butantã").cidade("São Paulo").uf("SP").pais("Brasil").build();
	      
	      var bem1 = Bem.builder().nome("casa").descricao("Sobrado").tipo("I").valor(300000.00).build();
	      var bem2 = Bem.builder().nome("carro").descricao("Automóvel Onix").tipo("M").valor(20000.00).build();
	      
	      List<Bem> bens = new ArrayList<>();
	      
	      bens.add(bem1);
	      bens.add(bem2);
	      
	      
	      FonteRenda renda = FonteRenda.builder().cpjCnpj("90400888000142").nome("Banco Santander").descricao("Salário").valorMensal(8500.00).build();
	      
	      List<FonteRenda> rendas = new ArrayList<>();
	      rendas.add(renda);
	              
	      var cliente = Cliente.builder().cpf("12345678901").endereco(endereco).idade(44).bens(bens).rendas(rendas).build();
	      
	      
	      String jsonClienteResponse = new Gson().toJson(cliente);
	      
	      System.out.println(jsonClienteResponse);
	      assertNotNull(jsonClienteResponse);
	}

}
