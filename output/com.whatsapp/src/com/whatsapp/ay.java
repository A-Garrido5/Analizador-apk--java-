// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.KeyEvent;
import android.content.Context;
import android.app.ProgressDialog;

public class ay extends ProgressDialog
{
    public ay(final Context context) {
        super(context);
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        return n == 84 || super.onKeyDown(n, keyEvent);
    }
}
