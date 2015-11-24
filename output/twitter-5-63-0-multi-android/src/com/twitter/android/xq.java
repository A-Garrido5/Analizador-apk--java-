// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.Iterator;
import android.widget.TextView;
import com.twitter.library.media.widget.UserImageView;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.twitter.library.api.PromotedContent;
import android.content.res.Resources;
import android.view.View;
import com.twitter.library.util.bj;
import com.twitter.library.api.z;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;
import android.view.ViewGroup;
import android.database.Cursor;
import java.util.ArrayList;
import android.view.LayoutInflater;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.client.az;
import android.content.Context;

public class xq extends aw
{
    private final Context b;
    private final az c;
    private final FriendshipCache d;
    private final int e;
    private final xx f;
    private final LayoutInflater g;
    private final ArrayList h;
    private final xy i;
    private final boolean j;
    private Cursor k;
    
    public xq(final Context context, final FriendshipCache friendshipCache, final int n, final xy xy, final xx xx, final LayoutInflater layoutInflater) {
        this(context, friendshipCache, n, xy, xx, layoutInflater, true);
    }
    
    public xq(final Context b, final FriendshipCache d, final int e, final xy i, final xx f, final LayoutInflater g, final boolean j) {
        this.h = new ArrayList();
        this.b = b;
        this.c = az.a(b);
        this.d = d;
        this.e = e;
        this.i = i;
        this.f = f;
        this.g = g;
        this.j = j;
    }
    
    public xv a(final int n) {
        if (!this.h.isEmpty()) {
            return this.h.get(n);
        }
        return null;
    }
    
    public Object a(final ViewGroup viewGroup, final xv xv) {
        final Context b = this.b;
        final Resources resources = b.getResources();
        final xx f = this.f;
        final RelativeLayout relativeLayout = (RelativeLayout)this.g.inflate(2130969179, (ViewGroup)null);
        final Cursor k = this.k;
        k.moveToPosition(xv.b);
        final long a = this.i.a(k);
        final xw tag = new xw(b, relativeLayout, a);
        relativeLayout.setTag((Object)tag);
        tag.i.a(this.i.d(k));
        final String b2 = this.i.b(k);
        tag.a(b2, this.i.c(k));
        tag.k.setText(this.i.e(k));
        tag.a(this.i.g(k));
        tag.b(this.i.f(k));
        final PromotedContent h = this.i.h(k);
        tag.a(h);
        final xz xz = new xz(b2, this.i.a(k, xv.b));
        if (a == this.c.b().g()) {
            tag.c.setVisibility(8);
        }
        else {
            tag.c.setVisibility(0);
            final FriendshipCache d = this.d;
            final int i = this.i.i(k);
            if (d != null) {
                if (d.a(a)) {
                    tag.a(d.j(a), resources);
                }
                else {
                    tag.a(i, resources);
                }
            }
            xz.b = tag.a;
            if (f != null) {
                tag.c.setOnClickListener((View$OnClickListener)new xr(this, f, a, h, xz, tag, resources));
            }
            if (z.c(tag.a)) {
                tag.a(2130838677, bj.e);
            }
            else {
                tag.a(this.i.k(k), 2130838677, this.i.j(k), 0, bj.e);
            }
        }
        tag.a();
        if (f != null) {
            relativeLayout.setOnClickListener((View$OnClickListener)new xs(this, f, a, h, xz));
        }
        viewGroup.addView((View)relativeLayout);
        return relativeLayout;
    }
    
    public Object b(final ViewGroup viewGroup, final xv xv) {
        final Resources resources = this.b.getResources();
        final LayoutInflater g = this.g;
        final xx f = this.f;
        final LinearLayout linearLayout = (LinearLayout)g.inflate(2130969178, (ViewGroup)null);
        if (f != null) {
            linearLayout.findViewById(2131887334).setOnClickListener((View$OnClickListener)new xt(this, f));
        }
        final LinearLayout tag = (LinearLayout)linearLayout.findViewById(2131887332);
        linearLayout.setTag((Object)tag);
        final Cursor k = this.k;
        final ArrayList<String> list = new ArrayList<String>(xv.c.size());
        for (final Integer n : xv.c) {
            k.moveToPosition((int)n);
            final String c = this.i.c(k);
            list.add(c);
            final String d = this.i.d(k);
            if (!TextUtils.isEmpty((CharSequence)d)) {
                final long a = this.i.a(k);
                final UserImageView userImageView = (UserImageView)g.inflate(2130969177, (ViewGroup)tag, false);
                userImageView.a(d);
                userImageView.setContentDescription((CharSequence)c);
                final String b = this.i.b(k);
                final PromotedContent h = this.i.h(k);
                final xz xz = new xz(b, this.i.a(k, n));
                if (f != null) {
                    userImageView.setOnClickListener((View$OnClickListener)new xu(this, f, a, h, xz));
                }
                tag.addView((View)userImageView);
            }
        }
        final int size = list.size();
        String s;
        if (size > 1) {
            s = list.get(1);
        }
        else {
            s = null;
        }
        ((TextView)linearLayout.findViewById(2131887333)).setText((CharSequence)resources.getQuantityString(2131427349, size, new Object[] { list.get(0), s }));
        viewGroup.addView((View)linearLayout);
        return linearLayout;
    }
    
    @Override
    public void destroyItem(final ViewGroup viewGroup, final int n, final Object o) {
        viewGroup.removeView((View)o);
    }
    
    @Override
    public int getCount() {
        return this.h.size();
    }
    
    @Override
    public Object instantiateItem(final ViewGroup viewGroup, final int n) {
        final xv xv = this.h.get(n);
        switch (xv.a) {
            default: {
                return null;
            }
            case 1: {
                return this.a(viewGroup, xv);
            }
            case 2: {
                return this.b(viewGroup, xv);
            }
        }
    }
    
    @Override
    public boolean isViewFromObject(final View view, final Object o) {
        return view == o;
    }
    
    @Override
    public Cursor swapCursor(final Cursor k) {
        final Cursor i = this.k;
        if (i != k) {
            this.a.clear();
            final ArrayList h = this.h;
            this.k = k;
            h.clear();
            if (k != null && k.moveToFirst()) {
                final ArrayList<Integer> list = new ArrayList<Integer>();
                do {
                    final int position = k.getPosition();
                    this.a.add(String.valueOf(this.i.a(k)));
                    if (this.j) {
                        if (Boolean.valueOf(this.i.l(k)) && h.size() < 4) {
                            h.add(new xv(position, this.i.a(k), this.i.h(k)));
                        }
                        else if (list.size() < 5) {
                            list.add(position);
                        }
                    }
                    else {
                        h.add(new xv(position, this.i.a(k), this.i.h(k)));
                    }
                } while (k.moveToNext());
                if (!list.isEmpty() && this.j) {
                    h.add(new xv(list));
                }
            }
            this.notifyDataSetChanged();
        }
        return i;
    }
}
