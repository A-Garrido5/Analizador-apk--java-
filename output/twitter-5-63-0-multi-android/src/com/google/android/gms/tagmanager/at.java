// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.Map;

class at implements av
{
    final /* synthetic */ Map a;
    final /* synthetic */ Map b;
    final /* synthetic */ Map c;
    final /* synthetic */ Map d;
    final /* synthetic */ as e;
    
    at(final as e, final Map a, final Map b, final Map c, final Map d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void a(final aq aq, final Set set, final Set set2, final an an) {
        final List list = this.a.get(aq);
        final List list2 = this.b.get(aq);
        if (list != null) {
            set.addAll(list);
            an.c().a(list, list2);
        }
        final List list3 = this.c.get(aq);
        final List list4 = this.d.get(aq);
        if (list3 != null) {
            set2.addAll(list3);
            an.d().a(list3, list4);
        }
    }
}
