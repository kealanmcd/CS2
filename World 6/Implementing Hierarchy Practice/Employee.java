public class Employee extends Person
{
    private static int employeeNumGen = 1000;
    private int employeeNum;
    private int salary;

    Employee (String initName, int initAge, int initSalary)
    {
        super(initName, initAge);
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