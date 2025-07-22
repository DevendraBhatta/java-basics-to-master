public class Dog extends Animal {

    private String earShape;
    private String tailShape;


    public Dog() {
        super("Mutt", "Big",50);
    }

    public Dog(String type,double weight){
        this(type,weight,"Perky","Curled");
    }

    public Dog(String type, double weight, String tailShape, String earShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.tailShape = tailShape;
        this.earShape = earShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }


    public void makeNoise(){


    }


    @Override
    void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and wag their tail");
        if (speed == "slow"){
            walk();
            wagTail();
        }else {
            run();
            bark();
        }

        System.out.println();
    }



    private void bark(){
        System.out.print("Woof");
    }
    private void run(){
        System.out.print("Dog is Running ");
    }

    private void walk(){
        System.out.print("Dog is walking");
    }
    private void wagTail(){
        System.out.print("Tail Wagging");
    }








}
