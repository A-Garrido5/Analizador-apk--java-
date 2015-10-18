import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class tt
{
    private final Context a;
    private final Executor b;
    
    public tt(final Context context, final Executor b) {
        this.a = context.getApplicationContext();
        this.b = b;
    }
    
    public void a(final List list, final Object o) {
        for (final ts ts : list) {
            if (ts.b(this.a, o)) {
                if (ts.a()) {
                    this.b.execute(new tu(this, ts, o));
                }
                else {
                    ts.a(this.a, o);
                }
            }
        }
    }
}
