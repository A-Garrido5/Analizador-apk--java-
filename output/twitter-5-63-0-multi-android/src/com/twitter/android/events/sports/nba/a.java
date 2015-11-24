// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports.nba;

import android.view.View;
import com.twitter.library.api.TwitterTopic$SportsEvent$Player;

public interface a
{
    void a();
    
    void a(final TwitterTopic$SportsEvent$Player p0, final TwitterTopic$SportsEvent$Player p1);
    
    void a(final String p0, final String p1);
    
    void b();
    
    View getView();
    
    void setGameStatusDate(final long p0);
    
    void setGameStatusText(final String p0);
}
