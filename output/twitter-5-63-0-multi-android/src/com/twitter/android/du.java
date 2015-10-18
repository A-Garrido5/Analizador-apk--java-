// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.Session;
import com.twitter.library.provider.aj;
import com.twitter.library.api.conversations.ak;
import com.twitter.library.network.a;
import com.twitter.library.media.util.l;
import com.twitter.library.media.manager.k;
import com.twitter.library.util.bk;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.library.provider.c;
import com.twitter.library.api.UserSettings;
import com.twitter.library.client.az;
import android.content.res.Resources;
import com.twitter.library.util.t;
import com.twitter.library.util.bo;
import android.view.View$OnClickListener;
import android.content.Context;
import android.widget.ImageView;
import com.twitter.library.media.widget.MediaImageView;
import android.widget.TextView;
import com.twitter.android.widget.DMAvatar;
import com.twitter.internal.android.widget.HighlightedRelativeLayout;

class du
{
    public HighlightedRelativeLayout a;
    public DMAvatar b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public MediaImageView g;
    public ImageView h;
    final /* synthetic */ ds i;
    
    private du(final ds i) {
        this.i = i;
    }
    
    public void a(final Context context, final cw cw) {
        this.b.a(cw, (View$OnClickListener)new dv(this, context, cw));
    }
    
    public void a(final String s) {
        this.c.setTextSize(0, bo.a);
        t.a(this.i.a, this.c, s);
    }
    
    public void a(final String s, final String text) {
        this.e.setTextSize(0, bo.a);
        t.a(this.i.a, this.e, s);
        int visibility = 0;
        if (text == null) {
            visibility = 8;
        }
        this.f.setVisibility(visibility);
        this.f.setText((CharSequence)text);
    }
    
    public void a(final boolean highlighted, final Resources resources) {
        this.a.setHighlighted(highlighted);
        if (highlighted) {
            this.c.setTextColor(resources.getColor(2131689623));
            this.d.setTextColor(resources.getColor(2131689623));
            return;
        }
        this.c.setTextColor(resources.getColor(2131689540));
        this.d.setTextColor(resources.getColor(2131689540));
    }
}
