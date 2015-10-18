// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.List;

class os extends mn
{
    public os(final List list) {
        super(list);
    }
    
    public void a(final List a) {
        this.a = a;
        if (this.b() >= this.a.size()) {
            this.a(-1);
            return;
        }
        this.notifyDataSetChanged();
    }
}
