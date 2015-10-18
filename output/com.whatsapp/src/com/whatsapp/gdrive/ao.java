// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp._y;
import java.io.OutputStream;
import org.apache.http.Header;
import java.io.InputStream;
import org.apache.http.HttpEntity;

class ao implements HttpEntity
{
    final an a;
    final HttpEntity b;
    
    ao(final an a, final HttpEntity b) {
        this.a = a;
        this.b = b;
    }
    
    public void consumeContent() {
        this.b.consumeContent();
    }
    
    public InputStream getContent() {
        return new bx(this, this.b.getContent());
    }
    
    public Header getContentEncoding() {
        return this.b.getContentEncoding();
    }
    
    public long getContentLength() {
        return this.b.getContentLength();
    }
    
    public Header getContentType() {
        return this.b.getContentType();
    }
    
    public boolean isChunked() {
        return this.b.isChunked();
    }
    
    public boolean isRepeatable() {
        return this.b.isRepeatable();
    }
    
    public boolean isStreaming() {
        return this.b.isStreaming();
    }
    
    public void writeTo(final OutputStream outputStream) {
        this.b.writeTo((OutputStream)new _y(outputStream, an.a(this.a)));
    }
}
