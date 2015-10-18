import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.30
// 

class ye implements Iterator
{
    final /* synthetic */ yd a;
    private final yf b;
    private final yf c;
    
    ye(final yd a) {
        this.a = a;
        this.b = new yf(this.a.a.iterator());
        this.c = new yf(this.a.b.iterator());
    }
    
    @Override
    public boolean hasNext() {
        return this.b.hasNext() || this.c.hasNext();
    }
    
    @Override
    public Object next() {
        if (!this.b.hasNext() && !this.c.hasNext()) {
            throw new NoSuchElementException();
        }
        if (!this.c.hasNext()) {
            return this.b.next();
        }
        if (!this.b.hasNext()) {
            return this.c.next();
        }
        if (this.a.c.compare(this.b.a(), this.c.a()) < 0) {
            return this.b.next();
        }
        return this.c.next();
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
