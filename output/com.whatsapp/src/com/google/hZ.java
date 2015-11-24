// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.IOException;

public final class hZ extends hT
{
    @Override
    public ce a(final cL cl, final fu fu) {
        final aY g = ce.g();
        try {
            g.a(cl);
            return g.a();
        }
        catch (bg bg) {
            throw bg.a(g.a());
        }
        catch (IOException ex) {
            throw new bg(ex.getMessage()).a(g.a());
        }
    }
    
    @Override
    public Object parsePartialFrom(final cL cl, final fu fu) {
        return this.a(cl, fu);
    }
}
