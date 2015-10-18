// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.media.filters;

import android.graphics.SurfaceTexture;
import android.app.ActivityManager;
import android.view.View$OnLayoutChangeListener;
import android.util.AttributeSet;
import android.content.Context;
import android.view.TextureView$SurfaceTextureListener;
import android.view.TextureView;
import javax.microedition.khronos.opengles.GL10;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

class q extends Thread
{
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private ArrayList p;
    private boolean q;
    private p r;
    private WeakReference s;
    
    q(final WeakReference s) {
        this.p = new ArrayList();
        this.q = true;
        this.k = 0;
        this.l = 0;
        this.n = true;
        this.m = 1;
        this.s = s;
    }
    
    private void j() {
        if (this.i) {
            this.i = false;
            this.r.e();
        }
    }
    
    private void k() {
        if (this.h) {
            this.r.f();
            this.h = false;
            GLTextureView.a.c(this);
        }
    }
    
    private void l() {
        this.r = new p(this.s);
        this.h = false;
        this.i = false;
        int n = 0;
        GL10 gl10 = null;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        Runnable runnable = null;
        int n9 = 0;
        int n10 = 0;
        r e;
        Runnable runnable2;
        int n11 = 0;
        int n12 = 0;
        Runnable runnable3 = null;
        int n13 = 0;
        int n14 = 0;
        int n15 = 0;
        int n16 = 0;
        int n17 = 0;
        int n18 = 0;
        int n19 = 0;
        boolean c;
        int n20;
        GLTextureView glTextureView;
        q q;
        p p;
        q q2;
        boolean b;
        r r;
        int n21 = 0;
        int n22 = 0;
        int n23;
        int k;
        int l;
        int n24;
        int n25;
        int n26;
        int n27;
        r e2;
        GLTextureView glTextureView2;
        int n28;
        GLTextureView glTextureView3;
        GL10 gl11 = null;
        GLTextureView glTextureView4;
        int d;
        GL10 gl12;
        int n29 = 0;
        int n30;
        int n31;
        int n32;
        Label_0058_Outer:Label_1137_Outer:
        while (true) {
            while (true) {
                Label_0261_Outer:Label_0714_Outer:Label_0814_Outer:
                while (true) {
                Label_0889_Outer:
                    while (true) {
                        while (true) {
                        Label_0814:
                            while (true) {
                            Label_0714:
                                while (true) {
                                Label_0525_Outer:
                                    while (true) {
                                        Label_1096: {
                                            while (true) {
                                            Label_0846_Outer:
                                                while (true) {
                                                    Label_1059: {
                                                    Label_0846:
                                                        while (true) {
                                                            while (true) {
                                                                while (true) {
                                                                    Label_0723: {
                                                                        try {
                                                                            while (true) {
                                                                                e = GLTextureView.a;
                                                                                synchronized (e) {
                                                                                    if (this.a) {
                                                                                        // monitorexit(e)
                                                                                        synchronized (GLTextureView.a) {
                                                                                            this.j();
                                                                                            this.k();
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                    if (!this.p.isEmpty()) {
                                                                                        runnable2 = this.p.remove(0);
                                                                                        n11 = n10;
                                                                                        n12 = n9;
                                                                                        runnable3 = runnable2;
                                                                                        n13 = n8;
                                                                                        n14 = n7;
                                                                                        n15 = n6;
                                                                                        n16 = n5;
                                                                                        n17 = n4;
                                                                                        n18 = n3;
                                                                                        n19 = n2;
                                                                                    }
                                                                                    else {
                                                                                        if (this.d == this.c) {
                                                                                            break Label_1096;
                                                                                        }
                                                                                        c = this.c;
                                                                                        this.d = this.c;
                                                                                        GLTextureView.a.notifyAll();
                                                                                        n20 = (c ? 1 : 0);
                                                                                        if (this.j) {
                                                                                            this.j();
                                                                                            this.k();
                                                                                            this.j = false;
                                                                                            n3 = 1;
                                                                                        }
                                                                                        if (n6 != 0) {
                                                                                            this.j();
                                                                                            this.k();
                                                                                            n6 = 0;
                                                                                        }
                                                                                        if (n20 != 0 && this.i) {
                                                                                            this.j();
                                                                                        }
                                                                                        if (n20 != 0 && this.h) {
                                                                                            glTextureView = (GLTextureView)this.s.get();
                                                                                            if (glTextureView == null || !glTextureView.l || GLTextureView.a.a()) {
                                                                                                this.k();
                                                                                            }
                                                                                        }
                                                                                        if (n20 != 0 && GLTextureView.a.b()) {
                                                                                            this.r.f();
                                                                                        }
                                                                                        if (!this.e && !this.g) {
                                                                                            if (this.i) {
                                                                                                this.j();
                                                                                            }
                                                                                            this.g = true;
                                                                                            this.f = false;
                                                                                            GLTextureView.a.notifyAll();
                                                                                        }
                                                                                        if (this.e && this.g) {
                                                                                            this.g = false;
                                                                                            GLTextureView.a.notifyAll();
                                                                                        }
                                                                                        if (n10 != 0) {
                                                                                            n4 = 0;
                                                                                            n10 = 0;
                                                                                            this.o = true;
                                                                                            GLTextureView.a.notifyAll();
                                                                                        }
                                                                                        if (!this.m()) {
                                                                                            break Label_0714;
                                                                                        }
                                                                                        if (!this.h) {
                                                                                            if (n3 != 0) {
                                                                                                n3 = 0;
                                                                                            }
                                                                                            else if (GLTextureView.a.b(this)) {
                                                                                                q = this;
                                                                                                p = q.r;
                                                                                                p.a();
                                                                                                q2 = this;
                                                                                                b = true;
                                                                                                q2.h = b;
                                                                                                n = 1;
                                                                                                r = GLTextureView.a;
                                                                                                r.notifyAll();
                                                                                            }
                                                                                        }
                                                                                        if (!this.h || this.i) {
                                                                                            break Label_0846_Outer;
                                                                                        }
                                                                                        this.i = true;
                                                                                        n8 = 1;
                                                                                        n21 = 1;
                                                                                        n22 = 1;
                                                                                        if (!this.i) {
                                                                                            break Label_0525_Outer;
                                                                                        }
                                                                                        if (!this.q) {
                                                                                            break Label_1059;
                                                                                        }
                                                                                        n23 = 1;
                                                                                        k = this.k;
                                                                                        l = this.l;
                                                                                        n24 = 1;
                                                                                        n25 = 1;
                                                                                        this.q = false;
                                                                                        this.n = false;
                                                                                        GLTextureView.a.notifyAll();
                                                                                        n14 = n22;
                                                                                        n17 = n24;
                                                                                        runnable3 = runnable;
                                                                                        n11 = n10;
                                                                                        n12 = k;
                                                                                        n26 = l;
                                                                                        n13 = n25;
                                                                                        n15 = n6;
                                                                                        n16 = n23;
                                                                                        n18 = n3;
                                                                                        n19 = n26;
                                                                                    }
                                                                                    // monitorexit(e)
                                                                                    if (runnable3 != null) {
                                                                                        runnable3.run();
                                                                                        n2 = n19;
                                                                                        n3 = n18;
                                                                                        n4 = n17;
                                                                                        n5 = n16;
                                                                                        n6 = n15;
                                                                                        n7 = n14;
                                                                                        n8 = n13;
                                                                                        n27 = n11;
                                                                                        n9 = n12;
                                                                                        n10 = n27;
                                                                                        runnable = null;
                                                                                        continue Label_0058_Outer;
                                                                                    }
                                                                                    break Label_0723;
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            e2 = GLTextureView.a;
                                                                            synchronized (e2) {
                                                                                this.j();
                                                                                this.k();
                                                                                // monitorexit(e2)
                                                                                GLTextureView.a.wait();
                                                                                continue Label_0261_Outer;
                                                                                // iftrue(Label_1126:, glTextureView2 == null)
                                                                                // iftrue(Label_1052:, n13 == 0)
                                                                                // iftrue(Label_1046:, n14 == 0)
                                                                                // iftrue(Label_0889:, n == 0)
                                                                                // iftrue(Label_0959:, glTextureView3 == null)
                                                                                // iftrue(Label_1131:, glTextureView4 == null)
                                                                                // iftrue(Label_1120:, this.r.b())
                                                                                // switch([Lcom.strobel.decompiler.ast.Label;@3a2f14f2, d)
                                                                                // iftrue(Label_0930:, n16 == 0)
                                                                            Block_48:
                                                                                while (true) {
                                                                                    Block_46: {
                                                                                        Block_44: {
                                                                                        Label_0959:
                                                                                            while (true) {
                                                                                                Block_41: {
                                                                                                    while (true) {
                                                                                                        while (true) {
                                                                                                            glTextureView2 = (GLTextureView)this.s.get();
                                                                                                            break Block_46;
                                                                                                            break Block_41;
                                                                                                            break Block_44;
                                                                                                            synchronized (GLTextureView.a) {
                                                                                                                this.f = true;
                                                                                                                GLTextureView.a.notifyAll();
                                                                                                                // monitorexit(GLTextureView.e())
                                                                                                                n2 = n19;
                                                                                                                n3 = n18;
                                                                                                                n4 = n17;
                                                                                                                n5 = n16;
                                                                                                                n6 = n15;
                                                                                                                n7 = n14;
                                                                                                                n8 = n13;
                                                                                                                n28 = n11;
                                                                                                                runnable = runnable3;
                                                                                                                n9 = n12;
                                                                                                                n10 = n28;
                                                                                                                continue Label_0058_Outer;
                                                                                                            }
                                                                                                            continue Label_0814;
                                                                                                            glTextureView3.d.a(gl11);
                                                                                                            break Label_0959;
                                                                                                            continue Label_0814_Outer;
                                                                                                        }
                                                                                                        glTextureView3 = (GLTextureView)this.s.get();
                                                                                                        continue Label_0846_Outer;
                                                                                                    }
                                                                                                    glTextureView4 = (GLTextureView)this.s.get();
                                                                                                    break Block_48;
                                                                                                    Label_0996: {
                                                                                                        com.twitter.media.filters.p.a("GLThread", "eglSwapBuffers", d);
                                                                                                    }
                                                                                                    synchronized (GLTextureView.a) {
                                                                                                        this.f = true;
                                                                                                        GLTextureView.a.notifyAll();
                                                                                                    }
                                                                                                }
                                                                                                continue Label_0846_Outer;
                                                                                            }
                                                                                            d = this.r.d();
                                                                                        }
                                                                                        gl12 = (GL10)this.r.c();
                                                                                        GLTextureView.a.a(gl12);
                                                                                        n14 = 0;
                                                                                        gl11 = gl12;
                                                                                        continue Label_0846;
                                                                                    }
                                                                                    glTextureView2.d.a(gl11, this.r.d);
                                                                                    break Label_0814;
                                                                                    continue Label_0889_Outer;
                                                                                }
                                                                                glTextureView4.d.a(gl11, n12, n19);
                                                                            }
                                                                        }
                                                                    }
                                                                    break;
                                                                }
                                                                try {
                                                                    q = this;
                                                                    p = q.r;
                                                                    p.a();
                                                                    q2 = this;
                                                                    b = true;
                                                                    q2.h = b;
                                                                    n = 1;
                                                                    r = GLTextureView.a;
                                                                    r.notifyAll();
                                                                    continue Label_0525_Outer;
                                                                }
                                                                catch (RuntimeException ex) {}
                                                                break;
                                                            }
                                                            Label_1046: {
                                                                gl11 = gl10;
                                                            }
                                                            continue Label_0846;
                                                        }
                                                        Label_1052: {
                                                            n29 = n13;
                                                        }
                                                        continue Label_0814;
                                                    }
                                                    n25 = n8;
                                                    n30 = n9;
                                                    n24 = n4;
                                                    n23 = n21;
                                                    l = n2;
                                                    k = n30;
                                                    continue Label_0814_Outer;
                                                }
                                                n21 = n5;
                                                n22 = n7;
                                                continue Label_0814_Outer;
                                            }
                                        }
                                        n20 = 0;
                                        continue Label_0714_Outer;
                                    }
                                    n7 = n22;
                                    n5 = n21;
                                    continue Label_0714;
                                }
                                Label_1120: {
                                    n29 = 0;
                                }
                                continue Label_0814;
                            }
                            n = 0;
                            continue Label_1137_Outer;
                        }
                        Label_1131: {
                            n16 = 0;
                        }
                        continue Label_0889_Outer;
                    }
                    if (n17 != 0) {
                        n31 = 1;
                    }
                    else {
                        n31 = n11;
                    }
                    runnable = runnable3;
                    gl10 = gl11;
                    n9 = n12;
                    n10 = n31;
                    n32 = n18;
                    n4 = n17;
                    n5 = n16;
                    n6 = n15;
                    n7 = n14;
                    n8 = n29;
                    n2 = n19;
                    n3 = n32;
                    continue Label_0261_Outer;
                }
                Label_1194: {
                    n15 = 1;
                }
                continue;
            }
        }
    }
    
    private boolean m() {
        return !this.d && this.e && !this.f && this.k > 0 && this.l > 0 && (this.n || this.m == 1);
    }
    
    public void a(final int m) {
        if (m < 0 || m > 1) {
            throw new IllegalArgumentException("renderMode");
        }
        synchronized (GLTextureView.a) {
            this.m = m;
            GLTextureView.a.notifyAll();
        }
    }
    
    public void a(final int k, final int l) {
        synchronized (GLTextureView.a) {
            this.k = k;
            this.l = l;
            this.q = true;
            this.n = true;
            this.o = false;
            GLTextureView.a.notifyAll();
            while (!this.b && !this.d && !this.o && this.a()) {
                try {
                    GLTextureView.a.wait();
                }
                catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
    // monitorexit(r)
    
    public boolean a() {
        return this.h && this.i && this.m();
    }
    
    public int b() {
        synchronized (GLTextureView.a) {
            return this.m;
        }
    }
    
    public void c() {
        synchronized (GLTextureView.a) {
            this.n = true;
            GLTextureView.a.notifyAll();
        }
    }
    
    public void d() {
        synchronized (GLTextureView.a) {
            this.e = true;
            GLTextureView.a.notifyAll();
            while (this.g && !this.b) {
                try {
                    GLTextureView.a.wait();
                }
                catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
    // monitorexit(r)
    
    public void e() {
        synchronized (GLTextureView.a) {
            this.e = false;
            GLTextureView.a.notifyAll();
            while (!this.g && !this.b) {
                try {
                    GLTextureView.a.wait();
                }
                catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
    // monitorexit(r)
    
    public void f() {
        synchronized (GLTextureView.a) {
            this.c = true;
            GLTextureView.a.notifyAll();
            while (!this.b && !this.d) {
                try {
                    GLTextureView.a.wait();
                }
                catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
    // monitorexit(r)
    
    public void g() {
        synchronized (GLTextureView.a) {
            this.c = false;
            this.n = true;
            this.o = false;
            GLTextureView.a.notifyAll();
            while (!this.b && this.d && !this.o) {
                try {
                    GLTextureView.a.wait();
                }
                catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
    // monitorexit(r)
    
    public void h() {
        synchronized (GLTextureView.a) {
            this.a = true;
            GLTextureView.a.notifyAll();
            while (!this.b) {
                try {
                    GLTextureView.a.wait();
                }
                catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
    // monitorexit(r)
    
    public void i() {
        this.j = true;
        GLTextureView.a.notifyAll();
    }
    
    @Override
    public void run() {
        this.setName("GLThread " + this.getId());
        try {
            this.l();
        }
        catch (InterruptedException ex) {}
        finally {
            GLTextureView.a.a(this);
        }
    }
}
