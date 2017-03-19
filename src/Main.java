import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pupil> pupilsGroup1 = Arrays.asList(
                new Pupil("Vasya", "Pupkin"),
                new Pupil("Dasha", "Pupkina"),
                new Pupil("Katya", "Pupkina"),
                new Pupil("Kolya", "Pupkin"),
                new Pupil("Nastia", "Pupkina"),
                new Pupil("Nikita", "Pupkin")
        );

        List<Subject> subjectsGroup1 = Arrays.asList(
                new Subject("Java programming"),
                new Subject("Math"),
                new Subject("English")
        );

        List<Teacher> teachersGroup1 = Arrays.asList(
                new Teacher("Vladislav", "Pupkin", subjectsGroup1.get(0)),
                new Teacher("Alexey", "Pupkin", subjectsGroup1.get(1)),
                new Teacher("Mihail", "Pupkin", subjectsGroup1.get(2))
        );

        Group group1 = new Group("Group 1", teachersGroup1, subjectsGroup1, pupilsGroup1);
        group1.createEntry(subjectsGroup1.get(0), teachersGroup1.get(0), pupilsGroup1.get(0), 5);
        group1.createEntry(subjectsGroup1.get(1), teachersGroup1.get(1), pupilsGroup1.get(0), 3);
        group1.createEntry(subjectsGroup1.get(2), teachersGroup1.get(2), pupilsGroup1.get(0), 2);
        group1.createEntry(subjectsGroup1.get(2), teachersGroup1.get(2), pupilsGroup1.get(1), 5);
        group1.createEntry(subjectsGroup1.get(0), teachersGroup1.get(0), pupilsGroup1.get(1), 5);

        List<User> users = new ArrayList<>();

        users.addAll(pupilsGroup1);
        users.addAll(teachersGroup1);

        /*for (User user : users) {
            System.out.println(user.toString());
        }*/

        for (JournalEntry journalEntry : group1.getEntries(pupilsGroup1.get(0))) {
            System.out.println(journalEntry.toString());
        }
        System.out.println(group1.getAvgGrade(pupilsGroup1.get(0)));

    }
}
