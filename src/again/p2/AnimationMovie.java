package again.p2;

public class AnimationMovie extends Movie{
    private static int aniNum = 0;

    public AnimationMovie(String title) {
        super(title);
        aniNum++;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.getClass().getSimpleName();
    }
}
