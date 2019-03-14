import classes.Barrier;
import classes.Course;
import classes.Sportsman;
import classes.Team;
import enums.*;
import interfaces.CommandInterface;
import interfaces.CourseInterface;


public class Launcher {
    public static void main(String[] args) {
        CourseInterface course = new Course(new Barrier("Изгородь", Hardness.EASY),
                                   new Barrier("Ров", Hardness.HARD));                              // Создаем полосу препятствий
        CommandInterface team = new Team("Мстители",
                new Sportsman("Вася дрыщ", Hardness.EASY),
                new Sportsman("Мага борец", Hardness.HARD),
                new Sportsman("Леша качок но на дыхалку слабый", Hardness.HARD),
                new Sportsman("Петя шахматист", Hardness.EASY));                                   // Создаем команду
        course.doIt(team);                                                                                // Просим команду пройти полосу
        team.teamInfo();                                                                                  // Показываем результаты

    }
}
