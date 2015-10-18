import com.twitter.library.provider.b;

// 
// Decompiled by Procyon v0.5.30
// 

class ek implements Runnable
{
    final /* synthetic */ b a;
    final /* synthetic */ ej b;
    
    ek(final ej b, final b a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.a();
    }
}
