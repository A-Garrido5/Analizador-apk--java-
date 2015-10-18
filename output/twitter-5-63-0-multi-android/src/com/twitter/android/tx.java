// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import com.twitter.library.widget.AspectRatioFrameLayout;
import com.twitter.library.media.widget.TweetMediaView;
import android.widget.TextView;
import android.widget.ImageView;

class tx
{
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public final TweetMediaView d;
    public final AspectRatioFrameLayout e;
    public final tt f;
    public final View g;
    public final TextView h;
    public final View i;
    
    public tx(final View view) {
        this.a = (ImageView)view.findViewById(2131887305);
        this.b = (TextView)view.findViewById(2131887304);
        this.h = (TextView)view.findViewById(2131886396);
        this.c = (TextView)view.findViewById(2131887254);
        this.d = (TweetMediaView)view.findViewById(2131887303);
        this.e = (AspectRatioFrameLayout)view.findViewById(2131886960);
        this.i = view.findViewById(2131887306);
        this.g = view.findViewById(2131887307);
        this.f = new tt(view);
    }
}
