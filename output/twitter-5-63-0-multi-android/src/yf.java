import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.30
// 

public class yf implements Iterator
{
    private final Iterator a;
    private Object b;
    private boolean c;
    
    public yf(final Iterator a) {
        this.a = a;
        this.b();
    }
    
    private void b() {
        this.c = this.a.hasNext();
        if (this.c) {
            this.b = this.a.next();
        }
    }
    
    public Object a() {
        if (this.c) {
            return this.b;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public boolean hasNext() {
        return this.c;
    }
    
    @Override
    public Object next() {
        final Object a = this.a();
        this.b();
        return a;
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
