// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import com.twitter.library.media.manager.UserImageRequest;
import com.twitter.library.api.z;
import android.text.TextUtils;
import android.content.res.TypedArray;
import com.twitter.library.util.bo;
import android.util.AttributeSet;
import android.content.Context;

public class UserSocialView extends UserView
{
    private SocialBylineView n;
    private float o;
    private float p;
    
    public UserSocialView(final Context context, final AttributeSet set) {
        this(context, set, kv.userViewStyle);
    }
    
    public UserSocialView(final Context context, final AttributeSet set, final int n) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.UserSocialView, n, 0);
        this.o = obtainStyledAttributes.getDimension(li.UserSocialView_contentSize, bo.a());
        this.p = obtainStyledAttributes.getDimension(li.UserSocialView_bylineSize, bo.b());
        obtainStyledAttributes.recycle();
    }
    
    private void a(final float n, final float labelSize) {
        this.g.setTextSize(0, n);
        this.h.setTextSize(0, labelSize);
        this.i.setTextSize(0, labelSize);
        this.j.setTextSize(0, labelSize);
        this.n.setLabelSize(labelSize);
    }
    
    public void a(final int n, final int icon, final String s, final int n2, final boolean renderRTL) {
        final SocialBylineView n3 = this.n;
        if (icon > 0 && !TextUtils.isEmpty((CharSequence)s)) {
            n3.setIcon(icon);
            switch (n) {
                case 1: {
                    if (n2 > 0) {
                        n3.setLabel(this.getContext().getString(lg.social_follow_and_more_follow, new Object[] { s, n2 }));
                        break;
                    }
                    n3.setLabel(this.getContext().getString(lg.social_follow_and_follow, new Object[] { s }));
                    break;
                }
                case 2: {
                    n3.setLabel(this.getContext().getString(lg.social_both_follow, new Object[] { s }));
                    break;
                }
            }
            n3.setVisibility(0);
            n3.setRenderRTL(renderRTL);
            return;
        }
        n3.setVisibility(8);
    }
    
    public void a(final int icon, final int n, final boolean renderRTL) {
        final SocialBylineView n2 = this.n;
        boolean b;
        if (this.l.getVisibility() != 0) {
            b = true;
        }
        else {
            b = false;
        }
        String label;
        if (z.b(n) && b) {
            label = this.getContext().getString(lg.social_following);
        }
        else if (z.c(n)) {
            label = this.getContext().getString(lg.social_follows_you);
        }
        else {
            label = null;
        }
        if (icon > 0 && label != null) {
            n2.setIcon(icon);
            n2.setLabel(label);
            n2.setVisibility(0);
            n2.setRenderRTL(renderRTL);
            return;
        }
        n2.setVisibility(8);
    }
    
    public void b() {
        this.getImageView().setSize(-1);
        this.n.setMinIconWidth(UserImageRequest.a(-1));
    }
    
    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.n = (SocialBylineView)this.findViewById(la.social_byline);
        this.a(this.o, this.p);
    }
    
    public void setContentSize(final float o) {
        this.a(this.o = o, this.p = bo.a(o));
    }
    
    public void setScreenNameColor(final int textColor) {
        this.h.setTextColor(textColor);
    }
}
