package fr.gamein.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name="Player")
class Player{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	@Column(name="mail")
	private String mail;
	@Column(name="phone")
	private String phone;

	public String getMail(){
		return mail;
	}

	public void setMail(String mail){
		this.mail=mail;
	}

	public String getPhone(){
		return phone;
	}

	public void setPhone(String phone){
		this.phone=phone;
	}
}
