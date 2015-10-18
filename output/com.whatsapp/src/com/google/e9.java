// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.UUID;

final class e9 extends e_
{
    @Override
    public void a(final c3 c3, final Object o) {
        this.a(c3, (UUID)o);
    }
    
    public void a(final c3 c3, final UUID uuid) {
        String string;
        if (uuid == null) {
            string = null;
        }
        else {
            string = uuid.toString();
        }
        c3.a(string);
    }
}
