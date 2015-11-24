// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public abstract class ay
{
    public static int c;
    private static final String[] z;
    private final hN a;
    private final d7 b;
    
    static {
        final String[] z2 = new String[17];
        String s = "[LbP\u0013YL)Z\u0019MMm[\u000e\u0014\u0002";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0457:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '|';
                        break;
                    }
                    case 0: {
                        c2 = '.';
                        break;
                    }
                    case 1: {
                        c2 = '\"';
                        break;
                    }
                    case 2: {
                        c2 = '\t';
                        break;
                    }
                    case 3: {
                        c2 = '>';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u001d\u00109";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u001d\u00109";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u001d\u00139";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "\u001f\u0015";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "\u001f\u0013";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u001f\u0017";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u001d\u00139";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u001d\u00109";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    s = "\u001f\u0013";
                    n = 8;
                    n2 = 9;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    array = z2;
                    s = "\u001d\u00109";
                    n = 9;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u001f\u0011";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u001f\u0011";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u001d\u00139";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u001f\u0017";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u001f\u0015";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\u001d\u00139";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    break Label_0457;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    ay(final hN a) {
        this.a = a;
        this.b = new d7(a);
    }
    
    public static ay a(final hN hn) {
        try {
            if (hn.a(1)) {
                return new aF(hn);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            if (!hn.a(2)) {
                return new au(hn);
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        switch (d7.a(hn, 1, 4)) {
            default: {
                switch (d7.a(hn, 1, 5)) {
                    default: {
                        switch (d7.a(hn, 1, 7)) {
                            default: {
                                throw new IllegalStateException(ay.z[0] + hn);
                            }
                            case 56: {
                                try {
                                    return new aN(hn, ay.z[7], ay.z[5]);
                                }
                                catch (IllegalStateException ex3) {
                                    throw ex3;
                                }
                            }
                            case 57: {
                                return new aN(hn, ay.z[2], ay.z[9]);
                            }
                            case 58: {
                                return new aN(hn, ay.z[13], ay.z[12]);
                            }
                            case 59: {
                                return new aN(hn, ay.z[1], ay.z[11]);
                            }
                            case 60: {
                                return new aN(hn, ay.z[16], ay.z[6]);
                            }
                            case 61: {
                                return new aN(hn, ay.z[8], ay.z[14]);
                            }
                            case 62: {
                                return new aN(hn, ay.z[3], ay.z[4]);
                            }
                            case 63: {
                                return new aN(hn, ay.z[10], ay.z[15]);
                            }
                        }
                        break;
                    }
                    case 12: {
                        try {
                            return new af(hn);
                        }
                        catch (IllegalStateException ex4) {
                            throw ex4;
                        }
                    }
                    case 13: {
                        return new aa(hn);
                    }
                }
                break;
            }
            case 4: {
                try {
                    return new av(hn);
                }
                catch (IllegalStateException ex5) {
                    throw ex5;
                }
            }
            case 5: {
                return new aj(hn);
            }
        }
    }
    
    protected final d7 a() {
        return this.b;
    }
    
    protected final hN b() {
        return this.a;
    }
    
    public abstract String c();
}
