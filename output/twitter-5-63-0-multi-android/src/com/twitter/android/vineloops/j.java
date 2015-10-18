// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.vineloops;

import com.twitter.internal.android.service.a;
import android.content.Context;
import com.twitter.library.client.as;

class j implements Runnable
{
    final /* synthetic */ i a;
    private final as b;
    private final Context c;
    
    public j(final i a, final Context context, final as b) {
        this.a = a;
        this.c = context.getApplicationContext();
        this.b = b;
    }
    
    @Override
    public void run() {
        this.b.a(new k(this.a, this.c));
    }
}
