// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util.undobar;

class e implements Runnable
{
    final UndoBarController a;
    
    e(final UndoBarController a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (UndoBarController.a(this.a) instanceof d) {
            ((d)UndoBarController.a(this.a)).a(UndoBarController.b(this.a));
        }
        UndoBarController.a(this.a, false);
    }
}
