// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import android.os.AsyncTask;

class b3 extends AsyncTask
{
    final ie a;
    final bi b;
    
    b3(final ie a, final bi b) {
        this.a = a;
        this.b = b;
    }
    
    protected void a(final byte[] array) {
        ((MediaData)this.b.N).transferring = false;
        this.b.n = 1;
        this.b.a(array);
        App.ak.a(this.b, array != null, -1);
    }
    
    protected byte[] a(final Void[] array) {
        return lh.a(this.b.p, this.b.G);
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((byte[])o);
    }
}
