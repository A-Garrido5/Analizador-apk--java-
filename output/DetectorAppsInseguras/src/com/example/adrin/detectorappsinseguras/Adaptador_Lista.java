// 
// Decompiled by Procyon v0.5.30
// 

package com.example.adrin.detectorappsinseguras;

import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.util.HashMap;
import android.content.Context;
import java.util.ArrayList;
import android.widget.BaseAdapter;

public class Adaptador_Lista extends BaseAdapter
{
    ArrayList<aplicacion> apps;
    Context ctx;
    String nombre_app;
    
    public Adaptador_Lista(final Context ctx, final ArrayList<aplicacion> apps) {
        this.apps = apps;
        this.ctx = ctx;
    }
    
    public int getCount() {
        return this.apps.size();
    }
    
    public Object getItem(final int n) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("risk", this.apps.get(n).riesgo);
        hashMap.put("name", this.apps.get(n).nombre);
        hashMap.put("icon", (String)this.apps.get(n).icono);
        return hashMap;
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, View inflate, final ViewGroup viewGroup) {
        final LayoutInflater layoutInflater = (LayoutInflater)this.ctx.getSystemService("layout_inflater");
        if (inflate == null) {
            inflate = layoutInflater.inflate(2130968608, viewGroup, false);
        }
        final ImageView imageView = (ImageView)inflate.findViewById(2131492961);
        final TextView textView = (TextView)inflate.findViewById(2131492962);
        final TextView textView2 = (TextView)inflate.findViewById(2131492963);
        final RelativeLayout relativeLayout = (RelativeLayout)inflate.findViewById(2131492960);
        final HashMap hashMap = (HashMap)this.getItem(n);
        textView.setText((CharSequence)hashMap.get("name"));
        textView2.setText((CharSequence)hashMap.get("risk"));
        ((RelativeLayout)inflate.findViewById(2131492960)).setBackground((Drawable)this.apps.get(n).colorDrawable);
        imageView.setImageDrawable((Drawable)hashMap.get("icon"));
        return inflate;
    }
}
