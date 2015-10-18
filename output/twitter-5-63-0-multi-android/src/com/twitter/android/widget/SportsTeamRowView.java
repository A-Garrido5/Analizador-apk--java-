// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.library.api.TwitterTopic$SportsEvent$Player;
import android.text.TextUtils;
import android.content.res.TypedArray;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.media.widget.UserImageView;
import android.widget.TextView;
import android.widget.RelativeLayout;

public class SportsTeamRowView extends RelativeLayout
{
    protected TextView a;
    protected TextView b;
    protected TextView c;
    protected UserImageView d;
    protected int e;
    protected boolean f;
    
    public SportsTeamRowView(final Context context) {
        this(context, null, 2130772080);
    }
    
    public SportsTeamRowView(final Context context, final AttributeSet set) {
        this(context, set, 2130772080);
    }
    
    public SportsTeamRowView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.SportsTeamRowView, n, 0);
        this.e = obtainStyledAttributes.getResourceId(0, 2130969116);
        this.f = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        this.c();
    }
    
    protected static void a(final TextView textView, final String text) {
        if (textView != null) {
            if (TextUtils.isEmpty((CharSequence)text)) {
                textView.setVisibility(8);
                return;
            }
            textView.setText((CharSequence)text);
            textView.setVisibility(0);
        }
    }
    
    protected void a(final TwitterTopic$SportsEvent$Player twitterTopic$SportsEvent$Player, final String s) {
        a(this.c, twitterTopic$SportsEvent$Player.score);
    }
    
    public void b(final TwitterTopic$SportsEvent$Player twitterTopic$SportsEvent$Player, final String s) {
        if (twitterTopic$SportsEvent$Player != null) {
            String s2;
            if (this.f) {
                s2 = twitterTopic$SportsEvent$Player.abbreviation;
            }
            else {
                s2 = twitterTopic$SportsEvent$Player.name;
            }
            a(this.a, twitterTopic$SportsEvent$Player.location);
            a(this.b, s2);
            this.a(twitterTopic$SportsEvent$Player, s);
            if (this.d != null) {
                this.d.a(twitterTopic$SportsEvent$Player.logoUrl);
            }
        }
    }
    
    public void c() {
        ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(this.e, (ViewGroup)this, true);
    }
    
    public void c(final TwitterTopic$SportsEvent$Player twitterTopic$SportsEvent$Player, final String s) {
        if (twitterTopic$SportsEvent$Player != null) {
            this.a(twitterTopic$SportsEvent$Player, s);
            if (this.f) {
                a(this.b, twitterTopic$SportsEvent$Player.abbreviation);
            }
        }
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView)this.findViewById(2131886620);
        this.b = (TextView)this.findViewById(2131886621);
        this.c = (TextView)this.findViewById(2131886622);
        this.d = (UserImageView)this.findViewById(2131886619);
    }
}
