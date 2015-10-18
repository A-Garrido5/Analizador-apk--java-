import android.content.Intent;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.5.30
// 

class as extends Handler
{
    final /* synthetic */ ar a;
    
    as(final ar a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public void handleMessage(final Message message) {
        this.a.b.add(message.obj);
    }
}
