package com.aggb.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



@Entity
///@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Expose
	private Long id;
	@Column(unique=true)
	private String username;
	
	private String password;
	private String authority;
	private String nome;
	private String sobrenome;
	private String telefone;
	private String status;
	private String departamento;
	private String email;
	private String senha;
	
	
	/*
	@SerializedName("pedido")
	@OneToMany(mappedBy="usuario", fetch=FetchType.LAZY)
	private List<Pedido> pedido;
	
	@OneToMany(mappedBy="usuario", fetch=FetchType.LAZY)
	private List<Arquivo> arquivo;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_unidade")
	private Unidade unidade;
	
	@ManyToMany(mappedBy="usuarios")
	private List<GrupoUsuarioEmail> grupoUsuarioEmail;
	*/
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "usuario_grupo", joinColumns = @JoinColumn(name="usuario_id"),
			inverseJoinColumns = @JoinColumn(name = "grupo_id"))
	private List<Grupo> grupos = new ArrayList<>();
	
	
	public Usuario(Long id, String username, String password,
			String authority, String nome, String sobrenome, String telefone,
			String status) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.authority = authority;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
		this.status = status;
	}
	
	
	public Usuario() {
		
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
		
/*
	public List<Pedido> getPedido() {
		return new LinkedList<Pedido>();
	}

	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}
	
	

	public List<Arquivo> getArquivo() {
		return arquivo;
	}



	public void setArquivo(List<Arquivo> arquivo) {
		this.arquivo = arquivo;
	}


	public Unidade getUnidade() {
		return unidade;
	}



	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
	
	public List<GrupoUsuarioEmail> getGrupoUsuarioEmail() {
		return grupoUsuarioEmail;
	}


	public void setGrupoUsuarioEmail(List<GrupoUsuarioEmail> grupoUsuarioEmail) {
		this.grupoUsuarioEmail = grupoUsuarioEmail;
	}
*/
	public List<Grupo> getGrupos() {
		return grupos;
	}
	
	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}



	@Override
	public String toString() {
		return "Usuario [id=" + id + ", username=" + username + ", password="
				+ password + ", authority=" + authority + ", nome=" + nome
				+ ", sobrenome=" + sobrenome + ", telefone=" + telefone
				+ ", status=" + status + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

}
