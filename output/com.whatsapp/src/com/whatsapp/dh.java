// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import java.util.List;
import com.whatsapp.protocol.bi;
import android.content.DialogInterface$OnClickListener;

class dh implements DialogInterface$OnClickListener
{
    final ConversationRow a;
    final bi b;
    final List c;
    final a_9 d;
    final Conversation e;
    
    dh(final ConversationRow a, final Conversation e, final List c, final a_9 d, final bi b) {
        this.a = a;
        this.e = e;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.e.a(this.c.get(n).a, this.d.f(), this.b);
    }
}
