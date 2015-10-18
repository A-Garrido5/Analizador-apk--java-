// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Bitmap;
import android.widget.ImageView;

public class a9q
{
    private a2r a;
    private final float b;
    private md c;
    private final int d;
    
    public a9q() {
        this(App.aq.getResources().getDimensionPixelSize(2131361952), App.aq.getResources().getDimensionPixelSize(2131361814));
    }
    
    public a9q(final int d, final float b) {
        this.c = null;
        this.a = new a2r(null);
        this.d = d;
        this.b = b;
    }
    
    static float a(final a9q a9q) {
        return a9q.b;
    }
    
    private void a(final a_9 p0, final ImageView p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/a9q.a:Lcom/whatsapp/a2r;
        //     4: invokestatic    com/whatsapp/a2r.a:(Lcom/whatsapp/a2r;)Ljava/util/Stack;
        //     7: astore_3       
        //     8: aload_3        
        //     9: monitorenter   
        //    10: aload_0        
        //    11: getfield        com/whatsapp/a9q.a:Lcom/whatsapp/a2r;
        //    14: aload_2        
        //    15: invokevirtual   com/whatsapp/a2r.a:(Landroid/widget/ImageView;)V
        //    18: aload_3        
        //    19: monitorexit    
        //    20: new             Lcom/whatsapp/wn;
        //    23: dup            
        //    24: aload_1        
        //    25: aload_2        
        //    26: invokespecial   com/whatsapp/wn.<init>:(Lcom/whatsapp/a_9;Landroid/widget/ImageView;)V
        //    29: astore          5
        //    31: aload_0        
        //    32: getfield        com/whatsapp/a9q.a:Lcom/whatsapp/a2r;
        //    35: invokestatic    com/whatsapp/a2r.a:(Lcom/whatsapp/a2r;)Ljava/util/Stack;
        //    38: astore          6
        //    40: aload           6
        //    42: monitorenter   
        //    43: aload_0        
        //    44: getfield        com/whatsapp/a9q.a:Lcom/whatsapp/a2r;
        //    47: invokestatic    com/whatsapp/a2r.a:(Lcom/whatsapp/a2r;)Ljava/util/Stack;
        //    50: iconst_0       
        //    51: aload           5
        //    53: invokevirtual   java/util/Stack.add:(ILjava/lang/Object;)V
        //    56: aload_0        
        //    57: getfield        com/whatsapp/a9q.a:Lcom/whatsapp/a2r;
        //    60: invokestatic    com/whatsapp/a2r.a:(Lcom/whatsapp/a2r;)Ljava/util/Stack;
        //    63: invokevirtual   java/lang/Object.notifyAll:()V
        //    66: aload           6
        //    68: monitorexit    
        //    69: aload_0        
        //    70: getfield        com/whatsapp/a9q.c:Lcom/whatsapp/md;
        //    73: ifnonnull       103
        //    76: aload_0        
        //    77: new             Lcom/whatsapp/md;
        //    80: dup            
        //    81: aload_0        
        //    82: invokespecial   com/whatsapp/md.<init>:(Lcom/whatsapp/a9q;)V
        //    85: putfield        com/whatsapp/a9q.c:Lcom/whatsapp/md;
        //    88: aload_0        
        //    89: getfield        com/whatsapp/a9q.c:Lcom/whatsapp/md;
        //    92: iconst_4       
        //    93: invokevirtual   com/whatsapp/md.setPriority:(I)V
        //    96: aload_0        
        //    97: getfield        com/whatsapp/a9q.c:Lcom/whatsapp/md;
        //   100: invokevirtual   com/whatsapp/md.start:()V
        //   103: return         
        //   104: astore          4
        //   106: aload_3        
        //   107: monitorexit    
        //   108: aload           4
        //   110: athrow         
        //   111: astore          7
        //   113: aload           6
        //   115: monitorexit    
        //   116: aload           7
        //   118: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  10     20     104    111    Any
        //  43     69     111    119    Any
        //  106    108    104    111    Any
        //  113    116    111    119    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0103:
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
    
    static a2r b(final a9q a9q) {
        return a9q.a;
    }
    
    static int c(final a9q a9q) {
        return a9q.d;
    }
    
    public void a() {
        if (this.c != null) {
            this.c.interrupt();
            this.c = null;
        }
    }
    
    public void b(final a_9 a_9, final ImageView imageView) {
        imageView.setContentDescription((CharSequence)a_9.a(imageView.getContext()));
        final String c = a_9.c(this.d, this.b);
        if (c == null) {
            imageView.setImageBitmap(a_9.x());
        }
        else {
            final boolean equals = c.equals(imageView.getTag());
            imageView.setTag((Object)c);
            final Bitmap imageBitmap = (Bitmap)App.Z.get(c);
            if (imageBitmap != null) {
                imageView.setImageBitmap(imageBitmap);
                return;
            }
            if (!equals) {
                imageView.setImageBitmap(a_9.x());
            }
            if (a_9.h) {
                this.a(a_9, imageView);
            }
        }
    }
}
