// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import org.apache.http.HttpEntity;
import com.whatsapp.util.Log;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.protocol.HttpContext;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;

class z implements HttpResponseInterceptor
{
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[5];
        String s = "\u0005Q\u000e\u001e2\u001f@\u000b\u001by\u001eQ";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u001c';
                        break;
                    }
                    case 0: {
                        c2 = 'm';
                        break;
                    }
                    case 1: {
                        c2 = '%';
                        break;
                    }
                    case 2: {
                        c2 = 'z';
                        break;
                    }
                    case 3: {
                        c2 = 'n';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\nA\b\u0007j\b\b\b\u000bo\u001dJ\u0014\u001dy@L\u0014\u001ay\u001fF\u001f\u001eh\u0002WU\u001en\u0002F\u001f\u001doBI\u001f\u0000{\u0019MU";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "BW\u001f\u001fi\bV\u000eCu\u001e\b\u0014\u001bp\u0001";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\nA\b\u0007j\b\b\b\u000bo\u001dJ\u0014\u001dy@L\u0014\u001ay\u001fF\u001f\u001eh\u0002WU\u001en\u0002F\u001f\u001doBW\u001f\u001dl\u0002K\t\u000b1\u001aL\u000e\u0006s\u0018QW\u000br\u0019L\u000e\u00171\fK\u001eCn\bT\u000f\u000bo\u0019\b\u0013\u001d1\u0003P\u0016\u0002";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "\u0005Q\u000e\u001e2\u001f@\u000b\u001by\u001eQ";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public z(final int a) {
        this.a = a;
    }
    
    static int a(final z z) {
        return z.a;
    }
    
    public void process(final HttpResponse httpResponse, final HttpContext httpContext) {
        if (httpResponse.getEntity() == null) {
            if (httpContext.getAttribute(com.whatsapp.gdrive.z.z[4]) == null) {
                Log.e(com.whatsapp.gdrive.z.z[3]);
            }
        }
        else {
            final long contentLength = httpResponse.getEntity().getContentLength();
            if (contentLength > 0L) {
                httpResponse.setEntity((HttpEntity)new bp(this, httpResponse.getEntity()));
                return;
            }
            if (httpContext.getAttribute(com.whatsapp.gdrive.z.z[0]) == null) {
                Log.e(com.whatsapp.gdrive.z.z[1] + contentLength + com.whatsapp.gdrive.z.z[2]);
            }
        }
    }
}
