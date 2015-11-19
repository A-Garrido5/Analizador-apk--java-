// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.library.featureswitch.d;
import android.graphics.Paint$FontMetrics;
import android.graphics.drawable.InsetDrawable;
import android.text.style.ImageSpan;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build$VERSION;
import android.util.Log;
import com.twitter.library.client.App;
import android.support.v4.util.LongSparseArray;
import java.util.HashMap;
import java.util.HashSet;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Region;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

class w extends Drawable implements Drawable$Callback
{
    final /* synthetic */ t a;
    private Drawable b;
    private Drawable c;
    private final int d;
    private final int e;
    
    public w(final t a, final int d, final int e) {
        this.a = a;
        this.b = a.a;
        this.d = d;
        this.e = e;
        this.setBounds(0, 0, e + 2 * a.k, e);
    }
    
    void a() {
        this.c = this.a.a(this.d, this.e);
    }
    
    void b() {
        final Drawable c = this.c;
        if (c != null && c != this.b) {
            c.setVisible(this.isVisible(), true);
            c.setState(this.getState());
            c.setLevel(this.getLevel());
            c.setBounds(this.getBounds());
            this.b = c;
            this.c = null;
            this.invalidateSelf();
        }
    }
    
    public void draw(final Canvas canvas) {
        this.b.draw(canvas);
    }
    
    public int getChangingConfigurations() {
        return this.b.getChangingConfigurations();
    }
    
    public Drawable getCurrent() {
        return this.b.getCurrent();
    }
    
    public int getIntrinsicHeight() {
        return this.b.getIntrinsicHeight();
    }
    
    public int getIntrinsicWidth() {
        return this.b.getIntrinsicWidth();
    }
    
    public int getMinimumHeight() {
        return this.b.getMinimumHeight();
    }
    
    public int getMinimumWidth() {
        return this.b.getMinimumWidth();
    }
    
    public int getOpacity() {
        return this.b.getOpacity();
    }
    
    public boolean getPadding(final Rect rect) {
        return this.b.getPadding(rect);
    }
    
    public int[] getState() {
        return this.b.getState();
    }
    
    public Region getTransparentRegion() {
        return this.b.getTransparentRegion();
    }
    
    public void invalidateDrawable(final Drawable drawable) {
        this.invalidateSelf();
    }
    
    public boolean isStateful() {
        return this.b.isStateful();
    }
    
    public void jumpToCurrentState() {
        this.b.jumpToCurrentState();
    }
    
    public void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        this.scheduleSelf(runnable, n);
    }
    
    public void setAlpha(final int alpha) {
        this.b.setAlpha(alpha);
    }
    
    public void setBounds(final int n, final int n2, final int n3, final int n4) {
        super.setBounds(n, n2, n3, n4);
        this.b.setBounds(n, n2, n3, n4);
    }
    
    public void setChangingConfigurations(final int changingConfigurations) {
        this.b.setChangingConfigurations(changingConfigurations);
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
    
    public void setDither(final boolean dither) {
        this.b.setDither(dither);
    }
    
    public void setFilterBitmap(final boolean filterBitmap) {
        this.b.setFilterBitmap(filterBitmap);
    }
    
    public boolean setState(final int[] state) {
        return this.b.setState(state);
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        return super.setVisible(b, b2) || this.b.setVisible(b, b2);
    }
    
    public void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}
