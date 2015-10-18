// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Vector;

class n0 extends n9
{
    final GroupChatInfo j;
    
    n0(final GroupChatInfo j, final String s, final String s2, final Vector vector, final int n) {
        this.j = j;
        super(s, s2, vector, n);
    }
    
    @Override
    public void b() {
        GroupChatInfo.x(this.j);
    }
}
