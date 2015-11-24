import java.util.Iterator;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.30
// 

final class yd implements Iterable
{
    final /* synthetic */ Iterable a;
    final /* synthetic */ Iterable b;
    final /* synthetic */ Comparator c;
    
    yd(final Iterable a, final Iterable b, final Comparator c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public Iterator iterator() {
        return new ye(this);
    }
}
