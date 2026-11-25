package SUBclases;

import SUPERclases.Prestable;

public class TesisPrestamo implements Prestable {
    private String titulo;

    public TesisPrestamo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public double calcularMultaDemora(int diasAtraso) {
        if (diasAtraso <= 0) {
            return 0;
        }
        return diasAtraso * 120;
    }
}
