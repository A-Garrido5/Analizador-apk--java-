// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import org.apache.http.entity.ContentProducer;
import org.apache.http.entity.EntityTemplate;

class cq extends EntityTemplate
{
    final alp a;
    long b;
    
    public cq(final alp a, final ContentProducer contentProducer, final long b) {
        this.a = a;
        super(contentProducer);
        this.b = b;
    }
    
    public long getContentLength() {
        return this.b;
    }
}
