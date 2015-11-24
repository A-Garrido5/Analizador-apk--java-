import com.twitter.library.util.bk;
import android.text.TextUtils;
import com.twitter.library.featureswitch.d;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.client.k;

// 
// Decompiled by Procyon v0.5.30
// 

public final class oi
{
    private final k a;
    
    oi(final Context context, final String s) {
        this.a = new k(context, s);
    }
    
    public static oc a(final Context context, final Session session, final boolean b) {
        return a(context, new ab(session), b);
    }
    
    public static oc a(final Context context, final ab ab, final boolean b) {
        synchronized (oi.class) {
            final boolean f = d.f("sync_blocked_users_enabled");
            oc oc = null;
            if (f) {
                final boolean empty = TextUtils.isEmpty((CharSequence)ab.e);
                oc = null;
                if (!empty) {
                    final oi oi = new oi(context, ab.e);
                    final boolean b2 = oi.b(b);
                    oc = null;
                    if (b2) {
                        oc = (oc)new oc(context, ab, oi).j("This is a sync request which was not triggered by a user action.");
                    }
                }
            }
            return oc;
        }
    }
    
    private boolean b() {
        return this.a.getBoolean("block_sync_aggressive", false);
    }
    
    private boolean b(final boolean b) {
        final long n = bk.a() - this.a();
        int n2;
        if (this.b()) {
            n2 = 4;
        }
        else {
            n2 = 1;
        }
        if (b) {
            if (n <= 14400000L / n2) {
                return false;
            }
        }
        else if (n <= 1200000L / n2) {
            return false;
        }
        return true;
    }
    
    long a() {
        return this.a.getLong("block_sync_last_time", 0L);
    }
    
    void a(final int n) {
        this.a(n > 200);
    }
    
    void a(final long n) {
        this.a.a().a("block_sync_last_time", n).apply();
    }
    
    void a(final boolean b) {
        this.a.a().a("block_sync_aggressive", b).apply();
    }
}
