import java.io.IOException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;

// 
// Decompiled by Procyon v0.5.30
// 

public class aak
{
    private static final aaj a;
    
    static {
        a = new aal();
    }
    
    public static byte[] a(final byte[] array) {
        return a(array, 0, array.length);
    }
    
    public static byte[] a(final byte[] array, final int n, final int n2) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            aak.a.a(array, n, n2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException ex) {
            throw new RuntimeException("exception encoding Hex string: " + ex);
        }
    }
}
