// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.data;

import android.os.Parcel;
import android.database.CursorWindow;
import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class DataHolder implements SafeParcelable
{
    public static final zze CREATOR;
    private static final DataHolder$zza zzYE;
    boolean mClosed;
    private final int zzCY;
    private final int zzTS;
    int[] zzYA;
    int zzYB;
    private Object zzYC;
    private boolean zzYD;
    private final String[] zzYw;
    Bundle zzYx;
    private final CursorWindow[] zzYy;
    private final Bundle zzYz;
    
    static {
        CREATOR = new zze();
        zzYE = new DataHolder$1(new String[0], null);
    }
    
    DataHolder(final int zzCY, final String[] zzYw, final CursorWindow[] zzYy, final int zzTS, final Bundle zzYz) {
        this.mClosed = false;
        this.zzYD = true;
        this.zzCY = zzCY;
        this.zzYw = zzYw;
        this.zzYy = zzYy;
        this.zzTS = zzTS;
        this.zzYz = zzYz;
    }
    
    public void close() {
        final int a = DataHolder$zza.a;
        synchronized (this) {
            if (!this.mClosed) {
                this.mClosed = true;
                int i = 0;
                while (i < this.zzYy.length) {
                    this.zzYy[i].close();
                    ++i;
                    if (a != 0) {
                        break;
                    }
                }
            }
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    protected void finalize() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/android/gms/common/data/DataHolder.zzYD:Z
        //     4: ifeq            104
        //     7: aload_0        
        //     8: getfield        com/google/android/gms/common/data/DataHolder.zzYy:[Landroid/database/CursorWindow;
        //    11: arraylength    
        //    12: istore          6
        //    14: iload           6
        //    16: ifle            104
        //    19: aload_0        
        //    20: invokevirtual   com/google/android/gms/common/data/DataHolder.isClosed:()Z
        //    23: istore          7
        //    25: iload           7
        //    27: ifne            104
        //    30: aload_0        
        //    31: getfield        com/google/android/gms/common/data/DataHolder.zzYC:Ljava/lang/Object;
        //    34: astore          8
        //    36: aload           8
        //    38: ifnonnull       132
        //    41: new             Ljava/lang/StringBuilder;
        //    44: dup            
        //    45: invokespecial   java/lang/StringBuilder.<init>:()V
        //    48: ldc             "internal object: "
        //    50: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    53: aload_0        
        //    54: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    57: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    60: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    63: astore          12
        //    65: aload           12
        //    67: astore          10
        //    69: ldc             "DataBuffer"
        //    71: new             Ljava/lang/StringBuilder;
        //    74: dup            
        //    75: invokespecial   java/lang/StringBuilder.<init>:()V
        //    78: ldc             "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. ("
        //    80: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    83: aload           10
        //    85: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    88: ldc             ")"
        //    90: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    93: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    96: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    99: pop            
        //   100: aload_0        
        //   101: invokevirtual   com/google/android/gms/common/data/DataHolder.close:()V
        //   104: aload_0        
        //   105: invokespecial   java/lang/Object.finalize:()V
        //   108: return         
        //   109: astore_2       
        //   110: aload_2        
        //   111: athrow         
        //   112: astore_3       
        //   113: aload_3        
        //   114: athrow         
        //   115: astore          4
        //   117: aload           4
        //   119: athrow         
        //   120: astore          5
        //   122: aload           5
        //   124: athrow         
        //   125: astore_1       
        //   126: aload_0        
        //   127: invokespecial   java/lang/Object.finalize:()V
        //   130: aload_1        
        //   131: athrow         
        //   132: aload_0        
        //   133: getfield        com/google/android/gms/common/data/DataHolder.zzYC:Ljava/lang/Object;
        //   136: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   139: astore          9
        //   141: aload           9
        //   143: astore          10
        //   145: goto            69
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                               
        //  -----  -----  -----  -----  ---------------------------------------------------
        //  0      14     109    112    Lcom/google/android/gms/common/data/DataHolder$zzb;
        //  0      14     125    132    Any
        //  19     25     112    115    Lcom/google/android/gms/common/data/DataHolder$zzb;
        //  19     25     125    132    Any
        //  30     36     115    120    Lcom/google/android/gms/common/data/DataHolder$zzb;
        //  30     36     125    132    Any
        //  41     65     120    125    Lcom/google/android/gms/common/data/DataHolder$zzb;
        //  41     65     125    132    Any
        //  69     104    125    132    Any
        //  110    112    112    115    Lcom/google/android/gms/common/data/DataHolder$zzb;
        //  110    112    125    132    Any
        //  113    115    115    120    Lcom/google/android/gms/common/data/DataHolder$zzb;
        //  113    115    125    132    Any
        //  117    120    120    125    Lcom/google/android/gms/common/data/DataHolder$zzb;
        //  117    120    125    132    Any
        //  122    125    125    132    Any
        //  132    141    125    132    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 73, Size: 73
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    public int getStatusCode() {
        return this.zzTS;
    }
    
    int getVersionCode() {
        return this.zzCY;
    }
    
    public boolean isClosed() {
        synchronized (this) {
            return this.mClosed;
        }
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        zze.zza(this, parcel, n);
    }
    
    public Bundle zznb() {
        return this.zzYz;
    }
    
    public void zznf() {
        int i = 0;
        final int a = DataHolder$zza.a;
        this.zzYx = new Bundle();
        int j = 0;
        while (j < this.zzYw.length) {
            this.zzYx.putInt(this.zzYw[j], j);
            ++j;
            if (a != 0) {
                break;
            }
        }
        this.zzYA = new int[this.zzYy.length];
        int zzYB = 0;
        while (i < this.zzYy.length) {
            this.zzYA[i] = zzYB;
            zzYB += this.zzYy[i].getNumRows() - (zzYB - this.zzYy[i].getStartPosition());
            ++i;
            if (a != 0) {
                break;
            }
        }
        this.zzYB = zzYB;
    }
    
    String[] zzng() {
        return this.zzYw;
    }
    
    CursorWindow[] zznh() {
        return this.zzYy;
    }
}
