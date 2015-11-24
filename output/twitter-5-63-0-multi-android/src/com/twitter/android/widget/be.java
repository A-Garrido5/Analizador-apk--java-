// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.ViewGroup$LayoutParams;
import android.view.WindowManager;
import android.view.WindowManager$LayoutParams;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public class be implements e
{
    private final ViewGroup a;
    private final ViewGroup b;
    private final View c;
    private final Context d;
    private final ap e;
    private AnimatableParams f;
    
    public be(final Context d, final ap e) {
        this.f = new AnimatableParams();
        this.d = d;
        this.e = e;
        this.a = (ViewGroup)new FrameLayout(d);
        this.b = (ViewGroup)new FrameLayout(d);
        this.c = new View(d);
        this.a.addView((View)this.b);
        if (bg.a().i()) {
            this.c.setBackgroundColor(1727987712);
        }
    }
    
    private WindowManager$LayoutParams d() {
        final WindowManager$LayoutParams windowManager$LayoutParams = new WindowManager$LayoutParams();
        final AnimatableParams a = this.a();
        windowManager$LayoutParams.type = a.type;
        windowManager$LayoutParams.format = a.format;
        windowManager$LayoutParams.gravity = a.gravity;
        windowManager$LayoutParams.flags = (0x10 | a.flags);
        windowManager$LayoutParams.width = -1;
        windowManager$LayoutParams.height = -1;
        windowManager$LayoutParams.x = 0;
        windowManager$LayoutParams.y = 0;
        return windowManager$LayoutParams;
    }
    
    @Override
    public AnimatableParams a() {
        return this.f;
    }
    
    public void a(final WindowManager windowManager) {
        if (this.a.getParent() != null || this.c.getParent() != null) {
            throw new IllegalStateException("Dock already added to window manager.");
        }
        this.a.setLayoutParams((ViewGroup$LayoutParams)this.d());
        windowManager.addView((View)this.a, this.a.getLayoutParams());
        windowManager.addView(this.c, (ViewGroup$LayoutParams)this.a());
        this.h();
        this.i();
    }
    
    public void a(final AnimatableParams f) {
        this.f = f;
        final ViewGroup$LayoutParams layoutParams = this.b.getLayoutParams();
        layoutParams.width = f.width;
        layoutParams.height = f.height;
        this.b.setLayoutParams(layoutParams);
        if (this.a.getParent() != null) {
            this.h();
        }
        if (this.c.getParent() != null) {
            this.i();
        }
    }
    
    @Override
    public void b() {
        this.a().c(this.a().b());
        this.h();
    }
    
    public void b(final WindowManager windowManager) {
        if (this.a.getParent() != null) {
            windowManager.removeView((View)this.a);
        }
        if (this.c.getParent() != null) {
            windowManager.removeView(this.c);
        }
    }
    
    @Override
    public void c() {
        this.i();
    }
    
    public ViewGroup e() {
        return this.b;
    }
    
    public View f() {
        return this.c;
    }
    
    public Context g() {
        return this.d;
    }
    
    public void h() {
        final AnimatableParams a = this.a();
        this.b.setTranslationX((float)a.x);
        this.b.setTranslationY((float)a.y);
    }
    
    public void i() {
        this.e.a(this);
    }
}
