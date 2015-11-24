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
import java.io.BufferedOutputStream;
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
import java.io.FileOutputStream;
import java.io.OutputStream;

// 
// Decompiled by Procyon v0.5.30
// 

public final class yz
{
    final zb a;
    final /* synthetic */ yx b;
    private boolean c;
    
    yz(final yx b, final zb a) {
        this.b = b;
        this.a = a;
    }
    
    public OutputStream a(final int n) {
        synchronized (this.b) {
            if (this.a.b() != this) {
                throw new IllegalStateException();
            }
        }
        try {
            // monitorexit(yx)
            return new za(this, new FileOutputStream(this.a.b(n)), null);
        }
        catch (Throwable t) {
            this.c = true;
            throw t;
        }
    }
    
    public boolean a() {
        return this.c;
    }
    
    public void b() {
        if (this.c) {
            this.b.a(this, false);
            this.b.c(this.a.a);
            return;
        }
        this.b.a(this, true);
    }
    
    public void c() {
        this.b.a(this, false);
    }
}
