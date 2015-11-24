// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import com.twitter.library.media.widget.s;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import com.twitter.library.provider.i;
import com.twitter.library.provider.Tweet;
import com.twitter.library.media.manager.UserImageRequest;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.view.k;
import com.twitter.library.view.l;
import com.twitter.library.provider.j;
import com.twitter.library.provider.ad;
import android.view.View;
import android.content.res.Resources;
import android.database.Cursor;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.CursorAdapter;

public class ao extends CursorAdapter
{
    private final al a;
    private final y b;
    private final LayoutInflater c;
    private final int d;
    private final int e;
    private final int f;
    private boolean g;
    
    public ao(final al a, final Context context, final y b) {
        super(context, (Cursor)null, false);
        this.a = a;
        this.b = b;
        this.c = LayoutInflater.from(context);
        final Resources resources = context.getResources();
        this.d = resources.getColor(2131689621);
        this.e = resources.getColor(2131689600);
        this.f = resources.getColor(2131689601);
    }
    
    public void a(final boolean g) {
        this.g = g;
        this.notifyDataSetChanged();
    }
    
    public void bindView(final View view, final Context context, final Cursor cursor) {
        final Tweet a = new ad(cursor).a();
        final aq aq = (aq)view.getTag();
        boolean b;
        if (aq.k == null || aq.k.Q != a.Q) {
            b = true;
        }
        else {
            b = false;
        }
        boolean b2;
        if (b || !a.a(aq.k)) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        if (b) {
            aq.b.setTag((Object)a.F);
            final i a2 = new j(a).b(true).a();
            aq.f.setText(l.a(a2.a, a2.b, this.b, this.d, this.e, this.f, false, false));
            final ac ac = new ac(context, a, aq.i, aq.j, StoryScribeItem.a(this.a, a));
            aq.i.setTag((Object)ac);
            aq.j.setTag((Object)ac);
        }
        else if (b2) {
            final ac ac2 = (ac)aq.i.getTag();
            if (ac2.c) {
                ac2.c = false;
            }
            else {
                ac2.a(a);
            }
        }
        if (b2) {
            aq.c.setText((CharSequence)a.a());
            final View d = aq.d;
            final boolean v = a.V;
            int visibility = 0;
            if (!v) {
                visibility = 8;
            }
            d.setVisibility(visibility);
            aq.e.setText((CharSequence)z.a(context, a));
            aq.b.a(UserImageRequest.a(a.B));
            z.a(aq.h, aq.g, a);
            if (this.b != null) {
                this.b.a(this.a, a);
            }
            aq.k = a;
        }
    }
    
    public int getCount() {
        if (this.g) {
            return 1 + super.getCount();
        }
        return super.getCount();
    }
    
    public int getItemViewType(final int n) {
        if (this.g && n == super.getCount()) {
            return 1;
        }
        return 0;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        if (this.getItemViewType(n) == 1) {
            return this.c.inflate(2130969008, viewGroup, false);
        }
        return super.getView(n, view, viewGroup);
    }
    
    public int getViewTypeCount() {
        return 2;
    }
    
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        final View inflate = this.c.inflate(2130968839, viewGroup, false);
        final aq tag = new aq(inflate);
        inflate.setTag((Object)tag);
        inflate.setOnClickListener((View$OnClickListener)this.b);
        tag.h.setOnMediaClickListener(this.b);
        tag.b.setOnClickListener((View$OnClickListener)this.b);
        z.a(true, true, (View)tag.i, (View$OnClickListener)this.b);
        z.a(true, true, (View)tag.j, (View$OnClickListener)this.b);
        return inflate;
    }
}
