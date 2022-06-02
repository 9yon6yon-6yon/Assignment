package FinalExamSpring2022.Q1;

interface Vehicle{
    void fuelType();
}
public class Spring {
    public static void main(String[] args) {
    Vehicle cng = new Vehicle() {//anonymous inner class
        public void fuelType() {
            System.out.println("Uses LPG");
        }
    };
    Vehicle airplane = new Vehicle() {//anonymous inner class
        public void fuelType() {
            System.out.println("Uses Jet fuel");
        }
    };

    cng.fuelType();
    airplane.fuelType();
    }
}
