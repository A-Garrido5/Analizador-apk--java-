// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum ag
{
    public static final ag CONTACTPICKER_LIST;
    public static final ag CONTACTPICKER_MENU;
    public static final ag CONTACTS_LIST;
    public static final ag CONTACTS_MENU;
    public static final ag EMPTY_CALLS;
    public static final ag EMPTY_CONTACTS;
    public static final ag EMPTY_CONVERSATIONS;
    public static final ag INVITE_NON_WA_CONTACT;
    public static final ag SETTINGS_CONTACTS;
    private static final ag[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[9];
        String s = "\u0007Al82\u000bPt>(\u0011X{.%\u0001An0%\u001a";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'f';
                        break;
                    }
                    case 0: {
                        c2 = 'N';
                        break;
                    }
                    case 1: {
                        c2 = '\u000f';
                        break;
                    }
                    case 2: {
                        c2 = ':';
                        break;
                    }
                    case 3: {
                        c2 = 'q';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\r@t%'\r[j8%\u0005Jh.+\u000bAo";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u000bBj%?\u0011Lu?0\u000b]i02\u0007@t\"";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u001dJn%/\u0000Hi.%\u0001An0%\u001a\\";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\r@t%'\r[i.+\u000bAo";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\r@t%'\r[j8%\u0005Jh.*\u0007\\n";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u000bBj%?\u0011Lu?2\u000fLn\"";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u000bBj%?\u0011L{=*\u001d";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\r@t%'\r[i.*\u0007\\n";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        SETTINGS_CONTACTS = new ag(ag.z[3], 0, 1);
        CONTACTS_LIST = new ag(ag.z[8], 1, 2);
        CONTACTS_MENU = new ag(ag.z[4], 2, 3);
        CONTACTPICKER_LIST = new ag(ag.z[5], 3, 4);
        CONTACTPICKER_MENU = new ag(ag.z[1], 4, 5);
        EMPTY_CONVERSATIONS = new ag(ag.z[2], 5, 6);
        EMPTY_CONTACTS = new ag(ag.z[6], 6, 7);
        INVITE_NON_WA_CONTACT = new ag(ag.z[0], 7, 8);
        EMPTY_CALLS = new ag(ag.z[7], 8, 9);
        a = new ag[] { ag.SETTINGS_CONTACTS, ag.CONTACTS_LIST, ag.CONTACTS_MENU, ag.CONTACTPICKER_LIST, ag.CONTACTPICKER_MENU, ag.EMPTY_CONVERSATIONS, ag.EMPTY_CONTACTS, ag.INVITE_NON_WA_CONTACT, ag.EMPTY_CALLS };
    }
    
    private ag(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
