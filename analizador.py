import sys, os, string
import urllib.request
import fnmatch
import zipfile
from subprocess import call
from optparse import OptionParser
from os import listdir
from decimal import *
import os
import urllib.parse
import urllib.request
import glob


carpetaPrincipal=os.path.dirname(os.path.abspath(__file__))
carpetaAPK=carpetaPrincipal+"/Apk"
carpetaAPKmalware=carpetaPrincipal+"/ApkMalware"
carpetaSalida=carpetaPrincipal+"/output"

Version_app=0;

diccionarioPermisos = {
	"ACCESS_CHECKIN_PROPERTIES": 0,
	"ACCESS_COARSE_LOCATION": 0,
	"ACCESS_FINE_LOCATION": 0,
	"ACCESS_LOCATION_EXTRA_COMMANDS": 0,
	"ACCESS_MOCK_LOCATION": 0,
	"ACCESS_NETWORK_STATE": 0,
	"ACCESS_SURFACE_FLINGER": 0,
	"ACCESS_WIFI_STATE": 0,
	"ACCOUNT_MANAGER": 0,
	"ADD_VOICEMAIL": 0,
	"AUTHENTICATE_ACCOUNTS": 0,
	"BATTERY_STATS": 0,
	"BIND_ACCESSIBILITY_SERVICE": 0,
	"BIND_APPWIDGET": 0,
	"BIND_CARRIER_MESSAGING_SERVICE": 0,
	"BIND_DEVICE_ADMIN": 0,
	"BIND_DREAM_SERVICE": 0,
	"BIND_INPUT_METHOD": 0,
	"BIND_NFC_SERVICE": 0,
	"BIND_NOTIFICATION_LISTENER_SERVICE": 0,
	"BIND_PRINT_SERVICE": 0,
	"BIND_REMOTEVIEWS": 0,
	"BIND_TEXT_SERVICE": 0,
	"BIND_TV_INPUT": 0,
	"BIND_VOICE_INTERACTION": 0,
	"BIND_VPN_SERVICE": 0,
	"BIND_WALLPAPER": 0,
	"BLUETOOTH": 0,
	"BLUETOOTH_ADMIN": 0,
	"BLUETOOTH_PRIVILEGED": 0,
	"BODY_SENSORS": 0,
	"BRICK": 0,
	"BROADCAST_PACKAGE_REMOVED": 0,
	"BROADCAST_SMS": 0,
	"BROADCAST_STICKY": 0,
	"BROADCAST_WAP_PUSH": 0,
	"CALL_PHONE": 0,
	"CALL_PRIVILEGED": 0,
	"CAMERA": 0,
	"CAPTURE_AUDIO_OUTPUT": 0,
	"CAPTURE_SECURE_VIDEO_OUTPUT": 0,
	"CAPTURE_VIDEO_OUTPUT": 0,
	"CHANGE_COMPONENT_ENABLED_STATE": 0,
	"CHANGE_CONFIGURATION": 0,
	"CHANGE_NETWORK_STATE": 0,
	"CHANGE_WIFI_MULTICAST_STATE": 0,
	"CHANGE_WIFI_STATE": 0,
	"CLEAR_APP_CACHE": 0,
	"CLEAR_APP_USER_DATA": 0,
	"CONTROL_LOCATION_UPDATES": 0,
	"DELETE_CACHE_FILES": 0,
	"DELETE_PACKAGES": 0,
	"DEVICE_POWER": 0,
	"DIAGNOSTIC": 0,
	"DISABLE_KEYGUARD": 0,
	"DUMP": 0,
	"EXPAND_STATUS_BAR": 0,
	"FACTORY_TEST": 0,
	"FLASHLIGHT": 0,
	"FORCE_BACK": 0,
	"GET_ACCOUNTS": 0,
	"GET_PACKAGE_SIZE": 0,
	"GET_TASKS": 0,
	"GET_TOP_ACTIVITY_INFO": 0,
	"GLOBAL_SEARCH": 0,
	"HARDWARE_TEST": 0,
	"INJECT_EVENTS": 0,
	"INSTALL_LOCATION_PROVIDER": 0,
	"INSTALL_PACKAGES": 0,
	"INSTALL_SHORTCUT": 0,
	"INTERNAL_SYSTEM_WINDOW": 0,
	"INTERNET": 0,
	"KILL_BACKGROUND_PROCESSES": 0,
	"LOCATION_HARDWARE": 0,
	"MANAGE_ACCOUNTS": 0,
	"MANAGE_APP_TOKENS": 0,
	"MANAGE_DOCUMENTS": 0,
	"MASTER_CLEAR": 0,
	"MEDIA_CONTENT_CONTROL": 0,
	"MODIFY_AUDIO_SETTINGS": 0,
	"MODIFY_PHONE_STATE": 0,
	"MOUNT_FORMAT_FILESYSTEMS": 0,
	"MOUNT_UNMOUNT_FILESYSTEMS": 0,
	"NFC": 0,
	"PERSISTENT_ACTIVITY": 0,
	"PROCESS_OUTGOING_CALLS": 0,
	"READ_CALENDAR": 0,
	"READ_CALL_LOG": 0,
	"READ_CONTACTS": 0,
	"READ_EXTERNAL_STORAGE": 0,
	"READ_FRAME_BUFFER": 0,
	"READ_HISTORY_BOOKMARKS": 0,
	"READ_INPUT_STATE": 0,
	"READ_LOGS": 0,
	"READ_PHONE_STATE": 0,
	"READ_PROFILE": 0,
	"READ_SMS": 0,
	"READ_SOCIAL_STREAM": 0,
	"READ_SYNC_SETTINGS": 0,
	"READ_SYNC_STATS": 0,
	"READ_USER_DICTIONARY": 0,
	"READ_VOICEMAIL": 0,
	"REBOOT": 0,
	"RECEIVE_BOOT_COMPLETED": 0,
	"RECEIVE_MMS": 0,
	"RECEIVE_SMS": 0,
	"RECEIVE_WAP_PUSH": 0,
	"RECORD_AUDIO": 0,
	"REORDER_TASKS": 0,
	"RESTART_PACKAGES": 0,
	"SEND_RESPOND_VIA_MESSAGE": 0,
	"SEND_SMS": 0,
	"SET_ACTIVITY_WATCHER": 0,
	"SET_ALARM": 0,
	"SET_ALWAYS_FINISH": 0,
	"SET_ANIMATION_SCALE": 0,
	"SET_DEBUG_APP": 0,
	"SET_ORIENTATION": 0,
	"SET_POINTER_SPEED": 0,
	"SET_PREFERRED_APPLICATIONS": 0,
	"SET_PROCESS_LIMIT": 0,
	"SET_TIME": 0,
	"SET_TIME_ZONE": 0,
	"SET_WALLPAPER": 0,
	"SET_WALLPAPER_HINTS": 0,
	"SIGNAL_PERSISTENT_PROCESSES": 0,
	"STATUS_BAR": 0,
	"SUBSCRIBED_FEEDS_READ": 0,
	"SUBSCRIBED_FEEDS_WRITE": 0,
	"SYSTEM_ALERT_WINDOW": 0,
	"TRANSMIT_IR": 0,
	"UNINSTALL_SHORTCUT": 0,
	"UPDATE_DEVICE_STATS": 0,
	"USE_CREDENTIALS": 0,
	"USE_SIP": 0,
	"VIBRATE": 0,
	"WAKE_LOCK": 0,
	"WRITE_APN_SETTINGS": 0,
	"WRITE_CALENDAR": 0,
	"WRITE_CALL_LOG": 0,
	"WRITE_CONTACTS": 0,
	"WRITE_EXTERNAL_STORAGE": 0,
	"WRITE_GSERVICES": 0,
	"WRITE_HISTORY_BOOKMARKS": 0,
	"WRITE_PROFILE": 0,
	"WRITE_SECURE_SETTINGS": 0,
	"WRITE_SETTINGS": 0,
	"WRITE_SMS": 0,
	"WRITE_SOCIAL_STREAM": 0,
	"WRITE_SYNC_SETTINGS": 0,
	"WRITE_USER_DICTIONARY": 0,
	"WRITE_VOICEMAIL": 0

}

