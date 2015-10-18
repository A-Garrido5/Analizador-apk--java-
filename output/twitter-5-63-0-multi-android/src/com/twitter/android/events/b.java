// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events;

import android.text.TextUtils;
import com.twitter.library.api.search.g;
import com.twitter.library.featureswitch.d;
import com.twitter.android.events.sports.nba.NBALandingActivity;
import com.twitter.android.events.sports.soccer.SoccerLandingActivity;
import com.twitter.android.events.sports.cricket.CricketLandingActivity;
import com.twitter.android.EventLandingActivity;
import com.twitter.android.EventLandingChildActivity;
import android.os.Parcelable;
import android.os.Bundle;
import com.twitter.android.widget.TopicView$TopicData;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

public class b
{
    public static final Set a;
    
    static {
        a = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList("SPORTSCRICKETWC", "NFL", "SPORTSSOCCER", "SPORTSNBA")));
    }
    
    public static Bundle a(final String s, final TopicView$TopicData topicView$TopicData) {
        final Bundle bundle = new Bundle();
        switch (s) {
            default: {
                return bundle;
            }
            case "NFL":
            case "SOCCER":
            case "BASKETBALL":
            case "CRICKET": {
                bundle.putBoolean("search_takeover", false);
                bundle.putParcelable("topic_data", (Parcelable)topicView$TopicData);
                bundle.putString("event_subtype", s);
                return bundle;
            }
        }
    }
    
    public static Class a(final String s, final boolean b) {
        switch (s) {
            default: {
                return null;
            }
            case "NFL": {
                if (b) {
                    return EventLandingChildActivity.class;
                }
                return EventLandingActivity.class;
            }
            case "CRICKET": {
                return CricketLandingActivity.class;
            }
            case "SOCCER": {
                return SoccerLandingActivity.class;
            }
            case "BASKETBALL": {
                return NBALandingActivity.class;
            }
        }
    }
    
    public static String a(final String s, final int n) {
        if (2 == n) {
            if (c(s) && d.f("search_features_nfl_enabled")) {
                return "NFL";
            }
            if (b(s) && d.f("cricket_experience_enabled")) {
                return "CRICKET";
            }
            if (d(s) && d.f("soccer_experience_enabled")) {
                return "SOCCER";
            }
            if (e(s) && d.f("nba_finals_timeline_android_game_enabled")) {
                return "BASKETBALL";
            }
        }
        return "NONE";
    }
    
    public static void a(final g g) {
        if (g != null) {
            if (d.a("ip_android_cricket_v2_2755", new String[] { "cricket_experience" })) {
                g.a("cricket");
            }
            if (d.a("ip_android_soccer_v1_3046", new String[] { "soccer_bucket" })) {
                g.a("soccer");
            }
            if (d.f("nba_finals_timeline_android_game_enabled")) {
                g.a("basketball");
            }
        }
    }
    
    public static boolean a(final String s) {
        return b.a.contains(s);
    }
    
    public static boolean a(final String s, final String s2) {
        if (s != null) {
            switch (s) {
                default: {
                    return false;
                }
                case "NFL": {
                    return d.f("search_features_nfl_enabled");
                }
                case "CRICKET": {
                    if (TextUtils.isEmpty((CharSequence)s2)) {
                        break;
                    }
                    if ("LEAGUE".equals(s2.toUpperCase())) {
                        return d.f("cricket_experience_league_enabled");
                    }
                    if ("GAME".equals(s2.toUpperCase())) {
                        return d.f("cricket_experience_game_enabled");
                    }
                    break;
                }
                case "SOCCER": {
                    if (TextUtils.isEmpty((CharSequence)s2)) {
                        break;
                    }
                    if ("LEAGUE".equals(s2.toUpperCase())) {
                        return d.f("soccer_experience_league_enabled");
                    }
                    if ("GAME".equals(s2.toUpperCase())) {
                        return d.f("soccer_experience_game_enabled");
                    }
                    break;
                }
                case "BASKETBALL": {
                    if (!TextUtils.isEmpty((CharSequence)s2) && "GAME".equals(s2.toUpperCase())) {
                        return d.f("nba_finals_timeline_android_game_enabled");
                    }
                    break;
                }
            }
        }
        return false;
    }
    
    public static boolean b(final String s) {
        return s != null && s.toUpperCase().startsWith("CRICKET");
    }
    
    public static boolean c(final String s) {
        return s != null && s.toUpperCase().startsWith("NFL");
    }
    
    public static boolean d(final String s) {
        return s != null && s.toUpperCase().startsWith("SOCCER");
    }
    
    public static boolean e(final String s) {
        return s != null && s.toUpperCase().startsWith("BASKETBALL");
    }
    
    public static boolean f(final String s) {
        return b(s) || d(s);
    }
}
