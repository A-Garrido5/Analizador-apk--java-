// 
// Decompiled by Procyon v0.5.30
// 

package com.example.adrin.detectorappsinseguras;

import android.view.MenuItem;
import android.view.Menu;
import android.graphics.Bitmap;
import android.net.Uri;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBarActivity;

public class Descripcion_app extends ActionBarActivity
{
    public ColorDrawable getColor(final String s) {
        final TextView textView = (TextView)this.findViewById(2131492945);
        final TextView textView2 = (TextView)this.findViewById(2131492946);
        if (s.compareTo("-") != 0) {
            final int int1 = Integer.parseInt(s.substring(0, -1 + s.length()));
            if (int1 < 40 && int1 != 0) {
                return new ColorDrawable(this.getResources().getColor(2131427405));
            }
            if (int1 >= 40 && int1 < 75) {
                return new ColorDrawable(this.getResources().getColor(2131427334));
            }
            if (int1 > 75) {
                return new ColorDrawable(this.getResources().getColor(2131427398));
            }
        }
        else {
            textView.setText((CharSequence)"Advertencia:");
            textView2.setText((CharSequence)"No tenemos registro de esta aplicaci\u00f3n");
        }
        return new ColorDrawable(this.getResources().getColor(2131427414));
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130968601);
        final byte[] byteArray = this.getIntent().getExtras().getByteArray("icono");
        final String string = this.getIntent().getExtras().getString("nombre");
        final String string2 = this.getIntent().getExtras().getString("riesgoPermisos");
        final String string3 = this.getIntent().getExtras().getString("riesgoEncriptacion");
        final String string4 = this.getIntent().getExtras().getString("riesgoPublicidad");
        final String string5 = this.getIntent().getExtras().getString("riesgoTotal");
        final String string6 = this.getIntent().getExtras().getString("nombrePaquete");
        final RelativeLayout relativeLayout = (RelativeLayout)this.findViewById(2131492934);
        if (string5 != "-") {
            relativeLayout.setBackground((Drawable)this.getColor(string5));
        }
        final TextView textView = (TextView)this.findViewById(2131492936);
        final TextView textView2 = (TextView)this.findViewById(2131492938);
        final TextView textView3 = (TextView)this.findViewById(2131492940);
        final TextView textView4 = (TextView)this.findViewById(2131492942);
        final TextView textView5 = (TextView)this.findViewById(2131492944);
        textView.setText((CharSequence)string);
        textView2.setText((CharSequence)string2);
        textView3.setText((CharSequence)string3);
        textView4.setText((CharSequence)string4);
        textView5.setText((CharSequence)string5);
        final Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        ((ImageView)this.findViewById(2131492935)).setImageBitmap(decodeByteArray);
        new BitmapDrawable(this.getResources(), decodeByteArray);
        this.getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.getSupportActionBar().setHomeButtonEnabled(true);
        this.getSupportActionBar().setTitle("Resultado para " + string);
        this.getSupportActionBar().setBackgroundDrawable((Drawable)new ColorDrawable(this.getResources().getColor(2131427362)));
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((Button)this.findViewById(2131492947)).setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                final Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + string6));
                Descripcion_app.this.startActivity(intent);
            }
        });
    }
    
    public boolean onCreateOptionsMenu(final Menu menu) {
        this.getMenuInflater().inflate(2131558403, menu);
        return true;
    }
    
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        menuItem.getItemId();
        this.onBackPressed();
        return super.onOptionsItemSelected(menuItem);
    }
}
