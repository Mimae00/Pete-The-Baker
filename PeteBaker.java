import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PeteBaker {

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        // TODO: Insert Code Here


        List<Integer> lowestValue = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : recipe.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (available.containsKey(key)) {
                Integer availableValue = available.get(key);
                Integer total = availableValue / value ;
                System.out.println("Match found for key: " + key + " available Value " + total);
                lowestValue.add(total);
            } else {
                System.out.println("No match found for key: " + key);
                lowestValue.add(0);
            }
        }
        int min = lowestValue.get(0);
        for(Integer lowest : lowestValue){
            if(lowest < min){
                min = lowest;
            }
        }
        System.out.println(min);
            return min;
    }
}
