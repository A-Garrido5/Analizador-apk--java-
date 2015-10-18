// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget.carousel;

import com.twitter.library.av.playback.AVPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import com.twitter.library.provider.Tweet;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import java.util.HashSet;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.av.control.f;
import com.twitter.library.av.playback.p;
import java.util.List;
import android.content.Context;

public class k extends a
{
    public static int a;
    private Context b;
    private List c;
    private final p d;
    private final f e;
    private final TwitterScribeAssociation f;
    private final HashSet g;
    private boolean h;
    
    static {
        k.a = -1;
    }
    
    public k(final Context b, final p d, final TwitterScribeAssociation f, final f e) {
        this.g = new HashSet();
        this.h = true;
        this.b = b;
        this.d = d;
        this.f = f;
        this.e = e;
    }
    
    private int b(final j j) {
        if (!j.c()) {
            return 13;
        }
        if (this.h) {
            return 11;
        }
        return 12;
    }
    
    @Override
    public int a() {
        if (this.c != null) {
            return this.c.size();
        }
        return 0;
    }
    
    @Override
    public int a(final int n) {
        return 0;
    }
    
    @Override
    public j a(final ViewGroup viewGroup, final int n) {
        final CarouselViewMoreItem carouselViewMoreItem = new CarouselViewMoreItem(this.b, this.d);
        carouselViewMoreItem.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
        return new j((View)carouselViewMoreItem);
    }
    
    public void a(final j j) {
        final View a = j.a();
        if (a instanceof CarouselViewMoreItem) {
            ((CarouselViewMoreItem)a).a(this.b(j), true);
        }
    }
    
    @Override
    public void a(final j j, final int n) {
        if (this.c == null || this.c.size() <= n) {
            return;
        }
        final View a = j.a();
        if (a instanceof CarouselViewMoreItem) {
            final Tweet tweet = this.c.get(n);
            final CarouselViewMoreItem carouselViewMoreItem = (CarouselViewMoreItem)a;
            carouselViewMoreItem.a(tweet, this.b(j), this.f);
            if (n == this.c() && carouselViewMoreItem.getState() == 11) {
                carouselViewMoreItem.a(this.e);
            }
        }
        this.g.add(j);
    }
    
    public void a(final List c) {
        this.c = c;
        this.b();
    }
    
    public void a(final boolean h, final boolean b) {
        this.h = h;
        for (final j j : this.g) {
            final View a = j.a();
            if (a instanceof CarouselViewMoreItem) {
                ((CarouselViewMoreItem)a).a(this.b(j), b);
            }
        }
    }
    
    public int c() {
        return 0;
    }
    
    public List d() {
        final ArrayList<AVPlayer> list = new ArrayList<AVPlayer>();
        final Iterator<j> iterator = this.g.iterator();
        while (iterator.hasNext()) {
            final View a = iterator.next().a();
            if (a instanceof CarouselViewMoreItem) {
                final AVPlayer avPlayer = ((CarouselViewMoreItem)a).getAVPlayer();
                if (avPlayer == null) {
                    continue;
                }
                list.add(avPlayer);
            }
        }
        return list;
    }
}
