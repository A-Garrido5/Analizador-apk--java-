// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.android.si;

class af extends si
{
    private int a;
    
    private af() {
        this.a = 0;
    }
    
    public dt a(final CharSequence charSequence, final int n) {
        if (this.a != 0) {
            return new dt(this.c(charSequence, n), this.a);
        }
        return null;
    }
    
    public void a(final int a) {
        this.a = a;
    }
}
