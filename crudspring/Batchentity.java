package entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="TABLE1")
public class Batch {
	
	@Id
	@GeneratedValue
	private int teamno;
	private String name;
	private int tropies;
	private String captain;
	
	public int getTeamno() {
		return teamno;
	}
	
	public void setTeamno(int teamno) {
		this.teamno = teamno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTropies() {
		return tropies;
	}
	public void setTropies(int tropies) {
		this.tropies = tropies;
	}
	public String getCaptain() {
		return captain;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}

}
