public class Main {
    public static void main(String[] args) {
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is test " + myVariable + " Still More" + " More");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("MyVariable" + myVariable);
        if (myVariable == 0){
            System.out.println("It is now zero");
            
        }
    }
}
