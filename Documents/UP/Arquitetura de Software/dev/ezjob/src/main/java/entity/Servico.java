package entity;

import javax.persistence.*;

@Entity
@Table(name="servico")
public class Servico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idServico;
	
	@Column(name="tipoServico")
	private String tipoServico;
	
	@Column(name="valorServico")
	private String valorServico;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true)
	private Cliente cliente;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true)
	private Prestador prestador;
	
	
	@Column(name = "servicoConfirmado")
	private Boolean confirmacao;
		
	@Column(name = "status")
	private String status;

	public Boolean getConfirmacao() {
		return confirmacao;
	}

	public void setConfirmacao(Boolean confirmacao) {
		this.confirmacao = confirmacao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getIdServico() {
		return idServico;
	}

	public void setIdServico(int idServico) {
		this.idServico = idServico;
	}

	public String getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}

	public String getValorServico() {
		return valorServico;
	}

	public void setValorServico(String valorServico) {
		this.valorServico = valorServico;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Prestador getPrestador() {
		return prestador;
	}

	public void setPrestador(Prestador prestador) {
		this.prestador = prestador;
	}
	
	
	
}