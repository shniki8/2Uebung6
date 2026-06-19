package p2;

public class AnimationMovie extends Movie{
    private static int aniNum = 0;

    public AnimationMovie(String title){
        super(title);
        aniNum++;
    }
    @Override
    public String toString() {
        return super.getTitle() + ", " + this.getClass();
    }
    public static int getAniNum() {
        return aniNum;
    }

    public static void setAniNum(int aniNum) {
        AnimationMovie.aniNum = aniNum;
    }
}
