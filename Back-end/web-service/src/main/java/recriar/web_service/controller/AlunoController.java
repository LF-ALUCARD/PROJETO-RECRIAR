package recriar.web_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import recriar.web_service.entities.DTO.AlunoListDTO;
import recriar.web_service.service.AlunoService;

@Controller
@RequestMapping(value = "/alunos")
public class AlunoController {

	@Autowired
	private AlunoService servico;
	
	@GetMapping
	public ResponseEntity<List<AlunoListDTO>> findAll(){
		List<AlunoListDTO> lista = servico.findAll();
		return ResponseEntity.ok().body(lista);
	}
}
