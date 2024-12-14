public class Animal {
    int leg;
    String color;
    boolean isPet;
    String sound;

    public int getLeg(){
        return leg;
    }
    public void setLeg(int leg){
        this.leg = leg;
    }
}
class dog extends Animal {

    public dog(int leg, String color, boolean isPet, String sound){
        this.leg = leg;
        this.color = color;
        this.isPet = isPet;
        this.sound = sound;
    }
    public void print(){
        String pet;
        if(this.isPet == true){
            pet = "a pet animal";
        } else {
            pet = "not a pet animal";

        }
        System.out.println("the dog is : " + pet);
        System.out.println("the dog has : " + this.leg + " legs");
        System.out.println("the color of the dog is : " + this.color);
        System.out.println("Sound of dog : " + this.sound);
    }    
    public static void main(String[] args) {
        dog myDog = new dog(4, "brown", true, "bark bark!");
        myDog.print();
    }
}
