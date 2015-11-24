// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.lang.reflect.InvocationTargetException;
import com.coremedia.iso.boxes.Box;
import java.util.Properties;
import java.util.regex.Pattern;

public class PropertyBoxParserImpl extends AbstractBoxParser
{
    static String[] EMPTY_STRING_ARRAY;
    StringBuilder buildLookupStrings;
    String clazzName;
    Pattern constuctorPattern;
    Properties mapping;
    String[] param;
    
    static {
        PropertyBoxParserImpl.EMPTY_STRING_ARRAY = new String[0];
    }
    
    public PropertyBoxParserImpl(final Properties mapping) {
        this.constuctorPattern = Pattern.compile("(.*)\\((.*?)\\)");
        this.buildLookupStrings = new StringBuilder();
        this.mapping = mapping;
    }
    
    public PropertyBoxParserImpl(final String... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   com/coremedia/iso/AbstractBoxParser.<init>:()V
        //     4: aload_0        
        //     5: ldc             "(.*)\\((.*?)\\)"
        //     7: invokestatic    java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //    10: putfield        com/coremedia/iso/PropertyBoxParserImpl.constuctorPattern:Ljava/util/regex/Pattern;
        //    13: aload_0        
        //    14: new             Ljava/lang/StringBuilder;
        //    17: dup            
        //    18: invokespecial   java/lang/StringBuilder.<init>:()V
        //    21: putfield        com/coremedia/iso/PropertyBoxParserImpl.buildLookupStrings:Ljava/lang/StringBuilder;
        //    24: aload_0        
        //    25: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    28: ldc             "/isoparser-default.properties"
        //    30: invokevirtual   java/lang/Class.getResourceAsStream:(Ljava/lang/String;)Ljava/io/InputStream;
        //    33: astore_2       
        //    34: aload_0        
        //    35: new             Ljava/util/Properties;
        //    38: dup            
        //    39: invokespecial   java/util/Properties.<init>:()V
        //    42: putfield        com/coremedia/iso/PropertyBoxParserImpl.mapping:Ljava/util/Properties;
        //    45: aload_0        
        //    46: getfield        com/coremedia/iso/PropertyBoxParserImpl.mapping:Ljava/util/Properties;
        //    49: aload_2        
        //    50: invokevirtual   java/util/Properties.load:(Ljava/io/InputStream;)V
        //    53: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    56: invokevirtual   java/lang/Thread.getContextClassLoader:()Ljava/lang/ClassLoader;
        //    59: ldc             "isoparser-custom.properties"
        //    61: invokevirtual   java/lang/ClassLoader.getResources:(Ljava/lang/String;)Ljava/util/Enumeration;
        //    64: astore          6
        //    66: aload           6
        //    68: invokeinterface java/util/Enumeration.hasMoreElements:()Z
        //    73: ifne            95
        //    76: aload_1        
        //    77: arraylength    
        //    78: istore          9
        //    80: iconst_0       
        //    81: istore          10
        //    83: iload           10
        //    85: iload           9
        //    87: if_icmplt       156
        //    90: aload_2        
        //    91: invokevirtual   java/io/InputStream.close:()V
        //    94: return         
        //    95: aload           6
        //    97: invokeinterface java/util/Enumeration.nextElement:()Ljava/lang/Object;
        //   102: checkcast       Ljava/net/URL;
        //   105: invokevirtual   java/net/URL.openStream:()Ljava/io/InputStream;
        //   108: astore          7
        //   110: aload_0        
        //   111: getfield        com/coremedia/iso/PropertyBoxParserImpl.mapping:Ljava/util/Properties;
        //   114: aload           7
        //   116: invokevirtual   java/util/Properties.load:(Ljava/io/InputStream;)V
        //   119: aload           7
        //   121: invokevirtual   java/io/InputStream.close:()V
        //   124: goto            66
        //   127: astore          5
        //   129: new             Ljava/lang/RuntimeException;
        //   132: dup            
        //   133: aload           5
        //   135: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/Throwable;)V
        //   138: athrow         
        //   139: astore_3       
        //   140: aload_2        
        //   141: invokevirtual   java/io/InputStream.close:()V
        //   144: aload_3        
        //   145: athrow         
        //   146: astore          8
        //   148: aload           7
        //   150: invokevirtual   java/io/InputStream.close:()V
        //   153: aload           8
        //   155: athrow         
        //   156: aload_1        
        //   157: iload           10
        //   159: aaload         
        //   160: astore          11
        //   162: aload_0        
        //   163: getfield        com/coremedia/iso/PropertyBoxParserImpl.mapping:Ljava/util/Properties;
        //   166: aload_0        
        //   167: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   170: aload           11
        //   172: invokevirtual   java/lang/Class.getResourceAsStream:(Ljava/lang/String;)Ljava/io/InputStream;
        //   175: invokevirtual   java/util/Properties.load:(Ljava/io/InputStream;)V
        //   178: iinc            10, 1
        //   181: goto            83
        //   184: astore          4
        //   186: aload           4
        //   188: invokevirtual   java/io/IOException.printStackTrace:()V
        //   191: goto            144
        //   194: astore          12
        //   196: aload           12
        //   198: invokevirtual   java/io/IOException.printStackTrace:()V
        //   201: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  34     45     139    146    Any
        //  45     66     127    139    Ljava/io/IOException;
        //  45     66     139    146    Any
        //  66     80     127    139    Ljava/io/IOException;
        //  66     80     139    146    Any
        //  90     94     194    202    Ljava/io/IOException;
        //  95     110    127    139    Ljava/io/IOException;
        //  95     110    139    146    Any
        //  110    119    146    156    Any
        //  119    124    127    139    Ljava/io/IOException;
        //  119    124    139    146    Any
        //  129    139    139    146    Any
        //  140    144    184    194    Ljava/io/IOException;
        //  148    156    127    139    Ljava/io/IOException;
        //  148    156    139    146    Any
        //  156    178    127    139    Ljava/io/IOException;
        //  156    178    139    146    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0095:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
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
    public Box createBox(final String s, final byte[] array, final String s2) {
        while (true) {
            this.invoke(s, array, s2);
            while (true) {
                int n;
                try {
                    final Class<?> forName = Class.forName(this.clazzName);
                    if (this.param.length <= 0) {
                        goto Label_0232;
                    }
                    final Class[] array2 = new Class[this.param.length];
                    final Object[] array3 = new Object[this.param.length];
                    n = 0;
                    if (n >= this.param.length) {
                        return (Box)forName.getConstructor((Class<?>[])array2).newInstance(array3);
                    }
                    if ("userType".equals(this.param[n])) {
                        array3[n] = array;
                        array2[n] = byte[].class;
                    }
                    else {
                        if (!"type".equals(this.param[n])) {
                            goto Label_0147;
                        }
                        array3[n] = s;
                        array2[n] = String.class;
                    }
                }
                catch (ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                catch (InstantiationException ex2) {
                    throw new RuntimeException(ex2);
                }
                catch (IllegalAccessException ex3) {
                    throw new RuntimeException(ex3);
                }
                catch (InvocationTargetException ex4) {
                    throw new RuntimeException(ex4);
                }
                catch (NoSuchMethodException ex5) {
                    throw new RuntimeException(ex5);
                }
                ++n;
                continue;
            }
        }
    }
    
    public void invoke(final String s, final byte[] array, final String s2) {
        String clazzName;
        if (array != null) {
            if (!"uuid".equals(s)) {
                throw new RuntimeException("we have a userType but no uuid box type. Something's wrong");
            }
            clazzName = this.mapping.getProperty("uuid[" + Hex.encodeHex(array).toUpperCase() + "]");
            if (clazzName == null) {
                clazzName = this.mapping.getProperty(String.valueOf(s2) + "-uuid[" + Hex.encodeHex(array).toUpperCase() + "]");
            }
            if (clazzName == null) {
                clazzName = this.mapping.getProperty("uuid");
            }
        }
        else {
            clazzName = this.mapping.getProperty(s);
            if (clazzName == null) {
                final String string = this.buildLookupStrings.append(s2).append('-').append(s).toString();
                this.buildLookupStrings.setLength(0);
                clazzName = this.mapping.getProperty(string);
            }
        }
        if (clazzName == null) {
            clazzName = this.mapping.getProperty("default");
        }
        if (clazzName == null) {
            throw new RuntimeException("No box object found for " + s);
        }
        if (!clazzName.endsWith(")")) {
            this.param = PropertyBoxParserImpl.EMPTY_STRING_ARRAY;
            this.clazzName = clazzName;
            return;
        }
        final Matcher matcher = this.constuctorPattern.matcher(clazzName);
        if (!matcher.matches()) {
            throw new RuntimeException("Cannot work with that constructor: " + clazzName);
        }
        this.clazzName = matcher.group(1);
        if (matcher.group(2).length() == 0) {
            this.param = PropertyBoxParserImpl.EMPTY_STRING_ARRAY;
            return;
        }
        String[] split;
        if (matcher.group(2).length() > 0) {
            split = matcher.group(2).split(",");
        }
        else {
            split = new String[0];
        }
        this.param = split;
    }
}
