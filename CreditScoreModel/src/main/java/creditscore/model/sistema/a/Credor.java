package creditscore.model.sistema.a;

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
public class Credor {
  private String cpfCnpj;
  private String nome;
}
