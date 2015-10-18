// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import com.whatsapp.protocol.bi;
import android.text.format.DateUtils;
import android.os.Message;
import android.os.Handler;

class a92 extends Handler
{
    private static final String z;
    final ps a;
    long b;
    
    static {
        final char[] charArray = "fsy.t~sd(>vu|(}yqy91".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0011';
                    break;
                }
                case 0: {
                    c2 = '\u0010';
                    break;
                }
                case 1: {
                    c2 = '\u001c';
                    break;
                }
                case 2: {
                    c2 = '\u0010';
                    break;
                }
                case 3: {
                    c2 = 'M';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    a92(final ps a) {
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        if (ps.e(this.a) != null) {
            final long n = System.currentTimeMillis() - ps.k(this.a);
            ps.l(this.a).setText((CharSequence)DateUtils.formatElapsedTime((long)(int)(n / 1000L)));
            ps.g(this.a).sendEmptyMessageDelayed(0, 50L);
            if (ps.i(this.a) == null && n > 1000L && ps.e(this.a).a().length() > 0L) {
                final MediaData mediaData = new MediaData();
                mediaData.autodownloadRetryEnabled = true;
                mediaData.file = ps.e(this.a).a();
                final bi bi = new bi(ps.c(this.a), (byte[])null, mediaData);
                bi.u = App.m();
                bi.n = 1;
                bi.I = 2;
                bi.E = 1;
                bi.k = mediaData.file.getName();
                bi.L = 0L;
                App.b(bi, z8.a(ps.c(this.a)));
                ps.a(this.a, new ad(bi, ps.e(this.a).b()));
                mediaData.uploader = ps.i(this.a);
                ps.i(this.a).g();
            }
            if (1000L + this.b < System.currentTimeMillis() && ps.c(this.a) != null) {
                this.b = System.currentTimeMillis();
                App.d(ps.c(this.a), 1);
                if (ps.e(this.a).a().length() > 1048576L * ym.k) {
                    Log.i(a92.z + ps.e(this.a).a().length());
                    this.a.b(true);
                }
            }
        }
    }
}
