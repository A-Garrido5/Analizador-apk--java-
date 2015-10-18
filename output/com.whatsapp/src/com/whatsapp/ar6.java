// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.ArrayList;

class ar6 implements atr
{
    final a63 a;
    
    ar6(final a63 a) {
        this.a = a;
    }
    
    @Override
    public void a(final ArrayList list) {
        this.a.a.runOnUiThread((Runnable)new vd(this, list));
    }
}
