// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.platform;

import com.twitter.errorreporter.a;

class j extends a
{
    public j(final long n, final String s) {
        super(n);
        this.a("PushErrorLog.collapse_key", s);
    }
    
    public j(final String s) {
        this.a("PushErrorLog.collapse_key", s);
    }
}
