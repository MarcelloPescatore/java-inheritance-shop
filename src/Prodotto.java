import java.math.BigDecimal;

public class Prodotto {
    private int codice;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private double iva;


    public Prodotto(int codice, String nome, String marca, BigDecimal prezzo, double iva) {
        this.codice = codice;
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

    public double getIva(){
        return this.iva;
    }

    public void setIva(double iva){
        this.iva = iva;
    }
}
