// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.AsyncTask;

class aqr extends AsyncTask
{
    final Conversations a;
    
    private aqr(final Conversations a) {
        this.a = a;
    }
    
    aqr(final Conversations conversations, final a_z a_z) {
        this(conversations);
    }
    
    protected Boolean a(final Void[] array) {
        try {
            return aqu.h();
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            return false;
        }
    }
    
    protected void a(final Boolean b) {
        this.a.removeDialog(1);
        Conversations.a(this.a, b);
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((Boolean)o);
    }
    
    protected void onPreExecute() {
        this.a.showDialog(1);
    }
}