diccionarioPublicidad = {

	"com.google.ads": 0,
	"com.flurry": 0,
	"com.inmobi": 0,
	"com.tapjoy": 0,
	"com.mobclix": 0,
	"com.chartboost": 0,
	"com.adwhirl": 0,
	"com.mopub": 0,
	"com.greystripe": 0,
	"com.jumptap": 0,
	"com.google.analytics": 0,
	"com.admob": 0,
	"com.burstly": 0,
	"com.sponsorpay": 0,
	"com.cauly": 0,
	"com.mobfox": 0,
	"com.vpon": 0,
	"com.appbrain": 0,
	"net.daum": 0,
	"com.admarvel": 0,
	"com.applovin": 0,
	"com.adfonic": 0,
	"com.mdotm": 0,
	"com.getjar": 0,
	"com.nexage": 0,
	"com.inneractive": 0,
	"com.pontiflex": 0,
	"com.zestadz": 0,
	"com.madhouse": 0,
	"com.smaato": 0,
	"net.youmi": 0,
	"de.madvertise": 0,
	"cn.domob": 0,
	"com.jirbo.adcolony": 0,
	"com.revmob": 0,
	"com.senddroid": 0,
	"com.airpush": 0,
	"com.tapit": 0,
	"com.medialets": 0,
	"mediba.ad": 0,
	"com.papaya": 0,
	"com.huntmads": 0,
	"com.rhythmnewmedia": 0,
	"com.tapfortap": 0,
	"com.adknowledge": 0,
	"net.metaps": 0,
	"com.wiyun": 0,
	"com.vdopia": 0,
	"com.waps": 0,
	"com.adwo": 0,
	"com.mobosquare": 0,
	"mobi.vserv": 0,
	"com.wooboo": 0,
	"com.everbadge": 0,
	"com.mt.airad": 0,
	"com.noqoush.adfalcon": 0,
	"com.moolah": 0,
	"com.kuguo": 0,
	"buzzcity": 0,
	"com.adsmogo": 0,
	"com.sellaring": 0,
	"com.startapp": 0,
	"com.admoda": 0,
	"com.mobpartner": 0,
	"com.quclix": 0,
	"com.ldevelop": 0
	
}

