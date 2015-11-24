import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.f;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.ar;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class og extends ar
{
    private long a;
    private String e;
    
    protected og(final Context context, final String s, final Session session) {
        super(context, s, session);
    }
    
    public og a(final long a) {
        this.a = a;
        return this;
    }
    
    protected final void a(final f f) {
        if (this.a != 0L) {
            f.a("user_id", String.valueOf(this.a));
            return;
        }
        if (this.e != null) {
            f.a("screen_name", this.e);
            return;
        }
        throw new IllegalArgumentException();
    }
    
    protected final bg e() {
        return bg.a(17);
    }
}
