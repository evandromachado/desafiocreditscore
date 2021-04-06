package creditscore.model.sistema.c.endpoint1;

import creditscore.model.sistema.a.*;
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
public class AcaoJudicial {
  private String vara;
  private String distribuicao; 
  private String cidade;
  private String uf;
  private String natureza;
  private Double valor;
}
