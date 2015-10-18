// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import java.util.ArrayList;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.CountDownLatch;

class cc implements Runnable
{
    private static final String[] z;
    final long a;
    final GoogleDriveService b;
    final CountDownLatch c;
    final AtomicBoolean d;
    final String e;
    final File f;
    final String g;
    final ArrayList h;
    final AtomicBoolean i;
    final AtomicBoolean j;
    final String k;
    
    static {
        final String[] z2 = new String[3];
        String s = "AaV2'C(W>#PlG>~T`W/>T`\t=8J`W";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'Q';
                        break;
                    }
                    case 0: {
                        c2 = '&';
                        break;
                    }
                    case 1: {
                        c2 = '\u0005';
                        break;
                    }
                    case 2: {
                        c2 = '$';
                        break;
                    }
                    case 3: {
                        c2 = '[';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "AaV2'C(W>#PlG>~T`W/>T`\t=8J`W";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "AaV2'C(W>#PlG>~T`W/>T`\t=8J`W";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    cc(final GoogleDriveService b, final AtomicBoolean i, final AtomicBoolean j, final AtomicBoolean d, final File f, final String e, final String k, final long a, final ArrayList h, final String g, final CountDownLatch c) {
        this.b = b;
        this.i = i;
        this.j = j;
        this.d = d;
        this.f = f;
        this.e = e;
        this.k = k;
        this.a = a;
        this.h = h;
        this.g = g;
        this.c = c;
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/gdrive/cc.b:Lcom/whatsapp/gdrive/GoogleDriveService;
        //     4: invokestatic    com/whatsapp/gdrive/GoogleDriveService.h:(Lcom/whatsapp/gdrive/GoogleDriveService;)Z
        //     7: istore_2       
        //     8: iload_2        
        //     9: ifne            20
        //    12: aload_0        
        //    13: getfield        com/whatsapp/gdrive/cc.c:Ljava/util/concurrent/CountDownLatch;
        //    16: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
        //    19: return         
        //    20: aload_0        
        //    21: getfield        com/whatsapp/gdrive/cc.i:Ljava/util/concurrent/atomic/AtomicBoolean;
        //    24: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //    27: ifne            58
        //    30: aload_0        
        //    31: getfield        com/whatsapp/gdrive/cc.j:Ljava/util/concurrent/atomic/AtomicBoolean;
        //    34: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //    37: istore          5
        //    39: iload           5
        //    41: ifne            58
        //    44: aload_0        
        //    45: getfield        com/whatsapp/gdrive/cc.d:Ljava/util/concurrent/atomic/AtomicBoolean;
        //    48: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //    51: istore          6
        //    53: iload           6
        //    55: ifeq            84
        //    58: aload_0        
        //    59: getfield        com/whatsapp/gdrive/cc.c:Ljava/util/concurrent/CountDownLatch;
        //    62: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
        //    65: return         
        //    66: astore_3       
        //    67: aload_3        
        //    68: athrow         
        //    69: astore          4
        //    71: aload           4
        //    73: athrow         
        //    74: astore_1       
        //    75: aload_0        
        //    76: getfield        com/whatsapp/gdrive/cc.c:Ljava/util/concurrent/CountDownLatch;
        //    79: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
        //    82: aload_1        
        //    83: athrow         
        //    84: aload_0        
        //    85: getfield        com/whatsapp/gdrive/cc.b:Lcom/whatsapp/gdrive/GoogleDriveService;
        //    88: aload_0        
        //    89: getfield        com/whatsapp/gdrive/cc.f:Ljava/io/File;
        //    92: aload_0        
        //    93: getfield        com/whatsapp/gdrive/cc.e:Ljava/lang/String;
        //    96: aload_0        
        //    97: getfield        com/whatsapp/gdrive/cc.k:Ljava/lang/String;
        //   100: aload_0        
        //   101: getfield        com/whatsapp/gdrive/cc.a:J
        //   104: invokestatic    com/whatsapp/gdrive/GoogleDriveService.a:(Lcom/whatsapp/gdrive/GoogleDriveService;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;J)Z
        //   107: istore          22
        //   109: iload           22
        //   111: istore          8
        //   113: iload           8
        //   115: ifeq            157
        //   118: aload_0        
        //   119: getfield        com/whatsapp/gdrive/cc.b:Lcom/whatsapp/gdrive/GoogleDriveService;
        //   122: invokestatic    com/whatsapp/gdrive/GoogleDriveService.o:(Lcom/whatsapp/gdrive/GoogleDriveService;)Ljava/util/concurrent/atomic/AtomicLong;
        //   125: aload_0        
        //   126: getfield        com/whatsapp/gdrive/cc.a:J
        //   129: invokevirtual   java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
        //   132: pop2           
        //   133: aload_0        
        //   134: getfield        com/whatsapp/gdrive/cc.b:Lcom/whatsapp/gdrive/GoogleDriveService;
        //   137: invokestatic    com/whatsapp/gdrive/GoogleDriveService.o:(Lcom/whatsapp/gdrive/GoogleDriveService;)Ljava/util/concurrent/atomic/AtomicLong;
        //   140: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   143: invokestatic    com/whatsapp/gdrive/GoogleDriveService.f:(J)Z
        //   146: pop            
        //   147: getstatic       com/whatsapp/gdrive/GoogleDriveService.F:I
        //   150: istore          19
        //   152: iload           19
        //   154: ifeq            184
        //   157: aload_0        
        //   158: getfield        com/whatsapp/gdrive/cc.b:Lcom/whatsapp/gdrive/GoogleDriveService;
        //   161: invokestatic    com/whatsapp/gdrive/GoogleDriveService.p:(Lcom/whatsapp/gdrive/GoogleDriveService;)Ljava/util/concurrent/atomic/AtomicLong;
        //   164: aload_0        
        //   165: getfield        com/whatsapp/gdrive/cc.a:J
        //   168: invokevirtual   java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
        //   171: pop2           
        //   172: aload_0        
        //   173: getfield        com/whatsapp/gdrive/cc.h:Ljava/util/ArrayList;
        //   176: aload_0        
        //   177: getfield        com/whatsapp/gdrive/cc.g:Ljava/lang/String;
        //   180: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   183: pop            
        //   184: aload_0        
        //   185: getfield        com/whatsapp/gdrive/cc.c:Ljava/util/concurrent/CountDownLatch;
        //   188: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
        //   191: aload_0        
        //   192: getfield        com/whatsapp/gdrive/cc.b:Lcom/whatsapp/gdrive/GoogleDriveService;
        //   195: invokestatic    com/whatsapp/gdrive/GoogleDriveService.h:(Lcom/whatsapp/gdrive/GoogleDriveService;)Z
        //   198: istore          14
        //   200: iload           14
        //   202: ifeq            19
        //   205: aload_0        
        //   206: getfield        com/whatsapp/gdrive/cc.b:Lcom/whatsapp/gdrive/GoogleDriveService;
        //   209: invokestatic    com/whatsapp/gdrive/GoogleDriveService.d:(Lcom/whatsapp/gdrive/GoogleDriveService;)Lcom/whatsapp/gdrive/aq;
        //   212: aload_0        
        //   213: getfield        com/whatsapp/gdrive/cc.b:Lcom/whatsapp/gdrive/GoogleDriveService;
        //   216: invokestatic    com/whatsapp/gdrive/GoogleDriveService.o:(Lcom/whatsapp/gdrive/GoogleDriveService;)Ljava/util/concurrent/atomic/AtomicLong;
        //   219: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   222: aload_0        
        //   223: getfield        com/whatsapp/gdrive/cc.b:Lcom/whatsapp/gdrive/GoogleDriveService;
        //   226: invokestatic    com/whatsapp/gdrive/GoogleDriveService.p:(Lcom/whatsapp/gdrive/GoogleDriveService;)Ljava/util/concurrent/atomic/AtomicLong;
        //   229: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   232: aload_0        
        //   233: getfield        com/whatsapp/gdrive/cc.b:Lcom/whatsapp/gdrive/GoogleDriveService;
        //   236: invokestatic    com/whatsapp/gdrive/GoogleDriveService.f:(Lcom/whatsapp/gdrive/GoogleDriveService;)J
        //   239: invokevirtual   com/whatsapp/gdrive/aq.a:(JJJ)V
        //   242: return         
        //   243: astore          21
        //   245: getstatic       com/whatsapp/gdrive/cc.z:[Ljava/lang/String;
        //   248: iconst_1       
        //   249: aaload         
        //   250: aload           21
        //   252: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   255: aload_0        
        //   256: getfield        com/whatsapp/gdrive/cc.i:Ljava/util/concurrent/atomic/AtomicBoolean;
        //   259: iconst_1       
        //   260: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //   263: aload_0        
        //   264: getfield        com/whatsapp/gdrive/cc.b:Lcom/whatsapp/gdrive/GoogleDriveService;
        //   267: bipush          11
        //   269: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.e:(I)V
        //   272: iconst_0       
        //   273: istore          8
        //   275: goto            113
        //   278: astore          20
        //   280: getstatic       com/whatsapp/gdrive/cc.z:[Ljava/lang/String;
        //   283: iconst_0       
        //   284: aaload         
        //   285: aload           20
        //   287: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   290: aload_0        
        //   291: getfield        com/whatsapp/gdrive/cc.j:Ljava/util/concurrent/atomic/AtomicBoolean;
        //   294: iconst_1       
        //   295: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //   298: aload_0        
        //   299: getfield        com/whatsapp/gdrive/cc.b:Lcom/whatsapp/gdrive/GoogleDriveService;
        //   302: bipush          12
        //   304: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.e:(I)V
        //   307: iconst_0       
        //   308: istore          8
        //   310: goto            113
        //   313: astore          7
        //   315: getstatic       com/whatsapp/gdrive/cc.z:[Ljava/lang/String;
        //   318: iconst_2       
        //   319: aaload         
        //   320: aload           7
        //   322: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   325: aload_0        
        //   326: getfield        com/whatsapp/gdrive/cc.d:Ljava/util/concurrent/atomic/AtomicBoolean;
        //   329: iconst_1       
        //   330: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //   333: aload_0        
        //   334: getfield        com/whatsapp/gdrive/cc.b:Lcom/whatsapp/gdrive/GoogleDriveService;
        //   337: bipush          15
        //   339: invokevirtual   com/whatsapp/gdrive/GoogleDriveService.e:(I)V
        //   342: iconst_0       
        //   343: istore          8
        //   345: goto            113
        //   348: astore          15
        //   350: aload           15
        //   352: athrow         
        //   353: astore          9
        //   355: aload           9
        //   357: athrow         
        //   358: astore          13
        //   360: aload           13
        //   362: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  0      8      74     84     Any
        //  20     39     66     69     Lcom/whatsapp/gdrive/bc;
        //  20     39     74     84     Any
        //  44     53     69     74     Lcom/whatsapp/gdrive/bc;
        //  44     53     74     84     Any
        //  67     69     69     74     Lcom/whatsapp/gdrive/bc;
        //  67     69     74     84     Any
        //  71     74     74     84     Any
        //  84     109    243    278    Lcom/whatsapp/gdrive/bc;
        //  84     109    278    313    Lcom/whatsapp/gdrive/br;
        //  84     109    313    348    Lcom/whatsapp/gdrive/be;
        //  84     109    74     84     Any
        //  118    152    348    353    Lcom/whatsapp/gdrive/bc;
        //  118    152    74     84     Any
        //  157    184    353    358    Lcom/whatsapp/gdrive/bc;
        //  157    184    74     84     Any
        //  191    200    358    363    Lcom/whatsapp/gdrive/bc;
        //  245    272    74     84     Any
        //  280    307    74     84     Any
        //  315    342    74     84     Any
        //  350    353    353    358    Lcom/whatsapp/gdrive/bc;
        //  350    353    74     84     Any
        //  355    358    74     84     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 173, Size: 173
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
