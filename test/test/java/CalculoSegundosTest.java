package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import gt.edu.umes.proy.calculo.LogicaDelNegocio;
import org.junit.jupiter.api.Test;

public class CalculoSegundosTest {

    @Test
    void validarParametroConLetras() {

        LogicaDelNegocio logica = new LogicaDelNegocio();

        String[] argumentos = {"1", "3", "abc", "20", "1"};

        assertThrows(
                IllegalArgumentException.class,
                () -> logica.validarArgumentos(argumentos));
    }

    @Test
    void validarCalculoDeSegundos() {

        LogicaDelNegocio logica = new LogicaDelNegocio();

        long resultado = logica.calcularTotalEnSegundos(
                1, 3, 6, 20, 1);

        assertEquals(4996860L, resultado);
    }
}
