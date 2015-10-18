import com.twitter.library.client.k;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import android.os.Bundle;
import java.util.Arrays;
import com.twitter.library.network.ae;
import com.twitter.library.service.aa;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.y;

// 
// Decompiled by Procyon v0.5.30
// 

public class oz extends y
{
    public pr a;
    String e;
    
    public oz(final Context context, final Session session) {
        this(context, new ab(session), new pr());
    }
    
    public oz(final Context context, final ab ab) {
        this(context, ab, new pr());
    }
    
    public oz(final Context context, final ab ab, final pr a) {
        super(context, oz.class.getName(), ab);
        this.a = a;
    }
    
    @Override
    protected void a_(final aa aa) {
        final long currentTimeMillis = System.currentTimeMillis();
        String[] b;
        if (this.a.b != null) {
            b = this.a.b;
        }
        else {
            b = new String[0];
        }
        String[] c;
        if (this.a.c != null) {
            c = this.a.c;
        }
        else {
            c = new String[0];
        }
        long[] a;
        if (this.a.a != null) {
            a = this.a.a;
        }
        else {
            a = new long[0];
        }
        final boolean b2 = b.length > 0 || c.length > 0;
        int length = b.length;
        int length2 = c.length;
        int length3 = a.length;
        final boolean b3 = this.a.h && !this.a.i;
        final int a2 = ae.a(length3 + (length + length2), 100);
        this.a.j = 0;
        int n7;
        int n9;
        for (int i = 0; i < a2; ++i, length = n7, length2 = n9) {
            int n = 100;
            final pr a3 = this.a;
            String f;
            if (!this.a.i && i == 0) {
                f = "-1";
            }
            else {
                f = null;
            }
            a3.f = f;
            final pq pq = new pq(this.p, this.P());
            pq.a.a(this.a);
            if (length3 > 0) {
                final int n2 = a.length - length3;
                final int min = Math.min(n2 + n, a.length);
                pq.a(Arrays.copyOfRange(a, n2, min), b3);
                final int n3 = length3 - (min - n2);
                n -= min - n2;
                length3 = n3;
            }
            int n6;
            if (n > 0 && length > 0) {
                final int n4 = b.length - length;
                final int min2 = Math.min(n4 + n, b.length);
                pq.a.a(Arrays.copyOfRange(b, n4, min2));
                final int n5 = length - (min2 - n4);
                n6 = n - (min2 - n4);
                n7 = n5;
            }
            else {
                n6 = n;
                n7 = length;
            }
            if (n6 > 0 && length2 > 0) {
                final int n8 = c.length - length2;
                final int min3 = Math.min(n6 + n8, c.length);
                pq.a.b(Arrays.copyOfRange(c, n8, min3));
                n9 = length2 - (min3 - n8);
            }
            else {
                n9 = length2;
            }
            final aa s = pq.S();
            aa.a(s);
            final Bundle bundle = new Bundle();
            bundle.putInt("page", i);
            bundle.putInt("pages", a2);
            if (s.a()) {
                final int a4 = pq.a.a();
                final pr a5 = this.a;
                a5.j += a4;
                bundle.putInt("inserted_count", a4);
                bundle.putInt("result_code", s.c());
                bundle.putInt("num_users", pq.a.b());
            }
            this.b(bundle);
        }
        if (b2 && this.e != null) {
            ScribeService.a(this.p, ((TwitterScribeLog)new TwitterScribeLog(this.P().c).b(new String[] { this.e, "import_addressbook::import:done" })).a(System.currentTimeMillis() - currentTimeMillis));
            new k(this.p, this.P().e).a().a("addressbook_import_done", true).apply();
        }
    }
}
