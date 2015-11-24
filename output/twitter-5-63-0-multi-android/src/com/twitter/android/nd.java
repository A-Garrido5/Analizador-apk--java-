// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.app.Fragment;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import com.twitter.internal.android.widget.h;

public class nd extends h
{
    private final WeakReference a;
    
    public nd(final nc nc) {
        this.a = new WeakReference((T)nc);
    }
    
    @Override
    public void a(final int n, final int n2, final int n3, final int n4) {
        final nc nc = (nc)this.a.get();
        if (nc != null) {
            final AbsPagesAdapter j = nc.j();
            if (j != null) {
                final Iterator iterator = j.a().iterator();
                while (iterator.hasNext()) {
                    final Fragment b = nc.b(iterator.next());
                    if (b instanceof TimelineFragment) {
                        final TimelineFragment timelineFragment = (TimelineFragment)b;
                        if (n4 > timelineFragment.az()) {
                            continue;
                        }
                        timelineFragment.e(n4);
                    }
                }
            }
        }
    }
}
