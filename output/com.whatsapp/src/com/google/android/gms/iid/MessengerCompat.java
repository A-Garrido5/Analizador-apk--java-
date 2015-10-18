// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.iid;

import android.os.Parcel;
import android.os.Message;
import android.os.IBinder;
import android.os.Build$VERSION;
import android.os.Handler;
import android.os.Messenger;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class MessengerCompat implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static int a;
    Messenger zzaxa;
    zzb zzaxb;
    
    static {
        CREATOR = (Parcelable$Creator)new MessengerCompat$1();
    }
    
    public MessengerCompat(final Handler handler) {
        Label_0030: {
            if (Build$VERSION.SDK_INT < 21) {
                break Label_0030;
            }
            try {
                this.zzaxa = new Messenger(handler);
                if (MessengerCompat.a != 0) {
                    this.zzaxb = new MessengerCompat$zza(this, handler);
                }
            }
            catch (ClassCastException ex) {
                throw ex;
            }
        }
    }
    
    public MessengerCompat(final IBinder binder) {
        Label_0030: {
            if (Build$VERSION.SDK_INT < 21) {
                break Label_0030;
            }
            try {
                this.zzaxa = new Messenger(binder);
                if (MessengerCompat.a != 0) {
                    this.zzaxb = zzb$zza.zzbR(binder);
                }
            }
            catch (ClassCastException ex) {
                throw ex;
            }
        }
    }
    
    public static int zzc(final Message message) {
        try {
            if (Build$VERSION.SDK_INT >= 21) {
                return zzd(message);
            }
        }
        catch (ClassCastException ex) {
            throw ex;
        }
        return message.arg2;
    }
    
    private static int zzd(final Message message) {
        return message.sendingUid;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        try {
            return this.getBinder().equals(((MessengerCompat)o).getBinder());
        }
        catch (ClassCastException ex) {
            return false;
        }
    }
    
    public IBinder getBinder() {
        try {
            if (this.zzaxa != null) {
                return this.zzaxa.getBinder();
            }
        }
        catch (ClassCastException ex) {
            throw ex;
        }
        return this.zzaxb.asBinder();
    }
    
    @Override
    public int hashCode() {
        return this.getBinder().hashCode();
    }
    
    public void send(final Message p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/android/gms/iid/MessengerCompat.zzaxa:Landroid/os/Messenger;
        //     4: astore          4
        //     6: aload           4
        //     8: ifnull          25
        //    11: aload_0        
        //    12: getfield        com/google/android/gms/iid/MessengerCompat.zzaxa:Landroid/os/Messenger;
        //    15: aload_1        
        //    16: invokevirtual   android/os/Messenger.send:(Landroid/os/Message;)V
        //    19: getstatic       com/google/android/gms/iid/MessengerCompat.a:I
        //    22: ifeq            42
        //    25: aload_0        
        //    26: getfield        com/google/android/gms/iid/MessengerCompat.zzaxb:Lcom/google/android/gms/iid/zzb;
        //    29: aload_1        
        //    30: invokeinterface com/google/android/gms/iid/zzb.send:(Landroid/os/Message;)V
        //    35: return         
        //    36: astore_2       
        //    37: aload_2        
        //    38: athrow         
        //    39: astore_3       
        //    40: aload_3        
        //    41: athrow         
        //    42: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  0      6      36     39     Ljava/lang/ClassCastException;
        //  11     25     39     42     Ljava/lang/ClassCastException;
        //  25     35     39     42     Ljava/lang/ClassCastException;
        //  37     39     39     42     Ljava/lang/ClassCastException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0025:
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
    
    public void writeToParcel(final Parcel p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/android/gms/iid/MessengerCompat.zzaxa:Landroid/os/Messenger;
        //     4: astore          5
        //     6: aload           5
        //     8: ifnull          28
        //    11: aload_1        
        //    12: aload_0        
        //    13: getfield        com/google/android/gms/iid/MessengerCompat.zzaxa:Landroid/os/Messenger;
        //    16: invokevirtual   android/os/Messenger.getBinder:()Landroid/os/IBinder;
        //    19: invokevirtual   android/os/Parcel.writeStrongBinder:(Landroid/os/IBinder;)V
        //    22: getstatic       com/google/android/gms/iid/MessengerCompat.a:I
        //    25: ifeq            50
        //    28: aload_1        
        //    29: aload_0        
        //    30: getfield        com/google/android/gms/iid/MessengerCompat.zzaxb:Lcom/google/android/gms/iid/zzb;
        //    33: invokeinterface com/google/android/gms/iid/zzb.asBinder:()Landroid/os/IBinder;
        //    38: invokevirtual   android/os/Parcel.writeStrongBinder:(Landroid/os/IBinder;)V
        //    41: return         
        //    42: astore_3       
        //    43: aload_3        
        //    44: athrow         
        //    45: astore          4
        //    47: aload           4
        //    49: athrow         
        //    50: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  0      6      42     45     Ljava/lang/ClassCastException;
        //  11     28     45     50     Ljava/lang/ClassCastException;
        //  28     41     45     50     Ljava/lang/ClassCastException;
        //  43     45     45     50     Ljava/lang/ClassCastException;
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
}
