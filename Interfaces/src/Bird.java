public class Bird extends Animal implements FlightEnabled,Trackable{

    @Override
    public void move() {
        System.out.println("Flaps Wings");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName()+" is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName()+" is going for Landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+" is flying high in the sky");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+"'s coordinates are recorded");
    }
}
