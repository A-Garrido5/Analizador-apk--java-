import java.net.UnknownHostException;
import java.net.InetAddress;

// 
// Decompiled by Procyon v0.5.30
// 

final class ay implements ax
{
    @Override
    public InetAddress[] a(final String s) {
        if (s == null) {
            throw new UnknownHostException("host == null");
        }
        return InetAddress.getAllByName(s);
    }
}
