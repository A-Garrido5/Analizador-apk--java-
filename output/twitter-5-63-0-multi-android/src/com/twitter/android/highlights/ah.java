// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.view.View;
import com.twitter.android.SearchActivity;
import android.content.Intent;
import android.content.Context;
import android.text.TextUtils;
import android.database.Cursor;

public class ah extends al
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    private final int t;
    
    public ah(final String s, final long n, final mx mx, final boolean b, final String s2, final String s3, final int t, final String s4, final String a, final String c, final String b2, final String d, final int m, final Cursor cursor) {
        super(s, n, mx, b, s2, s3, s4, c, cursor);
        this.a = a;
        this.b = b2;
        this.t = t;
        if (c.startsWith("http://") || c.startsWith("https://")) {
            this.c = c;
            this.p = false;
        }
        else {
            this.c = "twitter://search?q=" + this.r;
            this.p = true;
        }
        this.d = d;
        this.m = m;
        this.n = !TextUtils.isEmpty((CharSequence)d);
        this.o = !TextUtils.isEmpty((CharSequence)a);
    }
    
    @Override
    public int a() {
        return this.t;
    }
    
    @Override
    public Intent a(final Context context) {
        return new Intent(context, (Class)SearchActivity.class).putExtra("query", this.r).putExtra("q_source", "timeline").putExtra("extra_up_as_back", true);
    }
    
    @Override
    public ag a(final View view) {
        return new ai(view, this.t);
    }
    
    @Override
    public String b() {
        switch (this.t) {
            default: {
                return "TYPE_URL";
            }
            case 6: {
                return "TYPE_HASHTAG";
            }
            case 7: {
                return "TYPE_TREND";
            }
            case 8: {
                return "TYPE_NEWS";
            }
        }
    }
}
