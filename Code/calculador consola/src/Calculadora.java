public class Calculadora {

    private double v1;
    private double v2;

    public Calculadora(double v1, double v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public double sum() {
        double sum = this.v1 + this.v2;
        return sum;
    }

    public double rest() {
        double rest = this.v1 - this.v2;
        return rest;
    }

    public double mult() {
        double mult = this.v1 * this.v2;
        return mult;
    }

    public double div() {
        double div = this.v1 / this.v2;
        return div;
    }

}
