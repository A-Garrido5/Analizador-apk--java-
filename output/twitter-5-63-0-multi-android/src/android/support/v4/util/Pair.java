// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.util;

public class Pair
{
    public final Object first;
    public final Object second;
    
    public Pair(final Object first, final Object second) {
        this.first = first;
        this.second = second;
    }
    
    public static Pair create(final Object o, final Object o2) {
        return new Pair(o, o2);
    }
    
    private static boolean objectsEqual(final Object o, final Object o2) {
        return o == o2 || (o != null && o.equals(o2));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof Pair) {
            final Pair pair = (Pair)o;
            if (objectsEqual(pair.first, this.first) && objectsEqual(pair.second, this.second)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.first == null) {
            hashCode = 0;
        }
        else {
            hashCode = this.first.hashCode();
        }
        final Object second = this.second;
        int hashCode2 = 0;
        if (second != null) {
            hashCode2 = this.second.hashCode();
        }
        return hashCode ^ hashCode2;
    }
}
