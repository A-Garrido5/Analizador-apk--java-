// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.util;

import java.util.Map;

public class SimpleArrayMap
{
    static Object[] mBaseCache;
    static int mBaseCacheSize;
    static Object[] mTwiceBaseCache;
    static int mTwiceBaseCacheSize;
    private static final String[] z;
    Object[] mArray;
    int[] mHashes;
    int mSize;
    
    static {
        final String[] z2 = new String[4];
        String s = "\nH{*~\u0002qr3$";
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
                        c2 = '\r';
                        break;
                    }
                    case 0: {
                        c2 = '\"';
                        break;
                    }
                    case 1: {
                        c2 = '<';
                        break;
                    }
                    case 2: {
                        c2 = '\u0013';
                        break;
                    }
                    case 3: {
                        c2 = 'C';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "YA";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\nH{*~\u0002qr3$";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\u000e\u001c";
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
    
    public SimpleArrayMap() {
        this.mHashes = ContainerHelpers.EMPTY_INTS;
        this.mArray = ContainerHelpers.EMPTY_OBJECTS;
        this.mSize = 0;
    }
    
    public SimpleArrayMap(final int n) {
        Label_0028: {
            if (n != 0) {
                break Label_0028;
            }
            try {
                this.mHashes = ContainerHelpers.EMPTY_INTS;
                this.mArray = ContainerHelpers.EMPTY_OBJECTS;
                if (LruCache.a != 0) {
                    this.allocArrays(n);
                }
                this.mSize = 0;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
    }
    
    private void allocArrays(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iload_1        
        //     1: bipush          8
        //     3: if_icmpne       88
        //     6: ldc             Landroid/support/v4/util/ArrayMap;.class
        //     8: monitorenter   
        //     9: getstatic       android/support/v4/util/SimpleArrayMap.mTwiceBaseCache:[Ljava/lang/Object;
        //    12: ifnull          75
        //    15: getstatic       android/support/v4/util/SimpleArrayMap.mTwiceBaseCache:[Ljava/lang/Object;
        //    18: astore          7
        //    20: aload_0        
        //    21: aload           7
        //    23: putfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //    26: aload           7
        //    28: iconst_0       
        //    29: aaload         
        //    30: checkcast       [Ljava/lang/Object;
        //    33: checkcast       [Ljava/lang/Object;
        //    36: putstatic       android/support/v4/util/SimpleArrayMap.mTwiceBaseCache:[Ljava/lang/Object;
        //    39: aload_0        
        //    40: aload           7
        //    42: iconst_1       
        //    43: aaload         
        //    44: checkcast       [I
        //    47: checkcast       [I
        //    50: putfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //    53: aload           7
        //    55: iconst_1       
        //    56: aconst_null    
        //    57: aastore        
        //    58: aload           7
        //    60: iconst_0       
        //    61: aconst_null    
        //    62: aastore        
        //    63: iconst_m1      
        //    64: getstatic       android/support/v4/util/SimpleArrayMap.mTwiceBaseCacheSize:I
        //    67: iadd           
        //    68: putstatic       android/support/v4/util/SimpleArrayMap.mTwiceBaseCacheSize:I
        //    71: ldc             Landroid/support/v4/util/ArrayMap;.class
        //    73: monitorexit    
        //    74: return         
        //    75: ldc             Landroid/support/v4/util/ArrayMap;.class
        //    77: monitorexit    
        //    78: getstatic       android/support/v4/util/LruCache.a:I
        //    81: istore          6
        //    83: iload           6
        //    85: ifeq            178
        //    88: iload_1        
        //    89: iconst_4       
        //    90: if_icmpne       178
        //    93: ldc             Landroid/support/v4/util/ArrayMap;.class
        //    95: monitorenter   
        //    96: getstatic       android/support/v4/util/SimpleArrayMap.mBaseCache:[Ljava/lang/Object;
        //    99: ifnull          175
        //   102: getstatic       android/support/v4/util/SimpleArrayMap.mBaseCache:[Ljava/lang/Object;
        //   105: astore_3       
        //   106: aload_0        
        //   107: aload_3        
        //   108: putfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //   111: aload_3        
        //   112: iconst_0       
        //   113: aaload         
        //   114: checkcast       [Ljava/lang/Object;
        //   117: checkcast       [Ljava/lang/Object;
        //   120: putstatic       android/support/v4/util/SimpleArrayMap.mBaseCache:[Ljava/lang/Object;
        //   123: aload_0        
        //   124: aload_3        
        //   125: iconst_1       
        //   126: aaload         
        //   127: checkcast       [I
        //   130: checkcast       [I
        //   133: putfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //   136: aload_3        
        //   137: iconst_1       
        //   138: aconst_null    
        //   139: aastore        
        //   140: aload_3        
        //   141: iconst_0       
        //   142: aconst_null    
        //   143: aastore        
        //   144: iconst_m1      
        //   145: getstatic       android/support/v4/util/SimpleArrayMap.mBaseCacheSize:I
        //   148: iadd           
        //   149: putstatic       android/support/v4/util/SimpleArrayMap.mBaseCacheSize:I
        //   152: ldc             Landroid/support/v4/util/ArrayMap;.class
        //   154: monitorexit    
        //   155: return         
        //   156: astore_2       
        //   157: ldc             Landroid/support/v4/util/ArrayMap;.class
        //   159: monitorexit    
        //   160: aload_2        
        //   161: athrow         
        //   162: astore          4
        //   164: ldc             Landroid/support/v4/util/ArrayMap;.class
        //   166: monitorexit    
        //   167: aload           4
        //   169: athrow         
        //   170: astore          5
        //   172: aload           5
        //   174: athrow         
        //   175: ldc             Landroid/support/v4/util/ArrayMap;.class
        //   177: monitorexit    
        //   178: aload_0        
        //   179: iload_1        
        //   180: newarray        I
        //   182: putfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //   185: aload_0        
        //   186: iload_1        
        //   187: iconst_1       
        //   188: ishl           
        //   189: anewarray       Ljava/lang/Object;
        //   192: putfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //   195: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  9      74     162    170    Any
        //  75     78     162    170    Any
        //  78     83     170    175    Ljava/lang/NullPointerException;
        //  96     155    156    162    Any
        //  157    160    156    162    Any
        //  164    167    162    170    Any
        //  175    178    156    162    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0088:
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
    
    private static void freeArrays(final int[] p0, final Object[] p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/util/LruCache.a:I
        //     3: istore_3       
        //     4: aload_0        
        //     5: arraylength    
        //     6: bipush          8
        //     8: if_icmpne       76
        //    11: ldc             Landroid/support/v4/util/ArrayMap;.class
        //    13: monitorenter   
        //    14: getstatic       android/support/v4/util/SimpleArrayMap.mTwiceBaseCacheSize:I
        //    17: bipush          10
        //    19: if_icmpge       69
        //    22: aload_1        
        //    23: iconst_0       
        //    24: getstatic       android/support/v4/util/SimpleArrayMap.mTwiceBaseCache:[Ljava/lang/Object;
        //    27: aastore        
        //    28: aload_1        
        //    29: iconst_1       
        //    30: aload_0        
        //    31: aastore        
        //    32: iconst_m1      
        //    33: iload_2        
        //    34: iconst_1       
        //    35: ishl           
        //    36: iadd           
        //    37: istore          9
        //    39: iload           9
        //    41: iconst_2       
        //    42: if_icmplt       57
        //    45: aload_1        
        //    46: iload           9
        //    48: aconst_null    
        //    49: aastore        
        //    50: iinc            9, -1
        //    53: iload_3        
        //    54: ifeq            39
        //    57: aload_1        
        //    58: putstatic       android/support/v4/util/SimpleArrayMap.mTwiceBaseCache:[Ljava/lang/Object;
        //    61: iconst_1       
        //    62: getstatic       android/support/v4/util/SimpleArrayMap.mTwiceBaseCacheSize:I
        //    65: iadd           
        //    66: putstatic       android/support/v4/util/SimpleArrayMap.mTwiceBaseCacheSize:I
        //    69: ldc             Landroid/support/v4/util/ArrayMap;.class
        //    71: monitorexit    
        //    72: iload_3        
        //    73: ifeq            147
        //    76: aload_0        
        //    77: arraylength    
        //    78: istore          5
        //    80: iload           5
        //    82: iconst_4       
        //    83: if_icmpne       147
        //    86: ldc             Landroid/support/v4/util/ArrayMap;.class
        //    88: monitorenter   
        //    89: getstatic       android/support/v4/util/SimpleArrayMap.mBaseCacheSize:I
        //    92: bipush          10
        //    94: if_icmpge       144
        //    97: aload_1        
        //    98: iconst_0       
        //    99: getstatic       android/support/v4/util/SimpleArrayMap.mBaseCache:[Ljava/lang/Object;
        //   102: aastore        
        //   103: aload_1        
        //   104: iconst_1       
        //   105: aload_0        
        //   106: aastore        
        //   107: iconst_m1      
        //   108: iload_2        
        //   109: iconst_1       
        //   110: ishl           
        //   111: iadd           
        //   112: istore          7
        //   114: iload           7
        //   116: iconst_2       
        //   117: if_icmplt       132
        //   120: aload_1        
        //   121: iload           7
        //   123: aconst_null    
        //   124: aastore        
        //   125: iinc            7, -1
        //   128: iload_3        
        //   129: ifeq            114
        //   132: aload_1        
        //   133: putstatic       android/support/v4/util/SimpleArrayMap.mBaseCache:[Ljava/lang/Object;
        //   136: iconst_1       
        //   137: getstatic       android/support/v4/util/SimpleArrayMap.mBaseCacheSize:I
        //   140: iadd           
        //   141: putstatic       android/support/v4/util/SimpleArrayMap.mBaseCacheSize:I
        //   144: ldc             Landroid/support/v4/util/ArrayMap;.class
        //   146: monitorexit    
        //   147: return         
        //   148: astore          8
        //   150: ldc             Landroid/support/v4/util/ArrayMap;.class
        //   152: monitorexit    
        //   153: aload           8
        //   155: athrow         
        //   156: astore          4
        //   158: aload           4
        //   160: athrow         
        //   161: astore          6
        //   163: ldc             Landroid/support/v4/util/ArrayMap;.class
        //   165: monitorexit    
        //   166: aload           6
        //   168: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  14     32     148    156    Any
        //  45     50     148    156    Any
        //  57     69     148    156    Any
        //  69     72     148    156    Any
        //  76     80     156    161    Ljava/lang/NullPointerException;
        //  89     107    161    169    Any
        //  120    125    161    169    Any
        //  132    144    161    169    Any
        //  144    147    161    169    Any
        //  150    153    148    156    Any
        //  163    166    161    169    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 102, Size: 102
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
    
    public void clear() {
        try {
            if (this.mSize != 0) {
                freeArrays(this.mHashes, this.mArray, this.mSize);
                this.mHashes = ContainerHelpers.EMPTY_INTS;
                this.mArray = ContainerHelpers.EMPTY_OBJECTS;
                this.mSize = 0;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    public boolean containsKey(final Object o) {
        try {
            if (this.indexOfKey(o) >= 0) {
                return true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    public boolean containsValue(final Object o) {
        try {
            if (this.indexOfValue(o) >= 0) {
                return true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    public void ensureCapacity(final int n) {
        if (this.mHashes.length >= n) {
            return;
        }
        final int[] mHashes = this.mHashes;
        final Object[] mArray = this.mArray;
        try {
            this.allocArrays(n);
            if (this.mSize > 0) {
                System.arraycopy(mHashes, 0, this.mHashes, 0, this.mSize);
                System.arraycopy(mArray, 0, this.mArray, 0, this.mSize << 1);
            }
            freeArrays(mHashes, mArray, this.mSize);
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        final int a = LruCache.a;
        if (this != o) {
            if (!(o instanceof Map)) {
                goto Label_0150;
            }
            final Map map = (Map)o;
            try {
                if (this.size() != map.size()) {
                    return false;
                }
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            int i = 0;
            try {
                while (i < this.mSize) {
                    final Object key = this.keyAt(i);
                    final Object value = this.valueAt(i);
                    final Object value2 = map.get(key);
                    Label_0137: {
                        if (value == null) {
                            if (value2 != null) {
                                return false;
                            }
                            try {
                                if (!map.containsKey(key)) {
                                    return false;
                                }
                                break Label_0137;
                            }
                            catch (NullPointerException ex2) {
                                throw ex2;
                            }
                        }
                        if (!value.equals(value2)) {
                            return false;
                        }
                    }
                    ++i;
                    if (a != 0) {
                        return true;
                    }
                }
                return true;
            }
            catch (ClassCastException ex3) {
                return false;
            }
            catch (NullPointerException ex4) {
                return false;
            }
        }
        return true;
    }
    
    public Object get(final Object o) {
        final int indexOfKey = this.indexOfKey(o);
        if (indexOfKey >= 0) {
            try {
                return this.mArray[1 + (indexOfKey << 1)];
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        return null;
    }
    
    @Override
    public int hashCode() {
        final int a = LruCache.a;
        final int[] mHashes = this.mHashes;
        final Object[] mArray = this.mArray;
        final int mSize = this.mSize;
        int n = 1;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            if (n2 >= mSize) {
                return n3;
            }
            int n5;
            while (true) {
                final Object o = mArray[n];
                while (true) {
                    try {
                        final int n4 = mHashes[n2];
                        if (o == null) {
                            final int hashCode = 0;
                            n3 += (hashCode ^ n4);
                            ++n2;
                            n5 = n + 2;
                            if (a != 0) {
                                return n3;
                            }
                            break;
                        }
                    }
                    catch (NullPointerException ex) {
                        throw ex;
                    }
                    final int hashCode = o.hashCode();
                    continue;
                }
            }
            n = n5;
        }
    }
    
    int indexOf(final Object p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //     8: istore          4
        //    10: iload           4
        //    12: ifne            21
        //    15: iconst_m1      
        //    16: istore          8
        //    18: iload           8
        //    20: ireturn        
        //    21: aload_0        
        //    22: getfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //    25: iload           4
        //    27: iload_2        
        //    28: invokestatic    android/support/v4/util/ContainerHelpers.binarySearch:([III)I
        //    31: istore          5
        //    33: iload           5
        //    35: ifge            41
        //    38: iload           5
        //    40: ireturn        
        //    41: aload_1        
        //    42: aload_0        
        //    43: getfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //    46: iload           5
        //    48: iconst_1       
        //    49: ishl           
        //    50: aaload         
        //    51: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    54: istore          7
        //    56: iload           7
        //    58: ifeq            69
        //    61: iload           5
        //    63: ireturn        
        //    64: astore          6
        //    66: aload           6
        //    68: athrow         
        //    69: iload           5
        //    71: iconst_1       
        //    72: iadd           
        //    73: istore          8
        //    75: iload           8
        //    77: iload           4
        //    79: if_icmpge       124
        //    82: aload_0        
        //    83: getfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //    86: iload           8
        //    88: iaload         
        //    89: istore          16
        //    91: iload           16
        //    93: iload_2        
        //    94: if_icmpne       124
        //    97: aload_1        
        //    98: aload_0        
        //    99: getfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //   102: iload           8
        //   104: iconst_1       
        //   105: ishl           
        //   106: aaload         
        //   107: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   110: istore          17
        //   112: iload           17
        //   114: ifne            18
        //   117: iinc            8, 1
        //   120: iload_3        
        //   121: ifeq            75
        //   124: iload           5
        //   126: iconst_1       
        //   127: isub           
        //   128: istore          9
        //   130: iload           9
        //   132: iflt            200
        //   135: aload_0        
        //   136: getfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //   139: iload           9
        //   141: iaload         
        //   142: istore          12
        //   144: iload           12
        //   146: iload_2        
        //   147: if_icmpne       200
        //   150: aload_1        
        //   151: aload_0        
        //   152: getfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //   155: iload           9
        //   157: iconst_1       
        //   158: ishl           
        //   159: aaload         
        //   160: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   163: istore          13
        //   165: iload           13
        //   167: ifeq            193
        //   170: iload           9
        //   172: ireturn        
        //   173: astore          14
        //   175: aload           14
        //   177: athrow         
        //   178: astore          15
        //   180: aload           15
        //   182: athrow         
        //   183: astore          10
        //   185: aload           10
        //   187: athrow         
        //   188: astore          11
        //   190: aload           11
        //   192: athrow         
        //   193: iinc            9, -1
        //   196: iload_3        
        //   197: ifeq            130
        //   200: iload           8
        //   202: iconst_m1      
        //   203: ixor           
        //   204: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  41     56     64     69     Ljava/lang/NullPointerException;
        //  82     91     173    178    Ljava/lang/NullPointerException;
        //  97     112    178    183    Ljava/lang/NullPointerException;
        //  135    144    183    188    Ljava/lang/NullPointerException;
        //  150    165    188    193    Ljava/lang/NullPointerException;
        //  175    178    178    183    Ljava/lang/NullPointerException;
        //  185    188    188    193    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 112, Size: 112
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
    
    public int indexOfKey(final Object o) {
        if (o == null) {
            try {
                return this.indexOfNull();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        return this.indexOf(o, o.hashCode());
    }
    
    int indexOfNull() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //     8: istore_2       
        //     9: iload_2        
        //    10: ifne            19
        //    13: iconst_m1      
        //    14: istore          6
        //    16: iload           6
        //    18: ireturn        
        //    19: aload_0        
        //    20: getfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //    23: iload_2        
        //    24: iconst_0       
        //    25: invokestatic    android/support/v4/util/ContainerHelpers.binarySearch:([III)I
        //    28: istore_3       
        //    29: iload_3        
        //    30: ifge            35
        //    33: iload_3        
        //    34: ireturn        
        //    35: aload_0        
        //    36: getfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //    39: iload_3        
        //    40: iconst_1       
        //    41: ishl           
        //    42: aaload         
        //    43: astore          5
        //    45: aload           5
        //    47: ifnonnull       57
        //    50: iload_3        
        //    51: ireturn        
        //    52: astore          4
        //    54: aload           4
        //    56: athrow         
        //    57: iload_3        
        //    58: iconst_1       
        //    59: iadd           
        //    60: istore          6
        //    62: iload           6
        //    64: iload_2        
        //    65: if_icmpge       105
        //    68: aload_0        
        //    69: getfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //    72: iload           6
        //    74: iaload         
        //    75: istore          14
        //    77: iload           14
        //    79: ifne            105
        //    82: aload_0        
        //    83: getfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //    86: iload           6
        //    88: iconst_1       
        //    89: ishl           
        //    90: aaload         
        //    91: astore          15
        //    93: aload           15
        //    95: ifnull          16
        //    98: iinc            6, 1
        //   101: iload_1        
        //   102: ifeq            62
        //   105: iload_3        
        //   106: iconst_1       
        //   107: isub           
        //   108: istore          7
        //   110: iload           7
        //   112: iflt            175
        //   115: aload_0        
        //   116: getfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //   119: iload           7
        //   121: iaload         
        //   122: istore          10
        //   124: iload           10
        //   126: ifne            175
        //   129: aload_0        
        //   130: getfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //   133: iload           7
        //   135: iconst_1       
        //   136: ishl           
        //   137: aaload         
        //   138: astore          11
        //   140: aload           11
        //   142: ifnonnull       168
        //   145: iload           7
        //   147: ireturn        
        //   148: astore          12
        //   150: aload           12
        //   152: athrow         
        //   153: astore          13
        //   155: aload           13
        //   157: athrow         
        //   158: astore          8
        //   160: aload           8
        //   162: athrow         
        //   163: astore          9
        //   165: aload           9
        //   167: athrow         
        //   168: iinc            7, -1
        //   171: iload_1        
        //   172: ifeq            110
        //   175: iload           6
        //   177: iconst_m1      
        //   178: ixor           
        //   179: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  35     45     52     57     Ljava/lang/NullPointerException;
        //  68     77     148    153    Ljava/lang/NullPointerException;
        //  82     93     153    158    Ljava/lang/NullPointerException;
        //  115    124    158    163    Ljava/lang/NullPointerException;
        //  129    140    163    168    Ljava/lang/NullPointerException;
        //  150    153    153    158    Ljava/lang/NullPointerException;
        //  160    163    163    168    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 104, Size: 104
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
    
    int indexOfValue(final Object o) {
        int i = 1;
        final int a = LruCache.a;
        final int n = 2 * this.mSize;
        final Object[] mArray = this.mArray;
        if (o == null) {
            int j = i;
            while (j < n) {
                try {
                    if (mArray[j] == null) {
                        return j >> 1;
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
                j += 2;
                if (a != 0) {
                    break;
                }
            }
            if (a == 0) {
                return -1;
            }
        }
        while (i < n) {
            try {
                if (o.equals(mArray[i])) {
                    return i >> 1;
                }
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
            i += 2;
            if (a != 0) {
                break;
            }
        }
        return -1;
    }
    
    public boolean isEmpty() {
        try {
            if (this.mSize <= 0) {
                return true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    public Object keyAt(final int n) {
        return this.mArray[n << 1];
    }
    
    public Object put(final Object p0, final Object p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: bipush          8
        //     2: istore_3       
        //     3: aload_1        
        //     4: ifnonnull       26
        //     7: aload_0        
        //     8: invokevirtual   android/support/v4/util/SimpleArrayMap.indexOfNull:()I
        //    11: istore          5
        //    13: getstatic       android/support/v4/util/LruCache.a:I
        //    16: istore          21
        //    18: iconst_0       
        //    19: istore          4
        //    21: iload           21
        //    23: ifeq            41
        //    26: aload_1        
        //    27: invokevirtual   java/lang/Object.hashCode:()I
        //    30: istore          4
        //    32: aload_0        
        //    33: aload_1        
        //    34: iload           4
        //    36: invokevirtual   android/support/v4/util/SimpleArrayMap.indexOf:(Ljava/lang/Object;I)I
        //    39: istore          5
        //    41: iload           5
        //    43: iflt            74
        //    46: iconst_1       
        //    47: iload           5
        //    49: iconst_1       
        //    50: ishl           
        //    51: iadd           
        //    52: istore          19
        //    54: aload_0        
        //    55: getfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //    58: iload           19
        //    60: aaload         
        //    61: astore          20
        //    63: aload_0        
        //    64: getfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //    67: iload           19
        //    69: aload_2        
        //    70: aastore        
        //    71: aload           20
        //    73: areturn        
        //    74: iload           5
        //    76: iconst_m1      
        //    77: ixor           
        //    78: istore          6
        //    80: aload_0        
        //    81: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //    84: istore          9
        //    86: aload_0        
        //    87: getfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //    90: arraylength    
        //    91: istore          10
        //    93: iload           9
        //    95: iload           10
        //    97: if_icmplt       192
        //   100: aload_0        
        //   101: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   104: iload_3        
        //   105: if_icmplt       308
        //   108: aload_0        
        //   109: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   112: istore          17
        //   114: aload_0        
        //   115: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   118: istore          18
        //   120: iload           17
        //   122: iload           18
        //   124: iconst_1       
        //   125: ishr           
        //   126: iadd           
        //   127: istore_3       
        //   128: aload_0        
        //   129: getfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //   132: astore          14
        //   134: aload_0        
        //   135: getfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //   138: astore          15
        //   140: aload_0        
        //   141: iload_3        
        //   142: invokespecial   android/support/v4/util/SimpleArrayMap.allocArrays:(I)V
        //   145: aload_0        
        //   146: getfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //   149: arraylength    
        //   150: ifle            181
        //   153: aload           14
        //   155: iconst_0       
        //   156: aload_0        
        //   157: getfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //   160: iconst_0       
        //   161: aload           14
        //   163: arraylength    
        //   164: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   167: aload           15
        //   169: iconst_0       
        //   170: aload_0        
        //   171: getfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //   174: iconst_0       
        //   175: aload           15
        //   177: arraylength    
        //   178: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   181: aload           14
        //   183: aload           15
        //   185: aload_0        
        //   186: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   189: invokestatic    android/support/v4/util/SimpleArrayMap.freeArrays:([I[Ljava/lang/Object;I)V
        //   192: iload           6
        //   194: aload_0        
        //   195: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   198: if_icmpge       255
        //   201: aload_0        
        //   202: getfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //   205: iload           6
        //   207: aload_0        
        //   208: getfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //   211: iload           6
        //   213: iconst_1       
        //   214: iadd           
        //   215: aload_0        
        //   216: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   219: iload           6
        //   221: isub           
        //   222: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   225: aload_0        
        //   226: getfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //   229: iload           6
        //   231: iconst_1       
        //   232: ishl           
        //   233: aload_0        
        //   234: getfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //   237: iload           6
        //   239: iconst_1       
        //   240: iadd           
        //   241: iconst_1       
        //   242: ishl           
        //   243: aload_0        
        //   244: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   247: iload           6
        //   249: isub           
        //   250: iconst_1       
        //   251: ishl           
        //   252: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   255: aload_0        
        //   256: getfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //   259: iload           6
        //   261: iload           4
        //   263: iastore        
        //   264: aload_0        
        //   265: getfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //   268: iload           6
        //   270: iconst_1       
        //   271: ishl           
        //   272: aload_1        
        //   273: aastore        
        //   274: aload_0        
        //   275: getfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //   278: iconst_1       
        //   279: iload           6
        //   281: iconst_1       
        //   282: ishl           
        //   283: iadd           
        //   284: aload_2        
        //   285: aastore        
        //   286: aload_0        
        //   287: iconst_1       
        //   288: aload_0        
        //   289: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   292: iadd           
        //   293: putfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   296: aconst_null    
        //   297: areturn        
        //   298: astore          7
        //   300: aload           7
        //   302: athrow         
        //   303: astore          8
        //   305: aload           8
        //   307: athrow         
        //   308: aload_0        
        //   309: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   312: istore          13
        //   314: iload           13
        //   316: iconst_4       
        //   317: if_icmpge       128
        //   320: iconst_4       
        //   321: istore_3       
        //   322: goto            128
        //   325: astore          12
        //   327: aload           12
        //   329: athrow         
        //   330: astore          16
        //   332: aload           16
        //   334: athrow         
        //   335: astore          11
        //   337: aload           11
        //   339: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  80     93     298    303    Ljava/lang/NullPointerException;
        //  100    120    303    308    Ljava/lang/NullPointerException;
        //  140    181    330    335    Ljava/lang/NullPointerException;
        //  192    255    335    340    Ljava/lang/NullPointerException;
        //  300    303    303    308    Ljava/lang/NullPointerException;
        //  308    314    325    330    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 194, Size: 194
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
    
    public Object remove(final Object o) {
        final int indexOfKey = this.indexOfKey(o);
        if (indexOfKey >= 0) {
            try {
                return this.removeAt(indexOfKey);
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        return null;
    }
    
    public Object removeAt(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: bipush          8
        //     2: istore_2       
        //     3: getstatic       android/support/v4/util/LruCache.a:I
        //     6: istore_3       
        //     7: aload_0        
        //     8: getfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //    11: iconst_1       
        //    12: iload_1        
        //    13: iconst_1       
        //    14: ishl           
        //    15: iadd           
        //    16: aaload         
        //    17: astore          4
        //    19: aload_0        
        //    20: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //    23: istore          10
        //    25: iload           10
        //    27: iconst_1       
        //    28: if_icmpgt       69
        //    31: aload_0        
        //    32: getfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //    35: aload_0        
        //    36: getfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //    39: aload_0        
        //    40: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //    43: invokestatic    android/support/v4/util/SimpleArrayMap.freeArrays:([I[Ljava/lang/Object;I)V
        //    46: aload_0        
        //    47: getstatic       android/support/v4/util/ContainerHelpers.EMPTY_INTS:[I
        //    50: putfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //    53: aload_0        
        //    54: getstatic       android/support/v4/util/ContainerHelpers.EMPTY_OBJECTS:[Ljava/lang/Object;
        //    57: putfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //    60: aload_0        
        //    61: iconst_0       
        //    62: putfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //    65: iload_3        
        //    66: ifeq            337
        //    69: aload_0        
        //    70: getfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //    73: arraylength    
        //    74: istore          11
        //    76: iload           11
        //    78: iload_2        
        //    79: if_icmple       245
        //    82: aload_0        
        //    83: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //    86: istore          13
        //    88: aload_0        
        //    89: getfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //    92: arraylength    
        //    93: iconst_3       
        //    94: idiv           
        //    95: istore          14
        //    97: iload           13
        //    99: iload           14
        //   101: if_icmpge       245
        //   104: aload_0        
        //   105: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   108: iload_2        
        //   109: if_icmple       132
        //   112: aload_0        
        //   113: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   116: istore          19
        //   118: aload_0        
        //   119: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   122: istore          20
        //   124: iload           19
        //   126: iload           20
        //   128: iconst_1       
        //   129: ishr           
        //   130: iadd           
        //   131: istore_2       
        //   132: aload_0        
        //   133: getfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //   136: astore          15
        //   138: aload_0        
        //   139: getfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //   142: astore          16
        //   144: aload_0        
        //   145: iload_2        
        //   146: invokespecial   android/support/v4/util/SimpleArrayMap.allocArrays:(I)V
        //   149: aload_0        
        //   150: iconst_m1      
        //   151: aload_0        
        //   152: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   155: iadd           
        //   156: putfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   159: iload_1        
        //   160: ifle            189
        //   163: aload           15
        //   165: iconst_0       
        //   166: aload_0        
        //   167: getfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //   170: iconst_0       
        //   171: iload_1        
        //   172: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   175: aload           16
        //   177: iconst_0       
        //   178: aload_0        
        //   179: getfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //   182: iconst_0       
        //   183: iload_1        
        //   184: iconst_1       
        //   185: ishl           
        //   186: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   189: iload_1        
        //   190: aload_0        
        //   191: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   194: if_icmpge       241
        //   197: aload           15
        //   199: iload_1        
        //   200: iconst_1       
        //   201: iadd           
        //   202: aload_0        
        //   203: getfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //   206: iload_1        
        //   207: aload_0        
        //   208: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   211: iload_1        
        //   212: isub           
        //   213: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   216: aload           16
        //   218: iload_1        
        //   219: iconst_1       
        //   220: iadd           
        //   221: iconst_1       
        //   222: ishl           
        //   223: aload_0        
        //   224: getfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //   227: iload_1        
        //   228: iconst_1       
        //   229: ishl           
        //   230: aload_0        
        //   231: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   234: iload_1        
        //   235: isub           
        //   236: iconst_1       
        //   237: ishl           
        //   238: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   241: iload_3        
        //   242: ifeq            337
        //   245: aload_0        
        //   246: iconst_m1      
        //   247: aload_0        
        //   248: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   251: iadd           
        //   252: putfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   255: iload_1        
        //   256: aload_0        
        //   257: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   260: if_icmpge       311
        //   263: aload_0        
        //   264: getfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //   267: iload_1        
        //   268: iconst_1       
        //   269: iadd           
        //   270: aload_0        
        //   271: getfield        android/support/v4/util/SimpleArrayMap.mHashes:[I
        //   274: iload_1        
        //   275: aload_0        
        //   276: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   279: iload_1        
        //   280: isub           
        //   281: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   284: aload_0        
        //   285: getfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //   288: iload_1        
        //   289: iconst_1       
        //   290: iadd           
        //   291: iconst_1       
        //   292: ishl           
        //   293: aload_0        
        //   294: getfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //   297: iload_1        
        //   298: iconst_1       
        //   299: ishl           
        //   300: aload_0        
        //   301: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   304: iload_1        
        //   305: isub           
        //   306: iconst_1       
        //   307: ishl           
        //   308: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   311: aload_0        
        //   312: getfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //   315: aload_0        
        //   316: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   319: iconst_1       
        //   320: ishl           
        //   321: aconst_null    
        //   322: aastore        
        //   323: aload_0        
        //   324: getfield        android/support/v4/util/SimpleArrayMap.mArray:[Ljava/lang/Object;
        //   327: iconst_1       
        //   328: aload_0        
        //   329: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //   332: iconst_1       
        //   333: ishl           
        //   334: iadd           
        //   335: aconst_null    
        //   336: aastore        
        //   337: aload           4
        //   339: areturn        
        //   340: astore          5
        //   342: aload           5
        //   344: athrow         
        //   345: astore          6
        //   347: aload           6
        //   349: athrow         
        //   350: astore          7
        //   352: aload           7
        //   354: athrow         
        //   355: astore          8
        //   357: aload           8
        //   359: athrow         
        //   360: astore          9
        //   362: aload           9
        //   364: athrow         
        //   365: astore          17
        //   367: aload           17
        //   369: athrow         
        //   370: astore          18
        //   372: aload           18
        //   374: athrow         
        //   375: astore          12
        //   377: aload           12
        //   379: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  19     25     340    345    Ljava/lang/NullPointerException;
        //  31     65     345    350    Ljava/lang/NullPointerException;
        //  69     76     350    355    Ljava/lang/NullPointerException;
        //  82     97     355    360    Ljava/lang/NullPointerException;
        //  104    124    360    365    Ljava/lang/NullPointerException;
        //  144    159    365    370    Ljava/lang/NullPointerException;
        //  163    189    365    370    Ljava/lang/NullPointerException;
        //  189    241    370    375    Ljava/lang/NullPointerException;
        //  245    311    375    380    Ljava/lang/NullPointerException;
        //  342    345    345    350    Ljava/lang/NullPointerException;
        //  347    350    350    355    Ljava/lang/NullPointerException;
        //  352    355    355    360    Ljava/lang/NullPointerException;
        //  357    360    360    365    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 227, Size: 227
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
    
    public Object setValueAt(final int n, final Object o) {
        final int n2 = 1 + (n << 1);
        final Object o2 = this.mArray[n2];
        this.mArray[n2] = o;
        return o2;
    }
    
    public int size() {
        return this.mSize;
    }
    
    @Override
    public String toString() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_1       
        //     2: getstatic       android/support/v4/util/LruCache.a:I
        //     5: istore_2       
        //     6: aload_0        
        //     7: invokevirtual   android/support/v4/util/SimpleArrayMap.isEmpty:()Z
        //    10: ifeq            26
        //    13: getstatic       android/support/v4/util/SimpleArrayMap.z:[Ljava/lang/String;
        //    16: iconst_1       
        //    17: aaload         
        //    18: astore          18
        //    20: aload           18
        //    22: areturn        
        //    23: astore_3       
        //    24: aload_3        
        //    25: athrow         
        //    26: new             Ljava/lang/StringBuilder;
        //    29: dup            
        //    30: bipush          28
        //    32: aload_0        
        //    33: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //    36: imul           
        //    37: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    40: astore          4
        //    42: aload           4
        //    44: bipush          123
        //    46: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    49: pop            
        //    50: iload_1        
        //    51: aload_0        
        //    52: getfield        android/support/v4/util/SimpleArrayMap.mSize:I
        //    55: if_icmpge       160
        //    58: iload_1        
        //    59: ifle            73
        //    62: aload           4
        //    64: getstatic       android/support/v4/util/SimpleArrayMap.z:[Ljava/lang/String;
        //    67: iconst_3       
        //    68: aaload         
        //    69: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    72: pop            
        //    73: aload_0        
        //    74: iload_1        
        //    75: invokevirtual   android/support/v4/util/SimpleArrayMap.keyAt:(I)Ljava/lang/Object;
        //    78: astore          7
        //    80: aload           7
        //    82: aload_0        
        //    83: if_acmpeq       98
        //    86: aload           4
        //    88: aload           7
        //    90: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    93: pop            
        //    94: iload_2        
        //    95: ifeq            109
        //    98: aload           4
        //   100: getstatic       android/support/v4/util/SimpleArrayMap.z:[Ljava/lang/String;
        //   103: iconst_2       
        //   104: aaload         
        //   105: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   108: pop            
        //   109: aload           4
        //   111: bipush          61
        //   113: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   116: pop            
        //   117: aload_0        
        //   118: iload_1        
        //   119: invokevirtual   android/support/v4/util/SimpleArrayMap.valueAt:(I)Ljava/lang/Object;
        //   122: astore          11
        //   124: aload           11
        //   126: aload_0        
        //   127: if_acmpeq       142
        //   130: aload           4
        //   132: aload           11
        //   134: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   137: pop            
        //   138: iload_2        
        //   139: ifeq            153
        //   142: aload           4
        //   144: getstatic       android/support/v4/util/SimpleArrayMap.z:[Ljava/lang/String;
        //   147: iconst_0       
        //   148: aaload         
        //   149: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   152: pop            
        //   153: iinc            1, 1
        //   156: iload_2        
        //   157: ifeq            50
        //   160: aload           4
        //   162: bipush          125
        //   164: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   167: pop            
        //   168: aload           4
        //   170: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   173: areturn        
        //   174: astore          16
        //   176: aload           16
        //   178: athrow         
        //   179: astore          8
        //   181: aload           8
        //   183: athrow         
        //   184: astore          12
        //   186: aload           12
        //   188: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  6      20     23     26     Ljava/lang/NullPointerException;
        //  62     73     174    179    Ljava/lang/NullPointerException;
        //  86     94     179    184    Ljava/lang/NullPointerException;
        //  98     109    179    184    Ljava/lang/NullPointerException;
        //  130    138    184    189    Ljava/lang/NullPointerException;
        //  142    153    184    189    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 101, Size: 101
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
    
    public Object valueAt(final int n) {
        return this.mArray[1 + (n << 1)];
    }
}
