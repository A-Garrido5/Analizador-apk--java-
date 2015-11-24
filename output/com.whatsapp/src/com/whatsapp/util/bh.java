// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.net.Uri;
import com.whatsapp.App;
import com.whatsapp.MediaData;

final class bh implements Runnable
{
    final String a;
    final byte[] b;
    final String c;
    final MediaData d;
    
    bh(final String a, final byte[] b, final MediaData d, final String c) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    @Override
    public void run() {
        App.a(this.a, this.b, this.d, (byte)1, 0, this.c, null);
    }
}
