import java.util.Scanner;

public class Movies implements Findable {

    @Override
    public void getAllMovies(Movie[] movies) {
        for (Movie movie :movies) {
            System.out.println(movie.toString());
        }
    }
    @Override
    public void findMovieByName(Movie[] movies) {
        System.out.println("Enter name movie");
        String title = new Scanner(System.in).nextLine().toUpperCase();
        for (Movie movie : movies){
            if (movie.getName().toUpperCase().equals(title)){
                System.out.println(movie.toString());
            }
        }

    }

    @Override
    public void findMovieByActorName(Movie[] movies) {
        System.out.println("Enter actor name ");
        String nameActor = new Scanner(System.in).nextLine().toUpperCase();
        for (Movie movie:movies) {
            for (Cast cast:movie.getCasts()) {
                if (cast.getActorFullName().toUpperCase().equals(nameActor)){
                    System.out.println(movie.toString());
                }
            }
        }

    }

    @Override
    public void findMovieByYear(Movie[] movies) {
        System.out.println("Enter year movie");
        int year = new Scanner(System.in).nextInt();
        for (Movie movie:movies) {
            if (movie.getYear() == year){
                System.out.println(movie.toString());
            }
        }
    }

    @Override
    public void findMovieByDirector(Movie[] movies) {
        System.out.println("Enter name director");
        String str = new Scanner(System.in).nextLine().toUpperCase();
        for (Movie movie:movies) {
            if (movie.getDirector().getName().toUpperCase().equals(str)){
                System.out.println(movie.toString());
            }
        }
    }

    @Override
    public void findMovieByDescription(Movie[] movies) {
        System.out.println("Enter description");
        String description = new Scanner (System.in).nextLine().toUpperCase();
        for (Movie movie :movies) {
            if (movie.getDescription().toUpperCase().equals(description)){
                System.out.println(movie.toString());
            }
        }
    }

    @Override
    public void findMovieByRole(Movie[] movies) {
        System.out.println("Enter role");
        String role = new Scanner(System.in).nextLine().toUpperCase();
        for (Movie movie : movies){
            for (Cast cast:movie.getCasts()) {
                if (cast.getRole().toUpperCase().equals(role)){
                    System.out.println(movie.toString());
                }
            }
        }
    }
}
