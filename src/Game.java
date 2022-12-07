import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    private Player player;
    private List<Player> players = new ArrayList<>();
    private final Random rd = new Random();

    public void addPlayer(Player player) {
        if (nameExists(player.getName())){
            player.setName(player.getName() + rd.nextInt(9));
            addPlayer(player);
        }
        else players.add(player);
    }

    private boolean nameExists(String name) {
        for (Player player : players)
            if (player.getName().equals(name)) {
                return true;
            }
        return false;
    }

    public void play(){

        int guess ;
        int b = rd.nextInt(6)+1;

        boolean repeat = true;

        System.out.println("Wylosowana: "+b);
        System.out.println("Odgadnij wylosowaną liczbę");

        do{
            System.out.println("Podaj wartość");
            for (Player player : players) {
                guess = player.guess();
                System.out.println(player.getName() + ": " + guess);

                if (guess == b) {
                    System.out.println("Dobrze, podałeś prwidłową wartość");
                    repeat = false;
                } else {
                    System.out.println("Źle, spróbuj ponownie");
                }
            }
        }
        while (repeat);
    }
}