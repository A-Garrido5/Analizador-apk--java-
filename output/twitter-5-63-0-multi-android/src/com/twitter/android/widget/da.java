// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import java.util.Iterator;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.widget.ListView;
import java.util.HashMap;
import java.util.ArrayList;
import com.twitter.library.util.bk;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.android.xb;
import android.view.View;
import android.content.Context;
import com.twitter.library.provider.Tweet;
import java.lang.ref.WeakReference;

class da
{
    public boolean a;
    public boolean b;
    public long c;
    public WeakReference d;
    final /* synthetic */ cz e;
    private final Tweet f;
    private final Context g;
    
    public da(final cz e, final View view, final Tweet f, final Context g) {
        this.e = e;
        this.a = false;
        this.b = false;
        this.d = new WeakReference((T)view);
        this.f = f;
        this.g = g;
    }
    
    private Tweet a(final View view) {
        if (this.e.d != null && this.e.d.d() == 6) {
            return ((xb)view.getTag()).f.getTweet();
        }
        return null;
    }
    
    private boolean a() {
        final View view = (View)this.d.get();
        if (view == null) {
            return false;
        }
        final Tweet a = this.a(view);
        if (a == null || a.Z != this.f.Z) {
            return false;
        }
        final int top = view.getTop();
        final int bottom = view.getBottom();
        if (top == bottom) {
            return false;
        }
        final int n = (bottom + top) / 2;
        int top2;
        int bottom2;
        if (this.e.c != null) {
            top2 = this.e.c.getTop();
            bottom2 = this.e.c.getBottom();
        }
        else {
            bottom2 = 0;
            top2 = 0;
        }
        return n >= top2 && n <= bottom2;
    }
    
    private void b(final long f) {
        final TwitterScribeItem a = TwitterScribeItem.a(this.g, this.f, this.e.d, null);
        a.E = this.c;
        a.F = f;
        this.e.a.add(a);
    }
    
    void a(final long n) {
        if (this.a()) {
            if (!this.a) {
                this.c = bk.a();
                this.a = true;
                this.b = false;
            }
            else if (!this.b && n - this.c > 30000L) {
                this.b(30000L + this.c);
                this.b = true;
            }
        }
        else if (this.a) {
            final long n2 = n - this.c;
            if (!this.b && n2 > this.e.e) {
                if (n2 <= this.e.f) {
                    this.b(n);
                }
                else {
                    this.b(this.c + this.e.f);
                }
                this.b = true;
            }
            this.a = false;
        }
    }
}
