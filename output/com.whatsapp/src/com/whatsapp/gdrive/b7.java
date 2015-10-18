// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;

class b7 implements DialogInterface$OnCancelListener
{
    final GoogleDriveActivity a;
    
    b7(final GoogleDriveActivity a) {
        this.a = a;
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        this.a.setResult(0);
        this.a.finish();
    }
}
