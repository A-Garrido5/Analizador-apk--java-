// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.TextUtils;

public final class rw extends qy
{
    public rw(final a_9 a_9) {
        super(a_9);
    }
    
    @Override
    protected boolean b(final a_9 a_9) {
        final boolean b = !TextUtils.equals((CharSequence)this.a.d, (CharSequence)a_9.d);
        a_9.d = this.a.d;
        a_9.s = this.a.s;
        return b;
    }
}
