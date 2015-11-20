import sys, os, string
import urllib.request
import zipfile
from subprocess import call
from optparse import OptionParser
from os import listdir
import os

apk_file=''
apk_folder=''
project_name=''
cwd=os.path.dirname(os.path.abspath(__file__))
home=os.path.dirname(os.path.realpath(sys.argv[0]))
outdir=os.path.dirname(os.path.realpath(sys.argv[1]))+"/"

def apktool():
  print ("*********************************************")
  print ("**   Extrayendo archivos manifest y .dex   **")
  print ("*********************************************")

  call(home+'/apktool_200rc3.jar d '+apk_file+' -o '+outdir+"/"+project_name+' -sf',shell=True)
  os.system('mv %s %s' % (outdir+project_name+'/classes.dex', outdir+"/"+project_name+'/original/'))
  
  print('')
  print('Listo')
  print('')

def dex2jar():
  print ("*********************************************")
  print ("**        Convertiendo .apk a .jar         **")
  print ("*********************************************")
  
  call(home+'/dex2jar-0.0.9.15/d2j-dex2jar.sh -f -o '+outdir+"/"+project_name+'.jar '+apk_file, shell=True)
  call(home+'/dex2jar-0.0.9.15/d2j-asm-verify.sh '+outdir+"/"+project_name+'.jar',shell=True)

  print('')
  print('Listo')
  print('')

def procyon():
  print ("*********************************************")
  print ("**       Decompilando archivo .jar         **")
  print ("*********************************************")
      
  call('java -jar '+home+'/procyon-decompiler-0.5.30.jar -jar '+outdir+project_name+'.jar -o '+outdir+"/"+project_name+'/src/',shell=True)
    
  print('')
  print('Listo')
  print('')


def main():
  global apk_folder,apk_file,project_name,home,outdir
  usage = "usage: %prog action file [options]"
  parser = OptionParser(usage=usage)
  parser.add_option("-o", dest="outdir", default=cwd+"/")
  (options, args) = parser.parse_args()
      
  home = cwd+"/herramientas"
  outdir = options.outdir
  
  if len(args)==2:
    if args[0] == 'd':
      if os.path.isfile(args[1]) and os.path.splitext(args[1])[-1].lower() == '.apk':
        apk_file = args[1].replace(' ','')
        project_name = os.path.splitext(os.path.basename(args[1]))[0].lower()
        
        if not os.path.exists(outdir):
          os.makedirs(outdir)
        
        call("cp "+apk_file+" "+outdir+"/"+project_name+"-new.apk",shell=True)     
        
        apktool()
          
        dex2jar()
        procyon()         
      
            
      else:
        print ("[ ERROR ] Debe selecionar un archivo .apk válido")
        exit(1)
    
  else:
    print ("[ ERROR ] En el ingreso de parametros")

if __name__=="__main__":
  main()
