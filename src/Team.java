import java.util.Arrays;
import java.util.List;

public class Team implements Command{
    private String name;
    private Sportsman[] team;

    public Team(String name, Sportsman... args) {
        this.name = name;
        team = new Sportsman[4];
        for (int i = 0; i < team.length; i++) {
            team[i] = args[i];
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public Sportsman[] endDistance(Sportsman[] team){
        Sportsman[] winners = new Sportsman[team.length];
        for (int i = 0; i < team.length; i++) {
            if (team[i].isEndedDistance()){
                winners[i] = team[i];
            }
        }
        return winners;
    }

    @Override
    public void teamInfo(){
        for (int i = 0; i < team.length; i++) {
            System.out.println("Игрок №" + (i) + ": " + team[i].toString());
        }
    }

    @Override
    public Sportsman[] getTeam() {
        return team;
    }
}
