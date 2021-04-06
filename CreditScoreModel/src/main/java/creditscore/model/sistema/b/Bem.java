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
public class Bem {
  private String nome;
  private String descricao;
  private Double valor;
  private String tipo;
}
