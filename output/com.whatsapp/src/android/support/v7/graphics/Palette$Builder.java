// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.graphics;

import android.support.v4.os.AsyncTaskCompat;
import android.os.AsyncTask;
import java.util.List;
import android.graphics.Bitmap;

public final class Palette$Builder
{
    private static final String[] z;
    private Bitmap mBitmap;
    private Palette$Generator mGenerator;
    private int mMaxColors;
    private int mResizeMaxDimension;
    private List mSwatches;
    
    static {
        final String[] z2 = new String[7];
        String s = "\u0003G}e\u001d1\u000e`{\\/A}(\n B`l";
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
                        c2 = '|';
                        break;
                    }
                    case 0: {
                        c2 = 'A';
                        break;
                    }
                    case 1: {
                        c2 = '.';
                        break;
                    }
                    case 2: {
                        c2 = '\t';
                        break;
                    }
                    case 3: {
                        c2 = '\b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\fGga\u00114C)l\u0015,Kg{\u0015.@){\u0015;K)n\u00133\u000e{m\u000f(T`f\u001ba]ag\t-J){\u0014.[el\\#K)6Aa\u001f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0011\\fk\u00192]ll\\\u0003G}e\u001d1";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0002\\li\b$J)X\u001d-K}|\u0019";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0006Kgm\u000e ZfzR&Kgm\u000e Zl UaMfe\f-K}m\u0018";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0002Aeg\u000ea_|i\u00125Gsi\b(Ag(\u001f.Cyd\u00195Km";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "-Gz|\u0019/K{(\u001f @)f\u00135\u000ekm\\/[ed";
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
    
    public Palette$Builder(final Bitmap mBitmap) {
        this.mMaxColors = 16;
        this.mResizeMaxDimension = 192;
        while (true) {
            if (mBitmap != null) {
                try {
                    if (mBitmap.isRecycled()) {
                        throw new IllegalArgumentException(Palette$Builder.z[0]);
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                this.mBitmap = mBitmap;
                return;
            }
            continue;
        }
    }
    
    public AsyncTask generate(final Palette$PaletteAsyncListener palette$PaletteAsyncListener) {
        if (palette$PaletteAsyncListener == null) {
            try {
                throw new IllegalArgumentException(Palette$Builder.z[6]);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        return AsyncTaskCompat.executeParallel(new Palette$Builder$1(this, palette$PaletteAsyncListener), new Bitmap[] { this.mBitmap });
    }
    
    public Palette generate() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/graphics/Palette$Builder.mBitmap:Landroid/graphics/Bitmap;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnull          112
        //     9: aload_0        
        //    10: getfield        android/support/v7/graphics/Palette$Builder.mResizeMaxDimension:I
        //    13: ifgt            35
        //    16: new             Ljava/lang/IllegalArgumentException;
        //    19: dup            
        //    20: getstatic       android/support/v7/graphics/Palette$Builder.z:[Ljava/lang/String;
        //    23: iconst_1       
        //    24: aaload         
        //    25: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    28: athrow         
        //    29: astore_2       
        //    30: aload_2        
        //    31: athrow         
        //    32: astore_1       
        //    33: aload_1        
        //    34: athrow         
        //    35: aload_0        
        //    36: getfield        android/support/v7/graphics/Palette$Builder.mBitmap:Landroid/graphics/Bitmap;
        //    39: aload_0        
        //    40: getfield        android/support/v7/graphics/Palette$Builder.mResizeMaxDimension:I
        //    43: invokestatic    android/support/v7/graphics/Palette.access$000:(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
        //    46: astore          9
        //    48: iconst_0       
        //    49: ifeq            61
        //    52: aconst_null    
        //    53: getstatic       android/support/v7/graphics/Palette$Builder.z:[Ljava/lang/String;
        //    56: iconst_2       
        //    57: aaload         
        //    58: invokevirtual   android/util/TimingLogger.addSplit:(Ljava/lang/String;)V
        //    61: aload           9
        //    63: aload_0        
        //    64: getfield        android/support/v7/graphics/Palette$Builder.mMaxColors:I
        //    67: invokestatic    android/support/v7/graphics/ColorCutQuantizer.fromBitmap:(Landroid/graphics/Bitmap;I)Landroid/support/v7/graphics/ColorCutQuantizer;
        //    70: astore          10
        //    72: aload           9
        //    74: aload_0        
        //    75: getfield        android/support/v7/graphics/Palette$Builder.mBitmap:Landroid/graphics/Bitmap;
        //    78: if_acmpeq       86
        //    81: aload           9
        //    83: invokevirtual   android/graphics/Bitmap.recycle:()V
        //    86: aload           10
        //    88: invokevirtual   android/support/v7/graphics/ColorCutQuantizer.getQuantizedColors:()Ljava/util/List;
        //    91: astore          4
        //    93: iconst_0       
        //    94: ifeq            106
        //    97: aconst_null    
        //    98: getstatic       android/support/v7/graphics/Palette$Builder.z:[Ljava/lang/String;
        //   101: iconst_5       
        //   102: aaload         
        //   103: invokevirtual   android/util/TimingLogger.addSplit:(Ljava/lang/String;)V
        //   106: getstatic       android/support/v7/graphics/Palette$Swatch.a:Z
        //   109: ifeq            118
        //   112: aload_0        
        //   113: getfield        android/support/v7/graphics/Palette$Builder.mSwatches:Ljava/util/List;
        //   116: astore          4
        //   118: aload_0        
        //   119: getfield        android/support/v7/graphics/Palette$Builder.mGenerator:Landroid/support/v7/graphics/Palette$Generator;
        //   122: ifnonnull       136
        //   125: aload_0        
        //   126: new             Landroid/support/v7/graphics/DefaultGenerator;
        //   129: dup            
        //   130: invokespecial   android/support/v7/graphics/DefaultGenerator.<init>:()V
        //   133: putfield        android/support/v7/graphics/Palette$Builder.mGenerator:Landroid/support/v7/graphics/Palette$Generator;
        //   136: aload_0        
        //   137: getfield        android/support/v7/graphics/Palette$Builder.mGenerator:Landroid/support/v7/graphics/Palette$Generator;
        //   140: aload           4
        //   142: invokevirtual   android/support/v7/graphics/Palette$Generator.generate:(Ljava/util/List;)V
        //   145: iconst_0       
        //   146: ifeq            158
        //   149: aconst_null    
        //   150: getstatic       android/support/v7/graphics/Palette$Builder.z:[Ljava/lang/String;
        //   153: iconst_4       
        //   154: aaload         
        //   155: invokevirtual   android/util/TimingLogger.addSplit:(Ljava/lang/String;)V
        //   158: new             Landroid/support/v7/graphics/Palette;
        //   161: dup            
        //   162: aload           4
        //   164: aload_0        
        //   165: getfield        android/support/v7/graphics/Palette$Builder.mGenerator:Landroid/support/v7/graphics/Palette$Generator;
        //   168: aconst_null    
        //   169: invokespecial   android/support/v7/graphics/Palette.<init>:(Ljava/util/List;Landroid/support/v7/graphics/Palette$Generator;Landroid/support/v7/graphics/Palette$1;)V
        //   172: astore          7
        //   174: iconst_0       
        //   175: ifeq            191
        //   178: aconst_null    
        //   179: getstatic       android/support/v7/graphics/Palette$Builder.z:[Ljava/lang/String;
        //   182: iconst_3       
        //   183: aaload         
        //   184: invokevirtual   android/util/TimingLogger.addSplit:(Ljava/lang/String;)V
        //   187: aconst_null    
        //   188: invokevirtual   android/util/TimingLogger.dumpToLog:()V
        //   191: aload           7
        //   193: areturn        
        //   194: astore          13
        //   196: aload           13
        //   198: athrow         
        //   199: astore          11
        //   201: aload           11
        //   203: athrow         
        //   204: astore          12
        //   206: aload           12
        //   208: athrow         
        //   209: astore          5
        //   211: aload           5
        //   213: athrow         
        //   214: astore          6
        //   216: aload           6
        //   218: athrow         
        //   219: astore          8
        //   221: aload           8
        //   223: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      5      32     35     Ljava/lang/IllegalArgumentException;
        //  9      29     29     32     Ljava/lang/IllegalArgumentException;
        //  33     35     29     32     Ljava/lang/IllegalArgumentException;
        //  52     61     194    199    Ljava/lang/IllegalArgumentException;
        //  72     86     199    204    Ljava/lang/IllegalArgumentException;
        //  97     106    204    209    Ljava/lang/IllegalArgumentException;
        //  118    136    209    214    Ljava/lang/IllegalArgumentException;
        //  136    145    214    219    Ljava/lang/IllegalArgumentException;
        //  149    158    214    219    Ljava/lang/IllegalArgumentException;
        //  178    191    219    224    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 116, Size: 116
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
