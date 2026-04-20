import java.util.stream.Collectors;

void main() {
    var lst = Arrays.asList(1, 2, 3, 4, 5);
    lst
        .stream()
        .filter(x -> x % 2 == 0)
        .forEach(IO::println);

    int i = lst
        .stream()
        .map(x -> x * x)
        .reduce(0, (a, b) -> Math.max(a, b));
    IO.println(i);

    lst = lst
        .stream()
        .filter(x -> x % 2 == 0)
        .map(x -> x * 2)
        .collect(Collectors.toList());
    //.forEach(x -> IO.print(x + " "));

    IO.println(lst);
}
