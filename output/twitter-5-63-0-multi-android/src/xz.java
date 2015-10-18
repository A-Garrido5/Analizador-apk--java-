import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.30
// 

final class xz implements Iterable
{
    final /* synthetic */ Iterable a;
    final /* synthetic */ xx b;
    
    xz(final Iterable a, final xx b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public Iterator iterator() {
        return new ya(this);
    }
}
