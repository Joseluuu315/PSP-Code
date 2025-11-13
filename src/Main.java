import com.joseluu.psp.adivinar.HiloAdivinador;
import com.joseluu.psp.adivinar.NumeroOculto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NumeroOculto numeroOculto = new NumeroOculto();

        for (int i = 1; i<=10; i++){
            HiloAdivinador h = new HiloAdivinador(numeroOculto, "hilo-" + i);
            h.start();
        }
    }
}