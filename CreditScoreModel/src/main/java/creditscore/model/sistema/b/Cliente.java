package creditscore.model.sistema.b;

import java.util.List;
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
public class Cliente {
  private String cpf;
  private Integer idade;
  private Endereco endereco;
  private List<FonteRenda> rendas;
  private List<Bem> bens;
  
}
