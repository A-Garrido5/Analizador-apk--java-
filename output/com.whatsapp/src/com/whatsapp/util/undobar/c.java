// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util.undobar;

import com.whatsapp.DialogToastActivity;
import android.os.Parcelable;
import android.app.Activity;

public class c
{
    private g a;
    private CharSequence b;
    private long c;
    private int d;
    private final Activity e;
    private a f;
    private Parcelable g;
    
    public c(final Activity e) {
        this.d = -1;
        this.e = e;
    }
    
    public UndoBarController a() {
        return this.a(true);
    }
    
    public UndoBarController a(final boolean b) {
        final boolean t = UndoBarController.t;
        if (this.f == null && this.a == null) {
            this.a = UndoBarController.q;
        }
        if (this.a == null) {
            this.a = UndoBarController.l;
        }
        if (this.b == null) {
            this.b = "";
        }
        if (this.c > 0L) {
            this.a.f = this.c;
        }
        final UndoBarController a = UndoBarController.a(this.e, this.b, this.f, this.g, !b, this.a, this.d);
        if (DialogToastActivity.h) {
            boolean t2 = false;
            if (!t) {
                t2 = true;
            }
            UndoBarController.t = t2;
        }
        return a;
    }
    
    public c a(final int n) {
        this.b = this.e.getText(n);
        return this;
    }
    
    public c a(final Parcelable g) {
        this.g = g;
        return this;
    }
    
    public c a(final a f) {
        this.f = f;
        return this;
    }
}
