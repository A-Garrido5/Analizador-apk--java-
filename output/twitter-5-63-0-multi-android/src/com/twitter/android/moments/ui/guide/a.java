// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.guide;

import android.view.View;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.library.widget.AspectRatioFrameLayout;
import android.view.View$OnLayoutChangeListener;

class a implements View$OnLayoutChangeListener
{
    final /* synthetic */ AspectRatioFrameLayout a;
    final /* synthetic */ ToolBar b;
    final /* synthetic */ m c;
    final /* synthetic */ GuideActivity d;
    
    a(final GuideActivity d, final AspectRatioFrameLayout a, final ToolBar b, final m c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        this.c.a(this.a.getHeight() - this.b.getHeight());
    }
}
