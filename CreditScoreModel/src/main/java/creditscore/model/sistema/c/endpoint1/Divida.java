package creditscore.model.sistema.c.endpoint1;

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
