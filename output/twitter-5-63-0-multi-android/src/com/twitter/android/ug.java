// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.internal.android.service.a;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

class ug extends z
{
    final /* synthetic */ TimelineFragment a;
    
    private ug(final TimelineFragment a) {
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        super.a(y);
        if (y instanceof pb) {
            this.a.a((pb)y);
        }
        else {
            if (y instanceof pe) {
                this.a.a((pe)y);
                return;
            }
            if (y instanceof pp) {
                this.a.a((pp)y);
            }
        }
    }
}
