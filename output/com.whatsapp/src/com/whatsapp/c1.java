// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v4.text.TextDirectionHeuristicCompat;

final class c1 implements TextDirectionHeuristicCompat
{
    @Override
    public boolean isRtl(final CharSequence charSequence, final int n, final int n2) {
        final boolean i = App.I;
        int j = n;
    Label_0128:
        while (j < n + n2) {
            final int codePoint = Character.codePointAt(charSequence, j);
            final int charCount = Character.charCount(codePoint);
            if (codePoint < 127462 || codePoint > 127487) {
                switch (Character.getDirectionality(codePoint)) {
                    case 0:
                    case 14:
                    case 15: {
                        break Label_0128;
                    }
                    case 1:
                    case 2:
                    case 16:
                    case 17: {
                        return true;
                    }
                }
            }
            j += charCount;
            if (i) {
                break;
            }
        }
        return false;
    }
}
