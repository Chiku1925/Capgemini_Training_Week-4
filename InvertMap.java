import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        Map<Integer, List<String>> invertedMap = invertMap(map);
        System.out.println(invertedMap);
    }

    public static Map<Integer, List<String>> invertMap(Map<String, Integer> originalMap) {
        Map<Integer, List<String>> invertedMap = new HashMap<>();
        
        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
            invertedMap.putIfAbsent(entry.getValue(), new ArrayList<>());
            invertedMap.get(entry.getValue()).add(entry.getKey());
        }
        
        return invertedMap;
    }
}
