package l2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// lists can contain objects of different data types if type not stated
public class ListDemo {
    static void main() {
        List<String> L  = new LinkedList<>();
        L.add("a");
        L.add("b");
        L.add("c");
        System.out.println(L);
    }
}
