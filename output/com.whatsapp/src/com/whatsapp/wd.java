// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import android.os.AsyncTask;

class wd extends AsyncTask
{
    final Conversation a;
    
    private wd(final Conversation a) {
        this.a = a;
    }
    
    wd(final Conversation conversation, final st st) {
        this(conversation);
    }
    
    protected Bitmap a(final Void[] array) {
        Bitmap bitmap = this.a.s.a(this.a.getResources().getDimensionPixelSize(2131361809), this.a.getResources().getDimension(2131361814), false);
        if (bitmap == null) {
            bitmap = this.a.s.x();
        }
        return bitmap;
    }
    
    protected void a(final Bitmap bitmap) {
        Conversation.L(this.a).setImageDrawable((Drawable)new kr(this.a, this.a.getResources(), bitmap));
        Conversation.L(this.a).setVisibility(0);
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((Bitmap)o);
    }
}
