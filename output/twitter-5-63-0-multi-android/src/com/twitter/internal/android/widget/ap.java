// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import android.widget.BaseAdapter;

class ap extends BaseAdapter
{
    private final ar a;
    private List b;
    
    private ap(final ar a) {
        this.b = new ArrayList();
        this.a = a;
    }
    
    public void a(final List list) {
        for (final jx jx : list) {
            if (!this.b.contains(jx) && jx.k() != null && jx.i()) {
                this.b.add(jx);
            }
            else {
                if (!this.b.contains(jx) || jx.i()) {
                    continue;
                }
                this.b.remove(jx);
            }
        }
        this.b = ToolBar.a(this.b, this.a);
        this.notifyDataSetChanged();
    }
    
    public int getCount() {
        return this.b.size();
    }
    
    public Object getItem(final int n) {
        return this.b.get(n);
    }
    
    public long getItemId(final int n) {
        return this.b.get(n).a();
    }
    
    public View getView(final int n, View inflate, final ViewGroup viewGroup) {
        at at;
        if (inflate == null) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(lc.overflow_drop_down_item, viewGroup, false);
            final at tag = new at(inflate);
            inflate.setTag((Object)tag);
            at = tag;
        }
        else {
            at = (at)inflate.getTag();
        }
        final jx jx = this.b.get(n);
        at.a.setText(jx.k());
        final CharSequence p3 = jx.p();
        if (!TextUtils.isEmpty(p3)) {
            at.b.setText(p3);
            at.b.setVisibility(0);
        }
        else {
            at.b.setVisibility(8);
        }
        final Drawable q = jx.q();
        if (q != null) {
            at.c.setImageDrawable(q);
            at.c.setVisibility(0);
            return inflate;
        }
        at.c.setVisibility(8);
        return inflate;
    }
    
    public boolean isEnabled(final int n) {
        return this.b.get(n).m();
    }
}
