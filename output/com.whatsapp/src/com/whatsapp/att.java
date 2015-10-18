// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.content.Context;
import android.view.View;
import android.view.View$OnClickListener;

class att implements View$OnClickListener
{
    final Advanced a;
    
    att(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.b((Context)this.a, 0);
        final Intent intent = new Intent((Context)this.a, (Class)EULA.class);
        this.a.finish();
        this.a.startActivity(intent);
    }
}
