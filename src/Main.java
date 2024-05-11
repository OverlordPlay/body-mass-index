public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double kg = 64.1;
        double m = 1.87;
        int index = service.calculate(kg, m);
        System.out.println(index);
    }
}