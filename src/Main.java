public class Main {
    public static void main(String[] args) {

        BmiService service1 = new BmiService();
        int bodyMassIndex = service1.calculate(72, 180);
        System.out.println("Индекс массы тела = " + bodyMassIndex + " кг/кв. м.");


    }
}
