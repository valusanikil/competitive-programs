package player_statistics;

import java.util.Comparator;

public class PowerRatingComparator implements Comparator<PlayerTeam>{

	@Override
	public int compare(PlayerTeam o1, PlayerTeam o2) {
		
		if(o1.getPowerRating()>o2.getPowerRating()) {
			return 1;
		}
		if(o1.getPowerRating()<o2.getPowerRating()) {
			return -1;
		}
		else {
			return 0;
		}
		
	}

}
