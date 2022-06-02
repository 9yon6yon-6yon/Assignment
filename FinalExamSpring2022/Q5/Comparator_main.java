package FinalExamSpring2022.Q5;

import java.util.ArrayList;
import java.util.Comparator;

class Player {
    int jersey;
    String name, type;

    public Player(int jersey, String name, String type) {
        this.jersey = jersey;
        this.name = name;
        this.type = type;
    }
}

public class Comparator_main {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player(55, "karim", "Bangladesh"));
        players.add(new Player(14, "Ponting", "Australia"));
        players.sort(new Comparator<Player>() {

            public int compare(Player j1, Player j2) {//ascending order
                if (j1.jersey < j2.jersey) return -1;
                else if (j1.jersey > j2.jersey) return 1;
                else return 0;
            }
        });
    }
}
