// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.library.util.bn;
import android.net.Uri;
import com.twitter.library.provider.Tweet;
import android.content.Context;

class ao implements n
{
    private final Context a;
    private final String b;
    private final Tweet c;
    
    ao(final Context a, final String b, final Tweet c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void a() {
        if (am.a(this.a, this.b)) {
            am.a(this.a, this.b, this.c);
            return;
        }
        bn.a(this.a, Uri.parse(this.b));
    }
    
    @Override
    public int b() {
        return 1;
    }
}
