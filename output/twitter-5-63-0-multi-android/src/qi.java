import com.twitter.library.av.playback.aw;
import java.util.Iterator;
import com.twitter.library.av.playback.AVPlayer$PlayerStartType;
import com.twitter.android.av.t;
import java.util.Collections;
import java.util.ArrayList;
import com.twitter.library.av.playback.bd;
import java.util.List;
import com.twitter.library.av.playback.AVPlayer;
import com.twitter.library.av.model.a;
import com.twitter.library.av.playback.f;

// 
// Decompiled by Procyon v0.5.30
// 

public class qi implements f
{
    final a a;
    volatile long b;
    final AVPlayer c;
    final List d;
    final boolean e;
    private final bd f;
    
    public qi(final AVPlayer avPlayer, final a a) {
        this(avPlayer, a, new bd(), new qj[] { new qe(avPlayer), new qf(avPlayer), new qg(avPlayer, a) });
    }
    
    qi(final AVPlayer c, final a a, final bd f, final qj... array) {
        this.c = c;
        this.a = a;
        final ArrayList<qj> list = new ArrayList<qj>();
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(array[i]);
        }
        this.d = Collections.unmodifiableList((List<?>)list);
        this.f = f;
        this.e = t.a();
    }
    
    static boolean a(final long n, final long n2, final boolean b) {
        final long n3 = n - n2;
        boolean b2;
        if (b) {
            if (n3 <= 0L) {
                b2 = true;
            }
            else {
                b2 = false;
            }
        }
        else if (n3 >= 0L) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        return b2 && Math.abs(n3) <= 1000L;
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void a(final AVPlayer$PlayerStartType avPlayer$PlayerStartType) {
        if (avPlayer$PlayerStartType != AVPlayer$PlayerStartType.b) {
            this.f.a();
            final Iterator<qj> iterator = this.d.iterator();
            while (iterator.hasNext()) {
                iterator.next().a();
            }
        }
    }
    
    @Override
    public void a(final aw aw) {
        if (this.c.u()) {
            this.b += 10L;
            final Iterator<qj> iterator = this.d.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(aw, this.b);
            }
        }
        this.a(aw, this.f);
    }
    
    void a(final aw aw, final bd bd) {
        if (aw != null) {
            final long b = aw.b;
            final long n = b / 4L;
            final long a = aw.a;
            if (!bd.a && a(a, 0L, false)) {
                bd.a = true;
                final AVPlayer c = this.c;
                String s;
                if (this.e) {
                    s = "playback_start";
                }
                else {
                    s = "playback_0";
                }
                c.a(s, null, this.a);
            }
            if (!bd.b && a(a, n, false)) {
                bd.b = true;
                this.c.a("playback_25", null, this.a);
            }
            if (!bd.c && a(a, 2L * n, false)) {
                bd.c = true;
                this.c.a("playback_50", null, this.a);
            }
            if (!bd.d && a(a, 3L * n, false)) {
                bd.d = true;
                this.c.a("playback_75", null, this.a);
            }
            final long n2 = (long)(0.95 * b);
            if (!bd.e && a(a, n2, true)) {
                bd.e = true;
                this.c.a("playback_95", null, this.a);
            }
            if (!bd.f && a(a, b, true)) {
                bd.f = true;
                final AVPlayer c2 = this.c;
                String s2;
                if (this.e) {
                    s2 = "playback_complete";
                }
                else {
                    s2 = "playback_100";
                }
                c2.a(s2, null, this.a);
            }
        }
    }
    
    @Override
    public long b() {
        return this.b;
    }
    
    @Override
    public boolean c() {
        if (!this.e) {
            return true;
        }
        final Iterator<qj> iterator = this.d.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().b()) {
                return false;
            }
        }
        return true;
    }
}
