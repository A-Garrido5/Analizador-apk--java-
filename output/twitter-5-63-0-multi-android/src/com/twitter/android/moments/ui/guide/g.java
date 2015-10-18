// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.guide;

import com.twitter.android.moments.viewmodels.CarouselImageHeroMomentModule;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import android.view.LayoutInflater;

class g extends f
{
    private final LayoutInflater a;
    
    public g(final LayoutInflater a, final List list) {
        super(list);
        this.a = a;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        e tag;
        View view2;
        if (view == null) {
            final ViewGroup viewGroup2 = (ViewGroup)this.a.inflate(2130968895, viewGroup, false);
            tag = new e(viewGroup2);
            viewGroup2.setTag((Object)tag);
            view2 = (View)viewGroup2;
        }
        else {
            final ViewGroup viewGroup3 = (ViewGroup)view;
            tag = (e)view.getTag();
            view2 = (View)viewGroup3;
        }
        tag.a((CarouselImageHeroMomentModule)this.getItem(n));
        return view2;
    }
}
