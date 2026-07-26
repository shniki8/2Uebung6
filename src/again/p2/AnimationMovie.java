package again.p2;

public class AnimationMovie extends Movie{
    private static int aniNum = 0;
    private String studio;
    private boolean familyFriendly;


    public AnimationMovie(String title, String studio, boolean familyFriendly) {
        super(title);
        aniNum++;
        this.studio = studio;
        this.familyFriendly = familyFriendly;
    }

    public AnimationMovie(String title) {
        super(title);
        aniNum++;
    }

    public String getAnimationInfo(){
        return "" + studio + " " + familyFriendly;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public boolean isFamilyFriendly() {
        return familyFriendly;
    }

    public void setFamilyFriendly(boolean familyFriendly) {
        this.familyFriendly = familyFriendly;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.getClass().getSimpleName() + " " + studio + " " + familyFriendly;
    }
}
