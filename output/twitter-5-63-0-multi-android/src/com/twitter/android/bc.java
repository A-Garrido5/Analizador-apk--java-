// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.ComponentName;
import android.content.Intent;
import android.content.Context;
import com.twitter.util.concurrent.d;

class bc implements d
{
    static final /* synthetic */ boolean a;
    final /* synthetic */ Context b;
    final /* synthetic */ bb c;
    
    static {
        a = !az.class.desiredAssertionStatus();
    }
    
    bc(final bb c, final Context b) {
        this.c = c;
        this.b = b;
    }
    
    public void a(final Intent intent) {
        if (!bc.a && intent == null) {
            throw new AssertionError();
        }
        intent.addFlags(268435456);
        intent.setComponent(new ComponentName(this.b, (Class)BugReporterActivity.class));
        this.b.startActivity(intent);
    }
}
