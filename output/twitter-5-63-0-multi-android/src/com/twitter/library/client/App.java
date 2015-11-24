// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import org.apache.http.impl.client.DefaultHttpClient;
import android.util.Log;
import android.os.StrictMode$VmPolicy$Builder;
import android.os.StrictMode$ThreadPolicy$Builder;
import android.os.Looper;
import com.twitter.config.AppFlavor;
import com.twitter.config.a;
import android.os.StrictMode;
import android.os.AsyncTask;
import android.os.Build$VERSION;
import android.os.StrictMode$VmPolicy;
import android.os.StrictMode$ThreadPolicy;
import android.app.Application;

public abstract class App extends Application
{
    private static long a;
    private static String b;
    private static StrictMode$ThreadPolicy c;
    private static StrictMode$VmPolicy d;
    
    static {
        App.b = "com.twitter.android";
        App.c = StrictMode$ThreadPolicy.LAX;
        App.d = StrictMode$VmPolicy.LAX;
        if (Build$VERSION.SDK_INT < 16) {
            AsyncTask.class.getClassLoader();
        }
    }
    
    public static String a(final String s) {
        return i() + s;
    }
    
    public static void a(final boolean b) {
        if (a()) {
            StrictMode$VmPolicy vmPolicy;
            if (b) {
                vmPolicy = App.d;
            }
            else {
                vmPolicy = StrictMode$VmPolicy.LAX;
            }
            StrictMode.setVmPolicy(vmPolicy);
        }
    }
    
    public static boolean a() {
        return com.twitter.config.a.n().a();
    }
    
    public static void b(final String b) {
        App.b = b;
    }
    
    public static boolean b() {
        return com.twitter.config.a.n().b();
    }
    
    public static boolean c() {
        return com.twitter.config.a.n().p();
    }
    
    public static boolean d() {
        return com.twitter.config.a.n().c();
    }
    
    public static boolean e() {
        return com.twitter.config.a.n().d();
    }
    
    public static boolean f() {
        return com.twitter.config.a.n().q();
    }
    
    public static boolean g() {
        return com.twitter.config.a.n().e();
    }
    
    public static long h() {
        return com.twitter.config.a.n().f();
    }
    
    public static String i() {
        if (com.twitter.config.a.o()) {
            return com.twitter.config.a.n().g();
        }
        return App.b;
    }
    
    public static String j() {
        return com.twitter.config.a.n().h();
    }
    
    public static int k() {
        return com.twitter.config.a.n().i();
    }
    
    public static boolean l() {
        return com.twitter.config.a.o() && com.twitter.config.a.n().j();
    }
    
    public static boolean m() {
        return com.twitter.config.a.n().k();
    }
    
    public static boolean n() {
        return com.twitter.config.a.n().l();
    }
    
    public static AppFlavor o() {
        return com.twitter.config.a.n().m();
    }
    
    public static long p() {
        return App.a;
    }
    
    protected static void q() {
        if (a()) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                final StrictMode$ThreadPolicy$Builder strictMode$ThreadPolicy$Builder = new StrictMode$ThreadPolicy$Builder();
                strictMode$ThreadPolicy$Builder.detectCustomSlowCalls();
                strictMode$ThreadPolicy$Builder.detectNetwork();
                strictMode$ThreadPolicy$Builder.penaltyDeath();
                App.c = strictMode$ThreadPolicy$Builder.penaltyLog().build();
                final StrictMode$VmPolicy$Builder strictMode$VmPolicy$Builder = new StrictMode$VmPolicy$Builder();
                strictMode$VmPolicy$Builder.detectLeakedClosableObjects();
                strictMode$VmPolicy$Builder.detectLeakedSqlLiteObjects();
                strictMode$VmPolicy$Builder.penaltyDeath();
                App.d = strictMode$VmPolicy$Builder.penaltyLog().build();
                StrictMode.setThreadPolicy(App.c);
                StrictMode.setVmPolicy(App.d);
                return;
            }
            Log.e("App", "Strict Mode can only be started on UI thread!");
        }
    }
    
    public void onCreate() {
        super.onCreate();
        new DefaultHttpClient();
        App.a = System.currentTimeMillis();
    }
}
