void main() {
    Integer a = 10;
    Integer obj = 10;
    IO.println(a == obj); //compares references and value
    IO.println(obj.equals(a)); //compares only the value
}
