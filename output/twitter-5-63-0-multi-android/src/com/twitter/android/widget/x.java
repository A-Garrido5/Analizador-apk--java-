// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.ViewGroup;
import android.text.TextUtils;
import com.twitter.util.f;
import com.twitter.library.api.TwitterTopic$TwitterList;
import android.database.Cursor;
import android.content.Context;
import com.twitter.library.featureswitch.d;
import android.view.View;
import com.twitter.ui.widget.TwitterButton;
import android.widget.TextView;

public class x
{
    public final TextView a;
    public final TwitterButton b;
    public final TwitterButton c;
    public String d;
    public String e;
    public String f;
    public long g;
    public String h;
    public String i;
    public String j;
    public boolean k;
    private final View l;
    private final TextView m;
    private final TextView n;
    private final TextView o;
    
    public x(final View l) {
        this.l = l;
        this.m = (TextView)l.findViewById(2131886307);
        this.n = (TextView)l.findViewById(2131886396);
        this.o = (TextView)l.findViewById(2131886397);
        this.a = (TextView)l.findViewById(2131886393);
        this.b = (TwitterButton)l.findViewById(2131886394);
        this.c = (TwitterButton)l.findViewById(2131886395);
    }
    
    public void a(final long n) {
        if (this.b == null || this.c == null) {
            return;
        }
        int n2;
        if (this.g != n && com.twitter.library.featureswitch.d.f("custom_timelines_follow_enabled")) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 == 0) {
            this.b.setVisibility(8);
            this.c.setVisibility(8);
            return;
        }
        if (this.k) {
            this.b.setVisibility(8);
            this.c.setVisibility(0);
            return;
        }
        this.b.setVisibility(0);
        this.c.setVisibility(8);
    }
    
    public void a(final Context context, final Cursor cursor) {
        this.k = (((TwitterTopic$TwitterList)com.twitter.util.f.a(cursor.getBlob(5))).followStatus == 1);
        this.d = cursor.getString(1);
        this.e = cursor.getString(2);
        this.f = cursor.getString(3);
        this.j = cursor.getString(4);
        this.g = cursor.getLong(6);
        this.h = cursor.getString(7);
        this.i = cursor.getString(8);
        this.a.setText((CharSequence)context.getString(2131297149, new Object[] { this.h, this.i }));
        this.m.setText((CharSequence)this.e);
        if (this.n != null) {
            if (!TextUtils.isEmpty((CharSequence)this.f)) {
                this.n.setText((CharSequence)this.f);
                this.n.setVisibility(0);
            }
            else {
                this.n.setVisibility(8);
            }
        }
        if (this.o != null) {
            this.o.setVisibility(8);
        }
        this.l.setVisibility(0);
    }
    
    public void a(final ViewGroup viewGroup) {
        if (this.l.getParent() == null) {
            viewGroup.addView(this.l);
        }
    }
    
    public void a(final boolean b) {
        if (b) {
            this.a.setVisibility(0);
            return;
        }
        this.a.setVisibility(8);
    }
}
