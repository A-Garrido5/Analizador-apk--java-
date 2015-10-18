// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports;

import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.text.TextUtils;
import android.widget.TextView;
import android.content.Intent;
import com.twitter.android.SearchActivity;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import com.twitter.android.events.TwitterEventActivity;
import android.content.Context;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.HashMap;

public class b
{
    private static final String a;
    private static b b;
    private HashMap c;
    private HashMap d;
    
    static {
        a = Pattern.quote("|");
    }
    
    private b() {
        (this.c = new HashMap(2)).put(0, new ArrayList());
        this.c.put(1, new ArrayList());
        (this.d = new HashMap(2)).put(0, false);
        this.d.put(1, false);
    }
    
    public static b a() {
        if (com.twitter.android.events.sports.b.b == null) {
            com.twitter.android.events.sports.b.b = new b();
        }
        return com.twitter.android.events.sports.b.b;
    }
    
    private void a(final Context context, final int n, final TwitterEventActivity twitterEventActivity, final boolean b, final String s, final String s2) {
        final ArrayList b2 = this.b(n);
        if (b2.isEmpty()) {
            if (this.a(n)) {
                this.a(n, false);
            }
            twitterEventActivity.finish();
            return;
        }
        final int size = b2.size();
        if (!b && size == 1) {
            this.a(n, true);
            com.twitter.android.client.c.a(context).a(az.a(context).b().g(), "search:games:" + s + ":back_button:click");
            context.startActivity(new Intent(context, (Class)SearchActivity.class).putExtra("query", s2));
        }
        else if (this.a(n)) {
            this.a(n, false);
        }
        if (size >= 1) {
            b2.remove(size - 1);
        }
        twitterEventActivity.finish();
    }
    
    protected static void a(final TextView textView, final String text) {
        if (textView != null) {
            if (TextUtils.isEmpty((CharSequence)text)) {
                textView.setVisibility(8);
                return;
            }
            textView.setText((CharSequence)text);
            textView.setVisibility(0);
        }
    }
    
    public static void a(final String s, final TextView textView, final TextView textView2, final String s2) {
        if (!com.twitter.android.events.b.b(s2)) {
            a(textView, s);
            textView2.setVisibility(8);
            return;
        }
        if (TextUtils.isEmpty((CharSequence)s)) {
            textView.setVisibility(8);
            textView2.setVisibility(8);
            return;
        }
        final String[] split = s.split(com.twitter.android.events.sports.b.a);
        if (TextUtils.isEmpty((CharSequence)split[0]) || TextUtils.isEmpty((CharSequence)split[1])) {
            textView2.setVisibility(8);
            return;
        }
        a(textView, split[0]);
        if (split[1].indexOf(40) == -1 || split[1].indexOf(41) == -1) {
            a(textView2, split[1]);
            return;
        }
        a(textView2, split[1].substring(1 + split[1].indexOf(40), split[1].indexOf(41)));
    }
    
    private void a(final boolean b, final Context context, final int n, final TwitterEventActivity twitterEventActivity, final String s, final String s2, final int n2, final String s3) {
        if (b && context.getSharedPreferences(s2, 0).getBoolean("show_create_shortcut", true) && !TextUtils.isEmpty((CharSequence)s2) && !TextUtils.isEmpty((CharSequence)s3)) {
            new AlertDialog$Builder(context).setMessage((CharSequence)context.getString(2131296951, new Object[] { s3 })).setPositiveButton(2131298158, (DialogInterface$OnClickListener)new e(this, context, s2, n2, n, twitterEventActivity, b, s)).setNegativeButton(2131297303, (DialogInterface$OnClickListener)new d(this, context, s2, n, twitterEventActivity, b, s)).setOnCancelListener((DialogInterface$OnCancelListener)new com.twitter.android.events.sports.c(this, context, n, twitterEventActivity, b, s, s2)).create().show();
            return;
        }
        this.a(context, n, twitterEventActivity, b, s, s2);
    }
    
    public void a(final int n, final boolean b) {
        this.d.put(n, b);
    }
    
    public void a(final boolean b, final Context context, final int n, final TwitterEventActivity twitterEventActivity, final String s, final String s2) {
        switch (n) {
            default: {}
            case 1: {
                this.a(b, context, n, twitterEventActivity, s, com.twitter.library.featureswitch.d.g("soccer_experience_tournament_hashtag_takeover"), 2130839275, s2);
            }
            case 0: {
                this.a(b, context, n, twitterEventActivity, s, com.twitter.library.featureswitch.d.g("cricket_experience_tournament_hashtag_takeover"), 2130839274, s2);
            }
        }
    }
    
    public boolean a(final int n) {
        return this.d.get(n);
    }
    
    public ArrayList b(final int n) {
        return this.c.get(n);
    }
}
