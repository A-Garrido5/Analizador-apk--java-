// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.text.BreakIterator;

final class cd extends ThreadLocal
{
    protected BreakIterator a() {
        return BreakIterator.getWordInstance();
    }
    
    @Override
    protected Object initialValue() {
        return this.a();
    }
}
