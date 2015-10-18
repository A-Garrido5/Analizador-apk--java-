// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import com.whatsapp.util.co;

class a0n extends co
{
    final WebSessionsActivity b;
    
    a0n(final WebSessionsActivity b) {
        this.b = b;
    }
    
    @Override
    public void a(final View view) {
        new WebSessionsActivity$LogoutAllConfirmationDialogFragment().show(this.b.getSupportFragmentManager(), null);
    }
}
