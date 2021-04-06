package creditscore.model.sistema.c.endpoint3;

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
public class CartaoCredito {
  private String  numeromascarado;
  private String  bandeira;
  private String banco;
}
