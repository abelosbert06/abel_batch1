class Person {
    private String bankAccountNumber = "123456";
    String name = "V";
    protected String address = "123 generic street name";
    public String profession = "generic job";

    public void displayPrivateData() {
        IO.println("Private variable can only be accessed form this from this function " + bankAccountNumber);
    }
}

public class task1 {
    public static void main(String[] args) {
        Person p = new Person();

        System.out.println("name (default): " + p.name);
        System.out.println("address (protected): " + p.address);
        System.out.println("job (public): " + p.profession);

        //not accessible
        //IO.println(p.socialSecurityNumber);

        p.displayPrivateData();
    }
}
