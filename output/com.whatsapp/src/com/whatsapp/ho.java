// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.location.LocationListener;
import com.google.android.gms.location.FusedLocationProviderApi;
import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.common.api.GoogleApiClient$Builder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import android.os.Build$VERSION;
import android.content.Context;
import android.location.LocationManager;
import java.util.HashMap;
import com.google.android.gms.common.api.GoogleApiClient;

public class ho
{
    private static final String[] z;
    private GoogleApiClient a;
    private HashMap b;
    private ji c;
    private LocationManager d;
    
    static {
        final String[] z2 = new String[7];
        String s = "q\u000e\u0013@\"t\u000e\u001e";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'V';
                        break;
                    }
                    case 0: {
                        c2 = '\u001d';
                        break;
                    }
                    case 1: {
                        c2 = 'a';
                        break;
                    }
                    case 2: {
                        c2 = 'p';
                        break;
                    }
                    case 3: {
                        c2 = '!';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "z\u0011\u0003";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "s\u0004\u0004V9o\n";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "s\u0004\u0004V9o\n";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "{\u0014\u0003D2q\u000e\u0013@\"t\u000e\u001eQ$r\u0017\u0019E3o";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "z\u0011\u0003";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "{\u0014\u0003D2q\u000e\u0013@\"t\u000e\u001eQ$r\u0017\u0019E3o";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ho(final Context context) {
        Label_0077: {
            if (Build$VERSION.SDK_INT < 9) {
                break Label_0077;
            }
            try {
                if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0) {
                    this.c = new ji(this);
                    this.b = new HashMap();
                    this.a = new GoogleApiClient$Builder(context).addApi(LocationServices.API).addConnectionCallbacks(this.c).addOnConnectionFailedListener(this.c).build();
                }
                this.d = (LocationManager)context.getSystemService(ho.z[0]);
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
    }
    
    static HashMap a(final ho ho) {
        return ho.b;
    }
    
    static GoogleApiClient b(final ho ho) {
        return ho.a;
    }
    
    public Location a(final int n) {
        Label_0042: {
            try {
                if (this.a == null) {
                    break Label_0042;
                }
                final ho ho = this;
                final GoogleApiClient googleApiClient = ho.a;
                final boolean b = googleApiClient.isConnected();
                if (b) {
                    final FusedLocationProviderApi fusedLocationProviderApi = LocationServices.FusedLocationApi;
                    final ho ho2 = this;
                    final GoogleApiClient googleApiClient2 = ho2.a;
                    return fusedLocationProviderApi.getLastLocation(googleApiClient2);
                }
                break Label_0042;
            }
            catch (RuntimeException ex) {
                try {
                    throw ex;
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            try {
                final ho ho = this;
                final GoogleApiClient googleApiClient = ho.a;
                final boolean b = googleApiClient.isConnected();
                if (b) {
                    final FusedLocationProviderApi fusedLocationProviderApi = LocationServices.FusedLocationApi;
                    final ho ho2 = this;
                    final GoogleApiClient googleApiClient2 = ho2.a;
                    return fusedLocationProviderApi.getLastLocation(googleApiClient2);
                }
            }
            catch (RuntimeException ex4) {}
        }
        if (n == 1) {
            try {
                return this.d.getLastKnownLocation(ho.z[1]);
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        return this.d.getLastKnownLocation(ho.z[2]);
    }
    
    public void a(final int p0, final long p1, final float p2, final LocationListener p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/ho.a:Lcom/google/android/gms/common/api/GoogleApiClient;
        //     4: ifnull          166
        //     7: aload_0        
        //     8: getfield        com/whatsapp/ho.b:Ljava/util/HashMap;
        //    11: invokevirtual   java/util/HashMap.isEmpty:()Z
        //    14: istore          10
        //    16: iload           10
        //    18: ifeq            30
        //    21: aload_0        
        //    22: getfield        com/whatsapp/ho.a:Lcom/google/android/gms/common/api/GoogleApiClient;
        //    25: invokeinterface com/google/android/gms/common/api/GoogleApiClient.connect:()V
        //    30: iload_1        
        //    31: iconst_1       
        //    32: iand           
        //    33: ifeq            226
        //    36: iconst_1       
        //    37: istore          11
        //    39: new             Lcom/whatsapp/aq8;
        //    42: dup            
        //    43: lload_2        
        //    44: fload           4
        //    46: iload           11
        //    48: aload           5
        //    50: invokespecial   com/whatsapp/aq8.<init>:(JFZLandroid/location/LocationListener;)V
        //    53: astore          12
        //    55: aload_0        
        //    56: getfield        com/whatsapp/ho.b:Ljava/util/HashMap;
        //    59: aload           5
        //    61: aload           12
        //    63: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    66: pop            
        //    67: aload_0        
        //    68: getfield        com/whatsapp/ho.a:Lcom/google/android/gms/common/api/GoogleApiClient;
        //    71: invokeinterface com/google/android/gms/common/api/GoogleApiClient.isConnected:()Z
        //    76: ifeq            156
        //    79: invokestatic    com/google/android/gms/location/LocationRequest.create:()Lcom/google/android/gms/location/LocationRequest;
        //    82: astore          16
        //    84: aload           12
        //    86: invokestatic    com/whatsapp/aq8.c:(Lcom/whatsapp/aq8;)Z
        //    89: istore          18
        //    91: iload           18
        //    93: ifeq            237
        //    96: bipush          100
        //    98: istore          19
        //   100: aload           16
        //   102: iload           19
        //   104: invokevirtual   com/google/android/gms/location/LocationRequest.setPriority:(I)Lcom/google/android/gms/location/LocationRequest;
        //   107: pop            
        //   108: aload           16
        //   110: aload           12
        //   112: invokestatic    com/whatsapp/aq8.b:(Lcom/whatsapp/aq8;)J
        //   115: invokevirtual   com/google/android/gms/location/LocationRequest.setInterval:(J)Lcom/google/android/gms/location/LocationRequest;
        //   118: pop            
        //   119: aload           16
        //   121: ldc2_w          1000
        //   124: invokevirtual   com/google/android/gms/location/LocationRequest.setFastestInterval:(J)Lcom/google/android/gms/location/LocationRequest;
        //   127: pop            
        //   128: aload           16
        //   130: aload           12
        //   132: invokestatic    com/whatsapp/aq8.a:(Lcom/whatsapp/aq8;)F
        //   135: invokevirtual   com/google/android/gms/location/LocationRequest.setSmallestDisplacement:(F)Lcom/google/android/gms/location/LocationRequest;
        //   138: pop            
        //   139: getstatic       com/google/android/gms/location/LocationServices.FusedLocationApi:Lcom/google/android/gms/location/FusedLocationProviderApi;
        //   142: aload_0        
        //   143: getfield        com/whatsapp/ho.a:Lcom/google/android/gms/common/api/GoogleApiClient;
        //   146: aload           16
        //   148: aload           12
        //   150: invokeinterface com/google/android/gms/location/FusedLocationProviderApi.requestLocationUpdates:(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;)Lcom/google/android/gms/common/api/PendingResult;
        //   155: pop            
        //   156: getstatic       com/whatsapp/App.I:Z
        //   159: istore          15
        //   161: iload           15
        //   163: ifeq            212
        //   166: iload_1        
        //   167: iconst_1       
        //   168: iand           
        //   169: ifeq            189
        //   172: aload_0        
        //   173: getfield        com/whatsapp/ho.d:Landroid/location/LocationManager;
        //   176: getstatic       com/whatsapp/ho.z:[Ljava/lang/String;
        //   179: iconst_5       
        //   180: aaload         
        //   181: lload_2        
        //   182: fload           4
        //   184: aload           5
        //   186: invokevirtual   android/location/LocationManager.requestLocationUpdates:(Ljava/lang/String;JFLandroid/location/LocationListener;)V
        //   189: iload_1        
        //   190: iconst_2       
        //   191: iand           
        //   192: ifeq            212
        //   195: aload_0        
        //   196: getfield        com/whatsapp/ho.d:Landroid/location/LocationManager;
        //   199: getstatic       com/whatsapp/ho.z:[Ljava/lang/String;
        //   202: iconst_3       
        //   203: aaload         
        //   204: lload_2        
        //   205: fload           4
        //   207: aload           5
        //   209: invokevirtual   android/location/LocationManager.requestLocationUpdates:(Ljava/lang/String;JFLandroid/location/LocationListener;)V
        //   212: return         
        //   213: astore          6
        //   215: aload           6
        //   217: athrow         
        //   218: astore          7
        //   220: aload           7
        //   222: athrow         
        //   223: pop            
        //   224: dload_3        
        //   225: athrow         
        //   226: iconst_0       
        //   227: istore          11
        //   229: goto            39
        //   232: astore          17
        //   234: aload           17
        //   236: athrow         
        //   237: bipush          102
        //   239: istore          19
        //   241: goto            100
        //   244: astore          14
        //   246: aload           14
        //   248: athrow         
        //   249: astore          9
        //   251: getstatic       com/whatsapp/ho.z:[Ljava/lang/String;
        //   254: bipush          6
        //   256: aaload         
        //   257: aload           9
        //   259: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   262: goto            189
        //   265: astore          8
        //   267: getstatic       com/whatsapp/ho.z:[Ljava/lang/String;
        //   270: iconst_4       
        //   271: aaload         
        //   272: aload           8
        //   274: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   277: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      16     213    218    Ljava/lang/RuntimeException;
        //  21     30     218    223    Ljava/lang/RuntimeException;
        //  84     91     232    237    Ljava/lang/RuntimeException;
        //  156    161    244    249    Ljava/lang/RuntimeException;
        //  172    189    249    265    Ljava/lang/RuntimeException;
        //  195    212    265    278    Ljava/lang/RuntimeException;
        //  215    218    218    223    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 133, Size: 133
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
    
    public void a(final long n, final float n2, final LocationListener locationListener) {
        this.a(3, n, n2, locationListener);
    }
    
    public void a(final LocationListener p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/ho.a:Lcom/google/android/gms/common/api/GoogleApiClient;
        //     4: ifnull          74
        //     7: aload_0        
        //     8: getfield        com/whatsapp/ho.b:Ljava/util/HashMap;
        //    11: aload_1        
        //    12: invokevirtual   java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    15: checkcast       Lcom/whatsapp/aq8;
        //    18: astore_3       
        //    19: aload_3        
        //    20: ifnull          68
        //    23: aload_0        
        //    24: getfield        com/whatsapp/ho.a:Lcom/google/android/gms/common/api/GoogleApiClient;
        //    27: invokeinterface com/google/android/gms/common/api/GoogleApiClient.isConnected:()Z
        //    32: ifeq            49
        //    35: getstatic       com/google/android/gms/location/LocationServices.FusedLocationApi:Lcom/google/android/gms/location/FusedLocationProviderApi;
        //    38: aload_0        
        //    39: getfield        com/whatsapp/ho.a:Lcom/google/android/gms/common/api/GoogleApiClient;
        //    42: aload_3        
        //    43: invokeinterface com/google/android/gms/location/FusedLocationProviderApi.removeLocationUpdates:(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationListener;)Lcom/google/android/gms/common/api/PendingResult;
        //    48: pop            
        //    49: aload_0        
        //    50: getfield        com/whatsapp/ho.b:Ljava/util/HashMap;
        //    53: invokevirtual   java/util/HashMap.isEmpty:()Z
        //    56: ifeq            68
        //    59: aload_0        
        //    60: getfield        com/whatsapp/ho.a:Lcom/google/android/gms/common/api/GoogleApiClient;
        //    63: invokeinterface com/google/android/gms/common/api/GoogleApiClient.disconnect:()V
        //    68: getstatic       com/whatsapp/App.I:Z
        //    71: ifeq            82
        //    74: aload_0        
        //    75: getfield        com/whatsapp/ho.d:Landroid/location/LocationManager;
        //    78: aload_1        
        //    79: invokevirtual   android/location/LocationManager.removeUpdates:(Landroid/location/LocationListener;)V
        //    82: return         
        //    83: astore          4
        //    85: aload           4
        //    87: athrow         
        //    88: astore          5
        //    90: aload           5
        //    92: athrow         
        //    93: astore_2       
        //    94: aload_2        
        //    95: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  23     49     83     88     Ljava/lang/RuntimeException;
        //  49     68     88     93     Ljava/lang/RuntimeException;
        //  68     74     93     96     Ljava/lang/RuntimeException;
        //  74     82     93     96     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 44, Size: 44
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
}
