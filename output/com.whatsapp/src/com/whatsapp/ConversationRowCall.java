// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import android.content.Context;

public class ConversationRowCall extends ConversationRow
{
    public ConversationRowCall(final Context context, final bi bi) {
        super(context, bi);
    }
    
    private void b(final bi bi) {
    }
    
    @Override
    public void a(final bi bi, final boolean b) {
        if (this.t != bi || b) {
            this.b(bi);
        }
        super.a(bi, b);
    }
    
    @Override
    protected int b() {
        return 2130903114;
    }
    
    @Override
    protected int p() {
        return 2130903115;
    }
}
