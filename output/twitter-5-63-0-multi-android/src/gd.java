import android.content.res.Configuration;
import android.os.AsyncTask;
import android.content.Context;
import java.util.Collections;
import java.util.Arrays;
import com.twitter.library.client.bm;
import java.util.List;

// 
// Decompiled by Procyon v0.5.30
// 

public class gd
{
    private static final List a;
    private static final List b;
    private static final List c;
    private static final List d;
    private static gd e;
    private final tt f;
    
    static {
        a = Collections.unmodifiableList((List<?>)Arrays.asList(new fr(), new ua(), new bm(), new ub(), new fy(), new tr(), new gf()));
        b = Collections.emptyList();
        c = Collections.unmodifiableList((List<?>)Arrays.asList(new tq(), new fu(), new gj(), new gc(), new ge(), new gl(), new ty(), new ft(), new fq(), new fx(), new gk(), new gb(), new th(), new fw(), new tn(), new ud(), new fv(), new tv(), new to(2130839328, 2131689629), new tj(), new tl(), new gh(), new uc(), new gg()));
        d = Collections.unmodifiableList((List<?>)Arrays.asList(new ge(), new tz()));
    }
    
    private gd(final Context context) {
        this.f = new tt(context.getApplicationContext(), AsyncTask.THREAD_POOL_EXECUTOR);
    }
    
    public static gd a(final Context context) {
        synchronized (gd.class) {
            if (gd.e == null) {
                gd.e = new gd(context);
            }
            return gd.e;
        }
    }
    
    public void a(final Configuration configuration, final boolean b) {
        if (!b) {
            this.f.a(gd.d, configuration);
        }
    }
    
    public void a(final boolean b) {
        this.f.a(gd.a, null);
        if (b) {
            this.f.a(gd.b, null);
            return;
        }
        this.f.a(gd.c, null);
    }
}
