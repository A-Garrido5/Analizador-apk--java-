// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Checkable;
import android.widget.ImageView;

public class ActionButton extends ImageView implements Checkable
{
    private static final int[] a;
    private boolean b;
    private String c;
    private String d;
    private String e;
    private String f;
    
    static {
        a = new int[] { 16842912 };
    }
    
    public ActionButton(final Context context, final AttributeSet set) {
        super(context, set);
        this.d = context.getString(lg.content_description_follow_button);
        this.c = context.getString(lg.content_description_unfollow_button);
        this.e = context.getString(lg.default_user_value);
    }
    
    public void a() {
        String s;
        if (this.b) {
            s = this.c;
        }
        else {
            s = this.d;
        }
        if (s != null) {
            String s2;
            if (!TextUtils.isEmpty((CharSequence)this.f)) {
                s2 = this.f;
            }
            else {
                s2 = this.e;
            }
            this.setContentDescription((CharSequence)String.format(s, s2));
        }
    }
    
    public void a(final int imageResource) {
        if (imageResource == 0) {
            this.setVisibility(8);
            return;
        }
        this.setImageResource(imageResource);
        this.setVisibility(0);
    }
    
    public void getHitRect(final Rect rect) {
        super.getHitRect(rect);
        if (rect == null) {
            return;
        }
        final int n = (int)(24.0f * this.getResources().getDisplayMetrics().density);
        rect.top -= n;
        rect.right += n;
        rect.bottom += n / 2;
        rect.left -= n;
    }
    
    public boolean isChecked() {
        return this.b;
    }
    
    public int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 1);
        if (this.b) {
            mergeDrawableStates(onCreateDrawableState, ActionButton.a);
        }
        this.a();
        return onCreateDrawableState;
    }
    
    public void setChecked(final boolean b) {
        if (this.b != b) {
            this.b = b;
            this.refreshDrawableState();
            this.a();
        }
    }
    
    public void setUnclickableResource(final int imageResource) {
        if (imageResource != 0) {
            this.setVisibility(0);
            this.setImageResource(imageResource);
            this.setBackgroundDrawable((Drawable)null);
            this.setClickable(false);
            return;
        }
        this.setVisibility(8);
    }
    
    public void setUsername(final String f) {
        this.f = f;
        this.a();
    }
    
    public void toggle() {
        this.setChecked(!this.b);
    }
}
