import org.json.JSONObject;
import com.twitter.internal.network.l;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import com.twitter.util.k;
import com.twitter.internal.network.HttpOperation;

// 
// Decompiled by Procyon v0.5.30
// 

public final class kj extends kb
{
    static final /* synthetic */ boolean j;
    public kk f;
    public String g;
    public int h;
    public String i;
    
    static {
        j = !kj.class.desiredAssertionStatus();
    }
    
    public kj(final HttpOperation httpOperation) {
        this.h = -1;
        this.i = null;
        this.f = new kk(httpOperation);
        final l l = httpOperation.l();
        this.h = l.a;
        this.i = k.a(l.b);
        this.b = l.k;
        this.d = l.o;
        if (httpOperation.o()) {
            this.a(httpOperation.n());
        }
        if (l.c != null) {
            final StringWriter stringWriter = new StringWriter();
            l.c.printStackTrace(new PrintWriter(stringWriter, true));
            this.g = stringWriter.getBuffer().toString();
        }
    }
    
    @Override
    protected JSONObject a() {
        final JSONObject a = super.a();
        if (!kj.j && this.f == null) {
            throw new AssertionError((Object)"content was not set");
        }
        a.put("content", (Object)this.f.a());
        a.put("redirectURL", (Object)"");
        a.put("status", this.h);
        a.put("statusText", (Object)this.i);
        a.put("exception", (Object)this.g);
        return a;
    }
}
