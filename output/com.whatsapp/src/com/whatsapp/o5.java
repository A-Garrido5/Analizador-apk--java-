// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Bitmap;
import android.os.AsyncTask;

class o5 extends AsyncTask
{
    final GroupChatInfo a;
    
    o5(final GroupChatInfo a) {
        this.a = a;
    }
    
    protected Bitmap a(final Void[] array) {
        return GroupChatInfo.s(this.a).a(640, 0.0f, false);
    }
    
    protected void a(final Bitmap bitmap) {
        this.a.a(bitmap, 2130837603, 2131623952);
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((Bitmap)o);
    }
}
