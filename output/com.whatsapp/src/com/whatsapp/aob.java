// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.fieldstats.ab;
import java.io.File;
import android.content.Context;
import com.whatsapp.util.Log;
import android.os.Environment;
import android.util.Pair;
import android.os.AsyncTask;

public class aob extends AsyncTask
{
    private static final String[] z;
    private long a;
    private long b;
    private String c;
    final SearchFAQ d;
    
    static {
        final String[] z2 = new String[3];
        String s = "9]NP11VdL*";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'E';
                        break;
                    }
                    case 0: {
                        c2 = 'T';
                        break;
                    }
                    case 1: {
                        c2 = '2';
                        break;
                    }
                    case 2: {
                        c2 = ';';
                        break;
                    }
                    case 3: {
                        c2 = '>';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "9]NP11V";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "0WH]7=P^N7;PW[(5QOW3=FB\u0011 ,F^L+5^HJ*&S\\[j5DZW)tWCJ &\\ZRe'FTL$3W\u001bP* \u0012X_)7GW_11V\u0017\u001e6 SO[x";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    protected aob(final SearchFAQ d) {
        this.d = d;
    }
    
    protected Pair a(final Void[] array) {
        this.b = App.u();
        this.c = Environment.getExternalStorageState();
        Label_0092: {
            if (aob.z[1].equals(this.c) || aob.z[0].equals(this.c)) {
                this.a = App.C();
                if (!App.I) {
                    break Label_0092;
                }
            }
            this.a = -2L;
            Log.i(aob.z[2] + this.c);
        }
        Log.i(a8q.a((Context)this.d, SearchFAQ.f(this.d), SearchFAQ.b(this.d), null, true, this.a, this.b, this.c));
        Log.j();
        Log.i();
        final File d = a8q.d();
        Object b = null;
        if (d == null) {
            b = a8q.b();
        }
        return new Pair(b, (Object)d);
    }
    
    protected void a(final Pair pair) {
        final String s = (String)pair.first;
        final File file = (File)pair.second;
        this.d.removeDialog(1);
        SearchFAQ.e(this.d).j = (double)ab.EMAIL_SEND.getCode();
        a8q.a(this.d, SearchFAQ.f(this.d), SearchFAQ.c(this.d), SearchFAQ.d(this.d), SearchFAQ.b(this.d), s, file, this.a, this.b, this.c);
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((Pair)o);
    }
    
    protected void onPreExecute() {
        this.d.showDialog(1);
    }
}
