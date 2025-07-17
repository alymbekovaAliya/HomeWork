package May;

import java.util.*;
import java.util.stream.Collectors;

public class _16_05 {
    public static void main(String[] args) {
        String str = "aabc";
        String str2 = "abcc";
        System.out.println(anagram(str, str2));

    }

    public static void book() {
        Map<String, Integer> map1 = new HashMap<>();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        String rixos = "Rixos";
        String novotel = "Novotel";
        String sheraton = "Sheraton";
        map1.put(rixos, 0);
        map1.put(novotel, 0);
        map1.put(sheraton, 0);

        int hotel = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Мы проводи опрос какой отель самый лучший , выберите один\n1." + rixos + "\n2." + novotel + "\n3." + sheraton + "\n4.что бы завершить выбор");

        while (hotel != 4) {
            hotel = scanner.nextInt();

            switch (hotel) {
                case 1:
                    count1++;
                    map1.replace(rixos, count1);
                    System.out.println("Передайте выбор вашим друзьям");
                    break;
                case 2:
                    count2++;
                    map1.replace(novotel, count2);
                    System.out.println("Передайте выбор вашим друзьям");
                    break;
                case 3:
                    count3++;
                    map1.replace(sheraton, count3);
                    System.out.println("Передайте выбор вашим друзьям");
                    break;
            }
        }

        for (String key : map1.keySet()) {
            System.out.println(key + ": " + map1.get(key));
        }

    }



    public static boolean anagram(String str, String str2) {
        //rat -> atr
        //cat -> act
        if (str.length() != str2.length()) return false;

        Map<Character, Long> sString = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c,Collectors.counting()));
        Map<Character, Long> tString = str2.chars()
                .mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c,Collectors.counting()));;



        return sString.equals(tString);
    }

//    public static boolean anagram(String str, String str2) {
//        //rat -> atr
//        //cat -> act
//        if (str.length() != str2.length()) return false;
//
//        int[] charsCounter = new int[26];
//
//        for (int i = 0; i < str.length(); i++) {
//            charsCounter[str.charAt(i) - 'a']++;
//            charsCounter[str2.charAt(i) - 'a']--;
//        }
//
//        for(int counter: charsCounter) {
//            if(counter != 0) {
//                return  false;
//            }
//        }
//
//            return true;
//    }

    public static void reverseMap() {
        Map<String, Integer> map1 = Map.of(
                "Aliia", 1,
                "Cholpon", 2,
                "Ulan", 3
        );
        Map<Integer, String> map2 = new HashMap<>();
        for (String key : map1.keySet()) {
            map2.put(map1.get(key), key);
        }
        System.out.println(map2);
    }

    public static void practice() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("aliia", 1);
        map1.put("cholpon", 2);
        map1.put("ulan", 3);
        map1.put("ilizar", 4);

        for (String key : map1.keySet()) {
            System.out.println("Key: " + key + "\tValue" + map1.get(key));

        }
    }


}
