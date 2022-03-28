public class BmiService {
    public double calculate(double mass, double height) {
        double height1 = height / 100 * height / 100;
        return mass / height1;
    }
}

