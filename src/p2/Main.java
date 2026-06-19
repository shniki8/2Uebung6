package p2;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,3,2,1};
        String[] title = {"A","B","C","D"};
        Movie[] movies = makeCatalogue(a,title);
        System.out.println(ActionMovie.getActNum());
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i]);
        }
        System.out.println();
        System.out.println(makeOrder(movies,0,1));
    }
    public static Movie[] makeCatalogue(int[] a, String[] title){
        Movie[] movies = new Movie[a.length];
        for (int i = 0; i < movies.length; i++) {
            if (a[i] == 1){
                movies[i] = new ActionMovie(title[i]);
            } else if (a[i] == 2) {
                movies[i] = new AnimationMovie(title[i]);
            }
            else{
                movies[i] = new Movie(title[i]);
            }
        }
        return movies;
    }
    public static Movie makeOrder(Movie[] movies, int pos, int cat){
            if (pos <0 || pos >= movies.length){ // Aufgabe sagt ich muss es nicht abgfangen alsooo
                System.out.println("In Nanosekunden kommt ein Fehler aufgrund deiner Dummheit :)");
            }
            if (movies[pos] != null && movies[pos].getClass() == ActionMovie.class){
                if (cat == 1){
                    return movies[pos];
                }
            }
            else if (movies[pos] != null && movies[pos].getClass() == AnimationMovie.class){
                if (cat == 2){
                    return movies[pos];
                }
            }
            else if (movies[pos] != null && movies[pos].getClass() == Movie.class){
                if (cat != 1 && cat != 2){
                    return movies[pos];
                }
            }
            return null;
    }
    public static int countExplosions(Movie[] movies){
        int sum = 0;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i] instanceof ActionMovie){
                sum += ((ActionMovie) movies[i]).getExplosionCount();
            }
        }
        return sum;
    }
}