diccionarioEncriptacion={
	"getInstance(\"AES\")":0,
	"getInstance(\"AESWrap\")":0,
	"getInstance(\"Blowfish\")":0,
	"getInstance(\"CCM\")":0,
	"getInstance(\"DES\")":0,
	"getInstance(\"DESede\")":0,
	"getInstance(\"CCM\")":0,
	"getInstance(\"DESedeWrap\")":0,
	"getInstance(\"ECIES\")":0,
	"getInstance(\"GCM\")":0,
	"getInstance(\"RC2\")":0,
	"getInstance(\"RC4\")":0,
	"getInstance(\"RC5\")":0,
	"getInstance(\"RSA\")":0,


}

permisosBuscados = []

listaPermisos = []
listaPublicidad = []
listaEncriptacion =[]

data =[]

diccionarioRiesgoPermisos={

	"READ_SMS": 0.4428,
	"RECEIVE_SMS": 0.42,
	"SEND_SMS": 0.3961,
	"WRITE_SMS": 0.1988,
	"SET_ALARM": 0.1443,
	"RECEIVE_WAP_PUSH": 0.1403,
	"READ_PHONE_STATE": 0.1140,
	"READ_EXTERNAL_STORAGE": 0.1044,
	"RESTART_PACKAGES": 0.0804,
	"SYSTEM_ALERT_WINDOW": 0.0711,
	"RECEIVE_BOOT_COMPLETED": 0.0668,
	"CHANGE_WIFI_STATE": 0.0630,
	"WAKE_LOCK": 0.0611,
	"DISABLE_KEYGUARD": 0.0562,
	"ACCESS_NETWORK_STATE": 0.0553,
	"WRITE_SETTINGS": 0.0551,
	"READ_CONTACTS": 0.0535,
	"RECEIVE_MMS": 0.0530,
	"WRITE_EXTERNAL_STORAGE": 0.0506,
	"EXPAND_STATUS_BAR": 0.0450,
	"WRITE_CONTACTS": 0.0444,
	"CHANGE_NETWORK_STATE": 0.0415,
	"INTERNET": 0.0413,
	"READ_HISTORY_BOOKMARKS": 0.0365,
	"CHANGE_CONFIGURATION": 0.0346,
	"PROCESS_OUTGOING_CALLS": 0.0344,
	"GET_PACKAGE_SIZE": 0.0339,
	"PERSISTENT_ACTIVITY": 0.0338,
	"ACCESS_WIFI_STATE": 0.0334,
	"READ_CALL_LOG": 0.0329,
	"CAMERA": 0.0309,
	"WRITE_HISTORY_BOOKMARKS":0.0287,
	"CALL_PHONE": 0.0273,
	"SET_WALLPAPER_HINTS": 0.0252,
	"GET_ACCOUNTS": 0.0249,
	"GET_TASKS": 0.0237,
	"WRITE_CALL_LOG": 0.0232,
	"ADD_SYSTEM_SERVICE": 0.0190,
	"ACCESS_FINE_LOCATION": 0.0182,
	"ACCESS_MOCK_LOCATION": 0.0168,

	"SumatoriaRiesgos": 3.2764
	
}


