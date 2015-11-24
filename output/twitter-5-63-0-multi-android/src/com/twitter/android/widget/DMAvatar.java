// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import java.util.List;
import android.view.View$OnClickListener;
import com.twitter.android.cw;
import android.view.View;
import com.twitter.util.a;
import com.twitter.library.media.widget.BaseMediaImageView$ScaleType;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.text.TextUtils;
import com.twitter.library.media.widget.UserImageView;
import com.twitter.library.api.TwitterUser;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.RelativeLayout;

public class DMAvatar extends RelativeLayout
{
    private boolean a;
    private int b;
    
    public DMAvatar(final Context context) {
        this(context, null);
    }
    
    public DMAvatar(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public DMAvatar(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, pa.DMAvatar, n, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
    
    private Drawable a(final DMAvatar$Location dmAvatar$Location) {
        final PaintDrawable paintDrawable = new PaintDrawable(this.getResources().getColor(2131689557));
        if (dmAvatar$Location != null) {
            final int n = (int)this.getResources().getDimension(2131558629);
            paintDrawable.setShape((Shape)new RectShape());
            paintDrawable.setCornerRadii(new float[] { dmAvatar$Location.c(n), dmAvatar$Location.c(n), dmAvatar$Location.a(n), dmAvatar$Location.a(n), dmAvatar$Location.b(n), dmAvatar$Location.b(n), dmAvatar$Location.d(n), dmAvatar$Location.d(n) });
            return (Drawable)paintDrawable;
        }
        paintDrawable.setShape((Shape)new OvalShape());
        return (Drawable)paintDrawable;
    }
    
    private UserImageView a(final TwitterUser twitterUser) {
        final UserImageView userImageView = new UserImageView(this.getContext());
        String c;
        if (twitterUser != null) {
            userImageView.a(twitterUser);
            c = twitterUser.c();
        }
        else {
            userImageView.a((TwitterUser)null);
            c = null;
        }
        if (!TextUtils.isEmpty((CharSequence)c)) {
            userImageView.setContentDescription((CharSequence)this.getContext().getString(2131297097, new Object[] { c }));
        }
        if (this.a) {
            userImageView.setDefaultDrawable(this.a((DMAvatar$Location)null));
            userImageView.setCornerRadius(this.getResources().getDimension(2131558629));
        }
        return userImageView;
    }
    
    private UserImageView a(final TwitterUser twitterUser, final DMAvatar$Location dmAvatar$Location, final int n, final int n2) {
        final UserImageView userImageView = new UserImageView(this.getContext());
        userImageView.a(twitterUser);
        userImageView.a(n, n2);
        final RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-2, -2);
        final int[] layoutRules = dmAvatar$Location.layoutRules;
        for (int length = layoutRules.length, i = 0; i < length; ++i) {
            layoutParams.addRule(layoutRules[i]);
        }
        userImageView.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        if (dmAvatar$Location.a()) {
            userImageView.setScaleType(BaseMediaImageView$ScaleType.b);
        }
        com.twitter.util.a.a((View)userImageView, 2);
        if (this.a) {
            final int n3 = (int)this.getResources().getDimension(2131558629);
            userImageView.setDefaultDrawable(this.a(dmAvatar$Location));
            userImageView.a(dmAvatar$Location.c(n3), dmAvatar$Location.a(n3), dmAvatar$Location.b(n3), dmAvatar$Location.d(n3));
        }
        return userImageView;
    }
    
    public void a(final cw cw, final View$OnClickListener onClickListener) {
        this.removeAllViews();
        final List l = cw.l;
        final int size = l.size();
        if (cw.k) {
            final int n = this.b / 2 - this.getResources().getDimensionPixelSize(2131558626);
            final int b = this.b;
            if (size > 3) {
                this.addView((View)this.a(l.get(1), DMAvatar$Location.c, n, n));
                this.addView((View)this.a(l.get(2), DMAvatar$Location.d, n, n));
                this.addView((View)this.a(l.get(0), DMAvatar$Location.a, n, b));
            }
            else {
                if (size > 0) {
                    this.addView((View)this.a(l.get(0), DMAvatar$Location.a, n, b));
                }
                if (size > 1) {
                    this.addView((View)this.a(l.get(1), DMAvatar$Location.b, n, b));
                }
            }
            return;
        }
        final UserImageView a = this.a(l.get(0));
        a.setOnClickListener(onClickListener);
        this.addView((View)a);
    }
    
    public void setCircleAvatars(final boolean a) {
        this.a = a;
    }
}
