import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    private String codiceIME;
    private int qMemoria;

    public Smartphone( String nome, String marca, BigDecimal prezzo, BigDecimal iva, String codiceIME, int qMemoria){
        super(nome, marca, prezzo, iva);
        this.codiceIME = codiceIME;
        this.qMemoria = qMemoria;
    }

    public String getCodiceIME(){
        return this.codiceIME;
    }

    public void setCodiceIME(String codiceIME){
        this.codiceIME = codiceIME;
    }

    public int getQMemoria(){
        return this.qMemoria;
    }

    public void setQMemoria(int qMemoria){
        this.qMemoria = qMemoria;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nCodice IMEI: " + getCodiceIME() + "\nGiga : " + getQMemoria(); 
    }
    
}
