// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.util;

import java.util.Map;
import java.util.LinkedHashMap;

public class LruCache
{
    public static int a;
    private static final String[] z;
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;
    
    static {
        final String[] z2 = new String[7];
        String s = "rMw\u0002\u0014$\b`WEu";
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
                        c2 = ')';
                        break;
                    }
                    case 0: {
                        c2 = '\u0019';
                        break;
                    }
                    case 1: {
                        c2 = '(';
                        break;
                    }
                    case 2: {
                        c2 = '\u000e';
                        break;
                    }
                    case 3: {
                        c2 = '\"';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "WMiC]p^k\u0002ZpRk\u0018\t";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "tIvq@cM.\u001e\u00149\u0018";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "rMw\u0002\u0014$\b`WEu";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "7[gXLVN&\u000b\tp[.PLiG|V@wO.KGzG`Q@j\\kL]9ZkQ\\u\\}\u0003";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "UZ{aHz@kyDxP]KS|\u0015+F\u0005qAzQ\u0014<L\"O@j[kQ\u0014<L\"J@mzoVL$\rj\u0007\fD";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "rMw\u0002\u0014$\b`WEu\br^\toIbWL9\u00153\u0002GlDb";
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
    
    public LruCache(final int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException(LruCache.z[2]);
        }
        this.maxSize = maxSize;
        this.map = new LinkedHashMap(0, 0.75f, true);
    }
    
