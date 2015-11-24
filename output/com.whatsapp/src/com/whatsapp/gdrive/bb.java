// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import java.util.Comparator;

class bb implements Comparator
{
    final q a;
    
    bb(final q a) {
        this.a = a;
    }
    
    public int a(final ag ag, final ag ag2) {
        return -1 * (int)(ag.h() - ag2.h());
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((ag)o, (ag)o2);
    }
}
