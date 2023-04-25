package player_statistics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerMainTeam {
	public static void main(String[] args) throws ParseException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List<PlayerTeam> players=new ArrayList<PlayerTeam>();
		
		System.out.println("Enter the number of players");
		int n=Integer.parseInt(br.readLine());
		
		System.out.println("Enter players in the format (MS Dhoni,07-07-1981,Batsman,159,3561,0,India,4.4)");
		
		for(int i=0;i<n;i++) {
			String str=br.readLine();
			PlayerTeam player=PlayerBOTeam.createPlayer(str);
			players.add(player);
		}
		
		
		System.out.println();
		System.out.println("Enter your choice to sort");
		System.out.println("1.sort by no of matches played");
		System.out.println("2.sort by runs scored");
		System.out.println("3.sort by power rating");
		
		int choice=Integer.parseInt(br.readLine());
		
		if(choice==1) {
			Collections.sort(players,new NoOfMatchesComparator());
			for(PlayerTeam p:players) {
				System.out.println(p);
			}
		}
		
		else if(choice==2) {
			Collections.sort(players,new RunsComparator());
			for(PlayerTeam p:players) {
				System.out.println(p);
			}
		}
		
		else if(choice==3) {
			Collections.sort(players,new PowerRatingComparator());
			for(PlayerTeam p:players) {
				System.out.println(p);
			}
		}
		
		else {
			System.out.println("Invalid Option");
		}
		
	}
}

//MS Dhoni,07-07-1981,Batsman,159,3561,0,India,4.4
//Virat Kohli,05-11-1988,Batsman,149,4418,4,India,4.7
//Sachin,23-02-1976,Batsman,190,7898,2,India,5.7
//Bumrah,04-06-1990,Bowler,89,2376,8,India,2.7
//Rohith Sherma,28-09-1970,Batsman,167,5098,3,India,6.8
