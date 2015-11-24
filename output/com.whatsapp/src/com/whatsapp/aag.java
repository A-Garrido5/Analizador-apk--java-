// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.TextUtils$TruncateAt;

class aag implements Runnable
{
    final ahz a;
    
    aag(final ahz a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (ahz.a(this.a).equals(this.a.e.s.u)) {
            Conversation.W(this.a.e);
            Conversation.U(this.a.e).setEllipsize(TextUtils$TruncateAt.END);
        }
    }
}
