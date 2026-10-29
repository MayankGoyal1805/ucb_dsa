package l2;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    static void main() {
        Map<String, String> M = new TreeMap<>();
        M.put("dog", "whoof");
        M.put("cat", "meow");
        String sound = M.get("cat");
        System.out.print(sound);
    }
}
