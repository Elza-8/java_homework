import java.util.*;

public class lab5 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> telBook = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        Boolean run = true;
        while (run) {
            String str = scanner.nextLine();
            if (str.equals("q")) {
                System.out.println("Вышли)))");
                break;
            }
            String[] person = str.split(" ");
            telBook.putIfAbsent(person[0], new ArrayList<>());
            telBook.get(person[0]).add(person[1]);

        }
        ArrayList<String> temp = new ArrayList<>();
        for (String s: telBook.keySet()) {
            temp.add(s);
        }
        Collections.sort(temp, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return telBook.get(o2).size() - telBook.get(o1).size();
            }
        });

        System.out.println(temp);

    }
}
