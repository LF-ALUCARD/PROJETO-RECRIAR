package recriar.web_service.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import recriar.web_service.entities.enums.Sexo;

@Entity
@Table(name = "tb_alunos")
public class Aluno implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private LocalDate data_nascimento;
	private Sexo sexo;
	private String alergias;
	private String observacoes;

	@ManyToOne
	@JoinColumn(name = "responsavel_id")
	@JsonManagedReference
	private Responsavel responsavel;

	public Aluno() {
	}

	public Aluno(Long id, String nome, LocalDate data_nascimento, int sexo, String alergias, String observacoes,
			Responsavel responsavel) {
		this.id = id;
		this.nome = nome;
		this.data_nascimento = data_nascimento;
		this.sexo = Sexo.valueOf(sexo);
		this.alergias = alergias;
		this.observacoes = observacoes;
		this.responsavel = responsavel;
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

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
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
		Aluno other = (Aluno) obj;
		return Objects.equals(id, other.id);
	}

}
