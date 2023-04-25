package player_statistics;

import java.util.Comparator;

public class RunsComparator implements Comparator<PlayerTeam>{

	@Override
	public int compare(PlayerTeam o1, PlayerTeam o2) {
		
		if(o1.getRuns()>o2.getRuns()) {
			return 1;
		}
		if(o1.getRuns()<o2.getRuns()) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
