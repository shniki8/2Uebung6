package p2;

public class ActionMovie extends Movie{
    private static int actNum = 0;
    private int explosionCount;
    private boolean stuntScenes;
    public ActionMovie(String title){
        super(title);
        actNum++;
    }
    public ActionMovie(String title, int explosionCount, boolean stuntScenes){
        super(title);
        actNum++;
        this.explosionCount = explosionCount;
        this.stuntScenes = stuntScenes;
    }
    @Override
    public String toString() {
        return super.getTitle() + ", " + this.getClass(); //Praesenzaufgaben: ueberschreiben Sie zusaetzlich toString(), ja was denkst du was davor schon die Aufgabe war, soll ich jetzt mein toString durch das neue ersetzen? Ueberschreiben impliziert nämlich eigentlich das ich die der Objects ueberschreiben soll, was ich bereits getan habe...
    }
    /*
     @Override
    public String toString() {
        return super.getTitle() + ", " + this.getClass() + " explosions: " + explosionCount + "Stunts? "+ stuntScenes ;
        }
     */
    public static int getActNum() {
        return actNum;
    }

    public static void setActNum(int actNum) {
        ActionMovie.actNum = actNum;
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
    public String getActionInfo(){
        return "Explosion count: " + explosionCount + " Stunt scenes? " + stuntScenes;
    }

}
