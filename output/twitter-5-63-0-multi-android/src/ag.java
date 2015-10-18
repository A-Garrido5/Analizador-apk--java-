import android.os.Process;
import android.os.HandlerThread;

// 
// Decompiled by Procyon v0.5.30
// 

public class ag extends HandlerThread
{
    private final int a;
    
    public ag(final String s, final int a) {
        super(s);
        this.a = a;
    }
    
    public void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
