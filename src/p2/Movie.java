package p2;

public class Movie {
    private static int movNum = 0;
    private String title;

    public Movie(String title){
        this.title = title;
        movNum++;
    }

    @Override
    public String toString() {
        return title + ", " + this.getClass(); //Nicht soo sinnvoll aber Aufgabe fragt nur nach etwas, was gut zum Testen ist und diese Loesung ist erfuellt die Anforderung :/
    }

    public int getMovNum() {
        return movNum;
    }

    public void setMovNum(int movNum) {
        this.movNum = movNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void printMovieDetails(Movie[] movies){
        for (int i = 0; i < movies.length; i++) {
            if (movies[i] instanceof AnimationMovie){
                System.out.println(((AnimationMovie) movies[i]).getAnimationInfo());
            } else if (movies[i] instanceof ActionMovie) {
                System.out.println(((ActionMovie) movies[i]).getActionInfo());
            }else{
                System.out.println(movies[i].toString());
            }
        }
    }
}
