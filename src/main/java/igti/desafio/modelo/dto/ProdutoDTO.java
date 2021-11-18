package igti.desafio.modelo.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoDTO {

    private Integer id;
    private String categoria;
    private String descricao;
    private Double preco;
}
