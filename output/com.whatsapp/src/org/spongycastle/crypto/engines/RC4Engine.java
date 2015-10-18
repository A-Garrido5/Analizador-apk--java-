// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.StreamCipher;

public class RC4Engine implements StreamCipher
{
    private static final int STATE_LENGTH = 256;
    public static boolean a;
    private static final String[] z;
    private byte[] engineState;
    private byte[] workingKey;
    private int x;
    private int y;
    
    static {
        final String[] z2 = new String[4];
        final char[] charArray = "=8fj`&mpos4(`:a=\"2i}=?f".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0015';
                    break;
                }
                case 0: {
                    c2 = 'R';
                    break;
                }
                case 1: {
                    c2 = 'M';
                    break;
                }
                case 2: {
                    c2 = '\u0012';
                    break;
                }
                case 3: {
                    c2 = '\u001a';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = ";#boar/g|s7?2nz=marz 9".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\u0015';
                    break;
                }
                case 0: {
                    c4 = 'R';
                    break;
                }
                case 1: {
                    c4 = 'M';
                    break;
                }
                case 2: {
                    c4 = '\u0012';
                    break;
                }
                case 3: {
                    c4 = '\u001a';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\u0000\u000e&".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '\u0015';
                    break;
                }
                case 0: {
                    c6 = 'R';
                    break;
                }
                case 1: {
                    c6 = 'M';
                    break;
                }
                case 2: {
                    c6 = '\u0012';
                    break;
                }
                case 3: {
                    c6 = '\u001a';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = ";#d{y;)2jt ,\u007f\u007fa7?2jt!>w~5&\"2HVfm{t|&m?:".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '\u0015';
                    break;
                }
                case 0: {
                    c8 = 'R';
                    break;
                }
                case 1: {
                    c8 = 'M';
                    break;
                }
                case 2: {
                    c8 = '\u0012';
                    break;
                }
                case 3: {
                    c8 = '\u001a';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        z = z2;
    }
    
    public RC4Engine() {
        this.engineState = null;
        this.x = 0;
        this.y = 0;
        this.workingKey = null;
    }
    
