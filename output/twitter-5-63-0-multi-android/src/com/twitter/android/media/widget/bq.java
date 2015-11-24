// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.graphics.ColorFilter;
import android.graphics.Canvas;
import android.content.res.Resources;
import android.content.Context;
import android.graphics.drawable.Drawable;

public class bq extends Drawable
{
    private static final int[] a;
    private static final int[] b;
    private static final int c;
    private final Context d;
    private Drawable e;
    
    static {
        a = new int[] { 2130839475, 2130839476, 2130839477 };
        b = new int[] { 2131558992, 2131558993, 2131558994 };
        c = bq.a.length;
    }
    
    public bq(final Context d) {
        this.d = d;
    }
    
    public void a(final int n) {
        if (n == 0) {
            this.e = null;
        }
        else {
            final Resources resources = this.d.getResources();
            if (resources.getConfiguration().orientation == 2) {
                this.e = resources.getDrawable(2130839452);
                return;
            }
            for (int i = 0; i < bq.c; ++i) {
                if (resources.getDimensionPixelSize(bq.b[i]) >= n) {
                    this.e = resources.getDrawable(bq.a[i]);
                    break;
                }
            }
            if (this.e == null) {
                this.e = resources.getDrawable(bq.a[-1 + bq.c]);
            }
        }
    }
    
    public void draw(final Canvas canvas) {
        if (this.e != null) {
            this.e.setBounds(this.getBounds());
            this.e.draw(canvas);
        }
    }
    
    public int getOpacity() {
        return -1;
    }
    
    public void setAlpha(final int n) {
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
    }
}
