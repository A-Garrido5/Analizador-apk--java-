import android.os.AsyncTask$Status;
import android.os.AsyncTask;
import android.support.v4.util.LruCache;

// 
// Decompiled by Procyon v0.5.30
// 

public class un extends we
{
    private static LruCache a;
    private AsyncTask b;
    
    static {
        un.a = new LruCache(10);
    }
    
    @Override
    public void a(final String s) {
        final Boolean b = (Boolean)un.a.get(s);
        if (b != null) {
            this.a(s, b);
        }
        else if (this.b == null || this.b.getStatus() == AsyncTask$Status.FINISHED) {
            (this.b = new uo(this)).execute((Object[])new String[] { s });
        }
    }
}
