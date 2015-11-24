// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import android.text.TextUtils;
import android.text.InputFilter$LengthFilter;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.os.Environment;
import android.os.Build;
import android.view.View$OnClickListener;
import android.os.Bundle;
import android.content.res.Configuration;
import com.whatsapp.gdrive.GoogleDriveNewUserSetupActivity;
import com.whatsapp.messaging.MessageService;
import java.util.Collection;
import android.widget.CheckBox;
import com.whatsapp.util.cq;
import android.app.Activity;
import com.whatsapp.gdrive.GoogleDriveActivity;
import android.graphics.Bitmap$Config;
import android.content.SharedPreferences$Editor;
import android.app.Dialog;
import java.net.URISyntaxException;
import com.whatsapp.util.Log;
import android.content.Intent$ShortcutIconResource;
import android.os.Parcelable;
import android.content.Intent;
import android.content.Context;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.EditText;
import android.view.View$OnTouchListener;
import android.os.Handler;
import android.graphics.Bitmap;
import android.view.View;

public class RegisterName extends VerifyMessageStoreActivity implements aws
{
    private static final String[] D;
    private static x1 x;
    private View A;
    private ahl B;
    private boolean C;
    private Bitmap l;
    private Handler m;
    private View$OnTouchListener n;
    private ahh o;
    private boolean p;
    private eu q;
    private a_9 r;
    private n7 s;
    private View t;
    private EditText u;
    private Handler v;
    private ImageView w;
    private TextView y;
    private TextView z;
    
