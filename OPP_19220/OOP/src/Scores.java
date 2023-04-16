public class Scores {
    public double math;
    public double physics;
    public double programming;

    public Scores() {

    }

    public Scores(double math, double physics, double programming) {
        this.math = math;
        this.physics = physics;
        this.programming = programming;
    }

    public Double averageScore() {

        Double avgScore = ((this.math + this.physics + this.programming) / 3);

        return avgScore;

    }

}

