import java.io.IOException;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.ByteArrayOutputStream;

// 
// Decompiled by Procyon v0.5.30
// 

public final class yo
{
    public static byte[] a(final byte[] array) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            final GZIPOutputStream gzipOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gzipOutputStream.write(array);
                yh.a(gzipOutputStream);
                yh.a(byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            }
            catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            finally {
                yh.a(gzipOutputStream);
            }
        }
        catch (IOException ex2) {
            try {
                throw new RuntimeException(ex2);
            }
            finally {
                yh.a(byteArrayOutputStream);
            }
        }
    }
}
