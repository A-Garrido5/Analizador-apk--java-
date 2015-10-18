// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.net.Uri;
import android.content.Intent;

class c3 extends Thread
{
    final SpamWarningActivity a;
    
    c3(final SpamWarningActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        SpamWarningActivity.b().block();
        this.a.startActivity(new Intent((String)null, (Uri)null, (Context)this.a, Main.h()));
        this.a.finish();
    }
}
