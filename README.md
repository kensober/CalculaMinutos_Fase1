# CalculaMinutos - Fase 2

Proyecto Java con Maven para Ingeniería de Software 2. Recibe cinco enteros en este orden:

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

Desde una terminal, compile y ejecute todas las pruebas JUnit 4 y JUnit 6:

```bash
~/.local/bin/mvn clean test
```

El proyecto contiene siete pruebas: cinco de la fase 1 y dos de la fase 2.
Para ejecutar el programa después de compilar:

```bash
~/.local/bin/mvn compile
java -cp target/classes gt.edu.umes.proy.calculo.CalculaMinutos 1 2 5 3 20
```

El resultado esperado del programa es:

```text
Total en segundos: 4245600
```

## Demostración de cambio, commit y push

Durante la evaluación se puede cambiar un mensaje o agregar una prueba pequeña,
guardar el archivo y ejecutar:

```bash
git diff
~/.local/bin/mvn clean test
git add .
git commit -m "Ajusta mensaje durante demostracion"
git push origin main
```

Antes del `push`, confirme con `git status` que solo se incluyen los cambios de
la demostración.
