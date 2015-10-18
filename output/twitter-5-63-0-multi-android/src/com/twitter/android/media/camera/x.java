// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.view.animation.Transformation;
import android.view.View$MeasureSpec;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation$AnimationListener;
import android.view.ViewGroup;
import com.twitter.android.media.widget.CameraToolbar;
import com.twitter.android.media.widget.CameraPreviewContainer;
import android.view.animation.Animation;

public class x extends Animation
{
    private final CameraPreviewContainer a;
    private final CameraToolbar b;
    private int c;
    private int d;
    private int e;
    private int f;
    private float g;
    private float h;
    private float i;
    private float j;
    private int k;
    private int l;
    private int m;
    private int n;
    private float o;
    private float p;
    private float q;
    private float r;
    
    public x(final ViewGroup viewGroup) {
        this.setDuration(250L);
        this.setAnimationListener((Animation$AnimationListener)new y(this, viewGroup));
        this.setInterpolator(AnimationUtils.loadInterpolator(viewGroup.getContext(), 2131034147));
        final int width = viewGroup.getWidth();
        final int height = viewGroup.getHeight();
        this.a = (CameraPreviewContainer)viewGroup.findViewById(2131886334);
        this.b = (CameraToolbar)viewGroup.findViewById(2131886342);
        this.c = this.a.getLeft();
        this.d = this.a.getTop();
        this.e = this.a.getRight();
        this.f = this.a.getBottom();
        this.k = this.b.getLeft();
        this.l = this.b.getTop();
        this.m = this.b.getRight();
        this.n = this.b.getBottom();
        viewGroup.forceLayout();
        viewGroup.measure(View$MeasureSpec.makeMeasureSpec(width, 1073741824), View$MeasureSpec.makeMeasureSpec(height, 1073741824));
        viewGroup.layout(viewGroup.getLeft(), viewGroup.getTop(), viewGroup.getRight(), viewGroup.getBottom());
        this.g = Math.max(this.a.getLeft(), 0) - this.c;
        this.h = Math.max(this.a.getTop(), 0) - this.d;
        this.i = Math.min(this.a.getRight(), width) - this.e;
        this.j = Math.min(this.a.getBottom(), height) - this.f;
        this.o = Math.max(this.b.getLeft(), 0) - this.k;
        this.p = Math.max(this.b.getTop(), 0) - this.l;
        this.q = Math.min(this.b.getRight(), width) - this.m;
        this.r = Math.min(this.b.getBottom(), height) - this.n;
        this.a.a(this.c, this.d, this.e, this.f);
        this.b.a(this.k, this.l, this.m, this.n);
    }
    
    protected void applyTransformation(final float n, final Transformation transformation) {
        this.a.a((int)(n * this.g) + this.c, (int)(n * this.h) + this.d, (int)(n * this.i) + this.e, (int)(n * this.j) + this.f);
        this.b.a((int)(n * this.o) + this.k, (int)(n * this.p) + this.l, (int)(n * this.q) + this.m, (int)(n * this.r) + this.n);
    }
}
