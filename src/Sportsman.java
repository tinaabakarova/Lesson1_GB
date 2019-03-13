import enums.*;

public class Sportsman implements Athletic {
    private String name;
    private Hardness strength;
    private boolean isEndedDistance = false;

    public Sportsman(String name, Hardness strength) {
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public Hardness getStrength() {
        return strength;
    }

    public void setEndedDistance(boolean endedDistance) {
        isEndedDistance = endedDistance;
    }

    public boolean isEndedDistance() {
        return isEndedDistance;
    }

    public boolean doBarrier(Barrier barrier){
        if (this.getStrength().equals(barrier.getHardness())){
            return true;
        }
        if (this.getStrength().equals(Hardness.HARD) && barrier.getHardness().equals(Hardness.EASY)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "name='" + name + '\'' +
                ", isEndedDistance=" + isEndedDistance +
                '}';
    }
}
