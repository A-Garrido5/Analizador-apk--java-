// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.media.widget.TweetMediaView;
import com.twitter.library.widget.CompoundDrawableAnimButton;

public class av extends ag
{
    public final CompoundDrawableAnimButton F;
    public final TweetMediaView G;
    public final MediaImageView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final View f;
    public final TweetMediaView g;
    public final CompoundDrawableAnimButton h;
    public final CompoundDrawableAnimButton i;
    public final MediaImageView j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final TextView n;
    public final View o;
    public final CompoundDrawableAnimButton p;
    
    public av(final int n, final View view) {
        super(n, view);
        this.a = (MediaImageView)view.findViewById(2131886306);
        this.b = (TextView)view.findViewById(2131886307);
        this.c = (TextView)view.findViewById(2131886858);
        this.d = (TextView)view.findViewById(2131886869);
        (this.e = (TextView)view.findViewById(2131886826)).setMovementMethod(LinkMovementMethod.getInstance());
        this.f = view.findViewById(2131886843);
        this.g = (TweetMediaView)view.findViewById(2131886860);
        final View viewById = view.findViewById(2131886870);
        this.h = (CompoundDrawableAnimButton)viewById.findViewById(2131886876);
        this.i = (CompoundDrawableAnimButton)viewById.findViewById(2131886875);
        this.j = (MediaImageView)view.findViewById(2131886861);
        this.k = (TextView)view.findViewById(2131886862);
        this.l = (TextView)view.findViewById(2131886863);
        this.m = (TextView)view.findViewById(2131886864);
        (this.n = (TextView)view.findViewById(2131886868)).setMovementMethod(LinkMovementMethod.getInstance());
        this.o = view.findViewById(2131886866);
        this.G = (TweetMediaView)view.findViewById(2131886867);
        final View viewById2 = view.findViewById(2131886865);
        this.p = (CompoundDrawableAnimButton)viewById2.findViewById(2131886876);
        this.F = (CompoundDrawableAnimButton)viewById2.findViewById(2131886875);
    }
}
