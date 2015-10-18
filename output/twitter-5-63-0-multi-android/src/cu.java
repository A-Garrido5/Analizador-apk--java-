import com.twitter.android.client.bz;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class cu implements db
{
    private final cx a;
    private final cz b;
    
    public cu(final Context context, final dj dj) {
        final int g = bz.g();
        this.a = new cx(context, g, dj);
        this.b = new cz(context, g, dj);
    }
    
    @Override
    public void a() {
        this.a.a();
        this.b.a();
    }
    
    public void a(final dt dt, final dc dc) {
        if (dt.b == 1) {
            this.a.a(dt.a, new cv(this, dc, dt));
        }
        else if (dt.b == 2) {
            if (!dt.a.contains(" ")) {
                this.b.a(dt.a, new cw(this, dc, dt));
                return;
            }
            dc.a(dt, ln.a);
        }
    }
}
