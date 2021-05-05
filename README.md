# LanzandoELCaber
El lanzamiento de cáber es una disciplina escocesa de larga data. En rasgos generales, consta del lanzamiento de un pesado tronco que debe hacer un giro vertical en el aire.
Consigna


Enunciado
El lanzamiento de cáber es una disciplina escocesa de larga data. En rasgos generales, consta del lanzamiento de un pesado tronco que debe hacer un giro vertical en el aire.

La Asociación de Escoceses de Ramos Mejía (AERM) desea instalar nuevamente esta competición en la población, para lo cual armará un evento con competidores de jadrín de infantes. El mismo se evaluará de la siguiente manera:

Cada concursante dispone de tres lanzamientos.
Se evaluará la distancia recorrida por el tronco hasta tocar el suelo.
Se modificará dicha distancia de acuerdo al ángulo que genere el tronco, una vez caído, con respecto a la línea por la que corría el lanzador (ver imagen).
Dicho ángulo se medirá imaginando un reloj alineado como se muestra en la imagen.
Si hubiera caído entre las 11 y la 1, se considerará el largo total del lanzamiento.
Si hubiera caído entre las 9 y las 11, o entre la 1 y las 3, se considerará el 80% de dicha distancia.
Cualquier otro ángulo, se considerará como tiro descalificado, y no contará para ningún premio.

Se darán dos premios, con podios para tres o menos concursantes:

Consistencia. Aquel lanzador que sostenidamente lance el caber distancias similares, con ángulos consistentes. Sólo participarán aquellos que no tengan ningun lanzamiento descalificado.
Distancia. Aquel que sume mayor distancia entre sus tres lanzamientos.
La AERM nos proveerá de un archivo con el siguiente formato:

La primera línea, con un número natural que representa la cantidad de lanzadores que compitieron en el torneo. 3 < n < 1 000 000.
Luego, n grupos de pares de reales del tipo (d, a), que representan la distancia en metros a la que se lanzó el caber, y el ángulo de aterrizaje (considerando 0° las 12 horas). Los datos tendrán precisión suficiente para evitar empates.
El archivo de salida estará formado por dos líneas con los números de los participantes que han ganado en constancia y distancia, en ese orden, separados por espacios entre sí. El podio debe resolverse en un tiempo aceptable, dado que los lanzadores estarán expectantes del resultado del mismo.

Archivos de ejemplo

archivo.in

3

1.49	5.00

1.50	3.00

1.51	-3.00

2.10	6.00

2.00	-6.00

1.00	2.00

2.30	-35.00

1.30	-92.00

1.00	1.00

archivo.out

1 2 

2 1 3 

¿Qué se pide?
Para esta primera entrega grupal, se pide que realicen (todo en un .zip):

Diagrama de clases de la solución (.png/.jpg)

Tarjetas CRC para cada clase (.pdf)

Un pequeño párrafo con la explicación de cada clase y método (.pdf)
