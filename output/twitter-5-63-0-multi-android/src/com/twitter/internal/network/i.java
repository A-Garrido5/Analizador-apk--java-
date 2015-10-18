// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.network;

import java.net.UnknownHostException;
import org.apache.http.HttpEntity;
import java.net.URI;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import com.twitter.util.platform.k;
import com.twitter.util.platform.m;

public class i implements d
{
    private static final m a;
    
    static {
        a = k.f().b();
    }
    
    private void a(final HttpOperation httpOperation, final String s) {
        i.a.b("HttpOperation", this.c(httpOperation) + s);
    }
    
    private void b(final HttpOperation httpOperation, final Exception ex) {
        final StringWriter stringWriter = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(stringWriter);
        stringWriter.append(this.c(httpOperation)).append("\n");
        ex.printStackTrace(printWriter);
        printWriter.flush();
        i.a.b("HttpOperation", stringWriter.toString());
    }
    
    private String c(final HttpOperation httpOperation) {
        final URI i = httpOperation.i();
        return "[" + i.getScheme() + "://" + i.getHost() + i.getPath() + "] ";
    }
    
    @Override
    public void a(final HttpOperation httpOperation) {
        final HttpEntity e = httpOperation.e();
        final boolean b = e != null;
        this.a(httpOperation, String.format("%s, has entity: %s", httpOperation.h(), b));
        if (b) {
            this.a(httpOperation, String.format("sending content-length: %,d", e.getContentLength()));
        }
    }
    
    @Override
    public void a(final HttpOperation httpOperation, final Exception ex) {
        if (ex instanceof UnknownHostException) {
            this.a(httpOperation, ex.getMessage());
            return;
        }
        this.b(httpOperation, ex);
    }
    
    @Override
    public void b(final HttpOperation httpOperation) {
        final l l = httpOperation.l();
        this.a(httpOperation, String.format("protocol: %s %s status: %d/%s, content: %s (%s), content-length: %,d", l.o, l.p, l.a, l.b, l.l, l.m, l.k));
        this.a(httpOperation, String.format("open: %dms, read: %dms, duration: %dms", l.g, l.f, l.e));
        final int n = l.t[1] + l.t[2] + l.t[3] + l.t[4];
        i.a.b("HttpTimings", "EXECUTE_TIME\tbytes:" + l.i + "\tCREATE:" + l.t[0] + "\tINIT:" + l.t[1] + "\tSEND:" + l.t[2] + "\tWAIT:" + l.t[3] + "\tREAD:" + l.t[4] + "\tREAD_TAIL:" + l.t[5] + "\tCLOSE:" + l.t[6] + "\toldOpen:" + l.g + "\toldRead:" + l.f + "\toldClose:" + l.h + "\toldDuration:" + (l.g + l.f + l.h) + "\tnewDuration" + n + "\tnewExecute" + (n + l.t[5] + l.t[6]));
    }
}
