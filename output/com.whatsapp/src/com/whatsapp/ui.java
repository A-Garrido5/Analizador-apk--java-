// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Process;
import android.content.DialogInterface;
import android.app.Activity;
import android.content.DialogInterface$OnCancelListener;

final class ui implements DialogInterface$OnCancelListener
{
    final Activity a;
    
    ui(final Activity a) {
        this.a = a;
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        this.a.finish();
        Process.killProcess(Process.myPid());
    }
}
