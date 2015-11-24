// 
// Decompiled by Procyon v0.5.30
// 

package com.example.adrin.detectorappsinseguras;

import android.view.MenuItem;
import android.view.Menu;
import android.widget.Toast;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import android.widget.Button;
import android.support.v7.app.ActionBarActivity;

public class Bienvenida extends ActionBarActivity
{
    Button boton_analizar;
    Button boton_consejos;
    boolean checkConection;
    
    public Bienvenida() {
        this.checkConection = false;
    }
    
    public boolean isOnline() {
        final NetworkInfo activeNetworkInfo = ((ConnectivityManager)this.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130968599);
        this.getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.getSupportActionBar().setIcon(2130837578);
        this.getSupportActionBar().setBackgroundDrawable((Drawable)new ColorDrawable(this.getResources().getColor(2131427362)));
        (this.boton_analizar = (Button)this.findViewById(2131492931)).setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                Bienvenida.this.checkConection = Bienvenida.this.isOnline();
                if (Bienvenida.this.checkConection) {
                    Bienvenida.this.startActivity(new Intent((Context)Bienvenida.this, (Class)Lista.class));
                    return;
                }
                Toast.makeText((Context)Bienvenida.this, (CharSequence)"No hay conexi\u00f3n a Internet", 0).show();
            }
        });
        (this.boton_consejos = (Button)this.findViewById(2131492932)).setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                Bienvenida.this.startActivity(new Intent((Context)Bienvenida.this, (Class)Consejos.class));
            }
        });
    }
    
    public boolean onCreateOptionsMenu(final Menu menu) {
        this.getMenuInflater().inflate(2131558401, menu);
        return true;
    }
    
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        if (menuItem.getItemId() == 2131492965) {
            this.startActivity(new Intent((Context)this, (Class)Information.class));
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
