// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.jobqueue;

import android.os.PowerManager;
import android.os.PowerManager$WakeLock;
import java.util.Iterator;
import java.util.concurrent.Executors;
import android.content.Context;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Executor;
import org.whispersystems.jobqueue.requirements.a;

public class v implements a
{
    public static boolean h;
    private static final String[] z;
    private final Executor a;
    private final n b;
    private final t c;
    private final AtomicBoolean d;
    private final List e;
    private final Context f;
    private final c g;
    
    static {
        final String[] z2 = new String[2];
        String s = "UM:XQ";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '#';
                        break;
                    }
                    case 0: {
                        c2 = '%';
                        break;
                    }
                    case 1: {
                        c2 = '\"';
                        break;
                    }
                    case 2: {
                        c2 = 'M';
                        break;
                    }
                    case 3: {
                        c2 = '=';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "oM/~LKQ8PFW\u000f";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private v(final Context f, final String s, final List e, final j j, final d d, final int n) {
        final boolean h = v.h;
        this.c = new t();
        this.a = Executors.newSingleThreadExecutor();
        this.d = new AtomicBoolean(false);
        this.f = f;
        this.g = new c(j);
        this.b = new n(f, s, d, this.g);
        this.e = e;
        this.a.execute(new s(this, null));
        if (e != null && !e.isEmpty()) {
            final Iterator<org.whispersystems.jobqueue.requirements.c> iterator = e.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(this);
                if (h) {
                    break;
                }
            }
        }
        int i = 0;
        while (i < n) {
            new u(v.z[1] + i, this.c, this.b).start();
            ++i;
            if (h) {
                break;
            }
        }
    }
    
    v(final Context context, final String s, final List list, final j j, final d d, final int n, final w w) {
        this(context, s, list, j, d, n);
    }
    
    static Context a(final v v) {
        return v.f;
    }
    
    private PowerManager$WakeLock a(final Context context, final String s, final long n) {
        final PowerManager$WakeLock wakeLock = ((PowerManager)context.getSystemService(v.z[0])).newWakeLock(1, s);
        if (n == 0L) {
            wakeLock.acquire();
            if (!v.h) {
                return wakeLock;
            }
        }
        wakeLock.acquire(n);
        return wakeLock;
    }
    
    public static i a(final Context context) {
        return new i(context);
    }
    
    static n b(final v v) {
        return v.b;
    }
    
    static t c(final v v) {
        return v.c;
    }
    
    static c d(final v v) {
        return v.g;
    }
    
    @Override
    public void a() {
        this.a.execute(new x(this));
    }
    
    public void a(final org.whispersystems.jobqueue.a a) {
        if (a.i()) {
            a.a(this.a(this.f, a.toString(), a.n()));
        }
        this.a.execute(new w(this, a));
    }
}
