package examPrepOfficial;

import java.util.Scanner;

public class P06BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tournamentName = scanner.nextLine();

        int totalSumGames = 0;
        int win = 0;
        int loss = 0;
        while (!tournamentName.equals("End of tournaments")){
            int gamesCount = Integer.parseInt(scanner.nextLine());

            totalSumGames = totalSumGames + gamesCount;
            for (int i = 1; i <= gamesCount; i++) {
               int desiTeamPoints = Integer.parseInt(scanner.nextLine());
               int otherTeamPoints = Integer.parseInt(scanner.nextLine());


               if (desiTeamPoints > otherTeamPoints){
                   win++;
                   System.out.printf("Game %d of tournament %s: win with %d points.%n",i,tournamentName,desiTeamPoints - otherTeamPoints);
               }else {
                   loss++;
                   System.out.printf("Game %d of tournament %s: lost with %d points.%n",i, tournamentName,otherTeamPoints - desiTeamPoints);
               }

            }


            tournamentName = scanner.nextLine();
        }
        System.out.printf("%.2f%% matches win%n", win * 1.0 / totalSumGames * 100);
        System.out.printf("%.2f%% matches lost%n", loss * 1.0 / totalSumGames * 100);

    }
}
