// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.res.Resources;
import com.twitter.library.client.Session;
import com.twitter.library.provider.aj;
import com.twitter.library.api.conversations.ak;
import com.twitter.library.network.a;
import com.twitter.library.network.t;
import com.twitter.library.media.util.l;
import com.twitter.library.media.manager.k;
import com.twitter.library.util.bk;
import com.twitter.internal.android.widget.HighlightedRelativeLayout;
import android.widget.TextView;
import android.widget.ImageView;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.android.widget.DMAvatar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.library.provider.c;
import com.twitter.library.api.UserSettings;
import com.twitter.library.client.az;
import android.content.Context;

public class ds extends ll
{
    private final Context a;
    private final az b;
    private final UserSettings c;
    
    public ds(final Context a) {
        this.a = a;
        this.b = az.a(a);
        this.c = this.b.b().j();
    }
    
    protected View a(final c c, final ViewGroup viewGroup) {
        final View inflate = LayoutInflater.from(this.a).inflate(2130968723, viewGroup, false);
        final du tag = new du(this, null);
        tag.b = (DMAvatar)inflate.findViewById(2131886632);
        tag.g = (MediaImageView)inflate.findViewById(2131886638);
        tag.h = (ImageView)inflate.findViewById(2131886639);
        tag.c = (TextView)inflate.findViewById(2131886637);
        tag.d = (TextView)inflate.findViewById(2131886361);
        tag.e = (TextView)inflate.findViewById(2131886307);
        tag.f = (TextView)inflate.findViewById(2131886308);
        tag.a = (HighlightedRelativeLayout)inflate;
        inflate.setTag((Object)tag);
        return inflate;
    }
    
    protected void a(final View view, final c c) {
        final du du = (du)view.getTag();
        final Session b = this.b.b();
        final cw cw = new cw(this.a, c, b.g());
        final Resources resources = this.a.getResources();
        du.a(this.a, cw);
        String a;
        if (cw.g == 0L) {
            a = "";
        }
        else {
            a = bk.a(resources, cw.g);
        }
        du.d.setText((CharSequence)a);
        du.a(cw.d, cw.e);
        du.a(cw.f, resources);
        boolean b2;
        if (this.c != null && !this.c.k) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        if (cw.p == null || (cw.p.possiblySensitive && b2)) {
            du.g.a((k)null);
            du.g.setVisibility(8);
        }
        else {
            du.g.a((k)l.a(cw.p).a(new t(b.h())), false);
            du.g.setVisibility(0);
        }
        final TextView c2 = du.c;
        final Context a2 = this.a;
        int n;
        if (cw.s) {
            n = 2131493256;
        }
        else {
            n = 2131493257;
        }
        c2.setTextAppearance(a2, n);
        du.a(ak.a(this.a.getResources(), cw.c, cw.j, cw.r.toString(), cw.h, cw.k, cw.p != null, cw.i, cw.q, false));
        int n2 = -1;
        String contentDescription;
        if (cw.m) {
            n2 = 2130838855;
            contentDescription = resources.getString(2131296849);
        }
        else {
            final boolean h = cw.h;
            contentDescription = null;
            if (h) {
                final boolean contains = aj.d.contains(cw.i);
                contentDescription = null;
                if (contains) {
                    n2 = 2130838856;
                    contentDescription = resources.getString(2131296850);
                }
            }
        }
        final ImageView h2 = du.h;
        if (n2 != -1) {
            h2.setImageDrawable(this.a.getResources().getDrawable(n2));
            h2.setVisibility(0);
            h2.setContentDescription((CharSequence)contentDescription);
            com.twitter.util.a.a((View)h2, 1);
            return;
        }
        h2.setVisibility(4);
        com.twitter.util.a.a((View)h2, 2);
    }
}
