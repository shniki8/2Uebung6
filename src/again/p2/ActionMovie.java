package again.p2;

public class ActionMovie extends Movie{
    private static int actNum = 0;

    public ActionMovie(String title) {
        super(title);
        actNum++;
    }
    @Override
    public String toString() {
        return super.toString() + " " + this.getClass().getSimpleName();
    }
}
