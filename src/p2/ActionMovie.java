package p2;

public class ActionMovie extends Movie{
    private static int actNum = 0;
    public ActionMovie(String title){
        super(title);
        actNum++;
    }
    @Override
    public String toString() {
        return super.getTitle() + ", " + this.getClass();
    }
    public static int getActNum() {
        return actNum;
    }

    public static void setActNum(int actNum) {
        ActionMovie.actNum = actNum;
    }
}
