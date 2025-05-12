package day01;

public class Grade {
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public boolean pass(){
        if (score>=50){
            return true;
        }
        else{
            return false;
        }
    }
}
