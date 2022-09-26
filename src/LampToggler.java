import java.util.InputMismatchException;
import java.util.Scanner;


public class LampToggler {


    public static void main (String[]args){
        Lampe L1 = new Lampe("lampe1");
        Lampe L2 = new Lampe("lampe2");
        Lampe L3 = new Lampe("lampe3");
        Lampe L4 = new Lampe("lampe4");
        Lampe L5 = new Lampe("lampe5");

        Lampe selectedLampe = null;

        Scanner scanner = new Scanner (System.in);

        int valg = 0;
        do {
            System.out.println(L1);
            System.out.println(L2);
            System.out.println(L3);
            System.out.println(L4);
            System.out.println(L5);

            System.out.println("Hvilken lampe skal ændres? (0 er afslut)");

            try {
                valg = scanner.nextInt();
            } catch (InputMismatchException e){
                valg = 0;
            }

            if (scanner.hasNext())
            if (valg > 0 && valg <=5);
            selectedLampe = L1;
             if (valg == 2);
            selectedLampe = L2;
             if (valg == 3);
            selectedLampe = L3;
             if (valg == 4);
            selectedLampe = L4;
             if (valg == 5);
            selectedLampe = L5;


            selectedLampe.toggle();
        } while (valg !=0);

    }
}
