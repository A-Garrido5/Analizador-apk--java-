// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.library.provider.Tweet;
import com.twitter.library.api.PromotedEvent;
import com.twitter.android.wp;
import android.view.ViewParent;
import android.support.v4.view.ViewPager;
import com.twitter.android.client.c;
import com.twitter.library.view.o;

public class cr extends o
{
    private final c a;
    private final ViewPager b;
    private int c;
    
    public cr(final c a, final ViewPager b, final ViewParent viewParent, final int n) {
        super(viewParent, n);
        this.c = 0;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void onPageSelected(final int c) {
        super.onPageSelected(c);
        if (this.b.getAdapter() instanceof wp) {
            int n;
            if (this.c < c) {
                n = 1;
            }
            else {
                n = 0;
            }
            final Tweet a = ((wp)this.b.getAdapter()).a(c);
            if (a != null && a.m()) {
                this.a.a(PromotedEvent.a, a.j);
                if (this.c != c) {
                    PromotedEvent promotedEvent;
                    if (n != 0) {
                        promotedEvent = PromotedEvent.aE;
                    }
                    else {
                        promotedEvent = PromotedEvent.aF;
                    }
                    this.a.a(promotedEvent, a.j);
                }
            }
        }
        this.c = c;
    }
}
