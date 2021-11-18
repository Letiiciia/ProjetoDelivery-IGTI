package igti.desafio.controller;

import java.util.Collections;
import java.util.List;

import igti.desafio.modelo.dto.ProdutoDTO;
import igti.desafio.service.ProdutoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import igti.desafio.modelo.Produto;

@RestController
@Transactional
@RequestMapping("/cardapio")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@Autowired
	private ModelMapper modelMapper;

	@GetMapping
	public ResponseEntity<List<Produto>> listaProdutos() {
		try {
			List<Produto> produtos = produtoService.listarProdutos();
			return ResponseEntity.status(HttpStatus.OK).body(produtos);

		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