    static {
        final String[] d = new String[71];
        String s = "j\u000eUyPb\u0004\u001fbQ\u007f\u0005_\u007f\u0011n\u0018Ey^%\u0013YdM\u007f\u0003D\u007f\u0011B#~E`Y%bDjY#t";
        int n = -1;
        String[] array = d;
        int n2 = 0;
        String intern = null;
    Label_1807:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '?';
                        break;
                    }
                    case 0: {
                        c2 = '\u000b';
                        break;
                    }
                    case 1: {
                        c2 = '`';
                        break;
                    }
                    case 2: {
                        c2 = '1';
                        break;
                    }
                    case 3: {
                        c2 = '\u000b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "j\u000eUyPb\u0004\u001fbQ\u007f\u0005_\u007f\u0011n\u0018Ey^%\u0013YdM\u007f\u0003D\u007f\u0011E!|N";
                    n2 = 1;
                    array = d;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = d;
                    s = "h\u000f\\%^e\u0004CdVoN]jJe\u0003YnM%\u0001R\u007fVd\u000e\u001fBqX4pGsT3yDm_#d_";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "o\u0015AgVh\u0001En";
                    n = 2;
                    array = d;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "j\u000eUyPb\u0004\u001fbQ\u007f\u0005_\u007f\u0011n\u0018Ey^%\u0013YdM\u007f\u0003D\u007f\u0011B.eNq_";
                    n = 3;
                    array = d;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "x\u0014PyKn\u0004nl[y\tGn`j\u0003EbIb\u0014H";
                    n = 4;
                    array = d;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001ehMn\u0001En\u0010i\u0001U&L\u007f\u0001En\u001fi\u000fDe\\n@Ed\u001ff\u0001Xe";
                    n = 5;
                    array = d;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001ehMn\u0001En\u0010f\tBxVe\u0007\u001c{^y\u0001\\x\u001fi\u000fDe\\n@Ed\u001fy\u0005V{Wd\u000eT";
                    n = 6;
                    array = d;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "X\u000f_r";
                    n = 7;
                    array = d;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "f\u000fDeKn\u0004";
                    n = 8;
                    array = d;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001ehSb\u0003Zn[$\u0013Uh^y\u0004B\u007f^\u007f\u0005\u0011";
                    n = 9;
                    array = d;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001efLl\u0013EdMnOYn^g\u0014Yr";
                    n = 10;
                    n2 = 11;
                    array = d;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    array = d;
                    s = "f\u000fDeKn\u0004nyP";
                    n = 11;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001exH&\u0005I{Vy\u0005U";
                    n = 12;
                    array = d;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001ehMn\u0001En\u0010y\u0005VbL\u007f\u0012P\u007fVd\u000e\u0011jSy\u0005PoF+\u0016TyVm\tTo\u001fi\u000fDe\\n@Ed\u001ff\u0001Xe";
                    n = 13;
                    array = d;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001ehSd\u0003Z&Hy\u000f_l";
                    n = 14;
                    array = d;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "x\u0014PyKn\u0004nl[y\tGn`e\u0005FTJx\u0005CT^h\u0014X}V\u007f\u0019";
                    n = 15;
                    array = d;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001ehMn\u0001En";
                    n = 16;
                    array = d;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001e|^b\u0014XeX&\u0006^y\u0012f\u0013VxKd\u0012T&[d\u0017_gPj\u0004";
                    n = 17;
                    array = d;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "+\u0012TxJg\u0014\u000b";
                    n = 18;
                    array = d;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001ej\\\u007f\tGbKrMCnL~\fE+Mn\u0011DnL\u007fZ";
                    n = 19;
                    array = d;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001ej\\\u007f\tGbKrMCnL~\fE+Je\u000b_dHe@CnL~\fE+\\d\u0004T+";
                    n = 20;
                    array = d;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "b\u0013nyZx\u0005E";
                    n = 21;
                    array = d;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001ej\\\u007f\tGbKrMCnL~\fE+xd\u000fVgZ+\u0004CbIn@Sj\\`\u0015A+Yd\u0015_o\u001fj\u000eU+Vx@SnVe\u0007\u0011yZx\u0014^yZoN";
                    n = 22;
                    array = d;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "+\u0006CdR+'^dXg\u0005uyV}\u0005phKb\u0016X\u007fF%";
                    n = 23;
                    array = d;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001eyZx\u0015\\n\u001fy\u0005V+In\u0012XmVn\u0004\n+Zs\u0010]b\\b\u0014]r\u001fo\tB{Sj\u0019\u0011hPe\u0014XeJn@BhMn\u0005_";
                    n = 24;
                    array = d;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001eyZx\u0015\\n";
                    n = 25;
                    array = d;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "h\u000f\\%Hc\u0001Ex^{\u0010n{Mn\u0006TyZe\u0003Tx";
                    n = 26;
                    array = d;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "h\u000f\\%Hc\u0001Ex^{\u0010\u001fyZl\tB\u007fZy\u000ePfZ%\t_bKb\u0001]bEn\u0012nxKj\u0012ETKb\rT";
                    n = 27;
                    array = d;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001ehSn\u0001C\u007fVe\tEb^g\tKnM\u007f\t\\n\u0010n\u0012CdM";
                    n = 28;
                    array = d;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "y\u0005VbL\u007f\u0005C&Qj\rT";
                    n = 29;
                    array = d;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001e{^~\u0013T";
                    n = 30;
                    array = d;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "o\u0005S~X";
                    n = 31;
                    array = d;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001exZ\u007f?UbM\u007f\u0019";
                    n = 32;
                    array = d;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "y\u0005Ve^f\u0005\u001efLl\u0013EdMn\u0016TyVm\tTo\u0010l\u0012^~OT\u0013He\\T\u0012TzJb\u0012To";
                    n = 33;
                    array = d;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001efZx\u0013PlZx\u0014^yZ}\u0005CbYb\u0005U$Rb\u0013BbQlMAjMj\rB+]d\u0015_hZ+\u0014^+Mn\u0007AcPe\u0005";
                    n = 34;
                    array = d;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001eyZx\u0014^yZo\tPgPlOTfO\u007f\u0019\u001cfLlMCnL\u007f\u000fCn";
                    n = 35;
                    array = d;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001eyZx\u0014^yZo\tPgPlORdQl\u0012P\u007fL";
                    n = 36;
                    array = d;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001exZ\u007f\t_bKb\u0001]bEn\u0012EbRnOTyMd\u0012";
                    n = 37;
                    array = d;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "h\u000f\\%Hc\u0001Ex^{\u0010n{Mn\u0006TyZe\u0003Tx";
                    n = 38;
                    array = d;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "h\u000f\\%Hc\u0001Ex^{\u0010\u001fyZl\tB\u007fZy\u000ePfZ%\t_bKb\u0001]bEn\u0012nxKj\u0012ETKb\rT";
                    n = 39;
                    array = d;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001eoZx\u0014CdF";
                    n = 40;
                    array = d;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001exKj\u0012E";
                    n = 41;
                    array = d;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001eeP&\u0010DxWe\u0001\\n";
                    n = 42;
                    array = d;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "j\u000eUyPb\u0004\u001fbQ\u007f\u0005_\u007f\u0011j\u0003EbPeN|JvE";
                    n = 43;
                    array = d;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "h\u000f\\%Hc\u0001Ex^{\u0010";
                    n = 44;
                    array = d;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "j\u000eUyPb\u0004\u001fbQ\u007f\u0005_\u007f\u0011h\u0001EnXd\u0012H%sJ5\u007fHwN2";
                    n = 45;
                    array = d;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "h\u000f\\%Hc\u0001Ex^{\u0010\u001fF^b\u000e";
                    n = 46;
                    array = d;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "h\u000f\\%Hc\u0001Ex^{\u0010n{Mn\u0006TyZe\u0003Tx";
                    n = 47;
                    array = d;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    s = "h\u000f\\%Hc\u0001Ex^{\u0010\u001fyZl\tB\u007fZy\u000ePfZ%\t_bKb\u0001]bEn\u0012nxKj\u0012ETKb\rT";
                    n = 48;
                    n2 = 49;
                    array = d;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    array = d;
                    s = "x\u0014PyKn\u0004nl[y\tGn`j\u0003EbIb\u0014H";
                    n = 49;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "x\u0014PyKn\u0004nl[y\tGn`e\u0005FTJx\u0005CT^h\u0014X}V\u007f\u0019";
                    n = 50;
                    array = d;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001eoVj\f^l\u0010m\u0001XgZoM_nK";
                    n = 51;
                    array = d;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001eoVj\f^l\u0010h\u0001_\u007f\u0012h\u000f_eZh\u0014";
                    n = 52;
                    array = d;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001eoVj\f^l\u0010b\u000eX\u007fOy\u000fVyZx\u0013";
                    n = 53;
                    array = d;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001eoVj\f^l\u0010y\u0005B\u007fPy\u0005";
                    n = 54;
                    array = d;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001eoVj\f^l\u0010b\u000eX\u007fOy\u000fVyZx\u0013\u001ebQb\u0014\u001ceJg\f\u001eyZf\u000fGn";
                    n = 55;
                    array = d;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "j\u000eUyPb\u0004\u001fbQ\u007f\u0005_\u007f\u0011h\u0001EnXd\u0012H%wD-t";
                    n = 56;
                    array = d;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "j\u000eUyPb\u0004\u001fbQ\u007f\u0005_\u007f\u0011j\u0003EbPeN|JvE";
                    n = 57;
                    array = d;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001elZ\u007f\rTe^f\u0005\u0011";
                    n = 58;
                    array = d;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "h\u000f\\%Xd\u000fVgZ";
                    n = 59;
                    array = d;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    n2 = 61;
                    s = "o\tB{Sj\u0019ne^f\u0005";
                    n = 60;
                    array = d;
                    continue;
                }
                case 60: {
                    array[n2] = intern;
                    n2 = 62;
                    s = "h\u000f\\%^e\u0004CdVoN]jJe\u0003YnM%\u0001R\u007fVd\u000e\u001f^qB.b_~G,nXwD2eHj_";
                    n = 61;
                    array = d;
                    continue;
                }
                case 61: {
                    array[n2] = intern;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001eyZf\u000fGn\u0012x\b^yKh\u0015E+\\j\u000e_dK+\u0010PyLn@BcPy\u0014R~K+\u0015Cb\u001f";
                    n = 62;
                    n2 = 63;
                    array = d;
                    continue;
                }
                case 62: {
                    array[n2] = intern;
                    n2 = 64;
                    array = d;
                    s = "h\u000f\\%Hc\u0001Ex^{\u0010";
                    n = 63;
                    continue;
                }
                case 63: {
                    array[n2] = intern;
                    n2 = 65;
                    s = "j\u000eUyPb\u0004\u001fbQ\u007f\u0005_\u007f\u0011n\u0018Ey^%\u0013YdM\u007f\u0003D\u007f\u0011B.eNq_";
                    n = 64;
                    array = d;
                    continue;
                }
                case 64: {
                    array[n2] = intern;
                    n2 = 66;
                    s = "h\u000f\\%Hc\u0001Ex^{\u0010\u001fF^b\u000e";
                    n = 65;
                    array = d;
                    continue;
                }
                case 65: {
                    array[n2] = intern;
                    n2 = 67;
                    s = "j\u000eUyPb\u0004\u001fbQ\u007f\u0005_\u007f\u0011n\u0018Ey^%\u0013YdM\u007f\u0003D\u007f\u0011E!|N";
                    n = 66;
                    array = d;
                    continue;
                }
                case 66: {
                    array[n2] = intern;
                    n2 = 68;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001ehWn\u0003Z&Yd\u0012\u001cgPh\u0001]&^e\u0004\u001cyZf\u000fEn\u0012i\u0001R`J{\u0013";
                    n = 67;
                    array = d;
                    continue;
                }
                case 67: {
                    array[n2] = intern;
                    n2 = 69;
                    s = "j\u0003EbPe?BcP|?CnL\u007f\u000fCn`d\u000eTTKb\rTTLn\u0014D{";
                    n = 68;
                    array = d;
                    continue;
                }
                case 68: {
                    array[n2] = intern;
                    n2 = 70;
                    s = "y\u0005VbL\u007f\u0005Ce^f\u0005\u001exKj\u0012E&Xo\u0012X}Z&\u0001R\u007fV}\tEr";
                    n = 69;
                    array = d;
                    continue;
                }
                case 69: {
                    break Label_1807;
                }
            }
        }
        array[n2] = intern;
        D = d;
        RegisterName.x = null;
    }
    
    public RegisterName() {
        this.v = new i0(this);
        this.m = new g_(this);
        this.q = new ar3(this);
        this.n = (View$OnTouchListener)new c7(this);
    }
    
    static View a(final RegisterName registerName, final View t) {
        return registerName.t = t;
    }
    
    static x1 a(final x1 x) {
        return RegisterName.x = x;
    }
    
    private String a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_1       
        //     2: getstatic       com/whatsapp/App.I:Z
        //     5: istore_2       
        //     6: getstatic       android/os/Build$VERSION.SDK_INT:I
        //     9: bipush          14
        //    11: if_icmplt       304
        //    14: aload_0        
        //    15: invokevirtual   com/whatsapp/RegisterName.getContentResolver:()Landroid/content/ContentResolver;
        //    18: astore          12
        //    20: getstatic       android/provider/ContactsContract$Profile.CONTENT_URI:Landroid/net/Uri;
        //    23: astore          13
        //    25: iconst_1       
        //    26: anewarray       Ljava/lang/String;
        //    29: astore          14
        //    31: aload           14
        //    33: iconst_0       
        //    34: getstatic       com/whatsapp/RegisterName.D:[Ljava/lang/String;
        //    37: bipush          61
        //    39: aaload         
        //    40: aastore        
        //    41: aload           12
        //    43: aload           13
        //    45: aload           14
        //    47: aconst_null    
        //    48: aconst_null    
        //    49: aconst_null    
        //    50: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    53: astore          15
        //    55: aload           15
        //    57: ifnull          304
        //    60: aload           15
        //    62: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    67: istore          17
        //    69: iload           17
        //    71: ifeq            299
        //    74: aload           15
        //    76: iconst_0       
        //    77: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //    82: astore          19
        //    84: aload           19
        //    86: astore_3       
        //    87: aload           15
        //    89: invokeinterface android/database/Cursor.close:()V
        //    94: aload_3        
        //    95: ifnonnull       239
        //    98: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   101: invokevirtual   com/whatsapp/App.getApplicationContext:()Landroid/content/Context;
        //   104: invokestatic    android/accounts/AccountManager.get:(Landroid/content/Context;)Landroid/accounts/AccountManager;
        //   107: astore          4
        //   109: aload           4
        //   111: ifnull          239
        //   114: aload           4
        //   116: invokevirtual   android/accounts/AccountManager.getAccounts:()[Landroid/accounts/Account;
        //   119: astore          5
        //   121: aload           5
        //   123: ifnull          239
        //   126: aload           5
        //   128: arraylength    
        //   129: istore          6
        //   131: iconst_0       
        //   132: istore          7
        //   134: iload           7
        //   136: iload           6
        //   138: if_icmpge       239
        //   141: aload           5
        //   143: iload           7
        //   145: aaload         
        //   146: astore          8
        //   148: aload           8
        //   150: getfield        android/accounts/Account.type:Ljava/lang/String;
        //   153: getstatic       com/whatsapp/RegisterName.D:[Ljava/lang/String;
        //   156: bipush          60
        //   158: aaload         
        //   159: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   162: ifeq            232
        //   165: aload           8
        //   167: getfield        android/accounts/Account.name:Ljava/lang/String;
        //   170: ldc_w           "@"
        //   173: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   176: istore          10
        //   178: iload           10
        //   180: ifeq            215
        //   183: aload           8
        //   185: getfield        android/accounts/Account.name:Ljava/lang/String;
        //   188: iconst_0       
        //   189: aload           8
        //   191: getfield        android/accounts/Account.name:Ljava/lang/String;
        //   194: ldc_w           "@"
        //   197: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   200: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   203: bipush          46
        //   205: bipush          32
        //   207: invokevirtual   java/lang/String.replace:(CC)Ljava/lang/String;
        //   210: astore_3       
        //   211: iload_2        
        //   212: ifeq            239
        //   215: aload           8
        //   217: getfield        android/accounts/Account.name:Ljava/lang/String;
        //   220: bipush          46
        //   222: bipush          32
        //   224: invokevirtual   java/lang/String.replace:(CC)Ljava/lang/String;
        //   227: astore_3       
        //   228: iload_2        
        //   229: ifeq            239
        //   232: iinc            7, 1
        //   235: iload_2        
        //   236: ifeq            134
        //   239: aload_3        
        //   240: areturn        
        //   241: astore          16
        //   243: aload           16
        //   245: athrow         
        //   246: astore          11
        //   248: new             Ljava/lang/StringBuilder;
        //   251: dup            
        //   252: invokespecial   java/lang/StringBuilder.<init>:()V
        //   255: getstatic       com/whatsapp/RegisterName.D:[Ljava/lang/String;
        //   258: bipush          59
        //   260: aaload         
        //   261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   264: aload           11
        //   266: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //   269: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   272: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   275: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   278: aload_1        
        //   279: astore_3       
        //   280: goto            94
        //   283: astore          9
        //   285: aload           9
        //   287: athrow         
        //   288: astore          18
        //   290: aload_3        
        //   291: astore_1       
        //   292: aload           18
        //   294: astore          11
        //   296: goto            248
        //   299: aconst_null    
        //   300: astore_3       
        //   301: goto            87
        //   304: aconst_null    
        //   305: astore_3       
        //   306: goto            94
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  14     55     246    248    Ljava/lang/Exception;
        //  60     69     241    246    Ljava/lang/Exception;
        //  74     84     246    248    Ljava/lang/Exception;
        //  87     94     288    299    Ljava/lang/Exception;
        //  148    178    283    288    Ljava/lang/Exception;
        //  243    246    246    248    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0087:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void a(final Context context, final String s) {
        final Intent i = i();
        final Intent intent = new Intent();
        intent.putExtra(RegisterName.D[4], (Parcelable)i);
        intent.putExtra(RegisterName.D[3], false);
        intent.putExtra(RegisterName.D[1], s);
        intent.putExtra(RegisterName.D[0], (Parcelable)Intent$ShortcutIconResource.fromContext(context, 2130838843));
        intent.setAction(RegisterName.D[2]);
        context.sendBroadcast(intent);
    }
    
    public static void a(final Context context, final String s, final int n) {
        Intent i = null;
        Label_0055: {
            if (n == 0) {
                i = new Intent();
                i.setClassName(RegisterName.D[64], RegisterName.D[66]);
                i.addFlags(268435456);
                i.addFlags(67108864);
                if (!App.I) {
                    break Label_0055;
                }
            }
            i = i();
        }
        final Intent intent = new Intent();
        while (true) {
            try {
                intent.putExtra(RegisterName.D[65], (Parcelable)Intent.parseUri(i.toUri(0), 0));
                intent.putExtra(RegisterName.D[67], s);
                intent.setAction(RegisterName.D[62]);
                context.sendBroadcast(intent);
            }
            catch (URISyntaxException ex) {
                Log.e(RegisterName.D[63] + ex.getMessage());
                continue;
            }
            break;
        }
    }
    
    private void a(final Bitmap imageBitmap) {
        this.w.setImageBitmap(imageBitmap);
    }
    
    static void a(final RegisterName registerName, final boolean b) {
        registerName.b(b);
    }
    
    static boolean a(final RegisterName registerName) {
        return registerName.p;
    }
    
    private Dialog b() {
        (this.o = new ahh(this)).setCancelable(false);
        return this.o;
    }
    
    static TextView b(final RegisterName registerName) {
        return registerName.y;
    }
    
    static boolean b(final RegisterName registerName, final boolean p2) {
        return registerName.p = p2;
    }
    
    static void c(final RegisterName registerName) {
        registerName.n();
    }
    
    static View$OnTouchListener d(final RegisterName registerName) {
        return registerName.n;
    }
    
    static n7 e(final RegisterName registerName) {
        return registerName.s;
    }
    
    static Handler f(final RegisterName registerName) {
        return registerName.m;
    }
    
    static EditText g(final RegisterName registerName) {
        return registerName.u;
    }
    
    private void g() {
        final SharedPreferences$Editor edit = this.getSharedPreferences(RegisterName.D[39], 0).edit();
        edit.putLong(RegisterName.D[40], System.currentTimeMillis());
        if (!edit.commit()) {
            Log.w(RegisterName.D[38]);
        }
    }
    
    static TextView h(final RegisterName registerName) {
        return registerName.z;
    }
    
    public static Intent i() {
        final Intent intent = new Intent();
        intent.setClassName(RegisterName.D[45], RegisterName.D[47]);
        intent.setAction(RegisterName.D[44]);
        intent.addCategory(RegisterName.D[46]);
        intent.addFlags(268435456);
        intent.addFlags(2097152);
        return intent;
    }
    
    static ahl i(final RegisterName registerName) {
        return registerName.B;
    }
    
    static a_9 j(final RegisterName registerName) {
        return registerName.r;
    }
    
    private void j() {
        final long o = this.o();
        if (o > 0L && System.currentTimeMillis() - o > 600000L && this.t != null) {
            this.t.setVisibility(0);
        }
    }
    
    static View k(final RegisterName registerName) {
        return registerName.t;
    }
    
    static x1 k() {
        return RegisterName.x;
    }
    
    static ahh l(final RegisterName registerName) {
        return registerName.o;
    }
    
    private void l() {
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131361949);
        final float dimension = this.getResources().getDimension(2131361813);
        Bitmap bitmap;
        if (this.r == null || _r.a(this.r.u)) {
            this.w.setEnabled(false);
            this.A.setVisibility(0);
            if (this.l == null) {
                this.l = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap$Config.ALPHA_8);
            }
            bitmap = this.l;
        }
        else {
            this.w.setEnabled(true);
            this.A.setVisibility(8);
            final boolean exists = this.r.y().exists();
            bitmap = null;
            if (exists) {
                bitmap = this.r.a(dimensionPixelSize, dimension, false);
            }
            if (bitmap == null) {
                bitmap = a_9.a(2130837599, dimensionPixelSize, dimension);
            }
        }
        this.a(bitmap);
    }
    
    private void m() {
        Log.i(RegisterName.D[68]);
        if (!this.C) {
            Log.i(RegisterName.D[70]);
            final Intent intent = new Intent((Context)this, (Class)GoogleDriveActivity.class);
            intent.setAction(RegisterName.D[69]);
            this.startActivityForResult(intent, 14);
            this.C = true;
        }
    }
    
    static void m(final RegisterName registerName) {
        registerName.j();
    }
    
    private void n() {
        final SharedPreferences$Editor edit = this.getSharedPreferences(RegisterName.D[27], 0).edit();
        edit.remove(RegisterName.D[28]);
        if (!edit.commit()) {
            Log.w(RegisterName.D[29]);
        }
    }
    
    static void n(final RegisterName registerName) {
        registerName.q();
    }
    
    private long o() {
        return this.getSharedPreferences(RegisterName.D[48], 0).getLong(RegisterName.D[49], -1L);
    }
    
    private Dialog p() {
        (this.B = new aho(this, this)).setCancelable(false);
        return this.B;
    }
    
    private void q() {
        Log.i(RegisterName.D[42]);
        final String a = cq.a(((EditText)this.findViewById(2131755724)).getText().toString().trim());
        if (a.length() == 0) {
            Log.w(RegisterName.D[43]);
            App.a((Context)this, 2131231539, 0);
            if (!App.I) {
                return;
            }
        }
        if (RegisterName.x == null || x1.b(RegisterName.x)) {
            ((App)this.getApplication()).m(a);
            App.b(a);
            App.b((Context)this, false);
            RegisterName.x = new x1(this, this.v);
            this.showDialog(0);
            if (((CheckBox)this.findViewById(2131755730)).isChecked()) {
                a((Context)this, this.getString(2131231990));
            }
            if (this.t != null) {
                this.t.setVisibility(8);
            }
            this.g();
            this.m.sendEmptyMessageDelayed(0, 600000L);
        }
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void a(final String s) {
    }
    
    @Override
    public void a(final Collection collection) {
    }
    
    @Override
    public void b(final String s) {
        if (this.r != null && s.equals(this.r.u)) {
            this.l();
        }
    }
    
    @Override
    protected void b(final boolean b) {
        super.b(b);
        if (this.B != null && b) {
            this.B.a(1);
        }
    }
    
    @Override
    public void c(final String s) {
    }
    
    @Override
    public void d(final String s) {
    }
    
    @Override
    protected void f() {
        final boolean i = App.I;
        App$Me ax = null;
        Label_0044: {
            if (this.getIntent().getExtras() != null && this.getIntent().getBooleanExtra(RegisterName.D[32], false)) {
                ax = App.aX;
                if (!i) {
                    break Label_0044;
                }
            }
            ax = App.x((Context)this);
        }
        ax.jabber_id = App.m((Context)App.aq);
        if (ax.jabber_id == null) {
            Log.e(RegisterName.D[35]);
            App.b((Context)this, 1);
            this.startActivity(new Intent((Context)this, (Class)RegisterPhone.class));
            this.finish();
        }
        else {
            if (!App.a(ax)) {
                this.finish();
                return;
            }
            App.aX = ax;
            ProfilePhotoReminder.l = true;
            Log.i(RegisterName.D[33]);
            App.an = false;
            App.r((Context)this.getApplication());
            App.a8();
            MessageService.b((Context)App.aq);
            Log.i(RegisterName.D[34]);
            App.a1();
            this.r = App.S.e();
            App.a(this.r.u, 0, 2);
            this.l();
            this.A.setVisibility(0);
            if (this.B != null) {
                if (App.ak.G() != 0) {
                    Log.i(RegisterName.D[37]);
                    this.B.a(2);
                    if (!i) {
                        return;
                    }
                }
                Log.i(RegisterName.D[36]);
                if (!this.p && GoogleDriveNewUserSetupActivity.e()) {
                    this.startActivityForResult(new Intent((Context)this, (Class)GoogleDriveNewUserSetupActivity.class), 15);
                    this.p = true;
                }
                this.removeDialog(103);
            }
        }
    }
    
    protected void h() {
        Log.i(RegisterName.D[18]);
        if (this.B != null) {
            this.B.a(1);
        }
        this.y = (TextView)this.B.findViewById(2131755289);
        this.runOnUiThread((Runnable)new b1(this));
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        final boolean i = App.I;
        Log.i(RegisterName.D[20] + n + RegisterName.D[19] + n2);
        Label_0286: {
            switch (n) {
                case 12: {
                    if (n2 != -1) {
                        break;
                    }
                    if (intent != null && intent.getBooleanExtra(RegisterName.D[22], false)) {
                        qp.b(this.r, this);
                        this.l();
                        if (!i) {
                            break;
                        }
                    }
                    qp.a(intent, this.r, this, 13, this);
                    if (i) {
                        break Label_0286;
                    }
                    break;
                }
                case 13: {
                    qp.b().delete();
                    if (n2 == -1) {
                        if (!qp.a(this.r, this)) {
                            break;
                        }
                        this.l();
                        if (!i) {
                            break;
                        }
                    }
                    if (n2 != 0 || intent == null) {
                        break;
                    }
                    qp.a(intent, this);
                    if (i) {
                        break Label_0286;
                    }
                    break;
                }
                case 14: {
                    if (n2 == 3) {
                        Log.i(RegisterName.D[23]);
                        this.showDialog(103);
                        this.h();
                        if (!i) {
                            break;
                        }
                    }
                    if (n2 == 0 || n2 == 1) {
                        this.e();
                        if (!i) {
                            break;
                        }
                    }
                    if (n2 == 2) {
                        this.b(false);
                        if (!i) {
                            break;
                        }
                    }
                    Log.e(RegisterName.D[21] + n2 + RegisterName.D[24]);
                    if (i) {
                        break Label_0286;
                    }
                    break;
                }
                case 15: {
                    this.removeDialog(103);
                }
            }
        }
    }
    
    @Override
    public void onBackPressed() {
        final Intent intent = new Intent(RegisterName.D[58]);
        intent.addCategory(RegisterName.D[57]);
        intent.setFlags(268435456);
        this.startActivity(intent);
    }
    
    @Override
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.o != null) {
            this.o.a();
            this.o.b();
            this.j();
        }
        if (this.B != null) {
            this.B.a();
        }
        this.s.a(configuration);
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        final boolean i = App.I;
        Log.i(RegisterName.D[17]);
        super.onCreate(bundle);
        Label_0065: {
            if (bundle != null) {
                this.C = bundle.getBoolean(RegisterName.D[5], false);
                this.p = bundle.getBoolean(RegisterName.D[16], false);
                if (!i) {
                    break Label_0065;
                }
            }
            this.C = false;
            this.p = false;
        }
        this.getSupportActionBar().setDisplayShowCustomEnabled(true);
        this.setContentView(2130903210);
        final int c = App.c((Context)this);
        if (c != 2) {
            Label_0117: {
                if (c == 3) {
                    Log.i(RegisterName.D[14]);
                    if (!i) {
                        break Label_0117;
                    }
                }
                Log.e(RegisterName.D[6]);
            }
            this.startActivity(new Intent((Context)this, (Class)Main.class));
            this.finish();
            return;
        }
        if (App.m((Context)App.aq) == null) {
            Log.e(RegisterName.D[7]);
            App.b((Context)this, 1);
            this.startActivity(new Intent((Context)this, (Class)RegisterPhone.class));
            this.finish();
            return;
        }
        a81.a(this, this.getSupportActionBar(), this.getString(2131231410), (View$OnClickListener)new wt(this));
        Label_0311: {
            if (App.aS == 0 || Build.MANUFACTURER.startsWith(RegisterName.D[8])) {
                this.findViewById(2131755728).setVisibility(8);
                ((CheckBox)this.findViewById(2131755730)).setChecked(false);
                this.findViewById(2131755400).setVisibility(8);
                this.findViewById(2131755403).setVisibility(8);
                if (!i) {
                    break Label_0311;
                }
            }
            ((CheckBox)this.findViewById(2131755730)).setChecked(true);
            this.findViewById(2131755728).setOnClickListener((View$OnClickListener)new jo(this));
        }
        (this.z = (TextView)this.findViewById(2131755727)).setText((CharSequence)Integer.toString(25));
        this.findViewById(2131755548).setOnClickListener((View$OnClickListener)new ep(this));
        (this.s = new n7(this)).a(this.q);
        (this.w = (ImageView)this.findViewById(2131755691)).setOnClickListener((View$OnClickListener)new zy(this));
        this.A = this.findViewById(2131755433);
        Label_0589: {
            if (RegisterName.x != null) {
                this.r = App.S.e();
                this.l();
                this.showDialog(0);
                if (!i) {
                    break Label_0589;
                }
            }
            if (!App.ak.f()) {
                final String externalStorageState = Environment.getExternalStorageState();
                Log.i(RegisterName.D[10] + externalStorageState);
                Label_0530: {
                    if (!externalStorageState.equals(RegisterName.D[9]) && !externalStorageState.equals(RegisterName.D[12])) {
                        this.showDialog(102);
                        if (!i) {
                            break Label_0530;
                        }
                    }
                    this.m();
                }
                if (!i) {
                    break Label_0589;
                }
            }
            Log.i(RegisterName.D[11]);
            App.ak.y();
            App.aA();
            this.f();
            if (!this.p && GoogleDriveNewUserSetupActivity.e()) {
                this.startActivity(new Intent((Context)this, (Class)GoogleDriveNewUserSetupActivity.class));
                this.p = true;
            }
        }
        alm.a((TextView)(this.u = (EditText)this.findViewById(2131755724)));
        alm.a(this.u);
        this.u.addTextChangedListener((TextWatcher)new km(this));
        this.u.setFilters(new InputFilter[] { new InputFilter$LengthFilter(25) });
        final String a = this.a();
        if (!TextUtils.isEmpty((CharSequence)a)) {
            this.u.setText((CharSequence)a);
            this.u.setSelection(this.u.length());
        }
        Label_0748: {
            if (App.aq.D()) {
                Log.w(RegisterName.D[15]);
                this.a();
                if (!i) {
                    break Label_0748;
                }
            }
            if (App.w()) {
                Log.w(RegisterName.D[13]);
                this.d();
            }
        }
        App.b((Context)this, 2);
        App.b((aws)this);
    }
    
    @Override
    protected Dialog onCreateDialog(final int n) {
        Dialog dialog = null;
        switch (n) {
            default: {
                dialog = super.onCreateDialog(n);
                break;
            }
            case 0: {
                Log.i(RegisterName.D[54]);
                dialog = this.b();
                if (RegisterName.x == null) {
                    Log.w(RegisterName.D[56]);
                    new Handler().postDelayed((Runnable)new mz(this), 3L);
                    return dialog;
                }
                break;
            }
            case 103: {
                Log.i(RegisterName.D[55]);
                return this.p();
            }
            case 1: {
                Log.w(RegisterName.D[52]);
                return new AlertDialog$Builder((Context)this).setTitle(2131231248).setMessage(this.getString(2131231246, new Object[] { this.getString(2131230921) })).setPositiveButton(2131231247, (DialogInterface$OnClickListener)new d4(this)).create();
            }
            case 109: {
                Log.w(RegisterName.D[53]);
                return new AlertDialog$Builder((Context)this).setMessage(2131231569).setPositiveButton(2131230894, (DialogInterface$OnClickListener)new rn(this)).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new adl(this)).setOnCancelListener((DialogInterface$OnCancelListener)new _t(this)).create();
            }
        }
        return dialog;
    }
    
    public void onDestroy() {
        super.onDestroy();
        Log.i(RegisterName.D[41]);
        App.a(true, false);
        App.a((aws)this);
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return super.onOptionsItemSelected(menuItem);
            }
            case 0: {
                this.e(RegisterName.D[30]);
                return true;
            }
            case 1: {
                App.k((Context)this);
                this.finish();
                return true;
            }
        }
    }
    
    public void onPause() {
        Log.i(RegisterName.D[31]);
        super.onPause();
        if (RegisterName.x != null) {
            RegisterName.x.a();
        }
    }
    
    public void onResume() {
        Log.i(RegisterName.D[26]);
        super.onResume();
        this.c(true);
        if (RegisterName.x != null) {
            this.showDialog(0);
            RegisterName.x.a(this.v);
            this.j();
        }
        if (App.c((Context)this) == 3 && this.o == null) {
            this.showDialog(0);
            Log.i(RegisterName.D[25]);
        }
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean(RegisterName.D[50], this.C);
            bundle.putBoolean(RegisterName.D[51], this.p);
        }
    }
}
