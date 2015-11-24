import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.30
// 

class ya implements Iterator
{
    final /* synthetic */ xz a;
    private final Iterator b;
    
    ya(final xz a) {
        this.a = a;
        this.b = this.a.a.iterator();
    }
    
    @Override
    public boolean hasNext() {
        return this.b.hasNext();
    }
    
    @Override
    public Object next() {
        return this.a.b.a(this.b.next());
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
