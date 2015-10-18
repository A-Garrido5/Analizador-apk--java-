import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.5.30
// 

public final class aam
{
    private static int a;
    
    static {
        aam.a = 512;
    }
    
    public static int a(final InputStream inputStream, final byte[] array) {
        return a(inputStream, array, 0, array.length);
    }
    
    public static int a(final InputStream inputStream, final byte[] array, final int n, final int n2) {
        int i;
        int read;
        for (i = 0; i < n2; i += read) {
            read = inputStream.read(array, n + i, n2 - i);
            if (read < 0) {
                break;
            }
        }
        return i;
    }
    
    public static void a(final InputStream inputStream, final OutputStream outputStream) {
        final byte[] array = new byte[aam.a];
        while (true) {
            final int read = inputStream.read(array, 0, array.length);
            if (read < 0) {
                break;
            }
            outputStream.write(array, 0, read);
        }
    }
    
    public static byte[] a(final InputStream inputStream) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
