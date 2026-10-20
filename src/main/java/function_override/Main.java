package function_override;

public class Main {
    static void main() {
        // перевантаження
        Student s = new Student();

        s.isValid(34);
        s.isValid("Andrii");

        s.isValid(34, (short)150);

        int a = 50;
        int w = 45;

        s.isValid(w, a);

        // Інкапсуляція
        s.name = "Andrii";
        // write changes to database
        s.age = 26;
        // write changes to database


        s.age = 5555;
        // write changes to database
        s.name = "g1pn3u9uh3ojmfo13uopojofom";
        // write changes to database

        // s.password = "d2d2";

    }
}
