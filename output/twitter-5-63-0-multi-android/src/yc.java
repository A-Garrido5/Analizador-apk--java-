import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.30
// 

class yc implements Iterator
{
    final /* synthetic */ yb a;
    private final yf b;
    
    yc(final yb a) {
        this.a = a;
        this.b = new yf(this.a.a.iterator());
    }
    
    @Override
    public boolean hasNext() {
        while (this.b.hasNext() && !this.a.b.a(this.b.a())) {
            this.b.next();
        }
        return this.b.hasNext();
    }
    
    @Override
    public Object next() {
        if (!this.b.hasNext()) {
            throw new NoSuchElementException();
        }
        return this.b.next();
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
