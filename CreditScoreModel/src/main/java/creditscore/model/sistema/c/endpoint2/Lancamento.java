package creditscore.model.sistema.c.endpoint2;

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
public class Lancamento {
  private Date data; 
  private Double valor;
  private String descricao;
  private String tipo;
  private String origem;
  private String destino;
}
