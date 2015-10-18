// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.dynamic;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout;
import com.google.android.gms.common.e;
import android.widget.FrameLayout;
import java.util.LinkedList;
import android.os.Bundle;

public abstract class b
{
    private a a;
    private Bundle b;
    private LinkedList c;
    private final o d;
    
    public b() {
        this.d = new c(this);
    }
    
    private void a(final int n) {
        while (!this.c.isEmpty() && this.c.getLast().a() >= n) {
            this.c.removeLast();
        }
    }
    
    private void a(final Bundle bundle, final j j) {
        if (this.a != null) {
            j.a(this.a);
            return;
        }
        if (this.c == null) {
            this.c = new LinkedList();
        }
        this.c.add(j);
        if (bundle != null) {
            if (this.b == null) {
                this.b = (Bundle)bundle.clone();
            }
            else {
                this.b.putAll(bundle);
            }
        }
        this.a(this.d);
    }
    
    public static void b(final FrameLayout frameLayout) {
        final Context context = frameLayout.getContext();
        final int a = e.a(context);
        final String a2 = e.a(context, a);
        final String b = e.b(context, a);
        final LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
        frameLayout.addView((View)linearLayout);
        final TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
        textView.setText((CharSequence)a2);
        linearLayout.addView((View)textView);
        if (b != null) {
            final Button button = new Button(context);
            button.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
            button.setText((CharSequence)b);
            linearLayout.addView((View)button);
            button.setOnClickListener((View$OnClickListener)new h(context, a));
        }
    }
    
    public View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        this.a(bundle, new f(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.a == null) {
            this.a(frameLayout);
        }
        return (View)frameLayout;
    }
    
    public a a() {
        return this.a;
    }
    
    public void a(final Activity activity, final Bundle bundle, final Bundle bundle2) {
        this.a(bundle2, new d(this, activity, bundle, bundle2));
    }
    
    public void a(final Bundle bundle) {
        this.a(bundle, new com.google.android.gms.dynamic.e(this, bundle));
    }
    
    protected void a(final FrameLayout frameLayout) {
        b(frameLayout);
    }
    
    protected abstract void a(final o p0);
    
    public void b() {
        this.a(null, new i(this));
    }
    
    public void b(final Bundle bundle) {
        if (this.a != null) {
            this.a.b(bundle);
        }
        else if (this.b != null) {
            bundle.putAll(this.b);
        }
    }
    
    public void c() {
        if (this.a != null) {
            this.a.b();
            return;
        }
        this.a(5);
    }
    
    public void d() {
        if (this.a != null) {
            this.a.c();
            return;
        }
        this.a(2);
    }
    
    public void e() {
        if (this.a != null) {
            this.a.d();
            return;
        }
        this.a(1);
    }
    
    public void f() {
        if (this.a != null) {
            this.a.e();
        }
    }
}
