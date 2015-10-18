// 
// Decompiled by Procyon v0.5.30
// 

final class x
{
    public final String a;
    public final x b;
    public final int c;
    
    public x(final String a, final x b) {
        this.a = a;
        this.b = b;
        int c;
        if (b == null) {
            c = 1;
        }
        else {
            c = 1 + b.c;
        }
        this.c = c;
    }
    
    public String a(final char[] array, final int n, final int n2) {
        if (this.a.length() != n2) {
            return null;
        }
        int n3 = 0;
        while (this.a.charAt(n3) == array[n + n3]) {
            if (++n3 >= n2) {
                return this.a;
            }
        }
        return null;
    }
}
