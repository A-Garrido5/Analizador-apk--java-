// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LocationRequest implements SafeParcelable
{
    public static final LocationRequestCreator CREATOR;
    int mPriority;
    private final int zzCY;
    boolean zzamB;
    long zzaxU;
    long zzaxV;
    int zzaxW;
    float zzaxX;
    long zzaxY;
    long zzaxz;
    
    static {
        CREATOR = new LocationRequestCreator();
    }
    
    public LocationRequest() {
        this.zzCY = 1;
        this.mPriority = 102;
        this.zzaxU = 3600000L;
        this.zzaxV = 600000L;
        this.zzamB = false;
        this.zzaxz = Long.MAX_VALUE;
        this.zzaxW = Integer.MAX_VALUE;
        this.zzaxX = 0.0f;
        this.zzaxY = 0L;
    }
    
    LocationRequest(final int zzCY, final int mPriority, final long zzaxU, final long zzaxV, final boolean zzamB, final long zzaxz, final int zzaxW, final float zzaxX, final long zzaxY) {
        this.zzCY = zzCY;
        this.mPriority = mPriority;
        this.zzaxU = zzaxU;
        this.zzaxV = zzaxV;
        this.zzamB = zzamB;
        this.zzaxz = zzaxz;
        this.zzaxW = zzaxW;
        this.zzaxX = zzaxX;
        this.zzaxY = zzaxY;
    }
    
    public static LocationRequest create() {
        return new LocationRequest();
    }
    
    private static void zzK(final long n) {
        if (n < 0L) {
            try {
                throw new IllegalArgumentException("invalid interval: " + n);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    private static void zzd(final float n) {
        if (n < 0.0f) {
            try {
                throw new IllegalArgumentException("invalid displacement: " + n);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    private static void zzgu(final int n) {
        switch (n) {
            default: {
                throw new IllegalArgumentException("invalid quality: " + n);
            }
            case 100:
            case 102:
            case 104:
            case 105: {}
        }
    }
    
    public static String zzgv(final int n) {
        switch (n) {
            default: {
                return "???";
            }
            case 100: {
                return "PRIORITY_HIGH_ACCURACY";
            }
            case 102: {
                return "PRIORITY_BALANCED_POWER_ACCURACY";
            }
            case 104: {
                return "PRIORITY_LOW_POWER";
            }
            case 105: {
                return "PRIORITY_NO_POWER";
            }
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: if_acmpne       7
        //     5: iconst_1       
        //     6: ireturn        
        //     7: aload_1        
        //     8: instanceof      Lcom/google/android/gms/location/LocationRequest;
        //    11: istore_3       
        //    12: iload_3        
        //    13: ifne            21
        //    16: iconst_0       
        //    17: ireturn        
        //    18: astore_2       
        //    19: aload_2        
        //    20: athrow         
        //    21: aload_1        
        //    22: checkcast       Lcom/google/android/gms/location/LocationRequest;
        //    25: astore          4
        //    27: aload_0        
        //    28: getfield        com/google/android/gms/location/LocationRequest.mPriority:I
        //    31: istore          12
        //    33: aload           4
        //    35: getfield        com/google/android/gms/location/LocationRequest.mPriority:I
        //    38: istore          13
        //    40: iload           12
        //    42: iload           13
        //    44: if_icmpne       171
        //    47: aload_0        
        //    48: getfield        com/google/android/gms/location/LocationRequest.zzaxU:J
        //    51: lstore          14
        //    53: aload           4
        //    55: getfield        com/google/android/gms/location/LocationRequest.zzaxU:J
        //    58: lstore          16
        //    60: lload           14
        //    62: lload           16
        //    64: lcmp           
        //    65: ifne            171
        //    68: aload_0        
        //    69: getfield        com/google/android/gms/location/LocationRequest.zzaxV:J
        //    72: lstore          18
        //    74: aload           4
        //    76: getfield        com/google/android/gms/location/LocationRequest.zzaxV:J
        //    79: lstore          20
        //    81: lload           18
        //    83: lload           20
        //    85: lcmp           
        //    86: ifne            171
        //    89: aload_0        
        //    90: getfield        com/google/android/gms/location/LocationRequest.zzamB:Z
        //    93: istore          22
        //    95: aload           4
        //    97: getfield        com/google/android/gms/location/LocationRequest.zzamB:Z
        //   100: istore          23
        //   102: iload           22
        //   104: iload           23
        //   106: if_icmpne       171
        //   109: aload_0        
        //   110: getfield        com/google/android/gms/location/LocationRequest.zzaxz:J
        //   113: lstore          24
        //   115: aload           4
        //   117: getfield        com/google/android/gms/location/LocationRequest.zzaxz:J
        //   120: lstore          26
        //   122: lload           24
        //   124: lload           26
        //   126: lcmp           
        //   127: ifne            171
        //   130: aload_0        
        //   131: getfield        com/google/android/gms/location/LocationRequest.zzaxW:I
        //   134: istore          28
        //   136: aload           4
        //   138: getfield        com/google/android/gms/location/LocationRequest.zzaxW:I
        //   141: istore          29
        //   143: iload           28
        //   145: iload           29
        //   147: if_icmpne       171
        //   150: aload_0        
        //   151: getfield        com/google/android/gms/location/LocationRequest.zzaxX:F
        //   154: fstore          30
        //   156: aload           4
        //   158: getfield        com/google/android/gms/location/LocationRequest.zzaxX:F
        //   161: fstore          31
        //   163: fload           30
        //   165: fload           31
        //   167: fcmpl          
        //   168: ifeq            5
        //   171: iconst_0       
        //   172: ireturn        
        //   173: astore          5
        //   175: aload           5
        //   177: athrow         
        //   178: astore          6
        //   180: aload           6
        //   182: athrow         
        //   183: astore          7
        //   185: aload           7
        //   187: athrow         
        //   188: astore          8
        //   190: aload           8
        //   192: athrow         
        //   193: astore          9
        //   195: aload           9
        //   197: athrow         
        //   198: astore          10
        //   200: aload           10
        //   202: athrow         
        //   203: astore          11
        //   205: aload           11
        //   207: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  7      12     18     21     Ljava/lang/IllegalArgumentException;
        //  27     40     173    178    Ljava/lang/IllegalArgumentException;
        //  47     60     178    183    Ljava/lang/IllegalArgumentException;
        //  68     81     183    188    Ljava/lang/IllegalArgumentException;
        //  89     102    188    193    Ljava/lang/IllegalArgumentException;
        //  109    122    193    198    Ljava/lang/IllegalArgumentException;
        //  130    143    198    203    Ljava/lang/IllegalArgumentException;
        //  150    163    203    208    Ljava/lang/IllegalArgumentException;
        //  175    178    178    183    Ljava/lang/IllegalArgumentException;
        //  180    183    183    188    Ljava/lang/IllegalArgumentException;
        //  185    188    188    193    Ljava/lang/IllegalArgumentException;
        //  190    193    193    198    Ljava/lang/IllegalArgumentException;
        //  195    198    198    203    Ljava/lang/IllegalArgumentException;
        //  200    203    203    208    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 108, Size: 108
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
    
    int getVersionCode() {
        return this.zzCY;
    }
    
    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[] { this.mPriority, this.zzaxU, this.zzaxV, this.zzamB, this.zzaxz, this.zzaxW, this.zzaxX });
    }
    
    public LocationRequest setFastestInterval(final long zzaxV) {
        zzK(zzaxV);
        this.zzamB = true;
        this.zzaxV = zzaxV;
        return this;
    }
    
    public LocationRequest setInterval(final long zzaxU) {
        try {
            zzK(zzaxU);
            this.zzaxU = zzaxU;
            if (!this.zzamB) {
                this.zzaxV = (long)(this.zzaxU / 6.0);
            }
            return this;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public LocationRequest setPriority(final int mPriority) {
        zzgu(mPriority);
        this.mPriority = mPriority;
        return this;
    }
    
    public LocationRequest setSmallestDisplacement(final float zzaxX) {
        zzd(zzaxX);
        this.zzaxX = zzaxX;
        return this;
    }
    
    @Override
    public String toString() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/android/gms/location/LocationServices$zza.a:I
        //     3: istore_1       
        //     4: new             Ljava/lang/StringBuilder;
        //     7: dup            
        //     8: invokespecial   java/lang/StringBuilder.<init>:()V
        //    11: astore_2       
        //    12: aload_2        
        //    13: ldc             "Request["
        //    15: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    18: aload_0        
        //    19: getfield        com/google/android/gms/location/LocationRequest.mPriority:I
        //    22: invokestatic    com/google/android/gms/location/LocationRequest.zzgv:(I)Ljava/lang/String;
        //    25: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    28: pop            
        //    29: aload_0        
        //    30: getfield        com/google/android/gms/location/LocationRequest.mPriority:I
        //    33: bipush          105
        //    35: if_icmpeq       72
        //    38: aload_2        
        //    39: ldc             " requested="
        //    41: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    44: pop            
        //    45: aload_2        
        //    46: new             Ljava/lang/StringBuilder;
        //    49: dup            
        //    50: invokespecial   java/lang/StringBuilder.<init>:()V
        //    53: aload_0        
        //    54: getfield        com/google/android/gms/location/LocationRequest.zzaxU:J
        //    57: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    60: ldc             "ms"
        //    62: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    65: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    68: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    71: pop            
        //    72: aload_2        
        //    73: ldc             " fastest="
        //    75: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    78: pop            
        //    79: aload_2        
        //    80: new             Ljava/lang/StringBuilder;
        //    83: dup            
        //    84: invokespecial   java/lang/StringBuilder.<init>:()V
        //    87: aload_0        
        //    88: getfield        com/google/android/gms/location/LocationRequest.zzaxV:J
        //    91: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    94: ldc             "ms"
        //    96: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    99: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   102: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   105: pop            
        //   106: aload_0        
        //   107: getfield        com/google/android/gms/location/LocationRequest.zzaxY:J
        //   110: aload_0        
        //   111: getfield        com/google/android/gms/location/LocationRequest.zzaxU:J
        //   114: lcmp           
        //   115: ifle            152
        //   118: aload_2        
        //   119: ldc             " maxWait="
        //   121: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   124: pop            
        //   125: aload_2        
        //   126: new             Ljava/lang/StringBuilder;
        //   129: dup            
        //   130: invokespecial   java/lang/StringBuilder.<init>:()V
        //   133: aload_0        
        //   134: getfield        com/google/android/gms/location/LocationRequest.zzaxY:J
        //   137: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   140: ldc             "ms"
        //   142: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   145: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   148: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   151: pop            
        //   152: aload_0        
        //   153: getfield        com/google/android/gms/location/LocationRequest.zzaxz:J
        //   156: ldc2_w          9223372036854775807
        //   159: lcmp           
        //   160: ifeq            205
        //   163: aload_0        
        //   164: getfield        com/google/android/gms/location/LocationRequest.zzaxz:J
        //   167: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   170: lsub           
        //   171: lstore          16
        //   173: aload_2        
        //   174: ldc             " expireIn="
        //   176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   179: pop            
        //   180: aload_2        
        //   181: new             Ljava/lang/StringBuilder;
        //   184: dup            
        //   185: invokespecial   java/lang/StringBuilder.<init>:()V
        //   188: lload           16
        //   190: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   193: ldc             "ms"
        //   195: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   198: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   201: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   204: pop            
        //   205: aload_0        
        //   206: getfield        com/google/android/gms/location/LocationRequest.zzaxW:I
        //   209: ldc             2147483647
        //   211: if_icmpeq       228
        //   214: aload_2        
        //   215: ldc             " num="
        //   217: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   220: aload_0        
        //   221: getfield        com/google/android/gms/location/LocationRequest.zzaxW:I
        //   224: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   227: pop            
        //   228: aload_2        
        //   229: bipush          93
        //   231: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   234: pop            
        //   235: aload_2        
        //   236: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   239: astore          12
        //   241: iload_1        
        //   242: ifeq            263
        //   245: getstatic       com/google/android/gms/location/internal/zzb.b:Z
        //   248: istore          13
        //   250: iload           13
        //   252: ifeq            289
        //   255: iconst_0       
        //   256: istore          14
        //   258: iload           14
        //   260: putstatic       com/google/android/gms/location/internal/zzb.b:Z
        //   263: aload           12
        //   265: areturn        
        //   266: astore_3       
        //   267: aload_3        
        //   268: athrow         
        //   269: astore          5
        //   271: aload           5
        //   273: athrow         
        //   274: astore          8
        //   276: aload           8
        //   278: athrow         
        //   279: astore          9
        //   281: aload           9
        //   283: athrow         
        //   284: astore          10
        //   286: aload           10
        //   288: athrow         
        //   289: iconst_1       
        //   290: istore          14
        //   292: goto            258
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  12     72     266    269    Ljava/lang/IllegalArgumentException;
        //  72     152    269    274    Ljava/lang/IllegalArgumentException;
        //  205    228    274    279    Ljava/lang/IllegalArgumentException;
        //  228    241    279    284    Ljava/lang/IllegalArgumentException;
        //  245    250    284    289    Ljava/lang/IllegalArgumentException;
        //  281    284    284    289    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 145, Size: 145
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
    
    public void writeToParcel(final Parcel parcel, final int n) {
        LocationRequestCreator.zza(this, parcel, n);
    }
}
