import ORGANIZADOR.ControlVencimientos;
import SUBclases.LibroPrestamo;
import SUBclases.RevistaPrestamo;
import SUBclases.TesisPrestamo;
import SUPERclases.Prestable;

public class MAIN {
    public static void main(String[] args) {
        ControlVencimientos control = new ControlVencimientos();

        Prestable material = new LibroPrestamo("Don Quijote");
        System.out.println("--- Libro ---");
        control.procesarDevolucion(material, 5);

        material = new RevistaPrestamo("National Geographic");
        System.out.println("--- Revista ---");
        control.procesarDevolucion(material, 5);

        material = new TesisPrestamo("Energías renovables en Cuyo");
        System.out.println("--- Tesis ---");
        control.procesarDevolucion(material, 5);

        System.out.println("--- Tesis devuelta a tiempo ---");
        control.procesarDevolucion(material, 0);
    }
}
