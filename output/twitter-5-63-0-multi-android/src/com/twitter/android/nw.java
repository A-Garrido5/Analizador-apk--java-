// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.media.manager.k;
import android.widget.LinearLayout$LayoutParams;
import android.os.Bundle;
import com.twitter.internal.android.widget.RichImageView;
import com.twitter.library.media.widget.d;
import android.widget.LinearLayout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.twitter.library.media.util.j;
import com.twitter.library.media.widget.MediaImageView;
import android.graphics.RectF;
import com.twitter.library.media.widget.BaseMediaImageView;
import com.twitter.library.api.TweetClassicCard;
import java.util.Iterator;
import com.twitter.library.provider.Tweet;
import android.text.TextUtils;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.media.util.q;
import com.twitter.library.provider.ad;
import com.twitter.internal.android.util.Size;
import android.content.res.Resources;
import android.database.Cursor;
import com.twitter.library.util.ReferenceList;
import java.util.ArrayList;
import android.view.View$OnClickListener;
import android.content.Context;
import com.twitter.library.media.widget.n;
import com.twitter.android.client.u;
import android.widget.BaseAdapter;

public class nw extends BaseAdapter implements u, n
{
    private final Context a;
    private final float b;
    private final int c;
    private final int d;
    private final View$OnClickListener e;
    private final mz f;
    private boolean g;
    private final ArrayList h;
    private final ArrayList i;
    private final ReferenceList j;
    private final int k;
    private final int l;
    private boolean m;
    private boolean n;
    private Cursor o;
    
    public nw(final Context a, final float b, final int c, final int d, final View$OnClickListener e, final mz f, final boolean g) {
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = ReferenceList.a();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        final Resources resources = a.getResources();
        this.l = resources.getDisplayMetrics().widthPixels;
        this.k = resources.getDimensionPixelSize(2131558402);
    }
    
    private Size a(Size size) {
        if (!size.c()) {
            final Size a = Size.a(this.l / size.e(), this.k);
            if (size.b(a)) {
                size = a;
            }
        }
        return size;
    }
    
    private void a(final int n) {
        float c = 0.0f;
        final ArrayList i = this.i;
        final ArrayList h = this.h;
        final float b = this.b;
        ny ny = new ny();
        int j = n;
        float c2 = 0.0f;
        while (j >= 0) {
            final nx nx = h.get(j);
            c2 += nx.c;
            if (!ny.a.isEmpty() && c2 + 0.5f >= b) {
                ny.b = c2;
                i.add(0, ny);
                ny = new ny();
                c2 = nx.c;
            }
            ny.a.add(0, nx);
            --j;
        }
        if (this.g && !ny.a.isEmpty()) {
            ny.b = c2;
            i.add(ny);
        }
        final ny ny2 = new ny();
        final int n2 = n + 1;
        ny ny3 = ny2;
        for (int k = n2; k < h.size(); ++k) {
            final nx nx2 = h.get(k);
            c += nx2.c;
            if (!ny3.a.isEmpty() && c + 0.5f >= b) {
                ny3.b = c;
                i.add(ny3);
                ny3 = new ny();
                c = nx2.c;
            }
            ny3.a.add(nx2);
        }
        if (!ny3.a.isEmpty()) {
            ny3.b = c;
            i.add(ny3);
        }
    }
    
    private long b() {
        final ArrayList i = this.i;
        if (i.isEmpty()) {
            return this.d;
        }
        return ((nx)i.get(0).a.get(0)).a;
    }
    
    private void c() {
        int n = 0;
        final Cursor o = this.o;
        final ArrayList h = this.h;
        final long b = this.b();
        this.i.clear();
        h.clear();
        Label_0267: {
            if (o != null && o.moveToFirst()) {
                final int c = this.c;
                do {
                    final long long1 = o.getLong(c);
                    final Tweet a = new ad(o).a();
                    if (a.d()) {
                        for (final MediaEntity mediaEntity : q.a(a, Size.a)) {
                            h.add(new nx(long1, a, this.a(mediaEntity.size), mediaEntity, false));
                        }
                    }
                    else {
                        if (!this.m || !a.K()) {
                            continue;
                        }
                        final TweetClassicCard s = a.S();
                        if (s == null || TextUtils.isEmpty((CharSequence)s.imageUrl)) {
                            continue;
                        }
                        h.add(new nx(long1, a, this.a(s.imageSize), s));
                    }
                } while (o.moveToNext());
                final Iterator<nx> iterator2 = h.iterator();
                while (true) {
                    while (iterator2.hasNext()) {
                        if (iterator2.next().a == b) {
                            final int n2 = n - 1;
                            this.a(n2);
                            break Label_0267;
                        }
                        ++n;
                    }
                    final int n2 = -1;
                    continue;
                }
            }
        }
        this.notifyDataSetChanged();
    }
    
