package com.loiane.estruturadados.negocio;

public class Contato {

	private String cpf;
	private String nome;
	private String telefone;
	private String email;

	public Contato(String cpf, String nome, String telefone, String email) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public Contato() {
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
//		result = prime * result + ((email == null) ? 0 : email.hashCode());
//		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
//		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Contato other = (Contato) obj;
//		if (cpf == null) {
//			if (other.cpf != null)
//				return false;
//		} else if (!cpf.equals(other.cpf))
//			return false;
//		if (email == null) {
//			if (other.email != null)
//				return false;
//		} else if (!email.equals(other.email))
//			return false;
//		if (nome == null) {
//			if (other.nome != null)
//				return false;
//		} else if (!nome.equals(other.nome))
//			return false;
//		if (telefone == null) {
//			if (other.telefone != null)
//				return false;
//		} else if (!telefone.equals(other.telefone))
//			return false;
//		return true;
//	}

	@Override
	public boolean equals(Object obj) {

		if (this.getClass() != obj.getClass())
			return false;

		Contato other = (Contato) obj;
		if (this.cpf == null) {
			if (other.cpf != null)
				return false;

		} else if (!cpf.equals(other.cpf))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "Contato [cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]";
	}

}
