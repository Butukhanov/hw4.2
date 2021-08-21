public class BmiService {
    public int calculate(int weight, double height ) {
        int bodyMassIndex = (int) (weight / (height / 100 * height / 100));

        return bodyMassIndex;
    }
}