    private int safeSizeOf(final Object o, final Object o2) {
        final int size = this.sizeOf(o, o2);
        if (size < 0) {
            try {
                throw new IllegalStateException(LruCache.z[1] + o + "=" + o2);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        return size;
    }
    
    protected Object create(final Object o) {
        return null;
    }
    
    protected void entryRemoved(final boolean b, final Object o, final Object o2, final Object o3) {
    }
    
    public final void evictAll() {
        this.trimToSize(-1);
    }
    
    public final Object get(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ifnonnull       22
        //     4: new             Ljava/lang/NullPointerException;
        //     7: dup            
        //     8: getstatic       android/support/v4/util/LruCache.z:[Ljava/lang/String;
        //    11: iconst_0       
        //    12: aaload         
        //    13: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //    16: athrow         
        //    17: astore          12
        //    19: aload           12
        //    21: athrow         
        //    22: aload_0        
        //    23: monitorenter   
        //    24: aload_0        
        //    25: getfield        android/support/v4/util/LruCache.map:Ljava/util/LinkedHashMap;
        //    28: aload_1        
        //    29: invokevirtual   java/util/LinkedHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    32: astore_3       
        //    33: aload_3        
        //    34: ifnull          51
        //    37: aload_0        
        //    38: iconst_1       
        //    39: aload_0        
        //    40: getfield        android/support/v4/util/LruCache.hitCount:I
        //    43: iadd           
        //    44: putfield        android/support/v4/util/LruCache.hitCount:I
        //    47: aload_0        
        //    48: monitorexit    
        //    49: aload_3        
        //    50: areturn        
        //    51: aload_0        
        //    52: iconst_1       
        //    53: aload_0        
        //    54: getfield        android/support/v4/util/LruCache.missCount:I
        //    57: iadd           
        //    58: putfield        android/support/v4/util/LruCache.missCount:I
        //    61: aload_0        
        //    62: monitorexit    
        //    63: aload_0        
        //    64: aload_1        
        //    65: invokevirtual   android/support/v4/util/LruCache.create:(Ljava/lang/Object;)Ljava/lang/Object;
        //    68: astore          4
        //    70: aload           4
        //    72: ifnonnull       82
        //    75: aconst_null    
        //    76: areturn        
        //    77: astore_2       
        //    78: aload_0        
        //    79: monitorexit    
        //    80: aload_2        
        //    81: athrow         
        //    82: aload_0        
        //    83: monitorenter   
        //    84: aload_0        
        //    85: iconst_1       
        //    86: aload_0        
        //    87: getfield        android/support/v4/util/LruCache.createCount:I
        //    90: iadd           
        //    91: putfield        android/support/v4/util/LruCache.createCount:I
        //    94: aload_0        
        //    95: getfield        android/support/v4/util/LruCache.map:Ljava/util/LinkedHashMap;
        //    98: aload_1        
        //    99: aload           4
        //   101: invokevirtual   java/util/LinkedHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   104: astore          6
        //   106: aload           6
        //   108: ifnull          132
        //   111: aload_0        
        //   112: getfield        android/support/v4/util/LruCache.map:Ljava/util/LinkedHashMap;
        //   115: aload_1        
        //   116: aload           6
        //   118: invokevirtual   java/util/LinkedHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   121: pop            
        //   122: getstatic       android/support/v4/util/LruCache.a:I
        //   125: istore          11
        //   127: iload           11
        //   129: ifeq            148
        //   132: aload_0        
        //   133: aload_0        
        //   134: getfield        android/support/v4/util/LruCache.size:I
        //   137: aload_0        
        //   138: aload_1        
        //   139: aload           4
        //   141: invokespecial   android/support/v4/util/LruCache.safeSizeOf:(Ljava/lang/Object;Ljava/lang/Object;)I
        //   144: iadd           
        //   145: putfield        android/support/v4/util/LruCache.size:I
        //   148: aload_0        
        //   149: monitorexit    
        //   150: aload           6
        //   152: ifnull          190
        //   155: aload_0        
        //   156: iconst_0       
        //   157: aload_1        
        //   158: aload           4
        //   160: aload           6
        //   162: invokevirtual   android/support/v4/util/LruCache.entryRemoved:(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //   165: aload           6
        //   167: areturn        
        //   168: astore          8
        //   170: aload           8
        //   172: athrow         
        //   173: astore          9
        //   175: aload           9
        //   177: athrow         
        //   178: astore          7
        //   180: aload           7
        //   182: athrow         
        //   183: astore          5
        //   185: aload_0        
        //   186: monitorexit    
        //   187: aload           5
        //   189: athrow         
        //   190: aload_0        
        //   191: aload_0        
        //   192: getfield        android/support/v4/util/LruCache.maxSize:I
        //   195: invokevirtual   android/support/v4/util/LruCache.trimToSize:(I)V
        //   198: aload           4
        //   200: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      17     17     22     Ljava/lang/IllegalArgumentException;
        //  24     33     77     82     Any
        //  37     49     77     82     Any
        //  51     63     77     82     Any
        //  78     80     77     82     Any
        //  84     106    183    190    Any
        //  111    127    173    178    Ljava/lang/IllegalArgumentException;
        //  111    127    183    190    Any
        //  132    148    178    183    Ljava/lang/IllegalArgumentException;
        //  132    148    183    190    Any
        //  148    150    183    190    Any
        //  155    165    168    173    Ljava/lang/IllegalArgumentException;
        //  175    178    178    183    Ljava/lang/IllegalArgumentException;
        //  175    178    183    190    Any
        //  180    183    183    190    Any
        //  185    187    183    190    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0132:
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
    
    public final int maxSize() {
        synchronized (this) {
            return this.maxSize;
        }
    }
    
    public final Object put(final Object p0, final Object p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/util/LruCache.a:I
        //     3: istore_3       
        //     4: aload_1        
        //     5: ifnull          12
        //     8: aload_2        
        //     9: ifnonnull       31
        //    12: new             Ljava/lang/NullPointerException;
        //    15: dup            
        //    16: getstatic       android/support/v4/util/LruCache.z:[Ljava/lang/String;
        //    19: bipush          6
        //    21: aaload         
        //    22: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //    25: athrow         
        //    26: astore          4
        //    28: aload           4
        //    30: athrow         
        //    31: aload_0        
        //    32: monitorenter   
        //    33: aload_0        
        //    34: iconst_1       
        //    35: aload_0        
        //    36: getfield        android/support/v4/util/LruCache.putCount:I
        //    39: iadd           
        //    40: putfield        android/support/v4/util/LruCache.putCount:I
        //    43: aload_0        
        //    44: aload_0        
        //    45: getfield        android/support/v4/util/LruCache.size:I
        //    48: aload_0        
        //    49: aload_1        
        //    50: aload_2        
        //    51: invokespecial   android/support/v4/util/LruCache.safeSizeOf:(Ljava/lang/Object;Ljava/lang/Object;)I
        //    54: iadd           
        //    55: putfield        android/support/v4/util/LruCache.size:I
        //    58: aload_0        
        //    59: getfield        android/support/v4/util/LruCache.map:Ljava/util/LinkedHashMap;
        //    62: aload_1        
        //    63: aload_2        
        //    64: invokevirtual   java/util/LinkedHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    67: astore          6
        //    69: aload           6
        //    71: ifnull          90
        //    74: aload_0        
        //    75: aload_0        
        //    76: getfield        android/support/v4/util/LruCache.size:I
        //    79: aload_0        
        //    80: aload_1        
        //    81: aload           6
        //    83: invokespecial   android/support/v4/util/LruCache.safeSizeOf:(Ljava/lang/Object;Ljava/lang/Object;)I
        //    86: isub           
        //    87: putfield        android/support/v4/util/LruCache.size:I
        //    90: aload_0        
        //    91: monitorexit    
        //    92: aload           6
        //    94: ifnull          106
        //    97: aload_0        
        //    98: iconst_0       
        //    99: aload_1        
        //   100: aload           6
        //   102: aload_2        
        //   103: invokevirtual   android/support/v4/util/LruCache.entryRemoved:(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //   106: aload_0        
        //   107: aload_0        
        //   108: getfield        android/support/v4/util/LruCache.maxSize:I
        //   111: invokevirtual   android/support/v4/util/LruCache.trimToSize:(I)V
        //   114: iload_3        
        //   115: ifeq            126
        //   118: iconst_1       
        //   119: getstatic       android/support/v4/app/FragmentActivity.a:I
        //   122: iadd           
        //   123: putstatic       android/support/v4/app/FragmentActivity.a:I
        //   126: aload           6
        //   128: areturn        
        //   129: astore          8
        //   131: aload           8
        //   133: athrow         
        //   134: astore          5
        //   136: aload_0        
        //   137: monitorexit    
        //   138: aload           5
        //   140: athrow         
        //   141: astore          7
        //   143: aload           7
        //   145: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  12     26     26     31     Ljava/lang/IllegalArgumentException;
        //  33     69     134    141    Any
        //  74     90     129    134    Ljava/lang/IllegalArgumentException;
        //  74     90     134    141    Any
        //  90     92     134    141    Any
        //  97     106    141    146    Ljava/lang/IllegalArgumentException;
        //  131    134    134    141    Any
        //  136    138    134    141    Any
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
    
    public final Object remove(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ifnonnull       22
        //     4: new             Ljava/lang/NullPointerException;
        //     7: dup            
        //     8: getstatic       android/support/v4/util/LruCache.z:[Ljava/lang/String;
        //    11: iconst_3       
        //    12: aaload         
        //    13: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //    16: athrow         
        //    17: astore          6
        //    19: aload           6
        //    21: athrow         
        //    22: aload_0        
        //    23: monitorenter   
        //    24: aload_0        
        //    25: getfield        android/support/v4/util/LruCache.map:Ljava/util/LinkedHashMap;
        //    28: aload_1        
        //    29: invokevirtual   java/util/LinkedHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    32: astore_3       
        //    33: aload_3        
        //    34: ifnull          52
        //    37: aload_0        
        //    38: aload_0        
        //    39: getfield        android/support/v4/util/LruCache.size:I
        //    42: aload_0        
        //    43: aload_1        
        //    44: aload_3        
        //    45: invokespecial   android/support/v4/util/LruCache.safeSizeOf:(Ljava/lang/Object;Ljava/lang/Object;)I
        //    48: isub           
        //    49: putfield        android/support/v4/util/LruCache.size:I
        //    52: aload_0        
        //    53: monitorexit    
        //    54: aload_3        
        //    55: ifnull          66
        //    58: aload_0        
        //    59: iconst_0       
        //    60: aload_1        
        //    61: aload_3        
        //    62: aconst_null    
        //    63: invokevirtual   android/support/v4/util/LruCache.entryRemoved:(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //    66: aload_3        
        //    67: areturn        
        //    68: astore          5
        //    70: aload           5
        //    72: athrow         
        //    73: astore_2       
        //    74: aload_0        
        //    75: monitorexit    
        //    76: aload_2        
        //    77: athrow         
        //    78: astore          4
        //    80: aload           4
        //    82: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      17     17     22     Ljava/lang/IllegalArgumentException;
        //  24     33     73     78     Any
        //  37     52     68     73     Ljava/lang/IllegalArgumentException;
        //  37     52     73     78     Any
        //  52     54     73     78     Any
        //  58     66     78     83     Ljava/lang/IllegalArgumentException;
        //  70     73     73     78     Any
        //  74     76     73     78     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0066:
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
    
    public final int size() {
        synchronized (this) {
            return this.size;
        }
    }
    
    protected int sizeOf(final Object o, final Object o2) {
        return 1;
    }
    
    public final Map snapshot() {
        synchronized (this) {
            return new LinkedHashMap(this.map);
        }
    }
    
    @Override
    public final String toString() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: getstatic       android/support/v4/util/LruCache.a:I
        //     5: istore_2       
        //     6: aload_0        
        //     7: getfield        android/support/v4/util/LruCache.hitCount:I
        //    10: istore_3       
        //    11: aload_0        
        //    12: getfield        android/support/v4/util/LruCache.missCount:I
        //    15: istore          4
        //    17: iload_3        
        //    18: iload           4
        //    20: iadd           
        //    21: istore          5
        //    23: iconst_0       
        //    24: istore          6
        //    26: iload           5
        //    28: ifeq            43
        //    31: bipush          100
        //    33: aload_0        
        //    34: getfield        android/support/v4/util/LruCache.hitCount:I
        //    37: imul           
        //    38: iload           5
        //    40: idiv           
        //    41: istore          6
        //    43: getstatic       android/support/v4/util/LruCache.z:[Ljava/lang/String;
        //    46: iconst_5       
        //    47: aaload         
        //    48: astore          8
        //    50: iconst_4       
        //    51: anewarray       Ljava/lang/Object;
        //    54: astore          9
        //    56: aload           9
        //    58: iconst_0       
        //    59: aload_0        
        //    60: getfield        android/support/v4/util/LruCache.maxSize:I
        //    63: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    66: aastore        
        //    67: aload           9
        //    69: iconst_1       
        //    70: aload_0        
        //    71: getfield        android/support/v4/util/LruCache.hitCount:I
        //    74: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    77: aastore        
        //    78: aload           9
        //    80: iconst_2       
        //    81: aload_0        
        //    82: getfield        android/support/v4/util/LruCache.missCount:I
        //    85: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    88: aastore        
        //    89: aload           9
        //    91: iconst_3       
        //    92: iload           6
        //    94: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    97: aastore        
        //    98: aload           8
        //   100: aload           9
        //   102: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   105: astore          10
        //   107: getstatic       android/support/v4/app/FragmentActivity.a:I
        //   110: ifeq            119
        //   113: iload_2        
        //   114: iconst_1       
        //   115: iadd           
        //   116: putstatic       android/support/v4/util/LruCache.a:I
        //   119: aload_0        
        //   120: monitorexit    
        //   121: aload           10
        //   123: areturn        
        //   124: astore          11
        //   126: aload           11
        //   128: athrow         
        //   129: astore_1       
        //   130: aload_0        
        //   131: monitorexit    
        //   132: aload_1        
        //   133: athrow         
        //   134: astore          7
        //   136: aload           7
        //   138: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  2      17     129    134    Any
        //  31     43     124    129    Ljava/lang/IllegalArgumentException;
        //  31     43     129    134    Any
        //  43     119    134    139    Ljava/lang/IllegalArgumentException;
        //  43     119    129    134    Any
        //  126    129    129    134    Any
        //  136    139    129    134    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0043:
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
    
    public void trimToSize(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/util/LruCache.a:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: monitorenter   
        //     6: aload_0        
        //     7: getfield        android/support/v4/util/LruCache.size:I
        //    10: istore          4
        //    12: iload           4
        //    14: iflt            38
        //    17: aload_0        
        //    18: getfield        android/support/v4/util/LruCache.map:Ljava/util/LinkedHashMap;
        //    21: invokevirtual   java/util/LinkedHashMap.isEmpty:()Z
        //    24: ifeq            89
        //    27: aload_0        
        //    28: getfield        android/support/v4/util/LruCache.size:I
        //    31: istore          13
        //    33: iload           13
        //    35: ifeq            89
        //    38: new             Ljava/lang/IllegalStateException;
        //    41: dup            
        //    42: new             Ljava/lang/StringBuilder;
        //    45: dup            
        //    46: invokespecial   java/lang/StringBuilder.<init>:()V
        //    49: aload_0        
        //    50: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    53: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    56: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    59: getstatic       android/support/v4/util/LruCache.z:[Ljava/lang/String;
        //    62: iconst_4       
        //    63: aaload         
        //    64: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    67: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    70: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    73: athrow         
        //    74: astore          5
        //    76: aload           5
        //    78: athrow         
        //    79: astore_3       
        //    80: aload_0        
        //    81: monitorexit    
        //    82: aload_3        
        //    83: athrow         
        //    84: astore          6
        //    86: aload           6
        //    88: athrow         
        //    89: aload_0        
        //    90: getfield        android/support/v4/util/LruCache.size:I
        //    93: iload_1        
        //    94: if_icmple       111
        //    97: aload_0        
        //    98: getfield        android/support/v4/util/LruCache.map:Ljava/util/LinkedHashMap;
        //   101: invokevirtual   java/util/LinkedHashMap.isEmpty:()Z
        //   104: istore          12
        //   106: iload           12
        //   108: ifeq            117
        //   111: aload_0        
        //   112: monitorexit    
        //   113: iload_2        
        //   114: ifeq            210
        //   117: aload_0        
        //   118: getfield        android/support/v4/util/LruCache.map:Ljava/util/LinkedHashMap;
        //   121: invokevirtual   java/util/LinkedHashMap.entrySet:()Ljava/util/Set;
        //   124: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   129: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   134: checkcast       Ljava/util/Map$Entry;
        //   137: astore          8
        //   139: aload           8
        //   141: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   146: astore          9
        //   148: aload           8
        //   150: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   155: astore          10
        //   157: aload_0        
        //   158: getfield        android/support/v4/util/LruCache.map:Ljava/util/LinkedHashMap;
        //   161: aload           9
        //   163: invokevirtual   java/util/LinkedHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   166: pop            
        //   167: aload_0        
        //   168: aload_0        
        //   169: getfield        android/support/v4/util/LruCache.size:I
        //   172: aload_0        
        //   173: aload           9
        //   175: aload           10
        //   177: invokespecial   android/support/v4/util/LruCache.safeSizeOf:(Ljava/lang/Object;Ljava/lang/Object;)I
        //   180: isub           
        //   181: putfield        android/support/v4/util/LruCache.size:I
        //   184: aload_0        
        //   185: iconst_1       
        //   186: aload_0        
        //   187: getfield        android/support/v4/util/LruCache.evictionCount:I
        //   190: iadd           
        //   191: putfield        android/support/v4/util/LruCache.evictionCount:I
        //   194: aload_0        
        //   195: monitorexit    
        //   196: aload_0        
        //   197: iconst_1       
        //   198: aload           9
        //   200: aload           10
        //   202: aconst_null    
        //   203: invokevirtual   android/support/v4/util/LruCache.entryRemoved:(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //   206: iload_2        
        //   207: ifeq            4
        //   210: return         
        //   211: astore          7
        //   213: aload           7
        //   215: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  6      12     79     84     Any
        //  17     33     84     89     Ljava/lang/IllegalArgumentException;
        //  17     33     79     84     Any
        //  38     74     74     79     Ljava/lang/IllegalArgumentException;
        //  38     74     79     84     Any
        //  76     79     79     84     Any
        //  80     82     79     84     Any
        //  86     89     74     79     Ljava/lang/IllegalArgumentException;
        //  86     89     79     84     Any
        //  89     106    211    216    Ljava/lang/IllegalArgumentException;
        //  89     106    79     84     Any
        //  111    113    79     84     Any
        //  117    196    79     84     Any
        //  213    216    79     84     Any
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
}
