import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> recipe = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1);
        Map<String, Integer> available = Map.of(
                "flour", 1200,
                "sugar", 1200,
                "eggs", 5,
                "milk", 200);


//        Map<String, Integer> recipe = Map.of(
//                "flour", 500,
//                "sugar", 200,
//                "eggs", 1,
//                "cinnamon", 300);
//        Map<String, Integer> available = Map.of(
//                "flour", 1200,
//                "sugar", 1200,
//                "eggs", 5,
//                "milk", 200);

        PeteBaker.cakes(recipe, available);
    }
}
