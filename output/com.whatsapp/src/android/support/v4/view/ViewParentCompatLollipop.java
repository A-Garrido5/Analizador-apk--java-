// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

class ViewParentCompatLollipop
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[28];
        String s = "Bqdu ujdl\u00044";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0732:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'p';
                        break;
                    }
                    case 0: {
                        c2 = '\u0014';
                        break;
                    }
                    case 1: {
                        c2 = '\u0018';
                        break;
                    }
                    case 2: {
                        c2 = '\u0001';
                        break;
                    }
                    case 3: {
                        c2 = '\u0002';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "y}uj\u001fp8nl>qkug\u0014G{sm\u001cxYba\u0015dldf";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Bqdu ujdl\u0004Wwlr\u0011`";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "4|ng\u00034vnvP}uqn\u0015y}ovP}vug\u0002rybgP";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "y}uj\u001fp8nl>qkug\u0014Rthl\u0017";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "4|ng\u00034vnvP}uqn\u0015y}ovP}vug\u0002rybgP";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "Bqdu ujdl\u0004Wwlr\u0011`";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "Bqdu ujdl\u00044";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "Bqdu ujdl\u00044";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "Bqdu ujdl\u0004Wwlr\u0011`";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "4|ng\u00034vnvP}uqn\u0015y}ovP}vug\u0002rybgP";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "y}uj\u001fp8nl>qkug\u0014DjdD\u001c}vf";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "Bqdu ujdl\u00044";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "4|ng\u00034vnvP}uqn\u0015y}ovP}vug\u0002rybgP";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "Bqdu ujdl\u0004Wwlr\u0011`";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "y}uj\u001fp8nl>qkug\u0014G{sm\u001cx";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "y}uj\u001fp8nl#`wqL\u0015gldf#wjnn\u001c";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "Bqdu ujdl\u0004Wwlr\u0011`";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "Bqdu ujdl\u00044";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "4|ng\u00034vnvP}uqn\u0015y}ovP}vug\u0002rybgP";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    s = "Bqdu ujdl\u00044";
                    n = 19;
                    n2 = 20;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    array = z2;
                    s = "Bqdu ujdl\u0004Wwlr\u0011`";
                    n = 20;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "y}uj\u001fp8nl#`ysv>qkug\u0014G{sm\u001cx";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "4|ng\u00034vnvP}uqn\u0015y}ovP}vug\u0002rybgP";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    s = "Bqdu ujdl\u00044";
                    n = 23;
                    n2 = 24;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    array = z2;
                    s = "4|ng\u00034vnvP}uqn\u0015y}ovP}vug\u0002rybgP";
                    n = 24;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "y}uj\u001fp8nl>qkug\u0014DjdQ\u0013fwmn";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "Bqdu ujdl\u0004Wwlr\u0011`";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    break Label_0732;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public static boolean onNestedFling(final ViewParent viewParent, final View view, final float n, final float n2, final boolean b) {
        try {
            return viewParent.onNestedFling(view, n, n2, b);
        }
        catch (AbstractMethodError abstractMethodError) {
            Log.e(ViewParentCompatLollipop.z[6], ViewParentCompatLollipop.z[7] + viewParent + ViewParentCompatLollipop.z[5] + ViewParentCompatLollipop.z[4], (Throwable)abstractMethodError);
            return false;
        }
    }
    
    public static boolean onNestedPreFling(final ViewParent viewParent, final View view, final float n, final float n2) {
        try {
            return viewParent.onNestedPreFling(view, n, n2);
        }
        catch (AbstractMethodError abstractMethodError) {
            Log.e(ViewParentCompatLollipop.z[9], ViewParentCompatLollipop.z[8] + viewParent + ViewParentCompatLollipop.z[10] + ViewParentCompatLollipop.z[11], (Throwable)abstractMethodError);
            return false;
        }
    }
    
    public static void onNestedPreScroll(final ViewParent viewParent, final View view, final int n, final int n2, final int[] array) {
        try {
            viewParent.onNestedPreScroll(view, n, n2, array);
        }
        catch (AbstractMethodError abstractMethodError) {
            Log.e(ViewParentCompatLollipop.z[27], ViewParentCompatLollipop.z[24] + viewParent + ViewParentCompatLollipop.z[25] + ViewParentCompatLollipop.z[26], (Throwable)abstractMethodError);
        }
    }
    
    public static void onNestedScroll(final ViewParent viewParent, final View view, final int n, final int n2, final int n3, final int n4) {
        try {
            viewParent.onNestedScroll(view, n, n2, n3, n4);
        }
        catch (AbstractMethodError abstractMethodError) {
            Log.e(ViewParentCompatLollipop.z[14], ViewParentCompatLollipop.z[12] + viewParent + ViewParentCompatLollipop.z[13] + ViewParentCompatLollipop.z[15], (Throwable)abstractMethodError);
        }
    }
    
    public static void onNestedScrollAccepted(final ViewParent viewParent, final View view, final View view2, final int n) {
        try {
            viewParent.onNestedScrollAccepted(view, view2, n);
        }
        catch (AbstractMethodError abstractMethodError) {
            Log.e(ViewParentCompatLollipop.z[2], ViewParentCompatLollipop.z[0] + viewParent + ViewParentCompatLollipop.z[3] + ViewParentCompatLollipop.z[1], (Throwable)abstractMethodError);
        }
    }
    
    public static boolean onStartNestedScroll(final ViewParent viewParent, final View view, final View view2, final int n) {
        try {
            return viewParent.onStartNestedScroll(view, view2, n);
        }
        catch (AbstractMethodError abstractMethodError) {
            Log.e(ViewParentCompatLollipop.z[21], ViewParentCompatLollipop.z[20] + viewParent + ViewParentCompatLollipop.z[23] + ViewParentCompatLollipop.z[22], (Throwable)abstractMethodError);
            return false;
        }
    }
    
    public static void onStopNestedScroll(final ViewParent viewParent, final View view) {
        try {
            viewParent.onStopNestedScroll(view);
        }
        catch (AbstractMethodError abstractMethodError) {
            Log.e(ViewParentCompatLollipop.z[17], ViewParentCompatLollipop.z[18] + viewParent + ViewParentCompatLollipop.z[19] + ViewParentCompatLollipop.z[16], (Throwable)abstractMethodError);
        }
    }
}
