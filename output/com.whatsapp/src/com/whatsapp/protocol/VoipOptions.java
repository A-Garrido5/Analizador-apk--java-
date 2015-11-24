// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

public final class VoipOptions
{
    private static final String[] z;
    public final VoipOptions$ABTest abTest;
    public final VoipOptions$Aec aec;
    public final VoipOptions$Agc agc;
    public final VoipOptions$AudioRestrict audioRestrict;
    public final VoipOptions$Decode decode;
    public final VoipOptions$Encode encode;
    public final VoipOptions$Miscellaneous miscellaneous;
    public final VoipOptions$NoiseSuppression noiseSuppression;
    public final VoipOptions$RateControl rateControl;
    
    static {
        final String[] z2 = new String[27];
        String s = "\u0001%XD\u0015\u0001/\u000e\u000eY";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0707:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'y';
                        break;
                    }
                    case 0: {
                        c2 = 'h';
                        break;
                    }
                    case 1: {
                        c2 = 'K';
                        break;
                    }
                    case 2: {
                        c2 = '.';
                        break;
                    }
                    case 3: {
                        c2 = '%';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Rk";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "AkAP\r\u001b\"J@Y\u0007-\u000eS\u0018\u0004\"J\u0005\u000b\t%I@Y3";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "Hc";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\t.M";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\r%MJ\u001d\r";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0007;ZL\u0016\u00068";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u001c.]Q";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u001a(";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\t,M";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u00068";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\f.MJ\u001d\r";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\t>JL\u0016";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "Hc";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "AkAP\r\u001b\"J@Y\u0007-\u000eS\u0018\u0004\"J\u0005\u000b\t%I@Y3";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = ">$GU6\u0018?GJ\u0017\u001b0O@\u001aU";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "DkOG-\r8Z\u0018";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "DkCL\n\u000b.BI\u0018\u0006.AP\nU";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "DkKK\u001a\u0007/K\u0018";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "DkJ@\u001a\u0007/K\u0018";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "DkOP\u001d\u0001$|@\n\u001c9GF\rU";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "Dk@J\u0010\u001b.}P\t\u00189KV\n\u0001$@\u0018";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "Dk\\D\r\r\bAK\r\u001a$B\u0018";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "DkOB\u001aU";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u0001%XD\u0015\u0001/\u000e\u000eY";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "Rk";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\u000e*BV\u001c";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    break Label_0707;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public VoipOptions() {
        this(null, null, null, null, null, null, null, null, null);
    }
    
    public VoipOptions(final VoipOptions$Aec aec, final VoipOptions$Encode encode, final VoipOptions$Decode decode, final VoipOptions$Miscellaneous miscellaneous, final VoipOptions$Agc agc, final VoipOptions$AudioRestrict audioRestrict, final VoipOptions$NoiseSuppression noiseSuppression, final VoipOptions$ABTest abTest, final VoipOptions$RateControl rateControl) {
        this.aec = aec;
        this.encode = encode;
        this.decode = decode;
        this.miscellaneous = miscellaneous;
        this.agc = agc;
        this.audioRestrict = audioRestrict;
        this.noiseSuppression = noiseSuppression;
        this.abTest = abTest;
        this.rateControl = rateControl;
    }
    
    static Integer access$000(final String s, final String s2) {
        return convertAttributeToInteger(s, s2);
    }
    
    static Short access$100(final String s, final String s2, final int n, final int n2) {
        return convertAttributeToShort(s, s2, n, n2);
    }
    
    static Boolean access$200(final String s) {
        return convertAttributeToBoolean(s);
    }
    
    static Integer access$300(final String s, final String s2, final int n, final int n2) {
        return convertAttributeToInteger(s, s2, n, n2);
    }
    
    static Boolean access$400(final Boolean b) {
        return negate(b);
    }
    
    static Short access$500(final String s, final String s2) {
        return convertAttributeToShort(s, s2);
    }
    
    private static Boolean convertAttributeToBoolean(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             "0"
        //     2: aload_0        
        //     3: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //     6: istore_3       
        //     7: iload_3        
        //     8: ifne            24
        //    11: getstatic       com/whatsapp/protocol/VoipOptions.z:[Ljava/lang/String;
        //    14: bipush          26
        //    16: aaload         
        //    17: aload_0        
        //    18: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    21: ifeq            34
        //    24: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //    27: areturn        
        //    28: astore_1       
        //    29: aload_1        
        //    30: athrow         
        //    31: astore_2       
        //    32: aload_2        
        //    33: athrow         
        //    34: aload_0        
        //    35: ifnull          51
        //    38: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //    41: astore          5
        //    43: aload           5
        //    45: areturn        
        //    46: astore          4
        //    48: aload           4
        //    50: athrow         
        //    51: aconst_null    
        //    52: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      7      28     31     Ljava/lang/NumberFormatException;
        //  11     24     31     34     Ljava/lang/NumberFormatException;
        //  24     28     31     34     Ljava/lang/NumberFormatException;
        //  29     31     31     34     Ljava/lang/NumberFormatException;
        //  38     43     46     51     Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0024:
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
    
    private static Integer convertAttributeToInteger(final String s, final String s2) {
        if (s != null) {
            try {
                return Integer.valueOf(s);
            }
            catch (NumberFormatException ex) {
                throw new cz(VoipOptions.z[0] + s2 + VoipOptions.z[1] + s);
            }
        }
        return null;
    }
    
    private static Integer convertAttributeToInteger(final String s, final String s2, final int n, final int n2) {
        final Integer convertAttributeToInteger = convertAttributeToInteger(s, s2);
        if (convertAttributeToInteger != null) {
            try {
                Label_0034: {
                    if (convertAttributeToInteger < n) {
                        break Label_0034;
                    }
                    try {
                        if (convertAttributeToInteger > n2) {
                            throw new cz(s2 + VoipOptions.z[13] + convertAttributeToInteger + VoipOptions.z[14] + n + "," + n2 + "]");
                        }
                        return convertAttributeToInteger;
                    }
                    catch (NumberFormatException ex) {
                        throw ex;
                    }
                }
            }
            catch (NumberFormatException ex2) {
                throw ex2;
            }
        }
        return convertAttributeToInteger;
    }
    
    private static Short convertAttributeToShort(final String s, final String s2) {
        if (s != null) {
            try {
                return new Short(Short.parseShort(s));
            }
            catch (NumberFormatException ex) {
                throw new cz(VoipOptions.z[24] + s2 + VoipOptions.z[25] + s);
            }
        }
        return null;
    }
    
    private static Short convertAttributeToShort(final String s, final String s2, final int n, final int n2) {
        final Short convertAttributeToShort = convertAttributeToShort(s, s2);
        if (convertAttributeToShort != null) {
            try {
                Label_0034: {
                    if (convertAttributeToShort < n) {
                        break Label_0034;
                    }
                    try {
                        if (convertAttributeToShort > n2) {
                            throw new cz(s2 + VoipOptions.z[3] + convertAttributeToShort + VoipOptions.z[2] + n + "," + n2 + "]");
                        }
                        return convertAttributeToShort;
                    }
                    catch (NumberFormatException ex) {
                        throw ex;
                    }
                }
            }
            catch (NumberFormatException ex2) {
                throw ex2;
            }
        }
        return convertAttributeToShort;
    }
    
    public static VoipOptions fromProtocolTreeNode(final c0 c0, final boolean b) {
        while (true) {
            while (true) {
                try {
                    final VoipOptions$Aec fromProtocolTreeNode = VoipOptions$Aec.fromProtocolTreeNode(c0.b(VoipOptions.z[4]));
                    final VoipOptions$Encode fromProtocolTreeNode2 = VoipOptions$Encode.fromProtocolTreeNode(c0.b(VoipOptions.z[5]));
                    final VoipOptions$Decode fromProtocolTreeNode3 = VoipOptions$Decode.fromProtocolTreeNode(c0.b(VoipOptions.z[11]));
                    final VoipOptions$Miscellaneous fromProtocolTreeNode4 = VoipOptions$Miscellaneous.fromProtocolTreeNode(c0.b(VoipOptions.z[6]));
                    final VoipOptions$Agc fromProtocolTreeNode5 = VoipOptions$Agc.fromProtocolTreeNode(c0.b(VoipOptions.z[9]));
                    if (b) {
                        final VoipOptions$AudioRestrict fromProtocolTreeNode6 = VoipOptions$AudioRestrict.fromProtocolTreeNode(c0.b(VoipOptions.z[12]));
                        return new VoipOptions(fromProtocolTreeNode, fromProtocolTreeNode2, fromProtocolTreeNode3, fromProtocolTreeNode4, fromProtocolTreeNode5, fromProtocolTreeNode6, VoipOptions$NoiseSuppression.fromProtocolTreeNode(c0.b(VoipOptions.z[10])), VoipOptions$ABTest.fromProtocolTreeNode(c0.b(VoipOptions.z[7])), VoipOptions$RateControl.fromProtocolTreeNode(c0.b(VoipOptions.z[8])));
                    }
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
                final VoipOptions$AudioRestrict fromProtocolTreeNode6 = null;
                continue;
            }
        }
    }
    
    private static Boolean negate(final Boolean b) {
        try {
            if (Boolean.TRUE.equals(b)) {
                return Boolean.FALSE;
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        try {
            if (Boolean.FALSE.equals(b)) {
                return Boolean.TRUE;
            }
        }
        catch (NumberFormatException ex2) {
            throw ex2;
        }
        return null;
    }
    
    @Override
    public String toString() {
        return VoipOptions.z[15] + this.aec + VoipOptions.z[18] + this.encode + VoipOptions.z[19] + this.decode + VoipOptions.z[17] + this.miscellaneous + VoipOptions.z[23] + this.agc + VoipOptions.z[20] + this.audioRestrict + VoipOptions.z[21] + this.noiseSuppression + VoipOptions.z[16] + this.abTest + VoipOptions.z[22] + this.rateControl + '}';
    }
}
