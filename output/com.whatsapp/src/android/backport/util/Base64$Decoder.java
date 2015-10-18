// 
// Decompiled by Procyon v0.5.30
// 

package android.backport.util;

class Base64$Decoder extends Base64$Coder
{
    private static final int[] DECODE;
    private static final int[] DECODE_WEBSAFE;
    private final int[] alphabet;
    private int state;
    private int value;
    
    static {
        DECODE = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
        DECODE_WEBSAFE = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    }
    
    public Base64$Decoder(final int n, final byte[] output) {
        this.output = output;
        int[] alphabet;
        if ((n & 0x8) == 0x0) {
            alphabet = Base64$Decoder.DECODE;
        }
        else {
            alphabet = Base64$Decoder.DECODE_WEBSAFE;
        }
        this.alphabet = alphabet;
        this.state = 0;
        this.value = 0;
    }
    
    public boolean process(final byte[] array, final int n, final int n2, final boolean b) {
        if (this.state == 6) {
            return false;
        }
        final int n3 = n2 + n;
        int state = this.state;
        int value = this.value;
        int n4 = 0;
        final byte[] output = this.output;
        final int[] alphabet = this.alphabet;
        while (true) {
            int n7;
            for (int i = n; i < n3; i = n7) {
                if (state == 0) {
                    while (i + 4 <= n3) {
                        value = (alphabet[0xFF & array[i]] << 18 | alphabet[0xFF & array[i + 1]] << 12 | alphabet[0xFF & array[i + 2]] << 6 | alphabet[0xFF & array[i + 3]]);
                        if (value < 0) {
                            break;
                        }
                        output[n4 + 2] = (byte)value;
                        output[n4 + 1] = (byte)(value >> 8);
                        output[n4] = (byte)(value >> 16);
                        n4 += 3;
                        i += 4;
                    }
                    if (i >= n3) {
                        final int value2 = value;
                        if (!b) {
                            this.state = state;
                            this.value = value2;
                            this.op = n4;
                            return true;
                        }
                        switch (state) {
                            case 1: {
                                this.state = 6;
                                return false;
                            }
                            case 2: {
                                final int n5 = n4 + 1;
                                output[n4] = (byte)(value2 >> 4);
                                n4 = n5;
                                break;
                            }
                            case 3: {
                                final int n6 = n4 + 1;
                                output[n4] = (byte)(value2 >> 10);
                                n4 = n6 + 1;
                                output[n6] = (byte)(value2 >> 2);
                                break;
                            }
                            case 4: {
                                this.state = 6;
                                return false;
                            }
                        }
                        this.state = state;
                        this.op = n4;
                        return true;
                    }
                }
                n7 = i + 1;
                final int n8 = alphabet[0xFF & array[i]];
                int n9 = 0;
                Label_0280: {
                    switch (state) {
                        case 0: {
                            if (n8 >= 0) {
                                n9 = state + 1;
                                value = n8;
                                break Label_0280;
                            }
                            if (n8 != -1) {
                                this.state = 6;
                                return false;
                            }
                            break;
                        }
                        case 1: {
                            if (n8 >= 0) {
                                value = (n8 | value << 6);
                                n9 = state + 1;
                                break Label_0280;
                            }
                            if (n8 != -1) {
                                this.state = 6;
                                return false;
                            }
                            break;
                        }
                        case 2: {
                            if (n8 >= 0) {
                                value = (n8 | value << 6);
                                n9 = state + 1;
                                break Label_0280;
                            }
                            if (n8 == -2) {
                                final int n10 = n4 + 1;
                                output[n4] = (byte)(value >> 4);
                                n9 = 4;
                                n4 = n10;
                                break Label_0280;
                            }
                            if (n8 != -1) {
                                this.state = 6;
                                return false;
                            }
                            break;
                        }
                        case 3: {
                            if (n8 >= 0) {
                                value = (n8 | value << 6);
                                output[n4 + 2] = (byte)value;
                                output[n4 + 1] = (byte)(value >> 8);
                                output[n4] = (byte)(value >> 16);
                                n4 += 3;
                                n9 = 0;
                                break Label_0280;
                            }
                            if (n8 == -2) {
                                output[n4 + 1] = (byte)(value >> 2);
                                output[n4] = (byte)(value >> 10);
                                n4 += 2;
                                n9 = 5;
                                break Label_0280;
                            }
                            if (n8 != -1) {
                                this.state = 6;
                                return false;
                            }
                            break;
                        }
                        case 4: {
                            if (n8 == -2) {
                                n9 = state + 1;
                                break Label_0280;
                            }
                            if (n8 != -1) {
                                this.state = 6;
                                return false;
                            }
                            break;
                        }
                        case 5: {
                            if (n8 != -1) {
                                this.state = 6;
                                return false;
                            }
                            break;
                        }
                    }
                    n9 = state;
                }
                state = n9;
            }
            final int value2 = value;
            continue;
        }
    }
}
