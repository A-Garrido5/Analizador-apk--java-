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
import java.util.concurrent.ExecutorService;
import java.util.LinkedHashMap;
import java.io.File;
import java.io.Closeable;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.5.30
// 

class yy implements Callable
{
    final /* synthetic */ yx a;
    
    yy(final yx a) {
        this.a = a;
    }
    
    public Void a() {
        synchronized (this.a) {
            if (this.a.k == null) {
                return null;
            }
            this.a.i();
            if (this.a.g()) {
                this.a.f();
            }
            return null;
        }
    }
}
