public class Goalkeeper extends Player
{

    Goalkeeper (String initName, int initAge, int initSalary, int initValue, int initRating)
    {
        super(initName, initAge, initSalary, initValue, initRating);
    }

    public void divingSave()
    {
        System.out.println(getName() + " performed a diving save");
    }

    public void kickout()
    {
        System.out.println(getName() + " took a kickout");
    }

}