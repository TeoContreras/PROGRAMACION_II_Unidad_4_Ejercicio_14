package ORGANIZADOR;

import SUPERclases.Prestable;

public class ControlVencimientos {

    public void procesarDevolucion(Prestable material, int dias){
        double multa = material.calcularMultaDemora(dias);
        if (multa == 0) {
            System.out.println("Devolución en término, sin multa");
        } else {
            System.out.println("Multa por " + dias + " días de atraso: $" + String.format("%.2f", multa));
        }
    }
}
