// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Message;
import android.os.Looper;
import android.os.Handler;

class o2 extends Handler
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[5];
        String s = "<b`0#9q";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'B';
                        break;
                    }
                    case 0: {
                        c2 = 'M';
                        break;
                    }
                    case 1: {
                        c2 = '\u0010';
                        break;
                    }
                    case 2: {
                        c2 = '?';
                        break;
                    }
                    case 3: {
                        c2 = 'T';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "<b`0#9q";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "(`P7*";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "(`P7*";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "<bL11>yP:m=uM'+>d~76$\u007fQ\u0017#.xZ{$,yS";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public o2() {
        super(Looper.getMainLooper());
    }
    
    public void a() {
        this.sendEmptyMessageDelayed(1, 2000L);
    }
    
    public void b() {
        this.sendEmptyMessage(2);
    }
    
    public void handleMessage(final Message p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: getfield        android/os/Message.what:I
        //     8: tableswitch {
        //                2: 32
        //                3: 130
        //          default: 197
        //        }
        //    32: aload_0        
        //    33: iconst_1       
        //    34: invokevirtual   com/whatsapp/o2.removeMessages:(I)V
        //    37: aload_0        
        //    38: iconst_2       
        //    39: invokevirtual   com/whatsapp/o2.hasMessages:(I)Z
        //    42: istore          9
        //    44: iload           9
        //    46: ifeq            53
        //    49: iload_2        
        //    50: ifeq            197
        //    53: getstatic       com/whatsapp/l7.o:Ljava/util/Map;
        //    56: astore          11
        //    58: aload           11
        //    60: monitorenter   
        //    61: new             Ljava/io/ObjectOutputStream;
        //    64: dup            
        //    65: new             Ljava/io/FileOutputStream;
        //    68: dup            
        //    69: invokestatic    com/whatsapp/l7.m:()Ljava/io/File;
        //    72: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    75: invokespecial   java/io/ObjectOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    78: astore          12
        //    80: aload           12
        //    82: getstatic       com/whatsapp/l7.o:Ljava/util/Map;
        //    85: invokevirtual   java/io/ObjectOutputStream.writeObject:(Ljava/lang/Object;)V
        //    88: aload           12
        //    90: invokevirtual   java/io/ObjectOutputStream.close:()V
        //    93: aload           11
        //    95: monitorexit    
        //    96: getstatic       com/whatsapp/o2.z:[Ljava/lang/String;
        //    99: iconst_0       
        //   100: aaload         
        //   101: getstatic       com/whatsapp/o2.z:[Ljava/lang/String;
        //   104: iconst_2       
        //   105: aaload         
        //   106: getstatic       com/whatsapp/l7.u:Ljava/lang/String;
        //   109: invokestatic    com/whatsapp/l7.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
        //   112: pop            
        //   113: return         
        //   114: astore          10
        //   116: getstatic       com/whatsapp/o2.z:[Ljava/lang/String;
        //   119: iconst_4       
        //   120: aaload         
        //   121: aload           10
        //   123: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   126: iload_2        
        //   127: ifeq            197
        //   130: aload_0        
        //   131: iconst_1       
        //   132: invokevirtual   com/whatsapp/o2.removeMessages:(I)V
        //   135: aload_0        
        //   136: iconst_2       
        //   137: invokevirtual   com/whatsapp/o2.removeMessages:(I)V
        //   140: getstatic       com/whatsapp/l7.o:Ljava/util/Map;
        //   143: astore          5
        //   145: aload           5
        //   147: monitorenter   
        //   148: invokestatic    com/whatsapp/l7.m:()Ljava/io/File;
        //   151: invokevirtual   java/io/File.delete:()Z
        //   154: pop            
        //   155: aload           5
        //   157: monitorexit    
        //   158: getstatic       com/whatsapp/o2.z:[Ljava/lang/String;
        //   161: iconst_1       
        //   162: aaload         
        //   163: getstatic       com/whatsapp/o2.z:[Ljava/lang/String;
        //   166: iconst_3       
        //   167: aaload         
        //   168: invokestatic    com/whatsapp/l7.e:(Ljava/lang/String;Ljava/lang/String;)Z
        //   171: pop            
        //   172: return         
        //   173: astore_3       
        //   174: aload_3        
        //   175: athrow         
        //   176: astore          4
        //   178: aload           4
        //   180: athrow         
        //   181: astore          13
        //   183: aload           11
        //   185: monitorexit    
        //   186: aload           13
        //   188: athrow         
        //   189: astore          6
        //   191: aload           5
        //   193: monitorexit    
        //   194: aload           6
        //   196: athrow         
        //   197: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      32     173    181    Ljava/lang/Exception;
        //  32     44     173    181    Ljava/lang/Exception;
        //  53     61     114    130    Ljava/lang/Exception;
        //  61     96     181    189    Any
        //  96     113    114    130    Ljava/lang/Exception;
        //  148    158    189    197    Any
        //  174    176    176    181    Ljava/lang/Exception;
        //  183    186    181    189    Any
        //  186    189    114    130    Ljava/lang/Exception;
        //  191    194    189    197    Any
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
