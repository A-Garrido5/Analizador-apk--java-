// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util.undobar;

import android.view.View;
import android.view.View$OnClickListener;

class f implements View$OnClickListener
{
    final UndoBarController a;
    
    f(final UndoBarController a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (UndoBarController.a(this.a) != null) {
            UndoBarController.a(this.a).b(UndoBarController.b(this.a));
        }
        UndoBarController.a(this.a, false);
    }
}
