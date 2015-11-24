// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.graphics.Point;
import com.twitter.util.t;
import android.graphics.Canvas;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.ViewParent;
import android.view.View$MeasureSpec;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.content.res.TypedArray;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorInflater;
import android.util.AttributeSet;
import android.os.Build$VERSION;
import android.view.animation.Animation;
import android.view.WindowManager;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.TextView;
import android.animation.Animator;
import android.view.animation.Animation$AnimationListener;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.widget.FrameLayout;
import android.view.MotionEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.WindowManager$LayoutParams;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.support.v4.app.Fragment;

public class Tooltip extends Fragment implements View$OnClickListener, View$OnTouchListener
{
    private Activity a;
    private ViewGroup b;
    private View c;
    private z d;
    private int[] e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private x j;
    private y k;
    
    public Tooltip() {
        this.e = new int[2];
    }
    
    public static w a(final Context context, final int n) {
        return new w(context, n, null);
    }
    
    private void a() {
        if (!this.g) {
            if (this.d.getParent() != null) {
                this.b.removeView((View)this.d);
            }
            final FragmentManager fragmentManager = this.getFragmentManager();
            if (fragmentManager != null) {
                fragmentManager.beginTransaction().remove(this).commitAllowingStateLoss();
            }
            this.g = true;
        }
    }
    
    private static Tooltip b(final int n, final int n2, final CharSequence charSequence, final int n3, final int n4, final y y, final boolean b, final boolean b2) {
        final Tooltip tooltip = new Tooltip();
        final Bundle arguments = new Bundle();
        arguments.putInt("targetViewId", n);
        arguments.putInt("containerId", n2);
        arguments.putCharSequence("text", charSequence);
        arguments.putInt("styleId", n4);
        arguments.putInt("arrowDirection", n3);
        arguments.putBoolean("dismissOnPause", b);
        arguments.putBoolean("animate", b2);
        tooltip.setArguments(arguments);
        tooltip.a(y);
        return tooltip;
    }
    
    private void b() {
        if (this.c.getParent() == null) {
            final WindowManager$LayoutParams windowManager$LayoutParams = new WindowManager$LayoutParams();
            windowManager$LayoutParams.width = 0;
            windowManager$LayoutParams.height = 0;
            windowManager$LayoutParams.flags = 393256;
            windowManager$LayoutParams.format = -2;
            if ((0x400 & this.a.getWindow().getAttributes().flags) != 0x0) {
                windowManager$LayoutParams.flags |= 0x400;
            }
            this.a.getWindowManager().addView(this.c, (ViewGroup$LayoutParams)windowManager$LayoutParams);
        }
    }
    
    private void c() {
        if (this.c.getParent() != null) {
            this.a.getWindowManager().removeViewImmediate(this.c);
        }
    }
    
    public Tooltip a(final CharSequence charSequence) {
        if (this.d != null) {
            this.d.a(charSequence);
        }
        return this;
    }
    
    public void a(final y k) {
        this.k = k;
    }
    
    public void a(final boolean b) {
        if (!this.f && this.d != null) {
            this.c();
            this.d.a(b, new v(this));
            this.f = true;
        }
    }
    
    @Override
    public void onAttach(final Activity a) {
        super.onAttach(a);
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (this.k != null) {
            this.k.a(this, 1);
            return;
        }
        this.j.sendEmptyMessage(1);
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.j = new x(this);
        this.h = (bundle != null);
    }
    
    @Override
    public void onDetach() {
        this.k = null;
        super.onDetach();
    }
    
    @Override
    public void onPause() {
        this.c();
        if (this.i) {
            this.a(false);
        }
        super.onPause();
    }
    
    @Override
    public void onResume() {
        super.onResume();
        if (this.d == null) {
            final Bundle arguments = this.getArguments();
            final int int1 = arguments.getInt("targetViewId");
            final int int2 = arguments.getInt("containerId");
            this.i = arguments.getBoolean("dismissOnPause");
            if (int2 == 0) {
                this.b = (ViewGroup)this.a.getWindow().getDecorView();
            }
            else {
                this.b = (ViewGroup)this.a.findViewById(int2);
            }
            (this.d = new z(this.a, this.a.findViewById(int1), this.b, arguments.getString("text"), arguments.getInt("arrowDirection"), arguments.getInt("styleId"), null)).setOnClickListener((View$OnClickListener)this);
            this.b.addView((View)this.d, new ViewGroup$LayoutParams(-2, -2));
            if (this.h) {
                this.d.a(false);
            }
            else {
                this.d.a(arguments.getBoolean("animate"));
            }
            (this.c = new View((Context)this.getActivity())).setBackgroundColor(0);
            this.c.setOnTouchListener((View$OnTouchListener)this);
        }
        this.b();
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(this.getTag(), true);
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (view == this.c) {
            this.d.getLocationOnScreen(this.e);
            final float rawX = motionEvent.getRawX();
            final float rawY = motionEvent.getRawY();
            int n;
            if (rawX > this.e[0] && rawX < this.e[0] + this.d.getWidth() && rawY > this.e[1] && rawY < this.e[1] + this.d.getHeight()) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n == 0) {
                this.j.sendEmptyMessage(1);
            }
        }
        return false;
    }
}
