package fr.gamein.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name="Player_answer")

class Player_answer{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	@Column(name="answ_id")
	private Long answ_id;
	@Column(name="player_id")
	private Long player_id;

	public Long getAnsw_id() {
		return answ_id;
	}

	public void setAnsw_id(Long answ_id) {
		this.answ_id = answ_id;
	}

	public Long getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(Long player_id) {
		this.player_id = player_id;
	}
}
