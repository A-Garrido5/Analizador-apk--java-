// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.net.URI;

final class eM extends e_
{
    @Override
    public void a(final c3 c3, final Object o) {
        this.a(c3, (URI)o);
    }
    
    public void a(final c3 c3, final URI uri) {
        String asciiString;
        if (uri == null) {
            asciiString = null;
        }
        else {
            asciiString = uri.toASCIIString();
        }
        c3.a(asciiString);
    }
}
