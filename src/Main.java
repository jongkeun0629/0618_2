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

        fruits.remove("Tomato"); // 값으로 삭제
        fruits.remove(6);         // 인덱스로 삭제 토마도 삭제 후 순서 변경.

        for (String fruit : fruits)
            System.out.println(fruit);
    }
}