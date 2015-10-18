// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Set;
import java.util.SortedMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

class gh extends AbstractMap
{
    private Map a;
    private final int b;
    private List c;
    private boolean d;
    private volatile H e;
    
    private gh(final int b) {
        this.b = b;
        this.c = Collections.emptyList();
        this.a = Collections.emptyMap();
    }
    
    gh(final int n, final gD gd) {
        this(n);
    }
    
    private int a(final Comparable comparable) {
        final boolean b = dt.b;
        final int n = -1 + this.c.size();
        if (n >= 0) {
            final int compareTo = comparable.compareTo(this.c.get(n).a());
            if (compareTo > 0) {
                return -(n + 2);
            }
            if (compareTo == 0) {
                return n;
            }
        }
        int n2;
        int i;
        int n5;
        int n6;
        for (n2 = n, i = 0; i <= n2; n2 = n5, i = n6) {
            final int n3 = (i + n2) / 2;
            final int compareTo2 = comparable.compareTo(this.c.get(n3).a());
            int n4 = 0;
            Label_0143: {
                if (compareTo2 < 0) {
                    n4 = n3 - 1;
                    if (!b) {
                        break Label_0143;
                    }
                }
                else {
                    n4 = n2;
                }
                if (compareTo2 > 0) {
                    i = n3 + 1;
                    if (!b) {
                        break Label_0143;
                    }
                }
                return n3;
            }
            n5 = n4;
            n6 = i;
            if (b) {
                return -(n6 + 1);
            }
        }
        n6 = i;
        return -(n6 + 1);
    }
    
    static gh a(final int n) {
        return new gD(n);
    }
    
    static Object a(final gh gh, final int n) {
        return gh.b(n);
    }
    
    static List a(final gh gh) {
        return gh.c;
    }
    
    private Object b(final int n) {
        this.e();
        final Object value = this.c.remove(n).getValue();
        if (!this.a.isEmpty()) {
            final Iterator iterator = this.g().entrySet().iterator();
            this.c.add(new cn(this, (Entry)iterator.next()));
            iterator.remove();
        }
        return value;
    }
    
    static Map b(final gh gh) {
        return gh.a;
    }
    
