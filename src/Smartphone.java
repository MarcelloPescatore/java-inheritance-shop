import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    private int codiceIME;
    private int qMemoria;

    public Smartphone(int codiceIME, int qMemoria, int codice, String nome, String marca, BigDecimal prezzo, double iva){
        this.codiceIME = codiceIME;
        this.qMemoria = qMemoria;
        super(codice, nome, marca, prezzo, iva);
    }

    public int getCodiceIME(){
        return this.codiceIME;
    }

    public void setCodiceIME(int codiceIME){
        this.codiceIME = codiceIME;
    }

    public int getQMemoria(){
        return this.qMemoria;
    }

    public void setQMemoria(int qMemoria){
        this.qMemoria = qMemoria;
    }
}
