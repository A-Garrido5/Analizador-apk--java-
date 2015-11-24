// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.z;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import android.content.Context;
import com.twitter.library.widget.SocialBylineView;
import com.twitter.library.media.widget.UserImageView;
import android.widget.TextView;
import android.widget.ImageView;
import com.twitter.library.widget.ActionButton;

class xw
{
    public int a;
    public final long b;
    public final ActionButton c;
    public final ImageView d;
    public final ImageView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final UserImageView i;
    public final SocialBylineView j;
    public final TextView k;
    private final Context l;
    
    xw(final Context l, final RelativeLayout relativeLayout, final long b) {
        this.l = l;
        this.b = b;
        this.c = (ActionButton)relativeLayout.findViewById(2131886080);
        this.g = (TextView)relativeLayout.findViewById(2131886146);
        this.d = (ImageView)relativeLayout.findViewById(2131886139);
        this.e = (ImageView)relativeLayout.findViewById(2131886161);
        this.f = (TextView)relativeLayout.findViewById(2131886132);
        this.i = (UserImageView)relativeLayout.findViewById(2131886159);
        this.h = (TextView)relativeLayout.findViewById(2131886138);
        this.j = (SocialBylineView)relativeLayout.findViewById(2131886151);
        this.k = (TextView)relativeLayout.findViewById(2131886157);
    }
    
    public void a() {
        final int visibility = this.j.getVisibility();
        int n = 0;
        if (visibility == 0) {
            n = 1;
        }
        if (this.h.getVisibility() == 0) {
            ++n;
        }
        this.k.setMaxLines(3 - n);
    }
    
    public void a(final int n, final int icon, final String s, final int n2, final boolean renderRTL) {
        final Resources resources = this.l.getResources();
        final SocialBylineView j = this.j;
        if (icon > 0 && !TextUtils.isEmpty((CharSequence)s)) {
            j.setIcon(icon);
            switch (n) {
                default: {
                    j.setVisibility(8);
                    break;
                }
                case 1: {
                    if (n2 > 0) {
                        j.setLabel(resources.getQuantityString(2131427330, n2, new Object[] { s, n2 }));
                    }
                    else {
                        j.setLabel(resources.getString(2131297014, new Object[] { s }));
                    }
                    j.setVisibility(0);
                    break;
                }
                case 2: {
                    j.setLabel(resources.getString(2131297846, new Object[] { s }));
                    j.setVisibility(0);
                    break;
                }
                case 3: {
                    j.setLabel(resources.getString(2131297857, new Object[] { s }));
                    j.setVisibility(0);
                    break;
                }
                case 4: {
                    j.setLabel(resources.getString(2131297878, new Object[] { s }));
                    j.setVisibility(0);
                    break;
                }
            }
            j.setRenderRTL(renderRTL);
            return;
        }
        j.setVisibility(8);
    }
    
    public void a(final int a, final Resources resources) {
        final ActionButton c = this.c;
        if (z.b(a)) {
            c.setEnabled(true);
            c.setChecked(true);
            c.setImageResource(2130838947);
            c.setAlpha(1.0f);
        }
        else if (z.e(a)) {
            c.setEnabled(false);
            c.setChecked(false);
            c.setImageResource(2130838752);
            c.setAlpha(0.4f);
        }
        else {
            c.setEnabled(true);
            c.setChecked(false);
            c.setImageResource(2130838948);
            c.setAlpha(1.0f);
        }
        this.a = a;
    }
    
    public void a(final int icon, final boolean renderRTL) {
        final SocialBylineView j = this.j;
        if (icon > 0) {
            j.setIcon(icon);
            j.setLabel(this.l.getString(2131297871));
            j.setVisibility(0);
            j.setRenderRTL(renderRTL);
            return;
        }
        j.setVisibility(8);
    }
    
    public void a(final PromotedContent promotedContent) {
        final TextView h = this.h;
        if (promotedContent != null && !promotedContent.b()) {
            h.setVisibility(0);
            return;
        }
        h.setVisibility(8);
    }
    
    public void a(final String text, final String text2) {
        if (TextUtils.isEmpty((CharSequence)text2)) {
            this.f.setText((CharSequence)text);
        }
        else {
            this.f.setText((CharSequence)text2);
        }
        this.g.setText((CharSequence)('@' + text));
    }
    
    public void a(final boolean b) {
        if (b) {
            this.d.setVisibility(0);
            return;
        }
        this.d.setVisibility(8);
    }
    
    public void b(final boolean b) {
        if (b) {
            this.e.setVisibility(0);
            return;
        }
        this.e.setVisibility(8);
    }
}
