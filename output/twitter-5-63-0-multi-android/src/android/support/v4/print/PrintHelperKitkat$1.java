// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.print;

import android.print.PrintDocumentAdapter$WriteResultCallback;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintDocumentInfo;
import android.print.PrintDocumentInfo$Builder;
import android.os.Bundle;
import android.print.PrintDocumentAdapter$LayoutResultCallback;
import android.os.CancellationSignal;
import android.graphics.Bitmap;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;

class PrintHelperKitkat$1 extends PrintDocumentAdapter
{
    private PrintAttributes mAttributes;
    final /* synthetic */ PrintHelperKitkat this$0;
    final /* synthetic */ Bitmap val$bitmap;
    final /* synthetic */ PrintHelperKitkat$OnPrintFinishCallback val$callback;
    final /* synthetic */ int val$fittingMode;
    final /* synthetic */ String val$jobName;
    
    PrintHelperKitkat$1(final PrintHelperKitkat this$0, final String val$jobName, final Bitmap val$bitmap, final int val$fittingMode, final PrintHelperKitkat$OnPrintFinishCallback val$callback) {
        this.this$0 = this$0;
        this.val$jobName = val$jobName;
        this.val$bitmap = val$bitmap;
        this.val$fittingMode = val$fittingMode;
        this.val$callback = val$callback;
    }
    
    public void onFinish() {
        if (this.val$callback != null) {
            this.val$callback.onFinish();
        }
    }
    
    public void onLayout(final PrintAttributes printAttributes, final PrintAttributes mAttributes, final CancellationSignal cancellationSignal, final PrintDocumentAdapter$LayoutResultCallback printDocumentAdapter$LayoutResultCallback, final Bundle bundle) {
        int n = 1;
        this.mAttributes = mAttributes;
        final PrintDocumentInfo build = new PrintDocumentInfo$Builder(this.val$jobName).setContentType(n).setPageCount(n).build();
        if (mAttributes.equals((Object)printAttributes)) {
            n = 0;
        }
        printDocumentAdapter$LayoutResultCallback.onLayoutFinished(build, (boolean)(n != 0));
    }
    
    public void onWrite(final PageRange[] p0, final ParcelFileDescriptor p1, final CancellationSignal p2, final PrintDocumentAdapter$WriteResultCallback p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Landroid/print/pdf/PrintedPdfDocument;
        //     3: dup            
        //     4: aload_0        
        //     5: getfield        android/support/v4/print/PrintHelperKitkat$1.this$0:Landroid/support/v4/print/PrintHelperKitkat;
        //     8: getfield        android/support/v4/print/PrintHelperKitkat.mContext:Landroid/content/Context;
        //    11: aload_0        
        //    12: getfield        android/support/v4/print/PrintHelperKitkat$1.mAttributes:Landroid/print/PrintAttributes;
        //    15: invokespecial   android/print/pdf/PrintedPdfDocument.<init>:(Landroid/content/Context;Landroid/print/PrintAttributes;)V
        //    18: astore          5
        //    20: aload           5
        //    22: iconst_1       
        //    23: invokevirtual   android/print/pdf/PrintedPdfDocument.startPage:(I)Landroid/graphics/pdf/PdfDocument$Page;
        //    26: astore          8
        //    28: new             Landroid/graphics/RectF;
        //    31: dup            
        //    32: aload           8
        //    34: invokevirtual   android/graphics/pdf/PdfDocument$Page.getInfo:()Landroid/graphics/pdf/PdfDocument$PageInfo;
        //    37: invokevirtual   android/graphics/pdf/PdfDocument$PageInfo.getContentRect:()Landroid/graphics/Rect;
        //    40: invokespecial   android/graphics/RectF.<init>:(Landroid/graphics/Rect;)V
        //    43: astore          9
        //    45: aload_0        
        //    46: getfield        android/support/v4/print/PrintHelperKitkat$1.this$0:Landroid/support/v4/print/PrintHelperKitkat;
        //    49: aload_0        
        //    50: getfield        android/support/v4/print/PrintHelperKitkat$1.val$bitmap:Landroid/graphics/Bitmap;
        //    53: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //    56: aload_0        
        //    57: getfield        android/support/v4/print/PrintHelperKitkat$1.val$bitmap:Landroid/graphics/Bitmap;
        //    60: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //    63: aload           9
        //    65: aload_0        
        //    66: getfield        android/support/v4/print/PrintHelperKitkat$1.val$fittingMode:I
        //    69: invokestatic    android/support/v4/print/PrintHelperKitkat.access$000:(Landroid/support/v4/print/PrintHelperKitkat;IILandroid/graphics/RectF;I)Landroid/graphics/Matrix;
        //    72: astore          10
        //    74: aload           8
        //    76: invokevirtual   android/graphics/pdf/PdfDocument$Page.getCanvas:()Landroid/graphics/Canvas;
        //    79: aload_0        
        //    80: getfield        android/support/v4/print/PrintHelperKitkat$1.val$bitmap:Landroid/graphics/Bitmap;
        //    83: aload           10
        //    85: aconst_null    
        //    86: invokevirtual   android/graphics/Canvas.drawBitmap:(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
        //    89: aload           5
        //    91: aload           8
        //    93: invokevirtual   android/print/pdf/PrintedPdfDocument.finishPage:(Landroid/graphics/pdf/PdfDocument$Page;)V
        //    96: aload           5
        //    98: new             Ljava/io/FileOutputStream;
        //   101: dup            
        //   102: aload_2        
        //   103: invokevirtual   android/os/ParcelFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
        //   106: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/FileDescriptor;)V
        //   109: invokevirtual   android/print/pdf/PrintedPdfDocument.writeTo:(Ljava/io/OutputStream;)V
        //   112: iconst_1       
        //   113: anewarray       Landroid/print/PageRange;
        //   116: astore          14
        //   118: aload           14
        //   120: iconst_0       
        //   121: getstatic       android/print/PageRange.ALL_PAGES:Landroid/print/PageRange;
        //   124: aastore        
        //   125: aload           4
        //   127: aload           14
        //   129: invokevirtual   android/print/PrintDocumentAdapter$WriteResultCallback.onWriteFinished:([Landroid/print/PageRange;)V
        //   132: aload           5
        //   134: ifnull          142
        //   137: aload           5
        //   139: invokevirtual   android/print/pdf/PrintedPdfDocument.close:()V
        //   142: aload_2        
        //   143: ifnull          150
        //   146: aload_2        
        //   147: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   150: return         
        //   151: astore          11
        //   153: ldc             "PrintHelperKitkat"
        //   155: ldc             "Error writing printed content"
        //   157: aload           11
        //   159: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   162: pop            
        //   163: aload           4
        //   165: aconst_null    
        //   166: invokevirtual   android/print/PrintDocumentAdapter$WriteResultCallback.onWriteFailed:(Ljava/lang/CharSequence;)V
        //   169: goto            132
        //   172: astore          6
        //   174: aload           5
        //   176: ifnull          184
        //   179: aload           5
        //   181: invokevirtual   android/print/pdf/PrintedPdfDocument.close:()V
        //   184: aload_2        
        //   185: ifnull          192
        //   188: aload_2        
        //   189: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   192: aload           6
        //   194: athrow         
        //   195: astore          13
        //   197: return         
        //   198: astore          7
        //   200: goto            192
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  20     96     172    195    Any
        //  96     132    151    172    Ljava/io/IOException;
        //  96     132    172    195    Any
        //  146    150    195    198    Ljava/io/IOException;
        //  153    169    172    195    Any
        //  188    192    198    203    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 94, Size: 94
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
