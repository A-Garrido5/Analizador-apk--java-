// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.text.method.LinkMovementMethod;
import com.twitter.library.provider.Tweet;
import com.twitter.library.widget.CompoundDrawableAnimButton;
import com.twitter.library.media.widget.TweetMediaView;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;
import android.view.View;

public class aq
{
    public final View a;
    public final MediaImageView b;
    public final TextView c;
    public final View d;
    public final TextView e;
    public final TextView f;
    public final View g;
    public final TweetMediaView h;
    public final CompoundDrawableAnimButton i;
    public final CompoundDrawableAnimButton j;
    public Tweet k;
    
    public aq(final View a) {
        this.a = a;
        this.b = (MediaImageView)a.findViewById(2131886306);
        this.c = (TextView)a.findViewById(2131886307);
        this.d = a.findViewById(2131886857);
        this.e = (TextView)a.findViewById(2131886145);
        (this.f = (TextView)a.findViewById(2131886826)).setMovementMethod(LinkMovementMethod.getInstance());
        this.g = a.findViewById(2131886843);
        this.h = (TweetMediaView)a.findViewById(2131886860);
        this.i = (CompoundDrawableAnimButton)a.findViewById(2131886876);
        this.j = (CompoundDrawableAnimButton)a.findViewById(2131886875);
    }
}
