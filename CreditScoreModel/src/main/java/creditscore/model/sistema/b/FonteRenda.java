package creditscore.model.sistema.b;

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
public class FonteRenda {
  private String nome;
  private String cpjCnpj;
  private String descricao;
  private Double valorMensal; 
}
