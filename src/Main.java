import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Cherry");
        fruits.add("Apple");
        fruits.add("Bbanana");
        fruits.add("Tomato");
        fruits.add("Mango");
        fruits.add("Egg plant");
        fruits.add("Banana");
        fruits.add("Potato");
        fruits.add("Dragonfruit");

        List<String> subFruits = fruits.subList(0, 2);      // 0~(2-1) 인덱스

        for (String subFruit : subFruits){
            System.out.println(subFruit);
        }
    }
}