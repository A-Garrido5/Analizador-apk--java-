// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports.cricket;

import android.view.View$OnClickListener;
import com.twitter.library.api.TwitterTopic$SportsEvent$Player;
import android.view.View;
import com.twitter.library.media.manager.j;
import android.text.TextUtils;
import android.content.res.Resources;
import com.twitter.library.media.manager.k;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;
import android.content.Context;

public class b
{
    public static void a(final Context context, final String s, final MediaImageView mediaImageView, final TextView textView, final TextView textView2, boolean b) {
        if (s != null) {
            if (s.indexOf(45) <= 0) {
                b = true;
            }
            else {
                b = false;
            }
        }
        final Resources resources = context.getResources();
        int n;
        if (b) {
            n = 2130838835;
        }
        else {
            n = 2130838834;
        }
        mediaImageView.setDefaultDrawable(resources.getDrawable(n));
        mediaImageView.a((k)null);
        int n2;
        if (b) {
            n2 = 2131296381;
        }
        else {
            n2 = 2131296375;
        }
        textView.setText((CharSequence)resources.getString(n2));
        textView.requestLayout();
        textView2.setVisibility(8);
    }
    
    private static void a(final Context context, final String s, final String text, final String s2, final TextView textView, final TextView textView2, final MediaImageView mediaImageView) {
        final int index = s.indexOf(45);
        boolean b;
        if (index > 0) {
            b = true;
        }
        else {
            b = false;
        }
        final Resources resources = context.getResources();
        if (!TextUtils.isEmpty((CharSequence)s)) {
            textView.setVisibility(0);
            String string;
            if (b) {
                string = s.substring(0, index) + '/' + s.substring(index + 1);
            }
            else {
                string = s;
            }
            textView.setText((CharSequence)string);
            int n;
            if (b) {
                n = 2130838835;
            }
            else {
                n = 2130838834;
            }
            mediaImageView.setDefaultDrawable(resources.getDrawable(n));
        }
        else {
            mediaImageView.setDefaultDrawable(resources.getDrawable(2130838836));
        }
        mediaImageView.a((k)null);
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            mediaImageView.a(j.a(s2));
        }
        if (!TextUtils.isEmpty((CharSequence)text)) {
            textView2.setText((CharSequence)text);
        }
        else if (!TextUtils.isEmpty((CharSequence)s)) {
            int n2;
            if (b) {
                n2 = 2131296381;
            }
            else {
                n2 = 2131296375;
            }
            textView2.setText((CharSequence)resources.getString(n2));
        }
        textView2.requestLayout();
    }
    
    public static void a(final View view, final Context context, final TwitterTopic$SportsEvent$Player twitterTopic$SportsEvent$Player, final TextView textView, final TextView textView2, final MediaImageView mediaImageView) {
        view.setVisibility(0);
        if (twitterTopic$SportsEvent$Player.userId > 0L) {
            view.setOnClickListener((View$OnClickListener)new c(context, twitterTopic$SportsEvent$Player));
        }
        a(context, twitterTopic$SportsEvent$Player.score, twitterTopic$SportsEvent$Player.abbreviation, twitterTopic$SportsEvent$Player.logoUrl, textView, textView2, mediaImageView);
    }
}
