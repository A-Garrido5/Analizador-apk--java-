// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles;

import com.twitter.library.media.util.HeaderImageVariant;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.manager.k;

public class g
{
    public static k a(final ad ad) {
        if (ad.g()) {
            return (k)j.a(ad.f()).d(true);
        }
        return a(ad.f());
    }
    
    public static k a(final String s) {
        return j.a(s).a(HeaderImageVariant.j);
    }
}
