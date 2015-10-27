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

permisosBuscados = []

listaPermisos = []

def obtenerListaPermisos():

	print(len(diccionarioPermisos))



def revisarManifest(folder):

	#archi=open(folder+'/AndroidManifest.xml','r')

	f=open(folder+'/AndroidManifest.xml')
	lines=f.readlines()

	
	for x in lines:

		if x.find('package="') != -1:
			#indice = x.index('package="')

			i = x.find('package="') # i now contains the value 18

			i=i+9;

			packageName = x[i:]

			j = packageName.index('"')

			packageName = packageName[0:j]

			

			nombrePaquete=x

		if x.find('VersionName="') != -1:
			#indice = x.index('package="')

			r = x.find('VersionName="') # i now contains the value 18

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
		#print(diccionarioPermisos.get(x))

		#print(str(ubicacion)+'.- '+x)



	#for x in diccionarioPermisos:
   		#print(x, ":", diccionarioPermisos[x])

	
	os.chdir("output_Permisos")			
	archivo=open('outputPermisos - '+packageName+'.txt' ,'w')
	archivo.write('% Nombre del paquete = '+packageName)
	archivo.write('\n')
	archivo.write('\n')
	archivo.write('% Version = '+ Version)
	archivo.write('\n')
	archivo.write('\n')
	archivo.write('@Relation Permissions')
	archivo.write('\n')
	archivo.write('\n')

	for n in diccionarioPermisos:
		archivo.write('@ATTRIBUTE '+ n + ' {true,false}\n')

	archivo.write('\n')
	archivo.write('\n')
	archivo.write('@data')
	archivo.write('\n')
	archivo.write('\n')

	for n in diccionarioPermisos:

		verificador = diccionarioPermisos.get(n)

		if(verificador==0):
			archivo.write('false\n')
		
		else:
			archivo.write('true\n')


	os.chdir(carpetaPrincipal)

   	

	
    #linea=archi.readline()
    
    #archi.close()
	#print(folder+'/AndroidManifest.xml')



def analizar(carpeta,filename):
	

	
	
	archivos=os.listdir(carpeta)
	#print(os.path.abspath(archivos[0,]))
	#print(archivos)
	os.chdir(carpetaPrincipal)






def main():

	obtenerListaPermisos()

	ficheros = os.listdir(carpetaAPK)

	for x in ficheros:
		#print(len(ficheros))

		nombreArchivo=os.path.splitext(x)[0]
		
		#python3 apk2java.py d /home/adrian/Escritorio/APK/com.whatsapp.apk -o hola --java
		call('python3 apk2java.py d '+carpetaAPK +'/'+ x+' -o output/ --java',shell=True)
		call('rm -r -f output/'+nombreArchivo+'-new.apk',shell=True)
		call('rm -r -f output/'+nombreArchivo+'.jar',shell=True)

		print ("*********************************************")
		print ("**              Analizing                  **")
		print ("*********************************************")
		
		carpetaArchivosJava=carpetaPrincipal+'/output/'+nombreArchivo+'/src'

		#print (carpetaArchivosJava)
		#analizar("output/"+nombreArchivo+"/src",nombreArchivo)

		revisarManifest(carpetaPrincipal+'/output/'+nombreArchivo)

if __name__=="__main__":
  main()