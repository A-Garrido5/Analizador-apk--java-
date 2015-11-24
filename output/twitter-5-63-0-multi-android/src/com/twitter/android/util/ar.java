// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import com.twitter.internal.android.service.a;
import com.twitter.library.api.m;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

class ar extends z
{
    private final am a;
    
    public ar(final am a) {
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        final m m = (m)y;
        if (this.a != null) {
            this.a.a(m.e());
        }
    }
}
