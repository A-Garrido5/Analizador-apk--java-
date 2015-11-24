// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.autocomplete;

import com.twitter.errorreporter.ErrorReporter;
import android.os.Process;
import com.twitter.util.d;
import android.util.Pair;
import android.os.Handler;
import java.lang.ref.WeakReference;

class k extends Thread implements dc
{
    private final Object a;
    private final WeakReference b;
    private final Handler c;
    private final l d;
    private boolean e;
    private boolean f;
    
    public k(final db db, final m m, final l d) {
        super("FilterThread");
        this.a = new Object();
        this.b = new WeakReference((T)db);
        this.c = new j(m);
        this.d = d;
    }
    
    public void a(final Object o) {
        if (this.d.a.a(o)) {
            this.c.sendEmptyMessage(-559038737);
        }
    }
    
    @Override
    public void a(final Object o, final ln ln) {
        if (this.d.a.b(o)) {
            this.c.obtainMessage(-791613427, (Object)Pair.create(o, (Object)ln)).sendToTarget();
            return;
        }
        ln.b();
    }
    
    public boolean a() {
        synchronized (this.a) {
            return !this.f && (this.e = true);
        }
    }
    
    public void b() {
        if (this.d.a.a(null)) {
            this.c.sendEmptyMessage(-559038737);
        }
    }
    
    @Override
    public void run() {
        com.twitter.util.d.c();
        Process.setThreadPriority(11);
        while (true) {
            if (!this.d.a.a(this.d.b, 3000)) {
                synchronized (this.a) {
                    if (this.e) {
                        this.e = false;
                        continue;
                    }
                }
                this.f = true;
                // monitorexit(o)
                break;
            }
            final db db;
            synchronized (this.a) {
                this.e = false;
                // monitorexit(this.a)
                db = (db)this.b.get();
                if (db == null) {
                    break;
                }
                final Object a = this.d.a.a();
                if (com.twitter.util.l.a(this.d.b, a)) {
                    continue;
                }
                if ((this.d.b = a) != null) {
                    try {
                        db.a(a, this);
                    }
                    catch (Exception ex) {
                        ErrorReporter.a(ex);
                    }
                    continue;
                }
            }
            db.a();
        }
    }
}
