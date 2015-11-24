import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

class tu implements Runnable
{
    final /* synthetic */ ts a;
    final /* synthetic */ Object b;
    final /* synthetic */ tt c;
    
    tu(final tt c, final ts a, final Object b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.a.a(this.c.a, this.b);
    }
}
