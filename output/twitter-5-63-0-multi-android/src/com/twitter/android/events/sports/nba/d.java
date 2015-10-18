// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports.nba;

import java.util.List;
import com.twitter.util.q;
import com.twitter.library.api.TwitterTopic$SportsEvent$Player;
import com.twitter.util.f;
import com.twitter.library.api.TwitterTopic$SportsEvent;
import com.twitter.android.widget.TopicView$TopicData;

public class d implements c
{
    private final a a;
    
    public d(final a a) {
        this.a = a;
    }
    
    @Override
    public void a(final TopicView$TopicData topicView$TopicData) {
        final TwitterTopic$SportsEvent twitterTopic$SportsEvent = (TwitterTopic$SportsEvent)f.a(topicView$TopicData.m);
        if (twitterTopic$SportsEvent == null || twitterTopic$SportsEvent.status == null || twitterTopic$SportsEvent.players == null) {
            this.a.a();
            return;
        }
        this.a.b();
        final List players = twitterTopic$SportsEvent.players;
        if (players == null || players.get(0) == null || players.get(1) == null) {
            this.a.a();
            return;
        }
        TwitterTopic$SportsEvent$Player twitterTopic$SportsEvent$Player;
        TwitterTopic$SportsEvent$Player twitterTopic$SportsEvent$Player2;
        if (players.get(0).playerType.equals("AWAY")) {
            twitterTopic$SportsEvent$Player = players.get(0);
            twitterTopic$SportsEvent$Player2 = players.get(1);
        }
        else {
            twitterTopic$SportsEvent$Player = players.get(1);
            twitterTopic$SportsEvent$Player2 = players.get(0);
        }
        this.a.a(twitterTopic$SportsEvent$Player, twitterTopic$SportsEvent$Player2);
        if ("IN_PROGRESS".equals(twitterTopic$SportsEvent.status) || "COMPLETED".equals(twitterTopic$SportsEvent.status)) {
            if (twitterTopic$SportsEvent$Player.score == null || twitterTopic$SportsEvent$Player2.score == null) {
                this.a.a();
                return;
            }
            final a a = this.a;
            String score;
            if (q.a(twitterTopic$SportsEvent$Player.score)) {
                score = "-";
            }
            else {
                score = twitterTopic$SportsEvent$Player.score;
            }
            String score2;
            if (q.a(twitterTopic$SportsEvent$Player2.score)) {
                score2 = "-";
            }
            else {
                score2 = twitterTopic$SportsEvent$Player2.score;
            }
            a.a(score, score2);
        }
        if (q.a(twitterTopic$SportsEvent.summary)) {
            this.a.setGameStatusDate(topicView$TopicData.l);
            return;
        }
        this.a.setGameStatusText(twitterTopic$SportsEvent.summary);
    }
}
