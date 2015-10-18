// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.view.ViewConfiguration;
import android.view.View;
import com.twitter.util.t;
import com.twitter.util.a;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import java.util.List;
import android.view.ViewGroup;
import android.graphics.RectF;
import android.graphics.Rect;

public class ap
{
    final /* synthetic */ TouchableView a;
    private final long b;
    private final long c;
    private final int[] d;
    private Rect e;
    private RectF f;
    private Runnable g;
    private Runnable h;
    private Runnable i;
    
    public ap(final TouchableView a, final long b, final long c, final Runnable i, final int[] d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.i = i;
        this.d = d;
    }
    
    public Rect a() {
        return this.e;
    }
    
    public void a(final Rect e) {
        this.e = e;
    }
    
    public void a(final RectF f) {
        this.f = f;
    }
    
    public void a(final boolean b) {
        if (this.c() == b) {
            return;
        }
        if (b) {
            TouchableView.b(this.a, -1L ^ this.b);
            TouchableView.a(this.a, this.c);
        }
        else {
            TouchableView.b(this.a, -1L ^ this.c);
        }
        this.a.refreshDrawableState();
        this.a.invalidate();
    }
    
    public void a(final int[] array) {
        TouchableView.a(array, this.d);
    }
    
    public boolean a(final int n, final int n2) {
        return (this.e != null && this.e.contains(n, n2)) || (this.f != null && this.f.contains((float)n, (float)n2));
    }
    
    public void b() {
        TouchableView.a(this.a, this.b);
    }
    
    public boolean c() {
        return (this.a.b & this.c) != 0x0L;
    }
    
    public boolean d() {
        return (this.a.b & this.b) != 0x0L;
    }
    
    public Runnable e() {
        if (this.g == null) {
            this.g = new aq(this);
        }
        return this.g;
    }
    
    public Runnable f() {
        if (this.h == null) {
            this.h = new ar(this);
        }
        return this.h;
    }
    
    public Runnable g() {
        return this.i;
    }
    
    public void h() {
        this.i.run();
    }
    
    public void i() {
        if (this.g != null) {
            TouchableView.b(this.a, -1L ^ this.b);
            this.a.removeCallbacks(this.g);
        }
    }
    
    public void j() {
        if (this.h != null) {
            this.a.removeCallbacks(this.h);
        }
    }
}
