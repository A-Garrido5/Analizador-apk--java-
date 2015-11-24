import com.twitter.internal.network.HttpOperation;
import java.text.SimpleDateFormat;
import com.twitter.internal.network.d;

// 
// Decompiled by Procyon v0.5.30
// 

public final class km implements d
{
    private static final SimpleDateFormat a;
    private static kf b;
    private ke c;
    private final com.twitter.internal.android.service.d d;
    
    static {
        a = new SimpleDateFormat("'/sdcard/twitter/'yyyy-MM-dd-HHmmss'.har'");
        km.b = new kf();
    }
    
    @Override
    public void a(final HttpOperation httpOperation) {
        synchronized ("HttpOperationHARLogger") {
            this.c = new ke(httpOperation, System.currentTimeMillis(), this.d);
            km.b.a(this.c);
        }
    }
    
    @Override
    public void a(final HttpOperation httpOperation, final Exception ex) {
    }
    
    @Override
    public void b(final HttpOperation httpOperation) {
        synchronized ("HttpOperationHARLogger") {
            this.c.b();
        }
    }
}
