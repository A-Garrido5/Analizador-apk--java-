// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.Display;
import android.widget.RelativeLayout;
import android.content.res.Configuration;
import android.view.ViewConfiguration;
import android.view.View$OnTouchListener;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import android.app.Activity;
import android.widget.PopupWindow$OnDismissListener;
import android.widget.PopupWindow;

public class n7 extends PopupWindow
{
    private PopupWindow$OnDismissListener a;
    private Activity b;
    private eu c;
    private bi d;
    private View e;
    private boolean f;
    private ViewGroup g;
    
    public n7(final Activity b) {
        super((Context)b);
        this.a = (PopupWindow$OnDismissListener)new u7(this);
        this.b = b;
        final EmojiPopupWindow$2 contentView = new EmojiPopupWindow$2(this, (Context)b);
        alm.a(b.getLayoutInflater(), 2130903152, (ViewGroup)contentView, true);
        this.g = (ViewGroup)contentView.findViewById(2131755551);
        this.g.getLayoutParams().height = -1;
        this.g.setVisibility(0);
        this.setContentView((View)contentView);
        this.setWidth(-1);
        this.setHeight(-2);
        this.setBackgroundDrawable((Drawable)new BitmapDrawable());
        this.setTouchInterceptor((View$OnTouchListener)new rr(this));
        this.setOnDismissListener(this.a);
        this.setTouchable(true);
        this.setFocusable(true);
        this.setOutsideTouchable(true);
        this.setInputMethodMode(2);
        (this.d = new bi((Context)b, this.g)).b((b.getWindowManager().getDefaultDisplay().getWidth() - ViewConfiguration.getScrollBarSize()) / b.getResources().getDimensionPixelSize(2131361909));
    }
    
    static Activity a(final n7 n7) {
        return n7.b;
    }
    
    static View b(final n7 n7) {
        return n7.e;
    }
    
    public void a(final Configuration configuration) {
    }
    
    public void a(final View e) {
        this.e = e;
        final int height = e.getHeight();
        final int[] array = new int[2];
        e.getLocationOnScreen(array);
        final int n = 0 + (height + array[1]);
        final Display defaultDisplay = this.b.getWindowManager().getDefaultDisplay();
        Label_0077: {
            if (n > 2 * defaultDisplay.getHeight() / 3) {
                this.setHeight(0 + array[1]);
                if (!App.I) {
                    break Label_0077;
                }
            }
            this.setHeight(-2);
        }
        this.setWidth(-1);
        final int n2 = (defaultDisplay.getWidth() - ViewConfiguration.getScrollBarSize()) / this.b.getResources().getDimensionPixelSize(2131361909);
        this.setOnDismissListener(this.a);
        this.showAsDropDown(e, 0, 0);
        final boolean aboveAnchor = this.isAboveAnchor();
        if (aboveAnchor != this.f) {
            final RelativeLayout relativeLayout = (RelativeLayout)this.getContentView();
            relativeLayout.removeAllViews();
            this.b.getLayoutInflater().inflate(2130903152, (ViewGroup)relativeLayout, true);
            alm.a((View)relativeLayout);
            this.g = (ViewGroup)relativeLayout.findViewById(2131755551);
            this.g.getLayoutParams().height = -1;
            this.g.setVisibility(0);
            (this.d = new bi((Context)this.b, this.g)).a(this.c);
        }
        this.f = aboveAnchor;
        this.d.b(n2);
    }
    
    public void a(final PopupWindow$OnDismissListener a) {
        this.setOnDismissListener(this.a = a);
    }
    
    public void a(final eu c) {
        this.c = c;
        this.d.a(c);
    }
}
