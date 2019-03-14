package classes;

import interfaces.*;

public class Team implements CommandInterface {
    private String name;
    private AthleticInterface[] team;

    public Team(String name, AthleticInterface... args) {
        this.name = name;
        team = new AthleticInterface[4];
        for (int i = 0; i < team.length; i++) {
            team[i] = args[i];
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public AthleticInterface[] endDistance(AthleticInterface[] team) {
        AthleticInterface[] winners = new Sportsman[team.length];
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
    public AthleticInterface[] getTeam() {
        return team;
    }
}
