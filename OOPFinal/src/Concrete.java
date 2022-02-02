public class Concrete {
    public static void main(String[] args) {
        P3 p3 = new P3() {
            @Override
            public double h2(int x) {
                return x;
            }

            @Override
            public String k1() {
                return null;
            }

            @Override
            public void k2() {

            }
        };
    }
}

interface P1 {
    double h2(int x);
}

interface P2 {
    String k1();

    void k2();
}

interface P3 extends P1, P2 {


}
