// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.app.FragmentActivity;
import com.twitter.library.api.TwitterTopic;
import java.io.Serializable;
import com.twitter.library.util.bn;
import com.twitter.android.events.b;
import java.util.ArrayList;
import android.content.Intent;
import com.twitter.android.widget.TopicView$TopicData;
import android.content.Context;
import android.support.v4.app.Fragment;
import java.lang.ref.WeakReference;

public class uk
{
    private final WeakReference a;
    
    public uk(final Fragment fragment) {
        this.a = new WeakReference((T)fragment);
    }
    
    public static Intent a(final Context context, final String s, final int n, final String s2, final String s3, final String s4, final String s5, final boolean b, final TopicView$TopicData topicView$TopicData) {
        return a(context, s, n, s2, s3, s4, s5, b, topicView$TopicData, false, null);
    }
    
    public static Intent a(final Context context, final String s, final int n, final String s2, final String s3, final String s4, final String s5, final boolean b, final TopicView$TopicData topicView$TopicData, final ArrayList list) {
        return a(context, s, n, s2, s3, s4, s5, b, topicView$TopicData, false, list);
    }
    
    public static Intent a(final Context context, final String s, final int n, final String s2, final String s3, final String s4, final String s5, final boolean b, final TopicView$TopicData topicView$TopicData, final boolean b2, final ArrayList list) {
        String s6 = null;
        boolean b3 = false;
        switch (n) {
            default: {
                s6 = null;
                b3 = false;
                break;
            }
            case 1:
            case 3: {
                if (b) {
                    s6 = "promoted_trend_click";
                }
                else {
                    s6 = "trend_click";
                }
                b3 = (n == 1);
                break;
            }
            case 2: {
                s6 = "spev";
                b3 = true;
                break;
            }
        }
        final String a = b.a(s, n);
        final Intent putExtra = new Intent(context, a(a, b2, b3)).putExtra("query_name", s2).putExtra("query", bn.b(s3, "UTF8")).putExtra("seed_hashtag", s5).putExtra("event_type", n).putExtra("scribe_context", s4).putExtra("terminal", b3).putExtra("search_button", b3).putExtra("pinnedTweetIds", (Serializable)list).putExtra("q_source", s6);
        putExtra.putExtras(b.a(a, topicView$TopicData));
        if (n == 1) {
            if (b) {
                putExtra.putExtra("q_type", 8);
            }
            else {
                putExtra.putExtra("q_type", 1);
            }
        }
        if (!TwitterTopic.b(s)) {
            putExtra.putExtra("event_id", s);
        }
        return putExtra;
    }
    
    private static Class a(final String s, final boolean b, final boolean b2) {
        final Class a = b.a(s, b);
        if (a != null) {
            return a;
        }
        switch (s) {
            default: {
                return SearchActivity.class;
            }
            case "NONE": {
                if (b2) {
                    return SearchTerminalActivity.class;
                }
                return SearchActivity.class;
            }
        }
    }
    
    public void a(final String s, final int n, final String s2, final String s3, final String s4, final TopicView$TopicData topicView$TopicData) {
        final Fragment fragment = (Fragment)this.a.get();
        if (fragment != null) {
            final FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                fragment.startActivity(a((Context)activity, s, n, s2, s3, null, s4, false, topicView$TopicData));
            }
        }
    }
}
