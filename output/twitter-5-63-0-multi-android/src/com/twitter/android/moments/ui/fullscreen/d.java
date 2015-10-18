// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.fullscreen;

import com.twitter.util.n;
import com.twitter.util.m;
import android.content.res.Resources;
import android.view.View;

public class d
{
    private final View a;
    private final View b;
    private final int c;
    
    public d(final Resources resources, final m m, final View a, final View b) {
        this.a = a;
        this.b = b;
        m.a(new e(this));
        this.c = resources.getInteger(2131623968);
    }
    
    private void a(final View view, final float n) {
        view.animate().alpha(n).setDuration((long)this.c).start();
    }
}
