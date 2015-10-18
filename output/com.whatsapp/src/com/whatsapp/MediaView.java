// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.provider.ContactsContract$Contacts;
import android.graphics.Bitmap$CompressFormat;
import com.whatsapp.wallpaper.CropImage;
import android.view.MenuItem;
import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import java.util.Collection;
import android.app.Activity;
import android.app.ProgressDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.content.res.Configuration;
import android.text.format.DateUtils;
import com.whatsapp.util.m;
import android.view.animation.AccelerateInterpolator;
import android.graphics.Bitmap;
import com.whatsapp.util.b6;
import android.graphics.Paint;
import com.whatsapp.util.cq;
import android.text.TextUtils;
import android.graphics.drawable.BitmapDrawable;
import com.whatsapp.util.b;
import android.os.Build$VERSION;
import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;
import android.view.ViewGroup;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.animation.ObjectAnimator;
import android.animation.Animator$AnimatorListener;
import java.util.Iterator;
import java.util.List;
import com.whatsapp.util.Log;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.whatsapp.util.br;
import com.whatsapp.wallpaper.h;
import android.database.Cursor;
import android.provider.ContactsContract$Data;
import android.content.ContentValues;
import android.content.ContentResolver;
import android.view.View;
import android.os.Parcelable;
import android.content.Intent;
import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.widget.ImageButton;
import com.whatsapp.util.ao;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import com.whatsapp.protocol.c6;
import android.os.Handler;
import com.whatsapp.protocol.bi;

public class MediaView extends DialogToastActivity
{
    private static final String[] O;
    private vn A;
    private float B;
    private VoiceNoteSeekBar C;
    private String D;
    private bi E;
    private String F;
    private Handler G;
    private int H;
    private aws I;
    private int J;
    private a9b K;
    private int L;
    private c6 M;
    private ArrayList N;
    private Drawable k;
    private MediaView$MediaViewPager l;
    private int m;
    private ao n;
    private int o;
    private boolean p;
    private ImageButton q;
    private int r;
    private float s;
    private View$OnClickListener t;
    private f4 u;
    private TextView v;
    private boolean w;
    private Uri x;
    private bi y;
    private int z;
    
