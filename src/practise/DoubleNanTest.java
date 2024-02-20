package practise;

public class DoubleNanTest {

    public static void main(String[] args) {
        Double d1 = new Double(7.0 / 0.0);
        Double d2 = new Double(0.0 - 0.0);
        Double d3 = new Double(55.0 * 0.0 / 0.0);
        System.out.println(d1 + "-" + d1.isNaN());
        System.out.println(d2 + "-" + d2.isNaN());
        System.out.println(d3 + "-" + d3.isNaN());
    }
}
