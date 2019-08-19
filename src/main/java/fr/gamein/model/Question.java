package fr.gamein.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name="Question")
class Question{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	@Column(name="q_type")
	private int q_type;
	@Column(name="points")
	private int points;
	@Column(name="q_delay")
	private int q_delay;
	@Column(name="q_text")
	private String q_text;
	@Column(name="video_url")
	private String video_url;
	@Column(name="pict_path")
	private String pict_path;

	public int getq_type(){
		return q_type;
	}

	public void setq_type(int q_type){
		this.q_type=q_type;
	}

	public int getPoints(){
		return points;
	}

	public void setPoints(int points){
		this.points=points;
	}

	public int getq_delay(){
		return q_delay;
	}

	public void setq_delay(int q_delay){
		this.q_delay=q_delay;
	}

	public String getq_text(){
		return q_text;
	}

	public void setq_text(String q_text){
		this.q_text=q_text;
	}

	public String getVideo_url(){
		return video_url;
	}

	public void setVideo_url(String video_url){
		this.video_url=video_url;
	}

	public String getPict_path(){
		return pict_path;
	}

	public void setPict_path(String pict_path){
		this.pict_path=pict_path;
	}
}
