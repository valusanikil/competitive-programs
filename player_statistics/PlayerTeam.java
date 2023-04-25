package player_statistics;

import java.util.Date;

public class PlayerTeam {
	private String name;
	private Date dob;
	private String skill;
	private int numberOfMatches;
	private int runs;
	private int wickets;
	private String Nationality;
	private double powerRating;
	
	public PlayerTeam() {
		
	}

	public PlayerTeam(String name, Date dob, String skill, int numberOfMatches, int runs, int wickets, String nationality,
			double powerRating) {
		super();
		this.name = name;
		this.dob = dob;
		this.skill = skill;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.wickets = wickets;
		Nationality = nationality;
		this.powerRating = powerRating;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getNumberOfMatches() {
		return numberOfMatches;
	}

	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getNationality() {
		return Nationality;
	}

	public void setNationality(String nationality) {
		Nationality = nationality;
	}

	public double getPowerRating() {
		return powerRating;
	}

	public void setPowerRating(double powerRating) {
		this.powerRating = powerRating;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", dob=" + dob + ", skill=" + skill + ", numberOfMatches=" + numberOfMatches
				+ ", runs=" + runs + ", wickets=" + wickets + ", Nationality=" + Nationality + ", powerRating="
				+ powerRating + "]";
	}
	 
}
