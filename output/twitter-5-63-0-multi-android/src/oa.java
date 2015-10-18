import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.resilient.d;
import com.twitter.library.provider.bg;
import android.content.Context;
import com.twitter.internal.android.service.a;

// 
// Decompiled by Procyon v0.5.30
// 

public class oa extends a
{
    private final Context a;
    private final long e;
    
    public oa(final Context a, final long e) {
        super(oa.class.getName());
        this.a = a;
        this.e = e;
        this.b(3);
    }
    
    protected Integer a() {
        final bg a = bg.a(this.a, this.e);
        final long n = a.c();
        if (n == 0L) {
            return 0;
        }
        final boolean empty = com.twitter.library.resilient.d.a(this.a).a(this.e, "tweet").isEmpty();
        int d = 0;
        if (empty) {
            d = a.d();
            ErrorReporter.a(new com.twitter.errorreporter.a().a("message", "Orphaned pending tweets").a("previewCount", n).a("deletedCount", d));
        }
        return d;
    }
    
    protected Integer b() {
        return 0;
    }
}
