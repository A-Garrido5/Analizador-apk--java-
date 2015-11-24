import com.twitter.library.provider.b;
import android.os.Bundle;
import java.util.Collection;
import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import java.util.Iterator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.twitter.library.service.f;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;
import java.io.Closeable;
import java.io.Writer;
import com.twitter.library.api.bh;
import java.io.StringWriter;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import java.util.ArrayList;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.List;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class mj extends c
{
    private List a;
    private int e;
    private int f;
    
    public mj(final Context context, final Session session) {
        super(context, mj.class.getName(), session);
        this.a = new ArrayList();
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "contacts", "upload_and_match" });
        final List a2 = this.a;
        while (true) {
            try {
                final StringWriter stringWriter = new StringWriter();
                final JsonGenerator a3 = bh.a.a(stringWriter);
                try {
                    a3.c();
                    a3.d("vcards");
                    final Iterator<String> iterator = a2.iterator();
                    while (iterator.hasNext()) {
                        a3.b(iterator.next());
                    }
                }
                catch (IOException ex) {
                    final JsonGenerator jsonGenerator = a3;
                    yh.a(jsonGenerator);
                    return a.a();
                    yh.a(a3);
                    throw;
                    a3.b();
                    a3.d();
                    a3.flush();
                    final StringEntity stringEntity = new StringEntity(stringWriter.getBuffer().toString(), "UTF-8");
                    stringEntity.setContentType("application/json");
                    a.a((HttpEntity)stringEntity);
                    yh.a(a3);
                }
            }
            catch (IOException ex2) {
                final JsonGenerator jsonGenerator = null;
                continue;
            }
            break;
        }
    }
    
    public mj a(final int e, final int f) {
        this.e = e;
        this.f = f;
        return this;
    }
    
    public mj a(final List a) {
        this.a = a;
        return this;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final mh mh) {
        final Bundle o = this.o;
        o.putInt("page", this.e);
        o.putInt("pages", this.f);
        if (httpOperation.k()) {
            final mk mk = (mk)mh.a();
            if (mk != null) {
                final b w = this.W();
                final int a = this.V().a(mk.a, this.P().c, 7, -1L, null, null, true, w);
                w.a();
                o.putInt("count", a);
                o.putInt("num_users", mk.a.size());
            }
        }
    }
    
    protected mh b() {
        return new mh();
    }
}
