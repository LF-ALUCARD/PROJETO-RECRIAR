package recriar.web_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import recriar.web_service.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
