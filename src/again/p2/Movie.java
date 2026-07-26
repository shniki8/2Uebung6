package again.p2;

import javax.swing.*;

public class Movie {
    private static int movNum = 0;
    private String title = "";
    public Movie(String title){
        this.title = title;
        movNum++;

    }

    @Override
    public String toString() {
        return title;
    }

    public void printMovieDetails(Movie[] movies){
        for (Movie m : movies){
            if (m instanceof ActionMovie) System.out.println(((ActionMovie)m).getActionInfo());
            else if (m instanceof AnimationMovie) System.out.println(((AnimationMovie)m).getAnimationInfo());
            else System.out.println(m);
        }

    }

    public static int getMovNum() {
        return movNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
