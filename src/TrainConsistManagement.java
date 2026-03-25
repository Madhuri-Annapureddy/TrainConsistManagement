import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagement {

    public static void main(String[] args){

        System.out.println("=========================================");
        System.out.println("UC5: Preserve Insertion Order of Bogies");
        System.out.println("=========================================");
        Set<String> formation = new LinkedHashSet<>();
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        System.out.println("Final Train Formation:");
        System.out.println(formation);
    }
}
