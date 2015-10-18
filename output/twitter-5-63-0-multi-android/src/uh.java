import android.os.Process;
import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.internal.network.DataUsageEvent$Type;
import com.twitter.internal.network.b;
import com.twitter.library.featureswitch.d;
import android.net.TrafficStats;
import com.twitter.internal.network.DataUsageEvent;
import com.twitter.util.n;

// 
// Decompiled by Procyon v0.5.30
// 

class uh implements n
{
    final /* synthetic */ ug a;
    
    uh(final ug a) {
        this.a = a;
    }
    
    public void a(final DataUsageEvent dataUsageEvent) {
        ug.a(this.a, dataUsageEvent.c);
    }
}