    private void setKey(final byte[] workingKey) {
        int i = 0;
        final boolean a = RC4Engine.a;
        try {
            this.workingKey = workingKey;
            this.x = 0;
            this.y = 0;
            if (this.engineState == null) {
                this.engineState = new byte[256];
            }
            int j = 0;
            while (j < 256) {
                this.engineState[j] = (byte)j;
                ++j;
                if (a) {
                    break;
                }
            }
            int n = 0;
            int n2 = 0;
            while (i < 256) {
                n = (0xFF & n + ((0xFF & workingKey[n2]) + this.engineState[i]));
                final byte b = this.engineState[i];
                this.engineState[i] = this.engineState[n];
                this.engineState[n] = b;
                n2 = (n2 + 1) % workingKey.length;
                ++i;
                if (a) {
                    break;
                }
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    @Override
    public String getAlgorithmName() {
        return RC4Engine.z[2];
    }
    
    @Override
    public void init(final boolean b, final CipherParameters cipherParameters) {
        try {
            if (cipherParameters instanceof KeyParameter) {
                this.setKey(this.workingKey = ((KeyParameter)cipherParameters).getKey());
                return;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        throw new IllegalArgumentException(RC4Engine.z[3] + cipherParameters.getClass().getName());
    }
    
    @Override
    public int processBytes(final byte[] array, final int n, final int n2, final byte[] array2, final int n3) {
        final boolean a = RC4Engine.a;
        final int n4 = n + n2;
        try {
            if (n4 > array.length) {
                throw new DataLengthException(RC4Engine.z[1]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        final int n5 = n3 + n2;
        int i;
        try {
            final int length = array2.length;
            i = 0;
            if (n5 > length) {
                throw new OutputLengthException(RC4Engine.z[0]);
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        while (i < n2) {
            this.x = (0xFF & 1 + this.x);
            this.y = (0xFF & this.engineState[this.x] + this.y);
            final byte b = this.engineState[this.x];
            this.engineState[this.x] = this.engineState[this.y];
            this.engineState[this.y] = b;
            array2[i + n3] = (byte)(array[i + n] ^ this.engineState[0xFF & this.engineState[this.x] + this.engineState[this.y]]);
            ++i;
            if (a) {
                break;
            }
        }
        return n2;
    }
    
    @Override
    public void reset() {
        this.setKey(this.workingKey);
    }
    
    @Override
    public byte returnByte(final byte p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/spongycastle/crypto/engines/RC4Engine.a:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: sipush          255
        //     8: iconst_1       
        //     9: aload_0        
        //    10: getfield        org/spongycastle/crypto/engines/RC4Engine.x:I
        //    13: iadd           
        //    14: iand           
        //    15: putfield        org/spongycastle/crypto/engines/RC4Engine.x:I
        //    18: aload_0        
        //    19: sipush          255
        //    22: aload_0        
        //    23: getfield        org/spongycastle/crypto/engines/RC4Engine.engineState:[B
        //    26: aload_0        
        //    27: getfield        org/spongycastle/crypto/engines/RC4Engine.x:I
        //    30: baload         
        //    31: aload_0        
        //    32: getfield        org/spongycastle/crypto/engines/RC4Engine.y:I
        //    35: iadd           
        //    36: iand           
        //    37: putfield        org/spongycastle/crypto/engines/RC4Engine.y:I
        //    40: aload_0        
        //    41: getfield        org/spongycastle/crypto/engines/RC4Engine.engineState:[B
        //    44: aload_0        
        //    45: getfield        org/spongycastle/crypto/engines/RC4Engine.x:I
        //    48: baload         
        //    49: istore_3       
        //    50: aload_0        
        //    51: getfield        org/spongycastle/crypto/engines/RC4Engine.engineState:[B
        //    54: aload_0        
        //    55: getfield        org/spongycastle/crypto/engines/RC4Engine.x:I
        //    58: aload_0        
        //    59: getfield        org/spongycastle/crypto/engines/RC4Engine.engineState:[B
        //    62: aload_0        
        //    63: getfield        org/spongycastle/crypto/engines/RC4Engine.y:I
        //    66: baload         
        //    67: bastore        
        //    68: aload_0        
        //    69: getfield        org/spongycastle/crypto/engines/RC4Engine.engineState:[B
        //    72: aload_0        
        //    73: getfield        org/spongycastle/crypto/engines/RC4Engine.y:I
        //    76: iload_3        
        //    77: bastore        
        //    78: aload_0        
        //    79: getfield        org/spongycastle/crypto/engines/RC4Engine.engineState:[B
        //    82: sipush          255
        //    85: aload_0        
        //    86: getfield        org/spongycastle/crypto/engines/RC4Engine.engineState:[B
        //    89: aload_0        
        //    90: getfield        org/spongycastle/crypto/engines/RC4Engine.x:I
        //    93: baload         
        //    94: aload_0        
        //    95: getfield        org/spongycastle/crypto/engines/RC4Engine.engineState:[B
        //    98: aload_0        
        //    99: getfield        org/spongycastle/crypto/engines/RC4Engine.y:I
        //   102: baload         
        //   103: iadd           
        //   104: iand           
        //   105: baload         
        //   106: istore          6
        //   108: iload           6
        //   110: iload_1        
        //   111: ixor           
        //   112: i2b            
        //   113: istore          7
        //   115: iload_2        
        //   116: ifeq            137
        //   119: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator.a:Z
        //   122: istore          8
        //   124: iload           8
        //   126: ifeq            150
        //   129: iconst_0       
        //   130: istore          9
        //   132: iload           9
        //   134: putstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator.a:Z
        //   137: iload           7
        //   139: ireturn        
        //   140: astore          4
        //   142: aload           4
        //   144: athrow         
        //   145: astore          5
        //   147: aload           5
        //   149: athrow         
        //   150: iconst_1       
        //   151: istore          9
        //   153: goto            132
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  50     108    140    145    Ljava/lang/IllegalArgumentException;
        //  119    124    145    150    Ljava/lang/IllegalArgumentException;
        //  142    145    145    150    Ljava/lang/IllegalArgumentException;
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
}
