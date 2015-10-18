// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.util.concurrent.h;
import com.twitter.util.concurrent.e;
import com.twitter.library.provider.ae;
import com.twitter.library.service.z;
import com.twitter.library.client.az;
import com.twitter.library.av.ab;
import java.lang.ref.WeakReference;
import com.twitter.library.client.Session;
import android.content.Context;
import android.net.Uri;
import com.twitter.library.provider.Tweet;
import com.twitter.util.concurrent.d;

class aq implements d
{
    final /* synthetic */ ap a;
    
    aq(final ap a) {
        this.a = a;
    }
    
    public void a(final Tweet tweet) {
        final as as = (as)this.a.g.get();
        if (as != null && tweet != null) {
            as.a(tweet);
        }
    }
}