    private void b() {
        try {
            this.e();
            if (!this.c.isEmpty()) {
                return;
            }
            final gh gh = this;
            final List list = gh.c;
            final boolean b = list instanceof ArrayList;
            if (!b) {
                final gh gh2 = this;
                final gh gh3 = this;
                final int n = gh3.b;
                final ArrayList list2 = new ArrayList(n);
                gh2.c = list2;
            }
            return;
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        try {
            final gh gh = this;
            final List list = gh.c;
            final boolean b = list instanceof ArrayList;
            if (!b) {
                final gh gh2 = this;
                final gh gh3 = this;
                final int n = gh3.b;
                final ArrayList list2 = new ArrayList(n);
                gh2.c = list2;
            }
        }
        catch (UnsupportedOperationException ex2) {
            throw ex2;
        }
    }
    
    static void c(final gh gh) {
        gh.e();
    }
    
    private void e() {
        try {
            if (this.d) {
                throw new UnsupportedOperationException();
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
    }
    
    private SortedMap g() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   com/google/gh.e:()V
        //     4: aload_0        
        //     5: getfield        com/google/gh.a:Ljava/util/Map;
        //     8: invokeinterface java/util/Map.isEmpty:()Z
        //    13: istore_3       
        //    14: iload_3        
        //    15: ifeq            39
        //    18: aload_0        
        //    19: getfield        com/google/gh.a:Ljava/util/Map;
        //    22: instanceof      Ljava/util/TreeMap;
        //    25: ifne            39
        //    28: aload_0        
        //    29: new             Ljava/util/TreeMap;
        //    32: dup            
        //    33: invokespecial   java/util/TreeMap.<init>:()V
        //    36: putfield        com/google/gh.a:Ljava/util/Map;
        //    39: aload_0        
        //    40: getfield        com/google/gh.a:Ljava/util/Map;
        //    43: checkcast       Ljava/util/SortedMap;
        //    46: areturn        
        //    47: astore_1       
        //    48: aload_1        
        //    49: athrow         
        //    50: astore_2       
        //    51: aload_2        
        //    52: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  0      14     47     50     Ljava/lang/UnsupportedOperationException;
        //  18     39     50     53     Ljava/lang/UnsupportedOperationException;
        //  48     50     50     53     Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0039:
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
    
    public Object a(final Comparable comparable, final Object value) {
        this.e();
        final int a = this.a(comparable);
        if (a >= 0) {
            try {
                return ((cn)this.c.get(a)).setValue(value);
            }
            catch (UnsupportedOperationException ex) {
                throw ex;
            }
        }
        this.b();
        final int n = -(a + 1);
        try {
            if (n >= this.b) {
                return this.g().put(comparable, value);
            }
        }
        catch (UnsupportedOperationException ex2) {
            throw ex2;
        }
        if (this.c.size() == this.b) {
            final cn cn = this.c.remove(-1 + this.b);
            this.g().put(cn.a(), cn.getValue());
        }
        this.c.add(n, new cn(this, comparable, value));
        return null;
    }
    
    public void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/gh.d:Z
        //     4: istore_3       
        //     5: iload_3        
        //     6: ifne            41
        //     9: aload_0        
        //    10: getfield        com/google/gh.a:Ljava/util/Map;
        //    13: invokeinterface java/util/Map.isEmpty:()Z
        //    18: ifeq            48
        //    21: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //    24: astore          5
        //    26: aload           5
        //    28: astore          4
        //    30: aload_0        
        //    31: aload           4
        //    33: putfield        com/google/gh.a:Ljava/util/Map;
        //    36: aload_0        
        //    37: iconst_1       
        //    38: putfield        com/google/gh.d:Z
        //    41: return         
        //    42: astore_1       
        //    43: aload_1        
        //    44: athrow         
        //    45: astore_2       
        //    46: aload_2        
        //    47: athrow         
        //    48: aload_0        
        //    49: getfield        com/google/gh.a:Ljava/util/Map;
        //    52: invokestatic    java/util/Collections.unmodifiableMap:(Ljava/util/Map;)Ljava/util/Map;
        //    55: astore          4
        //    57: goto            30
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  0      5      42     45     Ljava/lang/UnsupportedOperationException;
        //  9      26     45     48     Ljava/lang/UnsupportedOperationException;
        //  43     45     45     48     Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0030:
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
    
    public Entry c(final int n) {
        return (Entry)this.c.get(n);
    }
    
    public boolean c() {
        return this.d;
    }
    
    @Override
    public void clear() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   com/google/gh.e:()V
        //     4: aload_0        
        //     5: getfield        com/google/gh.c:Ljava/util/List;
        //     8: invokeinterface java/util/List.isEmpty:()Z
        //    13: ifne            25
        //    16: aload_0        
        //    17: getfield        com/google/gh.c:Ljava/util/List;
        //    20: invokeinterface java/util/List.clear:()V
        //    25: aload_0        
        //    26: getfield        com/google/gh.a:Ljava/util/Map;
        //    29: invokeinterface java/util/Map.isEmpty:()Z
        //    34: ifne            46
        //    37: aload_0        
        //    38: getfield        com/google/gh.a:Ljava/util/Map;
        //    41: invokeinterface java/util/Map.clear:()V
        //    46: return         
        //    47: astore_1       
        //    48: aload_1        
        //    49: athrow         
        //    50: astore_2       
        //    51: aload_2        
        //    52: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  0      25     47     50     Ljava/lang/UnsupportedOperationException;
        //  25     46     50     53     Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0025:
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
    
    @Override
    public boolean containsKey(final Object o) {
        final Comparable comparable = (Comparable)o;
        try {
            if (this.a(comparable) >= 0) {
                return true;
            }
            final gh gh = this;
            final Map map = gh.a;
            final Comparable comparable2 = comparable;
            final boolean b = map.containsKey(comparable2);
            if (b) {
                return true;
            }
            return false;
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        try {
            final gh gh = this;
            final Map map = gh.a;
            final Comparable comparable2 = comparable;
            final boolean b = map.containsKey(comparable2);
            if (b) {
                return true;
            }
        }
        catch (UnsupportedOperationException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public Iterable d() {
        try {
            if (this.a.isEmpty()) {
                return g1.a();
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        return this.a.entrySet();
    }
    
    @Override
    public Set entrySet() {
        try {
            if (this.e == null) {
                this.e = new H(this, null);
            }
            return this.e;
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
    }
    
    public int f() {
        return this.c.size();
    }
    
    @Override
    public Object get(final Object o) {
        final Comparable comparable = (Comparable)o;
        final int a = this.a(comparable);
        if (a >= 0) {
            try {
                return ((cn)this.c.get(a)).getValue();
            }
            catch (UnsupportedOperationException ex) {
                throw ex;
            }
        }
        return this.a.get(comparable);
    }
    
    @Override
    public Object put(final Object o, final Object o2) {
        return this.a((Comparable)o, o2);
    }
    
    @Override
    public Object remove(final Object o) {
        this.e();
        final Comparable comparable = (Comparable)o;
        final int a = this.a(comparable);
        if (a >= 0) {
            try {
                return this.b(a);
            }
            catch (UnsupportedOperationException ex) {
                throw ex;
            }
        }
        try {
            if (this.a.isEmpty()) {
                return null;
            }
        }
        catch (UnsupportedOperationException ex2) {
            throw ex2;
        }
        return this.a.remove(comparable);
    }
    
    @Override
    public int size() {
        return this.c.size() + this.a.size();
    }
}
