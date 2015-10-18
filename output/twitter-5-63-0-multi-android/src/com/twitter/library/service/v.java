// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.service;

import com.twitter.internal.android.service.u;
import com.twitter.library.client.as;
import com.twitter.library.network.forecaster.h;
import com.twitter.library.network.forecaster.b;
import android.content.Context;
import com.twitter.util.n;

public class v implements n
{
    private static v a;
    private Context b;
    
    private v(final Context b) {
        this.b = b;
        com.twitter.library.network.forecaster.b.a().a(this);
    }
    
    public static void a(final Context context) {
        synchronized (v.class) {
            if (v.a == null) {
                v.a = new v(context);
            }
        }
    }
    
    public void a(final h h) {
        as.a(this.b).a(new s(h));
    }
}
