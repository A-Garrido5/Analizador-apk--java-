import sys, os, string
import urllib.request
import zipfile
from subprocess import call
from optparse import OptionParser
from os import listdir
import os

carpetaPrincipal=os.path.dirname(os.path.abspath(__file__))
carpetaAPK=carpetaPrincipal+"/Apk"
carpetaSalida=carpetaPrincipal+"/output"

def analizar(carpeta):
	print("Comienza el analisis")
	print(carpeta)






def main():

	ficheros = os.listdir(carpetaAPK)

	for x in ficheros:
		#print(len(ficheros))

		nombreArchivo=os.path.splitext(x)[0]
		
		#python3 apk2java.py d /home/adrian/Escritorio/APK/com.whatsapp.apk -o hola --java
		call('python3 apk2java.py d '+carpetaAPK +'/'+ x+' -o output/ --java',shell=True)
		call('rm -r -f output/'+nombreArchivo+'-new.apk',shell=True)
		call('rm -r -f output/'+nombreArchivo+'.jar',shell=True)
		analizar("output/"+nombreArchivo+"/src")

if __name__=="__main__":
  main()