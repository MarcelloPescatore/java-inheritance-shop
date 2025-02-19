import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    private String colore;
    private boolean wireless;

    public Cuffie(String colore, boolean wireless, int codice, String nome, String marca, BigDecimal prezzo, double iva){
        this.colore = colore;
        this.wireless = wireless;
        super(codice, nome, marca, prezzo, iva);
    }
    
    public String getColore(){
        return this.colore;
    }

    public void setColore(String colore){
        this.colore = colore;
    }

    public boolean getWireless(){
        return this.wireless;
    }

    public void setWireless(boolean wireless){
        this.wireless = wireless;
    }
}

