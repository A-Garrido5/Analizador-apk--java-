// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.net.Uri;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class hd implements View$OnClickListener
{
    final Advanced a;
    
    hd(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.startActivity(new Intent((String)null, (Uri)null, (Context)this.a, (Class)CorruptInstallationActivity.class));
    }
}
