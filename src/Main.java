import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        ArrayList<Napoje> napoje = new ArrayList<>();
        napoje.add(new Coke("Coke"));
        napoje.add(new Herbata("czarna"));
        napoje.add(new A("A"));

        for (Napoje napoje1 : napoje) {
            napoje1.pij();
        }

        Comparator<Napoje> comparator = (o1,o2) ->
                o2.getClass().getSimpleName().length() - o1.getClass().getSimpleName().length();

        napoje.sort(comparator);
        System.out.println(napoje);

        KochajaceProgramowac programuj = new KochajaceProgramowac() {
            @Override
            public void Programuj() {
                System.out.println("ewhifjsghsflijghaslugfdlhgerl");
            }
        };





        Scanner skarner = new Scanner(System.in);
        Function<String,Integer> len = (String x) -> {
            x = skarner.nextLine();
            return x.length();
        };
        System.out.println(len.apply(""));
        BiFunction<Integer,Integer,Integer> mnozenie = (Integer x, Integer y) -> {
            x = skarner.nextInt();
            y = skarner.nextInt();
            return x*y;
        };
        System.out.println(mnozenie.apply(0,0));

    }
}