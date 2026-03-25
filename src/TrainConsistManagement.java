import java.util.LinkedList;
import java.util.List;

public class TrainConsistManagement {

    public static void main(String[] args){

        System.out.println("====================================");
        System.out.println("UC4: Maintain Ordered Bogie IDs");
        System.out.println("====================================");
        List<String> trainConsist = new LinkedList<>();
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");
        System.out.println(trainConsist);

        trainConsist.add(2,"Pantry Car");
        System.out.println("After Insertion 'Pantry Car' at position 2");
        System.out.println(trainConsist);

        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("After removing First and Last Bogie:\n" + trainConsist);

    }
}
