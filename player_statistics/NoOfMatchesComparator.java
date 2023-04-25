package player_statistics;

import java.util.Comparator;

public class NoOfMatchesComparator implements Comparator<PlayerTeam>{

	@Override
	public int compare(PlayerTeam o1, PlayerTeam o2) {
		
		if(o1.getNumberOfMatches()>o2.getNumberOfMatches()) {
			return 1;
		}
		else if(o1.getNumberOfMatches()<o2.getNumberOfMatches()) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
