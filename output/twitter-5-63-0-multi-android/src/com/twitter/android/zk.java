// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.util.bn;
import android.net.Uri;
import android.content.Context;
import com.twitter.android.client.n;

class zk implements n
{
    private final Context a;
    private final String b;
    
    zk(final Context a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a() {
        bn.a(this.a, Uri.parse(this.b));
    }
    
    @Override
    public int b() {
        return 1;
    }
}
