
package gt.edu.umes.proy.calculo;

/**
 * Contiene las validaciones y el calculo solicitado para la Fase 1.
 */
public final class LogicaDelNegocio {

    public static final int CANTIDAD_PARAMETROS = 5;
    private static final long DIAS_POR_MES = 30L;
    private static final long DIAS_POR_SEMANA = 7L;
    private static final long HORAS_POR_DIA = 24L;
    private static final long MINUTOS_POR_HORA = 60L;
    private static final long SEGUNDOS_POR_MINUTO = 60L;

    /**
     * Valida que existan cinco parametros,
     * que sean enteros y que no sean negativos.
     *
     * @param argumentos meses, semanas, dias, horas y minutos
     * @return los cinco valores convertidos a enteros
     * @throws IllegalArgumentException si la entrada no es valida
     */
    public int[] validarArgumentos(String[] argumentos) {

        if (argumentos == null ||
                argumentos.length != CANTIDAD_PARAMETROS) {

            throw new IllegalArgumentException(
                "Debe ingresar exactamente 5 parametros: meses semanas dias horas minutos.");
        }

        int[] valores = new int[CANTIDAD_PARAMETROS];

        for (int i = 0; i < argumentos.length; i++) {

            try {
                valores[i] = Integer.parseInt(argumentos[i]);

            } catch (NumberFormatException excepcion) {

                throw new IllegalArgumentException(
                    "Todos los parametros deben ser numeros enteros.",
                    excepcion);
            }

            // Validar que no existan numeros negativos
            if (valores[i] < 0) {
                throw new IllegalArgumentException(
                    "Los parametros no pueden ser negativos.");
            }
        }

        return valores;
    }

    /**
     * Convierte el tiempo a segundos.
     * Un mes equivale a 30 dias.
     */
    public long calcularTotalEnSegundos(
            int meses,
            int semanas,
            int dias,
            int horas,
            int minutos) {

        long totalDias =
                meses * DIAS_POR_MES
                + semanas * DIAS_POR_SEMANA
                + dias;

        long totalHoras =
                totalDias * HORAS_POR_DIA + horas;

        long totalMinutos =
                totalHoras * MINUTOS_POR_HORA + minutos;

        return totalMinutos * SEGUNDOS_POR_MINUTO;
    }

    /**
     * Valida los argumentos y realiza el calculo.
     */
    public long calcularTotalEnSegundos(String[] argumentos) {

        int[] valores = validarArgumentos(argumentos);

        return calcularTotalEnSegundos(
                valores[0],
                valores[1],
                valores[2],
                valores[3],
                valores[4]);
    }
}
