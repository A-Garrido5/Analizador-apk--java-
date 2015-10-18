// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
import java.io.File;

public class p
{
    private static final String[] z;
    private File a;
    private final Lock b;
    private final File c;
    private boolean d;
    
    static {
        final String[] z2 = new String[4];
        String s = "xo6rt#x:qhu0#s}\u007fuxnix08g1ax:nnu=";
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
                        c2 = '\u001c';
                        break;
                    }
                    case 0: {
                        c2 = '\f';
                        break;
                    }
                    case 1: {
                        c2 = '\u001d';
                        break;
                    }
                    case 2: {
                        c2 = 'W';
                        break;
                    }
                    case 3: {
                        c2 = '\u0001';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "xo6rt#y2myxxzsyoh%ruzxxnix08g1ax:nnu=";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "a|/!nii%hy\u007f=%d}ou2e<{u>my,~%d}xt9f<xx:q<jt;d";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "a|/!nii%hy\u007f=%d}ou2e<{u>my,~%d}xt9f<xx:q<ht%";
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
    
    public p(final File c) {
        this.a = null;
        this.d = false;
        this.b = new ReentrantLock();
        this.c = c;
    }
    
    public static boolean a(final File file) {
        final boolean l = Log.l;
        Label_0057: {
            if (!file.isDirectory()) {
                break Label_0057;
            }
            try {
                final File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    final int length = listFiles.length;
                    int i = 0;
                    while (i < length) {
                        if (!a(listFiles[i])) {
                            return false;
                        }
                        ++i;
                        if (l) {
                            break;
                        }
                    }
                }
                return file.delete();
            }
            catch (OutOfMemoryError outOfMemoryError) {
                Log.e(p.z[1] + file.getAbsolutePath());
                return false;
            }
        }
    }
    
    private void b() {
        while (true) {
            while (true) {
                final int n2;
                Label_0124: {
                    synchronized (this) {
                        final boolean l = Log.l;
                        this.f();
                        if (this.a == null || !this.a.exists()) {
                            final int n = 0;
                            this.a = new File(this.c, UUID.randomUUID().toString());
                            n2 = n + 1;
                            if (n < 10 && !this.a.mkdir()) {
                                this.a = new File(this.c, UUID.randomUUID().toString());
                                if (!l) {
                                    break Label_0124;
                                }
                            }
                            if (n2 > 10) {
                                throw new IOException(p.z[3]);
                            }
                        }
                    }
                    break;
                }
                final int n = n2;
                continue;
            }
        }
    }
    // monitorexit(this)
    
    private void f() {
        if (!this.c.exists()) {
            this.c.mkdirs();
            if (!this.c.exists()) {
                this.c.mkdir();
            }
        }
    }
    
    public File a() {
        this.f();
        return this.c;
    }
    
