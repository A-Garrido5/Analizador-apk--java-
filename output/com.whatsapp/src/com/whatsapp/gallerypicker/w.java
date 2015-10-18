// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.ArrayList;
import android.os.SystemClock;
import android.os.AsyncTask;

class w extends AsyncTask
{
    private static final String z;
    final boolean a;
    final boolean b;
    final MediaGalleryBase c;
    int d;
    
    static {
        final char[] charArray = "dY(7\u0011n] 2\u0015{Ec?\u001ce\u001c.+\u0013bY8-PhO?7\u0017gY(".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'p';
                    break;
                }
                case 0: {
                    c2 = '\t';
                    break;
                }
                case 1: {
                    c2 = '<';
                    break;
                }
                case 2: {
                    c2 = 'L';
                    break;
                }
                case 3: {
                    c2 = '^';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    w(final MediaGalleryBase c, final boolean b, final boolean a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    protected Void a(final Void[] array) {
        final int v = MediaGalleryBase.v;
        final aa a = this.c.a(!this.b);
        final int e = a.e();
        long n = SystemClock.uptimeMillis();
        final ArrayList<Object> list = new ArrayList<Object>();
        int n2 = 0;
        ae ae = null;
        while (n2 < e && (!this.isCancelled() || v != 0)) {
            final bj a2 = a.a(n2);
            if (a2 == null && v == 0) {
                break;
            }
            if (n2 == -1 + MediaGalleryBase.g(this.c) && ae != null) {
                final ArrayList list2 = new ArrayList(list);
                final ae ae2 = new ae(ae);
                ae2.b = e;
                n = SystemClock.uptimeMillis();
                this.c.runOnUiThread((Runnable)new ad(this, e, list2, ae2));
            }
            final ae a3 = MediaGalleryBase.f(this.c).a(a2.c());
            if (ae == null || !ae.equals(a3)) {
                if (ae != null) {
                    list.add(ae);
                }
                a3.b = 0;
                ae = a3;
            }
            ++ae.b;
            if (!list.isEmpty() && 1000L + n < SystemClock.uptimeMillis()) {
                n = SystemClock.uptimeMillis();
                final ArrayList list3 = new ArrayList(list);
                list.clear();
                this.c.runOnUiThread((Runnable)new b_(this, e, list3));
            }
            final int n3 = n2 + 1;
            if (v != 0) {
                break;
            }
            n2 = n3;
        }
        if (ae != null && !this.isCancelled()) {
            list.add(ae);
        }
        this.c.runOnUiThread((Runnable)new a7(this, list, e));
        a.a();
        Log.i(w.z);
        return null;
    }
    
    protected void a(final Void void1) {
        this.c.s.notifyDataSetChanged();
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((Void)o);
    }
}
