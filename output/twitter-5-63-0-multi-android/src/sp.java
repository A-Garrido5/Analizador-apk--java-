import android.content.SharedPreferences;
import com.google.android.gms.common.a;
import android.os.Message;
import java.util.Iterator;
import com.twitter.library.platform.f;
import android.preference.PreferenceManager;
import com.twitter.library.client.App;
import com.twitter.library.featureswitch.d;
import android.os.Looper;
import com.twitter.util.e;
import android.location.LocationManager;
import android.location.Location;
import android.os.Handler;
import java.util.HashSet;
import android.content.Context;
import com.twitter.library.featureswitch.n;
import com.google.android.gms.common.api.q;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;

// 
// Decompiled by Procyon v0.5.30
// 

public class sp implements SharedPreferences$OnSharedPreferenceChangeListener, q, n, so
{
    private static sp a;
    private Context b;
    private HashSet c;
    private Handler d;
    private volatile Location e;
    private LocationManager f;
    private sn g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;
    private boolean r;
    
    private sp(final Context context) {
        com.twitter.util.e.a(sk.a() != null, "GeoModule must be initialized for construction of LocationProducer");
        this.b = context.getApplicationContext();
        this.c = new HashSet();
        this.d = new ss(this, Looper.getMainLooper());
        this.f = (LocationManager)this.b.getSystemService("location");
        this.h = false;
        this.i = true;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = 10000L;
        this.n = 300000L;
        this.q = System.currentTimeMillis();
        com.twitter.library.featureswitch.d.a(this);
        if (App.f()) {
            this.r = context.getSharedPreferences("geo_location_producer_file", 0).getBoolean("geo_location_producer_mock_enabled", false);
        }
        else {
            this.r = false;
        }
        this.b(this.i);
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)this);
    }
    
    public static sp a(final Context context) {
        synchronized (sp.class) {
            if (sp.a == null) {
                sp.a = new sp(context);
            }
            return sp.a;
        }
    }
    
    private void a(final boolean h, final int n, final int n2) {
        if (n != -1) {
            this.m = 1000L * n;
            if (1000L * n < 5000L) {
                this.m = 10000L;
            }
        }
        if (n2 != -1) {
            this.n = 1000L * n2;
            if (1000L * n2 < 30000L) {
                this.n = 300000L;
            }
        }
        if (this.h != h) {
            this.h = h;
            this.j();
        }
    }
    
    private void b(final boolean i) {
        if (this.r) {
            this.a(st.a(this.b));
        }
        else if (this.g == null || i != this.i) {
            sn sn;
            if ((this.i = i) && com.twitter.library.platform.f.a(this.b)) {
                sn = sm.a(this.b, this, this);
            }
            else {
                sn = sv.a(this.b, this);
            }
            this.a(sn);
        }
    }
    
    private void c(final Location e) {
        if (sk.a().d() && this.a(e, this.e)) {
            this.e = e;
        }
    }
    
    private void h() {
        synchronized (this) {
            this.d.removeMessages(1);
            final Iterator<so> iterator = this.c.iterator();
            while (iterator.hasNext()) {
                iterator.next().b(this.e);
            }
        }
        this.c.clear();
        this.f();
        if (this.j) {
            this.d.sendEmptyMessageDelayed(0, this.i());
        }
    }
    // monitorexit(this)
    
    private long i() {
        final long currentTimeMillis = System.currentTimeMillis();
        final long n = currentTimeMillis - this.p;
        if (n >= this.n) {
            return 0L;
        }
        final long q = this.q;
        if (q >= this.o && q <= this.p) {
            return this.n - n;
        }
        return this.n - (currentTimeMillis - q) % this.n;
    }
    
    private void j() {
        final boolean j = sk.a().d() && this.h;
        if (j != this.j) {
            if (!(this.j = j)) {
                this.k();
                this.g();
            }
            else if (this.l) {
                this.e();
            }
        }
    }
    
    private void k() {
        this.h();
        this.d.removeMessages(0);
        this.d.removeMessages(1);
    }
    
    public Location a() {
        if (sk.a().d()) {
            this.c(this.g.a());
            return this.e;
        }
        return null;
    }
    
    public void a(final long n) {
        this.d.post((Runnable)new sq(this));
    }
    
    protected void a(final long n, final so obj) {
        synchronized (this) {
            if (!this.k && this.g != null) {
                this.o = System.currentTimeMillis();
                this.g.b();
                this.k = true;
            }
            if (n >= 0L) {
                if (obj == null) {
                    this.d.sendEmptyMessageDelayed(1, n);
                }
                else {
                    final Message message = new Message();
                    message.what = 1;
                    message.obj = obj;
                    this.d.sendMessageDelayed(message, n);
                }
            }
        }
    }
    
    public void a(final Location location) {
        while (true) {
            while (true) {
                int n = 0;
                Label_0125: {
                    synchronized (this) {
                        this.c(location);
                        if (this.e != null) {
                            this.q = this.e.getTime();
                            final so[] array = (so[])this.c.toArray(new so[this.c.size()]);
                            final int length = array.length;
                            n = 0;
                            if (n < length) {
                                final so so = array[n];
                                if (so != null && this.c.contains(so)) {
                                    so.a(location);
                                }
                                break Label_0125;
                            }
                            else if (this.a(location, 20.0f)) {
                                this.h();
                            }
                        }
                        return;
                    }
                }
                ++n;
                continue;
            }
        }
    }
    
    protected void a(final Message message) {
        switch (message.what) {
            default: {}
            case 0: {
                this.a(this.m, null);
            }
            case 1: {
                this.b((so)message.obj);
            }
            case 2: {
                this.k();
            }
        }
    }
    
    public void a(final a a) {
        this.b(false);
    }
    
    void a(final sn g) {
        if (g != null) {
            if (this.g != null) {
                this.k();
            }
            this.g = g;
            if (this.l) {
                this.e();
            }
        }
    }
    
    public void a(final so so) {
        this.a(so, 10000L);
    }
    
    public void a(final so so, final long n) {
        // monitorenter(this)
        if (so == null) {
            return;
        }
        while (true) {
            Location a = null;
            Label_0111: {
                try {
                    if (!this.c.contains(so) && sk.a().d()) {
                        a = this.a();
                        if (a != null) {
                            this.d.post((Runnable)new sr(so, a, 0, null));
                        }
                        if (this.a(a, 30000L)) {
                            break Label_0111;
                        }
                        this.c.add(so);
                        this.d.removeMessages(0);
                        this.a(n, so);
                    }
                    return;
                }
                finally {
                }
                // monitorexit(this)
            }
            this.d.post((Runnable)new sr(so, a, 1, null));
        }
    }
    
    void a(final boolean r) {
        synchronized (this) {
            if (r != this.r) {
                if (!(this.r = r)) {
                    this.g = null;
                }
                this.b.getSharedPreferences("geo_location_producer_file", 0).edit().putBoolean("geo_location_producer_mock_enabled", r).apply();
                this.g();
                this.b(this.i);
            }
        }
    }
    
    public void a(final boolean b, final boolean b2, final int n, final int n2) {
        this.b(b2);
        this.a(b, n, n2);
    }
    
    protected boolean a(final Location location, final float n) {
        return location != null && location.hasAccuracy() && location.getAccuracy() < n;
    }
    
    protected boolean a(final Location location, final long n) {
        if (location != null) {
            final long n2 = System.currentTimeMillis() - location.getTime();
            if (n2 >= 0L && n2 <= n) {
                return true;
            }
        }
        return false;
    }
    
    protected boolean a(final Location location, final Location location2) {
        boolean b = true;
        if (location == null || !location.hasAccuracy()) {
            b = false;
        }
        else if (location2 != null) {
            final long n = location.getTime() - location2.getTime();
            final boolean b2 = n > 30000L && b;
            final boolean b3 = n < -30000L && b;
            if (!b2) {
                if (b3) {
                    return false;
                }
                if ((n < 0L || !this.a(location, 20.0f)) && location.getAccuracy() > location2.getAccuracy()) {
                    return false;
                }
            }
        }
        return b;
    }
    
    public String b() {
        return sn.b(this.a());
    }
    
    public void b(final Location location) {
    }
    
    public void b(final so so) {
        // monitorenter(this)
        Label_0046: {
            if (so == null) {
                break Label_0046;
            }
            try {
                this.d.post((Runnable)new sr(so, this.e, 1, null));
                this.d.removeMessages(1, (Object)so);
                this.c.remove(so);
                if (!this.d.hasMessages(1)) {
                    this.f();
                    if (this.j) {
                        this.d.sendEmptyMessageDelayed(0, this.i());
                    }
                }
            }
            finally {
            }
            // monitorexit(this)
        }
    }
    
    public boolean c() {
        return !this.f.getAllProviders().isEmpty();
    }
    
    public void d() {
        this.l = false;
        if (this.j) {
            this.d.sendEmptyMessageDelayed(2, 1000L);
        }
    }
    
    public void e() {
        this.l = true;
        if (this.d.hasMessages(2)) {
            this.d.removeMessages(2);
        }
        if (this.j && !this.k) {
            final long i = this.i();
            if (i < 1000L) {
                this.a(this.m, null);
            }
            else if (!this.d.hasMessages(0)) {
                this.d.sendEmptyMessageDelayed(0, i);
            }
        }
    }
    
    protected void f() {
        synchronized (this) {
            if (this.k && this.g != null) {
                this.g.c();
                this.p = System.currentTimeMillis();
                this.k = false;
            }
        }
    }
    
    void g() {
        synchronized (this) {
            this.e = null;
            this.q = System.currentTimeMillis();
        }
    }
    
    public void onSharedPreferenceChanged(final SharedPreferences sharedPreferences, final String s) {
        if ("location".equals(s)) {
            this.j();
        }
    }
}
