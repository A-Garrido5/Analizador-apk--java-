// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLng;
import android.widget.Toast;
import com.whatsapp.fieldstats.at;
import android.location.Location;
import android.os.AsyncTask;

class nf extends AsyncTask
{
    private String a;
    private boolean b;
    final LocationPicker2 c;
    private int d;
    private Location e;
    
    protected nf(final LocationPicker2 c, final Location e, final int d, final String a, final boolean b) {
        this.c = c;
        this.e = e;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    protected k_ a(final Void[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/nf.c:Lcom/whatsapp/LocationPicker2;
        //     4: invokestatic    com/whatsapp/LocationPicker2.w:(Lcom/whatsapp/LocationPicker2;)I
        //     7: iconst_3       
        //     8: if_icmpne       36
        //    11: aload_0        
        //    12: getfield        com/whatsapp/nf.e:Landroid/location/Location;
        //    15: aload_0        
        //    16: getfield        com/whatsapp/nf.d:I
        //    19: aconst_null    
        //    20: aload_0        
        //    21: getfield        com/whatsapp/nf.a:Ljava/lang/String;
        //    24: invokestatic    com/whatsapp/k_.b:(Landroid/location/Location;ILjava/lang/String;Ljava/lang/String;)Lcom/whatsapp/k_;
        //    27: astore          22
        //    29: aload           22
        //    31: astore          4
        //    33: aload           4
        //    35: areturn        
        //    36: invokestatic    com/whatsapp/LocationPicker2.i:()J
        //    39: invokestatic    java/lang/System.currentTimeMillis:()J
        //    42: lcmp           
        //    43: ifge            193
        //    46: aload_0        
        //    47: getfield        com/whatsapp/nf.c:Lcom/whatsapp/LocationPicker2;
        //    50: invokestatic    com/whatsapp/LocationPicker2.w:(Lcom/whatsapp/LocationPicker2;)I
        //    53: istore          14
        //    55: iload           14
        //    57: iconst_1       
        //    58: if_icmpne       193
        //    61: aload_0        
        //    62: getfield        com/whatsapp/nf.e:Landroid/location/Location;
        //    65: aload_0        
        //    66: getfield        com/whatsapp/nf.d:I
        //    69: aconst_null    
        //    70: aload_0        
        //    71: getfield        com/whatsapp/nf.a:Ljava/lang/String;
        //    74: invokestatic    com/whatsapp/k_.a:(Landroid/location/Location;ILjava/lang/String;Ljava/lang/String;)Lcom/whatsapp/k_;
        //    77: astore          15
        //    79: aload           15
        //    81: astore          4
        //    83: aload           4
        //    85: invokevirtual   com/whatsapp/k_.a:()Z
        //    88: ifeq            33
        //    91: aload           4
        //    93: invokevirtual   com/whatsapp/k_.b:()Z
        //    96: istore          17
        //    98: iload           17
        //   100: ifeq            33
        //   103: aload_0        
        //   104: getfield        com/whatsapp/nf.c:Lcom/whatsapp/LocationPicker2;
        //   107: iconst_1       
        //   108: invokestatic    com/whatsapp/LocationPicker2.a:(Lcom/whatsapp/LocationPicker2;Z)Z
        //   111: pop            
        //   112: ldc2_w          14400000
        //   115: invokestatic    java/lang/System.currentTimeMillis:()J
        //   118: ladd           
        //   119: invokestatic    com/whatsapp/LocationPicker2.a:(J)J
        //   122: pop2           
        //   123: aload_0        
        //   124: getfield        com/whatsapp/nf.e:Landroid/location/Location;
        //   127: aload_0        
        //   128: getfield        com/whatsapp/nf.d:I
        //   131: aconst_null    
        //   132: aload_0        
        //   133: getfield        com/whatsapp/nf.a:Ljava/lang/String;
        //   136: invokestatic    com/whatsapp/k_.c:(Landroid/location/Location;ILjava/lang/String;Ljava/lang/String;)Lcom/whatsapp/k_;
        //   139: astore          4
        //   141: aload_0        
        //   142: getfield        com/whatsapp/nf.c:Lcom/whatsapp/LocationPicker2;
        //   145: iconst_2       
        //   146: invokestatic    com/whatsapp/LocationPicker2.b:(Lcom/whatsapp/LocationPicker2;I)I
        //   149: pop            
        //   150: aload           4
        //   152: areturn        
        //   153: astore          6
        //   155: aload           6
        //   157: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   160: aload           4
        //   162: areturn        
        //   163: astore          7
        //   165: aload           7
        //   167: athrow         
        //   168: astore          5
        //   170: aload           5
        //   172: astore          6
        //   174: aconst_null    
        //   175: astore          4
        //   177: goto            155
        //   180: astore          16
        //   182: aload           16
        //   184: athrow         
        //   185: astore_3       
        //   186: aload_3        
        //   187: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   190: aload           4
        //   192: areturn        
        //   193: aload_0        
        //   194: getfield        com/whatsapp/nf.c:Lcom/whatsapp/LocationPicker2;
        //   197: iconst_2       
        //   198: invokestatic    com/whatsapp/LocationPicker2.b:(Lcom/whatsapp/LocationPicker2;I)I
        //   201: pop            
        //   202: aload_0        
        //   203: getfield        com/whatsapp/nf.e:Landroid/location/Location;
        //   206: aload_0        
        //   207: getfield        com/whatsapp/nf.d:I
        //   210: aconst_null    
        //   211: aload_0        
        //   212: getfield        com/whatsapp/nf.a:Ljava/lang/String;
        //   215: invokestatic    com/whatsapp/k_.c:(Landroid/location/Location;ILjava/lang/String;Ljava/lang/String;)Lcom/whatsapp/k_;
        //   218: astore          9
        //   220: aload           9
        //   222: astore          4
        //   224: aload           4
        //   226: invokevirtual   com/whatsapp/k_.a:()Z
        //   229: ifeq            33
        //   232: aload           4
        //   234: invokevirtual   com/whatsapp/k_.b:()Z
        //   237: istore          11
        //   239: iload           11
        //   241: ifeq            33
        //   244: aload_0        
        //   245: getfield        com/whatsapp/nf.c:Lcom/whatsapp/LocationPicker2;
        //   248: iconst_1       
        //   249: invokestatic    com/whatsapp/LocationPicker2.a:(Lcom/whatsapp/LocationPicker2;Z)Z
        //   252: pop            
        //   253: aload_0        
        //   254: getfield        com/whatsapp/nf.e:Landroid/location/Location;
        //   257: aload_0        
        //   258: getfield        com/whatsapp/nf.d:I
        //   261: aconst_null    
        //   262: aload_0        
        //   263: getfield        com/whatsapp/nf.a:Ljava/lang/String;
        //   266: invokestatic    com/whatsapp/k_.a:(Landroid/location/Location;ILjava/lang/String;Ljava/lang/String;)Lcom/whatsapp/k_;
        //   269: astore          4
        //   271: aload_0        
        //   272: getfield        com/whatsapp/nf.c:Lcom/whatsapp/LocationPicker2;
        //   275: iconst_1       
        //   276: invokestatic    com/whatsapp/LocationPicker2.b:(Lcom/whatsapp/LocationPicker2;I)I
        //   279: pop            
        //   280: aload           4
        //   282: areturn        
        //   283: astore          10
        //   285: aload           10
        //   287: athrow         
        //   288: astore_2       
        //   289: aload_2        
        //   290: astore_3       
        //   291: aconst_null    
        //   292: astore          4
        //   294: goto            186
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  0      29     168    180    Ljava/io/IOException;
        //  0      29     288    297    Lorg/json/JSONException;
        //  36     55     163    168    Ljava/io/IOException;
        //  36     55     288    297    Lorg/json/JSONException;
        //  61     79     168    180    Ljava/io/IOException;
        //  61     79     288    297    Lorg/json/JSONException;
        //  83     98     180    185    Ljava/io/IOException;
        //  83     98     185    186    Lorg/json/JSONException;
        //  103    150    153    155    Ljava/io/IOException;
        //  103    150    185    186    Lorg/json/JSONException;
        //  165    168    168    180    Ljava/io/IOException;
        //  165    168    288    297    Lorg/json/JSONException;
        //  182    185    153    155    Ljava/io/IOException;
        //  182    185    185    186    Lorg/json/JSONException;
        //  193    220    168    180    Ljava/io/IOException;
        //  193    220    288    297    Lorg/json/JSONException;
        //  224    239    283    288    Ljava/io/IOException;
        //  224    239    185    186    Lorg/json/JSONException;
        //  244    280    153    155    Ljava/io/IOException;
        //  244    280    185    186    Lorg/json/JSONException;
        //  285    288    153    155    Ljava/io/IOException;
        //  285    288    185    186    Lorg/json/JSONException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 150, Size: 150
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
    
    protected void a(final k_ k_) {
        final boolean i = App.I;
        if (!this.isCancelled()) {
            if (k_ != null) {
                LocationPicker2.a(this.c, k_);
                if (LocationPicker2.k(this.c).g() != 3) {
                    LocationPicker2.k(this.c).a(this.e);
                }
            }
            Label_0103: {
                if (k_ != null) {
                    LocationPicker2.a(this.c, at.OK);
                    LocationPicker2.a(this.c, k_.e());
                    if (!i) {
                        break Label_0103;
                    }
                }
                LocationPicker2.a(this.c, at.FAILED);
                LocationPicker2.a(this.c, 0);
            }
            LocationPicker2.z(this.c).setVisibility(8);
            LocationPicker2.i(this.c).setVisibility(8);
            Label_0194: {
                if (LocationPicker2.k(this.c).a()) {
                    Toast.makeText(this.c.getApplicationContext(), (CharSequence)this.c.getString(2131231423), 1).show();
                    this.c.findViewById(2131755644).setVisibility(0);
                    if (!i) {
                        break Label_0194;
                    }
                }
                this.c.findViewById(2131755644).setVisibility(8);
            }
            LocationPicker2.m(this.c);
            LocationPicker2.c(this.c).notifyDataSetChanged();
            LocationPicker2.n(this.c);
            if (this.b && !LocationPicker2.k(this.c).a()) {
                final Iterator<PlaceInfo> iterator = LocationPicker2.k(this.c).d().iterator();
                double min = 90.0;
                double max = -90.0;
                double min2 = 180.0;
                double n = -180.0;
                while (true) {
                    while (iterator.hasNext()) {
                        final PlaceInfo placeInfo = iterator.next();
                        min = Math.min(min, placeInfo.lat);
                        max = Math.max(max, placeInfo.lat);
                        min2 = Math.min(min2, placeInfo.lon);
                        final double max2 = Math.max(n, placeInfo.lon);
                        if (i) {
                            if (LocationPicker2.k(this.c).e() <= 1) {
                                LocationPicker2.g(this.c).animateCamera(CameraUpdateFactory.newLatLng(new LatLng((min + max) / 2.0, (min2 + max2) / 2.0)));
                                LocationPicker2.g(this.c).animateCamera(CameraUpdateFactory.zoomTo(18.0f));
                                if (!i) {
                                    return;
                                }
                            }
                            LocationPicker2.g(this.c).animateCamera(CameraUpdateFactory.newLatLngBounds(new LatLngBounds(new LatLng(min, min2), new LatLng(max, max2)), (int)(16.0f * vc.b().b)));
                            return;
                        }
                        n = max2;
                    }
                    final double max2 = n;
                    continue;
                }
            }
        }
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((k_)o);
    }
}
