package gt.edu.umes.proy.calculo;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Before;
import org.junit.Test;


//fecha:23/10/2026
//logica de negocio
public class LogicaDelNegocioTest {

    private LogicaDelNegocio logica;

    @Before
    public void preparar() {
        logica = new LogicaDelNegocio();
    }

    @Test
    public void calculaEjemploDelDocumento() {
        assertEquals(4_245_600L, logica.calcularTotalEnSegundos(1, 2, 5, 3, 20));
    }

    @Test
    public void calculaSoloUnMinuto() {
        assertEquals(60L, logica.calcularTotalEnSegundos(0, 0, 0, 0, 1));
    }

    @Test
    public void validaCincoEnteros() {
        assertArrayEquals(
                new int[] {1, 2, 5, 3, 20},
                logica.validarArgumentos(new String[] {"1", "2", "5", "3", "20"}));
    }

    @Test
    public void rechazaCantidadIncorrectaDeParametros() {
        assertThrows(
                IllegalArgumentException.class,
                () -> logica.validarArgumentos(new String[] {"1", "2"}));
    }

    @Test
    public void rechazaUnParametroQueNoEsEntero() {
        assertThrows(
                IllegalArgumentException.class,
                () -> logica.validarArgumentos(new String[] {"1", "dos", "5", "3", "20"}));
    }
}
