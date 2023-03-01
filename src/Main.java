import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        /**
         * Movie:
         * private String name;
         * private int year;
         * private String description;
         * private Director director;
         * private Cast[] casts;
         *
         * Cast:
         * private String actorFullName;
         * private String role;
         *
         * Director:
         * private String name;
         * private String lastName;
         *
         * Findable деген Interface тузунуз методдору:
         *
         * void getAllMovies(Movie[] movies);
         * void findMovieByName(Movie[] movies);
         * void findMovieByActorName(Movie[] movies);
         * void findMovieByYear(Movie[] movies);
         * void findMovieByDirector(Movie[] movies);
         * void findMovieByDescription(Movie[] movies);
         * void findMovieByRole(Movie[] movies);
         *
         * * Main де кайсыл иш аракетти аткаргыбыз келсе ошол метод switch case аркылуу чакырылып иштесин.
         *       Бардык маалыматтар туура жана так болуп консольго чыксын.
         */
        Director director = new Director("Stan","Lee");
        Cast cast = new Cast("Robert Downey JR","Tony Stark");
        Cast cast1 = new Cast("Chris Hemsworth","Thor");
        Cast cast2 = new Cast("Chris Evans","Capitan America");
        Cast cast3 = new Cast("Scarlett Johansson","Black widow");
        Cast cast4 = new Cast("Mark Ruffalo","Halk");
        Cast cast5 = new Cast("Samuel Jacson","Nick Fury");
        Cast [] casts = {cast,cast1,cast2,cast3,cast4,cast5};
        Movie movie = new Movie("Avangers",2022,"Fantasy",director,casts);

        Director director1 = new Director("Kevin","Faige");
        Cast cast6 = new Cast("Robert Downey JR","Tony Stark");
        Cast cast7 = new Cast("Chris Hemsworth","Thor");
        Cast cast8 = new Cast("Chris Evans","Capitan America");
        Cast cast9 = new Cast("Scarlett Johansson","Black widow");
        Cast cast10 = new Cast("Tom Holand","Spider Man");
        Cast cast11 = new Cast("Chedvik Bouzman","Black Panter");
        Cast [] casts1 = {cast6,cast7,cast8,cast9,cast10,cast11};
        Movie movie1 = new Movie("Avangers 2",2022,"Fantasy",director1,casts1);

        Movie [] moviesa = {movie,movie1};

        Movies movies = new Movies();

        while (true){
            System.out.println("\n"+"""
                    1: View a list of all movies     4: Search by year                    
                    2: Search by movie name          5: Search by director name
                    3: Search by actor name          6: Search by role 
                                    7: Search by description
                    """);
            int selectMode = new Scanner(System.in).nextInt();
            switch (selectMode){
                case 1 -> movies.getAllMovies(moviesa);
                case 2 -> movies.findMovieByName(moviesa);
                case 3 -> movies.findMovieByActorName(moviesa);
                case 4 -> movies.findMovieByYear(moviesa);
                case 5 -> movies.findMovieByDirector(moviesa);
                case 6 -> movies.findMovieByRole(moviesa);
                case 7 -> movies.findMovieByDescription(moviesa);
            }
        }






    }
}