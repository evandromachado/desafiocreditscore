package creditscore.model.sistema.c.endpoint3;

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
public class LancamentoCartaoCredito {
  private Date data; 
  private Double valor;
  private String descricao;
}
