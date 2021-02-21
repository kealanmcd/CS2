/*public class hierachyClasses {
  
}


class Person
{
    private String name;
    private int age;
    private int height;
    private ArrayList<Player>;

    Person (String initName, int initAge, int initHeight)
    {
        name = initName;
        age = initAge;
        height = initHeight;
    }

    public void toString()
    {
        name + " is " + age " years old and is " + height + "cm."
    }
}

class Employee extends Person
{
    private static int employeeNumGen = 1000;
    private int employeeNum;
    private int salary;

    Employee (String initName, int initAge, int initHeight, int initSalary)
    {
        super(initName, initAge, initHeight);
        employeeNum = employeeNumGen++;
        salary = initSalary;
    }
  
    public int getSalary()
    {
        return salary;
    }

    public int getEmployeeNum()
    {
        return employeeNum;
    }


    public void setSalary(int newSalary)
    {
        salary = newSalary;
    }
    
}

class Player extends Employee
{
    private int value;
    private int rating;
    private int health;

    Player (String initName, int initAge, int initHeight, int initSalary, int initValue, int initRating, int initHealth)
    {
        super(initName, initAge, initHeight, initSalary);
        value = initValue;
        rating = initRating;
        health = initHealth;
    }

    public String getValue(){
        return "$" + value;
    }

    public void train()
    {
        if (health > 40) {
            rating++;
        } else {
            System.out.println(name + " is not fit enough to train. Consider resting this player.");
        }
    }

    public void pass()
    {
        System.out.println(name + " passed the ball.");
    }

    public rest()
    {
        health = Math.min(100, health + 15);
    }

}

class Goalkeeper extends Player
{
    /*
    private int handling;
    private int diving;
    private int kicking;
    */
    /*
    Goalkeeper (String initName, int initAge, int initSalary, int initValue, int initRating, int initHealth)
    {
        super(initName, initAge, initSalary, initValue, initRating, initHealth);
    }

    public divingSave()
    {
        System.out.println(name + " performed a diving save")
    }

    public kickout()
    {
        System.out.println(name + " took a kickout")
    }

}

class Manager extends Employee
{
    Manager()
    {

    }

    substitutePlayer()
    {

    }
    hireEmployee()
    {

    }

    fireEmployeeFromID(int employee)
    {
        if (employee.getEmployeeNum() == employeeID) {
            system.out.println(employee.getName() + " has been fired".);
        } else {
            system.out.println("No employee with the id " + )
        }
    }
}
*/