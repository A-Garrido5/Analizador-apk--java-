// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.ArrayList;
import com.whatsapp.util.Log;
import java.util.Collection;
import android.os.AsyncTask;

final class adq extends AsyncTask
{
    private static final String z;
    
    static {
        final char[] charArray = "WA\u001f\u001cgICQ\u001d<B\u0004\u0002\u001d}TM\u001e\u0016.DK\u0004\u0016z\u0007B\u001e\n.UA\u0002\u001d`C\u001eQ".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u000e';
                    break;
                }
                case 0: {
                    c2 = '\'';
                    break;
                }
                case 1: {
                    c2 = '$';
                    break;
                }
                case 2: {
                    c2 = 'q';
                    break;
                }
                case 3: {
                    c2 = 'x';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    protected Void a(final Void[] array) {
        boolean b = true;
        final vy ak = App.ak;
        if (App.j() != (b ? 1 : 0)) {
            b = false;
        }
        final ArrayList a = ak.a(b);
        if (!this.isCancelled() && !a.isEmpty()) {
            App.aq.a5().post((Runnable)new r2(this, a));
        }
        final ArrayList v = App.ak.v();
        if (!this.isCancelled() && !v.isEmpty()) {
            App.aq.a5().post((Runnable)new ah5(this, v));
        }
        final ArrayList d = App.ak.D();
        if (!this.isCancelled() && !d.isEmpty()) {
            gj.a(d);
        }
        final Collection q = App.ak.q();
        if (!this.isCancelled() && !q.isEmpty()) {
            Log.i(adq.z + q.size());
            App.aq.a5().post((Runnable)new ah2(this, q));
        }
        return null;
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
}
