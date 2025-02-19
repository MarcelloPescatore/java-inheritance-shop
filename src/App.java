import java.math.BigDecimal;

public class App {
    public static void main(String[] args){
       Cuffie airPods = new Cuffie("bianche", true, 34556, "AirPods", "Apple", new BigDecimal(139),0.22d);

       System.out.println(airPods.getCodice());
       System.out.println(airPods.getPrezzo());
    }
}
