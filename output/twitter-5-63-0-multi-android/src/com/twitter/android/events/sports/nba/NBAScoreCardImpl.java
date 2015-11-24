// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports.nba;

import com.twitter.android.util.q;
import com.twitter.library.api.TwitterTopic$SportsEvent$Player;
import android.view.View$OnClickListener;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.media.widget.UserImageView;
import android.widget.TextView;
import android.widget.RelativeLayout;

public class NBAScoreCardImpl extends RelativeLayout implements a
{
    private final TextView a;
    private final UserImageView b;
    private final UserImageView c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    
    public NBAScoreCardImpl(final Context context) {
        this(context, null, 0);
    }
    
    public NBAScoreCardImpl(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public NBAScoreCardImpl(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        LayoutInflater.from(context).inflate(2130968937, (ViewGroup)this, true);
        this.a = (TextView)this.findViewById(2131886605);
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131558911);
        (this.b = (UserImageView)this.findViewById(2131886609)).setSize(dimensionPixelSize);
        (this.c = (UserImageView)this.findViewById(2131886614)).setSize(dimensionPixelSize);
        this.d = (TextView)this.findViewById(2131886611);
        this.e = (TextView)this.findViewById(2131886616);
        this.f = (TextView)this.findViewById(2131886612);
        this.g = (TextView)this.findViewById(2131886617);
    }
    
    private void a(final View view, final long n, final String s) {
        if (n != 0L && !TextUtils.isEmpty((CharSequence)s)) {
            view.setClickable(true);
            view.setOnClickListener((View$OnClickListener)new b(this, n));
            return;
        }
        view.setClickable(false);
    }
    
    public void a() {
        this.setVisibility(8);
    }
    
    public void a(final TwitterTopic$SportsEvent$Player twitterTopic$SportsEvent$Player, final TwitterTopic$SportsEvent$Player twitterTopic$SportsEvent$Player2) {
        this.b.a(twitterTopic$SportsEvent$Player.logoUrl);
        this.c.a(twitterTopic$SportsEvent$Player2.logoUrl);
        this.a((View)this.b, twitterTopic$SportsEvent$Player.userId, twitterTopic$SportsEvent$Player.name);
        this.a((View)this.c, twitterTopic$SportsEvent$Player2.userId, twitterTopic$SportsEvent$Player2.name);
        this.d.setText((CharSequence)twitterTopic$SportsEvent$Player.abbreviation);
        this.e.setText((CharSequence)twitterTopic$SportsEvent$Player2.abbreviation);
    }
    
    public void a(final String text, final String text2) {
        this.f.setText((CharSequence)text);
        this.g.setText((CharSequence)text2);
    }
    
    public void b() {
        this.setVisibility(0);
    }
    
    public View getView() {
        return (View)this;
    }
    
    public void setGameStatusDate(final long n) {
        q.a().a(this.a, n, this.getResources(), true, true);
    }
    
    public void setGameStatusText(final String text) {
        this.a.setText((CharSequence)text);
    }
}
