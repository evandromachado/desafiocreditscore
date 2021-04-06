package creditscore.model.sistema.c.endpoint1;

import creditscore.model.sistema.a.*;
import java.util.Date;
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
public class ChequesSemFundo {
  private String banco;
  private String agencia; 
  private String cidade;
  private String uf;
  private Integer quantidade;
  private Date dataUltimaOcorrencia;
}
