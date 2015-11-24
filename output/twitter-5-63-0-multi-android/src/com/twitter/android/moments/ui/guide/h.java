// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.guide;

import com.twitter.android.moments.viewmodels.ListMomentModule;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import android.view.LayoutInflater;

class h extends f
{
    private final LayoutInflater a;
    
    public h(final LayoutInflater a, final List list) {
        super(list);
        this.a = a;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        i tag;
        ViewGroup viewGroup3;
        if (view == null) {
            final ViewGroup viewGroup2 = (ViewGroup)this.a.inflate(2130968898, viewGroup, false);
            tag = new i(viewGroup2);
            viewGroup2.setTag((Object)tag);
            viewGroup3 = viewGroup2;
        }
        else {
            viewGroup3 = (ViewGroup)view;
            tag = (i)viewGroup3.getTag();
        }
        tag.a((ListMomentModule)this.getItem(n));
        return (View)viewGroup3;
    }
}
