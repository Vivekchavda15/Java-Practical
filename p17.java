import java.util.Scanner;
class member{
    Scanner sc=new Scanner(System.in);
    String name;
    int age;
    String add;
    String pn;
    double salary;

    void getdata()
    {
        System.out.println("Enter name:");
        name=sc.nextLine();
        System.out.println("Enter age:");
        age=sc.nextInt();
        System.out.println("Enter address:");
        add=sc.nextLine();
        System.out.println("Enter phone number:");
        pn=sc.nextLine();
        System.out.println("Enter salary:");
        salary=sc.nextDouble();
        sc.nextLine();

    }
    void putdata()
    {
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Address: "+ add);
        System.out.println("Phone number: "+ pn);
        System.out.println("Salary: "+ salary);


    }

    void printSal()
    {
        System.out.println("Salary: "+ salary);
    }
}

class employee extends member {
    String spec;
    String dept;

    void get(){
        System.out.println("Enter Specialization: ");
        spec = sc.nextLine();
        System.out.println("Enter department: ");
        dept = sc.nextLine();
    }

    void put(){
        System.out.println("Specialization: "+ spec);
        System.out.println("Department: "+ dept);
    }

}

class manager extends member{
    String dept;
    String spec;

    void get()
    {
        System.out.println("Enter department: ");
        dept = sc.nextLine();
        System.out.println("Enter specialization: ");
        spec = sc.nextLine();

    }

    void put()
    {

        System.out.println("Department: "+ dept);
        System.out.println("Specialization: "+ spec);
    }

}

public class p17{
    public static void main(String[] args){
    employee e = new employee();
    manager m = new manager();
    System.out.println("Enter details of Employee: ");
    e.get();
    e.getdata();

    System.out.println("Enter details of Manager: ");
    m.get();
    m.getdata();

    System.out.println("Details: ");
    e.putdata();
    e.put();
    m.putdata();
    m.put();


}
}
