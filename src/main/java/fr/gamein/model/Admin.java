package fr.gamein.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Table(name="Admin")
class Admin{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	@Column(name="role")
	private String role;
	@Column(name="login")
	private String login;
	@Column(name="pswd")
	private java.sql.Blob pswd;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Blob getPswd() {
		return pswd;
	}

	public void setPswd(Blob pswd) {
		this.pswd = pswd;
	}
}
