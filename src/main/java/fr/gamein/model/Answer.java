package fr.gamein.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name="Answer")
class Answer{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	@Column(name="answ_text")
	private String answ_text;
	@Column(name="pict_path")
	private String pict_path;
	@Column(name="question_id")
	private Long question_id;

	public String getAnsw_text(){
		return answ_text;
	}

	public void setAnsw_text(String answ_text){
		this.answ_text=answ_text;
	}

	public String getPict_path(){
		return pict_path;
	}

	public void setPict_path(String pict_path){
		this.pict_path=pict_path;
	}

	public Long getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(Long question_id) {
		this.question_id = question_id;
	}
}
