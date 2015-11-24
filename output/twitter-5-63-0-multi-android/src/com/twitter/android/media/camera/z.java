// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import com.twitter.android.util.l;
import android.view.WindowManager;
import android.content.Context;
import android.view.OrientationEventListener;

public class z
{
    private final OrientationEventListener a;
    private int b;
    private int c;
    private int d;
    private ab e;
    
    public z(final Context context) {
        this.b = -1;
        this.c = -1;
        final aa a = new aa(this, context.getApplicationContext());
        if (a.canDetectOrientation()) {
            a.enable();
            this.a = a;
            return;
        }
        this.a = null;
    }
    
    public static int a(final Context context) {
        return 90 * ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getRotation();
    }
    
    public static int a(final Context context, final int n) {
        return l.a(a(context) - n);
    }
    
    public static int b(final Context context) {
        final int rotation = ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getRotation();
        final int orientation = context.getResources().getConfiguration().orientation;
        if (((rotation == 0 || rotation == 2) && orientation == 1) || ((rotation == 1 || rotation == 3) && orientation == 2)) {
            return 1;
        }
        return 2;
    }
    
    public void a() {
        if (this.a != null) {
            this.a.enable();
        }
    }
    
    void a(final int n) {
        if (n != -1) {
            final int a = l.a(n, this.b);
            if (a != this.b) {
                if (a != this.c) {
                    this.c = a;
                    this.d = 1;
                    return;
                }
                ++this.d;
                if (this.d == 3) {
                    this.b = a;
                    if (this.e != null) {
                        this.e.a(a);
                    }
                }
            }
        }
    }
    
    public void a(final ab e) {
        this.e = e;
    }
    
    public void b() {
        if (this.a != null) {
            this.a.disable();
        }
    }
}
