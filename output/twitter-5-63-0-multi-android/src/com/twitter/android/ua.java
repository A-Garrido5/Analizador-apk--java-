// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.client.c;
import android.database.DataSetObserver;

class ua extends DataSetObserver
{
    final /* synthetic */ tl a;
    final /* synthetic */ c b;
    final /* synthetic */ TimelineFragment c;
    
    ua(final TimelineFragment c, final tl a, final c b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public void onChanged() {
        if (this.c.A() && !this.c.K()) {
            final long d = this.a.d(0);
            if (d != -1L) {
                this.b.c(d);
            }
        }
    }
}
