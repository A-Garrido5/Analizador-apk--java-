// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.b_;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.app.Dialog;

public class ahw extends Dialog
{
    private final int a;
    private final Activity b;
    
    public ahw(final Activity b, final int a) {
        super((Context)b, 2131427506);
        this.b = b;
        this.a = a;
    }
    
    public void a() {
        this.onCreate(this.onSaveInstanceState());
    }
    
    protected void onCreate(final Bundle bundle) {
        if (alm.c) {
            this.getWindow().getDecorView().setLayoutDirection(3);
        }
        super.onCreate(bundle);
        this.setContentView(alm.a(this.getWindow().getLayoutInflater(), this.a, null, false));
        this.getWindow().setLayout(-1, -1);
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        if (App.aS == 3) {
            final ViewGroup viewGroup = (ViewGroup)this.findViewById(16908290);
            switch (n) {
                case 24: {
                    return true;
                }
                case 84: {
                    b_.a(viewGroup, this.b, false);
                    return true;
                }
                case 25: {
                    b_.f();
                    return true;
                }
            }
        }
        return super.onKeyDown(n, keyEvent);
    }
}
