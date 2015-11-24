// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

public final class VoipOptions$AudioRestrict
{
    private static final String[] z;
    public final String encoding;
    public final Integer rate;
    
    static {
        final String[] z2 = new String[5];
        String s = "<\b\"?";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '!';
                        break;
                    }
                    case 0: {
                        c2 = 'N';
                        break;
                    }
                    case 1: {
                        c2 = 'i';
                        break;
                    }
                    case 2: {
                        c2 = 'V';
                        break;
                    }
                    case 3: {
                        c2 = 'Z';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "+\u00075";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "<\b\"?";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "bI$;U+T";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "\u000f\u001c23N\u001c\f%.S'\n\"!D \n9>H \u000ek}";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public VoipOptions$AudioRestrict(final String encoding, final Integer rate) {
        this.encoding = encoding;
        this.rate = rate;
    }
    
    public static VoipOptions$AudioRestrict fromProtocolTreeNode(final c0 c0) {
        if (c0 == null) {
            return null;
        }
        return new VoipOptions$AudioRestrict(c0.c(VoipOptions$AudioRestrict.z[1]), VoipOptions.access$000(c0.c(VoipOptions$AudioRestrict.z[2]), VoipOptions$AudioRestrict.z[0]));
    }
    
    @Override
    public String toString() {
        return VoipOptions$AudioRestrict.z[4] + this.encoding + '\'' + VoipOptions$AudioRestrict.z[3] + this.rate + '}';
    }
}
