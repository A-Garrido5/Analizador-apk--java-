// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.content.Context;
import com.whatsapp.notification.w;
import java.util.Collection;
import android.os.AsyncTask;

class d_ extends AsyncTask
{
    private static final String[] z;
    final App a;
    
    static {
        final String[] z2 = new String[2];
        String s = "SO\u0017?\u001dB[\u0006d\r\\P\u0013y\u000eK\u0010\u0015u\u000e@Z\u0014xGWM\u0015\u007f\u001a";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'h';
                        break;
                    }
                    case 0: {
                        c2 = '2';
                        break;
                    }
                    case 1: {
                        c2 = '?';
                        break;
                    }
                    case 2: {
                        c2 = 'g';
                        break;
                    }
                    case 3: {
                        c2 = '\u0010';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "SO\u0017?\u001dB[\u0006d\r\\P\u0013y\u000e\u001dZ\u0015b\u0007@\u001f";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    d_(final App a) {
        this.a = a;
    }
    
    protected Void a(final Void[] array) {
        try {
            App.S.a((Collection)z8.j());
            w.b().a((Context)App.aq, true);
            return null;
        }
        catch (Exception ex) {
            Log.w(d_.z[1] + ex.toString());
            return null;
        }
    }
    
    protected void a(final Void void1) {
        try {
            App.a(true, true, true, false);
        }
        catch (Exception ex) {
            Log.c(d_.z[0], ex);
        }
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((Void)o);
    }
}
