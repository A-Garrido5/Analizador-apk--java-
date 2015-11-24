import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.5.30
// 

final class bg implements ThreadFactory
{
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;
    
    bg(final String a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public Thread newThread(final Runnable runnable) {
        final Thread thread = new Thread(runnable, this.a);
        thread.setDaemon(this.b);
        return thread;
    }
}
