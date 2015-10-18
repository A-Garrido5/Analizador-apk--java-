// 
// Decompiled by Procyon v0.5.30
// 

public abstract class aac
{
    public static void a(final int n, final byte[] array, final int n2) {
        array[n2] = (byte)(n >>> 24);
        final int n3 = n2 + 1;
        array[n3] = (byte)(n >>> 16);
        final int n4 = n3 + 1;
        array[n4] = (byte)(n >>> 8);
        array[n4 + 1] = (byte)n;
    }
}
