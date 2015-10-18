// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.ContentResolver;

final class a62 implements Runnable
{
    final String a;
    final ContentResolver b;
    
    a62(final ContentResolver b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        App.S.a(this.b, this.a);
    }
}
