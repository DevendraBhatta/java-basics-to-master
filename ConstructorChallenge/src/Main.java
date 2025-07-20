public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        System.out.println(customer.getName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getCreditLimit());


        Customer customer1 = new Customer("Omi",1000,"omi123@gmail.com");
        System.out.println(customer1.getName());
        System.out.println(customer1.getEmail());
        System.out.println(customer1.getCreditLimit());


        Customer customer2 = new Customer("Sakxyam","sakxyam12@hotmail.com");
        System.out.println(customer2.getName());
        System.out.println(customer2.getEmail());
        System.out.println(customer2.getCreditLimit());

    }
}
