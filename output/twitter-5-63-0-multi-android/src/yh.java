import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.nio.charset.Charset;
import java.io.File;
import java.io.Closeable;
import java.io.ObjectInputStream;
import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.io.IOException;
import java.io.OutputStream;
import com.twitter.util.e;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.5.30
// 

public class yh
{
    public static int a(final InputStream inputStream) {
        e.c();
        try {
            return a(inputStream, null, 4096);
        }
        catch (IOException ex) {
            return 0;
        }
    }
    
    public static int a(final InputStream inputStream, final OutputStream outputStream, final int n) {
        e.c();
        final byte[] array = new byte[n];
        int n2 = 0;
        while (true) {
            final int read = inputStream.read(array);
            if (read == -1) {
                break;
            }
            if (outputStream != null) {
                outputStream.write(array, 0, read);
            }
            n2 += read;
        }
        return n2;
    }
    
    public static Serializable a(final byte[] array) {
        if (array == null) {
            return null;
        }
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array);
        ObjectInputStream objectInputStream;
        try {
            final ObjectInputStream objectInputStream2;
            objectInputStream = (objectInputStream2 = new ObjectInputStream(byteArrayInputStream));
            final Object o = objectInputStream2.readObject();
            final Serializable s = (Serializable)o;
            final ObjectInputStream objectInputStream3 = objectInputStream;
            a((Closeable)objectInputStream3);
            final ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
            a((Closeable)byteArrayInputStream2);
            return s;
        }
        finally {
            final Object o3;
            final Object o2 = o3;
            objectInputStream = null;
            final Object o4 = o2;
        }
        while (true) {
            try {
                final ObjectInputStream objectInputStream2 = objectInputStream;
                final Object o = objectInputStream2.readObject();
                final Serializable s = (Serializable)o;
                final ObjectInputStream objectInputStream3 = objectInputStream;
                a((Closeable)objectInputStream3);
                final ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
                a((Closeable)byteArrayInputStream2);
                return s;
                a((Closeable)objectInputStream);
                a((Closeable)byteArrayInputStream);
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static List a(final File p0, final Charset p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/twitter/util/e.c:()V
        //     3: new             Ljava/io/FileInputStream;
        //     6: dup            
        //     7: aload_0        
        //     8: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    11: astore_2       
        //    12: new             Ljava/io/BufferedReader;
        //    15: dup            
        //    16: new             Ljava/io/InputStreamReader;
        //    19: dup            
        //    20: aload_2        
        //    21: aload_1        
        //    22: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
        //    25: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    28: astore_3       
        //    29: new             Ljava/util/ArrayList;
        //    32: dup            
        //    33: invokespecial   java/util/ArrayList.<init>:()V
        //    36: astore          4
        //    38: aload_3        
        //    39: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    42: astore          8
        //    44: aload           8
        //    46: ifnonnull       56
        //    49: aload_2        
        //    50: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //    53: aload           4
        //    55: areturn        
        //    56: aload           4
        //    58: aload           8
        //    60: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    65: pop            
        //    66: goto            38
        //    69: astore          6
        //    71: aload           6
        //    73: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Ljava/lang/Throwable;)V
        //    76: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //    79: astore          7
        //    81: aload_2        
        //    82: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //    85: aload           7
        //    87: areturn        
        //    88: astore          5
        //    90: aconst_null    
        //    91: astore_2       
        //    92: aload_2        
        //    93: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //    96: aload           5
        //    98: athrow         
        //    99: astore          5
        //   101: goto            92
        //   104: astore          6
        //   106: aconst_null    
        //   107: astore_2       
        //   108: goto            71
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  3      12     104    111    Ljava/io/IOException;
        //  3      12     88     92     Any
        //  12     38     69     71     Ljava/io/IOException;
        //  12     38     99     104    Any
        //  38     44     69     71     Ljava/io/IOException;
        //  38     44     99     104    Any
        //  56     66     69     71     Ljava/io/IOException;
        //  56     66     99     104    Any
        //  71     81     99     104    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0038:
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
    
    public static void a(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (IOException ex) {}
    }
    
    public static void a(final File file) {
        e.c();
        if (file.exists() && !file.isDirectory()) {
            throw new IllegalArgumentException("not a directory: " + file);
        }
        final LinkedList<File> list = new LinkedList<File>();
        list.add(file);
        final ArrayList<File> list2 = new ArrayList<File>();
        while (!list.isEmpty()) {
            final File file2 = list.remove();
            final File[] listFiles = file2.listFiles();
            if (listFiles != null) {
                for (final File file3 : listFiles) {
                    if (file3.isDirectory()) {
                        list.add(file3);
                    }
                    else {
                        b(file3);
                    }
                }
            }
            list2.add(file2);
        }
        for (int j = -1 + list2.size(); j >= 0; --j) {
            b((File)list2.get(j));
        }
    }
    
    public static void a(final File file, final File file2) {
        e.c();
        if (!file.renameTo(file2)) {
            throw new IOException("file not renamed " + file + " " + file2);
        }
    }
    
    public static void a(final byte[] array, final ObjectInput objectInput) {
        int i = array.length;
        int n = 0;
        while (i > 0) {
            final int read = objectInput.read(array, n, i);
            if (read == -1) {
                break;
            }
            n += read;
            i -= read;
        }
    }
    
    public static boolean a(final InputStream p0, final File p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/twitter/util/e.c:()V
        //     3: aload_1        
        //     4: invokestatic    yh.c:(Ljava/io/File;)Z
        //     7: istore_2       
        //     8: iconst_0       
        //     9: istore_3       
        //    10: iload_2        
        //    11: ifeq            63
        //    14: new             Ljava/io/FileOutputStream;
        //    17: dup            
        //    18: aload_1        
        //    19: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    22: astore          4
        //    24: aload_0        
        //    25: aload           4
        //    27: sipush          4096
        //    30: invokestatic    yh.a:(Ljava/io/InputStream;Ljava/io/OutputStream;I)I
        //    33: istore          11
        //    35: iconst_0       
        //    36: istore_3       
        //    37: iload           11
        //    39: ifeq            44
        //    42: iconst_1       
        //    43: istore_3       
        //    44: aload           4
        //    46: invokevirtual   java/io/FileOutputStream.flush:()V
        //    49: aload           4
        //    51: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //    54: iload_3        
        //    55: ifne            63
        //    58: aload_1        
        //    59: invokevirtual   java/io/File.delete:()Z
        //    62: pop            
        //    63: iload_3        
        //    64: ireturn        
        //    65: astore          14
        //    67: aconst_null    
        //    68: astore          4
        //    70: aload           4
        //    72: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //    75: iload_3        
        //    76: ifne            63
        //    79: aload_1        
        //    80: invokevirtual   java/io/File.delete:()Z
        //    83: pop            
        //    84: iload_3        
        //    85: ireturn        
        //    86: astore          13
        //    88: aconst_null    
        //    89: astore          4
        //    91: iconst_0       
        //    92: istore          8
        //    94: aload           13
        //    96: astore          9
        //    98: aload           4
        //   100: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //   103: iload           8
        //   105: ifne            113
        //   108: aload_1        
        //   109: invokevirtual   java/io/File.delete:()Z
        //   112: pop            
        //   113: aload           9
        //   115: athrow         
        //   116: astore          7
        //   118: iload_3        
        //   119: istore          8
        //   121: aload           7
        //   123: astore          9
        //   125: goto            98
        //   128: astore          5
        //   130: goto            70
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  14     24     65     70     Ljava/io/IOException;
        //  14     24     86     98     Any
        //  24     35     128    133    Ljava/io/IOException;
        //  24     35     116    128    Any
        //  44     49     128    133    Ljava/io/IOException;
        //  44     49     116    128    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0044:
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
    
    public static boolean a(final String p0, final Charset p1, final File p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/twitter/util/e.c:()V
        //     3: aconst_null    
        //     4: astore_3       
        //     5: new             Ljava/io/OutputStreamWriter;
        //     8: dup            
        //     9: new             Ljava/io/FileOutputStream;
        //    12: dup            
        //    13: aload_2        
        //    14: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    17: aload_1        
        //    18: invokespecial   java/io/OutputStreamWriter.<init>:(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
        //    21: astore          4
        //    23: aload           4
        //    25: aload_0        
        //    26: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //    29: aload           4
        //    31: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //    34: iconst_1       
        //    35: ireturn        
        //    36: astore          5
        //    38: aconst_null    
        //    39: astore          4
        //    41: aload           5
        //    43: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Ljava/lang/Throwable;)V
        //    46: aload           4
        //    48: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //    51: iconst_0       
        //    52: ireturn        
        //    53: astore          6
        //    55: aload_3        
        //    56: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //    59: aload           6
        //    61: athrow         
        //    62: astore          6
        //    64: aload           4
        //    66: astore_3       
        //    67: goto            55
        //    70: astore          5
        //    72: goto            41
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  5      23     36     41     Ljava/io/IOException;
        //  5      23     53     55     Any
        //  23     29     70     75     Ljava/io/IOException;
        //  23     29     62     70     Any
        //  41     46     62     70     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0041:
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
    
    public static boolean a(final byte[] p0, final File p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokestatic    yh.c:(Ljava/io/File;)Z
        //     4: istore_2       
        //     5: iconst_0       
        //     6: istore_3       
        //     7: iload_2        
        //     8: ifeq            42
        //    11: new             Ljava/io/FileOutputStream;
        //    14: dup            
        //    15: aload_1        
        //    16: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    19: astore          4
        //    21: aload           4
        //    23: aload_0        
        //    24: iconst_0       
        //    25: aload_0        
        //    26: arraylength    
        //    27: invokevirtual   java/io/FileOutputStream.write:([BII)V
        //    30: aload           4
        //    32: invokevirtual   java/io/FileOutputStream.flush:()V
        //    35: iconst_1       
        //    36: istore_3       
        //    37: aload           4
        //    39: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //    42: iload_3        
        //    43: ireturn        
        //    44: astore          8
        //    46: aconst_null    
        //    47: astore          4
        //    49: aload_1        
        //    50: invokevirtual   java/io/File.delete:()Z
        //    53: pop            
        //    54: aload           4
        //    56: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //    59: iconst_0       
        //    60: ireturn        
        //    61: astore          6
        //    63: aconst_null    
        //    64: astore          4
        //    66: aload           4
        //    68: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //    71: aload           6
        //    73: athrow         
        //    74: astore          6
        //    76: goto            66
        //    79: astore          5
        //    81: goto            49
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  11     21     44     49     Ljava/io/IOException;
        //  11     21     61     66     Any
        //  21     35     79     84     Ljava/io/IOException;
        //  21     35     74     79     Any
        //  49     54     74     79     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0042:
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
    
    public static byte[] a(final Serializable s) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        ObjectOutputStream objectOutputStream;
        try {
            final ObjectOutputStream objectOutputStream2;
            objectOutputStream = (objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream));
            final Serializable s2 = s;
            objectOutputStream2.writeObject(s2);
            final ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
            final byte[] array = byteArrayOutputStream2.toByteArray();
            final ObjectOutputStream objectOutputStream3 = objectOutputStream;
            a(objectOutputStream3);
            final ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
            a(byteArrayOutputStream3);
            return array;
        }
        finally {
            final Object o2;
            final Object o = o2;
            objectOutputStream = null;
        }
        while (true) {
            try {
                final ObjectOutputStream objectOutputStream2 = objectOutputStream;
                final Serializable s2 = s;
                objectOutputStream2.writeObject(s2);
                final ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                final byte[] array = byteArrayOutputStream2.toByteArray();
                final ObjectOutputStream objectOutputStream3 = objectOutputStream;
                a(objectOutputStream3);
                final ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
                a(byteArrayOutputStream3);
                return array;
                a(objectOutputStream);
                a(byteArrayOutputStream);
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static void b(final File file) {
        e.c();
        if (file.exists() && !file.delete()) {
            throw new IOException("failed to delete file: " + file);
        }
    }
    
    public static boolean b(final File p0, final File p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/twitter/util/e.c:()V
        //     3: new             Ljava/io/FileInputStream;
        //     6: dup            
        //     7: aload_0        
        //     8: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    11: astore_2       
        //    12: aload_2        
        //    13: aload_1        
        //    14: invokestatic    yh.a:(Ljava/io/InputStream;Ljava/io/File;)Z
        //    17: istore          5
        //    19: aload_2        
        //    20: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //    23: iload           5
        //    25: ireturn        
        //    26: astore_3       
        //    27: aconst_null    
        //    28: astore_2       
        //    29: aload_3        
        //    30: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Ljava/lang/Throwable;)V
        //    33: aload_2        
        //    34: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //    37: iconst_0       
        //    38: ireturn        
        //    39: astore          4
        //    41: aconst_null    
        //    42: astore_2       
        //    43: aload_2        
        //    44: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //    47: aload           4
        //    49: athrow         
        //    50: astore          4
        //    52: goto            43
        //    55: astore_3       
        //    56: goto            29
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  3      12     26     29     Ljava/io/IOException;
        //  3      12     39     43     Any
        //  12     19     55     59     Ljava/io/IOException;
        //  12     19     50     55     Any
        //  29     33     50     55     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0029:
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
    
    public static byte[] b(final InputStream inputStream) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a(inputStream, byteArrayOutputStream, 4096);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    public static boolean c(final File file) {
        e.c();
        final File parentFile = file.getParentFile();
        return parentFile == null || parentFile.exists() || parentFile.mkdirs();
    }
    
    public static boolean c(final File file, final File file2) {
        e.c();
        final boolean c = c(file2);
        boolean b = false;
        if (c) {
            if (!file.renameTo(file2)) {
                final boolean b2 = b(file, file2);
                b = false;
                if (!b2) {
                    return b;
                }
                final boolean delete = file.delete();
                b = false;
                if (!delete) {
                    return b;
                }
            }
            b = true;
        }
        return b;
    }
}
