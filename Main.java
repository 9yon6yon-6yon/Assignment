import java.util.Date;

interface IEmployee {
    double CalculateSalary();

    void ShowDetails();

    int GetJobDurationMonth();
}

abstract class Employee implements IEmployee {
    private String name;
    private Date JoiningDate;

    public Employee(String name, Date joiningDate) {
        this.name = name;
        JoiningDate = joiningDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getJoiningDate() {
        return JoiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        JoiningDate = joiningDate;
    }

    public void ShowDetails() {
        System.out.println("Employee Information ----------------------------------");
        System.out.println("Name : " + getName());
        System.out.println("Joining Date : " + getJoiningDate());
    }
}

class FullTimeEmployee extends Employee {
    private double MonthlySalary;
    private int OvertimeWorkHours;
    private double OvertimeSalaryRatePerHour;

    public FullTimeEmployee(double monthlySalary, int overtimeWorkHours,
                            double overtimeSalaryRatePerHour, String name, Date joiningDate) {
        super(name, joiningDate);
        MonthlySalary = monthlySalary;
        OvertimeWorkHours = overtimeWorkHours;
        OvertimeSalaryRatePerHour = overtimeSalaryRatePerHour;
    }

    public double getMonthlySalary() {
        return MonthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        MonthlySalary = monthlySalary;
    }

    public int getOvertimeWorkHours() {
        return OvertimeWorkHours;
    }

    public void setOvertimeWorkHours(int overtimeWorkHours) {
        OvertimeWorkHours = overtimeWorkHours;
    }

    public double getOvertimeSalaryRatePerHour() {
        return OvertimeSalaryRatePerHour;
    }

    public void setOvertimeSalaryRatePerHour(double overtimeSalaryRatePerHour) {
        OvertimeSalaryRatePerHour = overtimeSalaryRatePerHour;
    }


    public double CalculateSalary() {
        return (MonthlySalary + OvertimeWorkHours * OvertimeSalaryRatePerHour);
    }


    public void ShowDetails() {
        super.ShowDetails();
    }


    public int GetJobDurationMonth() {
        Date now = new Date();
        return (now.getYear() - getJoiningDate().getYear()) * 12 + now.getMonth() - getJoiningDate().getMonth();
    }
}

class PartTimeEmployee extends Employee {
    private int MonthlyWorkHours;
    private double SalaryRatePerHour;

    public PartTimeEmployee(int monthlyWorkHours, double salaryRatePerHour, String name, Date joiningDate) {
        super(name, joiningDate);
        MonthlyWorkHours = monthlyWorkHours;
        SalaryRatePerHour = salaryRatePerHour;
    }

    public int getMonthlyWorkHours() {
        return MonthlyWorkHours;
    }

    public void setMonthlyWorkHours(int monthlyWorkHours) {
        MonthlyWorkHours = monthlyWorkHours;
    }

    public double getSalaryRatePerHour() {
        return SalaryRatePerHour;
    }

    public void setSalaryRatePerHour(double salaryRatePerHour) {
        SalaryRatePerHour = salaryRatePerHour;
    }


    public double CalculateSalary() {
        return (MonthlyWorkHours * SalaryRatePerHour);
    }


    public void ShowDetails() {
        super.ShowDetails();
    }


    public int GetJobDurationMonth() {

        Date now = new Date();
        return (now.getYear() - getJoiningDate().getYear()) * 12 + now.getMonth() - getJoiningDate().getMonth();
    }
}

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee Sourov = new FullTimeEmployee(100000, 4, 10000, "Sourov ahmed", new Date(2013 - 1900, 2, 23));
        PartTimeEmployee Rifat = new PartTimeEmployee(20, 500, "Mamun Ur Rashid", new Date(2020 - 1900, 5, 2));
        IEmployee[] employees = {Sourov, Rifat};
        for (int i = 0; i < employees.length; i++) {
            employees[i].ShowDetails();
            System.out.println("Monthly Salary :" + employees[i].CalculateSalary());
            System.out.println("Job Duration(Month):" + employees[i].GetJobDurationMonth());
        }

    }
}