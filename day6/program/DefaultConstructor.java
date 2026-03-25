public class DefaultConstructor {

    // automatically creates something like this during compilation even though we havent declared it
    // public DefaultConstructor(){
    // }

    public DefaultConstructor() {
        IO.println("constructor here");
    }

    public static void main(String[] args) {
        System.out.println("default constructor is automatically created");
        var df = new defConst();
    }
}

class defConst {

    public defConst() {
        IO.println("defConst constructor here");
    }
}
