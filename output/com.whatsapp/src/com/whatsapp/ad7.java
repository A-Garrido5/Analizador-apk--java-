// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class ad7 implements View$OnClickListener
{
    final ahh a;
    
    ad7(final ahh a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.c.startActivity(new Intent((Context)this.a.c, (Class)AccountInfoActivity.class));
        this.a.c.finish();
        RegisterName.a((x1)null);
        this.a.c.removeDialog(0);
    }
}
