package recriar.web_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import recriar.web_service.entities.Aluno;
import recriar.web_service.entities.DTO.AlunoListDTO;
import recriar.web_service.repositories.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository repositor;
	
	public List<AlunoListDTO> findAll(){
		List<Aluno> lista = repositor.findAll();
		List<AlunoListDTO> list = lista.stream().map(x -> new AlunoListDTO(x)).toList();
		return list;
	}
}
