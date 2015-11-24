// 
// Decompiled by Procyon v0.5.30
// 

package com.example.adrin.detectorappsinseguras;

import android.graphics.Bitmap;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.ByteArrayOutputStream;
import android.graphics.drawable.BitmapDrawable;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.Toast;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.ProgressBar;
import java.util.List;
import android.content.pm.PackageInfo;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;
import java.util.HashMap;
import android.widget.LinearLayout;
import java.util.ArrayList;
import android.os.AsyncTask;
import android.view.MenuItem;
import android.view.Menu;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.content.Context;
import android.widget.ListView;
import com.example.adrin.detectorappsinseguras.controlador.LectDB;
import android.support.v7.app.ActionBarActivity;

public class Lista extends ActionBarActivity
{
    Adaptador_Lista adaptador;
    private int cambio;
    private LectDB lecDBExterna;
    ListView listaApps;
    private Context mcontext;
    
    public Lista() {
        this.mcontext = (Context)this;
        this.cambio = 0;
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130968603);
        this.mcontext = (Context)this;
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.getSupportActionBar().setBackgroundDrawable((Drawable)new ColorDrawable(this.getResources().getColor(2131427362)));
        this.listaApps = (ListView)this.findViewById(2131492951);
        (this.lecDBExterna = new LectDB((Context)this)).execute((Object[])new Integer[0]);
        new CargandoProgramas(this.lecDBExterna).execute((Object[])new Void[0]);
    }
    
    public boolean onCreateOptionsMenu(final Menu menu) {
        this.getMenuInflater().inflate(2131558408, menu);
        return true;
    }
    
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        menuItem.getItemId();
        this.onBackPressed();
        return super.onOptionsItemSelected(menuItem);
    }
    
    private class CargandoProgramas extends AsyncTask<Void, Integer, Boolean>
    {
        private ArrayList<aplicacion> apps;
        private LectDB dbLecturaExterna;
        private ArrayList<Drawable> imgProgramas;
        private LinearLayout linearLayotGeneral;
        private ArrayList<String> packetProgramasLista;
        private ArrayList<String> programasLista;
        private ArrayList<String> riesgos;
        
        public CargandoProgramas(final LectDB dbLecturaExterna) {
            this.programasLista = new ArrayList<String>();
            this.packetProgramasLista = new ArrayList<String>();
            this.apps = new ArrayList<aplicacion>();
            this.imgProgramas = new ArrayList<Drawable>();
            this.riesgos = new ArrayList<String>();
            this.dbLecturaExterna = dbLecturaExterna;
        }
        
        protected Boolean doInBackground(final Void... array) {
            this.getInstalledApps();
            while (!this.dbLecturaExterna.getEstadoTerminado()) {
                System.out.println("esperando......");
                try {
                    Thread.sleep(100L);
                }
                catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            HashMap<String, Integer> hashMap = null;
            HashMap<String, Integer> hashMap2 = null;
            HashMap<String, Integer> hashMap3 = null;
            HashMap<String, Integer> hashMap4 = null;
            Label_0393: {
                while (true) {
                    final JSONObject db = this.dbLecturaExterna.getDB();
                    while (true) {
                        int n2 = 0;
                        Label_0387: {
                            try {
                                final JSONArray jsonArray = db.getJSONArray("nombre");
                                hashMap = new HashMap<String, Integer>();
                                hashMap2 = new HashMap<String, Integer>();
                                hashMap3 = new HashMap<String, Integer>();
                                hashMap4 = new HashMap<String, Integer>();
                                Integer n = 0;
                                n2 = 0;
                                if (n2 < jsonArray.length()) {
                                    final JSONObject optJSONObject = jsonArray.optJSONObject(n2);
                                    final Iterator keys = optJSONObject.keys();
                                    String string = "";
                                    while (keys.hasNext()) {
                                        final String s = keys.next();
                                        if (s.equals("riesgoPermisos")) {
                                            n = Integer.parseInt(optJSONObject.getString(s));
                                        }
                                        if (s.equals("Name")) {
                                            string += optJSONObject.getString(s);
                                            System.out.println("Nombre: " + string);
                                        }
                                        if (s.equals("riesgoPublicidad")) {
                                            hashMap3.put(string, Integer.parseInt(optJSONObject.getString(s)));
                                        }
                                        if (s.equals("riesgoEncriptacion")) {
                                            hashMap4.put(string, Integer.parseInt(optJSONObject.getString(s)));
                                            hashMap2.put(string, n);
                                        }
                                        if (s.equals("riesgoTotal") && string != null) {
                                            hashMap.put(string, Integer.parseInt(optJSONObject.getString(s)));
                                        }
                                    }
                                    break Label_0387;
                                }
                                break Label_0393;
                            }
                            catch (JSONException ex2) {
                                System.out.println("Fallo la conversaion de json..." + ex2);
                            }
                            break;
                        }
                        ++n2;
                        continue;
                    }
                }
                return true;
            }
            for (int i = 0; i < this.packetProgramasLista.size(); ++i) {
                if (hashMap.containsKey(this.packetProgramasLista.get(i))) {
                    final String s2 = this.programasLista.get(i);
                    final String string2 = hashMap.get(this.packetProgramasLista.get(i)) + "%";
                    final String s3 = this.packetProgramasLista.get(i);
                    final Drawable drawable = this.imgProgramas.get(i);
                    this.apps.get(i).riesgoPermisos = String.valueOf(hashMap2.get(this.packetProgramasLista.get(i)) + "%");
                    this.apps.get(i).riesgoPublicidad = String.valueOf(hashMap3.get(this.packetProgramasLista.get(i)) + "%");
                    this.apps.get(i).riesgoEncriptacion = String.valueOf(hashMap4.get(this.packetProgramasLista.get(i)) + "%");
                    this.packetProgramasLista.remove(i);
                    this.programasLista.remove(i);
                    this.imgProgramas.remove(i);
                    this.packetProgramasLista.add(0, s3);
                    this.programasLista.add(0, s2);
                    this.imgProgramas.add(0, drawable);
                    this.apps.get(i).riesgo = string2;
                    this.apps.get(i).colorDrawable = this.apps.get(i).getColor(this.apps.get(i).riesgo);
                }
                else {
                    this.apps.get(i).riesgo = "-";
                }
            }
            return true;
        }
        
        public void getInstalledApps() {
            final List installedPackages = Lista.this.getPackageManager().getInstalledPackages(0);
            for (int i = 0; i < installedPackages.size(); ++i) {
                final PackageInfo packageInfo = installedPackages.get(i);
                int n;
                if ((0x1 & packageInfo.applicationInfo.flags) != 0x0) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if (n != 1) {
                    final String packageName = packageInfo.applicationInfo.packageName;
                    final String string = packageInfo.applicationInfo.loadLabel(Lista.this.getPackageManager()).toString();
                    final Drawable loadIcon = packageInfo.applicationInfo.loadIcon(Lista.this.getPackageManager());
                    if (!packageName.equals("com.example.adrin.detectorappsinseguras")) {
                        this.apps.add(new aplicacion(string, "-", loadIcon, packageName, "-", "-", "-", Lista.this.mcontext));
                        this.imgProgramas.add(loadIcon);
                        this.packetProgramasLista.add(packageName);
                        this.programasLista.add(string);
                    }
                }
            }
        }
        
        protected void onPostExecute(final Boolean b) {
            if (b) {
                Lista.this.listaApps.setDrawSelectorOnTop(true);
                ((ProgressBar)Lista.this.findViewById(2131492950)).setVisibility(8);
                ((TextView)Lista.this.findViewById(2131492952)).setVisibility(8);
                Lista.this.adaptador = new Adaptador_Lista((Context)Lista.this, this.apps);
                Lista.this.listaApps.setAdapter((ListAdapter)Lista.this.adaptador);
                System.out.println("Estamos listos para mostrar los programas.");
                Toast.makeText((Context)Lista.this, (CharSequence)"An\u00e1lisis realizado exitosamente", 1).show();
                Lista.this.listaApps.setOnItemClickListener((AdapterView$OnItemClickListener)new AdapterView$OnItemClickListener() {
                    public void onItemClick(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
                        final Intent intent = new Intent((Context)Lista.this, (Class)Descripcion_app.class);
                        intent.putExtra("nombre", CargandoProgramas.this.apps.get(n).nombre);
                        intent.putExtra("riesgoTotal", CargandoProgramas.this.apps.get(n).riesgo);
                        intent.putExtra("riesgoPermisos", CargandoProgramas.this.apps.get(n).riesgoPermisos);
                        intent.putExtra("riesgoEncriptacion", CargandoProgramas.this.apps.get(n).riesgoEncriptacion);
                        intent.putExtra("riesgoPublicidad", CargandoProgramas.this.apps.get(n).riesgoPublicidad);
                        intent.putExtra("nombrePaquete", CargandoProgramas.this.apps.get(n).paquete);
                        final Bitmap bitmap = ((BitmapDrawable)CargandoProgramas.this.apps.get(n).icono).getBitmap();
                        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmap.compress(Bitmap$CompressFormat.PNG, 100, (OutputStream)byteArrayOutputStream);
                        intent.putExtra("icono", byteArrayOutputStream.toByteArray());
                        Lista.this.startActivity(intent);
                    }
                });
                return;
            }
            System.out.println("Error");
        }
    }
}
