package creditscore.model.sistema.a;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.google.gson.Gson;

public class ClienteTest {

	@Test
	public void test() {
	      var endereco = Endereco.builder().logradouro("Rua Feliz, 400").bairro("Butantã").cidade("São Paulo").uf("SP").pais("Brasil").build();
	      var credor = Credor.builder().cpfCnpj("33041260065290").nome("Casas Bahia").build();
	      
	      var divida = Divida.builder().credor(credor).valor(10000.00).build();
	      var dividaList = new ArrayList<Divida>();
	      dividaList.add(divida);
	      
	      var cliente = Cliente.builder().cpf("12345678901").dividas(dividaList).endereco(endereco).nome("Joao da Silva").build();
	      
	      String jsonClienteResponse = new Gson().toJson(cliente);
	      
	      System.out.println(jsonClienteResponse);
	      
	      assertNotNull(jsonClienteResponse);
	}

}
