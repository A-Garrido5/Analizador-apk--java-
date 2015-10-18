import android.net.TrafficStats;
import java.util.TimerTask;
import java.util.Timer;
import android.os.Process;

// 
// Decompiled by Procyon v0.5.30
// 

public class jz
{
    private static jz a;
    private final int b;
    private long c;
    private boolean d;
    
    private jz() {
        this.d = false;
        this.b = Process.myUid();
        this.a(true);
        new Timer().scheduleAtFixedRate(new ka(this), 500L, 500L);
    }
    
    public static jz a() {
        synchronized (jz.class) {
            if (jz.a == null) {
                jz.a = new jz();
            }
            return jz.a;
        }
    }
    
    public void a(final boolean b) {
        // monitorenter(this)
        Label_0035: {
            if (!b) {
                break Label_0035;
            }
            try {
                long c = TrafficStats.getUidRxBytes(this.b) + TrafficStats.getUidTxBytes(this.b);
                while (true) {
                    this.c = c;
                    this.d = false;
                    return;
                    c = 0L;
                    continue;
                }
            }
            finally {
            }
            // monitorexit(this)
        }
    }
    
    public void b() {
        synchronized (this) {
            if (!this.d) {
                final long max = Math.max(1048576L - (TrafficStats.getUidRxBytes(this.b) + TrafficStats.getUidTxBytes(this.b) - this.c), 0L);
                ny.a().a(nz.a(null, 5, (int)(10000.0f * (max / 1048576.0f))));
                this.d = (max == 0L);
            }
        }
    }
}
