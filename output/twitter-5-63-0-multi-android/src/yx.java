import java.util.ArrayList;
import java.util.Map;
import java.util.Iterator;
import java.io.EOFException;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.DataOutput;
import java.io.DataInput;
import java.io.FileNotFoundException;
import java.io.IOException;
import android.util.Log;
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.io.DataOutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.LinkedHashMap;
import java.io.File;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.5.30
// 

public final class yx implements Closeable
{
    private final File a;
    private final File b;
    private final File c;
    private final int d;
    private final long e;
    private final int f;
    private final LinkedHashMap g;
    private final ExecutorService h;
    private final Callable i;
    private long j;
    private DataOutputStream k;
    private int l;
    
    private yx(final File a, final int d, final int f, final long e) {
        this.g = new LinkedHashMap(0, 0.75f, true);
        this.h = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
        this.i = new yy(this);
        this.a = a;
        this.d = d;
        this.b = new File(a, "journal");
        this.c = new File(a, "journal.tmp");
        this.f = f;
        this.e = e;
    }
    
    public static yx a(final File file, final int n, final int n2, final long n3) {
        if (n3 <= 0L) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (n2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        final yx yx = new yx(file, n, n2, n3);
        if (yx.b.exists()) {
            try {
                final int d = yx.d();
                yx.e();
                yx.k = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(yx.b, true)));
                yx.l = d - yx.g.size();
                return yx;
            }
            catch (IOException ex) {
                Log.w("DiskLruCache", file + " is corrupt: " + ex.getMessage() + ", removing");
                yx.c();
            }
        }
        if (file.mkdirs() || file.exists()) {
            final yx yx2 = new yx(file, n, n2, n3);
            yx2.f();
            return yx2;
        }
        throw new FileNotFoundException("directory not found " + file);
    }
    
    private void a(final DataInput dataInput) {
        final int unsignedByte = dataInput.readUnsignedByte();
        final String utf = dataInput.readUTF();
        if (unsignedByte == 3 && dataInput.readByte() == 10) {
            this.g.remove(utf);
        }
        else {
            final zb zb = this.g.get(utf);
            zb zb3;
            if (zb == null) {
                final zb zb2 = new zb(this, utf, this.f);
                this.g.put(utf, zb2);
                zb3 = zb2;
            }
            else {
                zb3 = zb;
            }
            if (unsignedByte == 1) {
                final long[] array = new long[this.f];
                for (int i = 0; i < this.f; ++i) {
                    array[i] = dataInput.readLong();
                }
                if (dataInput.readByte() != 10) {
                    throw new IOException("unexpected journal entry: " + unsignedByte + " " + utf);
                }
                zb3.c = true;
                zb3.d = null;
                System.arraycopy(array, 0, zb3.b, 0, this.f);
            }
            else {
                if (unsignedByte == 2 && dataInput.readByte() == 10) {
                    zb3.d = new yz(this, zb3);
                    return;
                }
                if (unsignedByte != 4 || dataInput.readByte() != 10) {
                    throw new IOException("unexpected journal entry: " + unsignedByte + " " + utf);
                }
            }
        }
    }
    
    private void a(final DataOutput dataOutput, final int n, final String s) {
        dataOutput.writeByte(n);
        dataOutput.writeUTF(s);
        dataOutput.writeByte(10);
    }
    
    private void a(final DataOutput dataOutput, final zb zb) {
        dataOutput.writeByte(1);
        dataOutput.writeUTF(zb.a);
        final long[] b = zb.b;
        for (int length = b.length, i = 0; i < length; ++i) {
            dataOutput.writeLong(b[i]);
        }
        dataOutput.writeByte(10);
    }
    
    private void a(final yz yz, final boolean b) {
        final zb a;
        synchronized (this) {
            a = yz.a;
            if (a.b() != yz) {
                throw new IllegalStateException();
            }
        }
        int i = 0;
        if (b) {
            final boolean a2 = a.a();
            i = 0;
            if (!a2) {
                int n = 0;
                while (true) {
                    final int f = this.f;
                    i = 0;
                    if (n >= f) {
                        break;
                    }
                    if (!a.b(n).exists()) {
                        yz.c();
                        throw new IllegalStateException("edit didn't create file " + n);
                    }
                    ++n;
                }
            }
        }
        while (i < this.f) {
            final File b2 = a.b(i);
            if (b) {
                if (b2.exists()) {
                    final File a3 = a.a(i);
                    yh.a(b2, a3);
                    final long n2 = a.b[i];
                    final long length = a3.length();
                    a.b[i] = length;
                    this.j = length + (this.j - n2);
                }
            }
            else {
                a(b2);
            }
            ++i;
        }
        ++this.l;
        a.d = null;
        if (b | a.a()) {
            a.c = true;
            this.a(this.k, a);
        }
        else {
            this.g.remove(a.a);
            this.a(this.k, 3, a.a);
        }
        if (this.j > this.e || this.g()) {
            this.h.submit((Callable<Object>)this.i);
        }
    }
    // monitorexit(this)
    
    private static boolean a(final File file) {
        return file.exists() && file.delete();
    }
    
    private int d() {
        final DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(this.b)));
        try {
            final long long1 = dataInputStream.readLong();
            final int unsignedByte = dataInputStream.readUnsignedByte();
            final int int1 = dataInputStream.readInt();
            final int int2 = dataInputStream.readInt();
            final byte byte1 = dataInputStream.readByte();
            if (-9130401435085039094L != long1 || 2 != unsignedByte || this.d != int1 || this.f != int2 || byte1 != 10) {
                throw new IOException("unexpected journal header: [" + long1 + ", " + unsignedByte + ", " + int2 + ", " + byte1 + "]");
            }
        }
        finally {
            yh.a((Closeable)dataInputStream);
        }
        int n = 0;
        try {
            while (true) {
                this.a(dataInputStream);
                ++n;
            }
        }
        catch (EOFException ex) {
            yh.a((Closeable)dataInputStream);
            return n;
        }
    }
    
    private void d(final String s) {
        if (s.contains(" ") || s.contains("\n") || s.contains("\r")) {
            throw new IllegalArgumentException("keys must not contain spaces or newlines: \"" + s + "\"");
        }
    }
    
    private void e() {
        a(this.c);
        final Iterator<zb> iterator = this.g.values().iterator();
        while (iterator.hasNext()) {
            final zb zb = iterator.next();
            if (zb.b() == null) {
                for (int i = 0; i < this.f; ++i) {
                    this.j += zb.b[i];
                }
            }
            else {
                zb.d = null;
                for (int j = 0; j < this.f; ++j) {
                    a(zb.a(j));
                    a(zb.b(j));
                }
                iterator.remove();
            }
        }
    }
    
    private void f() {
        DataOutputStream dataOutputStream;
        while (true) {
            while (true) {
                zb zb = null;
                synchronized (this) {
                    if (this.k != null) {
                        this.k.close();
                    }
                    dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(this.c)));
                    try {
                        dataOutputStream.writeLong(-9130401435085039094L);
                        dataOutputStream.writeByte(2);
                        dataOutputStream.writeInt(this.d);
                        dataOutputStream.writeInt(this.f);
                        dataOutputStream.writeByte(10);
                        final Iterator<zb> iterator = this.g.values().iterator();
                        while (iterator.hasNext()) {
                            zb = iterator.next();
                            if (zb.b() == null) {
                                break;
                            }
                            this.a(dataOutputStream, 2, zb.a);
                        }
                    }
                    finally {
                        dataOutputStream.close();
                    }
                }
                this.a(dataOutputStream, zb);
                continue;
            }
        }
        dataOutputStream.close();
        yh.a(this.c, this.b);
        this.k = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(this.b, true)));
        this.l = 0;
    }
    // monitorexit(this)
    
    private boolean g() {
        return this.l >= 2000 && this.l >= this.g.size();
    }
    
    private void h() {
        if (this.k == null) {
            throw new IllegalStateException("cache is closed");
        }
    }
    
    private void i() {
        while (this.j > this.e) {
            this.c(this.g.entrySet().iterator().next().getKey());
        }
    }
    
    public File a(final String s, final int n, final boolean b) {
        final File a = this.a;
        final StringBuilder append = new StringBuilder().append(s).append(".").append(n);
        String s2;
        if (b) {
            s2 = ".tmp";
        }
        else {
            s2 = "";
        }
        return new File(a, append.append(s2).toString());
    }
    
    public boolean a() {
        return this.k == null;
    }
    
    public boolean a(final String s) {
        synchronized (this) {
            this.h();
            this.d(s);
            boolean b;
            if (this.g.containsKey(s)) {
                ++this.l;
                this.a(this.k, 4, s);
                if (this.g()) {
                    this.h.submit((Callable<Object>)this.i);
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
    }
    
    public yz b(final String s) {
        while (true) {
            while (true) {
                final zb zb;
                Label_0120: {
                    synchronized (this) {
                        this.h();
                        this.d(s);
                        zb = this.g.get(s);
                        yz d;
                        if (zb == null) {
                            final zb zb2 = new zb(this, s, this.f);
                            this.g.put(s, zb2);
                            final zb zb3 = zb2;
                            d = new yz(this, zb3);
                            zb3.d = d;
                            this.a(this.k, 2, s);
                            this.k.flush();
                        }
                        else {
                            if (zb.b() == null) {
                                break Label_0120;
                            }
                            d = null;
                        }
                        return d;
                    }
                }
                final zb zb3 = zb;
                continue;
            }
        }
    }
    
    public void b() {
        synchronized (this) {
            this.h();
            this.i();
            this.k.flush();
        }
    }
    
    public void c() {
        this.close();
        yh.a(this.a);
    }
    
    public boolean c(final String s) {
        synchronized (this) {
            this.h();
            this.d(s);
            final zb zb = this.g.get(s);
            if (zb != null) {
                final yz b = zb.b();
                int i = 0;
                if (b == null) {
                    while (i < this.f) {
                        yh.b(zb.a(i));
                        this.j -= zb.b[i];
                        zb.b[i] = 0L;
                        ++i;
                    }
                    ++this.l;
                    this.a(this.k, 3, s);
                    this.g.remove(s);
                    if (this.g()) {
                        this.h.submit((Callable<Object>)this.i);
                    }
                    return true;
                }
            }
            return false;
        }
    }
    
    @Override
    public void close() {
        while (true) {
            synchronized (this) {
                if (this.k == null) {
                    return;
                }
                final Iterator<zb> iterator = new ArrayList<zb>(this.g.values()).iterator();
                while (iterator.hasNext()) {
                    final yz b = iterator.next().b();
                    if (b != null) {
                        b.c();
                    }
                }
            }
            this.i();
            this.k.close();
            this.k = null;
        }
    }
}
