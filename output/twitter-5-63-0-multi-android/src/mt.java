import com.twitter.library.provider.b;
import com.twitter.library.provider.bg;
import com.twitter.library.client.Session;
import com.twitter.library.service.ab;
import android.content.Context;
import com.twitter.internal.android.service.a;

// 
// Decompiled by Procyon v0.5.30
// 

public class mt extends a
{
    private final Context a;
    private final ab e;
    private final String f;
    
    public mt(final Context a, final Session session, final String f) {
        super("BringStoryToFront");
        this.a = a;
        this.e = new ab(session);
        this.f = f;
    }
    
    public bg a() {
        return bg.a(this.a, this.e.c);
    }
    
    protected Void b() {
        this.a().e(this.f, (b)null);
        return null;
    }
    
    protected Void e() {
        return null;
    }
}
