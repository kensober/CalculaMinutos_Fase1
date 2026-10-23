package gt.edu.umes.proy.calculo;

/** Punto de entrada del programa solicitado para la Fase 1. */
public final class CalculaMinutos {

    private CalculaMinutos() {
        // Esta clase solo contiene el metodo main.
    }

    public static void main(String[] args) {
        LogicaDelNegocio logica = new LogicaDelNegocio();

        try {
            long totalEnSegundos = logica.calcularTotalEnSegundos(args);
            System.out.println("Total en segundos: " + totalEnSegundos);
        } catch (IllegalArgumentException excepcion) {
            System.err.println("Error: " + excepcion.getMessage());
            System.err.println(
                    "Uso: java gt.edu.umes.proy.calculo.CalculaMinutos "
                            + "<meses> <semanas> <dias> <horas> <minutos>");
        }
    }
}
