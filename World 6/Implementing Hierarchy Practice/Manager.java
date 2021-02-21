import java.util.ArrayList;

public class Manager extends Employee
{
    ArrayList<Player> players;  // A Manager will have a list of players that play for them

    Manager(String initName, int initAge, int initSalary)
    {
        super(initName, initAge, initSalary);
        players = new ArrayList<Player>();
    }

    
    // Sign players by adding them to the 'players' array
    public void signPlayer(Player newPlayer)
    {
        players.add(newPlayer);
        System.out.println(getName() + " has signed " + newPlayer.getName() + " for " + newPlayer.getValue());
    }

    // Sell a player by removing them from the 'players' array
    public boolean sellPlayer(Player soldPlayer)
    {
        int i = 0;
        while (i < players.size()) {
            if (players.get(i) == soldPlayer) {
                players.remove(i);
                System.out.println(soldPlayer.getName() + " has been sold for " + soldPlayer.getValue());
                return true;
            }
          i++;
        }
        
        System.out.println(soldPlayer.getName() + " doesn't play for " + getName());
        return false;
    }

    public void printAllPlayers()
    {
        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i));
        }
    }
}
