package creditscore.model.sistema.c.endpoint1;

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
public class DadosUltimoAcessoBurealCredito {
  private Date data;
  private String identificacaoBureauCredito;
  private Endereco endereco;
  private String nome;
  private String situacaoCPF;
  private String telefone;
  
  private List<Divida> dividas;
  private List<AcaoJudicial> acoesJudiciais;
  private List<Protesto> protestos;
  private List<Falencia> falencias;
  private ChequesSemFundo chequesSemFundo;
  
}
