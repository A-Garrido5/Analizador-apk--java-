// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.generators;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.PBEParametersGenerator;

public class PKCS5S2ParametersGenerator extends PBEParametersGenerator
{
    public static int a;
    private static final String z;
    private Mac hMac;
    private byte[] state;
    
    static {
        final char[] charArray = "\u0002h>l|\u001fu4p=\bs.piKq.miK~>>|\u001f<7{|\u0018h{/3".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u001d';
                    break;
                }
                case 0: {
                    c2 = 'k';
                    break;
                }
                case 1: {
                    c2 = '\u001c';
                    break;
                }
                case 2: {
                    c2 = '[';
                    break;
                }
                case 3: {
                    c2 = '\u001e';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public PKCS5S2ParametersGenerator(final Digest digest) {
        final int a = PKCS5S2ParametersGenerator.a;
        this.hMac = new HMac(digest);
        this.state = new byte[this.hMac.getMacSize()];
        if (BaseKeyGenerator.a) {
            PKCS5S2ParametersGenerator.a = a + 1;
        }
    }
    
    private void F(final byte[] array, final int n, final byte[] array2, final byte[] array3, final int n2) {
        final int a = PKCS5S2ParametersGenerator.a;
        if (n == 0) {
            try {
                throw new IllegalArgumentException(PKCS5S2ParametersGenerator.z);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        Label_0042: {
            if (array == null) {
                break Label_0042;
            }
            while (true) {
                while (true) {
                    int n5 = 0;
                    Label_0194: {
                        try {
                            this.hMac.update(array, 0, array.length);
                            this.hMac.update(array2, 0, array2.length);
                            this.hMac.doFinal(this.state, 0);
                            System.arraycopy(this.state, 0, array3, n2, this.state.length);
                            final int n3 = 1;
                            if (n3 < n) {
                                this.hMac.update(this.state, 0, this.state.length);
                                this.hMac.doFinal(this.state, 0);
                                int i = 0;
                                while (i != this.state.length) {
                                    final int n4 = n2 + i;
                                    array3[n4] ^= this.state[i];
                                    ++i;
                                    if (a != 0) {
                                        break;
                                    }
                                }
                                n5 = n3 + 1;
                                if (a == 0) {
                                    break Label_0194;
                                }
                            }
                            return;
                        }
                        catch (IllegalArgumentException ex2) {
                            throw ex2;
                        }
                    }
                    final int n3 = n5;
                    continue;
                }
            }
        }
    }
    
    private byte[] generateDerivedKey(final int n) {
        final int a = PKCS5S2ParametersGenerator.a;
        final int macSize = this.hMac.getMacSize();
        final int n2 = (-1 + (n + macSize)) / macSize;
        final byte[] array = new byte[4];
        final byte[] array2 = new byte[n2 * macSize];
        int n3 = 0;
        this.hMac.init(new KeyParameter(this.password));
        int n5;
        for (int i = 1; i <= n2; i = n5) {
            int n4 = 3;
            while (++array[n4] == 0) {
                --n4;
                if (a != 0) {
                    break;
                }
            }
            this.F(this.salt, this.iterationCount, array, array2, n3);
            n3 += macSize;
            n5 = i + 1;
            if (a != 0) {
                break;
            }
        }
        return array2;
    }
    
    @Override
    public CipherParameters generateDerivedMacParameters(final int n) {
        return this.generateDerivedParameters(n);
    }
    
    @Override
    public CipherParameters generateDerivedParameters(final int n) {
        final int n2 = n / 8;
        return new KeyParameter(this.generateDerivedKey(n2), 0, n2);
    }
    
    @Override
    public CipherParameters generateDerivedParameters(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/spongycastle/crypto/generators/PKCS5S2ParametersGenerator.a:I
        //     3: istore_3       
        //     4: iload_1        
        //     5: bipush          8
        //     7: idiv           
        //     8: istore          4
        //    10: iload_2        
        //    11: bipush          8
        //    13: idiv           
        //    14: istore          5
        //    16: aload_0        
        //    17: iload           4
        //    19: iload           5
        //    21: iadd           
        //    22: invokespecial   org/spongycastle/crypto/generators/PKCS5S2ParametersGenerator.generateDerivedKey:(I)[B
        //    25: astore          6
        //    27: new             Lorg/spongycastle/crypto/params/ParametersWithIV;
        //    30: dup            
        //    31: new             Lorg/spongycastle/crypto/params/KeyParameter;
        //    34: dup            
        //    35: aload           6
        //    37: iconst_0       
        //    38: iload           4
        //    40: invokespecial   org/spongycastle/crypto/params/KeyParameter.<init>:([BII)V
        //    43: aload           6
        //    45: iload           4
        //    47: iload           5
        //    49: invokespecial   org/spongycastle/crypto/params/ParametersWithIV.<init>:(Lorg/spongycastle/crypto/CipherParameters;[BII)V
        //    52: astore          7
        //    54: iload_3        
        //    55: ifeq            76
        //    58: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator.a:Z
        //    61: istore          9
        //    63: iconst_0       
        //    64: istore          10
        //    66: iload           9
        //    68: ifeq            89
        //    71: iload           10
        //    73: putstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator.a:Z
        //    76: aload           7
        //    78: areturn        
        //    79: astore          11
        //    81: aload           11
        //    83: athrow         
        //    84: astore          8
        //    86: aload           8
        //    88: athrow         
        //    89: iconst_1       
        //    90: istore          10
        //    92: goto            71
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  27     54     79     84     Ljava/lang/IllegalArgumentException;
        //  58     63     84     89     Ljava/lang/IllegalArgumentException;
        //  81     84     84     89     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0071:
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
