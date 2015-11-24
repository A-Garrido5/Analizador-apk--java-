// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.content.Intent;
import android.content.Context;
import android.os.AsyncTask;

public final class b extends AsyncTask
{
    private final Context a;
    
    public b(final Context a) {
        this.a = a;
    }
    
    protected Boolean a(final Void[] array) {
        try {
            return MessageService.g();
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            return false;
        }
    }
    
    protected void a(final Boolean b) {
        if (b) {
            final Intent intent = new Intent(this.a, (Class)CaptivePortalActivity.class);
            intent.setFlags(268435456);
            this.a.startActivity(intent);
        }
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((Boolean)o);
    }
}