    public void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/util/p.c:Ljava/io/File;
        //     8: invokevirtual   java/io/File.exists:()Z
        //    11: ifeq            151
        //    14: aload_0        
        //    15: getfield        com/whatsapp/util/p.b:Ljava/util/concurrent/locks/Lock;
        //    18: invokeinterface java/util/concurrent/locks/Lock.lock:()V
        //    23: aload_0        
        //    24: iconst_1       
        //    25: putfield        com/whatsapp/util/p.d:Z
        //    28: iconst_0       
        //    29: anewarray       Ljava/io/File;
        //    32: astore_2       
        //    33: aload_0        
        //    34: getfield        com/whatsapp/util/p.c:Ljava/io/File;
        //    37: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //    40: astore          14
        //    42: aload           14
        //    44: astore          5
        //    46: aload           5
        //    48: ifnull          137
        //    51: aload           5
        //    53: arraylength    
        //    54: istore          6
        //    56: iconst_0       
        //    57: istore          7
        //    59: iload           7
        //    61: iload           6
        //    63: if_icmpge       137
        //    66: aload           5
        //    68: iload           7
        //    70: aaload         
        //    71: astore          8
        //    73: aload_0        
        //    74: getfield        com/whatsapp/util/p.a:Ljava/io/File;
        //    77: ifnull          106
        //    80: aload           8
        //    82: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    85: aload_0        
        //    86: getfield        com/whatsapp/util/p.a:Ljava/io/File;
        //    89: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    92: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    95: istore          13
        //    97: iload           13
        //    99: ifeq            106
        //   102: iload_1        
        //   103: ifeq            130
        //   106: aload_0        
        //   107: getfield        com/whatsapp/util/p.b:Ljava/util/concurrent/locks/Lock;
        //   110: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //   115: aload           8
        //   117: invokestatic    com/whatsapp/util/p.a:(Ljava/io/File;)Z
        //   120: pop            
        //   121: aload_0        
        //   122: getfield        com/whatsapp/util/p.b:Ljava/util/concurrent/locks/Lock;
        //   125: invokeinterface java/util/concurrent/locks/Lock.lock:()V
        //   130: iinc            7, 1
        //   133: iload_1        
        //   134: ifeq            59
        //   137: aload_0        
        //   138: iconst_0       
        //   139: putfield        com/whatsapp/util/p.d:Z
        //   142: aload_0        
        //   143: getfield        com/whatsapp/util/p.b:Ljava/util/concurrent/locks/Lock;
        //   146: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //   151: return         
        //   152: astore          4
        //   154: new             Ljava/lang/StringBuilder;
        //   157: dup            
        //   158: invokespecial   java/lang/StringBuilder.<init>:()V
        //   161: getstatic       com/whatsapp/util/p.z:[Ljava/lang/String;
        //   164: iconst_0       
        //   165: aaload         
        //   166: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   169: aload_0        
        //   170: getfield        com/whatsapp/util/p.c:Ljava/io/File;
        //   173: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   179: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   182: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   185: aload_2        
        //   186: astore          5
        //   188: goto            46
        //   191: astore          9
        //   193: aload           9
        //   195: athrow         
        //   196: astore          10
        //   198: aload           10
        //   200: athrow         
        //   201: astore_3       
        //   202: aload_0        
        //   203: iconst_0       
        //   204: putfield        com/whatsapp/util/p.d:Z
        //   207: aload_0        
        //   208: getfield        com/whatsapp/util/p.b:Ljava/util/concurrent/locks/Lock;
        //   211: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //   216: aload_3        
        //   217: athrow         
        //   218: astore          11
        //   220: aload_0        
        //   221: getfield        com/whatsapp/util/p.b:Ljava/util/concurrent/locks/Lock;
        //   224: invokeinterface java/util/concurrent/locks/Lock.lock:()V
        //   229: aload           11
        //   231: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  28     33     201    218    Any
        //  33     42     152    191    Ljava/lang/OutOfMemoryError;
        //  33     42     201    218    Any
        //  51     56     201    218    Any
        //  66     73     201    218    Any
        //  73     97     191    201    Ljava/lang/OutOfMemoryError;
        //  73     97     201    218    Any
        //  106    115    201    218    Any
        //  115    121    218    232    Any
        //  121    130    201    218    Any
        //  154    185    201    218    Any
        //  193    196    196    201    Ljava/lang/OutOfMemoryError;
        //  193    196    201    218    Any
        //  198    201    201    218    Any
        //  220    232    201    218    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0106:
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
    
    public void d() {
        this.b.lock();
        if (!this.d) {
            this.b.unlock();
            bm.a(new am(this));
            if (!Log.l) {
                return;
            }
        }
        this.b.unlock();
    }
    
    public File e() {
        final boolean l = Log.l;
        this.b();
        int n = 0;
        File file = new File(this.a, UUID.randomUUID().toString());
        int n2;
        while (true) {
            n2 = n + 1;
            if (n >= 10 || file.createNewFile()) {
                break;
            }
            file = new File(this.a, UUID.randomUUID().toString());
            if (l) {
                break;
            }
            n = n2;
        }
        if (n2 > 10) {
            throw new IOException(p.z[2]);
        }
        return file;
    }
}
