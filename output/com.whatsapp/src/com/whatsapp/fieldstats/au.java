// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum au
{
    public static final au ATTACHED;
    public static final au CREATED;
    public static final au EXPIRED;
    public static final au FAIL_BAD_PARAM;
    public static final au FAIL_BAD_TOKEN;
    public static final au FAIL_BLOCKED;
    public static final au FAIL_FORMAT_WRONG;
    public static final au FAIL_GUESSED_TOO_FAST;
    public static final au FAIL_INCORRECT;
    public static final au FAIL_LENGTH_LONG;
    public static final au FAIL_LENGTH_SHORT;
    public static final au FAIL_MISMATCH;
    public static final au FAIL_MISSING;
    public static final au FAIL_MISSING_PARAM;
    public static final au FAIL_NEXT_METHOD;
    public static final au FAIL_NO_ROUTES;
    public static final au FAIL_OLD_VERSION;
    public static final au FAIL_PROVIDER_TIMEOUT;
    public static final au FAIL_PROVIDER_UNROUTABLE;
    public static final au FAIL_STALE;
    public static final au FAIL_TEMPORARILY_UNAVAILABLE;
    public static final au FAIL_TOO_MANY;
    public static final au FAIL_TOO_MANY_ALL_METHODS;
    public static final au FAIL_TOO_MANY_GUESSES;
    public static final au FAIL_TOO_RECENT;
    public static final au OK;
    public static final au SENT;
    private static final au[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[27];
        String s = "Cp\u0004i[Bd\bvW@u\u0012qKJn\u000bdWQ";
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
                        c2 = '\u0004';
                        break;
                    }
                    case 0: {
                        c2 = '\u0005';
                        break;
                    }
                    case 1: {
                        c2 = '1';
                        break;
                    }
                    case 2: {
                        c2 = 'M';
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
                    s = "Cp\u0004i[G}\u0002fO@u";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Cp\u0004i[Q~\u0002zID\u007f\u0014";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "Cp\u0004i[Uc\u0002sMAt\u001fzPL|\bjQQ";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "@i\u001dlV@u";
                    n = 3;
                    n2 = 4;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    s = "Cp\u0004i[Ve\fiA";
                    n2 = 5;
                    array = z2;
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    array = z2;
                    s = "Cp\u0004i[Q~\u0002zID\u007f\u0014zEI}\u0012hAQy\u0002aW";
                    n = 5;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "Cp\u0004i[Q~\u0002zV@r\bkP";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "Cp\u0004i[L\u007f\u000ejVWt\u000eq";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "Cp\u0004i[Gp\tzTDc\fh";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "Cp\u0004i[It\u0003bPMn\u001emKWe";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "Cp\u0004i[Hx\u001evMKv\u0012uEWp\u0000";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "Cp\u0004i[Kt\u0015q[Ht\u0019mKA";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "Cp\u0004i[J}\tzR@c\u001elKK";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "Cp\u0004i[Hx\u001evMKv";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "Cp\u0004i[C~\u001fhEQn\u001awKKv";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "Cp\u0004i[Q~\u0002zID\u007f\u0014zCPt\u001evAV";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "Cp\u0004i[Gp\tzPJz\bk";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "Fc\bdP@u";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "Cp\u0004i[Hx\u001ehEQr\u0005";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "Cp\u0004i[Uc\u0002sMAt\u001fzQKc\u0002pPDs\u0001`";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "Cp\u0004i[K~\u0012wKPe\bv";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "Jz";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "Cp\u0004i[Qt\u0000uKWp\u001flH\\n\u0018kESp\u0004iEG}\b";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "Vt\u0003q";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "Cp\u0004i[It\u0003bPMn\u0001jJB";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "De\u0019dGMt\t";
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
        OK = new au(au.z[22], 0, 1);
        FAIL_MISMATCH = new au(au.z[19], 1, 2);
        FAIL_TOO_MANY_GUESSES = new au(au.z[16], 2, 3);
        FAIL_GUESSED_TOO_FAST = new au(au.z[0], 3, 4);
        FAIL_MISSING = new au(au.z[14], 4, 5);
        FAIL_STALE = new au(au.z[5], 5, 6);
        FAIL_TEMPORARILY_UNAVAILABLE = new au(au.z[23], 6, 7);
        FAIL_BLOCKED = new au(au.z[1], 7, 8);
        SENT = new au(au.z[24], 8, 9);
        FAIL_NEXT_METHOD = new au(au.z[12], 9, 10);
        FAIL_TOO_MANY_ALL_METHODS = new au(au.z[6], 10, 11);
        FAIL_TOO_RECENT = new au(au.z[7], 11, 12);
        FAIL_TOO_MANY = new au(au.z[2], 12, 13);
        FAIL_OLD_VERSION = new au(au.z[13], 13, 14);
        FAIL_BAD_PARAM = new au(au.z[9], 14, 15);
        FAIL_PROVIDER_TIMEOUT = new au(au.z[3], 15, 16);
        FAIL_PROVIDER_UNROUTABLE = new au(au.z[20], 16, 17);
        FAIL_BAD_TOKEN = new au(au.z[17], 17, 18);
        FAIL_NO_ROUTES = new au(au.z[21], 18, 19);
        ATTACHED = new au(au.z[26], 19, 20);
        FAIL_INCORRECT = new au(au.z[8], 20, 21);
        FAIL_LENGTH_LONG = new au(au.z[25], 21, 22);
        FAIL_LENGTH_SHORT = new au(au.z[10], 22, 23);
        FAIL_FORMAT_WRONG = new au(au.z[15], 23, 24);
        EXPIRED = new au(au.z[4], 24, 25);
        CREATED = new au(au.z[18], 25, 26);
        FAIL_MISSING_PARAM = new au(au.z[11], 26, 27);
        a = new au[] { au.OK, au.FAIL_MISMATCH, au.FAIL_TOO_MANY_GUESSES, au.FAIL_GUESSED_TOO_FAST, au.FAIL_MISSING, au.FAIL_STALE, au.FAIL_TEMPORARILY_UNAVAILABLE, au.FAIL_BLOCKED, au.SENT, au.FAIL_NEXT_METHOD, au.FAIL_TOO_MANY_ALL_METHODS, au.FAIL_TOO_RECENT, au.FAIL_TOO_MANY, au.FAIL_OLD_VERSION, au.FAIL_BAD_PARAM, au.FAIL_PROVIDER_TIMEOUT, au.FAIL_PROVIDER_UNROUTABLE, au.FAIL_BAD_TOKEN, au.FAIL_NO_ROUTES, au.ATTACHED, au.FAIL_INCORRECT, au.FAIL_LENGTH_LONG, au.FAIL_LENGTH_SHORT, au.FAIL_FORMAT_WRONG, au.EXPIRED, au.CREATED, au.FAIL_MISSING_PARAM };
    }
    
    private au(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
