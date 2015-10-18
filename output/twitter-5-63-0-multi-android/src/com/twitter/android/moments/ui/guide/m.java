// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.guide;

import android.widget.AbsListView;
import android.widget.ListView;
import com.twitter.library.widget.AspectRatioFrameLayout;
import android.view.View;
import android.view.ViewGroup;

public class m implements l
{
    private final ViewGroup a;
    private final View b;
    private final View c;
    private int d;
    
    public m(final AspectRatioFrameLayout a, final ListView listView, final View c) {
        this.a = (ViewGroup)a;
        this.b = a.findViewById(2131886961);
        this.c = c;
        new k((AbsListView)listView, 0).a(this);
        final AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(a.getContext());
        aspectRatioFrameLayout.setAspectRatio(a.getAspectRatio());
        listView.addHeaderView((View)aspectRatioFrameLayout, (Object)null, false);
    }
    
    private void b(final int n) {
        final int max = Math.max(n, -this.d);
        this.a.setTranslationY((float)max);
        final float n2 = max / -this.d;
        this.b.setAlpha(0.6f * n2);
        if (this.c != null) {
            this.c.setAlpha(1.0f - Math.min(1.0f, n2 * 2.0f));
        }
    }
    
    public void a(final int d) {
        this.d = d;
    }
    
    @Override
    public void a(final int n, final int n2) {
        this.b(n2);
    }
    
    @Override
    public void a(final boolean b) {
        if (b) {
            this.b(-this.d);
        }
    }
}
