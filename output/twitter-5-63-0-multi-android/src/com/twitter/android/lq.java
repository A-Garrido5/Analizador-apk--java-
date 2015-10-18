// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.internal.android.service.a;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

class lq extends z
{
    private final li a;
    
    public lq(final li a) {
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        if (!((aa)y.l().b()).a() && y instanceof com.twitter.library.api.search.y) {
            this.a.a(600000L, this, ((com.twitter.library.api.search.y)y).e());
        }
    }
}
