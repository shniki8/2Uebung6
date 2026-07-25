package again.p2;

public class Main {
    public static void main(String[] args) {
        //Kein Test Code :'(
    }

    public static Movie makeOrder(Movie[] movies, int pos, int cat){ //Annahme: pos >= 0 && pos <= movies.length-1
        if (pos >= 0 && pos <= movies.length-1){ //Mir aber egal :)
            switch (cat){
                case 1:
                    if (movies[pos].getClass() == ActionMovie.class){
                        return movies[pos];
                    }else return null;
                case 2:
                    if (movies[pos].getClass() == AnimationMovie.class){
                        return movies[pos];
                    }else return null;
                default:
                    return movies[pos];
            }
        }
        return null;
    }

    public static Movie[] makeCatalogue(int[] a, String[] title){
        Movie[] movies = new Movie[a.length];
        for (int i = 0; i < a.length; i++) {
            switch(a[i]){
                case 1:
                    movies[i] = new ActionMovie(title[i]);
                    break;
                case 2:
                    movies[i] = new AnimationMovie(title[i]);
                    break;
                default:
                    movies[i] = new Movie(title[i]);
            }
        }
        return movies;
    }
}
