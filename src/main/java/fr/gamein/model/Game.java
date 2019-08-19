package fr.gamein.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name="Game")
class Game{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	@Column(name="game_name")
	private String game_name;
	@Column(name="description")
	private String description;
	@Column(name="game_mode")
	private int game_mode;

	public String getGame_name(){
		return game_name;
	}

	public void setGame_name(String game_name){
		this.game_name=game_name;
	}

	public String getDescription(){
		return description;
	}

	public void setDescription(String description){
		this.description=description;
	}

	public int getGame_mode() {
		return game_mode;
	}

	public void setGame_mode(int game_mode) {
		this.game_mode = game_mode;
	}
}
