import java.util.*;

public class SetComparisonApp {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        System.out.print("Podaj ciąg liczb (oddzielone spacjami): ");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        for (String number : numbers) {    //Przetwarzanie i dodawanie liczb z ciągu znaków
            try {                          //do zbiorów hashSet i treeSet
                int num = Integer.parseInt(number);
                hashSet.add(num);
                treeSet.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Błąd: Niepoprawny format liczby - " + number);
            }
        }

        System.out.println("Zawartość zbioru HashSet:");
        printSet(hashSet);

        System.out.println("Zawartość zbioru TreeSet:");
        printSet(treeSet);
    }

    private void printSet(Set<Integer> set) { // Metoda służy do wyświetlania zawartości zbioru liczb całkowitych.
        for (int num : set) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}