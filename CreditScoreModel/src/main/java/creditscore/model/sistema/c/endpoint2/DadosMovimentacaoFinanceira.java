package creditscore.model.sistema.c.endpoint2;

import creditscore.model.sistema.c.endpoint1.*;
import creditscore.model.sistema.b.*;
import java.util.Date;
import java.util.List;
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
public class DadosMovimentacaoFinanceira {
  private List<Lancamento> lancamentos;
}
