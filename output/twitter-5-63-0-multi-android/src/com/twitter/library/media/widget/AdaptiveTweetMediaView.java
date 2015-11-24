// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import android.view.View;
import android.view.View$MeasureSpec;
import com.twitter.library.util.bj;
import com.twitter.internal.android.util.Size;
import com.twitter.util.g;
import com.twitter.library.card.instance.CardInstanceData;
import android.util.AttributeSet;
import android.content.Context;

public class AdaptiveTweetMediaView extends TweetMediaView
{
    private boolean d;
    private int e;
    private a f;
    private float g;
    private boolean h;
    
    public AdaptiveTweetMediaView(final Context context) {
        this(context, null);
    }
    
    public AdaptiveTweetMediaView(final Context context, final AttributeSet set) {
        this(context, set, kv.tweetMediaViewStyle);
    }
    
    public AdaptiveTweetMediaView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.e = 0;
        this.g = 1.0f;
        this.f = new a(this, context.getResources().getDimensionPixelSize(ky.adaptiveTweetMediaViewDivider));
    }
    
    private float a(final t t) {
        float g = 1.0f;
        final float e = t.c.e();
        if (!(t.a instanceof CardInstanceData)) {
            if (!t.a()) {
                g = this.g;
            }
            return com.twitter.util.g.a(e, g, 3.0f);
        }
        switch (this.e) {
            default: {
                return 1.7777778f;
            }
            case 3: {
                return e;
            }
            case 1: {
                return com.twitter.util.g.a(e, g, 3.0f);
            }
            case 2: {
                return com.twitter.util.g.a(e, this.g, 3.0f);
            }
        }
    }
    
    private Size a(final int n) {
        final float n2 = n / bj.a;
        return Size.a(n2, n2 / 1.7777778f);
    }
    
    @Override
    protected Size a(final int n, final int n2) {
        if (!this.d) {
            return super.a(n, n2);
        }
        final int size = View$MeasureSpec.getSize(n);
        switch (this.getImageCount()) {
            case 1: {
                final t t = this.a.get(0);
                final Size c = t.c;
                final Size a = this.a(size);
                if (this.h && !c.b(a)) {
                    final Size a2 = c.a(a, false);
                    this.f.a(1, 1, bj.a(a2.a()), a2.e());
                }
                else {
                    this.f.a(1, 1, size, this.a(t));
                }
                this.f.a(0, 0, 0, 1, 1);
                break;
            }
            case 2: {
                this.f.a(2, 1, size, 2.0f);
                this.f.a(0, 0, 0, 1, 1);
                this.f.a(1, 1, 0, 1, 1);
                break;
            }
            case 3: {
                this.f.a(3, 2, size, 1.5f);
                this.f.a(0, 0, 0, 2, 2);
                this.f.a(1, 2, 0, 1, 1);
                this.f.a(2, 2, 1, 1, 1);
                break;
            }
            case 4: {
                final Size c2 = this.a.get(0).c;
                if (c2.d()) {
                    int n3;
                    if (c2.e() >= 2.0f) {
                        n3 = 1;
                    }
                    else {
                        n3 = 2;
                    }
                    final int n4 = n3 + 1;
                    this.f.a(3, n4, size, 3.0f / n4);
                    this.f.a(0, 0, 0, 3, n3);
                    this.f.a(1, 0, n3, 1, 1);
                    this.f.a(2, 1, n3, 1, 1);
                    this.f.a(3, 2, n3, 1, 1);
                    break;
                }
                this.f.a(3, 3, size, 1.0f);
                this.f.a(0, 0, 0, 2, 3);
                this.f.a(1, 2, 0, 1, 1);
                this.f.a(2, 2, 1, 1, 1);
                this.f.a(3, 2, 2, 1, 1);
                break;
            }
        }
        return Size.a(this.f.a(), this.f.b());
    }
    
    @Override
    protected void a() {
        if (!this.d) {
            super.a();
            return;
        }
        switch (this.getImageCount()) {
            default: {}
            case 1: {
                this.f.a(this.b[0], 0, 0);
            }
            case 2: {
                this.f.a(this.b[0], 0, 0);
                this.f.a(this.b[1], 1, 0);
            }
            case 3: {
                this.f.a(this.b[0], 0, 0);
                this.f.a(this.b[1], 2, 0);
                this.f.a(this.b[2], 2, 1);
            }
            case 4: {
                final Size c = this.a.get(0).c;
                if (c.d()) {
                    int n;
                    if (c.e() >= 2.0f) {
                        n = 1;
                    }
                    else {
                        n = 2;
                    }
                    this.f.a(this.b[0], 0, 0);
                    this.f.a(this.b[1], 0, n);
                    this.f.a(this.b[2], 1, n);
                    this.f.a(this.b[3], 2, n);
                    return;
                }
                this.f.a(this.b[0], 0, 0);
                this.f.a(this.b[1], 2, 0);
                this.f.a(this.b[2], 2, 1);
                this.f.a(this.b[3], 2, 2);
            }
        }
    }
    
    public void a(final boolean d) {
        this.d = d;
    }
    
    @Override
    protected Size b(final int n, final int n2) {
        if (!this.d) {
            return super.b(n, n2);
        }
        final int size = View$MeasureSpec.getSize(n);
        final Size c = this.a.get(0).c;
        float e;
        if (com.twitter.android.av.t.a() && !c.d()) {
            e = 1.0f;
        }
        else {
            e = c.e();
        }
        final int n3 = (int)Math.rint(size / e);
        this.a((View)this.c, size, n3);
        return Size.a(size, n3);
    }
    
    public void b(final boolean h) {
        this.h = h;
    }
    
    @Override
    public void setCard(final CardInstanceData card) {
        super.setCard(card);
        if (card != null && this.d) {
            if (card.t() || card.s()) {
                this.e = 3;
            }
            else {
                if (card.q() || card.o()) {
                    this.e = 1;
                    return;
                }
                if (card.n()) {
                    this.e = 2;
                    return;
                }
                this.e = 0;
            }
        }
    }
    
    public void setSingleImageMinAspectRatio(final float g) {
        this.g = g;
    }
}
