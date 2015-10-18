// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import com.twitter.library.media.util.ak;
import com.twitter.library.media.manager.k;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.media.manager.UserImageRequest;
import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.widget.ImageView;
import com.twitter.internal.android.widget.RichImageView;
import android.util.AttributeSet;
import android.content.Context;

public class UserImageView extends MediaImageView
{
    private final int c;
    private int d;
    private int e;
    private boolean f;
    
    public UserImageView(final Context context) {
        this(context, null);
    }
    
    public UserImageView(final Context context, final AttributeSet set) {
        this(context, set, kv.userImageViewStyle);
    }
    
    public UserImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n, new RichImageView(context), false);
        this.d = -3;
        this.e = -3;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.UserImageView, n, 0);
        final String string = obtainStyledAttributes.getString(li.UserImageView_userImageSize);
        if (!TextUtils.isEmpty((CharSequence)string) && string.charAt(0) == '-') {
            final int int1 = Integer.parseInt(string);
            this.e = int1;
            this.d = int1;
        }
        else {
            final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(li.UserImageView_userImageSize, -3);
            this.e = dimensionPixelSize;
            this.d = dimensionPixelSize;
        }
        this.setOverlayDrawableId(obtainStyledAttributes.getResourceId(li.UserImageView_overlayDrawable, 0));
        this.c = obtainStyledAttributes.getDimensionPixelSize(li.UserImageView_imageCornerRadius, 0);
        this.setCornerRadius(this.c);
        obtainStyledAttributes.recycle();
    }
    
    private boolean a(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams != null) {
            final int width = UserImageRequest.a(this.d) + this.getPaddingLeft() + this.getPaddingRight();
            final int height = UserImageRequest.a(this.e) + this.getPaddingTop() + this.getPaddingBottom();
            if (viewGroup$LayoutParams.width != width || viewGroup$LayoutParams.height != height) {
                viewGroup$LayoutParams.width = width;
                viewGroup$LayoutParams.height = height;
                return true;
            }
        }
        return false;
    }
    
    private boolean g() {
        return this.a(super.getLayoutParams());
    }
    
    private void h() {
        this.setCornerRadius(UserImageRequest.a(this.e) / 8);
    }
    
    public void a(final float n, final float n2, final float n3, final float n4) {
        ((RichImageView)this.getImageView()).a(n, n2, n3, n4);
    }
    
    public void a(final int d, final int e) {
        this.d = d;
        this.e = e;
        if (this.g()) {
            this.requestLayout();
            if (this.f) {
                this.h();
            }
        }
    }
    
    public boolean a(final TwitterUser twitterUser) {
        return this.a(twitterUser, true);
    }
    
    public boolean a(final TwitterUser twitterUser, final boolean b) {
        if (twitterUser != null) {
            return this.a(twitterUser.profileImageUrl, twitterUser.userId, b);
        }
        return this.a((String)null);
    }
    
    @Override
    public boolean a(final k k, final boolean b) {
        throw new UnsupportedOperationException("Use setUser or setUserImageUrl");
    }
    
    public boolean a(final String s) {
        return this.a(s, true);
    }
    
    public boolean a(final String s, final long n, final boolean b) {
        return this.a(ak.a(n, s), b);
    }
    
    public boolean a(final String s, final boolean b) {
        return super.a(UserImageRequest.a(s), b);
    }
    
    public ViewGroup$LayoutParams getLayoutParams() {
        final ViewGroup$LayoutParams layoutParams = super.getLayoutParams();
        this.a(layoutParams);
        return layoutParams;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g();
    }
    
    @Override
    protected void onMeasure(final int n, final int n2) {
        if (this.getLayoutParams() == null) {
            throw new IllegalStateException("Must set size before trying the measure the view");
        }
        this.g();
        super.onMeasure(n, n2);
    }
    
    public void setCornerRadius(final float cornerRadius) {
        ((RichImageView)this.getImageView()).setCornerRadius(cornerRadius);
    }
    
    public void setOverlayDrawableId(final int overlayDrawable) {
        ((RichImageView)this.getImageView()).setOverlayDrawable(overlayDrawable);
    }
    
    public void setPadding(final int n, final int n2, final int n3, final int n4) {
        super.setPadding(n, n2, n3, n4);
        this.g();
    }
    
    public void setSize(final int n) {
        this.a(n, n);
    }
    
    public void setUseAdaptiveRadius(final boolean f) {
        this.f = f;
        if (this.f) {
            this.h();
            return;
        }
        this.setCornerRadius(this.c);
    }
}
