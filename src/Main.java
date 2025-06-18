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

        int index = fruits.indexOf("Kiwi");     // 없는 값은 -1
        System.out.println(index);

        fruits.set(1, "Orange");                // 1번 인덱스에 오렌지 추가
        System.out.println(fruits.get(1));      // 1번 인덱스 값 확인

        System.out.println();

        for (String fruit : fruits)
            System.out.println(fruit);
    }
}