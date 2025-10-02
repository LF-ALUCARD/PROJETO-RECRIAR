package recriar.web_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import recriar.web_service.entities.Aluno;
import recriar.web_service.entities.DTO.AlunoListDTO;
import recriar.web_service.repositories.AlunoRepository;
import recriar.web_service.service.exceptions.DataBaseException;
import recriar.web_service.service.exceptions.ResourceNotFoundException;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository repositor;
	
	public List<AlunoListDTO> findAll(){
		List<Aluno> lista = repositor.findAll();
		List<AlunoListDTO> list = lista.stream().map(x -> new AlunoListDTO(x)).toList();
		return list;
	}
	
	public Aluno findById(Long id) {
		Optional<Aluno> obj = repositor.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Aluno insert(Aluno obj) {
		return repositor.save(obj);
	}
	
	public void delete(Long id) {
		if(!repositor.existsById(id)) {
			throw new ResourceNotFoundException(id);
		}
		
		try {
			repositor.deleteById(id);
		}
		catch(DataIntegrityViolationException e) {
			throw new DataBaseException(e.getMessage());
		}
	}
	
	public Aluno update(Long id, Aluno obj) {
		try {
			Aluno entidade = repositor.getReferenceById(id);
			updateDate(entidade, obj);
			return repositor.save(entidade);
		}
		catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}
	
	private void updateDate(Aluno entidade, Aluno obj) {
		entidade.setNome(obj.getNome());
		entidade.setData_nascimento(obj.getData_nascimento());
		entidade.setSexo(obj.getSexo());
		entidade.setAlergias(obj.getAlergias());
		entidade.setObservacoes(obj.getObservacoes());
	}
}
