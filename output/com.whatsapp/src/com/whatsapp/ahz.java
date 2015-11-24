// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.SystemClock;
import android.os.Handler;
import android.os.AsyncTask;

class ahz extends AsyncTask
{
    private long a;
    private String b;
    private boolean c;
    private Handler d;
    final Conversation e;
    private Runnable f;
    
    public ahz(final Conversation e, final String b, final boolean c) {
        this.e = e;
        this.b = b;
        this.c = c;
        this.a = SystemClock.uptimeMillis();
    }
    
    static String a(final ahz ahz) {
        return ahz.b;
    }
    
    protected String a(final Void[] array) {
        return adc.h(this.b);
    }
    
    protected void a() {
        super.cancel(false);
        if (this.d != null) {
            this.d.removeCallbacks(this.f);
        }
        this.d = null;
        this.f = null;
    }
    
    protected void a(final String s) {
        if (this.b.equals(this.e.s.u)) {
            Conversation.c(this.e, s);
            this.d = new Handler();
            this.f = new aag(this);
            if (this.c) {
                this.d.postAtTime(this.f, 3000L + this.a);
                if (!App.I) {
                    return;
                }
            }
            this.f.run();
        }
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((String)o);
    }
}
