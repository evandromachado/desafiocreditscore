package creditscore.model.sistema.b;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Evandro
 */
@Getter
@Setter
@Builder
public class Endereco {
  private String cep;
  private String logradouro;
  private String bairro;
  private String cidade;
  private String uf;
  private String pais;
}