diccionarioRiesgoPublicidad = {

	"com.google.ads": 6.427786595,
	"com.flurry": 12.66634111,
	"com.inmobi": 7.935539006,
	"com.tapjoy": 7.447198144,
	"com.mobclix": 6.427786595,
	"com.chartboost": 3.967769503,
	"com.adwhirl": 5.808204126,
	"com.mopub": 9.186912465,
	"com.greystripe": 4.49273593,
	"com.jumptap": 6.9405445,
	"com.google.analytics": 12.66634111,
	"com.admob": -1,
	"com.burstly": 8.99157612,
	"com.sponsorpay": 7.447198144,
	"com.cauly": 2.948357954,
	"com.mobfox": 3.503845684,
	"com.vpon": 9.504334025,
	"com.appbrain": 2.948357954,
	"net.daum": 10.89305335,
	"com.admarvel": 10.05982176,
	"com.applovin": 7.972164571,
	"com.adfonic": 6.427786595,
	"com.mdotm": 11.15858869,
	"com.getjar": 7.911121963,
	"com.nexage": 2.948357954,
	"com.inneractive": 9.040410206,
	"com.pontiflex": -1,
	"com.zestadz": 1.26052985,
	"com.madhouse": -1,
	"com.smaato": 12.43132707,
	"net.youmi": 11.88499573,
	"de.madvertise": 2.328775485,
	"cn.domob": 8.698571603,
	"com.jirbo.adcolony": 2.804907826,
	"com.revmob": 7.447198144,
	"com.senddroid": 4.739958491,
	"com.airpush": 7.972164571,
	"com.tapit": 7.49603223,
	"com.medialets": -1,
	"mediba.ad": 3.885361983,
	"com.papaya": 6.427786595,
	"com.huntmads": -1,
	"com.rhythmnewmedia": 5.213038701,
	"com.tapfortap": 11.65303382,
	"com.adknowledge": -1,
	"net.metaps": 7.447198144,
	"com.wiyun": -1,
	"com.vdopia": 2.948357954,
	"com.waps": -1,
	"com.adwo": -1,
	"com.mobosquare": -1,
	"mobi.vserv": -1,
	"com.wooboo": -1,
	"com.everbadge": -1,
	"com.mt.airad": 5.560981565,
	"com.noqoush.adfalcon": 8.823708949,
	"com.moolah": 1.26052985,
	"com.kuguo": 7.959956049,
	"buzzcity": -1,
	"com.adsmogo": -1,
	"com.sellaring": -1,
	"com.startapp": 4.691124405,
	"com.admoda": -1,
	"com.mobpartner": 9.186912465,
	"com.quclix": -1,
	"com.ldevelop": -1,

	"SumatoriaRiesgosPublicidad": 329.7094372
	
}



