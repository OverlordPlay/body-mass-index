public class BmiService {

    public int calculate(double kg, double m) {
        int index = (int) (kg / (m * m));
        return index;

    }
}
