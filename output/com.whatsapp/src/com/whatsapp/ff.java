// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.util.Log;
import javax.microedition.khronos.egl.EGLConfig;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;

class ff implements SurfaceTexture$OnFrameAvailableListener
{
    private static final String[] z;
    private EGLDisplay a;
    private EGLContext b;
    private boolean c;
    private EGLSurface d;
    private Object e;
    private aox f;
    private EGL10 g;
    private Surface h;
    private SurfaceTexture i;
    
    static {
        final String[] z2 = new String[15];
        String s = "+a0\u001e2#f4\u001e6*F \u0013:fF.\r:'C;_,#Sn_94F/\u001a\u007f%H7\u0013;fE'_;4H2\u000f:\"";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0407:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '_';
                        break;
                    }
                    case 0: {
                        c2 = 'F';
                        break;
                    }
                    case 1: {
                        c2 = '\'';
                        break;
                    }
                    case 2: {
                        c2 = 'B';
                        break;
                    }
                    case 3: {
                        c2 = '\u007f';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0015R0\u0019>%Bb\u0019-'J'_('N6_+/J'\u001b\u007f)R6";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "$B$\u0010-#\u00077\u000f;'S'+:>n/\u001e8#";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "(H6_<)I$\u001683U'\u001b\u007f H0_2'L'<*4U'\u0011+";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "$B$\u0010-#\u0007/\u001e4#d7\r-#I6";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "#@.2>-B\u0001\n-4B,\u000b\u007f F+\u0013:\"";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\tR6\u000f*2t7\r9'D'";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0003`\u000e_:4U-\r\u007f#I!\u0010*(S'\r:\"\u0007j\f:#\u0007.\u00108o";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "|\u0007\u00078\u0013fB0\r04\u001dbO'";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "3I#\u001d3#\u00076\u0010\u007f N,\u001b\u007f\u0014`\u0000Gg~\f2\u001d* A'\r\u007f\u0003`\u000e_<)I$\u00168";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "#@.<-#F6\u001a\u000f$R$\u0019:4t7\r9'D'";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "3I#\u001d3#\u00076\u0010\u007f/I+\u000b6'K+\u0005:fb\u00053nv";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "(R.\u0013\u007f%H,\u000b:>S";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "#@.<-#F6\u001a\u001c)I6\u001a'2";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "5R0\u0019>%Bb\b>5\u0007,\n3*";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    break Label_0407;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ff() {
        this.e = new Object();
        this.d();
    }
    
    public ff(final int n, final int n2) {
        this.e = new Object();
        Label_0034: {
            if (n > 0) {
                if (n2 > 0) {
                    break Label_0034;
                }
            }
            try {
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        this.a(n, n2);
        this.b();
        this.d();
    }
    
    private void a(final int n, final int n2) {
        try {
            this.g = (EGL10)EGLContext.getEGL();
            this.a = this.g.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            if (!this.g.eglInitialize(this.a, (int[])null)) {
                throw new RuntimeException(ff.z[11]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        final int[] array = { 12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344 };
        final EGLConfig[] array2 = { null };
        final int[] array3 = { 0 };
        try {
            if (!this.g.eglChooseConfig(this.a, array, array2, 1, array3)) {
                throw new RuntimeException(ff.z[9]);
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        final int[] array4 = { 12440, 2, 12344 };
        try {
            this.b = this.g.eglCreateContext(this.a, array2[0], EGL10.EGL_NO_CONTEXT, array4);
            this.a(ff.z[13]);
            if (this.b == null) {
                throw new RuntimeException(ff.z[12]);
            }
        }
        catch (IllegalArgumentException ex3) {
            throw ex3;
        }
        final int[] array5 = { 12375, n, 12374, n2, 12344 };
        try {
            this.d = this.g.eglCreatePbufferSurface(this.a, array2[0], array5);
            this.a(ff.z[10]);
            if (this.d == null) {
                throw new RuntimeException(ff.z[14]);
            }
        }
        catch (IllegalArgumentException ex4) {
            throw ex4;
        }
    }
    
    private void a(final String s) {
        final boolean i = App.I;
        boolean b = false;
        do {
            final int eglGetError = this.g.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            Log.e(ff.z[6], s + ff.z[8] + Integer.toHexString(eglGetError));
            b = true;
        } while (!i);
        if (b) {
            try {
                throw new RuntimeException(ff.z[7]);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    private void d() {
        (this.f = new aox()).a();
        (this.i = new SurfaceTexture(this.f.b())).setOnFrameAvailableListener((SurfaceTexture$OnFrameAvailableListener)this);
        this.h = new Surface(this.i);
    }
    
    public void a() {
        this.f.a(this.i);
    }
    
    public void b() {
        try {
            if (this.g == null) {
                throw new RuntimeException(ff.z[3]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            this.a(ff.z[4]);
            if (!this.g.eglMakeCurrent(this.a, this.d, this.d, this.b)) {
                throw new RuntimeException(ff.z[5]);
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
    }
    
    public void c() {
        final Object e = this.e;
        // monitorenter(e)
        try {
            while (!this.c) {
                try {
                    this.e.wait(500L);
                    if (!this.c) {
                        throw new RuntimeException(ff.z[1]);
                    }
                    continue;
                }
                catch (IllegalArgumentException ex) {
                    try {
                        throw ex;
                    }
                    catch (InterruptedException ex2) {
                        throw new RuntimeException(ex2);
                    }
                    finally {
                    }
                    // monitorexit(e)
                }
                catch (InterruptedException ex3) {}
            }
        }
        finally {}
        this.c = false;
        // monitorexit(e)
        this.f.a(ff.z[2]);
        this.i.updateTexImage();
    }
    
    public Surface e() {
        return this.h;
    }
    
    public void onFrameAvailable(final SurfaceTexture surfaceTexture) {
        synchronized (this.e) {
            if (this.c) {
                throw new RuntimeException(ff.z[0]);
            }
        }
        this.c = true;
        this.e.notifyAll();
    }
    // monitorexit(o)
}
