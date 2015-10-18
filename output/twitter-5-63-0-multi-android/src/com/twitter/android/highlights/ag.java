// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import com.twitter.library.media.widget.MediaImageView;
import java.util.ArrayList;
import java.util.List;
import android.view.ViewGroup;
import android.view.View;
import com.twitter.library.widget.ObservableScrollView;
import android.widget.TextView;
import com.twitter.library.widget.CompoundDrawableAnimButton;

public abstract class ag
{
    public final CompoundDrawableAnimButton A;
    public final TextView B;
    public final ObservableScrollView C;
    public final View D;
    public int E;
    public final int q;
    public final View r;
    public final View s;
    public final ViewGroup t;
    public final View u;
    public final List v;
    public final TextView w;
    public final ViewGroup x;
    public final CompoundDrawableAnimButton y;
    public final CompoundDrawableAnimButton z;
    
    public ag(final int q, final View r) {
        int i = 0;
        this.v = new ArrayList();
        this.E = Integer.MIN_VALUE;
        this.q = q;
        (this.r = r).setTag((Object)this);
        this.s = r.findViewById(2131886804);
        this.t = (ViewGroup)r.findViewById(2131886848);
        this.u = r.findViewById(2131886806);
        int childCount;
        if (this.t != null) {
            childCount = this.t.getChildCount();
        }
        else {
            childCount = 0;
            i = 0;
        }
        while (i < childCount) {
            final View child = this.t.getChildAt(i);
            if (child instanceof MediaImageView) {
                this.v.add(child);
            }
            ++i;
        }
        this.w = (TextView)r.findViewById(2131886849);
        this.x = (ViewGroup)r.findViewById(2131886850);
        this.y = (CompoundDrawableAnimButton)r.findViewById(2131886852);
        this.z = (CompoundDrawableAnimButton)r.findViewById(2131886851);
        this.A = (CompoundDrawableAnimButton)r.findViewById(2131886853);
        this.B = (TextView)r.findViewById(2131886854);
        this.C = (ObservableScrollView)r.findViewById(2131886855);
        this.D = r.findViewById(2131886810);
    }
}
