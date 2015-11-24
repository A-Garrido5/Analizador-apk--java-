// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.reflect;

import java.lang.ref.SoftReference;
import java.util.StringTokenizer;
import org.aspectj.lang.Signature;

abstract class SignatureImpl implements Signature
{
    static Class[] EMPTY_CLASS_ARRAY;
    static String[] EMPTY_STRING_ARRAY;
    static final String INNER_SEP = ":";
    static final char SEP = '-';
    private static boolean useCache;
    Class declaringType;
    String declaringTypeName;
    ClassLoader lookupClassLoader;
    int modifiers;
    String name;
    Cache stringCache;
    private String stringRep;
    
    static {
        SignatureImpl.useCache = true;
        SignatureImpl.EMPTY_STRING_ARRAY = new String[0];
        SignatureImpl.EMPTY_CLASS_ARRAY = new Class[0];
    }
    
    SignatureImpl(final int modifiers, final String name, final Class declaringType) {
        this.modifiers = -1;
        this.lookupClassLoader = null;
        this.modifiers = modifiers;
        this.name = name;
        this.declaringType = declaringType;
    }
    
    public SignatureImpl(final String stringRep) {
        this.modifiers = -1;
        this.lookupClassLoader = null;
        this.stringRep = stringRep;
    }
    
    private ClassLoader getLookupClassLoader() {
        if (this.lookupClassLoader == null) {
            this.lookupClassLoader = this.getClass().getClassLoader();
        }
        return this.lookupClassLoader;
    }
    
    static boolean getUseCache() {
        return SignatureImpl.useCache;
    }
    
    static void setUseCache(final boolean useCache) {
        SignatureImpl.useCache = useCache;
    }
    
    void addFullTypeNames(final StringBuffer sb, final Class[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.fullTypeName(array[i]));
        }
    }
    
    void addShortTypeNames(final StringBuffer sb, final Class[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.shortTypeName(array[i]));
        }
    }
    
    void addTypeArray(final StringBuffer sb, final Class[] array) {
        this.addFullTypeNames(sb, array);
    }
    
    protected abstract String createToString(final StringMaker p0);
    
    int extractInt(final int n) {
        return Integer.parseInt(this.extractString(n), 16);
    }
    
    String extractString(final int n) {
        int n2 = 0;
        int n3 = this.stringRep.indexOf(45);
        int n4 = n;
        while (true) {
            final int n5 = n4 - 1;
            if (n4 <= 0) {
                break;
            }
            n2 = n3 + 1;
            n3 = this.stringRep.indexOf(45, n2);
            n4 = n5;
        }
        if (n3 == -1) {
            n3 = this.stringRep.length();
        }
        return this.stringRep.substring(n2, n3);
    }
    
    String[] extractStrings(final int n) {
        final StringTokenizer stringTokenizer = new StringTokenizer(this.extractString(n), ":");
        final int countTokens = stringTokenizer.countTokens();
        final String[] array = new String[countTokens];
        for (int i = 0; i < countTokens; ++i) {
            array[i] = stringTokenizer.nextToken();
        }
        return array;
    }
    
    Class extractType(final int n) {
        return Factory.makeClass(this.extractString(n), this.getLookupClassLoader());
    }
    
    Class[] extractTypes(final int n) {
        final StringTokenizer stringTokenizer = new StringTokenizer(this.extractString(n), ":");
        final int countTokens = stringTokenizer.countTokens();
        final Class[] array = new Class[countTokens];
        for (int i = 0; i < countTokens; ++i) {
            array[i] = Factory.makeClass(stringTokenizer.nextToken(), this.getLookupClassLoader());
        }
        return array;
    }
    
    String fullTypeName(final Class clazz) {
        if (clazz == null) {
            return "ANONYMOUS";
        }
        if (clazz.isArray()) {
            return new StringBuffer().append(this.fullTypeName(clazz.getComponentType())).append("[]").toString();
        }
        return clazz.getName().replace('$', '.');
    }
    
    @Override
    public Class getDeclaringType() {
        if (this.declaringType == null) {
            this.declaringType = this.extractType(2);
        }
        return this.declaringType;
    }
    
    @Override
    public String getDeclaringTypeName() {
        if (this.declaringTypeName == null) {
            this.declaringTypeName = this.getDeclaringType().getName();
        }
        return this.declaringTypeName;
    }
    
    @Override
    public int getModifiers() {
        if (this.modifiers == -1) {
            this.modifiers = this.extractInt(0);
        }
        return this.modifiers;
    }
    
    @Override
    public String getName() {
        if (this.name == null) {
            this.name = this.extractString(1);
        }
        return this.name;
    }
    
    public void setLookupClassLoader(final ClassLoader lookupClassLoader) {
        this.lookupClassLoader = lookupClassLoader;
    }
    
    String shortTypeName(final Class clazz) {
        if (clazz == null) {
            return "ANONYMOUS";
        }
        if (clazz.isArray()) {
            return new StringBuffer().append(this.shortTypeName(clazz.getComponentType())).append("[]").toString();
        }
        return this.stripPackageName(clazz.getName()).replace('$', '.');
    }
    
    String stripPackageName(final String s) {
        final int lastIndex = s.lastIndexOf(46);
        if (lastIndex == -1) {
            return s;
        }
        return s.substring(lastIndex + 1);
    }
    
    @Override
    public final String toLongString() {
        return this.toString(StringMaker.longStringMaker);
    }
    
    @Override
    public final String toShortString() {
        return this.toString(StringMaker.shortStringMaker);
    }
    
    @Override
    public final String toString() {
        return this.toString(StringMaker.middleStringMaker);
    }
    
    String toString(final StringMaker stringMaker) {
        final boolean useCache = SignatureImpl.useCache;
        String s = null;
        while (true) {
            if (!useCache) {
                break Label_0028;
            }
            Label_0071: {
                if (this.stringCache != null) {
                    break Label_0071;
                }
                try {
                    this.stringCache = (Cache)new CacheImpl();
                    if (s == null) {
                        s = this.createToString(stringMaker);
                    }
                    if (SignatureImpl.useCache) {
                        this.stringCache.set(stringMaker.cacheOffset, s);
                    }
                    return s;
                }
                catch (Throwable t) {
                    SignatureImpl.useCache = false;
                    s = null;
                    continue;
                }
            }
            s = this.stringCache.get(stringMaker.cacheOffset);
            continue;
        }
    }
    
    private interface Cache
    {
        String get(final int p0);
        
        void set(final int p0, final String p1);
    }
    
    private static final class CacheImpl implements Cache
    {
        private SoftReference toStringCacheRef;
        
        public CacheImpl() {
            this.makeCache();
        }
        
        private String[] array() {
            return this.toStringCacheRef.get();
        }
        
        private String[] makeCache() {
            final String[] array = new String[3];
            this.toStringCacheRef = new SoftReference(array);
            return array;
        }
        
        @Override
        public String get(final int n) {
            final String[] array = this.array();
            if (array == null) {
                return null;
            }
            return array[n];
        }
        
        @Override
        public void set(final int n, final String s) {
            String[] array = this.array();
            if (array == null) {
                array = this.makeCache();
            }
            array[n] = s;
        }
    }
}
