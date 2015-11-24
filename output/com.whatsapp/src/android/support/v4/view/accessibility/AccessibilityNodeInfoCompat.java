// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view.accessibility;

import android.support.v4.app.FragmentActivity;
import android.graphics.Rect;
import android.view.View;
import android.os.Build$VERSION;

public class AccessibilityNodeInfoCompat
{
    private static final AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl IMPL;
    public static int a;
    private static final String[] z;
    private final Object mInfo;
    
    static {
        final String[] z2 = new String[38];
        String s = "\u0001J*H}\u000eV.Sw\u0016@1Ta\u001fA*L~\u001fL2D\u007f\u0005G*";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0982:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '2';
                        break;
                    }
                    case 0: {
                        c2 = '@';
                        break;
                    }
                    case 1: {
                        c2 = '\t';
                        break;
                    }
                    case 2: {
                        c2 = '~';
                        break;
                    }
                    case 3: {
                        c2 = '\u0001';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0001J*H}\u000eV=M{\u0003B";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u0001J*H}\u000eV=Mw\u0001[!G}\u0003\\-";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "\u0001J*H}\u000eV-D~\u0005J*";
                    n = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "\u0001J*H}\u000eV8Nq\u0015Z";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "\u0001J*H}\u000eV=Mw\u0001[!Rw\fL=U{\u000fG";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0001J*H}\u000eV0Dj\u0014V6U\u007f\fV;Mw\rL0U";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0001J*H}\u000eV-B`\u000fE2^t\u000f[)@`\u0004";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0001J*H}\u000eV=Tf";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    s = "\u0001J*H}\u000eV-Df\u001fZ;Mw\u0003]7N|";
                    n = 8;
                    n2 = 9;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    array = z2;
                    s = "\u0001J*H}\u000eV+Oy\u000eF)O";
                    n = 9;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0001J*H}\u000eV?Bq\u0005Z-Hp\tE7Uk\u001fO1Bg\u0013";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u0001J*H}\u000eV-B`\u000fE2^p\u0001J5Vs\u0012M";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u0001J*H}\u000eV.@a\u0014L";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    s = "\u0001J*H}\u000eV=Nb\u0019";
                    n = 13;
                    n2 = 14;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    array = z2;
                    s = "\u0001J*H}\u000eV.Sw\u0016@1Ta\u001fH*^\u007f\u000f_;Lw\u000e]!F`\u0001G+Ms\u0012@*X";
                    n = 14;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    s = "\u0001J*H}\u000eV2N|\u0007V=M{\u0003B";
                    n = 15;
                    n2 = 16;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    array = z2;
                    s = "\u0001J*H}\u000eV=Mw\u0001[!@q\u0003L-R{\u0002@2Hf\u0019V8Nq\u0015Z";
                    n = 16;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u0001J*H}\u000eV0Dj\u0014V?Um\rF(D\u007f\u0005G*^u\u0012H0T~\u0001[7Uk";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "{)\bhW7@\u001a;\u0012";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "{)\u001diW#b\u001fc^%3^";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "{)\u001dm[#b\u001fc^%3^";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "{)\u000e`A3~\u0011sVz)";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "{)\u0012n\\'J\u0012hQ+h\u001cmWz)";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "{)\u001cnG.m\rH\\\u0013j\fdW.3^";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "{)\u0018nQ5z\u001be\b`";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "{)\u001diW#b\u001be\b`";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "{)\u0018nQ5z\u001fc^%3^";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "{)\u001dmS3z0`_%3^";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "{)\u001dn\\4l\u0010uv%z\u001ds[0}\u0017n\\z)";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "{)\ndJ43^";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "l)";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "{)\u000e`Q+h\u0019d|!d\u001b;\u0012";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "{)\rb@/e\u0012`P,lD!";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "{)\u001boS\"e\u001be\b`";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "{)\u001cnG.m\rH\\\u0010h\fd\\43^";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "{)\rd^%j\ndVz)";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "{)%";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    break Label_0982;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        if (Build$VERSION.SDK_INT >= 22) {
            IMPL = new AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi22Impl();
            return;
        }
        if (Build$VERSION.SDK_INT >= 21) {
            IMPL = new AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi21Impl();
            return;
        }
        if (Build$VERSION.SDK_INT >= 19) {
            IMPL = new AccessibilityNodeInfoCompat$AccessibilityNodeInfoKitKatImpl();
            return;
        }
        if (Build$VERSION.SDK_INT >= 18) {
            IMPL = new AccessibilityNodeInfoCompat$AccessibilityNodeInfoJellybeanMr2Impl();
            return;
        }
        if (Build$VERSION.SDK_INT >= 16) {
            IMPL = new AccessibilityNodeInfoCompat$AccessibilityNodeInfoJellybeanImpl();
            return;
        }
        if (Build$VERSION.SDK_INT >= 14) {
            IMPL = new AccessibilityNodeInfoCompat$AccessibilityNodeInfoIcsImpl();
            return;
        }
        IMPL = new AccessibilityNodeInfoCompat$AccessibilityNodeInfoStubImpl();
    }
    
    public AccessibilityNodeInfoCompat(final Object mInfo) {
        this.mInfo = mInfo;
    }
    
    private static String getActionSymbolicName(final int n) {
        switch (n) {
            default: {
                return AccessibilityNodeInfoCompat.z[10];
            }
            case 1: {
                return AccessibilityNodeInfoCompat.z[4];
            }
            case 2: {
                return AccessibilityNodeInfoCompat.z[2];
            }
            case 4: {
                return AccessibilityNodeInfoCompat.z[3];
            }
            case 8: {
                return AccessibilityNodeInfoCompat.z[5];
            }
            case 16: {
                return AccessibilityNodeInfoCompat.z[1];
            }
            case 32: {
                return AccessibilityNodeInfoCompat.z[16];
            }
            case 64: {
                return AccessibilityNodeInfoCompat.z[11];
            }
            case 128: {
                return AccessibilityNodeInfoCompat.z[17];
            }
            case 256: {
                return AccessibilityNodeInfoCompat.z[18];
            }
            case 512: {
                return AccessibilityNodeInfoCompat.z[15];
            }
            case 1024: {
                return AccessibilityNodeInfoCompat.z[6];
            }
            case 2048: {
                return AccessibilityNodeInfoCompat.z[0];
            }
            case 4096: {
                return AccessibilityNodeInfoCompat.z[7];
            }
            case 8192: {
                return AccessibilityNodeInfoCompat.z[12];
            }
            case 65536: {
                return AccessibilityNodeInfoCompat.z[8];
            }
            case 16384: {
                return AccessibilityNodeInfoCompat.z[14];
            }
            case 32768: {
                return AccessibilityNodeInfoCompat.z[13];
            }
            case 131072: {
                return AccessibilityNodeInfoCompat.z[9];
            }
        }
    }
    
    public static AccessibilityNodeInfoCompat obtain(final AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        return wrapNonNullInstance(AccessibilityNodeInfoCompat.IMPL.obtain(accessibilityNodeInfoCompat.mInfo));
    }
    
    static AccessibilityNodeInfoCompat wrapNonNullInstance(final Object o) {
        if (o != null) {
            return new AccessibilityNodeInfoCompat(o);
        }
        return null;
    }
    
    public void addAction(final int n) {
        AccessibilityNodeInfoCompat.IMPL.addAction(this.mInfo, n);
    }
    
    public void addChild(final View view) {
        AccessibilityNodeInfoCompat.IMPL.addChild(this.mInfo, view);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null) {
                return false;
            }
            if (this.getClass() != o.getClass()) {
                return false;
            }
            final AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat)o;
            if (this.mInfo == null) {
                if (accessibilityNodeInfoCompat.mInfo != null) {
                    return false;
                }
            }
            else if (!this.mInfo.equals(accessibilityNodeInfoCompat.mInfo)) {
                return false;
            }
        }
        return true;
    }
    
    public int getActions() {
        return AccessibilityNodeInfoCompat.IMPL.getActions(this.mInfo);
    }
    
    public void getBoundsInParent(final Rect rect) {
        AccessibilityNodeInfoCompat.IMPL.getBoundsInParent(this.mInfo, rect);
    }
    
    public void getBoundsInScreen(final Rect rect) {
        AccessibilityNodeInfoCompat.IMPL.getBoundsInScreen(this.mInfo, rect);
    }
    
    public CharSequence getClassName() {
        return AccessibilityNodeInfoCompat.IMPL.getClassName(this.mInfo);
    }
    
    public CharSequence getContentDescription() {
        return AccessibilityNodeInfoCompat.IMPL.getContentDescription(this.mInfo);
    }
    
    public Object getInfo() {
        return this.mInfo;
    }
    
    public int getMovementGranularities() {
        return AccessibilityNodeInfoCompat.IMPL.getMovementGranularities(this.mInfo);
    }
    
    public CharSequence getPackageName() {
        return AccessibilityNodeInfoCompat.IMPL.getPackageName(this.mInfo);
    }
    
    public CharSequence getText() {
        return AccessibilityNodeInfoCompat.IMPL.getText(this.mInfo);
    }
    
    public String getViewIdResourceName() {
        return AccessibilityNodeInfoCompat.IMPL.getViewIdResourceName(this.mInfo);
    }
    
    @Override
    public int hashCode() {
        if (this.mInfo == null) {
            return 0;
        }
        return this.mInfo.hashCode();
    }
    
    public boolean isAccessibilityFocused() {
        return AccessibilityNodeInfoCompat.IMPL.isAccessibilityFocused(this.mInfo);
    }
    
    public boolean isCheckable() {
        return AccessibilityNodeInfoCompat.IMPL.isCheckable(this.mInfo);
    }
    
    public boolean isChecked() {
        return AccessibilityNodeInfoCompat.IMPL.isChecked(this.mInfo);
    }
    
    public boolean isClickable() {
        return AccessibilityNodeInfoCompat.IMPL.isClickable(this.mInfo);
    }
    
    public boolean isEnabled() {
        return AccessibilityNodeInfoCompat.IMPL.isEnabled(this.mInfo);
    }
    
    public boolean isFocusable() {
        return AccessibilityNodeInfoCompat.IMPL.isFocusable(this.mInfo);
    }
    
    public boolean isFocused() {
        return AccessibilityNodeInfoCompat.IMPL.isFocused(this.mInfo);
    }
    
    public boolean isLongClickable() {
        return AccessibilityNodeInfoCompat.IMPL.isLongClickable(this.mInfo);
    }
    
    public boolean isPassword() {
        return AccessibilityNodeInfoCompat.IMPL.isPassword(this.mInfo);
    }
    
    public boolean isScrollable() {
        return AccessibilityNodeInfoCompat.IMPL.isScrollable(this.mInfo);
    }
    
    public boolean isSelected() {
        return AccessibilityNodeInfoCompat.IMPL.isSelected(this.mInfo);
    }
    
    public boolean isVisibleToUser() {
        return AccessibilityNodeInfoCompat.IMPL.isVisibleToUser(this.mInfo);
    }
    
    public void recycle() {
        AccessibilityNodeInfoCompat.IMPL.recycle(this.mInfo);
    }
    
    public void setAccessibilityFocused(final boolean b) {
        AccessibilityNodeInfoCompat.IMPL.setAccessibilityFocused(this.mInfo, b);
    }
    
    public void setBoundsInParent(final Rect rect) {
        AccessibilityNodeInfoCompat.IMPL.setBoundsInParent(this.mInfo, rect);
    }
    
    public void setBoundsInScreen(final Rect rect) {
        AccessibilityNodeInfoCompat.IMPL.setBoundsInScreen(this.mInfo, rect);
    }
    
    public void setClassName(final CharSequence charSequence) {
        AccessibilityNodeInfoCompat.IMPL.setClassName(this.mInfo, charSequence);
    }
    
    public void setClickable(final boolean b) {
        AccessibilityNodeInfoCompat.IMPL.setClickable(this.mInfo, b);
    }
    
    public void setContentDescription(final CharSequence charSequence) {
        AccessibilityNodeInfoCompat.IMPL.setContentDescription(this.mInfo, charSequence);
    }
    
    public void setEnabled(final boolean b) {
        AccessibilityNodeInfoCompat.IMPL.setEnabled(this.mInfo, b);
    }
    
    public void setFocusable(final boolean b) {
        AccessibilityNodeInfoCompat.IMPL.setFocusable(this.mInfo, b);
    }
    
    public void setFocused(final boolean b) {
        AccessibilityNodeInfoCompat.IMPL.setFocused(this.mInfo, b);
    }
    
    public void setLongClickable(final boolean b) {
        AccessibilityNodeInfoCompat.IMPL.setLongClickable(this.mInfo, b);
    }
    
    public void setMovementGranularities(final int n) {
        AccessibilityNodeInfoCompat.IMPL.setMovementGranularities(this.mInfo, n);
    }
    
    public void setPackageName(final CharSequence charSequence) {
        AccessibilityNodeInfoCompat.IMPL.setPackageName(this.mInfo, charSequence);
    }
    
    public void setParent(final View view) {
        AccessibilityNodeInfoCompat.IMPL.setParent(this.mInfo, view);
    }
    
    public void setScrollable(final boolean b) {
        AccessibilityNodeInfoCompat.IMPL.setScrollable(this.mInfo, b);
    }
    
    public void setSelected(final boolean b) {
        AccessibilityNodeInfoCompat.IMPL.setSelected(this.mInfo, b);
    }
    
    public void setSource(final View view) {
        AccessibilityNodeInfoCompat.IMPL.setSource(this.mInfo, view);
    }
    
    public void setVisibleToUser(final boolean b) {
        AccessibilityNodeInfoCompat.IMPL.setVisibleToUser(this.mInfo, b);
    }
    
    @Override
    public String toString() {
        final int a = AccessibilityNodeInfoCompat.a;
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        final Rect rect = new Rect();
        this.getBoundsInParent(rect);
        sb.append(AccessibilityNodeInfoCompat.z[35] + rect);
        this.getBoundsInScreen(rect);
        sb.append(AccessibilityNodeInfoCompat.z[24] + rect);
        sb.append(AccessibilityNodeInfoCompat.z[32]).append(this.getPackageName());
        sb.append(AccessibilityNodeInfoCompat.z[28]).append(this.getClassName());
        sb.append(AccessibilityNodeInfoCompat.z[30]).append(this.getText());
        sb.append(AccessibilityNodeInfoCompat.z[29]).append(this.getContentDescription());
        sb.append(AccessibilityNodeInfoCompat.z[19]).append(this.getViewIdResourceName());
        sb.append(AccessibilityNodeInfoCompat.z[20]).append(this.isCheckable());
        sb.append(AccessibilityNodeInfoCompat.z[26]).append(this.isChecked());
        sb.append(AccessibilityNodeInfoCompat.z[27]).append(this.isFocusable());
        sb.append(AccessibilityNodeInfoCompat.z[25]).append(this.isFocused());
        sb.append(AccessibilityNodeInfoCompat.z[36]).append(this.isSelected());
        sb.append(AccessibilityNodeInfoCompat.z[21]).append(this.isClickable());
        sb.append(AccessibilityNodeInfoCompat.z[23]).append(this.isLongClickable());
        sb.append(AccessibilityNodeInfoCompat.z[34]).append(this.isEnabled());
        sb.append(AccessibilityNodeInfoCompat.z[22]).append(this.isPassword());
        sb.append(AccessibilityNodeInfoCompat.z[33] + this.isScrollable());
        sb.append(AccessibilityNodeInfoCompat.z[37]);
        int i = this.getActions();
        while (i != 0) {
            final int n = 1 << Integer.numberOfTrailingZeros(i);
            i &= ~n;
            sb.append(getActionSymbolicName(n));
            if (i != 0) {
                sb.append(AccessibilityNodeInfoCompat.z[31]);
            }
            if (a != 0) {
                ++FragmentActivity.a;
                break;
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
