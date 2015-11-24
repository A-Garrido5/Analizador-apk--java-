// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.ViewGroup$LayoutParams;
import android.widget.AbsListView$LayoutParams;
import android.database.Cursor;
import java.io.Serializable;
import android.os.Parcelable;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.internal.android.widget.GroupedRowView;
import com.twitter.android.profiles.ah;
import android.view.ViewGroup;
import android.view.View;
import com.twitter.library.util.bj;
import android.content.Intent;
import android.widget.ListAdapter;
import android.view.View$OnClickListener;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import android.content.Context;
import com.twitter.android.widget.ct;

public class ou extends ct
{
    private final Context b;
    private final sy c;
    private final c d;
    private final int e;
    private final az f;
    private TwitterUser g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    private float m;
    private View$OnClickListener n;
    
    public ou(final Context b, final pg pg, final int e, final int n) {
        super((ListAdapter)pg, n);
        this.h = false;
        this.n = null;
        pg.c(false);
        this.b = b;
        this.c = new sy(b.getString(2131297491), new Intent(b, (Class)UsersActivity.class).putExtra("type", e).setAction("com.twitter.android.intent.action.FOLLOW"));
        this.d = com.twitter.android.client.c.a(b);
        this.f = az.a(b);
        this.e = e;
        if (this.e()) {
            int j;
            if (bj.e) {
                j = 2130969038;
            }
            else {
                j = 2130968798;
            }
            this.j = j;
        }
        else {
            int i;
            if (bj.e) {
                i = 2130969053;
            }
            else {
                i = 2130969003;
            }
            this.j = i;
        }
        this.l = 2130968640;
        this.m = this.b.getResources().getDimension(2131558418);
        int k;
        if (bj.e) {
            k = 2130969054;
        }
        else {
            k = 2130969005;
        }
        this.k = k;
        ((pg)this.a).a();
    }
    
    public static View a(final View view, final ViewGroup viewGroup, final String s, final int n, final View$OnClickListener onClickListener, final int n2) {
        final View a = ct.a(view, viewGroup, s, n);
        if (onClickListener != null) {
            final View viewById = a.findViewById(n2);
            if (viewById != null) {
                viewById.setOnClickListener(onClickListener);
            }
        }
        return a;
    }
    
    private String a(final String s) {
        return ah.a(this.i) + ":" + s;
    }
    
    @Override
    protected View a(final View view, final ViewGroup viewGroup) {
        View view2 = null;
        switch (this.e) {
            default: {
                view2 = ct.a(view, viewGroup, null);
                break;
            }
            case 10: {
                view2 = ct.a(view, viewGroup, this.b.getString(2131298146), this.j);
                if (this.e()) {
                    final GroupedRowView groupedRowView = (GroupedRowView)view2;
                    groupedRowView.setStyle(1);
                    groupedRowView.setGroupStyle(2);
                    return view2;
                }
                break;
            }
            case 20: {
                return a(view, viewGroup, this.b.getString(2131297473), this.l, this.n, 2131886108);
            }
        }
        return view2;
    }
    
    @Override
    protected Object a() {
        return Boolean.TRUE;
    }
    
    @Override
    protected Object a(final int n) {
        if (this.g != null) {
            final long itemId = ((pg)this.a).getItemId(n);
            final Intent putExtra = new Intent(this.b, (Class)ProfileActivity.class).putExtra("user_id", itemId).putExtra("type", 10).putExtra("association", (Parcelable)((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(5)).a(this.g.userId)).b(ah.a(this.i))).c("similar_to"));
            final Integer j = ((pg)this.a).g.j(itemId);
            if (j != null) {
                putExtra.putExtra("friendship", (Serializable)j);
            }
            return putExtra;
        }
        return null;
    }
    
    public void a(final Cursor cursor) {
        ((pg)this.c()).swapCursor(cursor);
        ((pg)this.c()).notifyDataSetChanged();
        this.notifyDataSetChanged();
    }
    
    public void a(final View$OnClickListener n) {
        this.n = n;
    }
    
    public void a(final TwitterUser g, final boolean i) {
        this.i = i;
        if (this.g != null && this.g.a(g)) {
            return;
        }
        this.c.c.putExtra("username", g.name).putExtra("owner_id", g.userId);
        this.g = g;
        this.notifyDataSetChanged();
    }
    
    @Override
    protected View b(final View view, final ViewGroup viewGroup) {
        switch (this.e) {
            default: {
                return sz.a(this.k, view, viewGroup, this.c, this.m);
            }
            case 20: {
                final View view2 = new View(viewGroup.getContext());
                view2.setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-1, 0));
                return view2;
            }
        }
    }
    
    @Override
    protected Object b() {
        return this.c.c;
    }
    
    @Override
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        if (!this.h) {
            String s = null;
            switch (this.e) {
                default: {
                    s = null;
                    break;
                }
                case 10: {
                    s = "similar_to:::impression";
                    break;
                }
                case 20: {
                    s = "user_similarities_list:::impression";
                    break;
                }
            }
            if (s != null) {
                this.d.a(this.f.b().g(), this.a(s));
                this.h = true;
            }
        }
        return super.getView(n, view, viewGroup);
    }
}
