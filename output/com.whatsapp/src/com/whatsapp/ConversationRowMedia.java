// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import android.content.Context;
import com.whatsapp.util.co;

public abstract class ConversationRowMedia extends ConversationRow
{
    protected co F;
    protected co G;
    protected co H;
    protected co I;
    
    public ConversationRowMedia(final Context context, final bi bi) {
        super(context, bi);
        this.I = new a0r(this);
        this.F = new a0c(this);
        this.H = new a03(this);
        this.G = new a05(this);
    }
    
    @Override
    protected abstract void j();
}
