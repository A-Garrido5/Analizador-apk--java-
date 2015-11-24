import android.os.Bundle;
import java.util.Iterator;
import android.location.Location;
import android.content.Context;
import android.location.LocationManager;
import java.util.List;
import android.location.LocationListener;

// 
// Decompiled by Procyon v0.5.30
// 

class sv extends sn implements LocationListener
{
    private static sv c;
    private List d;
    private LocationManager e;
    
    private sv(final Context context, final so so) {
        super(context, so);
        this.e = (LocationManager)context.getSystemService("location");
        this.d = this.d();
    }
    
    public static sv a(final Context context, final so so) {
        synchronized (sv.class) {
            if (sv.c == null) {
                sv.c = new sv(context, so);
            }
            return sv.c;
        }
    }
    
    private boolean a(final Location location, final Location location2) {
        return location != null && (location2 == null || (location2.getTime() - location.getTime() < 1000L && location2.getAccuracy() > location.getAccuracy()));
    }
    
    @Override
    public Location a() {
        Location location = null;
        final Iterator<String> iterator = this.d.iterator();
    Label_0069:
        while (iterator.hasNext()) {
            while (true) {
                final String s = iterator.next();
                while (true) {
                    Label_0071: {
                        try {
                            final Location lastKnownLocation = this.e.getLastKnownLocation(s);
                            if (this.a(lastKnownLocation, location)) {
                                location = lastKnownLocation;
                                break;
                            }
                            break Label_0071;
                        }
                        catch (Exception ex) {
                            final Location lastKnownLocation = location;
                            continue;
                        }
                        break Label_0069;
                    }
                    final Location lastKnownLocation = location;
                    continue;
                }
            }
        }
        return location;
    }
    
    @Override
    public void b() {
        this.a("app:platform_location_provider:on");
        this.a("app:platform_location_provider:first_location_change");
        for (final String s : this.d()) {
            try {
                this.e.requestLocationUpdates(s, 0L, 0.0f, (LocationListener)this);
            }
            catch (Exception ex) {}
        }
    }
    
    @Override
    public void c() {
        this.b("app:platform_location_provider:on");
        this.b("app:platform_location_provider:first_location_change");
        try {
            this.e.removeUpdates((LocationListener)this);
        }
        catch (Exception ex) {}
    }
    
    protected List d() {
        return this.e.getProviders(true);
    }
    
    public void onLocationChanged(final Location location) {
        this.b("app:platform_location_provider:first_location_change");
        this.b.a(location);
    }
    
    public void onProviderDisabled(final String s) {
    }
    
    public void onProviderEnabled(final String s) {
    }
    
    public void onStatusChanged(final String s, final int n, final Bundle bundle) {
    }
}
