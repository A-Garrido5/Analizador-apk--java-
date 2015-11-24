// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import com.twitter.library.api.account.ab;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

class aq extends z
{
    final /* synthetic */ ComposerActivity a;
    
    private aq(final ComposerActivity a) {
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        if (y instanceof ab) {
            if (y.X()) {
                this.a.h();
            }
            return;
        }
        super.a(y);
    }
}
