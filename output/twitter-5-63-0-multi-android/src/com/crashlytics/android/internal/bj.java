// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class bj
{
    private final File a;
    private final String b;
    private bp c;
    private File d;
    private File e;
    
    public bj(final File a, final String s, final String b) {
        this.a = a;
        this.b = b;
        this.d = new File(a, s);
        this.c = new bp(this.d);
        this.e = new File(this.a, this.b);
        if (!this.e.exists()) {
            this.e.mkdirs();
        }
    }
    
    public int a() {
        return this.c.a();
    }
    
    public List a(final int n) {
        final ArrayList<File> list = new ArrayList<File>();
        final File[] listFiles = this.e.listFiles();
        for (int length = listFiles.length, i = 0; i < length; ++i) {
            list.add(listFiles[i]);
            if (list.size() > 0) {
                break;
            }
        }
        return list;
    }
    
    public void a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_2       
        //     2: aload_0        
        //     3: getfield        com/crashlytics/android/internal/bj.c:Lcom/crashlytics/android/internal/bp;
        //     6: invokevirtual   com/crashlytics/android/internal/bp.close:()V
        //     9: aload_0        
        //    10: getfield        com/crashlytics/android/internal/bj.d:Ljava/io/File;
        //    13: astore_3       
        //    14: new             Ljava/io/File;
        //    17: dup            
        //    18: aload_0        
        //    19: getfield        com/crashlytics/android/internal/bj.e:Ljava/io/File;
        //    22: aload_1        
        //    23: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    26: astore          4
        //    28: new             Ljava/io/FileInputStream;
        //    31: dup            
        //    32: aload_3        
        //    33: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    36: astore          5
        //    38: new             Ljava/util/zip/GZIPOutputStream;
        //    41: dup            
        //    42: new             Ljava/io/FileOutputStream;
        //    45: dup            
        //    46: aload           4
        //    48: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    51: invokespecial   java/util/zip/GZIPOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    54: astore          6
        //    56: aload           5
        //    58: aload           6
        //    60: sipush          1024
        //    63: newarray        B
        //    65: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/InputStream;Ljava/io/OutputStream;[B)V
        //    68: aload           5
        //    70: ldc             "Failed to close file input stream"
        //    72: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //    75: aload           6
        //    77: ldc             "Failed to close gzip output stream"
        //    79: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //    82: aload_3        
        //    83: invokevirtual   java/io/File.delete:()Z
        //    86: pop            
        //    87: aload_0        
        //    88: new             Lcom/crashlytics/android/internal/bp;
        //    91: dup            
        //    92: aload_0        
        //    93: getfield        com/crashlytics/android/internal/bj.d:Ljava/io/File;
        //    96: invokespecial   com/crashlytics/android/internal/bp.<init>:(Ljava/io/File;)V
        //    99: putfield        com/crashlytics/android/internal/bj.c:Lcom/crashlytics/android/internal/bp;
        //   102: return         
        //   103: astore          7
        //   105: aconst_null    
        //   106: astore          5
        //   108: aload           5
        //   110: ldc             "Failed to close file input stream"
        //   112: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   115: aload_2        
        //   116: ldc             "Failed to close gzip output stream"
        //   118: invokestatic    com/crashlytics/android/internal/bd.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   121: aload_3        
        //   122: invokevirtual   java/io/File.delete:()Z
        //   125: pop            
        //   126: aload           7
        //   128: athrow         
        //   129: astore          7
        //   131: aconst_null    
        //   132: astore_2       
        //   133: goto            108
        //   136: astore          7
        //   138: aload           6
        //   140: astore_2       
        //   141: goto            108
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  28     38     103    108    Any
        //  38     56     129    136    Any
        //  56     68     136    144    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 72, Size: 72
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
    
    public void a(final List list) {
        for (final File file : list) {
            bd.c(String.format("deleting sent analytics file %s", file.getName()));
            file.delete();
        }
    }
    
    public void a(final byte[] array) {
        this.c.a(array);
    }
    
    public boolean a(final int n, final int n2) {
        return this.c.a(n, n2);
    }
    
    public boolean b() {
        return this.c.b();
    }
    
    public List c() {
        return Arrays.asList(this.e.listFiles());
    }
    
    public void d() {
        while (true) {
            try {
                this.c.close();
                this.d.delete();
            }
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
}
