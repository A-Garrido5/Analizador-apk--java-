import java.util.Arrays;

// 
// Decompiled by Procyon v0.5.30
// 

public final class ac extends y
{
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int[] h;
    
    ac(final String s, final int n, final int c, final int d, final int e, final int f, final int[] h, final int g) {
        super(s, n);
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = h;
        this.g = g;
    }
    
    public static ac a(final String s, final int n, final int[] array, final int n2) {
        if (n2 < 4) {
            throw new IllegalArgumentException();
        }
        final int n3 = array[0];
        final int n4 = array[1];
        final int n5 = array[2];
        final int n6 = array[3];
        int[] copyOfRange;
        if (n2 - 4 > 0) {
            copyOfRange = Arrays.copyOfRange(array, 4, n2);
        }
        else {
            copyOfRange = null;
        }
        return new ac(s, n, n3, n4, n5, n6, copyOfRange, n2);
    }
    
    private final boolean a(final int[] array) {
        for (int n = -4 + this.g, i = 0; i < n; ++i) {
            if (array[i + 4] != this.h[i]) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public boolean a(final int n) {
        return false;
    }
    
    @Override
    public boolean a(final int n, final int n2) {
        return false;
    }
    
    @Override
    public boolean a(final int[] array, final int n) {
        if (n == this.g && array[0] == this.c && array[1] == this.d && array[2] == this.e && array[3] == this.f) {
            Label_0128: {
                switch (n) {
                    default: {
                        return this.a(array);
                    }
                    case 8: {
                        if (array[7] == this.h[3]) {
                            break Label_0128;
                        }
                        break;
                    }
                    case 7: {
                        if (array[6] == this.h[2]) {
                            break Label_0128;
                        }
                        break;
                    }
                    case 6: {
                        if (array[5] == this.h[1]) {
                            break Label_0128;
                        }
                        break;
                    }
                    case 5: {
                        if (array[4] == this.h[0]) {
                            return true;
                        }
                        break;
                    }
                    case 4: {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
