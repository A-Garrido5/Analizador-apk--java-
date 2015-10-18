import com.twitter.library.service.aa;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.y;

// 
// Decompiled by Procyon v0.5.30
// 

public class nd extends y
{
    private int a;
    private long e;
    private String f;
    private int g;
    
    public nd(final Context context, final Session session) {
        super(context, nd.class.getName(), session);
    }
    
    public nd a(final long e) {
        this.e = e;
        return this;
    }
    
    public nd a(final String f) {
        this.f = f;
        return this;
    }
    
    @Override
    protected void a_(final aa aa) {
        final ne e = new ne(this.p, this.P()).c(0).d(this.a).a(this.e).a(this.f).a(false).e(this.g);
        aa aa2 = e.S();
        if (aa2.a()) {
            aa2 = new ne(this.p, this.P()).c(2).d(this.a).a(this.e).a(this.f).a(e.e()).e(this.g).S();
        }
        aa.a(aa2);
    }
    
    public nd c(final int a) {
        this.a = a;
        return this;
    }
    
    public nd d(final int g) {
        this.g = g;
        return this;
    }
}
