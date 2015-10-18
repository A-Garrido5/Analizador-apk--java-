// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.HttpEntity;
import com.whatsapp.util.Log;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.protocol.HttpContext;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;

class an implements HttpRequestInterceptor
{
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[2];
        String s = "~/{V\u0006|f{Z\u0001l.zK]p%}Z\u0002z.yK\u001fkdyM\u001fz.zL_k.xJ\u0015j?$V\u00034%fK]xf~M\u0011i;lMP";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'p';
                        break;
                    }
                    case 0: {
                        c2 = '\u0019';
                        break;
                    }
                    case 1: {
                        c2 = 'K';
                        break;
                    }
                    case 2: {
                        c2 = '\t';
                        break;
                    }
                    case 3: {
                        c2 = '?';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "~/{V\u0006|fhO\u001969lN\u0005|8}\u0012\u0019w?lM\u0013|;}P\u00026;{P\u0013|8z\u0010\u001c|%nK\u00186";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public an(final int a) {
        this.a = a;
    }
    
    static int a(final an an) {
        return an.a;
    }
    
    public void process(final HttpRequest httpRequest, final HttpContext httpContext) {
        Label_0088: {
            if (!(httpRequest instanceof EntityEnclosingRequestWrapper)) {
                break Label_0088;
            }
            final HttpEntity entity = ((EntityEnclosingRequestWrapper)httpRequest).getEntity();
            if (entity != null) {
                final long contentLength = entity.getContentLength();
                if (contentLength <= 0L) {
                    Log.e(an.z[1] + contentLength);
                    return;
                }
                ((EntityEnclosingRequestWrapper)httpRequest).setEntity((HttpEntity)new ao(this, entity));
                if (GoogleDriveService.F != 0) {
                    break Label_0088;
                }
            }
            return;
        }
        if (!(httpRequest instanceof RequestWrapper)) {
            Log.e(an.z[0] + httpRequest);
        }
    }
}
