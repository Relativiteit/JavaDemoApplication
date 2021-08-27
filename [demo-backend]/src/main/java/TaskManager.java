/* @author Alejo Cain @version1.0
Small back end java app
 */


import java.time.LocalDate;
import java.util.LinkedList;

public class TaskManager {

    public static void main(String[] args)
    // main class initiates data storage, does sequential execution with threads, manipulate data(edit, add, remove)
            // use LinkedList for tasks (because of data manipulation)
            // use hashSet for task id (because hashSet can't contain duplicates)
            // firstName is constant - build in override if names changes because of gender change/religious reasons?
            // finalName is variable because of marriage but unlikely
    {
        var task = new Task("first one", 1, true, false, false) ;
        var task2 = new Task("second one", 1, true, false, false) ;

        var person = new Person(40, "Binu", "Badarudeen", true);
        System.out.println(person);

        System.out.println(task);

        LinkedList<Task> fullList = new LinkedList<Task>();
        fullList.add(task);
        fullList.add(task2);
        System.out.println("The chose one => " + fullList);

    }

}
