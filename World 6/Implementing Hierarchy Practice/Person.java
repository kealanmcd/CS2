public class Person {
    private String name;
    private int age;

    Person (String initName, int initAge)
    {
        name = initName;
        age = initAge;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String toString()
    {
        return name + " is " + age + " years old";
    }
}
