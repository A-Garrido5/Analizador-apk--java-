// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common;

import com.google.android.gms.internal.ap;
import com.google.android.gms.dynamic.g$a;
import android.util.Log;
import com.google.android.gms.internal.aq;
import com.google.android.gms.internal.jz;
import android.widget.Button;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;

public final class SignInButton extends FrameLayout implements View$OnClickListener
{
    private int a;
    private int b;
    private View c;
    private View$OnClickListener d;
    
    public SignInButton(final Context context) {
        this(context, null);
    }
    
    public SignInButton(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public SignInButton(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.d = null;
        this.a(0, 0);
    }
    
    private static Button a(final Context context, final int n, final int n2) {
        final jz jz = new jz(context);
        jz.a(context.getResources(), n, n2);
        return jz;
    }
    
    private void a(final Context context) {
        if (this.c != null) {
            this.removeView(this.c);
        }
        while (true) {
            try {
                this.c = aq.a(context, this.a, this.b);
                this.addView(this.c);
                this.c.setEnabled(this.isEnabled());
                this.c.setOnClickListener((View$OnClickListener)this);
            }
            catch (g$a g$a) {
                Log.w("SignInButton", "Sign in button not found, using placeholder instead");
                this.c = (View)a(context, this.a, this.b);
                continue;
            }
            break;
        }
    }
    
    public void a(final int a, final int b) {
        ap.a(a >= 0 && a < 3, "Unknown button size %d", a);
        ap.a(b >= 0 && b < 2, "Unknown color scheme %s", b);
        this.a = a;
        this.b = b;
        this.a(this.getContext());
    }
    
    public void onClick(final View view) {
        if (this.d != null && view == this.c) {
            this.d.onClick((View)this);
        }
    }
    
    public void setColorScheme(final int n) {
        this.a(this.a, n);
    }
    
    public void setEnabled(final boolean b) {
        super.setEnabled(b);
        this.c.setEnabled(b);
    }
    
    public void setOnClickListener(final View$OnClickListener d) {
        this.d = d;
        if (this.c != null) {
            this.c.setOnClickListener((View$OnClickListener)this);
        }
    }
    
    public void setSize(final int n) {
        this.a(n, this.b);
    }
}
