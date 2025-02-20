import java.math.BigDecimal;

public class Televisori extends Prodotto {
    private int pollici;
    private boolean isSmart;

    public Televisori(String nome, String marca, BigDecimal prezzo, BigDecimal iva, int pollici,
            boolean isSmart) {
        super(nome, marca, prezzo, iva);
        this.pollici = pollici;
        this.isSmart = isSmart;
    }

    public int getPollici() {
        return this.pollici;
    }

    public void setPollici(int pollici) {
        this.pollici = pollici;
    }

    public boolean getIsSmart() {
        return this.isSmart;
    }

    public void setIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDimensione TV : " + getPollici() + " pollici" + "\nSmart : " + getIsSmart(); 
    }
}
