// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import com.twitter.util.concurrent.d;

class qt implements d
{
    static final /* synthetic */ boolean a;
    final /* synthetic */ SearchActivity b;
    
    static {
        a = !SearchActivity.class.desiredAssertionStatus();
    }
    
    qt(final SearchActivity b) {
        this.b = b;
    }
    
    public void a(final Intent intent) {
        if (!qt.a && intent == null) {
            throw new AssertionError();
        }
        this.b.startActivity(Intent.createChooser(intent, (CharSequence)null));
    }
}