    static {
        final String[] o = new String[95];
        String s = "\u0019Sa";
        int n = -1;
        String[] array = o;
        int n2 = 0;
        String intern = null;
    Label_2407:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'y';
                        break;
                    }
                    case 0: {
                        c2 = '9';
                        break;
                    }
                    case 1: {
                        c2 = '/';
                        break;
                    }
                    case 2: {
                        c2 = 'A';
                        break;
                    }
                    case 3: {
                        c2 = '~';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "OF%\u001b\u0016\u0016\u0005";
                    n2 = 1;
                    array = o;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = o;
                    s = "j@/\u0007";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "Z@,P\nVA8\u001b\u000bPL2\r\u0016W\u0001&\u001f\u0015UJ3\u0007";
                    n = 2;
                    array = o;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "j@/\u0007";
                    n = 3;
                    array = o;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "XA%\f\u0016PKo\u0017\u0017MJ/\nWXL5\u0017\u0016W\u0001\u00177<n";
                    n = 4;
                    array = o;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "Z@,P\nVA8\u001b\u000bPL2\r\u0016W\u0001&\u001f\u0015UJ3\u0007Wt@7\u0017\u001coF$\t";
                    n = 5;
                    array = o;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "Z@,P\nVA8\u001b\u000bPL2\r\u0016W\u0001&\u001f\u0015UJ3\u0007Wt@7\u0017\u001coF$\t";
                    n = 6;
                    array = o;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "VZ5\u000e\fMw";
                    n = 7;
                    array = o;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "VZ5\u000e\fMv";
                    n = 8;
                    array = o;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "PB \u0019\u001c\u0016\u0005";
                    n = 9;
                    array = o;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "SF%";
                    n = 10;
                    array = o;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "JL \u0012\u001cl_\b\u00187\\J%\u001b\u001d";
                    n = 11;
                    array = o;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "TJ%\u0017\u0018OF$\tVNN-\u0012\tX_$\fVZ].\u000eVQJ(\u0019\u0011M\u0015";
                    n = 12;
                    array = o;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "^N-\u0012\u001cKV";
                    n = 13;
                    array = o;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "VZ5\u000e\fMi.\f\u0014X[";
                    n = 14;
                    array = o;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "XA%\f\u0016PKo\u0017\u0017MJ/\nWXL5\u0017\u0016W\u0001\u00177<n";
                    n = 15;
                    array = o;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "Z].\u000e;@`4\n\tL[\u0012\u0017\u0003\\";
                    n = 16;
                    array = o;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "XA%\f\u0016PKo\u0017\u0017MJ/\nWXL5\u0017\u0016W\u0001\u00117:r";
                    n = 17;
                    array = o;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "JL \u0012\u001c";
                    n = 18;
                    array = o;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "_@3\t\u0018KK";
                    n = 19;
                    array = o;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "VZ5\u000e\fM";
                    n = 20;
                    array = o;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "JJ5!\u001eK@4\u000e&PL.\u0010";
                    n = 21;
                    array = o;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "KN6!\u001aVA5\u001f\u001aMp(\u001aY\u0004\u000f";
                    n = 22;
                    array = o;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u0004\u0012f";
                    n = 23;
                    array = o;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "OA%P\u0018WK3\u0011\u0010]\u0001\"\u000b\u000bJ@3P\u0010MJ,Q\tQ@5\u0011";
                    n = 24;
                    array = o;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "P\\\u001e\r\fIJ3!\tKF,\u001f\u000b@";
                    n = 25;
                    array = o;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "OA%P\u0018WK3\u0011\u0010]\u0001\"\u000b\u000bJ@3P\u0010MJ,Q\tQ@5\u0011";
                    n = 26;
                    array = o;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "\u0019n\u000f:Y";
                    n = 27;
                    array = o;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "KN6!\u001aVA5\u001f\u001aMp(\u001a";
                    n = 28;
                    array = o;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "fF%^D\u0019";
                    n = 29;
                    array = o;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "TF,\u001b\r@_$";
                    n = 30;
                    array = o;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "]N5\u001fH\f";
                    n = 31;
                    array = o;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "TF,\u001b\r@_$";
                    n = 32;
                    array = o;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "fF%";
                    n = 33;
                    array = o;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "^F%";
                    n = 34;
                    array = o;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "Z@/\n\u0018Z[\u001e\u000b\u000bP";
                    n = 35;
                    array = o;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "RJ8";
                    n = 36;
                    array = o;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "SF%";
                    n = 37;
                    array = o;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "TJ%\u0017\u0018OF$\tVJ[ \f\r";
                    n = 38;
                    array = o;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "TJ%\u0017\u0018OF$\tVK@5\u001f\r\\";
                    n = 39;
                    array = o;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "TJ%\u0017\u0018OF$\tVK@5\u001f\r\\\u00003\u001b\u001aKJ \n\u001cMG4\u0013\u001b";
                    n = 40;
                    array = o;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "v](\u001b\u0017MN5\u0017\u0016W";
                    n = 41;
                    array = o;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "TJ%\u0017\u0018OF$\tVK@5\u001f\r\\\u00003\u001b\u001aKJ \n\u001cMG4\u0013\u001b";
                    n = 42;
                    array = o;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "v](\u001b\u0017MN5\u0017\u0016W";
                    n = 43;
                    array = o;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "XC1\u0016\u0018";
                    n = 44;
                    array = o;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "XC1\u0016\u0018";
                    n = 45;
                    array = o;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    s = "OF%\u001b\u0016\u0016\u0005";
                    n = 46;
                    n2 = 47;
                    array = o;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    array = o;
                    s = "PB \u0019\u001c\u0016\u0005";
                    n = 47;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "XA%\f\u0016PKo\u0017\u0017MJ/\nWXL5\u0017\u0016W\u0001\u0012;7}";
                    n = 48;
                    array = o;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "XZ%\u0017\u0016\u0016\u0005";
                    n = 49;
                    array = o;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "XA%\f\u0016PKo\u0017\u0017MJ/\nW\\W5\f\u0018\u0017|\u0015,<xb";
                    n = 50;
                    array = o;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "TJ%\u0017\u0018OF$\tVJ[.\u000e";
                    n = 51;
                    array = o;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "SF%";
                    n = 52;
                    array = o;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "QN2!\u0018WF,\u001f\rP@/";
                    n = 53;
                    array = o;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "QJ(\u0019\u0011M";
                    n = 54;
                    array = o;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "NF%\n\u0011";
                    n = 55;
                    array = o;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    s = "RJ8";
                    n = 56;
                    n2 = 57;
                    array = o;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    array = o;
                    s = "VZ5\u000e\fMv";
                    n = 57;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "JL \u0012\u001cl_\b\u00187\\J%\u001b\u001d";
                    n = 58;
                    array = o;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "TJ%\u0017\u0018OF$\tV_@3\t\u0018KKn\u0017\u0017ON-\u0017\u001d\u0014B$\r\nXH$";
                    n = 59;
                    array = o;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    n2 = 61;
                    s = "fF%";
                    n = 60;
                    array = o;
                    continue;
                }
                case 60: {
                    array[n2] = intern;
                    n2 = 62;
                    s = "TJ%\u0017\u0018OF$\tVKN6!\u001aVA5\u001f\u001aMp(\u001aC";
                    n = 61;
                    array = o;
                    continue;
                }
                case 61: {
                    array[n2] = intern;
                    n2 = 63;
                    s = "VZ5\u000e\fM";
                    n = 62;
                    array = o;
                    continue;
                }
                case 62: {
                    array[n2] = intern;
                    n2 = 64;
                    s = "]N5\u001f";
                    n = 63;
                    array = o;
                    continue;
                }
                case 63: {
                    array[n2] = intern;
                    s = "VZ5\u000e\fMi.\f\u0014X[";
                    n = 64;
                    n2 = 65;
                    array = o;
                    continue;
                }
                case 64: {
                    array[n2] = intern;
                    n2 = 66;
                    array = o;
                    s = "]N5\u001f";
                    n = 65;
                    continue;
                }
                case 65: {
                    array[n2] = intern;
                    n2 = 67;
                    s = "TJ%\u0017\u0018OF$\tVXY \n\u0018Kp6\u0017\u001dMG{";
                    n = 66;
                    array = o;
                    continue;
                }
                case 66: {
                    array[n2] = intern;
                    n2 = 68;
                    s = "Z@/\n\u0018Z[\u001e\u0017\u001d\u0004\u0010";
                    n = 67;
                    array = o;
                    continue;
                }
                case 67: {
                    array[n2] = intern;
                    n2 = 69;
                    s = "Z@/\n\u0018Z[";
                    n = 68;
                    array = o;
                    continue;
                }
                case 68: {
                    array[n2] = intern;
                    n2 = 70;
                    s = "Z@/\n\u0018Z[";
                    n = 69;
                    array = o;
                    continue;
                }
                case 69: {
                    array[n2] = intern;
                    n2 = 71;
                    s = "TJ%\u0017\u0018OF$\tV_@3\t\u0018KKn\u0018\u0018PC$\u001a";
                    n = 70;
                    array = o;
                    continue;
                }
                case 70: {
                    array[n2] = intern;
                    n2 = 72;
                    s = "Z].\u000e;@`4\n\tL[\u0012\u0017\u0003\\";
                    n = 71;
                    array = o;
                    continue;
                }
                case 71: {
                    array[n2] = intern;
                    n2 = 73;
                    s = "VZ5\u000e\fMw";
                    n = 72;
                    array = o;
                    continue;
                }
                case 72: {
                    array[n2] = intern;
                    n2 = 74;
                    s = "JL \u0012\u001c";
                    n = 73;
                    array = o;
                    continue;
                }
                case 73: {
                    array[n2] = intern;
                    n2 = 75;
                    s = "KJ5\u000b\u000bW\u0002%\u001f\rX";
                    n = 74;
                    array = o;
                    continue;
                }
                case 74: {
                    array[n2] = intern;
                    n2 = 76;
                    s = "\u0019Sa";
                    n = 75;
                    array = o;
                    continue;
                }
                case 75: {
                    array[n2] = intern;
                    n2 = 77;
                    s = "IG.\n\u0016";
                    n = 76;
                    array = o;
                    continue;
                }
                case 76: {
                    array[n2] = intern;
                    n2 = 78;
                    s = "TJ%\u0017\u0018OF$\tV]J2\n\u000bVV";
                    n = 77;
                    array = o;
                    continue;
                }
                case 77: {
                    array[n2] = intern;
                    n2 = 79;
                    s = "TJ%\u0017\u0018OF$\tVZ]$\u001f\r\\";
                    n = 78;
                    array = o;
                    continue;
                }
                case 78: {
                    array[n2] = intern;
                    n2 = 80;
                    s = "NF%\n\u0011";
                    n = 79;
                    array = o;
                    continue;
                }
                case 79: {
                    array[n2] = intern;
                    n2 = 81;
                    s = "TJ%\u0017\u0018OF$\tVOF$\tYTJ2\r\u0018^J{";
                    n = 80;
                    array = o;
                    continue;
                }
                case 80: {
                    array[n2] = intern;
                    n2 = 82;
                    s = "\u0019B$D";
                    n = 81;
                    array = o;
                    continue;
                }
                case 81: {
                    array[n2] = intern;
                    n2 = 83;
                    s = "RJ8";
                    n = 82;
                    array = o;
                    continue;
                }
                case 82: {
                    array[n2] = intern;
                    n2 = 84;
                    s = "SF%";
                    n = 83;
                    array = o;
                    continue;
                }
                case 83: {
                    array[n2] = intern;
                    n2 = 85;
                    s = "\u0019F%D";
                    n = 84;
                    array = o;
                    continue;
                }
                case 84: {
                    array[n2] = intern;
                    n2 = 86;
                    s = "TJ%\u0017\u0018OF$\tV_@4\u0010\u001d\u0014D$\u0007Y";
                    n = 85;
                    array = o;
                    continue;
                }
                case 85: {
                    array[n2] = intern;
                    n2 = 87;
                    s = "Z@/\n\u0018Z[\u001e\u000b\u000bP";
                    n = 86;
                    array = o;
                    continue;
                }
                case 86: {
                    array[n2] = intern;
                    n2 = 88;
                    s = "QJ(\u0019\u0011M";
                    n = 87;
                    array = o;
                    continue;
                }
                case 87: {
                    array[n2] = intern;
                    n2 = 89;
                    s = "QN2!\u0018WF,\u001f\rP@/";
                    n = 88;
                    array = o;
                    continue;
                }
                case 88: {
                    array[n2] = intern;
                    n2 = 90;
                    s = "TJ%\u0017\u0018OF$\tVVA\"\f\u001cX[$Q\u0016VBn\u0016\u001cX_a\r\u0010CJ{";
                    n = 89;
                    array = o;
                    continue;
                }
                case 89: {
                    array[n2] = intern;
                    n2 = 91;
                    s = "^F%";
                    n = 90;
                    array = o;
                    continue;
                }
                case 90: {
                    array[n2] = intern;
                    n2 = 92;
                    s = "\u0019D\u0003";
                    n = 91;
                    array = o;
                    continue;
                }
                case 91: {
                    array[n2] = intern;
                    n2 = 93;
                    s = "TJ%\u0017\u0018OF$\tVXZ%\u0017\u0016\u0019K4\f\u0018MF.\u0010C";
                    n = 92;
                    array = o;
                    continue;
                }
                case 92: {
                    array[n2] = intern;
                    n2 = 94;
                    s = "TJ%\u0017\u0018OF$\tVI]$\u000e\u0018KJ \u000b\u001dP@1\u0012\u0018@M \u001d\u0012\u0016";
                    n = 93;
                    array = o;
                    continue;
                }
                case 93: {
                    break Label_2407;
                }
            }
        }
        array[n2] = intern;
        O = o;
    }
    
    public MediaView() {
        this.m = 0;
        this.w = true;
        this.r = 1280;
        this.I = new pz(this);
        this.t = (View$OnClickListener)new to(this);
    }
    
    static float a(final MediaView mediaView, final float b) {
        return mediaView.B = b;
    }
    
    static int a(final MediaView mediaView, final int m) {
        return mediaView.m = m;
    }
    
    public static Intent a(final bi bi, final String s, final Context context) {
        final Intent intent = new Intent(context, (Class)MediaView.class);
        intent.putExtra(MediaView.O[38], s);
        intent.putExtra(MediaView.O[37], (Parcelable)new d6(bi.a));
        return intent;
    }
    
    public static Intent a(final bi bi, final String s, final Context context, final View view) {
        final Intent intent = new Intent(context, (Class)MediaView.class);
        intent.putExtra(MediaView.O[53], s);
        intent.putExtra(MediaView.O[57], (Parcelable)new d6(bi.a));
        final int[] array = new int[2];
        view.getLocationOnScreen(array);
        intent.putExtra("x", array[0]);
        intent.putExtra("y", array[1]);
        intent.putExtra(MediaView.O[56], view.getWidth());
        intent.putExtra(MediaView.O[55], view.getHeight());
        intent.putExtra(MediaView.O[54], true);
        return intent;
    }
    
    static PhotoView a(final MediaView mediaView, final bi bi) {
        return mediaView.b(bi);
    }
    
    static ArrayList a(final MediaView mediaView, final ArrayList n) {
        return mediaView.N = n;
    }
    
    public static void a(final ContentResolver contentResolver, final byte[] array, final long n) {
        final ContentValues contentValues = new ContentValues();
        final Cursor query = contentResolver.query(ContactsContract$Data.CONTENT_URI, (String[])null, MediaView.O[23] + n + MediaView.O[28] + MediaView.O[33] + MediaView.O[24] + MediaView.O[25] + "'", (String[])null, (String)null);
        final int columnIndexOrThrow = query.getColumnIndexOrThrow(MediaView.O[34]);
        int int1;
        if (query.moveToFirst()) {
            int1 = query.getInt(columnIndexOrThrow);
        }
        else {
            int1 = -1;
        }
        query.close();
        contentValues.put(MediaView.O[29], n);
        contentValues.put(MediaView.O[26], 1);
        contentValues.put(MediaView.O[32], array);
        contentValues.put(MediaView.O[31], MediaView.O[27]);
        if (int1 >= 0) {
            contentResolver.update(ContactsContract$Data.CONTENT_URI, contentValues, MediaView.O[30] + int1, (String[])null);
            if (!App.I) {
                return;
            }
        }
        contentResolver.insert(ContactsContract$Data.CONTENT_URI, contentValues);
    }
    
    private void a(final Uri uri, final int n, final int n2, final int n3) {
        Label_0031: {
            if (uri == null) {
                com.whatsapp.wallpaper.h.a((Context)this, true, n, null, n2, n3);
                if (!App.I) {
                    break Label_0031;
                }
            }
            com.whatsapp.wallpaper.h.a((Context)this, false, -1, uri, 0, 0);
        }
        br.a((Context)this, uri);
    }
    
    static void a(final MediaView mediaView) {
        mediaView.f();
    }
    
    static void a(final MediaView mediaView, final bi bi, final int n) {
        mediaView.a(bi, n);
    }
    
    static void a(final MediaView mediaView, final boolean b) {
        mediaView.b(b);
    }
    
    private void a(final bi p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //    10: bipush          94
        //    12: aaload         
        //    13: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    16: aload_1        
        //    17: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    20: getfield        com/whatsapp/protocol/c6.c:Ljava/lang/String;
        //    23: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    26: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    29: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    32: aload_0        
        //    33: getfield        com/whatsapp/MediaView.l:Lcom/whatsapp/MediaView$MediaViewPager;
        //    36: aload_1        
        //    37: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    40: invokevirtual   com/whatsapp/MediaView$MediaViewPager.findViewWithTag:(Ljava/lang/Object;)Landroid/view/View;
        //    43: astore_2       
        //    44: aload_0        
        //    45: aload_2        
        //    46: ldc_w           2131755655
        //    49: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    52: checkcast       Landroid/widget/TextView;
        //    55: putfield        com/whatsapp/MediaView.v:Landroid/widget/TextView;
        //    58: aload_0        
        //    59: aload_2        
        //    60: ldc_w           2131755470
        //    63: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    66: checkcast       Lcom/whatsapp/VoiceNoteSeekBar;
        //    69: putfield        com/whatsapp/MediaView.C:Lcom/whatsapp/VoiceNoteSeekBar;
        //    72: aload_0        
        //    73: getfield        com/whatsapp/MediaView.C:Lcom/whatsapp/VoiceNoteSeekBar;
        //    76: new             Lcom/whatsapp/a96;
        //    79: dup            
        //    80: aload_0        
        //    81: aconst_null    
        //    82: invokespecial   com/whatsapp/a96.<init>:(Lcom/whatsapp/MediaView;Lcom/whatsapp/pz;)V
        //    85: invokevirtual   com/whatsapp/VoiceNoteSeekBar.setOnSeekBarChangeListener:(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V
        //    88: aload_0        
        //    89: aload_2        
        //    90: ldc_w           2131755654
        //    93: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    96: checkcast       Landroid/widget/ImageButton;
        //    99: putfield        com/whatsapp/MediaView.q:Landroid/widget/ImageButton;
        //   102: new             Lcom/whatsapp/ah3;
        //   105: dup            
        //   106: aload_0        
        //   107: aload_0        
        //   108: getfield        com/whatsapp/MediaView.C:Lcom/whatsapp/VoiceNoteSeekBar;
        //   111: aload_0        
        //   112: getfield        com/whatsapp/MediaView.q:Landroid/widget/ImageButton;
        //   115: invokespecial   com/whatsapp/ah3.<init>:(Lcom/whatsapp/MediaView;Lcom/whatsapp/VoiceNoteSeekBar;Landroid/widget/ImageButton;)V
        //   118: astore_3       
        //   119: aload_0        
        //   120: getfield        com/whatsapp/MediaView.q:Landroid/widget/ImageButton;
        //   123: aload_3        
        //   124: invokevirtual   android/widget/ImageButton.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   127: aload_2        
        //   128: ldc_w           2131755656
        //   131: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   134: astore          4
        //   136: aload_0        
        //   137: getfield        com/whatsapp/MediaView.w:Z
        //   140: ifeq            159
        //   143: aload           4
        //   145: aload_3        
        //   146: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   149: getstatic       com/whatsapp/App.I:Z
        //   152: istore          11
        //   154: iload           11
        //   156: ifeq            173
        //   159: aload           4
        //   161: new             Lcom/whatsapp/alv;
        //   164: dup            
        //   165: aload_0        
        //   166: aload_3        
        //   167: invokespecial   com/whatsapp/alv.<init>:(Lcom/whatsapp/MediaView;Lcom/whatsapp/ah3;)V
        //   170: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   173: aload_0        
        //   174: getfield        com/whatsapp/MediaView.n:Lcom/whatsapp/util/ao;
        //   177: ifnull          220
        //   180: aload_0        
        //   181: getfield        com/whatsapp/MediaView.n:Lcom/whatsapp/util/ao;
        //   184: invokevirtual   com/whatsapp/util/ao.f:()Z
        //   187: istore          10
        //   189: iload           10
        //   191: ifeq            201
        //   194: aload_0        
        //   195: getfield        com/whatsapp/MediaView.n:Lcom/whatsapp/util/ao;
        //   198: invokevirtual   com/whatsapp/util/ao.c:()V
        //   201: aload_0        
        //   202: getfield        com/whatsapp/MediaView.n:Lcom/whatsapp/util/ao;
        //   205: invokevirtual   com/whatsapp/util/ao.b:()V
        //   208: aload_0        
        //   209: getfield        com/whatsapp/MediaView.n:Lcom/whatsapp/util/ao;
        //   212: invokevirtual   com/whatsapp/util/ao.d:()V
        //   215: aload_0        
        //   216: aconst_null    
        //   217: putfield        com/whatsapp/MediaView.n:Lcom/whatsapp/util/ao;
        //   220: aload_0        
        //   221: aload_1        
        //   222: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   225: checkcast       Lcom/whatsapp/MediaData;
        //   228: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   231: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   234: invokestatic    com/whatsapp/util/ao.a:(Ljava/lang/String;)Lcom/whatsapp/util/ao;
        //   237: putfield        com/whatsapp/MediaView.n:Lcom/whatsapp/util/ao;
        //   240: aload_0        
        //   241: getfield        com/whatsapp/MediaView.n:Lcom/whatsapp/util/ao;
        //   244: new             Lcom/whatsapp/ar5;
        //   247: dup            
        //   248: aload_0        
        //   249: invokespecial   com/whatsapp/ar5.<init>:(Lcom/whatsapp/MediaView;)V
        //   252: invokevirtual   com/whatsapp/util/ao.a:(Landroid/media/MediaPlayer$OnErrorListener;)V
        //   255: aload_0        
        //   256: getfield        com/whatsapp/MediaView.n:Lcom/whatsapp/util/ao;
        //   259: invokevirtual   com/whatsapp/util/ao.g:()V
        //   262: new             Ljava/lang/StringBuilder;
        //   265: dup            
        //   266: invokespecial   java/lang/StringBuilder.<init>:()V
        //   269: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   272: bipush          93
        //   274: aaload         
        //   275: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   278: aload_0        
        //   279: getfield        com/whatsapp/MediaView.n:Lcom/whatsapp/util/ao;
        //   282: invokevirtual   com/whatsapp/util/ao.e:()I
        //   285: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   288: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   291: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   294: aload_0        
        //   295: iconst_5       
        //   296: putfield        com/whatsapp/MediaView.m:I
        //   299: aload_0        
        //   300: getfield        com/whatsapp/MediaView.v:Landroid/widget/TextView;
        //   303: aload_0        
        //   304: getfield        com/whatsapp/MediaView.n:Lcom/whatsapp/util/ao;
        //   307: invokevirtual   com/whatsapp/util/ao.e:()I
        //   310: sipush          1000
        //   313: idiv           
        //   314: i2l            
        //   315: invokestatic    android/text/format/DateUtils.formatElapsedTime:(J)Ljava/lang/String;
        //   318: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   321: aload_0        
        //   322: getfield        com/whatsapp/MediaView.C:Lcom/whatsapp/VoiceNoteSeekBar;
        //   325: aload_0        
        //   326: getfield        com/whatsapp/MediaView.n:Lcom/whatsapp/util/ao;
        //   329: invokevirtual   com/whatsapp/util/ao.e:()I
        //   332: invokevirtual   com/whatsapp/VoiceNoteSeekBar.setMax:(I)V
        //   335: aload_0        
        //   336: getfield        com/whatsapp/MediaView.C:Lcom/whatsapp/VoiceNoteSeekBar;
        //   339: iconst_0       
        //   340: invokevirtual   com/whatsapp/VoiceNoteSeekBar.setProgress:(I)V
        //   343: aload_0        
        //   344: getfield        com/whatsapp/MediaView.q:Landroid/widget/ImageButton;
        //   347: new             Lcom/whatsapp/util/m;
        //   350: dup            
        //   351: aload_0        
        //   352: invokevirtual   com/whatsapp/MediaView.getResources:()Landroid/content/res/Resources;
        //   355: ldc_w           2130838954
        //   358: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   361: invokespecial   com/whatsapp/util/m.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   364: invokevirtual   android/widget/ImageButton.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   367: return         
        //   368: astore          5
        //   370: aload           5
        //   372: athrow         
        //   373: astore          6
        //   375: aload           6
        //   377: athrow         
        //   378: astore          7
        //   380: aload           7
        //   382: athrow         
        //   383: astore          8
        //   385: aload           8
        //   387: athrow         
        //   388: astore          9
        //   390: aload           9
        //   392: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   395: aload_0        
        //   396: ldc_w           2131231134
        //   399: invokevirtual   com/whatsapp/MediaView.a:(I)V
        //   402: goto            335
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  136    154    368    373    Ljava/io/IOException;
        //  159    173    373    378    Ljava/io/IOException;
        //  173    189    378    383    Ljava/io/IOException;
        //  194    201    383    388    Ljava/io/IOException;
        //  220    335    388    405    Ljava/io/IOException;
        //  370    373    373    378    Ljava/io/IOException;
        //  380    383    383    388    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 184, Size: 184
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
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
    
    private void a(final bi bi, final int n) {
        final boolean i = App.I;
        final String s = MediaView.O[4];
        up.q();
        final MediaData mediaData = (MediaData)bi.N;
        if (bi.I == 3) {
            final Intent intent = new Intent(MediaView.O[5]);
            intent.setDataAndType(Uri.fromFile(mediaData.file), MediaView.O[1]);
            if (Build.MANUFACTURER.startsWith(MediaView.O[2])) {
                final List queryIntentActivities = App.aq.getPackageManager().queryIntentActivities(intent, 0);
                if (queryIntentActivities != null) {
                    for (final ResolveInfo resolveInfo : queryIntentActivities) {
                        Log.i(resolveInfo.activityInfo.packageName + MediaView.O[0] + resolveInfo.activityInfo.name);
                        if (resolveInfo.activityInfo.name.equals(MediaView.O[6])) {
                            intent.setClassName(MediaView.O[3], MediaView.O[7]);
                        }
                        if (i) {
                            break;
                        }
                    }
                }
            }
            App.a((Context)this, intent);
            if (!i) {
                return;
            }
        }
        if (bi.I == 2) {
            this.a(bi);
            if (this.n != null) {
                this.m = 4;
                this.G.sendEmptyMessage(0);
                this.q.setImageResource(2130838953);
                App.e((Context)this);
                this.n.h();
                if (n > 0) {
                    this.n.a(n);
                    this.C.setProgress(this.n.i());
                }
            }
        }
    }
    
    private void a(final Runnable runnable) {
        if (!c()) {
            return;
        }
        final MediaView$MediaViewPager l = this.l;
        final bi g = this.g(this.l.getCurrentItem());
        if (this.getResources().getConfiguration().orientation != this.o || g == null || !g.a.equals(this.M)) {
            ((View)l).setPivotX((float)(((View)l).getWidth() / 2));
            ((View)l).setPivotY((float)(((View)l).getHeight() / 2));
            this.z = 0;
            this.J = 0;
        }
        ((View)l).animate().setDuration(240L).scaleX(this.s).scaleY(this.B).translationX((float)this.z).translationY((float)this.J).alpha(0.0f).setListener((Animator$AnimatorListener)new a0i(this, runnable));
        final ObjectAnimator ofInt = ObjectAnimator.ofInt((Object)this.k, MediaView.O[45], new int[] { 255, 0 });
        ofInt.setDuration(240L);
        ofInt.setInterpolator((TimeInterpolator)new DecelerateInterpolator());
        ofInt.start();
    }
    
    static float b(final MediaView mediaView, final float s) {
        return mediaView.s = s;
    }
    
    static int b(final MediaView mediaView, final int h) {
        return mediaView.H = h;
    }
    
    private PhotoView b(final bi bi) {
        final View viewWithTag = this.l.findViewWithTag((Object)bi.a);
        if (viewWithTag != null && viewWithTag instanceof ViewGroup) {
            final View child = ((ViewGroup)viewWithTag).getChildAt(0);
            if (child != null && child instanceof PhotoView) {
                return (PhotoView)child;
            }
        }
        return null;
    }
    
    static VoiceNoteSeekBar b(final MediaView mediaView) {
        return mediaView.C;
    }
    
    static void b(final MediaView mediaView, final bi bi) {
        mediaView.a(bi);
    }
    
    private void b(final boolean w) {
        final boolean i = App.I;
        if (!this.p && this.w != w) {
            this.w = w;
            int n;
            for (int childCount = this.l.getChildCount(), j = 0; j < childCount; j = n) {
                final View viewById = this.l.getChildAt(j).findViewById(2131755421);
                AlphaAnimation animation;
                if (w) {
                    animation = new AlphaAnimation(0.0f, 1.0f);
                    viewById.setVisibility(0);
                }
                else {
                    animation = new AlphaAnimation(1.0f, 0.0f);
                    viewById.setVisibility(4);
                }
                ((Animation)animation).setDuration(400L);
                viewById.setAnimation((Animation)animation);
                n = j + 1;
                if (i) {
                    break;
                }
            }
            Label_0127: {
                if (w) {
                    this.getSupportActionBar().show();
                    if (!i) {
                        break Label_0127;
                    }
                }
                this.getSupportActionBar().hide();
            }
            if (Build$VERSION.SDK_INT >= 11) {
                int r = this.r;
                if (!w) {
                    r |= 0x5;
                }
                this.l.setSystemUiVisibility(r);
            }
        }
    }
    
    static boolean b(final MediaView mediaView, final boolean p2) {
        return mediaView.p = p2;
    }
    
    static View c(final MediaView mediaView, final bi bi) {
        return mediaView.c(bi);
    }
    
    private View c(final bi bi) {
        final boolean i = App.I;
        ViewGroup viewGroup = null;
        Label_0279: {
            if (bi.I == 2) {
                viewGroup = (ViewGroup)this.getLayoutInflater().inflate(2130903183, (ViewGroup)null);
                if (!i) {
                    break Label_0279;
                }
            }
            viewGroup = (ViewGroup)this.getLayoutInflater().inflate(2130903185, (ViewGroup)null);
            final MediaView$14 mediaView$14 = new MediaView$14(this, (Context)this);
            viewGroup.addView((View)mediaView$14, 0);
            mediaView$14.setInitialFitTolerance(0.2f);
            mediaView$14.a(bi.I == 1);
            mediaView$14.setIsVideo(bi.I == 3);
            final MediaData mediaData = (MediaData)bi.N;
            if (!bi.a.b && !mediaData.transferred) {
                App.a(this, this.getString(f(bi.I)));
            }
            final Bitmap a = com.whatsapp.util.b.a(bi);
            mediaView$14.a(a);
            if (this.K != null) {
                this.K.a(bi, mediaView$14);
            }
            if (bi.I == 1) {
                if (a == null) {
                    mediaView$14.a(((BitmapDrawable)this.getResources().getDrawable(2130837584)).getBitmap());
                }
                mediaView$14.setOnClickListener((View$OnClickListener)new q5(this));
                if (!i) {
                    break Label_0279;
                }
            }
            if (bi.I == 3) {
                if (a == null) {
                    mediaView$14.a(((BitmapDrawable)this.getResources().getDrawable(2130837587)).getBitmap());
                }
                mediaView$14.setOnClickListener((View$OnClickListener)new a0(this, bi));
            }
        }
        final ViewGroup viewGroup2 = viewGroup;
        final TextView textView = (TextView)viewGroup2.findViewById(2131755486);
        vc.a(textView);
        Label_0348: {
            if (TextUtils.isEmpty((CharSequence)bi.M)) {
                textView.setVisibility(8);
                if (!i) {
                    break Label_0348;
                }
            }
            textView.setText(cq.b(bi.M, this.getBaseContext(), (Paint)textView.getPaint()));
            textView.setVisibility(0);
        }
        final TextView textView2 = (TextView)viewGroup2.findViewById(2131755657);
        Label_0529: {
            if (bi.a.b) {
                textView2.setText((CharSequence)(this.getString(2131231980) + alm.a() + " " + (Object)b6.b((Context)this, App.i(bi))));
                if (!i) {
                    break Label_0529;
                }
            }
            String s = null;
            Label_0479: {
                if (adc.b(bi.a.a) && bi.t != null) {
                    s = App.S.e(bi.t).a((Context)this);
                    if (!i) {
                        break Label_0479;
                    }
                }
                s = App.S.e(this.D).a((Context)this);
            }
            textView2.setText((CharSequence)new StringBuilder().append((Object)cq.c(s, this.getBaseContext())).append(alm.a()).append(" ").append((Object)b6.b((Context)this, App.i(bi))).toString());
        }
        final TextView textView3 = (TextView)viewGroup2.findViewById(2131755658);
        Label_0600: {
            if (adc.b(this.D)) {
                textView3.setVisibility(0);
                textView3.setText(cq.b(App.S.e(this.D).a((Context)this), this.getBaseContext(), (Paint)textView3.getPaint()));
                if (!i) {
                    break Label_0600;
                }
            }
            textView3.setVisibility(8);
        }
        final View viewById = viewGroup2.findViewById(2131755421);
        final boolean w = this.w;
        int visibility = 0;
        if (!w) {
            visibility = 8;
        }
        viewById.setVisibility(visibility);
        return (View)viewGroup2;
    }
    
    static MediaView$MediaViewPager c(final MediaView mediaView) {
        return mediaView.l;
    }
    
    static bi c(final MediaView mediaView, final int n) {
        return mediaView.g(n);
    }
    
    private void c(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: bipush          8
        //     2: istore_2       
        //     3: iconst_1       
        //     4: istore_3       
        //     5: getstatic       com/whatsapp/App.I:Z
        //     8: istore          4
        //    10: aload_0        
        //    11: aload_0        
        //    12: getfield        com/whatsapp/MediaView.H:I
        //    15: invokespecial   com/whatsapp/MediaView.g:(I)Lcom/whatsapp/protocol/bi;
        //    18: astore          6
        //    20: aload           6
        //    22: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //    25: checkcast       Lcom/whatsapp/MediaData;
        //    28: astore          7
        //    30: new             Landroid/media/ExifInterface;
        //    33: dup            
        //    34: aload           7
        //    36: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //    39: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    42: invokespecial   android/media/ExifInterface.<init>:(Ljava/lang/String;)V
        //    45: astore          8
        //    47: aload           8
        //    49: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //    52: bipush          42
        //    54: aaload         
        //    55: iconst_1       
        //    56: invokevirtual   android/media/ExifInterface.getAttributeInt:(Ljava/lang/String;I)I
        //    59: istore          9
        //    61: iload           9
        //    63: tableswitch {
        //                0: 341
        //                1: 341
        //                2: 112
        //                3: 366
        //                4: 112
        //                5: 112
        //                6: 354
        //                7: 112
        //                8: 375
        //          default: 112
        //        }
        //   112: aload           8
        //   114: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   117: bipush          44
        //   119: aaload         
        //   120: iload           9
        //   122: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   125: invokevirtual   android/media/ExifInterface.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   128: aload           8
        //   130: invokevirtual   android/media/ExifInterface.saveAttributes:()V
        //   133: aload           7
        //   135: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   138: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //   141: bipush          100
        //   143: bipush          100
        //   145: invokestatic    com/whatsapp/util/br.a:(Landroid/net/Uri;II)Landroid/graphics/Bitmap;
        //   148: astore          15
        //   150: new             Ljava/io/ByteArrayOutputStream;
        //   153: dup            
        //   154: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   157: astore          16
        //   159: aload           15
        //   161: getstatic       android/graphics/Bitmap$CompressFormat.JPEG:Landroid/graphics/Bitmap$CompressFormat;
        //   164: bipush          80
        //   166: aload           16
        //   168: invokevirtual   android/graphics/Bitmap.compress:(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
        //   171: pop            
        //   172: aload           6
        //   174: aload           16
        //   176: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   179: invokevirtual   com/whatsapp/protocol/bi.a:([B)V
        //   182: aload           16
        //   184: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   187: aload           15
        //   189: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   192: aload           7
        //   194: aload           7
        //   196: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   199: invokevirtual   java/io/File.length:()J
        //   202: putfield        com/whatsapp/MediaData.fileSize:J
        //   205: aload           7
        //   207: iconst_0       
        //   208: putfield        com/whatsapp/MediaData.faceX:I
        //   211: aload           7
        //   213: iconst_0       
        //   214: putfield        com/whatsapp/MediaData.faceY:I
        //   217: aload           6
        //   219: invokestatic    com/whatsapp/util/b.c:(Lcom/whatsapp/protocol/bi;)V
        //   222: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   225: aload           6
        //   227: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/protocol/bi;)V
        //   230: aload_0        
        //   231: aload           6
        //   233: invokespecial   com/whatsapp/MediaView.b:(Lcom/whatsapp/protocol/bi;)Lcom/whatsapp/PhotoView;
        //   236: astore          11
        //   238: aload           11
        //   240: ifnull          340
        //   243: iload_1        
        //   244: ifeq            257
        //   247: aload           11
        //   249: invokevirtual   com/whatsapp/PhotoView.f:()V
        //   252: iload           4
        //   254: ifeq            262
        //   257: aload           11
        //   259: invokevirtual   com/whatsapp/PhotoView.e:()V
        //   262: aload           11
        //   264: invokevirtual   com/whatsapp/PhotoView.requestLayout:()V
        //   267: aload           11
        //   269: invokevirtual   com/whatsapp/PhotoView.invalidate:()V
        //   272: return         
        //   273: astore          14
        //   275: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   278: bipush          43
        //   280: aaload         
        //   281: aload           14
        //   283: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   286: goto            192
        //   289: astore          5
        //   291: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   294: bipush          40
        //   296: aaload         
        //   297: aload           5
        //   299: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   302: return         
        //   303: astore          10
        //   305: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   308: bipush          41
        //   310: aaload         
        //   311: aload           10
        //   313: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   316: goto            192
        //   319: astore          13
        //   321: aload           13
        //   323: athrow         
        //   324: astore          12
        //   326: aload           12
        //   328: athrow         
        //   329: astore          18
        //   331: goto            187
        //   334: iload_2        
        //   335: istore          9
        //   337: goto            112
        //   340: return         
        //   341: iload_1        
        //   342: ifeq            385
        //   345: bipush          6
        //   347: istore          9
        //   349: iload           4
        //   351: ifeq            112
        //   354: iload_1        
        //   355: ifeq            391
        //   358: iconst_3       
        //   359: istore          9
        //   361: iload           4
        //   363: ifeq            112
        //   366: iload_1        
        //   367: ifeq            397
        //   370: iload           4
        //   372: ifeq            334
        //   375: iload_1        
        //   376: ifeq            403
        //   379: iload_3        
        //   380: istore          9
        //   382: goto            112
        //   385: iload_2        
        //   386: istore          9
        //   388: goto            349
        //   391: iload_3        
        //   392: istore          9
        //   394: goto            361
        //   397: bipush          6
        //   399: istore_2       
        //   400: goto            370
        //   403: iconst_3       
        //   404: istore_3       
        //   405: goto            379
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  10     61     289    303    Ljava/io/IOException;
        //  112    133    289    303    Ljava/io/IOException;
        //  133    182    273    289    Ljava/lang/OutOfMemoryError;
        //  133    182    303    319    Lcom/whatsapp/util/av;
        //  133    182    289    303    Ljava/io/IOException;
        //  182    187    329    334    Ljava/io/IOException;
        //  182    187    273    289    Ljava/lang/OutOfMemoryError;
        //  182    187    303    319    Lcom/whatsapp/util/av;
        //  187    192    273    289    Ljava/lang/OutOfMemoryError;
        //  187    192    303    319    Lcom/whatsapp/util/av;
        //  187    192    289    303    Ljava/io/IOException;
        //  192    238    289    303    Ljava/io/IOException;
        //  247    252    319    324    Ljava/io/IOException;
        //  257    262    324    329    Ljava/io/IOException;
        //  262    272    289    303    Ljava/io/IOException;
        //  275    286    289    303    Ljava/io/IOException;
        //  305    316    289    303    Ljava/io/IOException;
        //  321    324    324    329    Ljava/io/IOException;
        //  326    329    289    303    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0187:
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
    
    public static boolean c() {
        return Build$VERSION.SDK_INT >= 12;
    }
    
    static int d(final MediaView mediaView, final int j) {
        return mediaView.J = j;
    }
    
    static ArrayList d(final MediaView mediaView) {
        return mediaView.N;
    }
    
    private void d(final int h) {
        final bi g = this.g(h);
        Label_0057: {
            if (g != null && g.I == 2) {
                if (this.E != null && this.E.a.equals(g.a)) {
                    break Label_0057;
                }
                this.a(g);
                if (!App.I) {
                    break Label_0057;
                }
            }
            this.h();
        }
        if (this.H != h && this.E != null && this.E.a != null) {
            final PhotoView b = this.b(g);
            if (b != null) {
                b.b();
            }
        }
        this.E = g;
        this.h(this.H = h);
    }
    
    static int e(final MediaView mediaView, final int z) {
        return mediaView.z = z;
    }
    
    static TextView e(final MediaView mediaView) {
        return mediaView.v;
    }
    
    private void e(final int n) {
        final bi g = this.g(this.H);
        if (g == null) {
            return;
        }
        this.a(g, n);
    }
    
    public static int f(final int n) {
        switch (n) {
            default: {
                return 2131231145;
            }
            case 2: {
                return 2131231135;
            }
            case 1: {
                return 2131231140;
            }
            case 3: {
                return 2131231147;
            }
        }
    }
    
    static c6 f(final MediaView mediaView) {
        return mediaView.M;
    }
    
    private void f() {
        if (!c()) {
            return;
        }
        this.o = this.getResources().getConfiguration().orientation;
        final ObjectAnimator ofInt = ObjectAnimator.ofInt((Object)this.k, MediaView.O[46], new int[] { 0, 255 });
        ofInt.setDuration(240L);
        ofInt.setInterpolator((TimeInterpolator)new AccelerateInterpolator());
        ofInt.start();
        final MediaView$MediaViewPager l = this.l;
        ((View)l).setPivotX(0.0f);
        ((View)l).setPivotY(0.0f);
        ((View)l).setScaleX(this.s);
        ((View)l).setScaleY(this.B);
        ((View)l).setTranslationX((float)this.z);
        ((View)l).setTranslationY((float)this.J);
        final View viewWithTag = this.l.findViewWithTag((Object)this.y.a);
        if (viewWithTag != null) {
            viewWithTag.setAlpha(0.0f);
            viewWithTag.animate().setDuration(120L).alpha(1.0f).setInterpolator((TimeInterpolator)new DecelerateInterpolator(2.0f));
        }
        ((View)l).animate().setDuration(240L).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setListener((Animator$AnimatorListener)new a2w(this));
    }
    
    static void f(final MediaView mediaView, final int n) {
        mediaView.i(n);
    }
    
    private bi g(final int n) {
        final int size = this.N.size();
        bi bi = null;
        if (n < size) {
            bi = this.N.get(-1 + (size - n));
        }
        return bi;
    }
    
    static vn g(final MediaView mediaView) {
        return mediaView.A;
    }
    
    private void g() {
        final boolean i = App.I;
        final bi g = this.g(this.H);
        final Intent intent = new Intent(MediaView.O[49]);
        Label_0124: {
            switch (g.I) {
                case 2: {
                    intent.setType(MediaView.O[50]);
                    if (i) {
                        break Label_0124;
                    }
                    break;
                }
                case 3: {
                    intent.setType(MediaView.O[47]);
                    if (i) {
                        break Label_0124;
                    }
                    break;
                }
                case 1: {
                    intent.setType(MediaView.O[48]);
                    break;
                }
            }
        }
        intent.putExtra(MediaView.O[51], (Parcelable)Uri.fromFile(((MediaData)g.N).file));
        this.startActivity(Intent.createChooser(intent, (CharSequence)null));
    }
    
    static void g(final MediaView mediaView, final int n) {
        mediaView.d(n);
    }
    
    static float h(final MediaView mediaView) {
        return mediaView.B;
    }
    
    static int h(final MediaView mediaView, final int l) {
        return mediaView.L = l;
    }
    
    private void h() {
        if (this.n != null) {
            if (this.n.f()) {
                this.n.c();
            }
            this.n.b();
            this.n.d();
            this.n = null;
            this.m = 0;
        }
        if (this.C != null) {
            this.C.setProgress(0);
        }
        if (this.q != null) {
            this.q.setImageDrawable((Drawable)new m(this.getResources().getDrawable(2130838954)));
        }
        if (this.v != null) {
            this.v.setText((CharSequence)DateUtils.formatElapsedTime(0L));
        }
    }
    
    private void h(final int n) {
        if (this.g(n) == null) {
            return;
        }
        this.getSupportActionBar().setTitle(this.getString(2131231299, new Object[] { n + 1, this.N.size() }));
        this.invalidateOptionsMenu();
    }
    
    static int i(final MediaView mediaView) {
        return mediaView.H;
    }
    
    private void i(final int n) {
        this.h();
        if (n == 1) {
            if (this.H <= 0) {
                return;
            }
            --this.H;
            this.l.setCurrentItem(this.H);
            if (!App.I) {
                return;
            }
        }
        if (this.H < -1 + this.N.size()) {
            ++this.H;
            this.l.setCurrentItem(this.H);
        }
    }
    
    static void i(final MediaView mediaView, final int n) {
        mediaView.e(n);
    }
    
    static String j(final MediaView mediaView) {
        return mediaView.D;
    }
    
    static boolean k(final MediaView mediaView) {
        return mediaView.w;
    }
    
    static float l(final MediaView mediaView) {
        return mediaView.s;
    }
    
    static ImageButton m(final MediaView mediaView) {
        return mediaView.q;
    }
    
    static void n(final MediaView mediaView) {
        mediaView.h();
    }
    
    static int o(final MediaView mediaView) {
        return mediaView.z;
    }
    
    static String p(final MediaView mediaView) {
        return mediaView.F;
    }
    
    static ao q(final MediaView mediaView) {
        return mediaView.n;
    }
    
    static int r(final MediaView mediaView) {
        return mediaView.L;
    }
    
    static int s(final MediaView mediaView) {
        return mediaView.J;
    }
    
    static Handler t(final MediaView mediaView) {
        return mediaView.G;
    }
    
    static int u(final MediaView mediaView) {
        return mediaView.m;
    }
    
    @Override
    public void b(final int n) {
        switch (n) {
            default: {}
            case 2131231076:
            case 2131231134: {
                this.finish();
            }
        }
    }
    
    public void e() {
        App.y();
        System.gc();
        App.y();
    }
    
    public void finish() {
        super.finish();
        if (c() && this.y != null) {
            this.overridePendingTransition(0, 0);
        }
    }
    
    public void onActivityResult(final int p0, final int p1, final Intent p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          4
        //     5: iload_1        
        //     6: tableswitch {
        //                0: 49
        //                1: 135
        //                2: 432
        //                3: 85
        //                4: 632
        //                5: 717
        //                6: 782
        //          default: 48
        //        }
        //    48: return         
        //    49: iload_2        
        //    50: iconst_m1      
        //    51: if_icmpne       48
        //    54: aload_3        
        //    55: ifnull          48
        //    58: aload_3        
        //    59: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //    62: astore          68
        //    64: aload           68
        //    66: ifnull          48
        //    69: aload_0        
        //    70: aload_3        
        //    71: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //    74: iconst_m1      
        //    75: iconst_0       
        //    76: iconst_0       
        //    77: invokespecial   com/whatsapp/MediaView.a:(Landroid/net/Uri;III)V
        //    80: iload           4
        //    82: ifeq            48
        //    85: iload_2        
        //    86: iconst_m1      
        //    87: if_icmpne       117
        //    90: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    93: invokevirtual   com/whatsapp/wc.e:()Lcom/whatsapp/a_d;
        //    96: aload_0        
        //    97: invokestatic    com/whatsapp/qp.a:(Lcom/whatsapp/a_9;Landroid/app/Activity;)Z
        //   100: istore          64
        //   102: iload           64
        //   104: ifeq            48
        //   107: aload_0        
        //   108: iconst_0       
        //   109: invokevirtual   com/whatsapp/MediaView.showDialog:(I)V
        //   112: iload           4
        //   114: ifeq            48
        //   117: iload_2        
        //   118: ifne            48
        //   121: aload_3        
        //   122: ifnull          48
        //   125: aload_3        
        //   126: aload_0        
        //   127: invokestatic    com/whatsapp/qp.a:(Landroid/content/Intent;Lcom/whatsapp/gu;)V
        //   130: iload           4
        //   132: ifeq            48
        //   135: iload_2        
        //   136: iconst_m1      
        //   137: if_icmpne       48
        //   140: aload_3        
        //   141: ifnull          48
        //   144: aload_3        
        //   145: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   148: bipush          66
        //   150: aaload         
        //   151: invokevirtual   android/content/Intent.hasExtra:(Ljava/lang/String;)Z
        //   154: istore          38
        //   156: iload           38
        //   158: ifeq            48
        //   161: aload_3        
        //   162: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   165: bipush          64
        //   167: aaload         
        //   168: invokevirtual   android/content/Intent.getParcelableExtra:(Ljava/lang/String;)Landroid/os/Parcelable;
        //   171: checkcast       Landroid/graphics/Bitmap;
        //   174: astore          39
        //   176: new             Ljava/lang/StringBuilder;
        //   179: dup            
        //   180: invokespecial   java/lang/StringBuilder.<init>:()V
        //   183: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   186: bipush          67
        //   188: aaload         
        //   189: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   192: aload           39
        //   194: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   197: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   200: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   203: bipush          76
        //   205: aaload         
        //   206: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   209: aload_0        
        //   210: getfield        com/whatsapp/MediaView.x:Landroid/net/Uri;
        //   213: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   216: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   219: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   222: aload_0        
        //   223: getfield        com/whatsapp/MediaView.x:Landroid/net/Uri;
        //   226: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   229: bipush          77
        //   231: aaload         
        //   232: invokestatic    android/net/Uri.withAppendedPath:(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
        //   235: ifnull          48
        //   238: new             Ljava/io/ByteArrayOutputStream;
        //   241: dup            
        //   242: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   245: astore          40
        //   247: aload           39
        //   249: getstatic       android/graphics/Bitmap$CompressFormat.JPEG:Landroid/graphics/Bitmap$CompressFormat;
        //   252: bipush          100
        //   254: aload           40
        //   256: invokevirtual   android/graphics/Bitmap.compress:(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
        //   259: pop            
        //   260: aload           40
        //   262: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   265: astore          42
        //   267: aload           40
        //   269: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   272: aload_0        
        //   273: getfield        com/whatsapp/MediaView.x:Landroid/net/Uri;
        //   276: invokestatic    android/content/ContentUris.parseId:(Landroid/net/Uri;)J
        //   279: lstore          44
        //   281: aload_0        
        //   282: invokevirtual   com/whatsapp/MediaView.getContentResolver:()Landroid/content/ContentResolver;
        //   285: astore          46
        //   287: getstatic       android/provider/ContactsContract$RawContacts.CONTENT_URI:Landroid/net/Uri;
        //   290: astore          47
        //   292: iconst_1       
        //   293: anewarray       Ljava/lang/String;
        //   296: astore          48
        //   298: aload           48
        //   300: iconst_0       
        //   301: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   304: bipush          61
        //   306: aaload         
        //   307: aastore        
        //   308: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   311: bipush          68
        //   313: aaload         
        //   314: astore          49
        //   316: iconst_1       
        //   317: anewarray       Ljava/lang/String;
        //   320: astore          50
        //   322: aload           50
        //   324: iconst_0       
        //   325: lload           44
        //   327: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   330: aastore        
        //   331: aload           46
        //   333: aload           47
        //   335: aload           48
        //   337: aload           49
        //   339: aload           50
        //   341: aconst_null    
        //   342: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   345: astore          51
        //   347: iconst_0       
        //   348: istore          52
        //   350: aload           51
        //   352: invokeinterface android/database/Cursor.moveToNext:()Z
        //   357: ifeq            420
        //   360: aload           51
        //   362: iconst_0       
        //   363: invokeinterface android/database/Cursor.getLong:(I)J
        //   368: lstore          55
        //   370: iload           52
        //   372: ifne            388
        //   375: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //   378: aload           42
        //   380: lload           55
        //   382: invokestatic    com/whatsapp/MediaView.a:(Landroid/content/ContentResolver;[BJ)V
        //   385: iconst_1       
        //   386: istore          52
        //   388: new             Ljava/lang/StringBuilder;
        //   391: dup            
        //   392: invokespecial   java/lang/StringBuilder.<init>:()V
        //   395: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   398: bipush          62
        //   400: aaload         
        //   401: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   404: lload           55
        //   406: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   409: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   412: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   415: iload           4
        //   417: ifeq            350
        //   420: aload           51
        //   422: invokeinterface android/database/Cursor.close:()V
        //   427: iload           4
        //   429: ifeq            48
        //   432: iload_2        
        //   433: iconst_m1      
        //   434: if_icmpne       48
        //   437: aload_3        
        //   438: ifnull          48
        //   441: aload_0        
        //   442: aload_3        
        //   443: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   446: putfield        com/whatsapp/MediaView.x:Landroid/net/Uri;
        //   449: aload_0        
        //   450: aload_0        
        //   451: getfield        com/whatsapp/MediaView.H:I
        //   454: invokespecial   com/whatsapp/MediaView.g:(I)Lcom/whatsapp/protocol/bi;
        //   457: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   460: checkcast       Lcom/whatsapp/MediaData;
        //   463: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   466: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //   469: astore          23
        //   471: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   474: invokevirtual   com/whatsapp/App.getResources:()Landroid/content/res/Resources;
        //   477: ldc_w           2131361952
        //   480: invokevirtual   android/content/res/Resources.getDimension:(I)F
        //   483: f2i            
        //   484: istore          24
        //   486: new             Landroid/content/Intent;
        //   489: dup            
        //   490: aload_0        
        //   491: ldc_w           Lcom/whatsapp/wallpaper/CropImage;.class
        //   494: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   497: astore          25
        //   499: aload           25
        //   501: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   504: bipush          73
        //   506: aaload         
        //   507: iload           24
        //   509: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   512: pop            
        //   513: aload           25
        //   515: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   518: bipush          58
        //   520: aaload         
        //   521: iload           24
        //   523: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   526: pop            
        //   527: aload           25
        //   529: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   532: bipush          74
        //   534: aaload         
        //   535: iconst_1       
        //   536: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   539: pop            
        //   540: aload           25
        //   542: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   545: bipush          59
        //   547: aaload         
        //   548: iconst_1       
        //   549: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   552: pop            
        //   553: aload           25
        //   555: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   558: bipush          72
        //   560: aaload         
        //   561: iconst_1       
        //   562: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   565: pop            
        //   566: aload           25
        //   568: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   571: bipush          75
        //   573: aaload         
        //   574: iconst_1       
        //   575: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   578: pop            
        //   579: aload           25
        //   581: aload           23
        //   583: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //   586: pop            
        //   587: aload           25
        //   589: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   592: bipush          63
        //   594: aaload         
        //   595: invokestatic    com/whatsapp/wallpaper/h.a:()Landroid/net/Uri;
        //   598: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //   601: pop            
        //   602: aload           25
        //   604: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   607: bipush          65
        //   609: aaload         
        //   610: getstatic       android/graphics/Bitmap$CompressFormat.JPEG:Landroid/graphics/Bitmap$CompressFormat;
        //   613: invokevirtual   android/graphics/Bitmap$CompressFormat.toString:()Ljava/lang/String;
        //   616: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   619: pop            
        //   620: aload_0        
        //   621: aload           25
        //   623: iconst_1       
        //   624: invokevirtual   com/whatsapp/MediaView.startActivityForResult:(Landroid/content/Intent;I)V
        //   627: iload           4
        //   629: ifeq            48
        //   632: iload_2        
        //   633: iconst_m1      
        //   634: if_icmpne       48
        //   637: aload_3        
        //   638: ifnull          48
        //   641: aload_0        
        //   642: aload_3        
        //   643: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   646: bipush          69
        //   648: aaload         
        //   649: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   652: putfield        com/whatsapp/MediaView.F:Ljava/lang/String;
        //   655: new             Landroid/content/Intent;
        //   658: dup            
        //   659: invokespecial   android/content/Intent.<init>:()V
        //   662: astore          18
        //   664: aload_0        
        //   665: aload_0        
        //   666: getfield        com/whatsapp/MediaView.H:I
        //   669: invokespecial   com/whatsapp/MediaView.g:(I)Lcom/whatsapp/protocol/bi;
        //   672: getfield        com/whatsapp/protocol/bi.N:Ljava/lang/Object;
        //   675: checkcast       Lcom/whatsapp/MediaData;
        //   678: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //   681: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //   684: astore          19
        //   686: aload           18
        //   688: aload           19
        //   690: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //   693: pop            
        //   694: aload           18
        //   696: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   699: aload_0        
        //   700: getfield        com/whatsapp/MediaView.F:Ljava/lang/String;
        //   703: invokevirtual   com/whatsapp/wc.c:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   706: aload_0        
        //   707: iconst_5       
        //   708: aload_0        
        //   709: invokestatic    com/whatsapp/qp.a:(Landroid/content/Intent;Lcom/whatsapp/a_9;Landroid/app/Activity;ILcom/whatsapp/gu;)V
        //   712: iload           4
        //   714: ifeq            48
        //   717: iload_2        
        //   718: iconst_m1      
        //   719: if_icmpne       764
        //   722: aload_0        
        //   723: getfield        com/whatsapp/MediaView.F:Ljava/lang/String;
        //   726: astore          16
        //   728: aload           16
        //   730: ifnull          764
        //   733: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   736: aload_0        
        //   737: getfield        com/whatsapp/MediaView.F:Ljava/lang/String;
        //   740: invokevirtual   com/whatsapp/wc.c:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   743: aload_0        
        //   744: invokestatic    com/whatsapp/qp.a:(Lcom/whatsapp/a_9;Landroid/app/Activity;)Z
        //   747: istore          17
        //   749: iload           17
        //   751: ifeq            48
        //   754: aload_0        
        //   755: iconst_1       
        //   756: invokevirtual   com/whatsapp/MediaView.showDialog:(I)V
        //   759: iload           4
        //   761: ifeq            48
        //   764: iload_2        
        //   765: ifne            48
        //   768: aload_3        
        //   769: ifnull          48
        //   772: aload_3        
        //   773: aload_0        
        //   774: invokestatic    com/whatsapp/qp.a:(Landroid/content/Intent;Lcom/whatsapp/gu;)V
        //   777: iload           4
        //   779: ifeq            48
        //   782: iload_2        
        //   783: iconst_m1      
        //   784: if_icmpne       48
        //   787: aload_3        
        //   788: ifnull          48
        //   791: aload_0        
        //   792: aload_0        
        //   793: getfield        com/whatsapp/MediaView.H:I
        //   796: invokespecial   com/whatsapp/MediaView.g:(I)Lcom/whatsapp/protocol/bi;
        //   799: astore          5
        //   801: aload           5
        //   803: ifnull          872
        //   806: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   809: aload_3        
        //   810: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   813: bipush          70
        //   815: aaload         
        //   816: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   819: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   822: astore          7
        //   824: aload           7
        //   826: ifnull          850
        //   829: aload           5
        //   831: aload           7
        //   833: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/protocol/bi;Lcom/whatsapp/a_9;)V
        //   836: aload_0        
        //   837: aload           7
        //   839: invokestatic    com/whatsapp/Conversation.a:(Lcom/whatsapp/a_9;)Landroid/content/Intent;
        //   842: invokevirtual   com/whatsapp/MediaView.startActivity:(Landroid/content/Intent;)V
        //   845: iload           4
        //   847: ifeq            867
        //   850: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   853: bipush          60
        //   855: aaload         
        //   856: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   859: aload_0        
        //   860: ldc_w           2131231257
        //   863: iconst_0       
        //   864: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   867: iload           4
        //   869: ifeq            48
        //   872: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   875: bipush          71
        //   877: aaload         
        //   878: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   881: aload_0        
        //   882: ldc_w           2131231324
        //   885: iconst_0       
        //   886: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   889: return         
        //   890: astore          6
        //   892: aload           6
        //   894: athrow         
        //   895: astore          65
        //   897: aload           65
        //   899: athrow         
        //   900: astore          66
        //   902: aload           66
        //   904: athrow         
        //   905: astore          67
        //   907: aload           67
        //   909: athrow         
        //   910: astore          60
        //   912: aload           60
        //   914: athrow         
        //   915: astore          61
        //   917: aload           61
        //   919: athrow         
        //   920: astore          62
        //   922: aload           62
        //   924: athrow         
        //   925: astore          63
        //   927: aload           63
        //   929: athrow         
        //   930: astore          57
        //   932: aload           57
        //   934: athrow         
        //   935: astore          58
        //   937: aload           58
        //   939: athrow         
        //   940: astore          59
        //   942: aload           59
        //   944: athrow         
        //   945: astore          37
        //   947: aload           37
        //   949: athrow         
        //   950: astore          53
        //   952: aload           53
        //   954: athrow         
        //   955: astore          54
        //   957: aload           54
        //   959: athrow         
        //   960: astore          26
        //   962: aload           26
        //   964: athrow         
        //   965: astore          27
        //   967: aload           27
        //   969: athrow         
        //   970: astore          20
        //   972: aload           20
        //   974: athrow         
        //   975: astore          21
        //   977: aload           21
        //   979: athrow         
        //   980: astore          11
        //   982: aload           11
        //   984: athrow         
        //   985: astore          12
        //   987: aload           12
        //   989: athrow         
        //   990: astore          13
        //   992: aload           13
        //   994: athrow         
        //   995: astore          14
        //   997: aload           14
        //   999: athrow         
        //  1000: astore          15
        //  1002: aload           15
        //  1004: athrow         
        //  1005: astore          9
        //  1007: aload           9
        //  1009: athrow         
        //  1010: astore          10
        //  1012: aload           10
        //  1014: athrow         
        //  1015: astore          8
        //  1017: aload           8
        //  1019: athrow         
        //  1020: astore          43
        //  1022: goto            272
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  58     64     895    900    Ljava/io/IOException;
        //  69     80     900    910    Ljava/io/IOException;
        //  90     102    910    915    Ljava/io/IOException;
        //  107    112    915    930    Ljava/io/IOException;
        //  125    130    930    945    Ljava/io/IOException;
        //  144    156    945    950    Ljava/io/IOException;
        //  267    272    1020   1025   Ljava/io/IOException;
        //  420    427    950    960    Ljava/io/IOException;
        //  499    627    960    970    Ljava/io/IOException;
        //  686    712    970    980    Ljava/io/IOException;
        //  722    728    980    985    Ljava/io/IOException;
        //  733    749    985    990    Ljava/io/IOException;
        //  754    759    990    1005   Ljava/io/IOException;
        //  772    777    1005   1015   Ljava/io/IOException;
        //  829    845    1015   1020   Ljava/io/IOException;
        //  850    867    1015   1020   Ljava/io/IOException;
        //  872    889    890    895    Ljava/io/IOException;
        //  897    900    900    910    Ljava/io/IOException;
        //  902    905    905    910    Ljava/io/IOException;
        //  907    910    910    915    Ljava/io/IOException;
        //  912    915    915    930    Ljava/io/IOException;
        //  917    920    920    930    Ljava/io/IOException;
        //  922    925    925    930    Ljava/io/IOException;
        //  927    930    930    945    Ljava/io/IOException;
        //  932    935    935    945    Ljava/io/IOException;
        //  937    940    940    945    Ljava/io/IOException;
        //  942    945    945    950    Ljava/io/IOException;
        //  952    955    955    960    Ljava/io/IOException;
        //  962    965    965    970    Ljava/io/IOException;
        //  972    975    975    980    Ljava/io/IOException;
        //  977    980    980    985    Ljava/io/IOException;
        //  982    985    985    990    Ljava/io/IOException;
        //  987    990    990    1005   Ljava/io/IOException;
        //  992    995    995    1005   Ljava/io/IOException;
        //  997    1000   1000   1005   Ljava/io/IOException;
        //  1002   1005   1005   1015   Ljava/io/IOException;
        //  1007   1010   1010   1015   Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 479, Size: 479
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
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
    
    @Override
    public void onBackPressed() {
        if (c() && this.y != null) {
            if (this.K != null) {
                this.K.interrupt();
                this.K = null;
            }
            if (this.u != null) {
                this.u.a();
                this.u = null;
            }
            this.a(new i2(this));
            if (!App.I) {
                return;
            }
        }
        super.onBackPressed();
    }
    
    @Override
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b(true);
    }
    
    public void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //     3: bipush          79
        //     5: aaload         
        //     6: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     9: invokestatic    com/whatsapp/App.y:()V
        //    12: aload_0        
        //    13: iconst_5       
        //    14: invokevirtual   com/whatsapp/MediaView.supportRequestWindowFeature:(I)Z
        //    17: pop            
        //    18: aload_0        
        //    19: aload_1        
        //    20: invokespecial   com/whatsapp/DialogToastActivity.onCreate:(Landroid/os/Bundle;)V
        //    23: aload_0        
        //    24: invokevirtual   com/whatsapp/MediaView.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    27: new             Landroid/graphics/drawable/ColorDrawable;
        //    30: dup            
        //    31: aload_0        
        //    32: invokevirtual   com/whatsapp/MediaView.getResources:()Landroid/content/res/Resources;
        //    35: ldc_w           2131624051
        //    38: invokevirtual   android/content/res/Resources.getColor:(I)I
        //    41: invokespecial   android/graphics/drawable/ColorDrawable.<init>:(I)V
        //    44: invokevirtual   android/support/v7/app/ActionBar.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
        //    47: aload_0        
        //    48: invokevirtual   com/whatsapp/MediaView.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    51: iconst_1       
        //    52: invokevirtual   android/support/v7/app/ActionBar.setDisplayHomeAsUpEnabled:(Z)V
        //    55: aload_0        
        //    56: invokevirtual   com/whatsapp/MediaView.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    59: new             Lcom/whatsapp/va;
        //    62: dup            
        //    63: aload_0        
        //    64: invokespecial   com/whatsapp/va.<init>:(Lcom/whatsapp/MediaView;)V
        //    67: invokevirtual   android/support/v7/app/ActionBar.setIcon:(Landroid/graphics/drawable/Drawable;)V
        //    70: aload_0        
        //    71: aload_0        
        //    72: invokevirtual   com/whatsapp/MediaView.getLayoutInflater:()Landroid/view/LayoutInflater;
        //    75: ldc_w           2130903182
        //    78: aconst_null    
        //    79: iconst_0       
        //    80: invokevirtual   android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    83: invokevirtual   com/whatsapp/MediaView.setContentView:(Landroid/view/View;)V
        //    86: aload_0        
        //    87: invokevirtual   com/whatsapp/MediaView.getIntent:()Landroid/content/Intent;
        //    90: astore          4
        //    92: aload           4
        //    94: ifnonnull       160
        //    97: aload_0        
        //    98: invokevirtual   com/whatsapp/MediaView.finish:()V
        //   101: return         
        //   102: astore_3       
        //   103: new             Ljava/lang/StringBuilder;
        //   106: dup            
        //   107: invokespecial   java/lang/StringBuilder.<init>:()V
        //   110: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   113: bipush          90
        //   115: aaload         
        //   116: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   119: invokestatic    android/os/Debug.getNativeHeapAllocatedSize:()J
        //   122: ldc2_w          1024
        //   125: ldiv           
        //   126: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   129: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   132: bipush          92
        //   134: aaload         
        //   135: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   138: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   141: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   144: invokestatic    com/whatsapp/util/br.b:()V
        //   147: aload_0        
        //   148: ldc_w           2131231076
        //   151: invokevirtual   com/whatsapp/MediaView.a:(I)V
        //   154: return         
        //   155: astore          29
        //   157: aload           29
        //   159: athrow         
        //   160: aload_0        
        //   161: new             Lcom/whatsapp/a9b;
        //   164: dup            
        //   165: aload_0        
        //   166: aconst_null    
        //   167: invokespecial   com/whatsapp/a9b.<init>:(Lcom/whatsapp/MediaView;Lcom/whatsapp/pz;)V
        //   170: putfield        com/whatsapp/MediaView.K:Lcom/whatsapp/a9b;
        //   173: aload_0        
        //   174: getfield        com/whatsapp/MediaView.K:Lcom/whatsapp/a9b;
        //   177: invokevirtual   com/whatsapp/a9b.start:()V
        //   180: aload_0        
        //   181: aload           4
        //   183: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   186: bipush          84
        //   188: aaload         
        //   189: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   192: putfield        com/whatsapp/MediaView.D:Ljava/lang/String;
        //   195: aload_0        
        //   196: getfield        com/whatsapp/MediaView.D:Ljava/lang/String;
        //   199: invokestatic    com/whatsapp/util/b.a:(Ljava/lang/String;)V
        //   202: aload           4
        //   204: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   207: bipush          83
        //   209: aaload         
        //   210: invokevirtual   android/content/Intent.getParcelableExtra:(Ljava/lang/String;)Landroid/os/Parcelable;
        //   213: checkcast       Lcom/whatsapp/d6;
        //   216: astore          5
        //   218: aload           5
        //   220: ifnull          809
        //   223: aload_0        
        //   224: aload           5
        //   226: getfield        com/whatsapp/d6.a:Lcom/whatsapp/protocol/c6;
        //   229: putfield        com/whatsapp/MediaView.M:Lcom/whatsapp/protocol/c6;
        //   232: aload_0        
        //   233: new             Ljava/util/ArrayList;
        //   236: dup            
        //   237: invokespecial   java/util/ArrayList.<init>:()V
        //   240: putfield        com/whatsapp/MediaView.N:Ljava/util/ArrayList;
        //   243: new             Ljava/lang/StringBuilder;
        //   246: dup            
        //   247: invokespecial   java/lang/StringBuilder.<init>:()V
        //   250: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   253: bipush          86
        //   255: aaload         
        //   256: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   259: aload_0        
        //   260: getfield        com/whatsapp/MediaView.M:Lcom/whatsapp/protocol/c6;
        //   263: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   266: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   269: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   272: bipush          82
        //   274: aaload         
        //   275: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   278: aload_0        
        //   279: getfield        com/whatsapp/MediaView.M:Lcom/whatsapp/protocol/c6;
        //   282: getfield        com/whatsapp/protocol/c6.b:Z
        //   285: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   288: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   291: bipush          85
        //   293: aaload         
        //   294: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   297: aload_0        
        //   298: getfield        com/whatsapp/MediaView.M:Lcom/whatsapp/protocol/c6;
        //   301: getfield        com/whatsapp/protocol/c6.c:Ljava/lang/String;
        //   304: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   307: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   310: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   313: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   316: aload_0        
        //   317: getfield        com/whatsapp/MediaView.M:Lcom/whatsapp/protocol/c6;
        //   320: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/protocol/c6;)Lcom/whatsapp/protocol/bi;
        //   323: astore          6
        //   325: aload           6
        //   327: ifnonnull       340
        //   330: aload_0        
        //   331: invokevirtual   com/whatsapp/MediaView.finish:()V
        //   334: return         
        //   335: astore          28
        //   337: aload           28
        //   339: athrow         
        //   340: aload_0        
        //   341: getfield        com/whatsapp/MediaView.N:Ljava/util/ArrayList;
        //   344: aload           6
        //   346: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   349: pop            
        //   350: aload           6
        //   352: getfield        com/whatsapp/protocol/bi.I:B
        //   355: iconst_2       
        //   356: if_icmpeq       372
        //   359: aload           6
        //   361: getfield        com/whatsapp/protocol/bi.I:B
        //   364: istore          27
        //   366: iload           27
        //   368: iconst_3       
        //   369: if_icmpne       869
        //   372: aload           6
        //   374: astore          25
        //   376: aload_0        
        //   377: invokevirtual   com/whatsapp/MediaView.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //   380: iconst_0       
        //   381: invokevirtual   android/support/v7/app/ActionBar.setDisplayShowTitleEnabled:(Z)V
        //   384: aload_0        
        //   385: iconst_1       
        //   386: invokevirtual   com/whatsapp/MediaView.setSupportProgressBarIndeterminateVisibility:(Z)V
        //   389: aload_0        
        //   390: new             Lcom/whatsapp/f4;
        //   393: dup            
        //   394: aload_0        
        //   395: invokespecial   com/whatsapp/f4.<init>:(Lcom/whatsapp/MediaView;)V
        //   398: putfield        com/whatsapp/MediaView.u:Lcom/whatsapp/f4;
        //   401: aload_0        
        //   402: getfield        com/whatsapp/MediaView.u:Lcom/whatsapp/f4;
        //   405: iconst_0       
        //   406: anewarray       Ljava/lang/Void;
        //   409: invokestatic    com/whatsapp/a8s.a:(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;
        //   412: pop            
        //   413: aload           25
        //   415: astore          7
        //   417: new             Ljava/lang/StringBuilder;
        //   420: dup            
        //   421: invokespecial   java/lang/StringBuilder.<init>:()V
        //   424: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   427: bipush          81
        //   429: aaload         
        //   430: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   433: aload_0        
        //   434: getfield        com/whatsapp/MediaView.M:Lcom/whatsapp/protocol/c6;
        //   437: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   440: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   443: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   446: aload_0        
        //   447: iconst_0       
        //   448: putfield        com/whatsapp/MediaView.H:I
        //   451: aload_0        
        //   452: invokevirtual   com/whatsapp/MediaView.getResources:()Landroid/content/res/Resources;
        //   455: ldc_w           2130838956
        //   458: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   461: checkcast       Landroid/graphics/drawable/BitmapDrawable;
        //   464: invokevirtual   android/graphics/drawable/BitmapDrawable.getBitmap:()Landroid/graphics/Bitmap;
        //   467: putstatic       com/whatsapp/PhotoView.g:Landroid/graphics/Bitmap;
        //   470: aload_0        
        //   471: new             Lcom/whatsapp/kg;
        //   474: dup            
        //   475: aload_0        
        //   476: invokespecial   com/whatsapp/kg.<init>:(Lcom/whatsapp/MediaView;)V
        //   479: putfield        com/whatsapp/MediaView.G:Landroid/os/Handler;
        //   482: aconst_null    
        //   483: astore          8
        //   485: aload_1        
        //   486: ifnull          862
        //   489: aload_0        
        //   490: aload           8
        //   492: putfield        com/whatsapp/MediaView.E:Lcom/whatsapp/protocol/bi;
        //   495: aload_0        
        //   496: new             Lcom/whatsapp/vn;
        //   499: dup            
        //   500: aload_0        
        //   501: aload           8
        //   503: invokespecial   com/whatsapp/vn.<init>:(Lcom/whatsapp/MediaView;Lcom/whatsapp/protocol/bi;)V
        //   506: putfield        com/whatsapp/MediaView.A:Lcom/whatsapp/vn;
        //   509: aload_0        
        //   510: new             Lcom/whatsapp/MediaView$MediaViewPager;
        //   513: dup            
        //   514: aload_0        
        //   515: aload_0        
        //   516: aconst_null    
        //   517: invokespecial   com/whatsapp/MediaView$MediaViewPager.<init>:(Lcom/whatsapp/MediaView;Landroid/content/Context;Landroid/util/AttributeSet;)V
        //   520: putfield        com/whatsapp/MediaView.l:Lcom/whatsapp/MediaView$MediaViewPager;
        //   523: aload_0        
        //   524: ldc_w           2131755652
        //   527: invokevirtual   com/whatsapp/MediaView.findViewById:(I)Landroid/view/View;
        //   530: checkcast       Landroid/view/ViewGroup;
        //   533: aload_0        
        //   534: getfield        com/whatsapp/MediaView.l:Lcom/whatsapp/MediaView$MediaViewPager;
        //   537: invokevirtual   android/view/ViewGroup.addView:(Landroid/view/View;)V
        //   540: aload_0        
        //   541: getfield        com/whatsapp/MediaView.l:Lcom/whatsapp/MediaView$MediaViewPager;
        //   544: aload_0        
        //   545: getfield        com/whatsapp/MediaView.A:Lcom/whatsapp/vn;
        //   548: invokevirtual   com/whatsapp/MediaView$MediaViewPager.setAdapter:(Landroid/support/v4/view/PagerAdapter;)V
        //   551: aload_0        
        //   552: aload_0        
        //   553: getfield        com/whatsapp/MediaView.H:I
        //   556: invokespecial   com/whatsapp/MediaView.h:(I)V
        //   559: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   562: bipush          11
        //   564: if_icmplt       578
        //   567: aload_0        
        //   568: getfield        com/whatsapp/MediaView.l:Lcom/whatsapp/MediaView$MediaViewPager;
        //   571: aload_0        
        //   572: getfield        com/whatsapp/MediaView.r:I
        //   575: invokevirtual   com/whatsapp/MediaView$MediaViewPager.setSystemUiVisibility:(I)V
        //   578: aload_0        
        //   579: ldc_w           2131755652
        //   582: invokevirtual   com/whatsapp/MediaView.findViewById:(I)Landroid/view/View;
        //   585: astore          10
        //   587: aload_0        
        //   588: new             Landroid/graphics/drawable/ColorDrawable;
        //   591: dup            
        //   592: ldc_w           -16777216
        //   595: invokespecial   android/graphics/drawable/ColorDrawable.<init>:(I)V
        //   598: putfield        com/whatsapp/MediaView.k:Landroid/graphics/drawable/Drawable;
        //   601: aload           10
        //   603: aload_0        
        //   604: getfield        com/whatsapp/MediaView.k:Landroid/graphics/drawable/Drawable;
        //   607: invokevirtual   android/view/View.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   610: aload_1        
        //   611: ifnonnull       761
        //   614: aload           6
        //   616: ifnull          761
        //   619: aload           6
        //   621: getfield        com/whatsapp/protocol/bi.I:B
        //   624: istore          16
        //   626: iload           16
        //   628: iconst_1       
        //   629: if_icmpne       761
        //   632: invokestatic    com/whatsapp/MediaView.c:()Z
        //   635: ifeq            761
        //   638: aload           4
        //   640: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   643: bipush          89
        //   645: aaload         
        //   646: iconst_0       
        //   647: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   650: istore          17
        //   652: iload           17
        //   654: ifeq            761
        //   657: aload_0        
        //   658: aload           6
        //   660: putfield        com/whatsapp/MediaView.y:Lcom/whatsapp/protocol/bi;
        //   663: aload_0        
        //   664: iconst_1       
        //   665: putfield        com/whatsapp/MediaView.p:Z
        //   668: aload_0        
        //   669: getfield        com/whatsapp/MediaView.l:Lcom/whatsapp/MediaView$MediaViewPager;
        //   672: astore          18
        //   674: aload           4
        //   676: ldc             "x"
        //   678: iconst_0       
        //   679: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //   682: istore          19
        //   684: aload           4
        //   686: ldc_w           "y"
        //   689: iconst_0       
        //   690: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //   693: istore          20
        //   695: aload           4
        //   697: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   700: bipush          80
        //   702: aaload         
        //   703: iconst_0       
        //   704: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //   707: istore          21
        //   709: aload           4
        //   711: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   714: bipush          88
        //   716: aaload         
        //   717: iconst_0       
        //   718: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //   721: istore          22
        //   723: aload_0        
        //   724: invokevirtual   com/whatsapp/MediaView.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //   727: invokevirtual   android/support/v7/app/ActionBar.hide:()V
        //   730: aload_0        
        //   731: iconst_0       
        //   732: putfield        com/whatsapp/MediaView.w:Z
        //   735: aload           18
        //   737: invokevirtual   android/view/View.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
        //   740: new             Lcom/whatsapp/hx;
        //   743: dup            
        //   744: aload_0        
        //   745: aload           18
        //   747: iload           19
        //   749: iload           20
        //   751: iload           21
        //   753: iload           22
        //   755: invokespecial   com/whatsapp/hx.<init>:(Lcom/whatsapp/MediaView;Landroid/view/View;IIII)V
        //   758: invokevirtual   android/view/ViewTreeObserver.addOnPreDrawListener:(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
        //   761: aload_1        
        //   762: ifnull          796
        //   765: aload_0        
        //   766: aload_1        
        //   767: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   770: bipush          87
        //   772: aaload         
        //   773: invokevirtual   android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
        //   776: checkcast       Landroid/net/Uri;
        //   779: putfield        com/whatsapp/MediaView.x:Landroid/net/Uri;
        //   782: aload_0        
        //   783: aload_1        
        //   784: getstatic       com/whatsapp/MediaView.O:[Ljava/lang/String;
        //   787: bipush          91
        //   789: aaload         
        //   790: invokevirtual   android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   793: putfield        com/whatsapp/MediaView.F:Ljava/lang/String;
        //   796: aload_0        
        //   797: getfield        com/whatsapp/MediaView.I:Lcom/whatsapp/aws;
        //   800: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/aws;)V
        //   803: return         
        //   804: astore          23
        //   806: aload           23
        //   808: athrow         
        //   809: aload_0        
        //   810: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   813: aload_0        
        //   814: getfield        com/whatsapp/MediaView.D:Ljava/lang/String;
        //   817: invokevirtual   com/whatsapp/vy.k:(Ljava/lang/String;)Ljava/util/ArrayList;
        //   820: putfield        com/whatsapp/MediaView.N:Ljava/util/ArrayList;
        //   823: aconst_null    
        //   824: astore          6
        //   826: aconst_null    
        //   827: astore          7
        //   829: goto            417
        //   832: astore          9
        //   834: aload           9
        //   836: athrow         
        //   837: astore          11
        //   839: aload           11
        //   841: athrow         
        //   842: astore          12
        //   844: aload           12
        //   846: athrow         
        //   847: astore          13
        //   849: aload           13
        //   851: athrow         
        //   852: astore          14
        //   854: aload           14
        //   856: athrow         
        //   857: astore          15
        //   859: aload           15
        //   861: athrow         
        //   862: aload           7
        //   864: astore          8
        //   866: goto            489
        //   869: aconst_null    
        //   870: astore          25
        //   872: goto            376
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  70     86     102    155    Ljava/lang/OutOfMemoryError;
        //  97     101    155    160    Ljava/lang/OutOfMemoryError;
        //  330    334    335    340    Ljava/lang/OutOfMemoryError;
        //  340    366    804    809    Ljava/lang/OutOfMemoryError;
        //  489    578    832    837    Ljava/lang/OutOfMemoryError;
        //  587    610    837    847    Ljava/lang/OutOfMemoryError;
        //  619    626    847    852    Ljava/lang/OutOfMemoryError;
        //  632    652    852    857    Ljava/lang/OutOfMemoryError;
        //  765    796    857    862    Ljava/lang/OutOfMemoryError;
        //  839    842    842    847    Ljava/lang/OutOfMemoryError;
        //  844    847    847    852    Ljava/lang/OutOfMemoryError;
        //  849    852    852    857    Ljava/lang/OutOfMemoryError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 412, Size: 412
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
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
    
    protected Dialog onCreateDialog(final int n) {
        boolean b = true;
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 0: {
                final ProgressDialog progressDialog = new ProgressDialog((Context)this);
                progressDialog.setMessage((CharSequence)this.getString(2131231874));
                progressDialog.setIndeterminate(b);
                progressDialog.setCancelable(false);
                return (Dialog)progressDialog;
            }
            case 1: {
                final ProgressDialog progressDialog2 = new ProgressDialog((Context)this);
                progressDialog2.setMessage((CharSequence)this.getString(2131231873));
                progressDialog2.setIndeterminate(b);
                progressDialog2.setCancelable(false);
                return (Dialog)progressDialog2;
            }
            case 2: {
                final bi g = this.g(this.H);
                final ArrayList<bi> list = new ArrayList<bi>();
                list.add(g);
                if (this.H != -1 + this.N.size()) {
                    b = false;
                }
                return alh.a(this, list, this.D, 2, new hm(this, g, b));
            }
        }
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 8, 0, 2131230804).setIcon(2130838710), 2);
        MenuItemCompat.setShowAsAction(menu.add(0, 10, 0, 2131230967).setIcon(2130838722), 2);
        menu.add(0, 9, 0, 2131231732).setIcon(2130838733);
        menu.add(1, 5, 0, 2131231655).setIcon(2130838783);
        menu.add(1, 6, 0, 2131231653).setIcon(2130838788);
        menu.add(1, 0, 0, 2131230826).setIcon(2130838783);
        menu.add(1, 1, 0, 2131231878).setIcon(2130838807);
        menu.add(1, 2, 0, 2131231914).setIcon(2130838791);
        menu.add(1, 3, 0, 2131231610).setIcon(2130838799);
        menu.add(1, 4, 0, 2131231611).setIcon(2130838800);
        menu.add(0, 7, 0, 2131230992).setIcon(2130838787);
        return true;
    }
    
    public void onDestroy() {
        final boolean i = App.I;
        Log.i(MediaView.O[78]);
        if (this.l != null) {
            int n;
            for (int j = 0; j < this.l.getChildCount(); j = n) {
                final View child = this.l.getChildAt(j);
                if (child instanceof PhotoView) {
                    ((PhotoView)child).g();
                }
                n = j + 1;
                if (i) {
                    break;
                }
            }
        }
        if (this.K != null) {
            this.K.interrupt();
            this.K = null;
        }
        if (this.u != null) {
            this.u.a();
            this.u = null;
        }
        this.E = null;
        if (this.D != null) {
            com.whatsapp.util.b.c(this.D);
        }
        App.a(this.I);
        App.y();
        super.onDestroy();
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        final boolean i = App.I;
        Label_0777: {
            switch (menuItem.getItemId()) {
                case 1: {
                    int n2 = 0;
                    int n3 = 0;
                    Label_0230: {
                        if (this.getResources().getConfiguration().orientation == 1) {
                            final int n = this.getWindow().getDecorView().getHeight() - (int)this.getResources().getDimension(2131361920) - vc.b().a();
                            final int width = this.getWindow().getDecorView().getWidth();
                            if (!i) {
                                n2 = n;
                                n3 = width;
                                break Label_0230;
                            }
                        }
                        final int n4 = this.getWindow().getDecorView().getWidth() - (int)this.getResources().getDimension(2131361920) - vc.b().a();
                        final int height = this.getWindow().getDecorView().getHeight();
                        n2 = n4;
                        n3 = height;
                    }
                    final Uri fromFile = Uri.fromFile(((MediaData)this.g(this.H).N).file);
                    Log.i(MediaView.O[13] + n2);
                    final Intent intent = new Intent((Context)this, (Class)CropImage.class);
                    intent.putExtra(MediaView.O[8], n3);
                    intent.putExtra(MediaView.O[9], n2);
                    intent.putExtra(MediaView.O[19], 1);
                    intent.putExtra(MediaView.O[12], true);
                    intent.putExtra(MediaView.O[17], true);
                    intent.setData(fromFile);
                    intent.putExtra(MediaView.O[21], (Parcelable)com.whatsapp.wallpaper.h.a());
                    intent.putExtra(MediaView.O[15], Bitmap$CompressFormat.JPEG.toString());
                    this.startActivityForResult(intent, 0);
                    if (i) {
                        break Label_0777;
                    }
                    break;
                }
                case 0: {
                    this.startActivityForResult(new Intent(MediaView.O[18], ContactsContract$Contacts.CONTENT_URI), 2);
                    if (i) {
                        break Label_0777;
                    }
                    break;
                }
                case 5: {
                    final Intent intent2 = new Intent();
                    intent2.setData(Uri.fromFile(((MediaData)this.g(this.H).N).file));
                    qp.a(intent2, App.S.e(), this, 3, this);
                    if (i) {
                        break Label_0777;
                    }
                    break;
                }
                case 6: {
                    final Intent intent3 = new Intent((Context)this, (Class)ContactPicker.class);
                    intent3.putExtra(MediaView.O[22], true);
                    this.startActivityForResult(intent3, 4);
                    if (i) {
                        break Label_0777;
                    }
                    break;
                }
                case 2: {
                    final bi g = this.g(this.H);
                    final Uri fromFile2 = Uri.fromFile(((MediaData)g.N).file);
                    final Intent intent4 = new Intent(MediaView.O[16]);
                    switch (g.I) {
                        case 1: {
                            intent4.setDataAndType(fromFile2, MediaView.O[10]);
                            break;
                        }
                    }
                    App.a((Context)this, intent4);
                    if (i) {
                        break Label_0777;
                    }
                    break;
                }
                case 3: {
                    this.c(false);
                    if (i) {
                        break Label_0777;
                    }
                    break;
                }
                case 4: {
                    this.c(true);
                    if (i) {
                        break Label_0777;
                    }
                    break;
                }
                case 7: {
                    this.showDialog(2);
                    if (i) {
                        break Label_0777;
                    }
                    break;
                }
                case 9: {
                    this.g();
                    if (i) {
                        break Label_0777;
                    }
                    break;
                }
                case 10: {
                    final Intent intent5 = new Intent((Context)this, (Class)ContactPicker.class);
                    intent5.putExtra(MediaView.O[20], true);
                    this.startActivityForResult(intent5, 6);
                    if (i) {
                        break Label_0777;
                    }
                    break;
                }
                case 8: {
                    if (c() && this.getIntent().getBooleanExtra(MediaView.O[14], false) && this.y != null) {
                        this.a(new tn(this));
                        if (!i) {
                            break;
                        }
                    }
                    this.y = null;
                    final Intent intent6 = new Intent((Context)this, (Class)MediaGallery.class);
                    intent6.putExtra(MediaView.O[11], this.D);
                    ActivityCompat.startActivity(this, intent6, ActivityOptionsCompat.makeSceneTransitionAnimation(this, new Pair[0]).toBundle());
                    this.finish();
                    if (i) {
                        break Label_0777;
                    }
                    break;
                }
                case 16908332: {
                    if (c() && this.y != null) {
                        this.a(new r1(this));
                        if (!i) {
                            break;
                        }
                    }
                    this.finish();
                    return true;
                }
            }
        }
        return true;
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        if (this.isFinishing() && this.u != null) {
            this.u.a();
            this.u = null;
        }
    }
    
    public boolean onPrepareOptionsMenu(final Menu menu) {
        if (menu.size() == 0) {
            return false;
        }
        while (true) {
            Label_0200: {
                if (this.l == null) {
                    break Label_0200;
                }
                final bi g = this.g(this.l.getCurrentItem());
                if (g == null || g.I != 1) {
                    break Label_0200;
                }
                final boolean b = true;
                menu.setGroupVisible(1, b);
                menu.findItem(7).setVisible(this.l != null);
                menu.findItem(9).setVisible(this.l != null);
                menu.findItem(10).setVisible(this.l != null);
                final MenuItem item = menu.findItem(8);
                final MediaView$MediaViewPager l = this.l;
                boolean visible = false;
                if (l != null) {
                    visible = true;
                }
                item.setVisible(visible);
                return true;
            }
            final boolean b = false;
            continue;
        }
    }
    
    public void onResume() {
        super.onResume();
        this.b(true);
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.x != null) {
            bundle.putParcelable(MediaView.O[36], (Parcelable)this.x);
        }
        if (this.F != null) {
            bundle.putString(MediaView.O[35], this.F);
        }
    }
    
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MediaView.O[39]);
    }
    
    @Override
    protected void onStop() {
        super.onStop();
        this.h();
        this.b(true);
        Log.i(MediaView.O[52]);
    }
}
