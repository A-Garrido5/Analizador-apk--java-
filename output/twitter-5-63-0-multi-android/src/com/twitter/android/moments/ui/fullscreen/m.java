// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.fullscreen;

import android.view.View;
import android.content.Context;
import com.twitter.android.moments.ui.sectionpager.d;

class m implements d
{
    private final Context a;
    
    m(final Context a) {
        this.a = a;
    }
    
    public View a() {
        final View view = new View(this.a);
        view.setVisibility(8);
        return view;
    }
    
    @Override
    public void c() {
    }
}
