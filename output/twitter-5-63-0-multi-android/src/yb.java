import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.30
// 

final class yb implements Iterable
{
    final /* synthetic */ Iterable a;
    final /* synthetic */ yg b;
    
    yb(final Iterable a, final yg b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public Iterator iterator() {
        return new yc(this);
    }
}
