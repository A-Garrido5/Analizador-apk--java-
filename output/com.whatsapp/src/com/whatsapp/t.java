// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.AsyncTask;

class t extends AsyncTask
{
    final HomeActivity a;
    
    private t(final HomeActivity a) {
        this.a = a;
    }
    
    t(final HomeActivity homeActivity, final ru ru) {
        this(homeActivity);
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
        HomeActivity.b(this.a, b);
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
