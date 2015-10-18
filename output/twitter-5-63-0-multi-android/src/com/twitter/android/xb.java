// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import com.twitter.library.widget.TweetView;
import com.twitter.android.widget.EngagementActionBar;
import android.view.ViewStub;

public class xb
{
    public final ViewStub c;
    public EngagementActionBar d;
    public final boolean e;
    public final TweetView f;
    
    public xb(final View view) {
        this(view, false);
    }
    
    public xb(final View view, final boolean e) {
        this.f = (TweetView)view.findViewById(2131886305);
        this.c = (ViewStub)view.findViewById(2131886791);
        this.e = e;
    }
}
