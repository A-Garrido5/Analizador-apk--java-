// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.content.Intent;
import com.whatsapp.CorruptInstallationActivity;
import android.content.Context;

final class cl implements Runnable
{
    final Context a;
    
    cl(final Context a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.startActivity(new Intent(this.a, (Class)CorruptInstallationActivity.class).setFlags(268435456));
    }
}
