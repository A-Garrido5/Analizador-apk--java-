import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class we
{
    private CopyOnWriteArraySet a;
    
    public we() {
        this.a = new CopyOnWriteArraySet();
    }
    
    public abstract void a(final String p0);
    
    protected void a(final String s, final boolean b) {
        final Iterator<wf> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(s, b);
        }
    }
    
    public void a(final wf wf) {
        this.a.add(wf);
    }
    
    public void b(final wf wf) {
        this.a.remove(wf);
    }
}
