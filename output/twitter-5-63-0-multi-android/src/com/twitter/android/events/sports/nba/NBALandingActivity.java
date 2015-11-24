// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports.nba;

import android.view.View;
import java.util.Arrays;
import java.util.List;
import com.twitter.android.widget.TopicView$TopicData;
import android.content.Context;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.android.events.TwitterEventActivity;

public class NBALandingActivity extends TwitterEventActivity
{
    private a y;
    private c z;
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.y = new NBAScoreCardImpl((Context)this);
        this.z = new d(this.y);
        super.b(bundle, bn);
    }
    
    public void b(final TopicView$TopicData topicView$TopicData) {
        this.z.a(topicView$TopicData);
    }
    
    @Override
    protected List d() {
        return Arrays.asList(this.a(NBALandingActivity.a, 0, this.getString(2131297992), "tweets"), this.a(NBALandingActivity.b, 1, this.getString(2131297621), "commentary"), this.a(NBALandingActivity.e, 2, this.getString(2131297628), "video"));
    }
    
    @Override
    protected String h() {
        return "nba_finals";
    }
    
    public View k() {
        return this.y.getView();
    }
    
    @Override
    protected boolean n() {
        return true;
    }
}
