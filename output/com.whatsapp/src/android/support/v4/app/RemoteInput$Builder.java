// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Bundle;

public final class RemoteInput$Builder
{
    private static final String z;
    private boolean mAllowFreeFormInput;
    private CharSequence[] mChoices;
    private Bundle mExtras;
    private CharSequence mLabel;
    private final String mResultKey;
    
    static {
        final char[] charArray = "$\f\u0012Q\u0014\u0002I\nA\u0001V\n\u0000J_\u0002I\u0003AX\u0018\u001c\rH".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'x';
                    break;
                }
                case 0: {
                    c2 = 'v';
                    break;
                }
                case 1: {
                    c2 = 'i';
                    break;
                }
                case 2: {
                    c2 = 'a';
                    break;
                }
                case 3: {
                    c2 = '$';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public RemoteInput$Builder(final String mResultKey) {
        this.mAllowFreeFormInput = true;
        this.mExtras = new Bundle();
        if (mResultKey == null) {
            throw new IllegalArgumentException(RemoteInput$Builder.z);
        }
        this.mResultKey = mResultKey;
    }
    
    public RemoteInput build() {
        return new RemoteInput(this.mResultKey, this.mLabel, this.mChoices, this.mAllowFreeFormInput, this.mExtras);
    }
    
    public RemoteInput$Builder setChoices(final CharSequence[] mChoices) {
        this.mChoices = mChoices;
        return this;
    }
    
    public RemoteInput$Builder setLabel(final CharSequence mLabel) {
        this.mLabel = mLabel;
        return this;
    }
}
