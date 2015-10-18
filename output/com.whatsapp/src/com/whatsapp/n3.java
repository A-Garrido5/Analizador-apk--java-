// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class n3 implements DialogInterface$OnClickListener
{
    final WebSessionsActivity$LogoutAllConfirmationDialogFragment a;
    
    n3(final WebSessionsActivity$LogoutAllConfirmationDialogFragment a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        App.c(true);
        l7.k();
        this.a.getActivity().finish();
    }
}
