// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;

class qd implements Runnable
{
    final Conversation a;
    
    qd(final Conversation a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        int n;
        for (int j = 0; j < this.a.aI.getChildCount(); j = n) {
            final View child = this.a.aI.getChildAt(j);
            if (child instanceof ConversationRow) {
                ((ConversationRow)child).a();
            }
            n = j + 1;
            if (i) {
                break;
            }
        }
    }
}
