// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.nio.Buffer;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

class aox
{
    private static final String[] z;
    private int a;
    private final float[] b;
    private int c;
    private FloatBuffer d;
    private float[] e;
    private int f;
    private int g;
    private int h;
    private int i;
    private float[] j;
    
    static {
        final String[] z2 = new String[39];
        String s = "y\u00145\u0015P\u007f\f\u00134]\u007f\u001c\u0013\u0015\u0015j\u0001\u0006\u0002\b";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1007:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '5';
                        break;
                    }
                    case 0: {
                        c2 = '\u001e';
                        break;
                    }
                    case 1: {
                        c2 = 'x';
                        break;
                    }
                    case 2: {
                        c2 = 'v';
                        break;
                    }
                    case 3: {
                        c2 = 'g';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "J\u001d\u000e\u0013@l\u001d$\u0002[z\u001d\u0004";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "J\u001d\u000e\u0013@l\u001d$\u0002[z\u001d\u0004";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "]\u0017\u0003\u000bQ>\u0016\u0019\u0013\u0015}\u0017\u001b\u0017\\r\u001dV\u0014]\u007f\u001c\u0013\u0015\u0015";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "$X\u0011\u000bpl\n\u0019\u0015\u0015";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "$X\u0011\u000bpl\n\u0019\u0015\u0015";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "J\u001d\u000e\u0013@l\u001d$\u0002[z\u001d\u0004";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "J\u001d\u000e\u0013@l\u001d$\u0002[z\u001d\u0004";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "]\u0017\u0003\u000bQ>\u0016\u0019\u0013\u0015r\u0011\u0018\f\u0015n\n\u0019\u0000G\u007f\u0015LG";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "y\u00147\u0013A\u007f\u001b\u001e4]\u007f\u001c\u0013\u0015";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "]\u0017\u0003\u000bQ>\u0016\u0019\u0013\u0015}\n\u0013\u0006A{X\u0006\u0015Zy\n\u0017\n";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "y\u00145\u0015P\u007f\f\u00137Gq\u001f\u0004\u0006X";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "J\u001d\u000e\u0013@l\u001d$\u0002[z\u001d\u0004";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "J\u001d\u000e\u0013@l\u001d$\u0002[z\u001d\u0004";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "y\u00147\u0013A\u007f\u001b\u001e4]\u007f\u001c\u0013\u0015";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "y\u0014#\u0014PN\n\u0019\u0000G\u007f\u0015";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "y\u0014 \u0002Gj\u001d\u000e&Aj\n\u001f\u0005eq\u0011\u0018\u0013PlX\u001b\u0006a{\u0000\u0002\u0012G{0\u0017\tQr\u001d";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "y\u00143\tT|\u0014\u00131Pl\f\u0013\u001ftj\f\u0004\u000eW_\n\u0004\u0006L>\u0015\u00173Pf\f\u0003\u0015PV\u0019\u0018\u0003Y{";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "y\u00143\tT|\u0014\u00131Pl\f\u0013\u001ftj\f\u0004\u000eW_\n\u0004\u0006L>\u0015\u00177Zm\u0011\u0002\u000eZp0\u0017\tQr\u001d";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "y\u0014 \u0002Gj\u001d\u000e&Aj\n\u001f\u0005eq\u0011\u0018\u0013PlX\u001b\u0006eq\u000b\u001f\u0013\\q\u0016";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "y\u00142\u0015Ti9\u0004\u0015Tg\u000b";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "q\u00162\u0015Ti>\u0004\u0006X{X\u0005\u0013Tl\f";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "y\u0014\"\u0002MN\u0019\u0004\u0006X{\f\u0013\u0015";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "]\u0017\u0003\u000bQ>\u0016\u0019\u0013\u0015y\u001d\u0002GTj\f\u0004\u000eW>\u0014\u0019\u0004Tj\u0011\u0019\t\u0015x\u0017\u0004GTN\u0017\u0005\u000eAw\u0017\u0018";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u007f,\u0013\u001fAk\n\u0013$Zq\n\u0012";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "y\u00144\u000e[z,\u0013\u001fAk\n\u0013GXJ\u001d\u000e\u0013@l\u001d?#";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "=\u001d\u000e\u0013Pp\u000b\u001f\b[>?:8z[+)\"rR'\u001f\nTy\u001d)\u0002Mj\u001d\u0004\tTrXLGG{\t\u0003\u000eG{r\u0006\u0015P}\u0011\u0005\u000eZpX\u001b\u0002Qw\r\u001b\u0017\u0015x\u0014\u0019\u0006A%r\u0000\u0006Gg\u0011\u0018\u0000\u0015h\u001d\u0015U\u0015h,\u0013\u001fAk\n\u0013$Zq\n\u0012\\?k\u0016\u001f\u0001Zl\u0015V\u0014Ts\b\u001a\u0002G[\u0000\u0002\u0002Gp\u0019\u001a(pMX\u00053Pf\f\u0003\u0015P%r\u0000\b\\zX\u001b\u0006\\pP_GN\u0014XV\u0000YA>\u0004\u0006R]\u0017\u001a\bG>EV\u0013Pf\f\u0003\u0015P,<^\u0014a{\u0000\u0002\u0012G{TV\u0011a{\u0000\u0002\u0012G{;\u0019\bGzQMmH\u0014";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "x\u0019\u001f\u000bPzX\u0015\u0015P\u007f\f\u001f\tR>\b\u0004\bRl\u0019\u001b";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "]\u0017\u0003\u000bQ>\u0016\u0019\u0013\u0015y\u001d\u0002GTj\f\u0004\u000eW>\u0014\u0019\u0004Tj\u0011\u0019\t\u0015x\u0017\u0004G@S.&*Tj\n\u001f\u001f";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "y\u00141\u0002A_\f\u0002\u0015\\|4\u0019\u0004Tj\u0011\u0019\t\u0015\u007f(\u0019\u0014\\j\u0011\u0019\t";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    s = "\u007f(\u0019\u0014\\j\u0011\u0019\t";
                    n = 29;
                    n2 = 30;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    array = z2;
                    s = "]\u0017\u0003\u000bQ>\u0016\u0019\u0013\u0015y\u001d\u0002GTj\f\u0004\u000eW>\u0014\u0019\u0004Tj\u0011\u0019\t\u0015x\u0017\u0004G@M,;\u0006Al\u0011\u000e";
                    n = 30;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "y\u00141\u0002A_\f\u0002\u0015\\|4\u0019\u0004Tj\u0011\u0019\t\u0015\u007f,\u0013\u001fAk\n\u0013$Zq\n\u0012";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "k+\"*Tj\n\u001f\u001f";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "k\u0016\u001f\u0001Zl\u0015V\nTjLV\u0012xH(;\u0006Al\u0011\u000e\\?k\u0016\u001f\u0001Zl\u0015V\nTjLV\u0012fJ5\u0017\u0013Gw\u0000MmTj\f\u0004\u000eWk\f\u0013GC{\u001bBGTN\u0017\u0005\u000eAw\u0017\u0018\\?\u007f\f\u0002\u0015\\|\r\u0002\u0002\u0015h\u001d\u0015S\u0015\u007f,\u0013\u001fAk\n\u0013$Zq\n\u0012\\?h\u0019\u0004\u001e\\p\u001fV\u0011P}JV\u0011a{\u0000\u0002\u0012G{;\u0019\bGzC|\u0011Zw\u001cV\nTw\u0016^N\u0015erVGRr'&\bFw\f\u001f\b[>EV\u0012xH(;\u0006Al\u0011\u000eG\u001f>\u0019&\bFw\f\u001f\b[%rVGCJ\u001d\u000e\u0013@l\u001d5\bZl\u001cVZ\u00156\r%3x\u007f\f\u0004\u000eM>RV\u0006a{\u0000\u0002\u0012G{;\u0019\bGzQX\u001fL%r\u000bm";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "y\u00141\u0002AK\u0016\u001f\u0001Zl\u0015:\bV\u007f\f\u001f\b[>\r;1eS\u0019\u0002\u0015\\f";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "]\u0017\u0003\u000bQ>\u0016\u0019\u0013\u0015y\u001d\u0002GTj\f\u0004\u000eW>\u0014\u0019\u0004Tj\u0011\u0019\t\u0015x\u0017\u0004GTJ\u001d\u000e\u0013@l\u001d5\bZl\u001c";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "y\u00141\u0002AK\u0016\u001f\u0001Zl\u0015:\bV\u007f\f\u001f\b[>\r%3x\u007f\f\u0004\u000eM";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "k5 7x\u007f\f\u0004\u000eM";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    break Label_1007;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public aox() {
        this.b = new float[] { -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f };
        this.e = new float[16];
        this.j = new float[16];
        this.a = -12345;
        this.d = ByteBuffer.allocateDirect(4 * this.b.length).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.d.put(this.b).position(0);
        Matrix.setIdentityM(this.j, 0);
    }
    
    private int a(final int n, final String s) {
        final int glCreateShader = GLES20.glCreateShader(n);
        this.a(aox.z[0] + n);
        GLES20.glShaderSource(glCreateShader, s);
        GLES20.glCompileShader(glCreateShader);
        final int[] array = { 0 };
        GLES20.glGetShaderiv(glCreateShader, 35713, array, 0);
        if (array[0] == 0) {
            Log.e(aox.z[1], aox.z[3] + n + ":");
            Log.e(aox.z[2], " " + GLES20.glGetShaderInfoLog(glCreateShader));
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }
    
    private int a(final String s, final String s2) {
        final int a = this.a(35633, s);
        if (a != 0) {
            final int a2 = this.a(35632, s2);
            if (a2 != 0) {
                final int glCreateProgram = GLES20.glCreateProgram();
                try {
                    this.a(aox.z[11]);
                    if (glCreateProgram == 0) {
                        Log.e(aox.z[13], aox.z[10]);
                    }
                    GLES20.glAttachShader(glCreateProgram, a);
                    this.a(aox.z[9]);
                    GLES20.glAttachShader(glCreateProgram, a2);
                    this.a(aox.z[14]);
                    GLES20.glLinkProgram(glCreateProgram);
                    final int[] array = { 0 };
                    GLES20.glGetProgramiv(glCreateProgram, 35714, array, 0);
                    if (array[0] != 1) {
                        Log.e(aox.z[12], aox.z[8]);
                        Log.e(aox.z[7], GLES20.glGetProgramInfoLog(glCreateProgram));
                        GLES20.glDeleteProgram(glCreateProgram);
                        return 0;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                return glCreateProgram;
            }
        }
        return 0;
    }
    
    public void a() {
        try {
            this.f = this.a(aox.z[34], aox.z[26]);
            if (this.f == 0) {
                throw new RuntimeException(aox.z[27]);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        try {
            this.h = GLES20.glGetAttribLocation(this.f, aox.z[30]);
            this.a(aox.z[29]);
            if (this.h == -1) {
                throw new RuntimeException(aox.z[23]);
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        try {
            this.c = GLES20.glGetAttribLocation(this.f, aox.z[24]);
            this.a(aox.z[32]);
            if (this.c == -1) {
                throw new RuntimeException(aox.z[36]);
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        try {
            this.g = GLES20.glGetUniformLocation(this.f, aox.z[38]);
            this.a(aox.z[35]);
            if (this.g == -1) {
                throw new RuntimeException(aox.z[28]);
            }
        }
        catch (RuntimeException ex4) {
            throw ex4;
        }
        try {
            this.i = GLES20.glGetUniformLocation(this.f, aox.z[33]);
            this.a(aox.z[37]);
            if (this.i == -1) {
                throw new RuntimeException(aox.z[31]);
            }
        }
        catch (RuntimeException ex5) {
            throw ex5;
        }
        final int[] array = { 0 };
        GLES20.glGenTextures(1, array, 0);
        GLES20.glBindTexture(36197, this.a = array[0]);
        this.a(aox.z[25]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        this.a(aox.z[22]);
    }
    
    public void a(final SurfaceTexture surfaceTexture) {
        this.a(aox.z[21]);
        surfaceTexture.getTransformMatrix(this.j);
        GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.f);
        this.a(aox.z[15]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.a);
        this.d.position(0);
        GLES20.glVertexAttribPointer(this.h, 3, 5126, false, 20, (Buffer)this.d);
        this.a(aox.z[19]);
        GLES20.glEnableVertexAttribArray(this.h);
        this.a(aox.z[18]);
        this.d.position(3);
        GLES20.glVertexAttribPointer(this.c, 2, 5126, false, 20, (Buffer)this.d);
        this.a(aox.z[16]);
        GLES20.glEnableVertexAttribArray(this.c);
        this.a(aox.z[17]);
        Matrix.setIdentityM(this.e, 0);
        GLES20.glUniformMatrix4fv(this.g, 1, false, this.e, 0);
        GLES20.glUniformMatrix4fv(this.i, 1, false, this.j, 0);
        GLES20.glDrawArrays(5, 0, 4);
        this.a(aox.z[20]);
        GLES20.glFinish();
    }
    
    public void a(final String s) {
        final int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            try {
                Log.e(aox.z[6], s + aox.z[4] + glGetError);
                throw new RuntimeException(s + aox.z[5] + glGetError);
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
    }
    
    public int b() {
        return this.a;
    }
}
