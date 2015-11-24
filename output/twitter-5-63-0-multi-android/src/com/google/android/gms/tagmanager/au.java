// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

import java.util.Collection;
import java.util.Set;

class au implements av
{
    final /* synthetic */ as a;
    
    au(final as a) {
        this.a = a;
    }
    
    @Override
    public void a(final aq aq, final Set set, final Set set2, final an an) {
        set.addAll(aq.c());
        set2.addAll(aq.d());
        an.e().a(aq.c(), aq.f());
        an.f().a(aq.d(), aq.g());
    }
}
