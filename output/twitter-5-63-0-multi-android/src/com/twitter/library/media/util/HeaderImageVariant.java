// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import com.twitter.internal.android.util.Size;
import com.twitter.library.media.manager.n;

public enum HeaderImageVariant
{
    a("MOBILE", 0, Size.a(320, 160), "/mobile", 2.5f), 
    b("WEB", 1, Size.a(520, 260), "/web", 2.5f), 
    c("IPAD", 2, Size.a(626, 313), "/ipad", 2.5f), 
    d("MOBILE_RETINA", 3, Size.a(640, 320), "/mobile_retina", 2.5f), 
    e("WEB_RETINA", 4, Size.a(1040, 640), "/web_retina", 2.5f), 
    f("IPAD_RETINA", 5, Size.a(1252, 626), "/ipad_retina", 2.5f), 
    g("SMALL", 6, Size.a(300, 100), "/300x100", 3.5f), 
    h("MEDIUM", 7, Size.a(600, 200), "/600x200", 3.5f), 
    i("LARGE", 8, Size.a(1500, 500), "/1500x500", 3.5f);
    
    public static final n j;
    public final float maxAspectRatio;
    public final Size maxSize;
    public final String postfix;
    
    static {
        j = new i();
    }
    
    private HeaderImageVariant(final String s, final int n, final Size maxSize, final String postfix, final float maxAspectRatio) {
        this.maxSize = maxSize;
        this.postfix = postfix;
        this.maxAspectRatio = maxAspectRatio;
    }
}
