import java.util.Random;

public class CaboDeGuerra {
    public static void main(String[] args) {
        PilhaCaboDeGuerra caboDeGuerra = new PilhaCaboDeGuerra(10);

        while (!caboDeGuerra.estaCheia1()) {
            Random random = new Random();
            int numero = random.nextInt(0,2);
            if (numero == 0) {
                caboDeGuerra.empilhar2("-");
            } else {
                caboDeGuerra.empilhar1("+");
            }
            
        }

        System.out.println(caboDeGuerra.imprimir1() + " " + caboDeGuerra.imprimir2());
    }

}
