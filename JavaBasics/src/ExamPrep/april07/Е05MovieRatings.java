package ExamPrep.april07;

import java.util.Scanner;

public class Е05MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMovies = Integer.parseInt(scanner.nextLine());

        double maxRating = 0;
        double minRating = 11;
        double sumRating = 0;
        String highestRatingForMovie = "";
        String lowestRatingForMovie = "";

        for (int i = 1; i <= countMovies; i++) {
            String movieName = scanner.nextLine();
            double movieRating = Double.parseDouble(scanner.nextLine());

            if (movieRating > maxRating) {
                maxRating = movieRating;
                highestRatingForMovie = movieName;
            }
            if (movieRating < minRating) {
                minRating = movieRating;
                lowestRatingForMovie = movieName;
            }
            sumRating += movieRating;
        }
        double averageRating = sumRating / countMovies;

        System.out.printf("%s is with highest rating: %.1f%n",highestRatingForMovie,maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n",lowestRatingForMovie, minRating);
        System.out.printf("Average rating: %.1f",averageRating);
    }
}
