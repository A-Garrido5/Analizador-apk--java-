import com.twitter.library.view.aa;
import android.content.res.Resources;
import com.twitter.library.provider.Tweet;

// 
// Decompiled by Procyon v0.5.30
// 

public class ws
{
    private final wt a;
    private final wu b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    private boolean h;
    
    public ws(final wt wt, final wu wu, final int n, final int n2, final int n3, final int n4) {
        this(wt, wu, n, n2, n3, n4, true);
    }
    
    public ws(final wt a, final wu b, final int c, final int d, final int e, final int f, final boolean g) {
        this.h = true;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    private int a(final int n, final boolean b) {
        if (b) {
            return this.c;
        }
        switch (n) {
            default: {
                return this.d;
            }
            case 1: {
                return 0;
            }
            case 2: {
                return this.e;
            }
        }
    }
    
    public final void a(final Tweet tweet, final Resources resources) {
        int n = 1;
        int n2;
        if (this.h && (tweet.m() || tweet.o()) && !tweet.p()) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        int n3;
        if (tweet.z() && !tweet.h && !tweet.p()) {
            n3 = n;
        }
        else {
            n3 = 0;
        }
        int n4;
        if (n2 != 0 || n3 != 0) {
            n4 = n;
        }
        else {
            n4 = 0;
        }
        if (n4 != 0) {
            int b;
            if (tweet.ad() && this.g) {
                b = 0;
            }
            else {
                b = this.b.b();
            }
            final int a = wq.a(b);
            final boolean b2 = wq.b(b);
            final int c = wq.c(b);
            final boolean d = wq.d(b);
            this.a.setBadgeLocation(a);
            if (n2 != 0) {
                if (d) {
                    n = 0;
                }
                this.a.a(this.a(c, tweet.o()), aa.a(tweet, resources, (boolean)(n != 0)), b2);
            }
            else {
                String s;
                if (tweet.g) {
                    s = tweet.M;
                }
                else {
                    s = tweet.L;
                }
                final int lifeline_alert = lg.lifeline_alert;
                final Object[] array = new Object[n];
                array[0] = s;
                this.a.a(this.f, resources.getString(lifeline_alert, array), b2);
            }
        }
        this.a.d(n4 != 0);
    }
    
    public final void a(final boolean h) {
        this.h = h;
    }
}
