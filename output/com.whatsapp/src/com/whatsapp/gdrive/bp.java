// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import java.io.OutputStream;
import org.apache.http.Header;
import com.whatsapp.a2p;
import java.io.InputStream;
import org.apache.http.HttpEntity;

class bp implements HttpEntity
{
    final HttpEntity a;
    final z b;
    
    bp(final z b, final HttpEntity a) {
        this.b = b;
        this.a = a;
    }
    
    public void consumeContent() {
        this.a.consumeContent();
    }
    
    public InputStream getContent() {
        return new a2p(this.a.getContent(), z.a(this.b));
    }
    
    public Header getContentEncoding() {
        return this.a.getContentEncoding();
    }
    
    public long getContentLength() {
        return this.a.getContentLength();
    }
    
    public Header getContentType() {
        return this.a.getContentType();
    }
    
    public boolean isChunked() {
        return this.a.isChunked();
    }
    
    public boolean isRepeatable() {
        return this.a.isRepeatable();
    }
    
    public boolean isStreaming() {
        return this.a.isStreaming();
    }
    
    public void writeTo(final OutputStream outputStream) {
        final int i = GoogleDriveService.F;
        final InputStream content = this.getContent();
        final byte[] array = new byte[4096];
        do {
            final int read = content.read(array);
            if (read < 0 && i == 0) {
                break;
            }
            outputStream.write(array, 0, read);
        } while (i == 0);
    }
}
