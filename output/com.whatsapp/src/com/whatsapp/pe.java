// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.IOException;
import android.os.Handler;
import android.app.Activity;

final class pe implements Runnable
{
    final boolean a;
    final a_9 b;
    final Activity c;
    final Handler d;
    final gu e;
    
    pe(final a_9 b, final boolean a, final Handler d, final gu e, final Activity c) {
        this.b = b;
        this.a = a;
        this.d = d;
        this.e = e;
        this.c = c;
    }
    
    @Override
    public void run() {
        try {
            this.d.post((Runnable)new ar0(this, App.ak.b(this.b.u, this.a)));
        }
        catch (IOException ex) {
            this.d.post((Runnable)new ba(this, ex.getMessage()));
        }
    }
}
