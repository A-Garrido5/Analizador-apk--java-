// 
// Decompiled by Procyon v0.5.30
// 

public abstract class az implements Runnable
{
    private final String a;
    
    public az(final String s, final Object... array) {
        this.a = String.format(s, array);
    }
    
    protected abstract void a();
    
    @Override
    public final void run() {
        final String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.a);
        try {
            this.a();
        }
        finally {
            Thread.currentThread().setName(name);
        }
    }
}
