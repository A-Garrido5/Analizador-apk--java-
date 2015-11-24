// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import com.twitter.android.profiles.g;
import android.graphics.Bitmap;
import com.twitter.library.media.widget.BaseMediaImageView;
import android.view.ViewGroup;
import android.text.TextUtils;
import android.database.Cursor;
import com.twitter.library.media.widget.BaseMediaImageView$ScaleType;
import com.twitter.library.media.widget.MediaImageView;
import android.view.View;
import android.content.Context;
import android.widget.TextView;
import com.twitter.library.media.widget.o;

public class e implements o
{
    public final TextView a;
    public String b;
    public String c;
    public String d;
    public long e;
    public String f;
    public String g;
    public String h;
    private final Context i;
    private final View j;
    private final TextView k;
    private final TextView l;
    private final TextView m;
    private final MediaImageView n;
    
    public e(final View j, final Context i) {
        this.j = j;
        this.i = i;
        (this.n = (MediaImageView)j.findViewById(2131886415)).setScaleType(BaseMediaImageView$ScaleType.b);
        this.n.setOnImageLoadedListener(this);
        this.k = (TextView)j.findViewById(2131886307);
        this.l = (TextView)j.findViewById(2131886396);
        this.m = (TextView)j.findViewById(2131886397);
        this.a = (TextView)j.findViewById(2131886393);
    }
    
    public int a() {
        return this.k.getHeight();
    }
    
    public void a(final Cursor cursor) {
        this.b = cursor.getString(1);
        this.c = cursor.getString(2);
        this.d = cursor.getString(3);
        this.h = cursor.getString(4);
        this.e = cursor.getLong(6);
        this.f = cursor.getString(7);
        this.g = cursor.getString(8);
        this.a.setText((CharSequence)("@" + this.g));
        this.k.setText((CharSequence)this.c);
        if (this.l != null) {
            if (!TextUtils.isEmpty((CharSequence)this.d)) {
                this.l.setText((CharSequence)this.d);
                this.l.setVisibility(0);
            }
            else {
                this.l.setVisibility(8);
            }
        }
        if (this.m != null) {
            this.m.setVisibility(8);
        }
        this.j.setVisibility(0);
    }
    
    public void a(final ViewGroup viewGroup) {
        if (this.j.getParent() == null) {
            viewGroup.addView(this.j);
        }
    }
    
    public void a(final MediaImageView mediaImageView, final Bitmap bitmap) {
        if (this.i instanceof o) {
            ((o)this.i).a(mediaImageView, bitmap);
        }
    }
    
    public void a(final String s) {
        this.n.a(com.twitter.android.profiles.g.a(s));
    }
    
    public int b() {
        return this.n.getHeight();
    }
}
