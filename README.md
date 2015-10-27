# Analizador-apk--java-
Proyecto que decompila un conjunto de aplicaciones para obtener el código fuente en java para su posterior análisis

Uso exclusivo Linux

Desde de la consola abrir el directorio principal donde se encuentran los archivos y si se quiere decompilar una aplicación y posteriormente
ejecutar el siguiente comando:

$ python3 apk2java.py d [PATH del APK a decompilar] --java

Esto realizará la decompilación y entregará los archivos de salida en el directorio principal.

También está contenido un script que automatiza el proceso y toma todos los APk contenidos en el directorio "Apk" ejecuta el primer script 
por cada uno de los archivos y analiza los resultados entregando diversos outputs entregando un resultado para cada aplicación. El
comando para ejecutar este script es el siguiente

$ python3 analizador.py
