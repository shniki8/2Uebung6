package again.p2;

public class ActionMovie extends Movie{
    private static int actNum = 0;
    private int explosionCount;
    private boolean stuntScenes;

    public ActionMovie(String title, int explosionCount, boolean stuntScenes) {
        super(title);
        actNum++;
        this.stuntScenes = stuntScenes;
        this.explosionCount = explosionCount;
    }

    public ActionMovie(String title) {
        super(title);
        actNum++;
    }



    public String getActionInfo(){
        return "" + explosionCount + " " + stuntScenes;
    }

    public int getExplosionCount() {
        return explosionCount;
    }

    public void setExplosionCount(int explosionCount) {
        this.explosionCount = explosionCount;
    }

    public boolean isStuntScenes() {
        return stuntScenes;
    }

    public void setStuntScenes(boolean stuntScenes) {
        this.stuntScenes = stuntScenes;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.getClass().getSimpleName() + " " + explosionCount + " " + stuntScenes;
    }
}
