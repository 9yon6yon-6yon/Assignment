package Question1;

import java.util.Scanner;

class Info {

    private String name;
    private String phone;
    private String address;

    public Info(String Name, String Phone, String Address) {
        name = Name;
        phone = Phone;
        address = Address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printAll() {
        System.out.println(name + " \t" + phone + " \t" + address);

    }
}

public class AddressBook {

    public static void main(String[] args) throws InterruptedException {
        String choice;
        boolean flag = false;
        Scanner input = new Scanner(System.in);
        int i, size;
        System.out.println("How many? ");
        size = input.nextInt();
        input.nextLine();
        String n[] = new String[size];
        String p[] = new String[size];
        String a[] = new String[size];

        while (true) {
            System.out.println("\n\t\t\t1. to Create new record");
            System.out.println("\t\t\t2. to Update record");
            System.out.println("\t\t\t3. to Delete record");
            System.out.println("\t\t\t4. to Print all record");
            System.out.println("\t\t\t5. to Quit\n");
            System.out.print("\t\t\t Enter Your Choice ");
            choice = input.nextLine();

            switch (choice) {
                case "1" -> {
                    flag = true;
                    for (i = 0; i < size; i++) {
                        System.out.print("Enter Name: ");
                        n[i] = input.nextLine();
                        System.out.print("Enter Phone No: ");
                        p[i] = input.nextLine();
                        System.out.print("Enter Address: ");
                        a[i] = input.nextLine();
                        System.out.println("\n");
                    }
                    break;
                }
                case "2" -> {
                    System.out.print("Enter the name whose details you want to update ");
                    String upd = input.nextLine();
                    for (i = 0; i < size; i++) {
                        if (n[i].equals(upd)) {
                            System.out.print("Enter Name: ");
                            n[i] = input.nextLine();
                            System.out.print("Enter Phone No: ");
                            p[i] = input.nextLine();
                            System.out.print("Enter Address: ");
                            a[i] = input.nextLine();
                        }
                    }

                    break;
                }
                case "3" -> {
                    if (flag) {
                        System.out.print("Enter \"name\" to delete his/her record :");
                        String d = input.nextLine();
                        System.out.println("You entered : " + d);
                        for (i = 0; i < size; i++) {
                            if (n[i].equals(d)) {
                                System.out.println("Id found\nDeletation successful.");
                                for (int j = i; j < size - 1; j++) {
                                    n[j] = n[j + 1];
                                    p[j] = p[j + 1];
                                    a[j] = a[j + 1];
                                    size--;
                                }

                            }
                        }
                    } else
                        System.err.println("Nothing to show");
                    break;
                }

                case "4" -> {
                    if (flag) {
                        System.out.println("Name  |    Phone   |  Address");
                        for (i = 0; i < size; i++) {
                            Info If = new Info(n[i], p[i], a[i]);
                            If.printAll();
                        }

                    } else
                        System.err.println("Nothing to show");
                    break;
                }

                case "5" -> {
                    System.out.println("See you soon...");
                    return;
                }
                default -> System.err.println("Invalid Input");
            }
        }
    }
}
