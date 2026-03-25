import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagement {

    public static void main(String[] args){

        System.out.println("=============================");
        System.out.println("UC6 - Map Bogie to Capacity");
        System.out.println("=============================");
        Map<String, Integer> capacityMap=new HashMap<>();

        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 78);
        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 100);

        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println( entry.getKey() + "->" + entry.getValue());
        }

    }
}
