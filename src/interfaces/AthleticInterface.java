package interfaces;

import classes.Barrier;

public interface AthleticInterface {
    void setEndedDistance(boolean endedDistance);

    boolean isEndedDistance();

    boolean doBarrier(Barrier barrier);
}
