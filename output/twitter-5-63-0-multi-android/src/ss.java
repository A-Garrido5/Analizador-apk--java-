import android.os.Message;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.5.30
// 

class ss extends Handler
{
    private sp a;
    
    public ss(final sp a, final Looper looper) {
        super(looper);
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        this.a.a(message);
    }
}
