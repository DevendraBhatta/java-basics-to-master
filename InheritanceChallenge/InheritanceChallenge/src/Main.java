public class Main {
    public static void main(String[] args) {

        Employee dev = new Employee("Tim", "10/10/2004", "01/01/2020");
        System.out.println(dev);
        System.out.println("Age = " + dev.getAge());
        System.out.println("Pay" + dev.collectPay());

        Employee biku = new Employee("Bikrant", "07/07/2008", "04/06/2023");
        System.out.println(biku);

        SalariedEmployee omi = new SalariedEmployee("Omi", "09/03/2024", "10/10/2024", 35000);
        System.out.println(omi);
        System.out.println("omi's paycheck  = $" + omi.collectPay());

        omi.retire();
        System.out.println("Omi's pension check = $"+omi.collectPay());


        HourlyEmployee marry = new HourlyEmployee("")


    }
}
