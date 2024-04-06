import java.util.Scanner;

public class zadania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //otrzymywanie ilosci przedmiotow
        System.out.print("Podaj liczbę przedmiotów: ");
        int ilePrzedmiotow = scanner.nextInt();

        //deklaracja tablicy w ktorej bedziemy trzymac oceny
            int [] tablicaOcen =new int[ilePrzedmiotow];
            
        //powtorzenie petli tyle ile uzytkownik wprowadzil x
        for (int i=0; i<ilePrzedmiotow; i++){
            System.out.print("Podaj oceny z przedmiotu " + (i + 1) + ": ");
            tablicaOcen[i] = scanner.nextInt();
        }
        // zliczanie wszystkich danych z tablicy
         int sumaOcen = 0;
        for (int i=0; i<ilePrzedmiotow; i++){
            sumaOcen += tablicaOcen[i];

        }
        // obliczanie sredniej arytmetycznej
        double srednia= (double)sumaOcen / tablicaOcen.length;

        //wyswietlanie sredniej

        System.out.print("srednia ocen to: " + srednia);

        scanner.close();
    }
}