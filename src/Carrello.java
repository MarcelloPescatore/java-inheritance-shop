import java.util.Scanner;
import java.math.BigDecimal;

public class Carrello {
    public static void main(String[] args) {
        Prodotto[] prodotti = new Prodotto[1];
        Scanner inputUtente = new Scanner(System.in);

        for (int i = 0; i < prodotti.length; i++) {
            // recupero i dati del prodotto
            System.out.println("Nome del prodotto: ");
            String nomeProdotto = inputUtente.nextLine();
            System.out.println("Marca del prodotto: ");
            String marcaProdotto = inputUtente.nextLine();
            System.out.println("Prezzo (senza iva): ");
            int prezzoProdotto = Integer.parseInt(inputUtente.nextLine());

            // recupero la categoria del prodotto
            System.out.println("Inserisci la categoria del prodotto: Tv, Smartphone o Cuffie ");
            String categoriaProdotto = inputUtente.nextLine();
            System.out.println(String.format("La cateogorie scelta: %s", categoriaProdotto));

            if (categoriaProdotto.toLowerCase().equals("tv")) {
                System.out.println("Dimensioni della TV in pollici: ");
                int dimensioniTv = Integer.parseInt(inputUtente.nextLine());
                System.out.println("È una smart Tv? true o false ");
                boolean isSmart = Boolean.parseBoolean(inputUtente.nextLine());

                Televisori tv = new Televisori(nomeProdotto, marcaProdotto, new BigDecimal(prezzoProdotto), new BigDecimal(0.22), dimensioniTv, isSmart);
                prodotti[i] = tv;

            } else if(categoriaProdotto.toLowerCase().equals("smartphone")) {
                System.out.println("Giga di memoria: ");
                int giga = Integer.parseInt(inputUtente.nextLine());
                System.out.println("Codice IME: ");
                String codiceIME = inputUtente.nextLine();

                Smartphone telefono = new Smartphone(nomeProdotto, marcaProdotto, new BigDecimal(prezzoProdotto), new BigDecimal(0.22), codiceIME, giga);
                prodotti[i] = telefono;
                
            } else {
                System.out.println("Colore: ");
                String Colore =inputUtente.nextLine();
                System.out.println("Sono cuffie wireless? true o false ");
                boolean isWireless = Boolean.parseBoolean(inputUtente.nextLine());

                Cuffie cuffie = new Cuffie(nomeProdotto, marcaProdotto, new BigDecimal(prezzoProdotto), new BigDecimal(0.22), Colore, isWireless);
                prodotti[i] = cuffie;
            }

        }

        inputUtente.close();

        System.out.println("Il tuo carrello: ");

        for(int i = 0; i < prodotti.length; i++){
            System.out.println(prodotti[i]);
        }
    }
}
