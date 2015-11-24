// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import com.google.android.maps.GeoPoint;
import android.widget.Toast;
import android.location.Location;
import android.os.AsyncTask;

class ah extends AsyncTask
{
    private boolean a;
    private String b;
    private Location c;
    final LocationPicker d;
    private int e;
    
    protected ah(final LocationPicker d, final Location c, final int e, final String b, final boolean a) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.e = e;
        this.a = a;
    }
    
    protected k_ a(final Void[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/whatsapp/LocationPicker.a:()J
        //     3: invokestatic    java/lang/System.currentTimeMillis:()J
        //     6: lcmp           
        //     7: ifge            138
        //    10: invokestatic    com/whatsapp/LocationPicker.c:()Z
        //    13: istore          10
        //    15: iload           10
        //    17: ifne            138
        //    20: invokestatic    com/whatsapp/App.aM:()Z
        //    23: istore          11
        //    25: iload           11
        //    27: ifeq            138
        //    30: aload_0        
        //    31: getfield        com/whatsapp/ah.c:Landroid/location/Location;
        //    34: aload_0        
        //    35: getfield        com/whatsapp/ah.e:I
        //    38: aconst_null    
        //    39: aload_0        
        //    40: getfield        com/whatsapp/ah.b:Ljava/lang/String;
        //    43: invokestatic    com/whatsapp/k_.a:(Landroid/location/Location;ILjava/lang/String;Ljava/lang/String;)Lcom/whatsapp/k_;
        //    46: astore          12
        //    48: aload           12
        //    50: astore_3       
        //    51: aload_3        
        //    52: invokevirtual   com/whatsapp/k_.a:()Z
        //    55: ifeq            101
        //    58: aload_3        
        //    59: invokevirtual   com/whatsapp/k_.b:()Z
        //    62: istore          14
        //    64: iload           14
        //    66: ifeq            101
        //    69: ldc2_w          14400000
        //    72: invokestatic    java/lang/System.currentTimeMillis:()J
        //    75: ladd           
        //    76: invokestatic    com/whatsapp/LocationPicker.a:(J)J
        //    79: pop2           
        //    80: aload_0        
        //    81: getfield        com/whatsapp/ah.c:Landroid/location/Location;
        //    84: aload_0        
        //    85: getfield        com/whatsapp/ah.e:I
        //    88: aconst_null    
        //    89: aload_0        
        //    90: getfield        com/whatsapp/ah.b:Ljava/lang/String;
        //    93: invokestatic    com/whatsapp/k_.c:(Landroid/location/Location;ILjava/lang/String;Ljava/lang/String;)Lcom/whatsapp/k_;
        //    96: astore          17
        //    98: aload           17
        //   100: astore_3       
        //   101: aload_3        
        //   102: areturn        
        //   103: astore          5
        //   105: aload           5
        //   107: athrow         
        //   108: astore          6
        //   110: aload           6
        //   112: athrow         
        //   113: astore          7
        //   115: aconst_null    
        //   116: astore_3       
        //   117: aload           7
        //   119: astore          8
        //   121: aload           8
        //   123: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   126: aload_3        
        //   127: areturn        
        //   128: astore          13
        //   130: aload           13
        //   132: athrow         
        //   133: astore          8
        //   135: goto            121
        //   138: aload_0        
        //   139: getfield        com/whatsapp/ah.c:Landroid/location/Location;
        //   142: aload_0        
        //   143: getfield        com/whatsapp/ah.e:I
        //   146: aconst_null    
        //   147: aload_0        
        //   148: getfield        com/whatsapp/ah.b:Ljava/lang/String;
        //   151: invokestatic    com/whatsapp/k_.c:(Landroid/location/Location;ILjava/lang/String;Ljava/lang/String;)Lcom/whatsapp/k_;
        //   154: astore          9
        //   156: aload           9
        //   158: areturn        
        //   159: astore_2       
        //   160: aconst_null    
        //   161: astore_3       
        //   162: aload_2        
        //   163: astore          4
        //   165: aload           4
        //   167: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   170: aload_3        
        //   171: areturn        
        //   172: astore          4
        //   174: goto            165
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  0      15     103    108    Ljava/io/IOException;
        //  0      15     159    165    Lorg/json/JSONException;
        //  20     25     108    113    Ljava/io/IOException;
        //  20     25     159    165    Lorg/json/JSONException;
        //  30     48     113    121    Ljava/io/IOException;
        //  30     48     159    165    Lorg/json/JSONException;
        //  51     64     128    133    Ljava/io/IOException;
        //  51     64     172    177    Lorg/json/JSONException;
        //  69     98     133    138    Ljava/io/IOException;
        //  69     98     172    177    Lorg/json/JSONException;
        //  105    108    108    113    Ljava/io/IOException;
        //  105    108    159    165    Lorg/json/JSONException;
        //  110    113    113    121    Ljava/io/IOException;
        //  110    113    159    165    Lorg/json/JSONException;
        //  130    133    133    138    Ljava/io/IOException;
        //  130    133    172    177    Lorg/json/JSONException;
        //  138    156    113    121    Ljava/io/IOException;
        //  138    156    159    165    Lorg/json/JSONException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 91, Size: 91
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
    
    protected void a(final k_ k_) {
        final boolean i = App.I;
        if (!this.isCancelled()) {
            if (k_ != null) {
                LocationPicker.a(this.d, k_);
                LocationPicker.a(this.d).a(this.c);
            }
            LocationPicker.h(this.d).setVisibility(8);
            Label_0117: {
                if (LocationPicker.a(this.d).a()) {
                    Toast.makeText(this.d.getApplicationContext(), (CharSequence)this.d.getString(2131231423), 1).show();
                    this.d.findViewById(2131755644).setVisibility(0);
                    if (!i) {
                        break Label_0117;
                    }
                }
                this.d.findViewById(2131755644).setVisibility(8);
            }
            LocationPicker.k(this.d);
            LocationPicker.b(this.d).notifyDataSetChanged();
            LocationPicker.c(this.d).a();
            LocationPicker.g(this.d).invalidate();
            if (this.a && !LocationPicker.a(this.d).a()) {
                final Iterator<PlaceInfo> iterator = (Iterator<PlaceInfo>)LocationPicker.a(this.d).d().iterator();
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
                            LocationPicker.g(this.d).getController().setCenter(new GeoPoint((int)(1000000.0 * (min + max) / 2.0), (int)(1000000.0 * (min2 + max2) / 2.0)));
                            final int n2 = (int)(1000000.0 * (1.2 * (max - min)));
                            final int n3 = (int)(1000000.0 * (1.2 * (max2 - min2)));
                            if (LocationPicker.a(this.d).e() <= 1) {
                                LocationPicker.g(this.d).getController().setZoom(18);
                                if (!i) {
                                    return;
                                }
                            }
                            LocationPicker.g(this.d).getController().zoomToSpan(n2, n3);
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
