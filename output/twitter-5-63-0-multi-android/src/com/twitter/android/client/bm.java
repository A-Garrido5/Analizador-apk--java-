// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.content.Intent;
import com.twitter.util.concurrent.d;

class bm implements d
{
    static final /* synthetic */ boolean a;
    final /* synthetic */ TwitterFragmentActivity b;
    
    static {
        a = !TwitterFragmentActivity.class.desiredAssertionStatus();
    }
    
    bm(final TwitterFragmentActivity b) {
        this.b = b;
    }
    
    public void a(final Intent intent) {
        if (!bm.a && intent == null) {
            throw new AssertionError();
        }
        this.b.startActivity(Intent.createChooser(intent, (CharSequence)null));
    }
}
