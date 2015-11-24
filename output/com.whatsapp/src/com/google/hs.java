// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.IOException;

class hs extends hT
{
    final d4 b;
    
    hs(final d4 b) {
        this.b = b;
    }
    
    @Override
    public d4 a(final cL cl, final fu fu) {
        final f1 a = d4.a(d4.c(this.b));
        try {
            a.mergeFrom(cl, fu);
            return a.c();
        }
        catch (bg bg) {
            throw bg.a(a.c());
        }
        catch (IOException ex) {
            throw new bg(ex.getMessage()).a(a.c());
        }
    }
    
    @Override
    public Object parsePartialFrom(final cL cl, final fu fu) {
        return this.a(cl, fu);
    }
}
