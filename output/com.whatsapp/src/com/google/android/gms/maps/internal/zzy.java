// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.os.Build$VERSION;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.zze;
import android.os.RemoteException;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.internal.zzu;
import android.content.Context;

public class zzy
{
    private static Context zzaCM;
    private static zzc zzaCN;
    
    private static Context getRemoteContext(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/maps/internal/zzy.zzaCM:Landroid/content/Context;
        //     3: astore          4
        //     5: aload           4
        //     7: ifnonnull       40
        //    10: invokestatic    com/google/android/gms/maps/internal/zzy.zzvE:()Z
        //    13: istore          5
        //    15: iload           5
        //    17: ifeq            33
        //    20: aload_0        
        //    21: invokevirtual   android/content/Context.getApplicationContext:()Landroid/content/Context;
        //    24: putstatic       com/google/android/gms/maps/internal/zzy.zzaCM:Landroid/content/Context;
        //    27: getstatic       com/google/android/gms/maps/internal/zzm$zza.a:I
        //    30: ifeq            40
        //    33: aload_0        
        //    34: invokestatic    com/google/android/gms/common/GooglePlayServicesUtil.getRemoteContext:(Landroid/content/Context;)Landroid/content/Context;
        //    37: putstatic       com/google/android/gms/maps/internal/zzy.zzaCM:Landroid/content/Context;
        //    40: getstatic       com/google/android/gms/maps/internal/zzy.zzaCM:Landroid/content/Context;
        //    43: areturn        
        //    44: astore_1       
        //    45: aload_1        
        //    46: athrow         
        //    47: astore_2       
        //    48: aload_2        
        //    49: athrow         
        //    50: astore_3       
        //    51: aload_3        
        //    52: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                      
        //  -----  -----  -----  -----  ----------------------------------------------------------
        //  0      5      44     47     Lcom/google/android/gms/maps/model/RuntimeRemoteException;
        //  10     15     47     50     Lcom/google/android/gms/maps/model/RuntimeRemoteException;
        //  20     33     50     53     Lcom/google/android/gms/maps/model/RuntimeRemoteException;
        //  33     40     50     53     Lcom/google/android/gms/maps/model/RuntimeRemoteException;
        //  45     47     47     50     Lcom/google/android/gms/maps/model/RuntimeRemoteException;
        //  48     50     50     53     Lcom/google/android/gms/maps/model/RuntimeRemoteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 27, Size: 27
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
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
    
    private static Object zza(final ClassLoader classLoader, final String s) {
        try {
            return zzc(((ClassLoader)zzu.zzu(classLoader)).loadClass(s));
        }
        catch (ClassNotFoundException ex) {
            throw new IllegalStateException("Unable to find dynamic class " + s);
        }
    }
    
    private static zzc zzaA(final Context context) {
        if (zzvE()) {
            Log.i(zzy.class.getSimpleName(), "Making Creator statically");
            return (zzc)zzc(zzvF());
        }
        Log.i(zzy.class.getSimpleName(), "Making Creator dynamically");
        return zzc$zza.zzcg((IBinder)zza(getRemoteContext(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
    }
    
    public static zzc zzay(final Context context) {
        try {
            zzu.zzu(context);
            if (zzy.zzaCN != null) {
                return zzy.zzaCN;
            }
        }
        catch (RemoteException ex) {
            throw ex;
        }
        zzaz(context);
        zzy.zzaCN = zzaA(context);
        try {
            zzy.zzaCN.zzd(zze.zzw(getRemoteContext(context).getResources()), GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            return zzy.zzaCN;
        }
        catch (RemoteException ex2) {
            throw new RuntimeRemoteException(ex2);
        }
    }
    
    private static void zzaz(final Context context) {
        final int googlePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        switch (googlePlayServicesAvailable) {
            default: {
                throw new GooglePlayServicesNotAvailableException(googlePlayServicesAvailable);
            }
            case 0: {}
        }
    }
    
    private static Object zzc(final Class clazz) {
        try {
            return clazz.newInstance();
        }
        catch (InstantiationException ex) {
            throw new IllegalStateException("Unable to instantiate the dynamic class " + clazz.getName());
        }
        catch (IllegalAccessException ex2) {
            throw new IllegalStateException("Unable to call the default constructor of " + clazz.getName());
        }
    }
    
    public static boolean zzvE() {
        return false;
    }
    
    private static Class zzvF() {
        try {
            try {
                if (Build$VERSION.SDK_INT < 15) {
                    return Class.forName("com.google.android.gms.maps.internal.CreatorImplGmm6");
                }
            }
            catch (RuntimeRemoteException ex) {
                throw ex;
            }
            return Class.forName("com.google.android.gms.maps.internal.CreatorImpl");
        }
        catch (ClassNotFoundException ex2) {
            throw new RuntimeException(ex2);
        }
    }
}
