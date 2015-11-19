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

permisosBuscados = []

listaPermisos = []
listaPublicidad = []



def revisarManifest(folder,carpetaArchivosJava):

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

			#print(permissionName)


			if permissionName not in listaPermisos:
				listaPermisos.append(permissionName)


	print('Package Name: '+packageName)
	print("")
	
	for x in listaPermisos:

		ubicacion = listaPermisos.index(x)

		
		diccionarioPermisos[x] = 1;

	
	os.chdir("output_Permisos")		

	archivo=open('outputPermisos.txt' ,'a')

	

	archivo.write(packageName+',')
	archivo.write(Version + ',')

	for n in diccionarioPermisos:

		verificador = diccionarioPermisos.get(n)

		if(verificador==0):
			archivo.write('false,')
		
		else:
			archivo.write('true,')

	archivo.write('\n')

	archivo.close()	


	os.chdir(carpetaPrincipal)

	revisarJava(carpetaArchivosJava,packageName,Version)

   	


def ficherosEnDir(ruta):
    listado = []
    for raiz, subcarpetas, ficheros in os.walk(ruta):
        for fichero in ficheros:
            listado.append(os.path.join(raiz,fichero))
    return listado
	

def escribirPrimeraParte():


	os.chdir("output_Permisos")		

	archivo=open('outputPermisos.txt' ,'w')

	archivo.write('\n')
	archivo.write('@Relation Permissions')
	archivo.write('\n')
	archivo.write('\n')
	archivo.write('@ATTRIBUTE packageName string\n')
	archivo.write('@ATTRIBUTE Version string\n')
	

	for n in diccionarioPermisos:
		archivo.write('@ATTRIBUTE '+ n + ' {true,false}\n')

	archivo.write('\n')
	archivo.write('\n')
	archivo.write('@data')
	archivo.write('\n')
	archivo.write('\n')

	os.chdir(carpetaPrincipal)


	os.chdir("output_Publicidad")			
	archivo2=open('outputPublicidad.txt' ,'w')
	
	archivo2.write('\n')
	archivo2.write('@Relation Publicity')
	archivo2.write('\n')
	archivo2.write('\n')

	archivo2.write('@ATTRIBUTE packageName string\n')
	archivo2.write('@ATTRIBUTE Version string\n')

	for n in diccionarioPublicidad:
		archivo2.write('@ATTRIBUTE '+ n + ' {true,false}\n')

	archivo2.write('\n')
	archivo2.write('\n')
	archivo2.write('@data')
	archivo2.write('\n')

	os.chdir(carpetaPrincipal)


def revisarJava(folder,paquete,Version):

	listaArchivos=ficherosEnDir(folder)

	for x in listaArchivos:
		javaFile=open(x,'r')
		lines=javaFile.readlines()

		for y in diccionarioPublicidad:

			for z in lines:
				if z.find(y) != -1:
					if y not in listaPublicidad:
						listaPublicidad.append(y)
					break;

	for g in listaPublicidad:
		ubicacion = listaPublicidad.index(g)

		diccionarioPublicidad[g] = 1;



	#for q in diccionarioPublicidad:
		#print(q + diccionarioPublicidad.get(q)S)

	javaFile.close()

	#print(diccionarioPublicidad)
		#print(x)

	os.chdir("output_Publicidad")			
	archivo=open('outputPublicidad.txt' ,'a')


	archivo.write('\n')

	archivo.write(paquete+',')
	archivo.write(Version + ',')

	for n in diccionarioPublicidad:

		verificador = diccionarioPublicidad.get(n)

		if(verificador==0):
			archivo.write('false,')
		
		else:
			archivo.write('true,')

	archivo.close()

	os.chdir(carpetaPrincipal)







def main():


	escribirPrimeraParte()

	ficheros = os.listdir(carpetaAPK)

	for x in ficheros:
		
		nombreArchivo=os.path.splitext(x)[0]
		
		#python3 apk2java.py d /home/adrian/Escritorio/APK/com.whatsapp.apk -o hola --java
		call('python3 apk2java.py d '+carpetaAPK +'/'+ x+' -o output/ --java',shell=True)
		call('rm -r -f output/'+nombreArchivo+'-new.apk',shell=True)
		call('rm -r -f output/'+nombreArchivo+'.jar',shell=True)

		print ("*********************************************")
		print ("**              Analizando                 **")
		print ("*********************************************")
		
		carpetaArchivosJava=carpetaPrincipal+'/output/'+nombreArchivo+'/src'

		revisarManifest(carpetaPrincipal+'/output/'+nombreArchivo,carpetaArchivosJava)

	print('\n\nListo')

if __name__=="__main__":
  main()