// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.fullscreen;

import com.twitter.android.moments.viewmodels.HydratableMomentPage;
import android.content.Context;
import com.twitter.util.r;

class c implements r
{
    private final Context a;
    private final a b;
    private final HydratableMomentPage c;
    
    c(final Context a, final a b, final HydratableMomentPage c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public com.twitter.android.moments.ui.sectionpager.a a() {
        return h.a(this.a, this.b, this.c);
    }
}
