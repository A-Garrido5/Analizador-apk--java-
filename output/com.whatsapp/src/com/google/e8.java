// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.net.URL;

final class e8 extends e_
{
    @Override
    public void a(final c3 c3, final Object o) {
        this.a(c3, (URL)o);
    }
    
    public void a(final c3 c3, final URL url) {
        String externalForm;
        if (url == null) {
            externalForm = null;
        }
        else {
            externalForm = url.toExternalForm();
        }
        c3.a(externalForm);
    }
}
