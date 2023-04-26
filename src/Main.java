import java.util.*;


public class Main {
    public static void main(String[] args) {


        System.out.println("Задание 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.println(nums.get(i));
            }
        }
        System.out.println();




        System.out.println("Задание 2");
        List<Integer> numss = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < numss.size(); i++) {
            if (numss.get(i) % 2 == 0) {
                numbers.add(numss.get(i));
            }
        }
        System.out.println(numbers);
        System.out.println();




        System.out.println("Задание 3");
        List<String> string = new ArrayList<>(List.of("Вася", "Алена", "Петя", "Вася", "Петя", "Маша"));

        Set<String> str = new HashSet<>();
        for (int i = 0; i < string.size(); i++) {
            str.add(string.get(i));
        }
        System.out.println(str);
        System.out.println();






        System.out.println("Задание 4");
        List<String> strings = new ArrayList<>(List.of("один", "один", "два","два", "два", "три", "три", "три"));
        Map<String,Integer> map= new HashMap<>();


        for (int i = 0; i < strings.size(); i++) {
            int counter = 0;
            for (int i1 = 0; i1 < strings.size(); i1++) {
                if (strings.get(i).equals(strings.get(i1))) {
                    map.put(strings.get(i), counter++);
                }
            }
        }

        for (Map.Entry<String, Integer> values: map.entrySet()) {
            System.out.println(values.getValue());
        }





    }
}