def revisarManifest(folder,carpetaArchivosJava,MalWare):


	f=open(folder+'/AndroidManifest.xml')
	lines=f.readlines()

	
	for x in lines:

		if x.find('package="') != -1:


			i = x.find('package="') 

			i=i+9;

			packageName = x[i:]

			j = packageName.index('"')

			packageName = packageName[0:j]

			

			nombrePaquete=x

		Version="0"

		

		if x.find('VersionName="') != -1:
			

			r = x.find('VersionName="') 

			r=r+13;

			Version = x[r:]

			s = Version.index('"')

			Version = Version[0:s]
			Version_app= Version



		if x.find('<uses-permission android:name="android.permission.') != -1:
			
			k=x.find('<uses-permission android:name="android.permission.')

			k=k+50

			permissionName = x[k:]

			n = permissionName.index('"')

			permissionName = permissionName[0:n]

			if permissionName in diccionarioPermisos:
				if permissionName not in listaPermisos:
					listaPermisos.append(permissionName)


	print('Package Name: '+packageName)
	print("")

	acum = 0
	
	for x in listaPermisos:

		ubicacion = listaPermisos.index(x)

		
		diccionarioPermisos[x] = 1;

		if x in diccionarioRiesgoPermisos:
			#print (x +'    '+str(diccionarioRiesgoPermisos.get(x)))
			acum = acum + diccionarioRiesgoPermisos.get(x)

	#print('\n' + str(acum))

	riesgoPermisos = (acum * 100)/diccionarioRiesgoPermisos.get("SumatoriaRiesgos")
	
	#print(riesgoPermisos)

	os.chdir(carpetaPrincipal)
	

	archivo=open('ResultadosApp.arff' ,'a')
	

	archivo.write(packageName+',')
	archivo.write(Version + ',')


	contador = 1

	for n in diccionarioPermisos:

		verificador = diccionarioPermisos.get(n)

		if(verificador==0):
			archivo.write('false,')
			
		
		else:
			archivo.write('true,')

		contador=contador+1

	for x in listaPermisos:

		ubicacion = listaPermisos.index(x)

		
		diccionarioPermisos[x] = 0;

	listaPermisos.clear()
			

	archivo.close()	


	os.chdir(carpetaPrincipal)

	intento=0

	revisarJava(carpetaArchivosJava,packageName,Version,MalWare,riesgoPermisos,intento)

	
def escribirPrimeraParte():

	archivo=open('ResultadosApp.arff' ,'w')

	archivo.write('\n')
	archivo.write('@Relation AppResults')
	archivo.write('\n')
	archivo.write('\n')
	archivo.write('@ATTRIBUTE packageName string\n')
	archivo.write('@ATTRIBUTE Version string\n')

	for n in diccionarioPermisos:
		archivo.write('@ATTRIBUTE '+ n + ' {true,false}\n')

	for n in diccionarioPublicidad:
		archivo.write('@ATTRIBUTE '+ n + ' {true,false}\n')

	for n in diccionarioEncriptacion:
	
		k=13

		crypto=n[13:]

		n = crypto.find('"')

		crypto = crypto[0:n]

		archivo.write('@ATTRIBUTE '+ crypto + ' {true,false}\n')

	archivo.write('@ATTRIBUTE class {malware,normal}\n')
	archivo.write('\n')
	archivo.write('\n')
	archivo.write('@data')
	archivo.write('\n')
	archivo.write('\n')
	

   	


