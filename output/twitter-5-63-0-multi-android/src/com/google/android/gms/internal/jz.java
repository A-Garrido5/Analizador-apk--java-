// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.graphics.Typeface;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Button;

public final class jz extends Button
{
    public jz(final Context context) {
        this(context, null);
    }
    
    public jz(final Context context, final AttributeSet set) {
        super(context, set, 16842824);
    }
    
    private int a(final int n, int n2, final int n3) {
        switch (n) {
            default: {
                throw new IllegalStateException("Unknown color scheme: " + n);
            }
            case 1: {
                n2 = n3;
            }
            case 0: {
                return n2;
            }
        }
    }
    
    private void a(final Resources resources) {
        this.setTypeface(Typeface.DEFAULT_BOLD);
        this.setTextSize(14.0f);
        final float density = resources.getDisplayMetrics().density;
        this.setMinHeight((int)(0.5f + density * 48.0f));
        this.setMinWidth((int)(0.5f + density * 48.0f));
    }
    
    private void b(final Resources resources, final int n, final int n2) {
        int n3 = 0;
        switch (n) {
            default: {
                throw new IllegalStateException("Unknown button size: " + n);
            }
            case 0:
            case 1: {
                n3 = this.a(n2, al.common_signin_btn_text_dark, al.common_signin_btn_text_light);
                break;
            }
            case 2: {
                n3 = this.a(n2, al.common_signin_btn_icon_dark, al.common_signin_btn_icon_light);
                break;
            }
        }
        if (n3 == -1) {
            throw new IllegalStateException("Could not find background resource!");
        }
        this.setBackgroundDrawable(resources.getDrawable(n3));
    }
    
    private void c(final Resources resources, final int n, final int n2) {
        this.setTextColor(resources.getColorStateList(this.a(n2, ak.common_signin_btn_text_dark, ak.common_signin_btn_text_light)));
        switch (n) {
            default: {
                throw new IllegalStateException("Unknown button size: " + n);
            }
            case 0: {
                this.setText((CharSequence)resources.getString(am.common_signin_button_text));
            }
            case 1: {
                this.setText((CharSequence)resources.getString(am.common_signin_button_text_long));
            }
            case 2: {
                this.setText((CharSequence)null);
            }
        }
    }
    
    public void a(final Resources resources, final int n, final int n2) {
        ap.a(n >= 0 && n < 3, "Unknown button size %d", n);
        ap.a(n2 >= 0 && n2 < 2, "Unknown color scheme %s", n2);
        this.a(resources);
        this.b(resources, n, n2);
        this.c(resources, n, n2);
    }
}
