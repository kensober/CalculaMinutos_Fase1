# CalculaMinutos - Fase 1

Proyecto Java para Ingeniería de Software 2. Recibe cinco enteros en este orden:

1. meses
2. semanas
3. días
4. horas
5. minutos

La conversión usa 30 días por mes, 7 días por semana, 24 horas por día,
60 minutos por hora y 60 segundos por minuto. Esta regla reproduce el ejemplo
del documento: `1 2 5 3 20` equivale a `4245600` segundos.

## Ejecutar

Desde Eclipse, ejecute la clase
`gt.edu.umes.proy.calculo.CalculaMinutos` con los argumentos
`1 2 5 3 20`.

Desde una terminal:

```bash
ant run
```

El resultado esperado es:

```text
Total en segundos: 4245600
```

## Pruebas automatizadas

Eclipse usa su contenedor JUnit 4. Con Ant, si las dependencias no están en el
directorio hermano `dependencias`, indique sus rutas:

```bash
ant -Djunit.jar=/ruta/junit4.jar \
     -Dhamcrest.jar=/ruta/hamcrest-core.jar test
```

## Demostración de cambio, commit y push

Durante la evaluación se puede cambiar un mensaje o agregar una prueba pequeña,
guardar el archivo y ejecutar:

```bash
git diff
ant test
git add .
git commit -m "Ajusta mensaje durante demostracion"
git push origin main
```

Antes del `push`, confirme con `git status` que solo se incluyen los cambios de
la demostración.
