// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;

class mb extends mg
{
    final a6n b;
    
    mb(final a6n b, final Context context) {
        this.b = b;
        super(context);
    }
    
    @Override
    public int a(final a_9 a_9, final a_9 a_10) {
        if (a_9.b && !a_10.b) {
            return -1;
        }
        if (!a_9.b && a_10.b) {
            return 1;
        }
        return super.a(a_9, a_10);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((a_9)o, (a_9)o2);
    }
}
