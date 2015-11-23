# Analizador-apk--java-
Proyecto que decompila un conjunto de aplicaciones para obtener el código fuente en java para su posterior análisis

Uso exclusivo Linux

Desde de la consola abrir el directorio principal donde se encuentran los archivos y si se quiere decompilar una aplicación y posteriormente
ejecutar el siguiente comando:

$ python3 decompilador.py d [Ruta del APK a decompilar] -o [opcional] Ruta de destino de archivos

Esto realizará la decompilación y entregará los archivos de salida en el directorio principal si es que no se le especifica uno.

También está contenido un script que automatiza el proceso y toma todos los APk contenidos en el directorio "Apk" ejecuta el primer script 
por cada uno de los archivos y analiza los resultados entregando diversos outputs entregando un resultado para cada aplicación. El
comando para ejecutar este script es el siguiente

$ python3 analizador.py
