// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports.cricket;

import com.twitter.library.api.TwitterTopic$SportsEvent$Player;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.view.View;
import android.content.Context;
import com.twitter.library.media.widget.MediaImageView;
import android.widget.TextView;
import android.widget.LinearLayout;

public class PlayerItemViewLeft extends LinearLayout
{
    protected final TextView a;
    protected final TextView b;
    protected final MediaImageView c;
    private final Context d;
    private final View e;
    
    public PlayerItemViewLeft(final Context context) {
        this(context, null, 0);
    }
    
    public PlayerItemViewLeft(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public PlayerItemViewLeft(final Context d, final AttributeSet set, final int n) {
        super(d, set);
        this.d = d;
        this.e = LayoutInflater.from(this.d).inflate(2130968704, (ViewGroup)this, true);
        this.a = (TextView)this.e.findViewById(2131886603);
        this.c = (MediaImageView)this.e.findViewById(2131886212);
        this.b = (TextView)this.e.findViewById(2131886602);
    }
    
    public void a(final TwitterTopic$SportsEvent$Player twitterTopic$SportsEvent$Player) {
        com.twitter.android.events.sports.cricket.b.a((View)this, this.d, twitterTopic$SportsEvent$Player, this.a, this.b, this.c);
    }
}
