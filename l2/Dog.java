package l2;

public class Dog {
    public int weightInPounds;
//    this is a constructor, it tells us how to make dogs. 
    public Dog(int size){
        weightInPounds = size;
    }

    public  void makeNoise() {
        if(weightInPounds > 20) {
            System.out.println("arroooo!");
        } else if (weightInPounds > 10) {
            System.out.println("bark");
        } else {
            System.out.println("yipyipyyipyip");
        }
    }

//    Compare myself to the other dogs
    public Dog maxDog(Dog otherDog) {
        if (this.weightInPounds > otherDog.weightInPounds) {
            return this;
        }
        return otherDog;
    }

    public static Dog maxDog(Dog a, Dog b) {
        if (a.weightInPounds > b.weightInPounds) {
            return a;
        }
        return b;
    }


}
