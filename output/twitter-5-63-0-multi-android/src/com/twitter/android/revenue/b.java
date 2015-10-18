// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue;

import com.twitter.library.api.MediaEntity;
import java.util.Iterator;
import com.twitter.library.media.manager.ResourceRequestType;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.manager.k;
import com.twitter.library.api.bp;
import com.twitter.library.api.at;
import java.util.HashSet;
import java.util.Collections;
import java.util.List;
import com.twitter.library.media.manager.q;
import com.twitter.internal.android.service.a;

public class b extends a
{
    private static final String[] a;
    private final q e;
    private final List f;
    
    static {
        a = new String[] { "promo_image", "player_image" };
    }
    
    public b(final q e, List empty_LIST) {
        super(b.class.getName());
        this.e = e;
        if (empty_LIST == null) {
            empty_LIST = Collections.EMPTY_LIST;
        }
        this.f = empty_LIST;
    }
    
    protected Integer a() {
        final q e = this.e;
        final HashSet<String> set = new HashSet<String>();
        for (final at at : this.f) {
            if (at.c() != null || at.k() != null) {
                final Iterator iterator2 = at.g().iterator();
                while (iterator2.hasNext()) {
                    final String a = this.a(iterator2.next());
                    if (a != null && !set.contains(a)) {
                        final j a2 = ((k)com.twitter.library.media.manager.j.a(a).a(ResourceRequestType.c)).a();
                        if (e.c(a2) != null) {
                            continue;
                        }
                        set.add(a);
                        e.a(a2);
                    }
                }
            }
        }
        return set.size();
    }
    
    String a(final bp bp) {
        int i = 0;
        if (bp.v != null && bp.v.cardInstanceData != null && bp.v.cardInstanceData.u() != null) {
            final vc u = bp.v.cardInstanceData.u();
            for (String[] a = b.a; i < a.length; ++i) {
                final vj a2 = vj.a(a[i], u);
                if (a2 != null) {
                    return a2.a;
                }
            }
        }
        else if (!bp.c.media.c()) {
            return ((MediaEntity)bp.c.media.a(0)).mediaUrl;
        }
        return null;
    }
    
    protected Integer b() {
        return 0;
    }
}
