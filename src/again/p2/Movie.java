package again.p2;

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
