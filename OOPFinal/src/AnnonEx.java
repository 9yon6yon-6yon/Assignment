
interface Person {
    void introduce();
}

public class AnnonEx {
    public static void main(String[] args) {
        Person engineer = new Person() {
            @Override
            public void introduce() {
                System.out.println("Hello, I'm an Engineer");
            }
        };
        Person doctor = new Person() {
            @Override
            public void introduce() {
                System.out.println("Hello, I'm a  Doctor");
            }
        };
        engineer.introduce();
        doctor.introduce();
    }
}
