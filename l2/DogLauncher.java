package l2;

public class DogLauncher {
    void main() {
        Dog maya = new Dog(9);
//        maya.makeNoise();

        Dog hugeGreg = new Dog(1500);
//        Dog largerDog = Dog.maxDog(maya, hugeGreg);
//        largerDog.makeNoise();
        maya.maxDog(hugeGreg).makeNoise();
    }
}
