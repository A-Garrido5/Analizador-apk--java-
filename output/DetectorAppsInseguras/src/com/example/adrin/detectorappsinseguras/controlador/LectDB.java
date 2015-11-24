// 
// Decompiled by Procyon v0.5.30
// 

package com.example.adrin.detectorappsinseguras.controlador;

import java.net.URLConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import org.json.JSONException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import android.content.Context;
import org.json.JSONObject;
import android.os.AsyncTask;

public class LectDB extends AsyncTask<Integer, Integer, Boolean>
{
    public static final String URL_DB = "http://clabu.16mb.com/clabuconnect/get_all_apps.php";
    private int conexion;
    private Boolean estadoTerminado;
    private JSONObject json;
    private Context mcontext;
    
    public LectDB(final Context mcontext) {
        this.mcontext = mcontext;
    }
    
    protected Boolean doInBackground(final Integer... array) {
        this.estadoTerminado = false;
        if (ConnectionDetected.isNetworkAvailable(this.mcontext) == 0) {
            return false;
        }
        Label_0039: {
            if (ConnectionDetected.isNetworkAvailable(this.mcontext) != -1) {
                break Label_0039;
            }
            this.conexion = -1;
            try {
                final URLConnection openConnection = new URL("http://clabu.16mb.com/clabuconnect/get_all_apps.php").openConnection();
                openConnection.connect();
                final String line = new BufferedReader(new InputStreamReader(openConnection.getInputStream())).readLine();
                System.out.println("Linea leida: " + line);
                try {
                    this.json = new JSONObject(line);
                    this.estadoTerminado = true;
                    System.out.println("fin.");
                    return this.estadoTerminado;
                }
                catch (JSONException ex) {
                    System.out.println("Error al crear el json: " + ex);
                }
            }
            catch (MalformedURLException ex2) {
                System.out.println("Error al tomar el URL: " + ex2.getMessage());
                ex2.printStackTrace();
            }
            catch (IOException ex3) {
                System.out.println("al abrir la conexion: " + ex3.getMessage());
                ex3.printStackTrace();
            }
            finally {
                System.out.println("fin.");
            }
        }
    }
    
    public int getConexion() {
        return this.conexion;
    }
    
    public JSONObject getDB() {
        return this.json;
    }
    
    public Boolean getEstadoTerminado() {
        return this.estadoTerminado;
    }
    
    protected void onPostExecute(final Boolean b) {
        if (b) {
            System.out.println("DB cargada OK");
        }
    }
}
