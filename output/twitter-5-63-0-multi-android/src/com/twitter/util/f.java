// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util;

import java.lang.reflect.Array;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.config.a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.io.ObjectOutput;
import java.util.HashMap;
import java.io.ObjectInput;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.io.InputStream;
import java.io.IOException;

public class f
{
    public static final byte[] a;
    private static final char[] b;
    
    static {
        a = new byte[0];
        b = "0123456789abcdef".toCharArray();
    }
    
    public static Object a(final byte[] array) {
        try {
            return yh.a(array);
        }
        catch (IOException ex) {}
        catch (ClassNotFoundException ex2) {
            goto Label_0008;
        }
    }
    
    public static String a(final InputStream inputStream) {
        return a(inputStream, false);
    }
    
    private static String a(final InputStream inputStream, final boolean b) {
        try {
            final MessageDigest instance = MessageDigest.getInstance("MD5");
            final byte[] array = new byte[8192];
            while (true) {
                final int read = inputStream.read(array);
                if (read <= 0) {
                    break;
                }
                instance.update(array, 0, read);
            }
            if (b) {
                return b(instance.digest());
            }
            return c(instance.digest());
        }
        catch (IOException ex) {
            return null;
        }
        catch (NoSuchAlgorithmException ex2) {
            return null;
        }
    }
    
    public static String a(final String s) {
        try {
            return b(MessageDigest.getInstance("MD5").digest(s.getBytes()));
        }
        catch (NoSuchAlgorithmException ex) {
            return null;
        }
    }
    
    public static HashMap a(final Class clazz, final Class clazz2, final ObjectInput objectInput) {
        final int int1 = objectInput.readInt();
        HashMap<Object, Object> hashMap;
        if (int1 < 0) {
            hashMap = null;
        }
        else {
            hashMap = new HashMap<Object, Object>(int1);
            for (int i = 0; i < int1; ++i) {
                hashMap.put(clazz.cast(objectInput.readObject()), clazz2.cast(objectInput.readObject()));
            }
        }
        return hashMap;
    }
    
