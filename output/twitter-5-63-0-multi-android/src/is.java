import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.30
// 

class is implements Comparator
{
    final /* synthetic */ ir a;
    
    is(final ir a) {
        this.a = a;
    }
    
    public int a(final ig ig, final ig ig2) {
        if (ig.f < ig2.f) {
            return -1;
        }
        return 1;
    }
}
