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
public class Divida {
  private Credor credor;
  private Double valor; 
}
