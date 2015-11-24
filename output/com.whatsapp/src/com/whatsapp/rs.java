// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.ConditionVariable;

final class rs
{
    private static final String[] z;
    final int a;
    final int b;
    final ConditionVariable c;
    final ConditionVariable d;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u001dn\t1\n\u0011n\t1\u0001\u0019p\u001d1\u0003\u000eA\u0014m\u0015\u000f>\u0010p\u0006\u0019l\u000bk\u0002\b{\u001d";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'r';
                        break;
                    }
                    case 0: {
                        c2 = '|';
                        break;
                    }
                    case 1: {
                        c2 = '\u001e';
                        break;
                    }
                    case 2: {
                        c2 = 'y';
                        break;
                    }
                    case 3: {
                        c2 = '\u001e';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "\u001dn\t1\n\u0011n\t1\u0001\u0019p\u001d1\u0003\u000eA\u0014m\u0015\u000f>\u0018i\u0013\u0015jYj\u001b\u0011{\u0016k\u0006\\;\u001d>W\u0018";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    rs(final ConditionVariable d, final ConditionVariable c, final int a, final int b) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public void a() {
        if (this.c != null && this.a == 0) {
            this.c.open();
        }
        if (3 == this.a) {
            App.ao().getAndIncrement();
            if (App.h().isHeldByCurrentThread()) {
                App.aG().signalAll();
                App.h().unlock();
            }
        }
    }
    
    public void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/rs.d:Landroid/os/ConditionVariable;
        //     8: ifnull          22
        //    11: aload_0        
        //    12: getfield        com/whatsapp/rs.d:Landroid/os/ConditionVariable;
        //    15: ldc2_w          180000
        //    18: invokevirtual   android/os/ConditionVariable.block:(J)Z
        //    21: pop            
        //    22: aload_0        
        //    23: getfield        com/whatsapp/rs.c:Landroid/os/ConditionVariable;
        //    26: ifnull          52
        //    29: aload_0        
        //    30: getfield        com/whatsapp/rs.a:I
        //    33: istore          9
        //    35: iconst_1       
        //    36: iload           9
        //    38: if_icmpne       52
        //    41: aload_0        
        //    42: getfield        com/whatsapp/rs.c:Landroid/os/ConditionVariable;
        //    45: ldc2_w          180000
        //    48: invokevirtual   android/os/ConditionVariable.block:(J)Z
        //    51: pop            
        //    52: iconst_3       
        //    53: aload_0        
        //    54: getfield        com/whatsapp/rs.a:I
        //    57: if_icmpne       145
        //    60: invokestatic    com/whatsapp/App.h:()Ljava/util/concurrent/locks/ReentrantLock;
        //    63: invokevirtual   java/util/concurrent/locks/ReentrantLock.lock:()V
        //    66: invokestatic    com/whatsapp/App.ao:()Ljava/util/concurrent/atomic/AtomicInteger;
        //    69: invokevirtual   java/util/concurrent/atomic/AtomicInteger.get:()I
        //    72: aload_0        
        //    73: getfield        com/whatsapp/rs.b:I
        //    76: if_icmpge       145
        //    79: invokestatic    com/whatsapp/App.aG:()Ljava/util/concurrent/locks/Condition;
        //    82: ldc2_w          8
        //    85: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //    88: invokeinterface java/util/concurrent/locks/Condition.await:(JLjava/util/concurrent/TimeUnit;)Z
        //    93: ifne            66
        //    96: getstatic       com/whatsapp/rs.z:[Ljava/lang/String;
        //    99: iconst_1       
        //   100: aaload         
        //   101: astore          7
        //   103: iconst_2       
        //   104: anewarray       Ljava/lang/Object;
        //   107: astore          8
        //   109: aload           8
        //   111: iconst_0       
        //   112: invokestatic    com/whatsapp/App.ao:()Ljava/util/concurrent/atomic/AtomicInteger;
        //   115: invokevirtual   java/util/concurrent/atomic/AtomicInteger.get:()I
        //   118: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   121: aastore        
        //   122: aload           8
        //   124: iconst_1       
        //   125: aload_0        
        //   126: getfield        com/whatsapp/rs.b:I
        //   129: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   132: aastore        
        //   133: aload           7
        //   135: aconst_null    
        //   136: aload           8
        //   138: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        //   141: iload_1        
        //   142: ifne            66
        //   145: return         
        //   146: astore_2       
        //   147: aload_2        
        //   148: athrow         
        //   149: astore_3       
        //   150: aload_3        
        //   151: athrow         
        //   152: astore          4
        //   154: aload           4
        //   156: athrow         
        //   157: astore          5
        //   159: aload           5
        //   161: athrow         
        //   162: astore          6
        //   164: getstatic       com/whatsapp/rs.z:[Ljava/lang/String;
        //   167: iconst_0       
        //   168: aaload         
        //   169: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   172: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      22     146    149    Ljava/lang/InterruptedException;
        //  22     35     149    152    Ljava/lang/InterruptedException;
        //  41     52     152    157    Ljava/lang/InterruptedException;
        //  52     66     157    162    Ljava/lang/InterruptedException;
        //  79     141    162    173    Ljava/lang/InterruptedException;
        //  150    152    152    157    Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 84, Size: 84
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
