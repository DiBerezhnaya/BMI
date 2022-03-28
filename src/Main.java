public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double bmi = service.calculate(49, 123);
        System.out.println("Индекс массы тела = " + bmi + " кг/м2");
    }
}
