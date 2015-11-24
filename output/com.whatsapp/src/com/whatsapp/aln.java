// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Message;
import android.os.Looper;
import android.annotation.SuppressLint;
import android.os.Handler;

@SuppressLint({ "HandlerLeak" })
final class aln extends Handler
{
    private static final String[] z;
    final VoiceService a;
    
    static {
        final String[] z2 = new String[4];
        String s = "\tv+\b1Zv#I";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'A';
                        break;
                    }
                    case 0: {
                        c2 = ')';
                        break;
                    }
                    case 1: {
                        c2 = '\u0013';
                        break;
                    }
                    case 2: {
                        c2 = 'G';
                        break;
                    }
                    case 3: {
                        c2 = 'i';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "_|.\u0019nZv5\u001f(Jvh\u001a(N}&\u0005\u001e]{5\f M<*\u001a&\u0006";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\t~4";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\\},\u0007.^}g\u0004$Z`&\u000e$\t";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private aln(final VoiceService a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    aln(final VoiceService voiceService, final Looper looper, final qx qx) {
        this(voiceService, looper);
    }
    
    public void handleMessage(final Message p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: invokestatic    java/lang/System.currentTimeMillis:()J
        //     7: lstore_3       
        //     8: aload_1        
        //     9: getfield        android/os/Message.what:I
        //    12: istore          9
        //    14: iload           9
        //    16: tableswitch {
        //                0: 90
        //                1: 122
        //                2: 115
        //                3: 101
        //                4: 108
        //          default: 52
        //        }
        //    52: new             Ljava/lang/IllegalStateException;
        //    55: dup            
        //    56: new             Ljava/lang/StringBuilder;
        //    59: dup            
        //    60: invokespecial   java/lang/StringBuilder.<init>:()V
        //    63: getstatic       com/whatsapp/aln.z:[Ljava/lang/String;
        //    66: iconst_3       
        //    67: aaload         
        //    68: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    71: aload_1        
        //    72: getfield        android/os/Message.what:I
        //    75: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    78: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    81: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    84: athrow         
        //    85: astore          13
        //    87: aload           13
        //    89: athrow         
        //    90: aload_0        
        //    91: invokevirtual   com/whatsapp/aln.getLooper:()Landroid/os/Looper;
        //    94: invokevirtual   android/os/Looper.quit:()V
        //    97: iload_2        
        //    98: ifeq            179
        //   101: invokestatic    com/whatsapp/Voip.acceptCall:()V
        //   104: iload_2        
        //   105: ifeq            179
        //   108: invokestatic    com/whatsapp/Voip.rejectCall:()V
        //   111: iload_2        
        //   112: ifeq            179
        //   115: invokestatic    com/whatsapp/Voip.endCall:()V
        //   118: iload_2        
        //   119: ifeq            179
        //   122: aload_1        
        //   123: getfield        android/os/Message.obj:Ljava/lang/Object;
        //   126: checkcast       Landroid/os/Message;
        //   129: astore          10
        //   131: aload           10
        //   133: ifnull          145
        //   136: aload           10
        //   138: aload_0        
        //   139: getfield        com/whatsapp/aln.a:Lcom/whatsapp/VoiceService;
        //   142: invokestatic    com/whatsapp/messaging/e.a:(Landroid/os/Message;Lcom/whatsapp/messaging/l;)V
        //   145: invokestatic    com/whatsapp/VoiceService.I:()Ljava/util/concurrent/atomic/AtomicInteger;
        //   148: invokevirtual   java/util/concurrent/atomic/AtomicInteger.decrementAndGet:()I
        //   151: istore          14
        //   153: iload           14
        //   155: ifne            179
        //   158: invokestatic    com/whatsapp/Voip.d:()Z
        //   161: istore          17
        //   163: iload           17
        //   165: ifne            179
        //   168: aload_0        
        //   169: getfield        com/whatsapp/aln.a:Lcom/whatsapp/VoiceService;
        //   172: invokestatic    com/whatsapp/VoiceService.q:(Lcom/whatsapp/VoiceService;)V
        //   175: iload_2        
        //   176: ifne            52
        //   179: invokestatic    java/lang/System.currentTimeMillis:()J
        //   182: lload_3        
        //   183: lsub           
        //   184: lstore          15
        //   186: new             Ljava/lang/StringBuilder;
        //   189: dup            
        //   190: invokespecial   java/lang/StringBuilder.<init>:()V
        //   193: getstatic       com/whatsapp/aln.z:[Ljava/lang/String;
        //   196: iconst_1       
        //   197: aaload         
        //   198: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   201: aload_1        
        //   202: getfield        android/os/Message.what:I
        //   205: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   208: getstatic       com/whatsapp/aln.z:[Ljava/lang/String;
        //   211: iconst_0       
        //   212: aaload         
        //   213: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   216: lload           15
        //   218: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   221: getstatic       com/whatsapp/aln.z:[Ljava/lang/String;
        //   224: iconst_2       
        //   225: aaload         
        //   226: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   229: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   232: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   235: return         
        //   236: astore          5
        //   238: aload           5
        //   240: athrow         
        //   241: astore          6
        //   243: aload           6
        //   245: athrow         
        //   246: astore          7
        //   248: aload           7
        //   250: athrow         
        //   251: astore          8
        //   253: aload           8
        //   255: athrow         
        //   256: astore          18
        //   258: aload           18
        //   260: athrow         
        //   261: astore          11
        //   263: aload           11
        //   265: athrow         
        //   266: astore          12
        //   268: aload           12
        //   270: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  8      14     236    241    Ljava/lang/IllegalStateException;
        //  52     85     85     90     Ljava/lang/IllegalStateException;
        //  90     97     241    246    Ljava/lang/IllegalStateException;
        //  101    104    246    251    Ljava/lang/IllegalStateException;
        //  108    111    251    256    Ljava/lang/IllegalStateException;
        //  115    118    251    256    Ljava/lang/IllegalStateException;
        //  136    145    256    261    Ljava/lang/IllegalStateException;
        //  145    153    261    266    Ljava/lang/IllegalStateException;
        //  158    163    266    271    Ljava/lang/IllegalStateException;
        //  168    175    85     90     Ljava/lang/IllegalStateException;
        //  238    241    241    246    Ljava/lang/IllegalStateException;
        //  243    246    246    251    Ljava/lang/IllegalStateException;
        //  248    251    251    256    Ljava/lang/IllegalStateException;
        //  263    266    266    271    Ljava/lang/IllegalStateException;
        //  268    271    85     90     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 113, Size: 113
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
