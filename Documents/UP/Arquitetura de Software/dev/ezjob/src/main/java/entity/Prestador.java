package entity;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="prestador")
public class Prestador {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPrestador;
	@Column(name="nome")
	private String nome;
	@Column(name="endereco")
	private String endereco;
	public int getIdPrestador() {
		return idPrestador;
	}
	public void setIdPrestador(int idPrestador) {
		this.idPrestador = idPrestador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		DataNascimento = dataNascimento;
	}
	@Column(name="telefone")
	private String telefone;
	@Column(name="cpf")
	private String cpf;
	@Column(name="DataNascimento")
	private Date DataNascimento;
	
	
}
