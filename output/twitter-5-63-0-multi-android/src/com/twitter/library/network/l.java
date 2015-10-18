// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import org.apache.http.Header;
import java.util.Iterator;
import com.twitter.internal.network.a;
import java.io.OutputStream;
import java.io.InputStream;
import com.twitter.library.util.bd;
import java.io.IOException;
import com.twitter.library.util.af;
import android.net.Uri;
import org.apache.http.message.BasicHeader;
import java.util.ArrayList;
import android.content.Context;
import com.twitter.internal.network.q;
import org.apache.http.entity.AbstractHttpEntity;

public class l extends AbstractHttpEntity
{
    private final q a;
    private final Context b;
    private final ArrayList c;
    private int d;
    
    public l(final Context context, final q a) {
        this.a = a;
        this.contentType = (Header)new BasicHeader("Content-Type", "multipart/form-data; boundary=twitter");
        this.c = new ArrayList();
        this.b = context.getApplicationContext();
        super.chunked = true;
    }
    
    public void a() {
        this.c.add(new m("--twitter--\r\n".getBytes("UTF-8")));
    }
    
    public void a(final String s, final String s2, final Uri uri) {
        final byte[] bytes = ("--twitter" + "\r\n" + "Content-Disposition: form-data; name=\"" + s + "\"; filename=\"" + s2 + "\"" + "\r\n" + "Content-Type: image/jpeg" + "\r\n" + "Content-Transfer-Encoding: binary" + "\r\n" + "\r\n").getBytes("UTF-8");
        final byte[] bytes2 = "\r\n".getBytes("UTF-8");
        final ArrayList c = this.c;
        c.add(new m(bytes));
        c.add(new p(this.b, uri));
        c.add(new m(bytes2));
        try {
            this.d += af.d(this.b, uri) + bytes.length + bytes2.length;
        }
        catch (SecurityException ex) {
            throw (IOException)new IOException().initCause(ex);
        }
    }
    
    public void a(final String s, final String s2, final bd bd, final int n) {
        final byte[] bytes = ("--twitter" + "\r\n" + "Content-Disposition: form-data; name=\"" + s + "\"; filename=\"" + s2 + "\"" + "\r\n" + "Content-Transfer-Encoding: binary" + "\r\n" + "\r\n").getBytes("UTF-8");
        final byte[] bytes2 = "\r\n".getBytes("UTF-8");
        final ArrayList c = this.c;
        c.add(new m(bytes));
        c.add(new o(bd));
        c.add(new m(bytes2));
        this.d += n + bytes.length + bytes2.length;
    }
    
    public InputStream getContent() {
        return new com.twitter.library.network.q(this.c);
    }
    
    public long getContentLength() {
        return this.d;
    }
    
    public boolean isRepeatable() {
        return true;
    }
    
    public boolean isStreaming() {
        return false;
    }
    
    public void writeTo(final OutputStream outputStream) {
        final a a = new a(outputStream, this.d, this.a);
        final Iterator<n> iterator = (Iterator<n>)this.c.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(a);
        }
    }
}
