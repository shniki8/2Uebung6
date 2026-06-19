package p2;

public class AnimationMovie extends Movie{
    private static int aniNum = 0;
    private String studio;
    private boolean familyFriendly; // = FALSE >:)
    enum word{
        VERY;
    }
    public AnimationMovie(String title){
        super(title);
        aniNum++;
    }
    public AnimationMovie(String title, String studio, boolean familyFriendly){
        super(title);
        aniNum++;
        this.studio = studio;
        this.familyFriendly = familyFriendly;
        word nsfw = word.VERY; //dont mind this
    }
    @Override
    public String toString() {
        return super.getTitle() + ", " + this.getClass(); //gleicher rant wie bei ActionMovie
    }
    /*
    @Override
    public String toString() {
        return super.getTitle() + ", " + this.getClass() + " Studio: " + studio + " Family friendly: " + familyFriendly;
    }
     */

    public static int getAniNum() {
        return aniNum;
    }

    public static void setAniNum(int aniNum) {
        AnimationMovie.aniNum = aniNum;
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
    public String getAnimationInfo(){
        return "Studio: " + studio + " Family friendly? " + familyFriendly;
    }
}
