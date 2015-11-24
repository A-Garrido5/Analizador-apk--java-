// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import java.io.InputStream;
import org.apache.http.params.HttpParams;
import java.io.ByteArrayInputStream;
import org.apache.http.impl.io.AbstractSessionInputBuffer;

class a extends AbstractSessionInputBuffer
{
    private static final String z;
    final ByteArrayInputStream a;
    final HttpParams b;
    final q c;
    
    static {
        final char[] charArray = "9\u0005b4\b\u001a\u001azq\f\u0012\u0004bq\u0005".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'a';
                    break;
                }
                case 0: {
                    c2 = 'w';
                    break;
                }
                case 1: {
                    c2 = 'j';
                    break;
                }
                case 2: {
                    c2 = '\u0016';
                    break;
                }
                case 3: {
                    c2 = '\u0014';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    a(final q c, final ByteArrayInputStream a, final HttpParams b) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.init((InputStream)this.a, 100, this.b);
    }
    
    public boolean isDataAvailable(final int n) {
        throw new UnsupportedOperationException(com.whatsapp.gdrive.a.z);
    }
}
