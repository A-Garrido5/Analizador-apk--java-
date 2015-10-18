// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;

class t2 implements Runnable
{
    final Conversation a;
    final String b;
    
    t2(final Conversation a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        int n;
        for (int j = 0; j < this.a.aI.getChildCount(); j = n) {
            final View child = this.a.aI.getChildAt(j);
            if (child instanceof ConversationRow) {
                ((ConversationRow)child).a(this.b);
            }
            n = j + 1;
            if (i) {
                break;
            }
        }
    }
}
