// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View$OnClickListener;
import com.whatsapp.protocol.bi;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

public class ConversationRowContact extends ConversationRow
{
    private static final String H;
    private final TextView F;
    private final ImageView G;
    
    static {
        final char[] charArray = "5\u0016\u0016 \u000e$\n\u0019\"\u00029\u0017U$\u0004!T\u001b9\u0005\"\u0018\u001b\"D5\u0016\u0016\"\n5\rU\"\u0003#\u0014\u001ay\t7\n\u001d`_{\u001d\u001d5\u00042\u001cW3\u0019$\u0016\n".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'k';
                    break;
                }
                case 0: {
                    c2 = 'V';
                    break;
                }
                case 1: {
                    c2 = 'y';
                    break;
                }
                case 2: {
                    c2 = 'x';
                    break;
                }
                case 3: {
                    c2 = 'V';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        H = new String(charArray).intern();
    }
    
    ConversationRowContact(final Context context, final bi bi) {
        super(context, bi);
        this.F = (TextView)this.findViewById(2131755482);
        this.G = (ImageView)this.findViewById(2131755367);
        this.F.setOnClickListener((View$OnClickListener)new a08(this, null));
        this.b(bi);
    }
    
    private void b(final bi p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/ConversationRowContact.F:Landroid/widget/TextView;
        //     4: aload_0        
        //     5: aload_1        
        //     6: getfield        com/whatsapp/protocol/bi.k:Ljava/lang/String;
        //     9: aload_0        
        //    10: invokevirtual   com/whatsapp/ConversationRowContact.getContext:()Landroid/content/Context;
        //    13: aload_0        
        //    14: getfield        com/whatsapp/ConversationRowContact.F:Landroid/widget/TextView;
        //    17: invokevirtual   android/widget/TextView.getPaint:()Landroid/text/TextPaint;
        //    20: invokestatic    com/whatsapp/util/cq.b:(Ljava/lang/String;Landroid/content/Context;Landroid/graphics/Paint;)Ljava/lang/CharSequence;
        //    23: invokevirtual   com/whatsapp/ConversationRowContact.a:(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
        //    26: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    29: aload_1        
        //    30: invokevirtual   com/whatsapp/protocol/bi.c:()Ljava/lang/String;
        //    33: invokestatic    o.h:(Ljava/lang/String;)Lo;
        //    36: astore          14
        //    38: aload           14
        //    40: astore_3       
        //    41: aconst_null    
        //    42: astore          4
        //    44: aload_3        
        //    45: ifnull          102
        //    48: aload_3        
        //    49: getfield        o.i:[B
        //    52: astore          8
        //    54: aconst_null    
        //    55: astore          4
        //    57: aload           8
        //    59: ifnull          102
        //    62: aload_3        
        //    63: getfield        o.i:[B
        //    66: arraylength    
        //    67: istore          9
        //    69: aconst_null    
        //    70: astore          4
        //    72: iload           9
        //    74: ifle            102
        //    77: aload_3        
        //    78: getfield        o.i:[B
        //    81: iconst_0       
        //    82: invokestatic    android/backport/util/Base64.decode:([BI)[B
        //    85: astore          11
        //    87: aload           11
        //    89: iconst_0       
        //    90: aload           11
        //    92: arraylength    
        //    93: invokestatic    android/graphics/BitmapFactory.decodeByteArray:([BII)Landroid/graphics/Bitmap;
        //    96: astore          12
        //    98: aload           12
        //   100: astore          4
        //   102: aload           4
        //   104: ifnull          122
        //   107: aload_0        
        //   108: getfield        com/whatsapp/ConversationRowContact.G:Landroid/widget/ImageView;
        //   111: aload           4
        //   113: invokevirtual   android/widget/ImageView.setImageBitmap:(Landroid/graphics/Bitmap;)V
        //   116: getstatic       com/whatsapp/App.I:Z
        //   119: ifeq            150
        //   122: aload_0        
        //   123: getfield        com/whatsapp/ConversationRowContact.G:Landroid/widget/ImageView;
        //   126: ldc             2130838818
        //   128: invokevirtual   android/widget/ImageView.setImageResource:(I)V
        //   131: aload_0        
        //   132: getfield        com/whatsapp/ConversationRowContact.G:Landroid/widget/ImageView;
        //   135: aload_0        
        //   136: invokevirtual   com/whatsapp/ConversationRowContact.getContext:()Landroid/content/Context;
        //   139: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   142: ldc             2131623981
        //   144: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   147: invokevirtual   android/widget/ImageView.setBackgroundColor:(I)V
        //   150: return         
        //   151: astore_2       
        //   152: aload_2        
        //   153: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/Throwable;)V
        //   156: aconst_null    
        //   157: astore_3       
        //   158: goto            41
        //   161: astore          13
        //   163: aload           13
        //   165: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   168: aconst_null    
        //   169: astore_3       
        //   170: goto            41
        //   173: astore          6
        //   175: aload           6
        //   177: athrow         
        //   178: astore          7
        //   180: aload           7
        //   182: athrow         
        //   183: astore          10
        //   185: getstatic       com/whatsapp/ConversationRowContact.H:Ljava/lang/String;
        //   188: aload           10
        //   190: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   193: aconst_null    
        //   194: astore          4
        //   196: goto            102
        //   199: astore          5
        //   201: aload           5
        //   203: athrow         
        //   204: astore          10
        //   206: goto            185
        //   209: astore          10
        //   211: goto            185
        //   214: astore_2       
        //   215: goto            152
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  29     38     214    218    Ljava/io/UnsupportedEncodingException;
        //  29     38     151    152    La;
        //  29     38     161    173    Ljava/io/IOException;
        //  48     54     173    178    Ljava/io/UnsupportedEncodingException;
        //  62     69     178    183    Ljava/io/UnsupportedEncodingException;
        //  77     98     183    185    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  77     98     209    214    Ljava/lang/StringIndexOutOfBoundsException;
        //  77     98     204    209    Ljava/lang/IllegalArgumentException;
        //  107    122    199    204    Ljava/io/UnsupportedEncodingException;
        //  122    150    199    204    Ljava/io/UnsupportedEncodingException;
        //  175    178    178    183    Ljava/io/UnsupportedEncodingException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 106, Size: 106
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
    
    @Override
    public void a(final bi p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/ConversationRowContact.t:Lcom/whatsapp/protocol/bi;
        //     4: astore          5
        //     6: aload           5
        //     8: aload_1        
        //     9: if_acmpne       16
        //    12: iload_2        
        //    13: ifeq            21
        //    16: aload_0        
        //    17: aload_1        
        //    18: invokespecial   com/whatsapp/ConversationRowContact.b:(Lcom/whatsapp/protocol/bi;)V
        //    21: aload_0        
        //    22: aload_1        
        //    23: iload_2        
        //    24: invokespecial   com/whatsapp/ConversationRow.a:(Lcom/whatsapp/protocol/bi;Z)V
        //    27: return         
        //    28: astore_3       
        //    29: aload_3        
        //    30: athrow         
        //    31: astore          4
        //    33: aload           4
        //    35: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  0      6      28     31     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  16     21     31     36     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  29     31     31     36     Ljava/lang/ArrayIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0016:
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
    
    @Override
    protected int b() {
        return 2130903116;
    }
    
    @Override
    protected int p() {
        return 2130903117;
    }
}
