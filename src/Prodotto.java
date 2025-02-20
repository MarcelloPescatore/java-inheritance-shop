import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva;


    public Prodotto(String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        Random random = new Random();
        this.codice = random.nextInt(99999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // metodi get e set
    public int getCodice(){
        return this.codice;
    }


    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public BigDecimal getPrezzo(){
        return this.prezzo;
    }

    public void setPrezzo(BigDecimal prezzo){
        this.prezzo = prezzo;
    }

    public BigDecimal getIva(){
        return this.iva;
    }

    public void setIva(BigDecimal iva){
        this.iva = iva;
    }

    public BigDecimal getPrezzoConIva() {
        if (prezzo != null && iva != null) {
            return prezzo.add(prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
        }
        return null;
    };

    public String toString() {
        if (nome != null) {
            return codice + "-" + nome;
        }
        return null;
    }
}
