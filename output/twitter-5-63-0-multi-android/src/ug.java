import android.os.Process;
import com.twitter.internal.network.DataUsageEvent;
import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.internal.network.DataUsageEvent$Type;
import com.twitter.internal.network.b;
import com.twitter.library.featureswitch.d;
import android.net.TrafficStats;
import com.twitter.util.n;

// 
// Decompiled by Procyon v0.5.30
// 

public class ug
{
    private long a;
    private long b;
    private long c;
    private final n d;
    
    public ug() {
        this.a = 0L;
        this.b = 0L;
        this.c = 0L;
        this.d = new uh(this);
    }
    
    private long a(final int n) {
        long uidRxBytes = TrafficStats.getUidRxBytes(n);
        if (uidRxBytes == -1L) {
            uidRxBytes = TrafficStats.getUidTcpRxBytes(n) + TrafficStats.getUidUdpRxBytes(n);
        }
        if (uidRxBytes < 0L) {
            return -1L;
        }
        return uidRxBytes;
    }
    
    private void a(final long n) {
        if (!com.twitter.library.featureswitch.d.a("video_data_usage_tracking_enabled", false)) {
            return;
        }
        com.twitter.internal.network.b.a().a(new DataUsageEvent(DataUsageEvent$Type.d, TelephonyUtil.c(), n, 0L));
    }
    
    public void a() {
        this.b = this.a(Process.myUid());
        this.a = this.a(Process.getUidForName("media"));
        this.c = 0L;
        com.twitter.internal.network.b.a().a(this.d);
    }
    
    public void b() {
        com.twitter.internal.network.b.a().b(this.d);
        final long a = this.a(Process.myUid());
        final long a2 = this.a(Process.getUidForName("media"));
        Label_0073: {
            if (this.a == -1L || a2 == -1L) {
                break Label_0073;
            }
            final long n = a2 - this.a;
            if (n <= 0L) {
                break Label_0073;
            }
            this.a(n);
            return;
        }
        if (this.b == -1L || a == -1L) {
            return;
        }
        final long n2 = a - this.b - this.c;
        if (n2 > 0L) {
            this.a(n2);
        }
    }
}