    public int a(final long n) {
        final Iterator<ny> iterator = (Iterator<ny>)this.i.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            final Iterator iterator2 = iterator.next().a.iterator();
            while (iterator2.hasNext()) {
                if (iterator2.next().a == n) {
                    return n2;
                }
            }
            ++n2;
        }
        return 0;
    }
    
    public Cursor a() {
        return this.o;
    }
    
    public Cursor a(final Cursor o) {
        final Cursor o2 = this.o;
        this.o = o;
        this.c();
        return o2;
    }
    
    public RectF a(final MediaImageView mediaImageView) {
        if (mediaImageView.getTag() instanceof nx) {
            final nx nx = (nx)mediaImageView.getTag();
            if (nx.e != null) {
                return com.twitter.library.media.util.j.a(mediaImageView.getImageSize().e(), nx.e.size.e(), nx.e.c());
            }
        }
        return null;
    }
    
    public void a(final boolean m) {
        this.m = m;
    }
    
    public void b(final boolean n) {
        if (this.n != n && !(this.n = n)) {
            final Iterator iterator = this.j.iterator();
            while (iterator.hasNext()) {
                iterator.next().setFromMemoryOnly(false);
            }
            this.j.b();
        }
    }
    
    public int getCount() {
        return this.i.size();
    }
    
    public Object getItem(final int n) {
        if (this.i.isEmpty()) {
            return null;
        }
        return this.i.get(n);
    }
    
    public long getItemId(final int n) {
        if (this.i.isEmpty()) {
            return Long.MIN_VALUE;
        }
        return this.i.get(n).a.get(0).a;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        final LayoutInflater from = LayoutInflater.from(this.a);
        LinearLayout linearLayout;
        if (view == null) {
            linearLayout = (LinearLayout)from.inflate(2130968968, viewGroup, false);
        }
        else {
            linearLayout = (LinearLayout)view;
        }
        final View$OnClickListener e = this.e;
        final mz f = this.f;
        final Iterator<nx> iterator = (Iterator<nx>)this.i.get(n).a.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            final nx tag = iterator.next();
            final View child = linearLayout.getChildAt(i);
            MediaImageView mediaImageView2;
            if (child != null) {
                final MediaImageView mediaImageView = (MediaImageView)child;
                mediaImageView.c();
                mediaImageView2 = mediaImageView;
            }
            else {
                final MediaImageView mediaImageView3 = (MediaImageView)from.inflate(2130968972, (ViewGroup)linearLayout, false);
                mediaImageView3.setOnClickListener(e);
                mediaImageView3.setCroppingRectProvider(this);
                linearLayout.addView((View)mediaImageView3);
                mediaImageView2 = mediaImageView3;
            }
            mediaImageView2.setTag((Object)tag);
            mediaImageView2.setFromMemoryOnly(this.n);
            if (mediaImageView2.a(tag.a())) {
                final RichImageView richImageView = (RichImageView)mediaImageView2.getImageView();
                int overlayDrawable;
                if (this.m && tag.d) {
                    overlayDrawable = 2130839478;
                }
                else {
                    overlayDrawable = 2130839451;
                }
                richImageView.setOverlayDrawable(overlayDrawable);
                if (this.n) {
                    this.j.b(mediaImageView2);
                }
                f.a((View)mediaImageView2, null, Bundle.EMPTY);
            }
            ((LinearLayout$LayoutParams)mediaImageView2.getLayoutParams()).weight = tag.c;
            mediaImageView2.setVisibility(0);
            ++i;
        }
        while (i < linearLayout.getChildCount()) {
            final MediaImageView mediaImageView4 = (MediaImageView)linearLayout.getChildAt(i);
            mediaImageView4.a((k)null);
            mediaImageView4.setVisibility(8);
            ++i;
        }
        return (View)linearLayout;
    }
}
