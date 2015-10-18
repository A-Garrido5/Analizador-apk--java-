// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import com.twitter.library.provider.Tweet;
import android.net.Uri;
import java.util.concurrent.Callable;

class ac implements Callable
{
    final /* synthetic */ Uri a;
    final /* synthetic */ ab b;
    
    ac(final ab b, final Uri a) {
        this.b = b;
        this.a = a;
    }
    
    public Tweet a() {
        return this.b.b(this.a);
    }
}
