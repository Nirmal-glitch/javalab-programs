import java.util.Scanner;

class Person {
    Scanner in = new Scanner(System.in);
    String name, gender, address;
    int age;

    Person() {
        System.out.println("Enter name");
        name = in.nextLine();

        System.out.println("Enter gender (M/F/O)");
        gender = in.nextLine();

        System.out.println("Enter address");
        address = in.nextLine();

        System.out.println("Enter age");
        age = in.nextInt();
        in.nextLine(); // clear buffer
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int empid;
    float salary;
    String cname, quali;

    Employee() {
        System.out.println("Enter Employee id");
        empid = in.nextInt();
        in.nextLine();

        System.out.println("Enter Company Name");
        cname = in.nextLine();

        System.out.println("Enter Qualification");
        quali = in.nextLine();

        System.out.println("Enter Salary");
        salary = in.nextFloat();
        in.nextLine();
    }

    void display() {
        super.display();
        System.out.println("Employee id: " + empid);
        System.out.println("Company Name: " + cname);
        System.out.println("Qualification: " + quali);
        System.out.println("Salary: " + salary);
    }
}

class Teacher extends Employee {
    int tid;
    String sub, dept;

    Teacher() {
        System.out.println("Enter Teacher id");
        tid = in.nextInt();
        in.nextLine();

        System.out.println("Enter Subject");
        sub = in.nextLine();

        System.out.println("Enter Department");
        dept = in.nextLine();
    }

    void display() {
        super.display();
        System.out.println("Teacher id: " + tid);
        System.out.println("Subject: " + sub);
        System.out.println("Department: " + dept);
    }
}

public class Details {
    public static void main(String args[]) {
        int i = -1;
        Teacher[] t = new Teacher[10];
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Insert Teacher");
            System.out.println("2.Display Teachers");
            System.out.println("3.Exit");
            System.out.println("Enter your choice:");

            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    t[++i] = new Teacher();
                    break;

                case 2:
                    for (int j = 0; j <= i; j++) {
                        t[j].display();
                        System.out.println("----------------");
                    }
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}