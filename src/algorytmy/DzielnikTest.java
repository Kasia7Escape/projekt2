package algorytmy;

import java.util.Scanner;

public class DzielnikTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę a:");
        int a = scanner.nextInt();
        System.out.println("podaj liczbe b:");
        int b = scanner.nextInt();

        int wynik = Dzielnik.dzielnik(a,b);
        System.out.println("najwiekszy wspólny dzielnik liczb a i b wynosi: " + wynik);

    }
}
