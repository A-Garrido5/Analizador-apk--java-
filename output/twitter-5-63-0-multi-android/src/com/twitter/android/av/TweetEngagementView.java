// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import android.support.v4.app.FragmentActivity;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.provider.Tweet;
import com.twitter.android.widget.EngagementActionBar;
import android.view.ViewGroup;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.media.widget.UserImageView;
import android.widget.TextView;
import android.widget.RelativeLayout;

public class TweetEngagementView extends RelativeLayout implements ab
{
    private final TextView a;
    private final UserImageView b;
    private z c;
    private ab d;
    
    public TweetEngagementView(final Context context, final AttributeSet set) {
        super(context, set);
        View.inflate(context, 2130968599, (ViewGroup)this);
        this.a = (TextView)this.findViewById(2131886286);
        this.b = (UserImageView)this.findViewById(2131886285);
        final EngagementActionBar engagementActionBar = (EngagementActionBar)this.findViewById(2131886227);
        engagementActionBar.setBackgroundColor(0);
        this.c = new z(null, engagementActionBar, this);
    }
    
    public void a(final String s) {
        if (this.d != null) {
            this.d.a(s);
        }
    }
    
    public void setContext(final Context context) {
        this.c.a(context);
    }
    
    public void setFragmentActivity(final TwitterFragmentActivity twitterFragmentActivity) {
        this.c.a(twitterFragmentActivity);
    }
    
    public void setScriber(final ab d) {
        this.d = d;
    }
    
    public void setTweet(final Tweet tweet) {
        this.a.setText((CharSequence)this.getContext().getString(2131296354, new Object[] { tweet.a() }));
        this.b.a(tweet.B);
        this.c.a(tweet);
    }
}