    public static HashMap a(final Class p0, final Class p1, final byte[] p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_2        
        //     1: ifnonnull       6
        //     4: aconst_null    
        //     5: areturn        
        //     6: new             Ljava/io/ByteArrayInputStream;
        //     9: dup            
        //    10: aload_2        
        //    11: invokespecial   java/io/ByteArrayInputStream.<init>:([B)V
        //    14: astore_3       
        //    15: new             Ljava/io/ObjectInputStream;
        //    18: dup            
        //    19: aload_3        
        //    20: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //    23: astore          4
        //    25: aload_0        
        //    26: aload_1        
        //    27: aload           4
        //    29: invokestatic    com/twitter/util/f.a:(Ljava/lang/Class;Ljava/lang/Class;Ljava/io/ObjectInput;)Ljava/util/HashMap;
        //    32: astore          8
        //    34: aload           4
        //    36: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //    39: aload_3        
        //    40: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //    43: aload           8
        //    45: areturn        
        //    46: astore          5
        //    48: aconst_null    
        //    49: astore          4
        //    51: invokestatic    com/twitter/config/a.n:()Lcom/twitter/config/a;
        //    54: astore          7
        //    56: aload           7
        //    58: invokevirtual   com/twitter/config/a.a:()Z
        //    61: ifne            80
        //    64: aload           7
        //    66: invokevirtual   com/twitter/config/a.b:()Z
        //    69: ifne            80
        //    72: aload           7
        //    74: invokevirtual   com/twitter/config/a.p:()Z
        //    77: ifeq            85
        //    80: aload           5
        //    82: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Ljava/lang/Throwable;)V
        //    85: aload           4
        //    87: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //    90: aload_3        
        //    91: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //    94: aconst_null    
        //    95: areturn        
        //    96: astore          9
        //    98: aconst_null    
        //    99: astore          4
        //   101: aload           9
        //   103: astore          6
        //   105: aload           4
        //   107: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //   110: aload_3        
        //   111: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //   114: aload           6
        //   116: athrow         
        //   117: astore          6
        //   119: goto            105
        //   122: astore          5
        //   124: goto            51
        //   127: astore          5
        //   129: aconst_null    
        //   130: astore          4
        //   132: goto            51
        //   135: astore          5
        //   137: goto            51
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  15     25     46     51     Ljava/io/IOException;
        //  15     25     127    135    Ljava/lang/ClassNotFoundException;
        //  15     25     96     105    Any
        //  25     34     122    127    Ljava/io/IOException;
        //  25     34     135    140    Ljava/lang/ClassNotFoundException;
        //  25     34     117    122    Any
        //  51     80     117    122    Any
        //  80     85     117    122    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0051:
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
    
    public static void a(final HashMap hashMap, final ObjectOutput objectOutput) {
        if (hashMap == null) {
            objectOutput.writeInt(-1);
        }
        else {
            objectOutput.writeInt(hashMap.size());
            for (final Map.Entry<Object, V> entry : hashMap.entrySet()) {
                objectOutput.writeObject(entry.getKey());
                objectOutput.writeObject(entry.getValue());
            }
        }
    }
    
    public static void a(final int[] array, final ObjectOutput objectOutput) {
        if (array == null) {
            objectOutput.writeInt(-1);
        }
        else {
            objectOutput.writeInt(array.length);
            for (int length = array.length, i = 0; i < length; ++i) {
                objectOutput.writeInt(array[i]);
            }
        }
    }
    
    public static void a(final Object[] array, final ObjectOutput objectOutput) {
        if (array == null) {
            objectOutput.writeInt(-1);
        }
        else {
            objectOutput.writeInt(array.length);
            for (int length = array.length, i = 0; i < length; ++i) {
                objectOutput.writeObject(array[i]);
            }
        }
    }
    
    public static byte[] a(final Serializable s) {
        try {
            return yh.a(s);
        }
        catch (IOException ex) {
            final a n = com.twitter.config.a.n();
            if (n.a() || n.b() || n.p()) {
                ErrorReporter.a(ex);
            }
            return null;
        }
    }
    
    public static byte[] a(final HashMap p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/ByteArrayOutputStream;
        //     3: dup            
        //     4: sipush          512
        //     7: invokespecial   java/io/ByteArrayOutputStream.<init>:(I)V
        //    10: astore_1       
        //    11: new             Ljava/io/ObjectOutputStream;
        //    14: dup            
        //    15: aload_1        
        //    16: invokespecial   java/io/ObjectOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    19: astore_2       
        //    20: aload_0        
        //    21: aload_2        
        //    22: invokestatic    com/twitter/util/f.a:(Ljava/util/HashMap;Ljava/io/ObjectOutput;)V
        //    25: aload_1        
        //    26: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //    29: astore          6
        //    31: aload_2        
        //    32: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //    35: aload_1        
        //    36: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //    39: aload           6
        //    41: areturn        
        //    42: astore_3       
        //    43: aconst_null    
        //    44: astore_2       
        //    45: invokestatic    com/twitter/config/a.n:()Lcom/twitter/config/a;
        //    48: astore          5
        //    50: aload           5
        //    52: invokevirtual   com/twitter/config/a.a:()Z
        //    55: ifne            74
        //    58: aload           5
        //    60: invokevirtual   com/twitter/config/a.b:()Z
        //    63: ifne            74
        //    66: aload           5
        //    68: invokevirtual   com/twitter/config/a.p:()Z
        //    71: ifeq            78
        //    74: aload_3        
        //    75: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Ljava/lang/Throwable;)V
        //    78: aload_2        
        //    79: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //    82: aload_1        
        //    83: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //    86: aconst_null    
        //    87: areturn        
        //    88: astore          7
        //    90: aconst_null    
        //    91: astore_2       
        //    92: aload           7
        //    94: astore          4
        //    96: aload_2        
        //    97: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //   100: aload_1        
        //   101: invokestatic    yh.a:(Ljava/io/Closeable;)V
        //   104: aload           4
        //   106: athrow         
        //   107: astore          4
        //   109: goto            96
        //   112: astore_3       
        //   113: goto            45
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  11     20     42     45     Ljava/io/IOException;
        //  11     20     88     96     Any
        //  20     31     112    116    Ljava/io/IOException;
        //  20     31     107    112    Any
        //  45     74     107    112    Any
        //  74     78     107    112    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0045:
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
    
    public static int[] a(final ObjectInput objectInput) {
        final int int1 = objectInput.readInt();
        int[] array;
        if (int1 < 0) {
            array = null;
        }
        else {
            array = new int[int1];
            for (int i = 0; i < int1; ++i) {
                array[i] = objectInput.readInt();
            }
        }
        return array;
    }
    
    public static Object[] a(final Class clazz, final ObjectInput objectInput) {
        final int int1 = objectInput.readInt();
        Object o;
        if (int1 < 0) {
            o = null;
        }
        else {
            final Class<?> componentType = clazz.getComponentType();
            o = clazz.cast(Array.newInstance(componentType, int1));
            for (int i = 0; i < int1; ++i) {
                o[i] = componentType.cast(objectInput.readObject());
            }
        }
        return clazz.cast(o);
    }
    
    public static String b(final String s) {
        try {
            return b(MessageDigest.getInstance("SHA1").digest(s.getBytes()));
        }
        catch (NoSuchAlgorithmException ex) {
            return null;
        }
    }
    
    public static String b(final byte[] array) {
        final StringBuilder sb = new StringBuilder();
        for (int length = array.length, i = 0; i < length; ++i) {
            final String hexString = Integer.toHexString(0xFF & array[i]);
            if (hexString.length() < 2) {
                sb.append('0').append(hexString);
            }
            else {
                sb.append(hexString);
            }
        }
        return sb.toString();
    }
    
    private static String c(final byte[] array) {
        final char[] array2 = new char[2 * array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i * 2] = f.b[0xF & array[i] >> 4];
            array2[1 + i * 2] = f.b[0xF & array[i]];
        }
        return new String(array2);
    }
}
