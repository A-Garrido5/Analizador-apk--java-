// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import android.net.Uri;
import android.content.ActivityNotFoundException;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.content.Intent;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;

public abstract class ExternalActionButton extends FrameLayout implements View$OnClickListener, ao
{
    protected TextView a;
    protected ProgressBar b;
    private View$OnClickListener c;
    private boolean d;
    private boolean e;
    private Intent f;
    private Intent g;
    private String h;
    private String i;
    private af j;
    
    public ExternalActionButton(final Context context) {
        super(context);
        this.c = null;
        this.d = false;
        this.e = false;
        this.f = null;
        this.g = null;
        this.h = "";
        this.i = "";
        this.j = null;
        this.b(context, null, 0);
    }
    
    public ExternalActionButton(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = null;
        this.d = false;
        this.e = false;
        this.f = null;
        this.g = null;
        this.h = "";
        this.i = "";
        this.j = null;
        this.b(context, set, 0);
    }
    
    public ExternalActionButton(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c = null;
        this.d = false;
        this.e = false;
        this.f = null;
        this.g = null;
        this.h = "";
        this.i = "";
        this.j = null;
        this.b(context, set, n);
    }
    
    private void a() {
        if (this.e) {
            this.b.setVisibility(0);
            this.a.setVisibility(8);
            return;
        }
        this.b.setVisibility(8);
        this.a.setVisibility(0);
        final TextView a = this.a;
        String text;
        if (this.d) {
            text = this.h;
        }
        else {
            text = this.i;
        }
        a.setText((CharSequence)text);
    }
    
    private void b() {
        if (!this.e && this.f != null) {
            this.e = true;
            this.a();
            new an(this.getContext().getPackageManager(), this).execute((Object[])new Intent[] { this.f });
        }
    }
    
    private void b(final Context context, final AttributeSet set, final int n) {
        this.a(context, set, n);
        super.setOnClickListener((View$OnClickListener)this);
    }
    
    protected abstract void a(final Context p0, final AttributeSet p1, final int p2);
    
    public void a(final boolean d) {
        this.d = d;
        this.e = false;
        this.a();
        if (this.j != null) {
            this.j.a(d);
        }
    }
    
    public void onClick(final View view) {
        if (this.c != null) {
            this.c.onClick(view);
        }
        Intent intent;
        if (this.d) {
            intent = this.f;
        }
        else {
            intent = this.g;
        }
        if (this.e || intent == null) {
            return;
        }
        if (this.j != null) {
            final af j = this.j;
            if (this.d) {
                goto Label_0097;
            }
            j.b(true);
        }
        try {
            this.getContext().startActivity(intent);
        }
        catch (ActivityNotFoundException ex) {}
        catch (SecurityException ex2) {
            goto Label_0092;
        }
    }
    
    public void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        if (b) {
            this.b();
        }
    }
    
    public void setActionText(final String h) {
        this.h = h;
        this.a();
    }
    
    public void setEventLister(final af j) {
        this.j = j;
    }
    
    public void setExternalUri(final Uri data) {
        (this.f = new Intent("android.intent.action.VIEW")).setData(data);
        this.b();
    }
    
    public void setFallbackIntent(final Intent g) {
        this.g = g;
    }
    
    public void setFallbackText(final String i) {
        this.i = i;
        this.a();
    }
    
    public void setFallbackUri(final Uri data) {
        (this.g = new Intent("android.intent.action.VIEW")).setData(data);
    }
    
    public void setOnClickListener(final View$OnClickListener c) {
        this.c = c;
    }
    
    public void setTextColor(final int textColor) {
        this.a.setTextColor(textColor);
    }
}
