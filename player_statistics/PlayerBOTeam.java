package player_statistics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PlayerBOTeam {
	public static PlayerTeam createPlayer(String detail) throws ParseException {
		
		PlayerTeam playerTeam=new PlayerTeam();
		StringTokenizer st=new StringTokenizer(detail,",");
		playerTeam.setName(st.nextToken());
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date date=sdf.parse(st.nextToken());
		playerTeam.setDob(date);
		playerTeam.setSkill(st.nextToken());
		playerTeam.setNumberOfMatches(Integer.parseInt(st.nextToken()));
		playerTeam.setRuns(Integer.parseInt(st.nextToken()));
		playerTeam.setWickets(Integer.parseInt(st.nextToken()));
		playerTeam.setNationality(st.nextToken());
		playerTeam.setPowerRating(Double.parseDouble(st.nextToken()));
		
		return playerTeam;
	}
}
