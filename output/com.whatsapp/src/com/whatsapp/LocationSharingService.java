// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Bundle;
import com.whatsapp.util.Log;
import android.os.IBinder;
import android.content.Intent;
import android.os.Handler;
import android.os.PowerManager$WakeLock;
import android.location.Location;
import android.location.LocationListener;
import android.app.Service;

public class LocationSharingService extends Service implements LocationListener
{
    private static Location b;
    private static final String[] z;
    private PowerManager$WakeLock a;
    private Handler c;
    private Runnable d;
    private Location e;
    private ho f;
    
    static {
        final String[] z2 = new String[12];
        String s = "8\u007f&F:'x$U+\u0002x)g:\u0019a.W:";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0332:
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
                        c2 = 'k';
                        break;
                    }
                    case 1: {
                        c2 = '\u0017';
                        break;
                    }
                    case 2: {
                        c2 = 'G';
                        break;
                    }
                    case 3: {
                        c2 = '4';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0007x$U+\u0002x)G7\ne.Z8\u0018r5B6\brhS/\u00188\"F-\u0004eg";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u001bx0Q-";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0007x$U+\u0002x)G7\ne.Z8\u0018r5B6\brhW-\u000ev3Q";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0007x$U+\u0002x)G7\ne.Z8\u0018r5B6\brhW-\u000ev3Qp\u001bz";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u000fb5U+\u0002x)";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0007x$U+\u0002x)G7\ne.Z8\u0018r5B6\brhG+\u0004g";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0007x$U+\u0002x)G7\ne.Z8\u0018r5B6\brhG+\ne3\u0014;\u001ee&@6\u0004y}";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\bx*\u001a(\u0003v3G>\u001bgig7\ne\"x0\bv3]0\u0005D\"F)\u0002t\"\u001a\f?X\u0017";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0007x$U+\u0002x)G7\ne.Z8\u0018r5B6\brhG+\ne3\u00143\nd3\u000e\u007f";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0007x$U+\u0002x)G7\ne.Z8\u0018r5B6\brhP:\u0018c5[&";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0007x$U+\u0002x)G7\ne.Z8\u0018r5B6\brh[1\u0007x$U+\u0002x)W7\ny Q;K";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    break Label_0332;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public LocationSharingService() {
        this.c = new Handler();
        this.d = new aaj(this);
    }
    
    private void a(final Location p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: putstatic       com/whatsapp/LocationSharingService.b:Landroid/location/Location;
        //     4: new             Lcom/whatsapp/protocol/bt;
        //     7: dup            
        //     8: invokespecial   com/whatsapp/protocol/bt.<init>:()V
        //    11: astore_2       
        //    12: aload_2        
        //    13: ldc2_w          1000000.0
        //    16: aload_1        
        //    17: invokevirtual   android/location/Location.getLatitude:()D
        //    20: dmul           
        //    21: invokestatic    java/lang/Math.round:(D)J
        //    24: l2d            
        //    25: ldc2_w          1000000.0
        //    28: ddiv           
        //    29: putfield        com/whatsapp/protocol/bt.f:D
        //    32: aload_2        
        //    33: ldc2_w          1000000.0
        //    36: aload_1        
        //    37: invokevirtual   android/location/Location.getLongitude:()D
        //    40: dmul           
        //    41: invokestatic    java/lang/Math.round:(D)J
        //    44: l2d            
        //    45: ldc2_w          1000000.0
        //    48: ddiv           
        //    49: putfield        com/whatsapp/protocol/bt.c:D
        //    52: aload_1        
        //    53: invokevirtual   android/location/Location.hasAccuracy:()Z
        //    56: ifeq            68
        //    59: aload_2        
        //    60: aload_1        
        //    61: invokevirtual   android/location/Location.getAccuracy:()F
        //    64: f2i            
        //    65: putfield        com/whatsapp/protocol/bt.a:I
        //    68: aload_1        
        //    69: invokevirtual   android/location/Location.hasSpeed:()Z
        //    72: ifeq            91
        //    75: aload_2        
        //    76: ldc             100.0
        //    78: aload_1        
        //    79: invokevirtual   android/location/Location.getSpeed:()F
        //    82: fmul           
        //    83: f2i            
        //    84: i2f            
        //    85: ldc             100.0
        //    87: fdiv           
        //    88: putfield        com/whatsapp/protocol/bt.h:F
        //    91: aload_1        
        //    92: invokevirtual   android/location/Location.hasBearing:()Z
        //    95: ifeq            107
        //    98: aload_2        
        //    99: aload_1        
        //   100: invokevirtual   android/location/Location.getBearing:()F
        //   103: f2i            
        //   104: putfield        com/whatsapp/protocol/bt.i:I
        //   107: aload_2        
        //   108: aload_1        
        //   109: invokevirtual   android/location/Location.getTime:()J
        //   112: putfield        com/whatsapp/protocol/bt.d:J
        //   115: aload_2        
        //   116: getfield        com/whatsapp/protocol/bt.d:J
        //   119: invokestatic    java/lang/System.currentTimeMillis:()J
        //   122: lcmp           
        //   123: ifle            133
        //   126: aload_2        
        //   127: invokestatic    java/lang/System.currentTimeMillis:()J
        //   130: putfield        com/whatsapp/protocol/bt.d:J
        //   133: aload_2        
        //   134: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/protocol/bt;)V
        //   137: return         
        //   138: astore_3       
        //   139: aload_3        
        //   140: athrow         
        //   141: astore          4
        //   143: aload           4
        //   145: athrow         
        //   146: astore          5
        //   148: aload           5
        //   150: athrow         
        //   151: astore          6
        //   153: aload           6
        //   155: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  12     68     138    141    Ljava/lang/RuntimeException;
        //  68     91     141    146    Ljava/lang/RuntimeException;
        //  91     107    146    151    Ljava/lang/RuntimeException;
        //  107    133    151    156    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 82, Size: 82
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
    
    private static boolean a(final Location p0, final Location p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ifnonnull       6
        //     4: iconst_1       
        //     5: ireturn        
        //     6: ldc2_w          120000
        //     9: aload_1        
        //    10: invokevirtual   android/location/Location.getTime:()J
        //    13: ladd           
        //    14: lstore_3       
        //    15: aload_0        
        //    16: invokevirtual   android/location/Location.getTime:()J
        //    19: lstore          5
        //    21: lload_3        
        //    22: lload           5
        //    24: lcmp           
        //    25: iflt            4
        //    28: aload_1        
        //    29: invokevirtual   android/location/Location.getAccuracy:()F
        //    32: fstore          8
        //    34: aload_0        
        //    35: invokevirtual   android/location/Location.getAccuracy:()F
        //    38: fstore          9
        //    40: fload           8
        //    42: fload           9
        //    44: fcmpl          
        //    45: ifgt            4
        //    48: aload_1        
        //    49: invokevirtual   android/location/Location.getProvider:()Ljava/lang/String;
        //    52: aload_0        
        //    53: invokevirtual   android/location/Location.getProvider:()Ljava/lang/String;
        //    56: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //    59: istore          12
        //    61: iload           12
        //    63: ifeq            92
        //    66: aload_1        
        //    67: aload_0        
        //    68: invokevirtual   android/location/Location.distanceTo:(Landroid/location/Location;)F
        //    71: fstore          13
        //    73: ldc             10.0
        //    75: aload_0        
        //    76: invokevirtual   android/location/Location.getAccuracy:()F
        //    79: invokestatic    java/lang/Math.max:(FF)F
        //    82: fstore          14
        //    84: fload           13
        //    86: fload           14
        //    88: fcmpl          
        //    89: ifgt            4
        //    92: iconst_0       
        //    93: ireturn        
        //    94: astore_2       
        //    95: aload_2        
        //    96: athrow         
        //    97: astore          7
        //    99: aload           7
        //   101: athrow         
        //   102: astore          10
        //   104: aload           10
        //   106: athrow         
        //   107: astore          11
        //   109: aload           11
        //   111: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  6      21     94     97     Ljava/lang/RuntimeException;
        //  28     40     97     102    Ljava/lang/RuntimeException;
        //  48     61     102    107    Ljava/lang/RuntimeException;
        //  66     84     107    112    Ljava/lang/RuntimeException;
        //  104    107    107    112    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 61, Size: 61
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
    
    public IBinder onBind(final Intent intent) {
        return null;
    }
    
    public void onCreate() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/LocationSharingService.z:[Ljava/lang/String;
        //     3: iconst_3       
        //     4: aaload         
        //     5: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     8: aload_0        
        //     9: getstatic       com/whatsapp/LocationSharingService.z:[Ljava/lang/String;
        //    12: iconst_2       
        //    13: aaload         
        //    14: invokevirtual   com/whatsapp/LocationSharingService.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    17: checkcast       Landroid/os/PowerManager;
        //    20: astore          4
        //    22: aload           4
        //    24: ifnull          81
        //    27: aload_0        
        //    28: getfield        com/whatsapp/LocationSharingService.a:Landroid/os/PowerManager$WakeLock;
        //    31: astore          7
        //    33: aload           7
        //    35: ifnonnull       53
        //    38: aload_0        
        //    39: aload           4
        //    41: iconst_1       
        //    42: getstatic       com/whatsapp/LocationSharingService.z:[Ljava/lang/String;
        //    45: iconst_0       
        //    46: aaload         
        //    47: invokevirtual   android/os/PowerManager.newWakeLock:(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
        //    50: putfield        com/whatsapp/LocationSharingService.a:Landroid/os/PowerManager$WakeLock;
        //    53: aload_0        
        //    54: getfield        com/whatsapp/LocationSharingService.a:Landroid/os/PowerManager$WakeLock;
        //    57: ifnull          81
        //    60: aload_0        
        //    61: getfield        com/whatsapp/LocationSharingService.a:Landroid/os/PowerManager$WakeLock;
        //    64: invokevirtual   android/os/PowerManager$WakeLock.isHeld:()Z
        //    67: istore          10
        //    69: iload           10
        //    71: ifne            81
        //    74: aload_0        
        //    75: getfield        com/whatsapp/LocationSharingService.a:Landroid/os/PowerManager$WakeLock;
        //    78: invokevirtual   android/os/PowerManager$WakeLock.acquire:()V
        //    81: aload_0        
        //    82: getfield        com/whatsapp/LocationSharingService.c:Landroid/os/Handler;
        //    85: aload_0        
        //    86: getfield        com/whatsapp/LocationSharingService.d:Ljava/lang/Runnable;
        //    89: ldc2_w          40000
        //    92: invokevirtual   android/os/Handler.postDelayed:(Ljava/lang/Runnable;J)Z
        //    95: pop            
        //    96: aload_0        
        //    97: new             Lcom/whatsapp/ho;
        //   100: dup            
        //   101: aload_0        
        //   102: invokespecial   com/whatsapp/ho.<init>:(Landroid/content/Context;)V
        //   105: putfield        com/whatsapp/LocationSharingService.f:Lcom/whatsapp/ho;
        //   108: aload_0        
        //   109: getfield        com/whatsapp/LocationSharingService.f:Lcom/whatsapp/ho;
        //   112: ldc2_w          1000
        //   115: fconst_0       
        //   116: aload_0        
        //   117: invokevirtual   com/whatsapp/ho.a:(JFLandroid/location/LocationListener;)V
        //   120: return         
        //   121: astore          5
        //   123: aload           5
        //   125: athrow         
        //   126: astore          6
        //   128: aload           6
        //   130: athrow         
        //   131: astore_1       
        //   132: getstatic       com/whatsapp/LocationSharingService.z:[Ljava/lang/String;
        //   135: iconst_4       
        //   136: aaload         
        //   137: aload_1        
        //   138: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   141: goto            81
        //   144: astore          8
        //   146: aload           8
        //   148: athrow         
        //   149: astore          9
        //   151: aload           9
        //   153: athrow         
        //   154: astore_3       
        //   155: new             Ljava/lang/StringBuilder;
        //   158: dup            
        //   159: invokespecial   java/lang/StringBuilder.<init>:()V
        //   162: getstatic       com/whatsapp/LocationSharingService.z:[Ljava/lang/String;
        //   165: iconst_1       
        //   166: aaload         
        //   167: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   170: aload_3        
        //   171: invokevirtual   java/lang/IllegalArgumentException.toString:()Ljava/lang/String;
        //   174: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   177: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   180: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   183: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  8      22     131    144    Ljava/lang/RuntimeException;
        //  27     33     121    126    Ljava/lang/RuntimeException;
        //  38     53     126    131    Ljava/lang/RuntimeException;
        //  53     69     144    149    Ljava/lang/RuntimeException;
        //  74     81     149    154    Ljava/lang/RuntimeException;
        //  108    120    154    184    Ljava/lang/IllegalArgumentException;
        //  123    126    126    131    Ljava/lang/RuntimeException;
        //  128    131    131    144    Ljava/lang/RuntimeException;
        //  146    149    149    154    Ljava/lang/RuntimeException;
        //  151    154    131    144    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 91, Size: 91
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
    
    public void onDestroy() {
        try {
            Log.i(LocationSharingService.z[10]);
            this.c.removeCallbacks(this.d);
            this.f.a((LocationListener)this);
            if (this.a == null) {
                return;
            }
            final LocationSharingService locationSharingService = this;
            final PowerManager$WakeLock powerManager$WakeLock = locationSharingService.a;
            final boolean b = powerManager$WakeLock.isHeld();
            if (b) {
                final LocationSharingService locationSharingService2 = this;
                final PowerManager$WakeLock powerManager$WakeLock2 = locationSharingService2.a;
                powerManager$WakeLock2.release();
                final LocationSharingService locationSharingService3 = this;
                final PowerManager$WakeLock powerManager$WakeLock3 = null;
                locationSharingService3.a = powerManager$WakeLock3;
            }
            return;
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        try {
            final LocationSharingService locationSharingService = this;
            final PowerManager$WakeLock powerManager$WakeLock = locationSharingService.a;
            final boolean b = powerManager$WakeLock.isHeld();
            if (b) {
                final LocationSharingService locationSharingService2 = this;
                final PowerManager$WakeLock powerManager$WakeLock2 = locationSharingService2.a;
                powerManager$WakeLock2.release();
                final LocationSharingService locationSharingService3 = this;
                final PowerManager$WakeLock powerManager$WakeLock3 = null;
                locationSharingService3.a = powerManager$WakeLock3;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
    }
    
    public void onLocationChanged(final Location p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/LocationSharingService.z:[Ljava/lang/String;
        //    10: bipush          11
        //    12: aaload         
        //    13: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    16: aload_1        
        //    17: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    20: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    23: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    26: aload_1        
        //    27: getstatic       com/whatsapp/LocationSharingService.b:Landroid/location/Location;
        //    30: invokestatic    com/whatsapp/LocationSharingService.a:(Landroid/location/Location;Landroid/location/Location;)Z
        //    33: istore          5
        //    35: iload           5
        //    37: ifeq            60
        //    40: aload_0        
        //    41: aload_1        
        //    42: invokespecial   com/whatsapp/LocationSharingService.a:(Landroid/location/Location;)V
        //    45: aload_0        
        //    46: aload_1        
        //    47: putfield        com/whatsapp/LocationSharingService.e:Landroid/location/Location;
        //    50: getstatic       com/whatsapp/App.I:Z
        //    53: istore          9
        //    55: iload           9
        //    57: ifeq            116
        //    60: aload_1        
        //    61: invokevirtual   android/location/Location.getAccuracy:()F
        //    64: ldc_w           80.0
        //    67: fcmpg          
        //    68: ifge            76
        //    71: aload_0        
        //    72: aload_1        
        //    73: putfield        com/whatsapp/LocationSharingService.e:Landroid/location/Location;
        //    76: aload_0        
        //    77: getfield        com/whatsapp/LocationSharingService.e:Landroid/location/Location;
        //    80: astore          8
        //    82: aload           8
        //    84: ifnull          116
        //    87: ldc2_w          40000
        //    90: getstatic       com/whatsapp/LocationSharingService.b:Landroid/location/Location;
        //    93: invokevirtual   android/location/Location.getTime:()J
        //    96: ladd           
        //    97: aload_0        
        //    98: getfield        com/whatsapp/LocationSharingService.e:Landroid/location/Location;
        //   101: invokevirtual   android/location/Location.getTime:()J
        //   104: lcmp           
        //   105: ifge            116
        //   108: aload_0        
        //   109: aload_0        
        //   110: getfield        com/whatsapp/LocationSharingService.e:Landroid/location/Location;
        //   113: invokespecial   com/whatsapp/LocationSharingService.a:(Landroid/location/Location;)V
        //   116: return         
        //   117: astore_2       
        //   118: aload_2        
        //   119: athrow         
        //   120: astore_3       
        //   121: aload_3        
        //   122: athrow         
        //   123: astore          4
        //   125: aload           4
        //   127: athrow         
        //   128: astore          6
        //   130: aload           6
        //   132: athrow         
        //   133: astore          7
        //   135: aload           7
        //   137: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      35     117    120    Ljava/lang/RuntimeException;
        //  40     55     120    123    Ljava/lang/RuntimeException;
        //  60     76     123    128    Ljava/lang/RuntimeException;
        //  76     82     128    133    Ljava/lang/RuntimeException;
        //  87     116    133    138    Ljava/lang/RuntimeException;
        //  118    120    120    123    Ljava/lang/RuntimeException;
        //  121    123    123    128    Ljava/lang/RuntimeException;
        //  130    133    133    138    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 69, Size: 69
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
    
    public void onProviderDisabled(final String s) {
    }
    
    public void onProviderEnabled(final String s) {
    }
    
    public int onStartCommand(final Intent p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc2_w          40000
        //     3: lstore          4
        //     5: aload_0        
        //     6: getfield        com/whatsapp/LocationSharingService.c:Landroid/os/Handler;
        //     9: aload_0        
        //    10: getfield        com/whatsapp/LocationSharingService.d:Ljava/lang/Runnable;
        //    13: invokevirtual   android/os/Handler.removeCallbacks:(Ljava/lang/Runnable;)V
        //    16: aload_1        
        //    17: ifnull          59
        //    20: aload_1        
        //    21: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //    24: getstatic       com/whatsapp/LocationSharingService.z:[Ljava/lang/String;
        //    27: bipush          8
        //    29: aaload         
        //    30: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    33: ifeq            59
        //    36: getstatic       com/whatsapp/LocationSharingService.z:[Ljava/lang/String;
        //    39: bipush          6
        //    41: aaload         
        //    42: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    45: aload_0        
        //    46: invokevirtual   com/whatsapp/LocationSharingService.stopSelf:()V
        //    49: getstatic       com/whatsapp/App.I:Z
        //    52: istore          22
        //    54: iload           22
        //    56: ifeq            243
        //    59: aload_1        
        //    60: ifnull          76
        //    63: aload_1        
        //    64: getstatic       com/whatsapp/LocationSharingService.z:[Ljava/lang/String;
        //    67: iconst_5       
        //    68: aaload         
        //    69: lload           4
        //    71: invokevirtual   android/content/Intent.getLongExtra:(Ljava/lang/String;J)J
        //    74: lstore          4
        //    76: aload_0        
        //    77: getfield        com/whatsapp/LocationSharingService.c:Landroid/os/Handler;
        //    80: aload_0        
        //    81: getfield        com/whatsapp/LocationSharingService.d:Ljava/lang/Runnable;
        //    84: lload           4
        //    86: invokevirtual   android/os/Handler.postDelayed:(Ljava/lang/Runnable;J)Z
        //    89: pop            
        //    90: new             Ljava/lang/StringBuilder;
        //    93: dup            
        //    94: invokespecial   java/lang/StringBuilder.<init>:()V
        //    97: getstatic       com/whatsapp/LocationSharingService.z:[Ljava/lang/String;
        //   100: bipush          7
        //   102: aaload         
        //   103: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   106: lload           4
        //   108: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   111: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   114: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   117: getstatic       com/whatsapp/LocationSharingService.b:Landroid/location/Location;
        //   120: ifnull          148
        //   123: ldc2_w          120000
        //   126: getstatic       com/whatsapp/LocationSharingService.b:Landroid/location/Location;
        //   129: invokevirtual   android/location/Location.getTime:()J
        //   132: ladd           
        //   133: lstore          18
        //   135: invokestatic    java/lang/System.currentTimeMillis:()J
        //   138: lstore          20
        //   140: lload           18
        //   142: lload           20
        //   144: lcmp           
        //   145: ifge            243
        //   148: aload_0        
        //   149: getfield        com/whatsapp/LocationSharingService.f:Lcom/whatsapp/ho;
        //   152: iconst_1       
        //   153: invokevirtual   com/whatsapp/ho.a:(I)Landroid/location/Location;
        //   156: astore          10
        //   158: aload_0        
        //   159: getfield        com/whatsapp/LocationSharingService.f:Lcom/whatsapp/ho;
        //   162: iconst_2       
        //   163: invokevirtual   com/whatsapp/ho.a:(I)Landroid/location/Location;
        //   166: astore          11
        //   168: aload           10
        //   170: ifnonnull       260
        //   173: aload           11
        //   175: ifnull          205
        //   178: ldc2_w          7200000
        //   181: aload           11
        //   183: invokevirtual   android/location/Location.getTime:()J
        //   186: ladd           
        //   187: lstore          14
        //   189: invokestatic    java/lang/System.currentTimeMillis:()J
        //   192: lstore          16
        //   194: lload           14
        //   196: lload           16
        //   198: lcmp           
        //   199: ifge            205
        //   202: aconst_null    
        //   203: astore          11
        //   205: new             Ljava/lang/StringBuilder;
        //   208: dup            
        //   209: invokespecial   java/lang/StringBuilder.<init>:()V
        //   212: getstatic       com/whatsapp/LocationSharingService.z:[Ljava/lang/String;
        //   215: bipush          9
        //   217: aaload         
        //   218: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   221: aload           11
        //   223: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   226: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   229: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   232: aload           11
        //   234: ifnull          243
        //   237: aload_0        
        //   238: aload           11
        //   240: invokespecial   com/whatsapp/LocationSharingService.a:(Landroid/location/Location;)V
        //   243: iconst_1       
        //   244: ireturn        
        //   245: astore          6
        //   247: aload           6
        //   249: athrow         
        //   250: astore          7
        //   252: aload           7
        //   254: athrow         
        //   255: astore          8
        //   257: aload           8
        //   259: athrow         
        //   260: aload           11
        //   262: ifnonnull       272
        //   265: aload           10
        //   267: astore          11
        //   269: goto            173
        //   272: aload           10
        //   274: invokevirtual   android/location/Location.getTime:()J
        //   277: aload           11
        //   279: invokevirtual   android/location/Location.getTime:()J
        //   282: ldc2_w          20000
        //   285: lsub           
        //   286: lcmp           
        //   287: ifle            173
        //   290: aload           10
        //   292: astore          11
        //   294: goto            173
        //   297: astore          13
        //   299: aload           13
        //   301: athrow         
        //   302: astore          12
        //   304: aload           12
        //   306: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  5      16     245    250    Ljava/lang/RuntimeException;
        //  20     54     250    255    Ljava/lang/RuntimeException;
        //  76     140    255    260    Ljava/lang/RuntimeException;
        //  178    194    297    302    Ljava/lang/RuntimeException;
        //  205    232    302    307    Ljava/lang/RuntimeException;
        //  237    243    302    307    Ljava/lang/RuntimeException;
        //  247    250    250    255    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 142, Size: 142
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
    
    public void onStatusChanged(final String s, final int n, final Bundle bundle) {
    }
}
