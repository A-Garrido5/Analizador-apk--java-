// 
// Decompiled by Procyon v0.5.30
// 

package com.example.adrin.detectorappsinseguras;

import android.graphics.drawable.Drawable;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;

public class aplicacion
{
    ColorDrawable colorDrawable;
    Context context;
    Drawable icono;
    String nombre;
    String paquete;
    String riesgo;
    String riesgoEncriptacion;
    String riesgoPermisos;
    String riesgoPublicidad;
    
    public aplicacion(final String nombre, final String riesgo, final Drawable icono, final String paquete, final String riesgoPermisos, final String riesgoEncriptacion, final String riesgoPublicidad, final Context context) {
        this.nombre = nombre;
        this.riesgo = riesgo;
        this.icono = icono;
        this.paquete = paquete;
        this.riesgoPermisos = riesgoPermisos;
        this.riesgoEncriptacion = riesgoEncriptacion;
        this.riesgoPublicidad = riesgoPublicidad;
        this.context = context;
    }
    
    public ColorDrawable getColor(final String s) {
        int int1;
        if (s == "-") {
            int1 = 0;
        }
        else {
            int1 = Integer.parseInt(s.substring(0, -1 + s.length()));
        }
        if (int1 < 40 && int1 != 0) {
            return this.colorDrawable = new ColorDrawable(this.context.getResources().getColor(2131427405));
        }
        if (int1 >= 40 && int1 < 75) {
            return this.colorDrawable = new ColorDrawable(this.context.getResources().getColor(2131427334));
        }
        if (int1 > 75) {
            return this.colorDrawable = new ColorDrawable(this.context.getResources().getColor(2131427398));
        }
        return this.colorDrawable = new ColorDrawable(this.context.getResources().getColor(2131427414));
    }
}
