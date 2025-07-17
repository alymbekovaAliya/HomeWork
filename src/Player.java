import java.util.*;

public class Player {

    public static void main(String[] args) {

        String[] strings = {"a", "b", "a", "c", "a", "d", "a"};

        String[] strings1 = new String[2];
        int[] ints = new int[2];

        String[] strings2 = new String[]{"salt"};
        System.out.println(wordAppend(strings));

    }

    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        Set<String> swapped = new HashSet<>();

        for(int i = 0; i < strings.length; i++) {

            String s = strings[i].substring(0,1);
            if(map.containsKey(s) && !swapped.contains(s)){
                String temp = strings[i];
                strings[i] = strings[map.get(s)];
                strings[map.get(s)] = temp;
                swapped.add(s);
            } else {
                map.put(s, i);
            }

        }
        return strings;
    }

    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < strings.length; i++) {
            String s = strings[i].substring(0,1);
            if(map.containsKey(s)){
                String temp = strings[i];
               strings[i] = strings[map.get(s)];
                strings[map.get(s)] = temp;
               map.remove(s);
            } else {
                map.put(s, i);
            }

        }
        return strings;
    }


    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new TreeMap<>();
        Map<String, Integer> map2 = new TreeMap<>();

        for (String str: strings) {
         map2.put(str, map2.getOrDefault(str, 0) + 1);
        }

        for(String key: map2.keySet()) {
            int value = map2.get(key);

            if(value >= 2) {
                map.put(key, true);
            } else {
                map.put(key, false);
            }
        }

        return map;
    }

    public static String wordAppend(String[] strings) {
        String result = "";
        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            map.put(s, map.getOrDefault(s, 0) + 1);

            if(map.get(s) % 2 == 0) {
               result += s;
            }
        }

        return result;
    }

    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new TreeMap<>();

        for (String s : strings) {
            String str = s.substring(0, 1);
            if (map.containsKey(str)) {
                String qwerty = map.get(str) + s;
                map.put(str, qwerty);
            } else {
                map.put(str, s);
            }
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new TreeMap<>();

        for (String s : strings) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (String s : strings) {
            map.put(String.valueOf(s.charAt(0)), String.valueOf(s.charAt(s.length() - 1)));
        }

        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            map.put(s, s.length());
        }

        return map;
    }

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new TreeMap<>();

        for (String s : strings) {
            map.put(s, 0);
        }

        return map;
    }


    public static String twoChar(String str, int index) {
        return "";
    }

    public static String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").length() > map.get("b").length()) {
                map.put("c", map.get("a"));
            } else if (map.get("a").length() < map.get("b").length()) {
                map.put("c", map.get("b"));
            }

            if (map.get("a").length() == map.get("b").length()) {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

    public Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")) map.put("b", map.get("a"));
        if (map.containsKey("b") && !map.containsKey("a")) map.put("a", map.get("b"));

        return map;
    }

    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");

        }
        return map;
    }

    public Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) map.put("fries", map.get("potato"));
        if (map.containsKey("salad")) map.put("spinach", map.get("salad"));

        return map;
    }

    public static Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) map.put("yogurt", map.get("ice cream"));
        if (map.containsKey("spinach")) map.put("spinach", "nuts");


        return map;
    }

    public static Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;
    }

    //Измените и верните заданную карту следующим образом: для данной задачи карта может содержать или не содержать ключи «a» и «b». Если оба ключа присутствуют,
    // сложите их 2 строковых значения вместе и сохраните результат под ключом «ab».

    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    //Измените и верните заданную карту следующим образом: если ключ «a» имеет значение, установите такое же значение для ключа «b».
    // Во всех случаях удалите ключ «c», оставив остальную часть карты без изменений.
    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("c")) map.remove("c");
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        return map;
    }


    //Измените и верните заданную карту следующим образом: если ключ "a"
    // имеет значение, установите для ключа "b" это значение,
    //а для ключа "a" установите значение "". По сути, "b" - это хулиган,
    // принимающий значение и заменяющий его на пустую строку.

    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

}
