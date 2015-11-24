// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum bs
{
    public static final bs ABORT;
    public static final bs AUTH;
    public static final bs BUSY;
    public static final bs CANTOPEN;
    public static final bs CONSTRAINT;
    public static final bs CORRUPT;
    public static final bs DONE;
    public static final bs EMPTY;
    public static final bs ERROR;
    public static final bs FORMAT;
    public static final bs FULL;
    public static final bs INTERNAL;
    public static final bs INTERRUPT;
    public static final bs IOERR;
    public static final bs LOCKED;
    public static final bs MISMATCH;
    public static final bs MISUSE;
    public static final bs NOLFS;
    public static final bs NOMEM;
    public static final bs NOTADB;
    public static final bs NOTFOUND;
    public static final bs NOTICE;
    public static final bs OK;
    public static final bs PERM;
    public static final bs PROTOCOL;
    public static final bs RANGE;
    public static final bs READONLY;
    public static final bs ROW;
    public static final bs SCHEMA;
    public static final bs TOOBIG;
    public static final bs WARNING;
    private static final bs[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[31];
        String s = "IscD\u000eZwc";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0807:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'A';
                        break;
                    }
                    case 0: {
                        c2 = '\n';
                        break;
                    }
                    case 1: {
                        c2 = '2';
                        break;
                    }
                    case 2: {
                        c2 = '-';
                        break;
                    }
                    case 3: {
                        c2 = '\u0010';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "XscW\u0004";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "D}yY\u0002O";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "L}\u007f]\u0000^";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "Z`bD\u000eI}a";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "D}yQ\u0005H";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "D}yV\u000e_|i";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "N}cU";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "C}hB\u0013";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "I}\u007fB\u0014Zf";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    s = "KpbB\u0015";
                    n = 9;
                    n2 = 10;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    array = z2;
                    s = "D}`U\f";
                    n = 10;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "Ey";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "Hg~I";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "F}n[\u0004N";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "YqeU\fK";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    s = "^}bR\bM";
                    n = 15;
                    n2 = 16;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    array = z2;
                    s = "I}cC\u0015Xsd^\u0015";
                    n = 16;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "O`\u007f_\u0013";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "O\u007f}D\u0018";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "C|yU\u0013Xg}D";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "D}aV\u0012";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "Zw\u007f]";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "Lga\\";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "]s\u007f^\bDu";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "XwlT\u000eD~t";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "KgyX";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "C|yU\u0013Dsa";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "X}z";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "G{~]\u0000^qe";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "G{~E\u0012O";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    break Label_0807;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        OK = new bs(bs.z[12], 0, 0);
        ERROR = new bs(bs.z[18], 1, 1);
        INTERNAL = new bs(bs.z[27], 2, 2);
        PERM = new bs(bs.z[22], 3, 3);
        ABORT = new bs(bs.z[10], 4, 4);
        BUSY = new bs(bs.z[13], 5, 5);
        LOCKED = new bs(bs.z[14], 6, 6);
        NOMEM = new bs(bs.z[11], 7, 7);
        READONLY = new bs(bs.z[25], 8, 8);
        INTERRUPT = new bs(bs.z[20], 9, 9);
        IOERR = new bs(bs.z[8], 10, 10);
        CORRUPT = new bs(bs.z[9], 11, 11);
        NOTFOUND = new bs(bs.z[6], 12, 12);
        FULL = new bs(bs.z[23], 13, 13);
        CANTOPEN = new bs(bs.z[0], 14, 14);
        PROTOCOL = new bs(bs.z[4], 15, 15);
        EMPTY = new bs(bs.z[19], 16, 16);
        SCHEMA = new bs(bs.z[15], 17, 17);
        TOOBIG = new bs(bs.z[16], 18, 18);
        CONSTRAINT = new bs(bs.z[17], 19, 19);
        MISMATCH = new bs(bs.z[29], 20, 20);
        MISUSE = new bs(bs.z[30], 21, 21);
        NOLFS = new bs(bs.z[21], 22, 22);
        AUTH = new bs(bs.z[26], 23, 23);
        FORMAT = new bs(bs.z[3], 24, 24);
        RANGE = new bs(bs.z[1], 25, 25);
        NOTADB = new bs(bs.z[5], 26, 26);
        NOTICE = new bs(bs.z[2], 27, 27);
        WARNING = new bs(bs.z[24], 28, 28);
        ROW = new bs(bs.z[28], 29, 100);
        DONE = new bs(bs.z[7], 30, 101);
        b = new bs[] { bs.OK, bs.ERROR, bs.INTERNAL, bs.PERM, bs.ABORT, bs.BUSY, bs.LOCKED, bs.NOMEM, bs.READONLY, bs.INTERRUPT, bs.IOERR, bs.CORRUPT, bs.NOTFOUND, bs.FULL, bs.CANTOPEN, bs.PROTOCOL, bs.EMPTY, bs.SCHEMA, bs.TOOBIG, bs.CONSTRAINT, bs.MISMATCH, bs.MISUSE, bs.NOLFS, bs.AUTH, bs.FORMAT, bs.RANGE, bs.NOTADB, bs.NOTICE, bs.WARNING, bs.ROW, bs.DONE };
    }
    
    private bs(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
