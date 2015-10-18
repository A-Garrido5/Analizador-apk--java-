// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.view.menu;

class BaseWrapper
{
    private static final String z;
    final Object mWrappedObject;
    
    static {
        final char[] charArray = "\u000eu P1<cao#3b\"Ta:f/\u0000/6saB$yi4L-w".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'A';
                    break;
                }
                case 0: {
                    c2 = 'Y';
                    break;
                }
                case 1: {
                    c2 = '\u0007';
                    break;
                }
                case 2: {
                    c2 = 'A';
                    break;
                }
                case 3: {
                    c2 = ' ';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    BaseWrapper(final Object mWrappedObject) {
        if (mWrappedObject == null) {
            throw new IllegalArgumentException(BaseWrapper.z);
        }
        this.mWrappedObject = mWrappedObject;
    }
}
