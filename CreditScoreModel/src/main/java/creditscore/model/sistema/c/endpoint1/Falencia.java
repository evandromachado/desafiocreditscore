package creditscore.model.sistema.c.endpoint1;

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
public class Falencia {
  private String empresa;
  private String cnpj; 
  private Date data;
}