def ficherosEnDir(ruta):
    listado = []
    for raiz, subcarpetas, ficheros in os.walk(ruta):
        for fichero in ficheros:
            listado.append(os.path.join(raiz,fichero))
    return listado



def revisarJava(folder,paquete,Version,MalWare,riesgoPermisos,intento):

	intento = intento +1

	print(intento)

	listaArchivos=ficherosEnDir(folder)

	for x in listaArchivos:
		javaFile=open(x,'r')
		lines=javaFile.readlines()

		for y in diccionarioPublicidad:

			for z in lines:
				if z.find(y) != -1:
					if y not in listaPublicidad:
						listaPublicidad.append(y)
		
		for o in diccionarioEncriptacion:
			for q in lines:
				if q.find(o) !=-1:
					if o not in listaEncriptacion:
						listaEncriptacion.append(o)


		javaFile.close()

	riesgoPublicidad=0

	riesgoEncriptacion=0

	for g in listaPublicidad:

		ubicacion = listaPublicidad.index(g)

		if diccionarioRiesgoPublicidad.get(g)==-1:
			riesgoPublicidad=-1
			break

		else:

			riesgoPublicidad=riesgoPublicidad+diccionarioRiesgoPublicidad.get(g)

			riesgoPublicidad = (riesgoPublicidad * 100)/diccionarioRiesgoPublicidad.get("SumatoriaRiesgosPublicidad")

		diccionarioPublicidad[g] = 1;

	

	
	if len(listaEncriptacion)!=0:

		riesgoEncriptacion=1
	

	for h in listaEncriptacion:
		location = listaEncriptacion.index(h)

		diccionarioEncriptacion[h] = 1;	

	if (intento==1):

		archivo=open('ResultadosApp.arff' ,'a')

		#for f in diccionarioPublicidad:
			#print(f + "    "+ str(diccionarioPublicidad.get(f)))


		for n in diccionarioPublicidad:

			verificador = diccionarioPublicidad.get(n)

			if(verificador==0):
				archivo.write('false,')
			
			if(verificador==1):			
				archivo.write('true,')
				
			diccionarioPublicidad[n] = 0;

		listaPublicidad.clear()


		for n in diccionarioEncriptacion:

			verificador = diccionarioEncriptacion.get(n)

			if(verificador==0):
				archivo.write('false,')
			
			else:
				archivo.write('true,')

		for x in listaEncriptacion:

			ubicacion = listaEncriptacion.index(x)

			diccionarioEncriptacion[x] = 0;

		listaEncriptacion.clear()

		if MalWare:

			archivo.write("malware")

		else:
			archivo.write("normal")

		archivo.write('\n')

		archivo.close()

	if riesgoPublicidad == -1:
		riesgoTotal = riesgoPermisos

	else:

		if riesgoPublicidad!=0:
			riesgoTotal = (riesgoPermisos + riesgoPublicidad)/2

		else:
			riesgoTotal=riesgoPermisos

	try:
		url = 'http://adriangoicovic.16mb.com/database/post_all_apps.php'

		values = {'nombre': paquete,
		  		  'riesgoPermisos': riesgoPermisos,
		 		  'riesgoEncriptacion': riesgoEncriptacion,
				  'riesgoPublicidad': riesgoPublicidad,
			 	  'riesgoTotal': riesgoTotal
			 	  }

		data = urllib.parse.urlencode(values)
		data = data.encode('utf-8') 
		req = urllib.request.Request(url, data)
		response = urllib.request.urlopen(req)
		the_page = response.read()
		
	except:
		revisarJava(folder,paquete,Version,MalWare,riesgoPermisos,intento)

	


