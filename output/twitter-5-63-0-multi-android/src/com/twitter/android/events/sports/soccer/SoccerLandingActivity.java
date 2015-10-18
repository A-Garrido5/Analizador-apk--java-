// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports.soccer;

import android.view.View;
import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.android.widget.TopicView$TopicData;
import com.twitter.android.events.sports.b;
import android.content.Context;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.content.res.Resources;
import android.text.TextUtils;
import com.twitter.library.featureswitch.d;
import java.util.List;
import com.twitter.android.events.TwitterEventActivity;

public class SoccerLandingActivity extends TwitterEventActivity
{
    private SoccerScoreCardView y;
    
    private boolean a(final List list, final int n) {
        final String g = com.twitter.library.featureswitch.d.g("soccer_experience_media_tab");
        final Resources resources = this.getResources();
        if (TextUtils.isEmpty((CharSequence)g)) {
            return false;
        }
        final String lowerCase = g.toLowerCase();
        int n2 = 0;
        Label_0067: {
            switch (lowerCase.hashCode()) {
                case -816678056: {
                    if (lowerCase.equals("videos")) {
                        n2 = 0;
                        break Label_0067;
                    }
                    break;
                }
                case 103772132: {
                    if (lowerCase.equals("media")) {
                        n2 = 1;
                        break Label_0067;
                    }
                    break;
                }
                case -989034367: {
                    if (lowerCase.equals("photos")) {
                        n2 = 2;
                        break Label_0067;
                    }
                    break;
                }
            }
            n2 = -1;
        }
        switch (n2) {
            default: {
                list.add(this.a(SoccerLandingActivity.d, n, resources.getString(2131297626), "highlights"));
                return true;
            }
            case 0: {
                list.add(this.a(SoccerLandingActivity.e, n, resources.getString(2131297917), "highlights"));
                return true;
            }
            case 1: {
                list.add(this.a(SoccerLandingActivity.c, n, resources.getString(2131297626), "highlights"));
                return true;
            }
        }
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.y = new SoccerScoreCardView((Context)this);
        super.b(bundle, bn);
        if (bundle == null) {
            com.twitter.android.events.sports.b.a().b(1).add(this.i);
        }
    }
    
    @Override
    protected void b(final TopicView$TopicData topicView$TopicData) {
        this.y.a(topicView$TopicData);
    }
    
    @Override
    protected List d() {
        ArrayList list;
        if (this.g) {
            list = com.twitter.library.featureswitch.d.h("soccer_experience_league_tabs");
        }
        else {
            list = com.twitter.library.featureswitch.d.h("soccer_experience_game_tabs");
        }
        final ArrayList list2 = new ArrayList<gm>(list.size());
        if (list.isEmpty()) {
            list2.add(this.a(SoccerLandingActivity.a, 0, this.getString(2131297085), "tweets"));
        }
        else {
            final Iterator<String> iterator = list.iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final String lowerCase = iterator.next().toLowerCase();
                int n3 = 0;
                switch (lowerCase) {
                    default: {
                        n3 = n;
                        break;
                    }
                    case "matches": {
                        list2.add(this.a(SoccerLandingActivity.f, n, this.getString(2131297912), "games"));
                        n3 = n + 1;
                        break;
                    }
                    case "photos": {
                        if (this.a(list2, n)) {
                            ++n;
                        }
                        n3 = n;
                        break;
                    }
                    case "official": {
                        list2.add(this.a(SoccerLandingActivity.b, n, this.getString(2131297621), "commentary"));
                        n3 = n + 1;
                        break;
                    }
                    case "tweets": {
                        list2.add(this.a(SoccerLandingActivity.a, n, this.getString(2131297085), "tweets"));
                        n3 = n + 1;
                        break;
                    }
                }
                n = n3;
            }
        }
        return list2;
    }
    
    protected void g_() {
        final ArrayList b = com.twitter.android.events.sports.b.a().b(1);
        if (b != null && b.size() >= 1) {
            b.remove(-1 + b.size());
        }
        super.g_();
    }
    
    @Override
    protected String h() {
        return "soccer";
    }
    
    @Override
    protected View k() {
        return (View)this.y;
    }
    
    @Override
    protected boolean n() {
        return true;
    }
    
    public void onBackPressed() {
        if (com.twitter.library.featureswitch.d.f("soccer_experience_custom_back_and_shortcut")) {
            com.twitter.android.events.sports.b.a().a(this.g, (Context)this, 1, this, this.h(), this.j);
            return;
        }
        super.onBackPressed();
    }
    
    @Override
    protected boolean z() {
        return this.g;
    }
}
