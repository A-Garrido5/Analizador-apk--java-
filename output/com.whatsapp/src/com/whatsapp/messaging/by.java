// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Binder;

public final class by extends Binder
{
    final MessageService a;
    
    public by(final MessageService a) {
        this.a = a;
    }
    
    public final MessageService a() {
        return this.a;
    }
}
