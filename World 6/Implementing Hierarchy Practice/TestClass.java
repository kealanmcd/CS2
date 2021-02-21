public class TestClass {
    // Class hierarchy:
    //  - Person
    //  - Employee
    //    - Manager
    //    - Player
    //      Goalkeeper

    public static void main(String[] args)
    {
        Goalkeeper deGea = new Goalkeeper("David De Gea", 30, 216000, 22500000, 86);
        Goalkeeper allison = new Goalkeeper("Alisson Becker", 28, 97500, 63000000, 90);
        Goalkeeper courtois = new Goalkeeper("David De Gea", 40, 150000, 55000000, 89);

        System.out.println("~ Goalkeepers ~");
        System.out.println(deGea);
        System.out.println(allison);
        System.out.println(courtois);
        
       
        Player messi = new Player("Lionel Messi", 33, 565000, 72000000, 93);
        Player ronaldo = new Player("Cristiano Ronaldo", 36, 576000, 60000000, 92);
        Player pogba = new Player("Paul Pogba", 27, 290000, 72000000, 86);

        System.out.println("\n~ Players ~");
        System.out.println(messi);
        System.out.println(ronaldo);
        System.out.println(pogba);

        Manager mourinho = new Manager("Jose Mourinho", 48, 290000);

        System.out.println("\n~ Managers ~");
        System.out.println(mourinho);

        mourinho.signPlayer(messi);
        mourinho.signPlayer(ronaldo);
        mourinho.signPlayer(deGea);
        System.out.println();

        mourinho.printAllPlayers();

        System.out.println();
        mourinho.sellPlayer(ronaldo);

        mourinho.printAllPlayers();

        System.out.println(deGea.getEmployeeNum());
    }
}
