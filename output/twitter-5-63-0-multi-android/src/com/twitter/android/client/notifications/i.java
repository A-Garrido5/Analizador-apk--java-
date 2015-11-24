// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import com.twitter.library.platform.d;

class i extends n
{
    public i(final d d, final String s, final long n) {
        super(d, s, n);
        this.a = 2131297321;
    }
    
    @Override
    public String d() {
        return this.f.getString(this.a, new Object[] { this.b().length });
    }
    
    @Override
    public int f() {
        return 2130839297;
    }
    
    @Override
    public String h() {
        return "followed";
    }
}
