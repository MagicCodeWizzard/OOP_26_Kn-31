package class_basics.model;

public class Employee {
    // Constants
    public static final int MAX_AGE = 99;
    public static int defaultAge = 20;

    // Fields
    public String name;
    public String last_name;
    public int age;

    //  Methods
    public Employee()
    {
        name = "Vasil";
        last_name = "Verastuk";
        age = 10;
    }

    public Employee(String name, String last_name, int age) {
        this.name = name;
        this.last_name = last_name;
        this.age = age;
    }

    public Employee(int age) {
        this.age = age;
    }

    public void printInfo()
    {
        System.out.printf("Name: %s, Last name: %s, Age: %d%n",
                name, last_name, age);
    }
}
