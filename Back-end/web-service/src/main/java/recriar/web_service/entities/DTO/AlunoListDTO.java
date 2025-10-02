package recriar.web_service.entities.DTO;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import recriar.web_service.entities.Aluno;

public class AlunoListDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private LocalDate data_nascimento;
	private String responsavel;

	public AlunoListDTO() {
	}

	public AlunoListDTO(Aluno aluno) {
		super();
		this.id = aluno.getId();
		this.name = aluno.getNome();
		this.data_nascimento = aluno.getData_nascimento();
		this.responsavel = aluno.getResponsavel().getNome();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(LocalDate data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlunoListDTO other = (AlunoListDTO) obj;
		return Objects.equals(id, other.id);
	}

}
