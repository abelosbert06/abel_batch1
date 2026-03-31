public class getterSetter {

    public static void main(String[] args) {
        Name n = new Name();
        n.setName("John");
        IO.println(n.getName());
    }
}

class Name {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

