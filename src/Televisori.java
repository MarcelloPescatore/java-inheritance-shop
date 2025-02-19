import java.math.BigDecimal;

public class Televisori extends Prodotto {
    private int pollici;
    private boolean smart;

    public Televisori(int pollici, boolean smart, int codice, String nome, String marca, BigDecimal prezzo, double iva){
        this.pollici = pollici;
        this.smart = smart;
        super(codice, nome, marca, prezzo, iva);
    }

    public int getPollici(){
        return this.pollici;
    }

    public void setPollici(int pollici){
        this.pollici = pollici;
    }

    public boolean getSmart(){
        return this.smart;
    }

    public void setSmart(boolean smart){
        this.smart = smart;
    }
}

