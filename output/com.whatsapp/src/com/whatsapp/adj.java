// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import com.whatsapp.util.m;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.HashSet;
import android.widget.Filter$FilterResults;
import java.util.ArrayList;
import android.widget.Filter;

class adj extends Filter
{
    ArrayList a;
    private final Object b;
    final zb c;
    
    private adj(final zb c) {
        this.c = c;
        this.b = new Object();
    }
    
    adj(final zb zb, final pi pi) {
        this(zb);
    }
    
    public ArrayList a() {
        synchronized (this.b) {
            if (this.a == null) {
                this.a = new ArrayList();
                App.S.e(this.a);
            }
            return this.a;
        }
    }
    
    public void b() {
        synchronized (this.b) {
            this.a = null;
        }
    }
    
    protected Filter$FilterResults performFiltering(final CharSequence charSequence) {
        final boolean i = App.I;
        final Filter$FilterResults filter$FilterResults = new Filter$FilterResults();
        ArrayList<aro> f = null;
        Label_0416: {
            if (charSequence.length() > 0) {
                final ArrayList<aro> list = new ArrayList<aro>();
                final ArrayList e = vy.E(charSequence.toString());
                final ArrayList j = z8.j();
                final HashSet<String> set = new HashSet<String>();
                for (final String s : j) {
                    final a_9 a = z8.a(s);
                    if (!a.o() && a.a(e)) {
                        if (list.isEmpty()) {
                            list.add(new aro(this.c.b.getString(2131231622)));
                        }
                        list.add((aro)new al_(s));
                        set.add(s);
                    }
                    if (i) {
                        break;
                    }
                }
                final Iterator<a_9> iterator2 = (Iterator<a_9>)this.a().iterator();
                int n = 0;
                while (iterator2.hasNext()) {
                    final a_9 a_9 = iterator2.next();
                    if (a_9.e != null && a_9.a(e) && !set.contains(a_9.u)) {
                        if (n == 0) {
                            list.add(new aro(this.c.b.getString(2131231623)));
                        }
                        n = 1;
                        list.add((aro)new atv(a_9.u));
                    }
                    final int n2 = n;
                    if (i) {
                        break;
                    }
                    n = n2;
                }
                final ArrayList a2 = App.ak.a(charSequence.toString(), Integer.MAX_VALUE, 100);
                if (a2.size() > 0) {
                    list.add(new aro(this.c.b.getString(2131231624)));
                }
                for (final asb asb : a2) {
                    list.add((aro)new ce(asb.b, asb.a));
                    if (i) {
                        break;
                    }
                }
                if (!i) {
                    f = list;
                    break Label_0416;
                }
            }
            f = (ArrayList<aro>)this.c.b.f();
        }
        filter$FilterResults.values = f;
        filter$FilterResults.count = f.size();
        return filter$FilterResults;
    }
    
    protected void publishResults(final CharSequence charSequence, final Filter$FilterResults filter$FilterResults) {
        final boolean i = App.I;
        final View view = this.c.b.getView();
        if (view != null) {
            Label_0133: {
                if (filter$FilterResults.count == 0) {
                    if (charSequence.length() > 0) {
                        final View viewById = view.findViewById(2131755502);
                        viewById.setVisibility(0);
                        ConversationsFragment.k(this.c.b).setEmptyView(viewById);
                        view.findViewById(2131755506).setVisibility(8);
                        view.findViewById(2131755504).setVisibility(8);
                        if (!i) {
                            break Label_0133;
                        }
                    }
                    view.findViewById(2131755502).setVisibility(8);
                    ConversationsFragment.b(this.c.b);
                    if (!i) {
                        break Label_0133;
                    }
                }
                view.findViewById(2131755502).setVisibility(8);
            }
            ConversationsFragment.a(this.c.b, (ArrayList)filter$FilterResults.values);
            if (ConversationsFragment.l(this.c.b) == null) {
                ConversationsFragment.a(this.c.b, this.c.b.f());
            }
            zb.a(this.c, charSequence.toString());
            zb.a(this.c, vy.E(zb.a(this.c)));
            Label_0417: {
                if (TextUtils.isEmpty((CharSequence)zb.a(this.c))) {
                    ConversationsFragment.k(this.c.b).setDivider((Drawable)new m(this.c.b.getResources().getDrawable(2130837753)));
                    if (ConversationsFragment.d(this.c.b) > 0) {
                        this.c.b.f.setVisibility(0);
                        if (!i) {
                            break Label_0417;
                        }
                    }
                    this.c.b.f.setVisibility(8);
                    if (!i) {
                        break Label_0417;
                    }
                }
                ConversationsFragment.k(this.c.b).setDivider((Drawable)null);
                this.c.b.f.setVisibility(8);
                if (ConversationsFragment.l(this.c.b).isEmpty() && view != null) {
                    ((TextView)view.findViewById(2131755503)).setText((CharSequence)view.getContext().getString(2131231621, new Object[] { zb.a(this.c) }));
                }
            }
            this.c.notifyDataSetChanged();
        }
    }
}
