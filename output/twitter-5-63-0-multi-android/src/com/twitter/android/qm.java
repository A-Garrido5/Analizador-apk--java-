// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.util.bq;
import com.twitter.android.util.bc;
import android.graphics.drawable.BitmapDrawable;
import com.twitter.android.widget.fc;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import android.content.res.Resources;
import android.content.Context;
import android.os.AsyncTask;

public class qm extends AsyncTask
{
    private final Context a;
    private final Resources b;
    private final WeakReference c;
    private final WeakReference d;
    private Bitmap e;
    private int f;
    
    public qm(final Context context, final qn qn, final qp qp, final int f) {
        this.a = context.getApplicationContext();
        this.f = f;
        this.b = this.a.getResources();
        this.c = new WeakReference((T)qn);
        this.d = new WeakReference((T)qp);
    }
    
    public static void a(final fc fc) {
        if (fc != null) {
            final BitmapDrawable[] a = fc.a();
            if (a != null) {
                fc.a(null);
                for (int length = a.length, i = 0; i < length; ++i) {
                    a[i].getBitmap().recycle();
                }
            }
        }
    }
    
    private void c(final BitmapDrawable[] array) {
        for (int n = 0; n < -1 + array.length && array[n] != null; ++n) {
            array[n].getBitmap().recycle();
        }
    }
    
    protected void a(final BitmapDrawable[] array) {
        if (array != null) {
            this.c(array);
        }
    }
    
    protected BitmapDrawable[] a(final Bitmap... array) {
        int n = 0;
        final Bitmap e = array[0];
        this.e = e;
        final BitmapDrawable[] array2 = new BitmapDrawable[5];
        try {
            array2[4] = new BitmapDrawable(this.b, e);
            int n2 = 3;
            for (float n3 = 5.0f; n2 >= 0 && !this.isCancelled(); --n2, n3 += 5.0f) {
                array2[n2] = new BitmapDrawable(this.b, bc.a(this.a, e, n3));
            }
            return array2;
        }
        catch (OutOfMemoryError outOfMemoryError) {
            bq.a(outOfMemoryError);
            while (n < -1 + array2.length && array2[n] != null) {
                array2[n].getBitmap().recycle();
                ++n;
            }
            return null;
        }
    }
    
    protected void b(final BitmapDrawable[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/twitter/android/qm.d:Ljava/lang/ref/WeakReference;
        //     4: invokevirtual   java/lang/ref/WeakReference.get:()Ljava/lang/Object;
        //     7: checkcast       Lcom/twitter/android/qp;
        //    10: astore_2       
        //    11: aload_0        
        //    12: getfield        com/twitter/android/qm.c:Ljava/lang/ref/WeakReference;
        //    15: invokevirtual   java/lang/ref/WeakReference.get:()Ljava/lang/Object;
        //    18: checkcast       Lcom/twitter/android/qn;
        //    21: astore_3       
        //    22: aload_1        
        //    23: ifnull          120
        //    26: aload_2        
        //    27: ifnull          120
        //    30: aload_2        
        //    31: aload_1        
        //    32: iconst_0       
        //    33: aaload         
        //    34: invokevirtual   android/graphics/drawable/BitmapDrawable.getBitmap:()Landroid/graphics/Bitmap;
        //    37: iconst_0       
        //    38: invokeinterface com/twitter/android/qp.a:(Landroid/graphics/Bitmap;Z)V
        //    43: new             Lcom/twitter/android/widget/fc;
        //    46: dup            
        //    47: aload_1        
        //    48: invokespecial   com/twitter/android/widget/fc.<init>:([Landroid/graphics/drawable/BitmapDrawable;)V
        //    51: astore          7
        //    53: aload           7
        //    55: iconst_4       
        //    56: invokevirtual   com/twitter/android/widget/fc.a:(I)V
        //    59: iconst_0       
        //    60: istore          4
        //    62: aload_3        
        //    63: ifnull          89
        //    66: aload_3        
        //    67: aload           7
        //    69: invokeinterface com/twitter/android/qn.a:(Lcom/twitter/android/widget/fc;)V
        //    74: aload_0        
        //    75: iconst_4       
        //    76: putfield        com/twitter/android/qm.f:I
        //    79: aload_3        
        //    80: aload_0        
        //    81: getfield        com/twitter/android/qm.f:I
        //    84: invokeinterface com/twitter/android/qn.d:(I)V
        //    89: iload           4
        //    91: ifeq            109
        //    94: aload_2        
        //    95: ifnull          109
        //    98: aload_2        
        //    99: aload_0        
        //   100: getfield        com/twitter/android/qm.e:Landroid/graphics/Bitmap;
        //   103: iconst_1       
        //   104: invokeinterface com/twitter/android/qp.a:(Landroid/graphics/Bitmap;Z)V
        //   109: aload_3        
        //   110: ifnull          119
        //   113: aload_3        
        //   114: invokeinterface com/twitter/android/qn.y:()V
        //   119: return         
        //   120: aload_1        
        //   121: ifnull          129
        //   124: aload_0        
        //   125: aload_1        
        //   126: invokespecial   com/twitter/android/qm.c:([Landroid/graphics/drawable/BitmapDrawable;)V
        //   129: iconst_1       
        //   130: istore          4
        //   132: goto            89
        //   135: astore          6
        //   137: aconst_null    
        //   138: astore          7
        //   140: aload           6
        //   142: invokestatic    com/twitter/library/util/bq.a:(Ljava/lang/OutOfMemoryError;)V
        //   145: aload           7
        //   147: ifnull          156
        //   150: aload           7
        //   152: aconst_null    
        //   153: invokevirtual   com/twitter/android/widget/fc.a:([Landroid/graphics/drawable/BitmapDrawable;)V
        //   156: aload_0        
        //   157: aload_1        
        //   158: invokespecial   com/twitter/android/qm.c:([Landroid/graphics/drawable/BitmapDrawable;)V
        //   161: goto            129
        //   164: astore          5
        //   166: aload           5
        //   168: invokestatic    com/twitter/library/util/bq.a:(Ljava/lang/OutOfMemoryError;)V
        //   171: aload_2        
        //   172: invokeinterface com/twitter/android/qp.b:()V
        //   177: goto            109
        //   180: astore          6
        //   182: goto            140
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  30     53     135    140    Ljava/lang/OutOfMemoryError;
        //  53     59     180    185    Ljava/lang/OutOfMemoryError;
        //  66     89     180    185    Ljava/lang/OutOfMemoryError;
        //  98     109    164    180    Ljava/lang/OutOfMemoryError;
        //  124    129    135    140    Ljava/lang/OutOfMemoryError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0089:
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
