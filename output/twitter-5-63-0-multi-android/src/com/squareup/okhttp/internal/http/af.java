// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

class af
{
    private String a;
    private String b;
    
    public af(final f f) {
        for (int i = 0; i < f.a(); ++i) {
            final String a = f.a(i);
            final String b = f.b(i);
            if ("User-Agent".equalsIgnoreCase(a)) {
                this.a = b;
            }
            else if ("Proxy-Authorization".equalsIgnoreCase(a)) {
                this.b = b;
            }
        }
    }
}
