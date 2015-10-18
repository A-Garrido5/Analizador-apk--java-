// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports.cricket;

import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.util.f;
import com.twitter.library.api.TwitterTopic$SportsEvent;
import com.twitter.android.widget.TopicView$TopicData;
import com.twitter.library.api.TwitterTopic$SportsEvent$Player;
import java.util.List;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;

public class CricketPlayerCardView extends LinearLayout
{
    private Context a;
    private final PlayerItemViewLeft b;
    private final PlayerItemViewLeft c;
    private final PlayerItemViewRight d;
    private final PlayerItemViewRight e;
    
    public CricketPlayerCardView(final Context context) {
        this(context, null, 0);
    }
    
    public CricketPlayerCardView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public CricketPlayerCardView(final Context a, final AttributeSet set, final int n) {
        super(a, set, n);
        this.a = a;
        LayoutInflater.from(this.a).inflate(2130968703, (ViewGroup)this, true);
        this.b = (PlayerItemViewLeft)this.findViewById(2131886598);
        this.c = (PlayerItemViewLeft)this.findViewById(2131886600);
        this.d = (PlayerItemViewRight)this.findViewById(2131886599);
        this.e = (PlayerItemViewRight)this.findViewById(2131886601);
    }
    
    private void a() {
        this.b.setVisibility(8);
        this.b.setOnClickListener((View$OnClickListener)null);
        this.c.setVisibility(8);
        this.c.setOnClickListener((View$OnClickListener)null);
        this.d.setVisibility(8);
        this.d.setOnClickListener((View$OnClickListener)null);
        this.e.setVisibility(8);
        this.e.setOnClickListener((View$OnClickListener)null);
    }
    
    private void a(final List list, final boolean b) {
        if (list != null && list.size() > 0) {
            if (b) {
                this.b.a(list.get(0));
                if (list.size() == 2) {
                    this.c.a(list.get(1));
                }
            }
            else {
                this.d.a(list.get(0));
                if (list.size() == 2) {
                    this.e.a(list.get(1));
                }
            }
        }
    }
    
    public void a(final TopicView$TopicData topicView$TopicData) {
        this.a();
        final TwitterTopic$SportsEvent twitterTopic$SportsEvent = (TwitterTopic$SportsEvent)f.a(topicView$TopicData.m);
        if (twitterTopic$SportsEvent == null) {
            this.setVisibility(8);
        }
        else {
            final List secondaryPlayers = twitterTopic$SportsEvent.secondaryPlayers;
            final String trim = twitterTopic$SportsEvent.status.trim();
            if ("COMPLETED".equals(trim) || "SCHEDULED".equals(trim) || secondaryPlayers == null || secondaryPlayers.size() == 0) {
                this.setVisibility(8);
                return;
            }
            this.setVisibility(0);
            final List players = twitterTopic$SportsEvent.players;
            String playerType;
            String playerType2;
            if (players != null && players.size() > 0) {
                if (players.get(0) != null) {
                    playerType = players.get(0).playerType;
                }
                else {
                    playerType = null;
                }
                final TwitterTopic$SportsEvent$Player value = players.get(1);
                playerType2 = null;
                if (value != null) {
                    playerType2 = players.get(1).playerType;
                }
            }
            else {
                playerType = null;
                playerType2 = null;
            }
            final ArrayList<TwitterTopic$SportsEvent$Player> list = new ArrayList<TwitterTopic$SportsEvent$Player>();
            final ArrayList<TwitterTopic$SportsEvent$Player> list2 = new ArrayList<TwitterTopic$SportsEvent$Player>();
            for (final TwitterTopic$SportsEvent$Player twitterTopic$SportsEvent$Player : secondaryPlayers) {
                if (twitterTopic$SportsEvent$Player.playerType.equals(playerType)) {
                    list.add(twitterTopic$SportsEvent$Player);
                }
                else {
                    list2.add(twitterTopic$SportsEvent$Player);
                }
            }
            if (playerType != null) {
                this.a(list, true);
            }
            if (playerType2 != null) {
                this.a(list2, false);
            }
            if (list.size() > 0 && list2.size() == 0) {
                this.d.setVisibility(0);
                com.twitter.android.events.sports.cricket.b.a(this.a, ((TwitterTopic$SportsEvent$Player)list.get(0)).score, this.d.c, this.d.b, this.d.a, false);
                return;
            }
            if (list.size() == 0 && list2.size() > 0) {
                this.b.setVisibility(0);
                com.twitter.android.events.sports.cricket.b.a(this.a, ((TwitterTopic$SportsEvent$Player)list2.get(0)).score, this.b.c, this.b.b, this.b.a, false);
            }
        }
    }
}
