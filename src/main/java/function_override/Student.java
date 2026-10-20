package function_override;

public class Student {
    public int age;
    public String name;
    private String password;

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String pass)
    {
        password = pass;
    }


    // Case 1
    public boolean isValid(String name)
    {
        return !name.isEmpty();
    }

    // Case 2
    public boolean isValid(int age)
    {
        return age > 14 && age < 100;
    }

    public boolean isValid(int age, short weight)
    {
        return age > 14 && age < 100;
    }

    public boolean isValid(long weight, int age)
    {
        return age > 14 && age < 100;
    }
}
