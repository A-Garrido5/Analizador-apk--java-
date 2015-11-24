import android.os.Message;
import android.os.Looper;
import java.lang.ref.WeakReference;
import android.os.Handler;

// 
// Decompiled by Procyon v0.5.30
// 

class su extends Handler
{
    private WeakReference a;
    
    public su(final Looper looper, final st st) {
        super(looper);
        this.a = new WeakReference((T)st);
    }
    
    public void handleMessage(final Message message) {
        final st st = (st)this.a.get();
        if (st != null) {
            st.a(message);
        }
    }
}
