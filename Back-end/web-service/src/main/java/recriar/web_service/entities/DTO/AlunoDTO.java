package recriar.web_service.entities.DTO;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import recriar.web_service.entities.Aluno;
import recriar.web_service.entities.enums.Sexo;

public class AlunoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private LocalDate data_nascimento;
	private Sexo sexo;
	private String alergia;
	private String observacao;

	public AlunoDTO() {
	}

	public AlunoDTO(Aluno aluno) {
		id = aluno.getId();
		nome = aluno.getNome();
		data_nascimento = aluno.getData_nascimento();
		sexo = aluno.getSexo();
		alergia = aluno.getAlergias();
		observacao = aluno.getObservacoes();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(LocalDate data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getAlergia() {
		return alergia;
	}

	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String abservacao) {
		this.observacao = abservacao;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlunoDTO other = (AlunoDTO) obj;
		return Objects.equals(id, other.id);
	}
}