def validarCarpetas():

	output = carpetaPrincipal+"/output"
	output_Malware = carpetaPrincipal+"/output-Malware"
		
	
	try:
	    os.stat(output)
	except:
	    os.mkdir(output) 

	try:
	    os.stat(output_Malware)
	except:
	    os.mkdir(output_Malware) 
	
def ARFFvalido():

	output = carpetaPrincipal+"/ResultadosApp.arff"

	try:
		os.stat(output)

	except:

		escribirPrimeraParte()

def validarExistencia(nombreArchivo):

	output = carpetaPrincipal+"/output/"+nombreArchivo

	existe = True

	try:
		os.stat(output)

		return existe

	except:

		existe=False

		return existe

def validarExistenciaMalware(nombreArchivo):

	output = carpetaPrincipal+"/output-Malware/"+nombreArchivo

	existe=True
	
	try:
		os.stat(output)

		return existe

	except:
		existe=False
		return existe





def main():

	global MalWare

	validarCarpetas()

	ARFFvalido()

	MalWare = False

	ficheros = os.listdir(carpetaAPK)

	ficherosMalware = os.listdir(carpetaAPKmalware)

	matches = []
	for root, dirnames, filenames in os.walk(carpetaAPK):
	    for filename in fnmatch.filter(filenames, '*.apk'):
	        matches.append(os.path.join(root, filename))
	        #print(filename)

	matchesMalware = []

	for root, dirnames, filenames in os.walk(carpetaAPKmalware):
		for filename in fnmatch.filter(filenames,'*.apk'):
			matchesMalware.append(os.path.join(root, filename))
	

	#for h in diccionarioRiesgoPublicidad:
		#print(h +"   "+str(diccionarioRiesgoPublicidad.get(h)))
	

	if not ficheros:

		print("No hay normales")

	else:

		for x in matches:

				
			nombreArchivo=os.path.splitext(os.path.basename(x))[0]

			existe = validarExistencia(nombreArchivo)

			if existe==False:
			
				#python3 apk2java.py d /home/adrian/Escritorio/APK/com.whatsapp.apk -o hola --java
				call('python3 decompilador.py d '+x+' -o output/ ',shell=True)
				call('rm -r -f output/'+nombreArchivo+'-new.apk',shell=True)
				call('rm -r -f output/'+nombreArchivo+'.jar',shell=True)

				print ("*********************************************")
				print ("**              Analizando                 **")
				print ("*********************************************")
			
				carpetaArchivosJava=carpetaPrincipal+'/output/'+nombreArchivo+'/src'

				revisarManifest(carpetaPrincipal+'/output/'+nombreArchivo,carpetaArchivosJava,MalWare)

				print('')
				print('Listo')
				print('')

	if not ficherosMalware:
		print("No hay MalWare")

	
	else:

		MalWare = True;

		for y in matchesMalware:


			nombreArchivo=os.path.splitext(os.path.basename(y))[0]

			existe = validarExistenciaMalware(nombreArchivo)

			if(existe==False):


				call('python3 decompilador.py d '+y+' -o output-Malware',shell=True)
				call('rm -r -f output-Malware/'+nombreArchivo+'-new.apk',shell=True)
				call('rm -r -f output-Malware/'+nombreArchivo+'.jar',shell=True)

				print ("*********************************************")
				print ("**         Analizando - (MalWare)          **")
				print ("*********************************************")
				
				carpetaArchivosJava=carpetaPrincipal+'/output-Malware/'+nombreArchivo+'/src'

				revisarManifest(carpetaPrincipal+'/output-Malware/'+nombreArchivo,carpetaArchivosJava,MalWare)

			

				print('')
				print('Listo')
				print('')

if __name__=="__main__":
  main()