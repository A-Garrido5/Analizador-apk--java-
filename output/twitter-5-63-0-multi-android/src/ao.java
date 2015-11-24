import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.di;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import java.io.IOException;
import android.content.ServiceConnection;
import android.content.Intent;
import com.google.android.gms.common.e;
import com.google.android.gms.internal.ap;
import android.content.Context;
import com.google.android.gms.internal.dh;
import com.google.android.gms.common.f;

// 
// Decompiled by Procyon v0.5.30
// 

public class ao
{
    f a;
    dh b;
    boolean c;
    Object d;
    aq e;
    final long f;
    private final Context g;
    
    public ao(final Context g, final long f) {
        this.d = new Object();
        ap.a(g);
        this.g = g;
        this.c = false;
        this.f = f;
    }
    
    static f a(final Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            final Context context2 = context;
            e.b(context2);
            final f f = new f();
            final String s = "com.google.android.gms.ads.identifier.service.START";
            final Intent intent = new Intent(s);
            final Intent intent3;
            final Intent intent2 = intent3 = intent;
            final String s2 = "com.google.android.gms";
            intent3.setPackage(s2);
            final Context context3 = context;
            final Intent intent4 = intent2;
            final Object o = f;
            final int n = 1;
            final boolean b = context3.bindService(intent4, (ServiceConnection)o, n);
            if (b) {
                return f;
            }
            throw new IOException("Connection failure");
        }
        catch (PackageManager$NameNotFoundException ex2) {
            throw new GooglePlayServicesNotAvailableException(9);
        }
        try {
            final Context context2 = context;
            e.b(context2);
            final f f = new f();
            final String s = "com.google.android.gms.ads.identifier.service.START";
            final Intent intent = new Intent(s);
            final Intent intent3;
            final Intent intent2 = intent3 = intent;
            final String s2 = "com.google.android.gms";
            intent3.setPackage(s2);
            final Context context3 = context;
            final Intent intent4 = intent2;
            final Object o = f;
            final int n = 1;
            final boolean b = context3.bindService(intent4, (ServiceConnection)o, n);
            if (b) {
                return f;
            }
        }
        catch (GooglePlayServicesNotAvailableException ex) {
            throw new IOException(ex);
        }
        throw new IOException("Connection failure");
    }
    
    static dh a(final Context context, final f f) {
        try {
            return di.a(f.a());
        }
        catch (InterruptedException ex) {
            throw new IOException("Interrupted exception");
        }
    }
    
    public static ap b(final Context context) {
        final ao ao = new ao(context, -1L);
        try {
            ao.a(false);
            return ao.a();
        }
        finally {
            ao.b();
        }
    }
    
    private void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        ao.d:Ljava/lang/Object;
        //     4: astore_1       
        //     5: aload_1        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        ao.e:Laq;
        //    11: ifnull          28
        //    14: aload_0        
        //    15: getfield        ao.e:Laq;
        //    18: invokevirtual   aq.a:()V
        //    21: aload_0        
        //    22: getfield        ao.e:Laq;
        //    25: invokevirtual   aq.join:()V
        //    28: aload_0        
        //    29: getfield        ao.f:J
        //    32: lconst_0       
        //    33: lcmp           
        //    34: ifle            53
        //    37: aload_0        
        //    38: new             Laq;
        //    41: dup            
        //    42: aload_0        
        //    43: aload_0        
        //    44: getfield        ao.f:J
        //    47: invokespecial   aq.<init>:(Lao;J)V
        //    50: putfield        ao.e:Laq;
        //    53: aload_1        
        //    54: monitorexit    
        //    55: return         
        //    56: astore_2       
        //    57: aload_1        
        //    58: monitorexit    
        //    59: aload_2        
        //    60: athrow         
        //    61: astore_3       
        //    62: goto            28
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  7      21     56     61     Any
        //  21     28     61     65     Ljava/lang/InterruptedException;
        //  21     28     56     61     Any
        //  28     53     56     61     Any
        //  53     55     56     61     Any
        //  57     59     56     61     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0028:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public ap a() {
        ap.c("Calling this from your main thread can lead to deadlock");
        // monitorexit(o)
        Label_0102: {
            synchronized (this) {
                if (this.c) {
                    break Label_0102;
                }
                synchronized (this.d) {
                    if (this.e == null || !this.e.b()) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
            }
            try {
                this.a(false);
                if (!this.c) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.");
                }
            }
            catch (Exception ex) {
                throw new IOException("AdvertisingIdClient cannot reconnect.", ex);
            }
        }
        ap.a(this.a);
        ap.a(this.b);
        try {
            final ap ap = new ap(this.b.a(), this.b.a(true));
            // monitorexit(this)
            this.c();
            return ap;
        }
        catch (RemoteException ex2) {
            Log.i("AdvertisingIdClient", "GMS remote exception ", (Throwable)ex2);
            throw new IOException("Remote exception");
        }
    }
    
    protected void a(final boolean b) {
        ap.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.c) {
                this.b();
            }
            this.a = a(this.g);
            this.b = a(this.g, this.a);
            this.c = true;
            if (b) {
                this.c();
            }
        }
    }
    
    public void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             "Calling this from your main thread can lead to deadlock"
        //     2: invokestatic    com/google/android/gms/internal/ap.c:(Ljava/lang/String;)V
        //     5: aload_0        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        ao.g:Landroid/content/Context;
        //    11: ifnull          21
        //    14: aload_0        
        //    15: getfield        ao.a:Lcom/google/android/gms/common/f;
        //    18: ifnonnull       24
        //    21: aload_0        
        //    22: monitorexit    
        //    23: return         
        //    24: aload_0        
        //    25: getfield        ao.c:Z
        //    28: ifeq            42
        //    31: aload_0        
        //    32: getfield        ao.g:Landroid/content/Context;
        //    35: aload_0        
        //    36: getfield        ao.a:Lcom/google/android/gms/common/f;
        //    39: invokevirtual   android/content/Context.unbindService:(Landroid/content/ServiceConnection;)V
        //    42: aload_0        
        //    43: iconst_0       
        //    44: putfield        ao.c:Z
        //    47: aload_0        
        //    48: aconst_null    
        //    49: putfield        ao.b:Lcom/google/android/gms/internal/dh;
        //    52: aload_0        
        //    53: aconst_null    
        //    54: putfield        ao.a:Lcom/google/android/gms/common/f;
        //    57: aload_0        
        //    58: monitorexit    
        //    59: return         
        //    60: astore_1       
        //    61: aload_0        
        //    62: monitorexit    
        //    63: aload_1        
        //    64: athrow         
        //    65: astore_2       
        //    66: ldc             "AdvertisingIdClient"
        //    68: ldc             "AdvertisingIdClient unbindService failed."
        //    70: aload_2        
        //    71: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    74: pop            
        //    75: goto            42
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  7      21     60     65     Any
        //  21     23     60     65     Any
        //  24     42     65     78     Ljava/lang/IllegalArgumentException;
        //  24     42     60     65     Any
        //  42     59     60     65     Any
        //  61     63     60     65     Any
        //  66     75     60     65     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0024:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    protected void finalize() {
        this.b();
        super.finalize();
    }
}
