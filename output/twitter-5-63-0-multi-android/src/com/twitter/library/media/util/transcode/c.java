// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util.transcode;

import java.nio.Buffer;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

class c
{
    private final float[] a;
    private FloatBuffer b;
    private float[] c;
    private float[] d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    
    public c() {
        this.a = new float[] { -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f };
        this.c = new float[16];
        this.d = new float[16];
        this.f = -12345;
        this.b = ByteBuffer.allocateDirect(4 * this.a.length).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.b.put(this.a).position(0);
        Matrix.setIdentityM(this.d, 0);
    }
    
    private int a(final int n, final String s) {
        final int glCreateShader = GLES20.glCreateShader(n);
        this.b("glCreateShader type=" + n);
        GLES20.glShaderSource(glCreateShader, s);
        GLES20.glCompileShader(glCreateShader);
        final int[] array = { 0 };
        GLES20.glGetShaderiv(glCreateShader, 35713, array, 0);
        if (array[0] == 0) {
            Log.e("TextureRender", "Could not compile shader " + n + ": " + GLES20.glGetShaderInfoLog(glCreateShader));
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
                this.b("glCreateProgram");
                if (glCreateProgram == 0) {
                    Log.e("TextureRender", "Could not create program");
                }
                GLES20.glAttachShader(glCreateProgram, a);
                this.b("glAttachShader");
                GLES20.glAttachShader(glCreateProgram, a2);
                this.b("glAttachShader");
                GLES20.glLinkProgram(glCreateProgram);
                final int[] array = { 0 };
                GLES20.glGetProgramiv(glCreateProgram, 35714, array, 0);
                if (array[0] != 1) {
                    Log.e("TextureRender", "Could not link program: ");
                    Log.e("TextureRender", GLES20.glGetProgramInfoLog(glCreateProgram));
                    GLES20.glDeleteProgram(glCreateProgram);
                    return 0;
                }
                return glCreateProgram;
            }
        }
        return 0;
    }
    
    public int a() {
        return this.f;
    }
    
    public void a(final SurfaceTexture surfaceTexture, final int n) {
        this.b("onDrawFrame start");
        surfaceTexture.getTransformMatrix(this.d);
        GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.e);
        this.b("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f);
        this.b.position(0);
        GLES20.glVertexAttribPointer(this.i, 3, 5126, false, 20, (Buffer)this.b);
        this.b("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.i);
        this.b("glEnableVertexAttribArray mPositionHandle");
        this.b.position(3);
        GLES20.glVertexAttribPointer(this.j, 2, 5126, false, 20, (Buffer)this.b);
        this.b("glVertexAttribPointer mTextureHandle");
        GLES20.glEnableVertexAttribArray(this.j);
        this.b("glEnableVertexAttribArray mTextureHandle");
        Matrix.setIdentityM(this.c, 0);
        Matrix.rotateM(this.c, 0, (float)(360 - n), 0.0f, 0.0f, 1.0f);
        GLES20.glUniformMatrix4fv(this.g, 1, false, this.c, 0);
        GLES20.glUniformMatrix4fv(this.h, 1, false, this.d, 0);
        GLES20.glDrawArrays(5, 0, 4);
        this.b("glDrawArrays");
        GLES20.glFinish();
    }
    
    public void a(final String s) {
        GLES20.glDeleteProgram(this.e);
        this.e = this.a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", s);
        if (this.e == 0) {
            throw new RuntimeException("failed creating program");
        }
    }
    
    public void b() {
        this.e = this.a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        if (this.e == 0) {
            throw new RuntimeException("failed creating program");
        }
        this.i = GLES20.glGetAttribLocation(this.e, "aPosition");
        this.b("glGetAttribLocation aPosition");
        if (this.i == -1) {
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        this.j = GLES20.glGetAttribLocation(this.e, "aTextureCoord");
        this.b("glGetAttribLocation aTextureCoord");
        if (this.j == -1) {
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        this.g = GLES20.glGetUniformLocation(this.e, "uMVPMatrix");
        this.b("glGetUniformLocation uMVPMatrix");
        if (this.g == -1) {
            throw new RuntimeException("Could not get attrib location for uMVPMatrix");
        }
        this.h = GLES20.glGetUniformLocation(this.e, "uSTMatrix");
        this.b("glGetUniformLocation uSTMatrix");
        if (this.h == -1) {
            throw new RuntimeException("Could not get attrib location for uSTMatrix");
        }
        final int[] array = { 0 };
        GLES20.glGenTextures(1, array, 0);
        GLES20.glBindTexture(36197, this.f = array[0]);
        this.b("glBindTexture mTextureID");
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        this.b("glTexParameter");
    }
    
    public void b(final String s) {
        final int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e("TextureRender", s + ": glError " + glGetError);
            throw new RuntimeException(s + ": glError " + glGetError);
        }
    }
}
