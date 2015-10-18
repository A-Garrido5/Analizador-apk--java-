// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.widget.TextView;
import android.view.View;
import android.widget.ImageView;
import com.twitter.library.media.widget.BaseMediaImageView;

public class ai extends ar
{
    public BaseMediaImageView a;
    public ImageView b;
    public View c;
    public View d;
    public TextView e;
    public TextView f;
    public TextView g;
    
    public ai(final View view, final int n) {
        super(n, view);
    }
    
    public void a(final View view) {
        this.a = (BaseMediaImageView)view.findViewById(2131886695);
        this.b = (ImageView)view.findViewById(2131886872);
        this.c = view.findViewById(2131886873);
        this.d = view.findViewById(2131886124);
        this.e = (TextView)view.findViewById(2131886874);
        this.f = (TextView)view.findViewById(2131886396);
        this.g = (TextView)view.findViewById(2131886647);
    }
}
