import android.os.Bundle;
import android.location.Location;
import com.google.android.gms.location.h;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;
import android.content.Context;
import com.google.android.gms.common.api.n;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.g;
import com.google.android.gms.common.api.p;

// 
// Decompiled by Procyon v0.5.30
// 

class sm extends sn implements p, g
{
    private static sm c;
    private boolean d;
    private LocationRequest e;
    private n f;
    
    private sm(final Context context, final so so, final q q) {
        super(context, so);
        this.d = false;
        (this.e = LocationRequest.a()).a(2000L);
        this.e.b(1000L);
        this.e.a(100);
        this.e.b(10);
        (this.f = new o(context).a(h.a).a(this).a(q).b()).b();
    }
    
    public static sm a(final Context context, final so so, final q q) {
        synchronized (sm.class) {
            if (sm.c == null) {
                sm.c = new sm(context, so, q);
            }
            return sm.c;
        }
    }
    
    @Override
    public Location a() {
        if (!this.f.d()) {
            return null;
        }
        return h.b.a(this.f);
    }
    
    @Override
    public void a(final int n) {
    }
    
    @Override
    public void a(final Location location) {
        this.b("app:google_location_provider:first_location_change");
        this.b.a(location);
    }
    
    @Override
    public void a(final Bundle bundle) {
        if (this.d) {
            this.b();
            this.d = false;
        }
    }
    
    @Override
    public void b() {
        if (!this.f.d()) {
            this.d = true;
            return;
        }
        this.a("app:google_location_provider:on");
        this.a("app:google_location_provider:first_location_change");
        h.b.a(this.f, this.e, this);
    }
    
    @Override
    public void c() {
        if (!this.f.d()) {
            this.d = false;
            return;
        }
        this.b("app:google_location_provider:on");
        this.b("app:google_location_provider:first_location_change");
        h.b.a(this.f, this);
    }
}
