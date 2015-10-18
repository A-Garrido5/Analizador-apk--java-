// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.view.MotionEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.WindowManager$LayoutParams;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.Context;

public class w
{
    private final Context a;
    private int b;
    private int c;
    private y d;
    private CharSequence e;
    private int f;
    private int g;
    private boolean h;
    
    private w(final Context a, final int f) {
        this.a = a;
        this.f = f;
    }
    
    public Tooltip a(final FragmentManager fragmentManager, final String s) {
        return this.a(fragmentManager, s, true);
    }
    
    public Tooltip a(final FragmentManager fragmentManager, final String s, final boolean b) {
        final Fragment fragmentByTag = fragmentManager.findFragmentByTag(s);
        if (fragmentByTag instanceof Tooltip) {
            final Tooltip tooltip = (Tooltip)fragmentByTag;
            tooltip.a(this.d);
            return tooltip;
        }
        final Tooltip a = b(this.f, this.g, this.e, this.b, this.c, this.d, this.h, b);
        fragmentManager.beginTransaction().add(a, s).commitAllowingStateLoss();
        return a;
    }
    
    public w a(final int n) {
        this.e = this.a.getString(n);
        return this;
    }
    
    public w a(final y d) {
        this.d = d;
        return this;
    }
    
    public w a(final CharSequence e) {
        this.e = e;
        return this;
    }
    
    public w a(final boolean h) {
        this.h = h;
        return this;
    }
    
    public w b(final int c) {
        this.c = c;
        return this;
    }
    
    public w c(final int b) {
        if (b == 1 || b == 0 || b == 2 || b == 3) {
            this.b = b;
            return this;
        }
        throw new IllegalArgumentException("arrowDirection must be one of the Tooltip.POINTING_* constants");
    }
    
    public w d(final int g) {
        this.g = g;
        return this;
    }
}
