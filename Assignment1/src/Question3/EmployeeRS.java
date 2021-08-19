package Question3;

import java.util.Scanner;

class Employee {
    private String Name;
    private String Phone;
    private double Salary;

    Employee(String name, String phone, double salary) {
        Name = name;
        Phone = phone;
        Salary = salary;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        this.Phone = phone;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }


    public void printall() {
        System.out.println("    Name = " + Name);
        System.out.println("Phone No = " + Phone);
        System.out.println("  Salary = " + Salary);

    }
}

class Salaried extends Employee {

    public Salaried(String Name, String phone, double Salary) {
        super(Name, phone, Salary);

    }

}

class HourlySalaried extends Employee {
    private double Hourlysalary;
    private double hours;

    public HourlySalaried(String Name, String phone, double Salary, double hours) {
        super(Name, phone, Salary);
        setHourlySalary(Salary);
        setTime(hours);

    }

    public void setTime(double hours) {
        this.hours = hours;
    }

    public double getTime() {
        return hours;
    }

    public double getHourlySalary() {
        return Hourlysalary;
    }

    public void setHourlySalary(double Salary) {
        this.Hourlysalary = Salary;
    }

    public double earnings() {
        return Hourlysalary * hours;
    }


    public void printall() {
        super.printall();
        System.out.println("Worked Hours = " + hours);
        System.out.println("Total Salary = " + earnings());
    }

}

class Commissioned extends Employee {
    private double CommissionedSalary;
    private double productSold;

    public Commissioned(String Name, String phone, double Salary, double propductSold) {
        super(Name, phone, Salary);
        setCommissionedSalary(Salary);
        setProductSold(propductSold);

    }

    public double getCommissionedSalary() {
        return (getSalary() + getProductSold());
    }

    public double getProductSold() {
        return productSold;
    }

    public void setProductSold(double productSold) {
        this.productSold = productSold;
    }

    public void setCommissionedSalary(double CommissionedSalary) {
        this.CommissionedSalary = CommissionedSalary + productSold;
    }

    public void printall() {
        super.printall();
        System.out.println("Product sold = " + productSold);
        System.out.println("Total Salary = " + getCommissionedSalary());
    }
}

public class EmployeeRS {
    public static void main(String[] args) {
        String[] Name = {"A", "B", "C", "D", "E"}, phone = {"012", "013", "014", "015", "016"};
        String choice;

        Scanner input = new Scanner(System.in);
        Employee[] ref = new Employee[5];
        ref[0] = new Employee(Name[0], phone[0], 1000);
        ref[1] = new HourlySalaried(Name[1], phone[1], 100, 5);
        ref[2] = new Commissioned(Name[2], phone[2], 1000, 10);
        ref[3] = new Salaried(Name[3], phone[3], 1050);
        ref[4] = new HourlySalaried(Name[4], phone[4], 200, 8);
        while (true) {
            System.out.println("\n\t\t\t1. search for an employee");
            System.out.println("\t\t\t2. update employee info");
            System.out.println("\t\t\t3. print all info ");
            System.out.println("\t\t\t4. to quit");
            System.out.print("\t\t\tEnter number (e.g. 1) : ");
            choice = input.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Enter name : ");
                    String search = input.nextLine();
                    for (int i = 0; i < 5; i++) {
                        if (Name[i].equals(search)) {
                            ref[i].printall();
                            break;
                        }
                    }
                    break;
                case "2":
                    System.out.print("Enter name : ");
                    String sc = input.nextLine();
                    double s;
                    for (int i = 0; i < 5; i++) {
                        if (Name[i].equals(sc)) {
                            System.out.print("Employee type \"Salaried as \"S\", HourlySalaried as \"H\",Commissioned \"C\" : ");
                            String type = input.nextLine();
                            if (type.contains("S")) {
                                System.out.println("Enter New Name");
                                ref[i].setName(Name[i] = input.nextLine());
                                System.out.println("Enter New Phone");
                                ref[i].setPhone(phone[i] = input.nextLine());
                                System.out.println("Enter New Salary");
                                s = input.nextDouble();
                                ref[i].setSalary(s);
                                input.nextLine();
                                break;
                            }
                            if (type.contains("H")) {
                                double hs;
                                System.out.println("Enter New Name");
                                ref[i].setName(Name[i] = input.nextLine());
                                System.out.println("Enter New Phone");
                                ref[i].setPhone(phone[i] = input.nextLine());
                                System.out.println("Enter Hourly Salary");
                                assert ref[i] instanceof HourlySalaried;
                                ((HourlySalaried) ref[i]).setHourlySalary(hs = input.nextDouble());
                                ref[i].setSalary(hs);
                                System.out.println("Enter worked hours");
                                assert ref[i] instanceof HourlySalaried;
                                ((HourlySalaried) ref[i]).setTime(input.nextDouble());
                                input.nextLine();
                                break;
                            }
                            if (type.contains("C")) {

                                System.out.println("Enter New Name");
                                ref[i].setName(Name[i] = input.nextLine());
                                System.out.println("Enter New Phone");
                                ref[i].setPhone(phone[i] = input.nextLine());
                                System.out.println("Enter New Salary");
                                ref[i].setSalary(input.nextDouble());
                                System.out.println("Enter product sold");
                                assert ref[i] instanceof Commissioned;
                                ((Commissioned) ref[i]).setProductSold(input.nextDouble());
                                input.nextLine();
                                break;
                            }
                            break;
                        }
                    }
                    break;
                case "3":
                    for (Employee e : ref) {
                        System.out.println("--------------");
                        e.printall();
                    }
                    break;
                case "4":
                    System.out.println("See you soon...");
                    return;
                default:
                    System.out.println("Invalid Input");


            }

        }

    }
}
