// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import android.widget.AbsListView;
import java.util.Iterator;
import com.twitter.util.j;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.library.widget.tweet.content.d;
import com.twitter.library.widget.TweetView;
import com.twitter.library.av.playback.p;
import android.graphics.Rect;
import java.util.ArrayList;
import com.twitter.library.widget.a;
import com.twitter.android.client.bv;

public class x implements bv
{
    private a a;
    private ArrayList b;
    private int c;
    private final Rect d;
    private final Rect e;
    private final p f;
    
    public x() {
        this(p.a());
    }
    
    x(final p f) {
        this.a = com.twitter.library.widget.a.e;
        this.b = new ArrayList();
        this.c = 5;
        this.d = new Rect();
        this.e = new Rect();
        this.f = f;
    }
    
    private a a(final TweetView tweetView) {
        final d contentContainer = tweetView.getContentContainer();
        if (contentContainer instanceof a) {
            return (a)contentContainer;
        }
        return com.twitter.library.widget.a.e;
    }
    
    private ArrayList a(final ViewGroup viewGroup, final int n) {
        if (n > 0 && viewGroup.getChildCount() > 0) {
            for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                final View child = viewGroup.getChildAt(i);
                if (child instanceof TweetView) {
                    this.b.add(child);
                }
                else if (child instanceof ViewGroup) {
                    this.a((ViewGroup)child, n - 1);
                }
            }
        }
        return this.b;
    }
    
    private a b(final ViewGroup viewGroup) {
        viewGroup.getGlobalVisibleRect(this.d);
        this.b = this.a(viewGroup, this.c);
        final float n = this.d.right + this.d.bottom;
        final a e = com.twitter.library.widget.a.e;
        final Iterator<TweetView> iterator = (Iterator<TweetView>)this.b.iterator();
        float n2 = n;
        a a = e;
    Label_0202_Outer:
        while (iterator.hasNext()) {
            a a2 = this.a(iterator.next());
            while (true) {
                Label_0223: {
                    if (a2.f() == null) {
                        break Label_0223;
                    }
                    final View f = a2.f();
                    if (!f.getGlobalVisibleRect(this.e) || this.e.bottom - this.e.top < 0.25 * f.getHeight() || this.e.right - this.e.left < 0.25 * f.getWidth()) {
                        break Label_0223;
                    }
                    final float b = j.b(this.e, this.d);
                    if (b >= n2) {
                        break Label_0223;
                    }
                    final float n3 = b;
                    n2 = n3;
                    a = a2;
                    continue Label_0202_Outer;
                }
                a2 = a;
                final float n3 = n2;
                continue;
            }
        }
        this.b.clear();
        return a;
    }
    
    public a a(final ViewGroup viewGroup) {
        if (!this.f.c()) {
            final a b = this.b(viewGroup);
            if (b == com.twitter.library.widget.a.e) {
                this.a.e();
            }
            else if (b != this.a) {
                this.a.e();
                b.ak_();
            }
            return this.a = b;
        }
        return com.twitter.library.widget.a.e;
    }
    
    public void a() {
        this.a.e();
    }
    
    @Override
    public boolean a(final AbsListView absListView, final int n) {
        this.a((ViewGroup)absListView);
        return false;
    }
    
    @Override
    public boolean a(final AbsListView absListView, final int n, final int n2, final int n3, final boolean b) {
        this.a((ViewGroup)absListView);
        return false;
    }
}
