import java.util.ArrayList;
import java.util.List;

public class Course implements CourseInterface{
   private List<Barrier> barriers;

    public Course(Barrier... args) {
        barriers = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            barriers.add(args[i]);
        }
    }

    @Override
    public void doIt(Command team){
        Athletic[] sportsmen = team.getTeam();
        for (int i = 0; i < sportsmen.length; i++) {
            for (int j = 0; j < barriers.size(); j++) {
                if (!sportsmen[i].doBarrier(barriers.get(j))){
                    sportsmen[i].setEndedDistance(false);
                    break;
                } else {
                   sportsmen[i].setEndedDistance(true);
                }
            }
        }
    }
}
