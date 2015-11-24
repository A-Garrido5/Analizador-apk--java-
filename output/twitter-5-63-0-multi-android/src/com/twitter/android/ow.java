// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.network.i;
import android.content.Context;
import com.twitter.library.service.p;

class ow extends p
{
    public ow(final Context context) {
        super(context, ow.class.getName());
    }
    
    @Override
    protected void a() {
        com.twitter.library.network.i.a(this.i).b();
    }
}
