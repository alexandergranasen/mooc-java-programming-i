
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Statistics> results = new ArrayList<>();
        System.out.println("File:");
        String file = scan.nextLine();
        
        try
        {
           Scanner reader = new Scanner(Paths.get(file));
            
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);

                results.add(new Statistics(homeTeam, visitingTeam, homePoints, visitingPoints));
            } 
        }
        catch(Exception e)
        {
            System.out.println("Error.");
        }
        
        System.out.println("Team:");
        String team = scan.nextLine();
        int gamesPlayed = 0; 
        int wins = 0;
        int losses = 0;
        
        for(Statistics stats : results){
            if(stats.getTeams().contains(team)){
                gamesPlayed++;
                if((stats.getHomeTeam().equals(team) && stats.getHomePoints() > stats.getVisitingPoints())
                    || (stats.getVisitingTeam().equals(team) && stats.getVisitingPoints() > stats.getHomePoints()))
                {
                    wins++;
                } else {
                    losses++;
                }
            }
        }
        System.out.println("Games: " +gamesPlayed);
        System.out.println("Wins: " +wins);
        System.out.println("Losses: " +losses);
         
    }
}

//ENCE,Vitality,9,16
//ENCE,Vitality,16,12
//ENCE,Vitality,9,16
//ENCE,Heroic,10,16
//SJ,ENCE,0,16
//SJ,ENCE,3,16
//FURIA,NRG,7,16
//FURIA,Prospects,16,1
