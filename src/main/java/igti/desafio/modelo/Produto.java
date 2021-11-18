package igti.desafio.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity(name = "produto")
public class Produto {

	@Id
	@Column(name = "id_produto")
	private Integer id;

	@Column(name = "categoria")
	private String categoria;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "preco")
	private Double preco;


}
