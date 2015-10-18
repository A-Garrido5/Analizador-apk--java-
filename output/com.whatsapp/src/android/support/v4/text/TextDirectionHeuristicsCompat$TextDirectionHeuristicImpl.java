// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.text;

import android.support.v4.app.FragmentActivity;

abstract class TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl implements TextDirectionHeuristicCompat
{
    private final TextDirectionHeuristicsCompat$TextDirectionAlgorithm mAlgorithm;
    
    public TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl(final TextDirectionHeuristicsCompat$TextDirectionAlgorithm mAlgorithm) {
        this.mAlgorithm = mAlgorithm;
    }
    
    private boolean doCheck(final CharSequence charSequence, final int n, final int n2) {
        try {
            switch (this.mAlgorithm.checkRtl(charSequence, n, n2)) {
                default: {
                    return this.defaultIsRtl();
                }
                case 0: {
                    return true;
                }
                case 1: {
                    break;
                }
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return false;
    }
    
    protected abstract boolean defaultIsRtl();
    
    @Override
    public boolean isRtl(final CharSequence charSequence, final int n, final int n2) {
        final boolean a = TextDirectionHeuristicsCompat.a;
        Label_0029: {
            if (charSequence == null || n < 0 || n2 < 0) {
                break Label_0029;
            }
            try {
                if (charSequence.length() - n2 < n) {
                    throw new IllegalArgumentException();
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        try {
            if (this.mAlgorithm == null) {
                return this.defaultIsRtl();
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        while (true) {
            while (true) {
                Label_0108: {
                    try {
                        final boolean doCheck = this.doCheck(charSequence, n, n2);
                        if (FragmentActivity.a != 0) {
                            if (!a) {
                                break Label_0108;
                            }
                            final boolean a2 = false;
                            TextDirectionHeuristicsCompat.a = a2;
                        }
                        return doCheck;
                    }
                    catch (IllegalArgumentException ex3) {
                        try {
                            throw ex3;
                        }
                        catch (IllegalArgumentException ex4) {
                            throw ex4;
                        }
                    }
                }
                final boolean a2 = true;
                continue;
            }
        }
    }
}
