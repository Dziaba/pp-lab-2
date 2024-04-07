import java.util.Scanner;
import java.util.Arrays;


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

        //sortowanie liczb w tablicy

        Arrays.sort(tablicaOcen);

        //Obliczanie mediany

        int mediana;
        if (ilePrzedmiotow % 2 == 0){
            mediana = ((tablicaOcen[ilePrzedmiotow / 2-1] + tablicaOcen[ilePrzedmiotow/2+1]) /2 );
        }
        else{
            mediana= tablicaOcen[ilePrzedmiotow / 2];
        }
        System.out.println("\n Mediana ocen to  :" + mediana );

        //wyswietlanie wproawdzonych ocen
        System.out.println("Wprowadzone oceny to:");

        for (int i=0; i<ilePrzedmiotow; i++)
        {
            System.out.println("\n Ocena " + i + " to: " + tablicaOcen[i]);
        }
        System.out.println("\n a ich suma to: " + sumaOcen );
        scanner.close();
    }
}