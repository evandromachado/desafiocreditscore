package creditscore.model.sistema.a;

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
  private String nome;
  private Endereco endereco;
  private List<Divida> dividas;
}
