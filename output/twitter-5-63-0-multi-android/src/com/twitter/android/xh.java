// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Context;
import com.twitter.library.media.util.aq;

class xh implements Runnable
{
    final /* synthetic */ TwitterApplication a;
    
    xh(final TwitterApplication a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        aq.a((Context)this.a);
    }
}
