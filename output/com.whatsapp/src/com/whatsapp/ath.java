// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.ImageView;
import android.graphics.Bitmap;
import android.os.AsyncTask;

class ath extends AsyncTask
{
    final VoipActivity a;
    final int b;
    
    ath(final VoipActivity a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    protected Bitmap a(final Void[] array) {
        final String peerJid = Voip.getPeerJid();
        if (peerJid != null) {
            final a_9 d = App.S.d(peerJid);
            if (d != null) {
                return d.a(this.b, 0.0f, false);
            }
        }
        return null;
    }
    
    protected void a(final Bitmap imageBitmap) {
        final ImageView imageView = (ImageView)this.a.findViewById(2131755825);
        if (imageBitmap != null) {
            imageView.setImageBitmap(imageBitmap);
            if (!App.I) {
                return;
            }
        }
        imageView.setImageResource(2130837600);
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((Bitmap)o);
    }
}
