import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Melbourne");
        placesToVisit.add(1,"Brisbane");
        System.out.println(placesToVisit);
    }
}
