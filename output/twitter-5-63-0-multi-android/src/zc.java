import java.io.IOException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;

// 
// Decompiled by Procyon v0.5.30
// 

public class zc
{
    private static final zd a;
    
    static {
        a = new zd();
    }
    
    public static byte[] a(final String s) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(3 * (s.length() / 4));
        try {
            zc.a.a(s, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException ex) {
            throw new RuntimeException("exception decoding base64 string: " + ex);
        }
    }
    
    public static byte[] a(final byte[] array) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4 * ((2 + array.length) / 3));
        try {
            zc.a.a(array, 0, array.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException ex) {
            throw new RuntimeException("exception encoding base64 string: " + ex);
        }
    }
}
