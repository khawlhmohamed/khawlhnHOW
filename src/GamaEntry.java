public class GamaEntry {
    private int score;


     public GamaEntry(int score) { this.score = score ;}


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static void main(String[] args) {
        GamaEntry[] a =new GamaEntry[5];
        GamaEntry[] b =a.clone();

        a[4].setScore(55);
        int scoreValue0fB4=b [4].getScore();
        System.out.println("The Score Value Of the GameEntry Referenced By b [4] Is :"+scoreValue0fB4);
    }
}
