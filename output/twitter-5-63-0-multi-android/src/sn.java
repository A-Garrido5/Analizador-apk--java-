import android.text.TextUtils;
import java.util.Locale;
import android.location.Location;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class sn
{
    protected Context a;
    protected so b;
    
    public sn(final Context context, final so b) {
        this.a = context.getApplicationContext();
        this.b = b;
    }
    
    public static String b(final Location location) {
        if (location == null) {
            return "0";
        }
        final StringBuilder sb = new StringBuilder(String.format(Locale.ENGLISH, "%d;lat=%.7f;lon=%.7f", location.getTime(), location.getLatitude(), location.getLongitude()));
        if (location.hasAccuracy()) {
            sb.append(String.format(Locale.ENGLISH, ";hacc=%.2f", location.getAccuracy()));
        }
        if (location.hasAltitude()) {
            sb.append(String.format(Locale.ENGLISH, ";alt=%.2f", location.getAltitude()));
        }
        if (location.hasSpeed()) {
            sb.append(String.format(Locale.ENGLISH, ";spd=%.2f", location.getSpeed()));
        }
        if (location.hasBearing()) {
            sb.append(String.format(Locale.ENGLISH, ";br=%.2f", location.getBearing()));
        }
        final String c = c(location.getProvider());
        if (!TextUtils.isEmpty((CharSequence)c)) {
            sb.append(";src=");
            sb.append(c);
        }
        return sb.toString();
    }
    
    private static String c(final String s) {
        String s2 = "";
        if (s.equals("gps")) {
            s2 = "G";
        }
        else {
            if (s.equals("network")) {
                return "N";
            }
            if (s.equals("fused")) {
                return "I";
            }
        }
        return s2;
    }
    
    public abstract Location a();
    
    protected void a(final String s) {
        ix.a(s, ir.b(), ih.n).i();
    }
    
    public abstract void b();
    
    protected void b(final String s) {
        final ix a = ix.a(s, ir.b(), ih.n);
        if (a.l()) {
            a.j();
        }
    }
    
    public abstract void c();
}
