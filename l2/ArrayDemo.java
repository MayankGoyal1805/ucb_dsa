package l2;

// arrays can't grow dynamically like list and have a fixed size, they have fewer features than lists but they are faster computationally.
// java prefers it over lists, like you don't need imports and has a special bracket [] syntax. because java values performance
public class ArrayDemo {
    static void main() {
        String[] s = new String[5];
        s[0] = "a";
        s[1] = "b";
        System.out.println(s[0]);
    }
}
