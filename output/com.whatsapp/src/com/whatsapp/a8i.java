// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.hardware.SensorEvent;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;

class a8i implements SensorEventListener
{
    final GoogleMapView2 a;
    
    a8i(final GoogleMapView2 a) {
        this.a = a;
    }
    
    public void onAccuracyChanged(final Sensor sensor, final int n) {
    }
    
    public void onSensorChanged(final SensorEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/a8i.a:Lcom/whatsapp/GoogleMapView2;
        //     8: invokevirtual   com/whatsapp/GoogleMapView2.getMap:()Lcom/google/android/gms/maps/GoogleMap;
        //    11: invokevirtual   com/google/android/gms/maps/GoogleMap.getMyLocation:()Landroid/location/Location;
        //    14: astore_3       
        //    15: aload_3        
        //    16: ifnonnull       20
        //    19: return         
        //    20: aload_0        
        //    21: getfield        com/whatsapp/a8i.a:Lcom/whatsapp/GoogleMapView2;
        //    24: invokestatic    com/whatsapp/GoogleMapView2.b:(Lcom/whatsapp/GoogleMapView2;)[F
        //    27: aload_1        
        //    28: getfield        android/hardware/SensorEvent.values:[F
        //    31: invokestatic    android/hardware/SensorManager.getRotationMatrixFromVector:([F[F)V
        //    34: aload_0        
        //    35: getfield        com/whatsapp/a8i.a:Lcom/whatsapp/GoogleMapView2;
        //    38: invokestatic    com/whatsapp/GoogleMapView2.d:(Lcom/whatsapp/GoogleMapView2;)Landroid/view/Display;
        //    41: invokevirtual   android/view/Display.getRotation:()I
        //    44: istore          6
        //    46: invokestatic    java/lang/System.currentTimeMillis:()J
        //    49: lstore          9
        //    51: aload_3        
        //    52: invokevirtual   android/location/Location.getTime:()J
        //    55: lstore          11
        //    57: lload           9
        //    59: lload           11
        //    61: lsub           
        //    62: ldc2_w          5000
        //    65: lcmp           
        //    66: ifge            102
        //    69: aload_3        
        //    70: invokevirtual   android/location/Location.hasBearing:()Z
        //    73: ifeq            102
        //    76: aload_3        
        //    77: invokevirtual   android/location/Location.getSpeed:()F
        //    80: fstore          25
        //    82: fload           25
        //    84: f2d            
        //    85: ldc2_w          0.89408
        //    88: dcmpl          
        //    89: ifle            102
        //    92: aload_3        
        //    93: invokevirtual   android/location/Location.getBearing:()F
        //    96: fstore          16
        //    98: iload_2        
        //    99: ifeq            231
        //   102: aload_0        
        //   103: getfield        com/whatsapp/a8i.a:Lcom/whatsapp/GoogleMapView2;
        //   106: invokestatic    com/whatsapp/GoogleMapView2.b:(Lcom/whatsapp/GoogleMapView2;)[F
        //   109: aload_0        
        //   110: getfield        com/whatsapp/a8i.a:Lcom/whatsapp/GoogleMapView2;
        //   113: invokestatic    com/whatsapp/GoogleMapView2.c:(Lcom/whatsapp/GoogleMapView2;)[F
        //   116: invokestatic    android/hardware/SensorManager.getOrientation:([F[F)[F
        //   119: pop            
        //   120: aload_0        
        //   121: getfield        com/whatsapp/a8i.a:Lcom/whatsapp/GoogleMapView2;
        //   124: invokestatic    com/whatsapp/GoogleMapView2.c:(Lcom/whatsapp/GoogleMapView2;)[F
        //   127: iconst_0       
        //   128: faload         
        //   129: f2d            
        //   130: invokestatic    java/lang/Math.toDegrees:(D)D
        //   133: d2f            
        //   134: fstore          14
        //   136: iload           6
        //   138: tableswitch {
        //                0: 494
        //                1: 498
        //                2: 509
        //                3: 520
        //          default: 168
        //        }
        //   168: fload           14
        //   170: fconst_0       
        //   171: fcmpg          
        //   172: ifge            545
        //   175: fload           14
        //   177: ldc             360.0
        //   179: fadd           
        //   180: fstore          15
        //   182: fload           15
        //   184: new             Landroid/hardware/GeomagneticField;
        //   187: dup            
        //   188: aload_3        
        //   189: invokevirtual   android/location/Location.getLatitude:()D
        //   192: d2f            
        //   193: aload_3        
        //   194: invokevirtual   android/location/Location.getLongitude:()D
        //   197: d2f            
        //   198: aload_3        
        //   199: invokevirtual   android/location/Location.getAltitude:()D
        //   202: d2f            
        //   203: aload_3        
        //   204: invokevirtual   android/location/Location.getTime:()J
        //   207: invokespecial   android/hardware/GeomagneticField.<init>:(FFFJ)V
        //   210: invokevirtual   android/hardware/GeomagneticField.getDeclination:()F
        //   213: fadd           
        //   214: fstore          16
        //   216: fload           16
        //   218: ldc             360.0
        //   220: fcmpl          
        //   221: iflt            231
        //   224: fload           16
        //   226: ldc             360.0
        //   228: fsub           
        //   229: fstore          16
        //   231: aload_0        
        //   232: getfield        com/whatsapp/a8i.a:Lcom/whatsapp/GoogleMapView2;
        //   235: aload_0        
        //   236: getfield        com/whatsapp/a8i.a:Lcom/whatsapp/GoogleMapView2;
        //   239: fload           16
        //   241: aload_0        
        //   242: getfield        com/whatsapp/a8i.a:Lcom/whatsapp/GoogleMapView2;
        //   245: invokestatic    com/whatsapp/GoogleMapView2.a:(Lcom/whatsapp/GoogleMapView2;)F
        //   248: invokestatic    com/whatsapp/GoogleMapView2.a:(Lcom/whatsapp/GoogleMapView2;FF)F
        //   251: invokestatic    com/whatsapp/GoogleMapView2.b:(Lcom/whatsapp/GoogleMapView2;F)F
        //   254: pop            
        //   255: iload           6
        //   257: ifeq            266
        //   260: iload           6
        //   262: iconst_2       
        //   263: if_icmpne       295
        //   266: aload_0        
        //   267: getfield        com/whatsapp/a8i.a:Lcom/whatsapp/GoogleMapView2;
        //   270: aload_0        
        //   271: getfield        com/whatsapp/a8i.a:Lcom/whatsapp/GoogleMapView2;
        //   274: invokestatic    com/whatsapp/GoogleMapView2.c:(Lcom/whatsapp/GoogleMapView2;)[F
        //   277: iconst_1       
        //   278: faload         
        //   279: f2d            
        //   280: invokestatic    java/lang/Math.toDegrees:(D)D
        //   283: invokestatic    java/lang/Math.abs:(D)D
        //   286: d2f            
        //   287: invokestatic    com/whatsapp/GoogleMapView2.a:(Lcom/whatsapp/GoogleMapView2;F)F
        //   290: pop            
        //   291: iload_2        
        //   292: ifeq            320
        //   295: aload_0        
        //   296: getfield        com/whatsapp/a8i.a:Lcom/whatsapp/GoogleMapView2;
        //   299: aload_0        
        //   300: getfield        com/whatsapp/a8i.a:Lcom/whatsapp/GoogleMapView2;
        //   303: invokestatic    com/whatsapp/GoogleMapView2.c:(Lcom/whatsapp/GoogleMapView2;)[F
        //   306: iconst_2       
        //   307: faload         
        //   308: f2d            
        //   309: invokestatic    java/lang/Math.toDegrees:(D)D
        //   312: invokestatic    java/lang/Math.abs:(D)D
        //   315: d2f            
        //   316: invokestatic    com/whatsapp/GoogleMapView2.a:(Lcom/whatsapp/GoogleMapView2;F)F
        //   319: pop            
        //   320: aload_0        
        //   321: getfield        com/whatsapp/a8i.a:Lcom/whatsapp/GoogleMapView2;
        //   324: invokestatic    com/whatsapp/GoogleMapView2.e:(Lcom/whatsapp/GoogleMapView2;)I
        //   327: ifne            19
        //   330: new             Lcom/google/android/gms/maps/model/LatLng;
        //   333: dup            
        //   334: aload_3        
        //   335: invokevirtual   android/location/Location.getLatitude:()D
        //   338: aload_3        
        //   339: invokevirtual   android/location/Location.getLongitude:()D
        //   342: invokespecial   com/google/android/gms/maps/model/LatLng.<init>:(DD)V
        //   345: ldc2_w          50.0
        //   348: aload_0        
        //   349: getfield        com/whatsapp/a8i.a:Lcom/whatsapp/GoogleMapView2;
        //   352: invokestatic    com/whatsapp/GoogleMapView2.a:(Lcom/whatsapp/GoogleMapView2;)F
        //   355: f2d            
        //   356: invokestatic    com/whatsapp/GoogleMapView2.a:(Lcom/google/android/gms/maps/model/LatLng;DD)Lcom/google/android/gms/maps/model/LatLng;
        //   359: astore          22
        //   361: invokestatic    com/google/android/gms/maps/model/CameraPosition.builder:()Lcom/google/android/gms/maps/model/CameraPosition$Builder;
        //   364: aload_0        
        //   365: getfield        com/whatsapp/a8i.a:Lcom/whatsapp/GoogleMapView2;
        //   368: invokestatic    com/whatsapp/GoogleMapView2.f:(Lcom/whatsapp/GoogleMapView2;)F
        //   371: fconst_0       
        //   372: ldc             67.5
        //   374: invokestatic    com/whatsapp/GoogleMapView2.a:(FFF)F
        //   377: invokevirtual   com/google/android/gms/maps/model/CameraPosition$Builder.tilt:(F)Lcom/google/android/gms/maps/model/CameraPosition$Builder;
        //   380: aload_0        
        //   381: getfield        com/whatsapp/a8i.a:Lcom/whatsapp/GoogleMapView2;
        //   384: invokestatic    com/whatsapp/GoogleMapView2.a:(Lcom/whatsapp/GoogleMapView2;)F
        //   387: invokevirtual   com/google/android/gms/maps/model/CameraPosition$Builder.bearing:(F)Lcom/google/android/gms/maps/model/CameraPosition$Builder;
        //   390: aload_0        
        //   391: getfield        com/whatsapp/a8i.a:Lcom/whatsapp/GoogleMapView2;
        //   394: invokestatic    com/whatsapp/GoogleMapView2.g:(Lcom/whatsapp/GoogleMapView2;)F
        //   397: ldc             15.0
        //   399: invokestatic    java/lang/Math.max:(FF)F
        //   402: invokevirtual   com/google/android/gms/maps/model/CameraPosition$Builder.zoom:(F)Lcom/google/android/gms/maps/model/CameraPosition$Builder;
        //   405: aload           22
        //   407: invokevirtual   com/google/android/gms/maps/model/CameraPosition$Builder.target:(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CameraPosition$Builder;
        //   410: invokevirtual   com/google/android/gms/maps/model/CameraPosition$Builder.build:()Lcom/google/android/gms/maps/model/CameraPosition;
        //   413: astore          23
        //   415: aload_0        
        //   416: getfield        com/whatsapp/a8i.a:Lcom/whatsapp/GoogleMapView2;
        //   419: invokevirtual   com/whatsapp/GoogleMapView2.getMap:()Lcom/google/android/gms/maps/GoogleMap;
        //   422: aload           23
        //   424: invokestatic    com/google/android/gms/maps/CameraUpdateFactory.newCameraPosition:(Lcom/google/android/gms/maps/model/CameraPosition;)Lcom/google/android/gms/maps/CameraUpdate;
        //   427: invokevirtual   com/google/android/gms/maps/GoogleMap.moveCamera:(Lcom/google/android/gms/maps/CameraUpdate;)V
        //   430: return         
        //   431: astore          4
        //   433: aload_1        
        //   434: getfield        android/hardware/SensorEvent.values:[F
        //   437: arraylength    
        //   438: iconst_3       
        //   439: if_icmple       34
        //   442: aload_1        
        //   443: getfield        android/hardware/SensorEvent.values:[F
        //   446: iconst_0       
        //   447: aload_0        
        //   448: getfield        com/whatsapp/a8i.a:Lcom/whatsapp/GoogleMapView2;
        //   451: invokestatic    com/whatsapp/GoogleMapView2.h:(Lcom/whatsapp/GoogleMapView2;)[F
        //   454: iconst_0       
        //   455: iconst_3       
        //   456: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   459: aload_0        
        //   460: getfield        com/whatsapp/a8i.a:Lcom/whatsapp/GoogleMapView2;
        //   463: invokestatic    com/whatsapp/GoogleMapView2.b:(Lcom/whatsapp/GoogleMapView2;)[F
        //   466: aload_0        
        //   467: getfield        com/whatsapp/a8i.a:Lcom/whatsapp/GoogleMapView2;
        //   470: invokestatic    com/whatsapp/GoogleMapView2.h:(Lcom/whatsapp/GoogleMapView2;)[F
        //   473: invokestatic    android/hardware/SensorManager.getRotationMatrixFromVector:([F[F)V
        //   476: goto            34
        //   479: astore          5
        //   481: aload           5
        //   483: athrow         
        //   484: astore          7
        //   486: aload           7
        //   488: athrow         
        //   489: astore          8
        //   491: aload           8
        //   493: athrow         
        //   494: iload_2        
        //   495: ifeq            168
        //   498: fload           14
        //   500: ldc             90.0
        //   502: fadd           
        //   503: fstore          14
        //   505: iload_2        
        //   506: ifeq            168
        //   509: fload           14
        //   511: ldc             180.0
        //   513: fadd           
        //   514: fstore          14
        //   516: iload_2        
        //   517: ifeq            168
        //   520: fload           14
        //   522: ldc             270.0
        //   524: fadd           
        //   525: fstore          14
        //   527: goto            168
        //   530: astore          17
        //   532: aload           17
        //   534: athrow         
        //   535: astore          18
        //   537: aload           18
        //   539: athrow         
        //   540: astore          19
        //   542: aload           19
        //   544: athrow         
        //   545: fload           14
        //   547: fstore          15
        //   549: goto            182
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  20     34     431    484    Ljava/lang/IllegalArgumentException;
        //  46     57     484    489    Ljava/lang/IllegalArgumentException;
        //  69     82     489    494    Ljava/lang/IllegalArgumentException;
        //  231    255    530    540    Ljava/lang/IllegalArgumentException;
        //  266    291    540    545    Ljava/lang/IllegalArgumentException;
        //  295    320    540    545    Ljava/lang/IllegalArgumentException;
        //  433    476    479    484    Ljava/lang/IllegalArgumentException;
        //  486    489    489    494    Ljava/lang/IllegalArgumentException;
        //  532    535    535    540    Ljava/lang/IllegalArgumentException;
        //  537    540    540    545    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 255, Size: 255
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
