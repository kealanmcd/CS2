public class Player extends Employee
{
    private int value;
    private int rating;
    private int health;

    Player (String initName, int initAge, int initSalary, int initValue, int initRating)
    {
        super(initName, initAge, initSalary);
        value = initValue;
        rating = initRating;
        health = 100;
    }

    public String getValue()
    {
        return "£" + value;
    }

    public void train()
    {
        if (health > 40) {
            rating = Math.min(100, rating++);
        } else {
            System.out.println(getName() + " is not fit enough to train. Consider resting this player.");
        }
    }

    public void pass()
    {
        System.out.println(getName() + " passed the ball.");
    }

    public void rest()
    {
        health = Math.min(100, health + 15);
    }


    public String toString()
    {
        return getClass().getName() + ": " + getName() + " is " + getAge() + " years old. His salary is £" + getSalary() + " a week and has a current market value of " + getValue();
    }

}
