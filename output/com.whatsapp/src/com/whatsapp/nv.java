// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import com.whatsapp.protocol.bi;
import java.util.ArrayList;
import android.os.AsyncTask;

class nv extends AsyncTask
{
    final ie a;
    final arz b;
    
    nv(final ie a, final arz b) {
        this.a = a;
        this.b = b;
    }
    
    protected ArrayList a(final Void[] array) {
        return App.ak.a(System.currentTimeMillis() - 86400000L, 32);
    }
    
    protected void a(final ArrayList list) {
        final boolean i = App.I;
        final int j = App.j();
        for (final bi bi : list) {
            if (App.c(bi) && App.a(j, bi)) {
                this.b.b(bi);
            }
            if (i) {
                break;
            }
        }
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((ArrayList)o);
    }
}
