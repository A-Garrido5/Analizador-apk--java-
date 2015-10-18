// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.res.Resources;
import android.text.TextUtils;
import android.support.v4.view.MenuItemCompat$OnActionExpandListener;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView$OnQueryTextListener;
import android.widget.TextView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.app.Dialog;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.View;
import android.view.ContextMenu;
import android.os.Bundle;
import android.app.Activity;
import android.widget.AdapterView$AdapterContextMenuInfo;
import com.whatsapp.util.Log;
import android.view.MotionEvent;
import java.util.List;
import java.util.Collection;
import com.whatsapp.contact.f;
import com.whatsapp.util.bm;
import android.content.Context;
import android.widget.ListAdapter;
import android.widget.HeaderViewListAdapter;
import android.widget.ListView;
import java.util.HashSet;
import android.view.MenuItem;
import java.util.Set;
import android.support.v4.view.ViewPager;
import android.support.v7.view.ActionMode$Callback;
import android.support.v7.view.ActionMode;
import android.content.Intent;
import java.util.HashMap;
import android.os.Handler;
import java.util.ArrayList;

public class ContactPicker extends VerifyMessageStoreActivity implements aws
{
    private static final a_9 A;
    private static final a_9 X;
    private static final String[] Z;
    private static boolean l;
    private static final a_9 x;
    private ArrayList B;
    private fh C;
    private Handler D;
    private String E;
    private a_9 F;
    private String G;
    private HashMap H;
    private Intent I;
    private boolean J;
    private ActionMode K;
    private boolean L;
    private ActionMode$Callback M;
    private ArrayList N;
    private a9q O;
    private byte P;
    private String Q;
    private boolean R;
    private boolean S;
    private ArrayList T;
    private String U;
    private final Object V;
    private ArrayList W;
    private fh Y;
    private boolean m;
    private boolean n;
    private boolean o;
    private String p;
    private boolean q;
    private fh r;
    private boolean s;
    private ViewPager t;
    private boolean u;
    private Set v;
    private ArrayList w;
    private ArrayList y;
    private MenuItem z;
    
    static {
        final String[] z = new String[94];
        String s = "FnV";
        int n = -1;
        String[] array = z;
        int n2 = 0;
        String intern = null;
    Label_2382:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'w';
                        break;
                    }
                    case 0: {
                        c2 = ',';
                        break;
                    }
                    case 1: {
                        c2 = '\u0007';
                        break;
                    }
                    case 2: {
                        c2 = '2';
                        break;
                    }
                    case 3: {
                        c2 = 'k';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "EiF\u000e\u0019X";
                    n2 = 1;
                    array = z;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z;
                    s = "Oh\\\u001f\u0016OsB\u0002\u0014Gb@D\u0004Df@\u000eXYu[K";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "Of^\u0007'EdY\u000e\u0005";
                    n = 2;
                    array = z;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "MiV\u0019\u0018Ec\u001c\u0002\u0019Xb\\\u001fYMdF\u0002\u0018B)q92mSw4$dH`?4yS";
                    n = 3;
                    array = z;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "_bF4\u0010^hG\u001b(Ed]\u0005";
                    n = 4;
                    array = z;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "MiV\u0019\u0018Ec\u001c\u0002\u0019Xb\\\u001fYI\u007fF\u0019\u0016\u0002Tf92mJ";
                    n = 5;
                    array = z;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    s = "Oh\\\u001f\u0016OsB\u0002\u0014Gb@D\u0003UwWD\u0019Yk^K";
                    n = 6;
                    n2 = 7;
                    array = z;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    array = z;
                    s = "MiV\u0019\u0018Ec\u001c\u0002\u0019Xb\\\u001fYI\u007fF\u0019\u0016\u0002Sw3#";
                    n = 7;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "Jh@\u001c\u0016^c";
                    n = 8;
                    array = z;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "Nk]\b\u001cIcm\u0007\u001e_s";
                    n = 9;
                    array = z;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "MiV\u0019\u0018Ec\u001c\u0002\u0019Xb\\\u001fYI\u007fF\u0019\u0016\u0002Sw3#";
                    n = 10;
                    array = z;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "ZdS\u0019\u0013\u0016";
                    n = 11;
                    array = z;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "Oh\\\u001f\u0016OsB\u0002\u0014Gb@D\u0004Df@\u000eXOh\\\u001f\u0016Os\u001d\u000e\u0005^h@K";
                    n = 12;
                    array = z;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "MiV\u0019\u0018Ec\u001c\u0002\u0019Xb\\\u001fYI\u007fF\u0019\u0016\u0002Tg)=iDf";
                    n = 13;
                    array = z;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "MiV\u0019\u0018Ec\u001c\u0002\u0019Xb\\\u001fYI\u007fF\u0019\u0016\u0002Tf92mJ";
                    n = 14;
                    array = z;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "XbJ\u001f";
                    n = 15;
                    array = z;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "Nk]\b\u001csd]\u0005\u0003MdF";
                    n = 16;
                    array = z;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "Oh\\\u001f\u0016OsB\u0002\u0014Gb@D\u0004Df@\u000eXOh\\\u001f\u0016Os\u001d\u000e\u0005^h@K";
                    n = 17;
                    array = z;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "Oh\\\u001f\u0016OsB\u0002\u0014Gb@D\u0004Df@\u000eXNfV\r\u001e@b";
                    n = 18;
                    array = z;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "MiV\u0019\u0018Ec\u001c\u0002\u0019Xb\\\u001fYI\u007fF\u0019\u0016\u0002Sw3#";
                    n = 19;
                    array = z;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "Oh\\\u001f\u0016OsB\u0002\u0014Gb@D\u0007Iu_\u0002\u0004_n]\u0005W";
                    n = 20;
                    array = z;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "KnV";
                    n = 21;
                    array = z;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "Oh\\\u001f\u0016OsB\u0002\u0014Gb@D\u0004Df@\u000eX_s@\u000e\u0016A(";
                    n = 22;
                    array = z;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "Oh\\\u001f\u0016Osm\u001b\u001eOlW\u0019X_oS\u0019\u0012\u0003tF\u0019\u0012Mj\u001d\r\u0013\u0011iG\u0007\u001b";
                    n = 23;
                    array = z;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "Oh\\\u001f\u0016OsB\u0002\u0014Gb@D\u0004Df@\u000eXOh\\\u001f\u0016Os\u001d\r\u001e@b\u0012\u000f\u0018It\\L\u0003\fbJ\u0002\u0004X'";
                    n = 24;
                    array = z;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "Oh\\\u001f\u0016OsB\u0002\u0014Gb@D\u0004Df@\u000eXCdF\u000e\u0003\u0001tF\u0019\u0012Mj\u0012";
                    n = 25;
                    array = z;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "MiV\u0019\u0018Ec\u001c\u0002\u0019Xb\\\u001fYI\u007fF\u0019\u0016\u0002Tg)=iDf";
                    n = 26;
                    array = z;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "ohG\u0007\u0013\fi]\u001fW\\f@\u0018\u0012\fqq\n\u0005H'T\u0002\u001bI=\u0012";
                    n = 27;
                    array = z;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "Oh_E\u0000DfF\u0018\u0016\\w";
                    n = 28;
                    array = z;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "[oS\u001f\u0004MwB";
                    n = 29;
                    array = z;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "Oh\\\u001f\u0016OsB\u0002\u0014Gb@D\u0004Df@\u000e(Yu[\u0018XBr^\u0007W";
                    n = 30;
                    array = z;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "yStFO";
                    n = 31;
                    array = z;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "Oh_E\u001dY`U\u000e\u0005_hT\u001fY[oS\u001f\u0004MwB\r\u001e@bA\u000e\u0019Hb@";
                    n = 32;
                    array = z;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "IjS\u0002\u001bso[\u0018\u0003CuK";
                    n = 33;
                    array = z;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "Oh\\\u001f\u0016OsB\u0002\u0014Gb@D\u0004Df@\u000eXYu[K";
                    n = 34;
                    array = z;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "OfB\u001f\u001eCi";
                    n = 35;
                    array = z;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "CdF\u000e\u0003\u0001tF\u0019\u0012Mj";
                    n = 36;
                    array = z;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "Oh\\\u001f\u0016OsB\u0002\u0014Gb@D\u0004Df@\u000eXOh\\\u001f\u0016Os\u001d\u000e\u0005^h@K";
                    n = 37;
                    array = z;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "MiV\u0019\u0018Ec\u001c\u0002\u0019Xb\\\u001fYI\u007fF\u0019\u0016\u0002Tf92mJ";
                    n = 38;
                    array = z;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "Jn^\u000e";
                    n = 39;
                    array = z;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "OuW\n\u0003IXU\u0019\u0018Yw";
                    n = 40;
                    array = z;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "Oh\\\u001f\u0016OsB\u0002\u0014Gb@D\u0004Df@\u000eXOh\\\u001f\u0016Os\u001d\u000e\u0005^h@K";
                    n = 41;
                    array = z;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "Oh\\\u001f\u0016OsB\u0002\u0014Gb@D\u0004Df@\u000eXOh\\\u001f\u0016Os\u001d\u000e\u0005^h@K";
                    n = 42;
                    array = z;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    s = "\\fm\u0007\u001e_s";
                    n = 43;
                    n2 = 44;
                    array = z;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    array = z;
                    s = "Oh_E\u0000DfF\u0018\u0012Bc";
                    n = 44;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "Oh\\\u001f\u0016OsB\u0002\u0014Gb@D\u0004Df@\u000eXOh\\\u001f\u0016Os\u001d\u000e\u0005^h@K";
                    n = 45;
                    array = z;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "_b\\\u000f";
                    n = 46;
                    array = z;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "Oh\\\u001f\u0016OsB\u0002\u0014Gb@D\u0004Df@\u000eXYu[\u0018W";
                    n = 47;
                    array = z;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "\f*\u0012";
                    n = 48;
                    array = z;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    s = "Oh\\\u001f\u0016OsB\u0002\u0014Gb@D\u0005ItG\u0007\u0003\fd]\u0005\u0003MdFK\u0019Cs\u0012\n\u0013HbV";
                    n = 49;
                    n2 = 50;
                    array = z;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    array = z;
                    s = "Bh\u001f\u0006\u0016XdZ\u000e\u0004";
                    n = 50;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "MiV\u0019\u0018Ec\u001c\u0002\u0019Xb\\\u001fYMdF\u0002\u0018B)d\"2{";
                    n = 51;
                    array = z;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "Oh_E\u0016Bc@\u0004\u001eH)Q\u0004\u0019XfQ\u001f\u0004";
                    n = 52;
                    array = z;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "Oh\\\u001f\u0016Osm\u001b\u001eOlW\u0019XCwF\u0002\u0018Bt\u001d\u0018\u000e_sW\u0006WOh\\\u001f\u0016OsAK\u0016\\w\u0012\b\u0018YkVK\u0019Cs\u0012\r\u0018YiV";
                    n = 53;
                    array = z;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "Me]\u0019\u0003EiUK\u0013Yb\u0012\u001f\u0018\fiS\u001f\u001eZb\u0012\u0007\u001eNuS\u0019\u001eIt\u0012\u0006\u001e_t[\u0005\u0010";
                    n = 54;
                    array = z;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "AhG\u0005\u0003Icm\u0019\u0018";
                    n = 55;
                    array = z;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "_bS\u0019\u0014D";
                    n = 56;
                    array = z;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "Oh\\\u001f\u0016OsB\u0002\u0014Gb@D\u0014^bS\u001f\u0012";
                    n = 57;
                    array = z;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "AhG\u0005\u0003Ic";
                    n = 58;
                    array = z;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "FnV";
                    n = 59;
                    array = z;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    n2 = 61;
                    s = "EiF\u000e\u0019X";
                    n = 60;
                    array = z;
                    continue;
                }
                case 60: {
                    array[n2] = intern;
                    n2 = 62;
                    s = "Bh\u001f\u0006\u0016XdZ\u000e\u0004";
                    n = 61;
                    array = z;
                    continue;
                }
                case 61: {
                    array[n2] = intern;
                    n2 = 63;
                    s = "Bh\u001f\u0006\u0016XdZ\u000e\u0004";
                    n = 62;
                    array = z;
                    continue;
                }
                case 62: {
                    array[n2] = intern;
                    n2 = 64;
                    s = "Bh\u001f\u0006\u0016XdZ\u000e\u0004";
                    n = 63;
                    array = z;
                    continue;
                }
                case 63: {
                    array[n2] = intern;
                    n2 = 65;
                    s = "ZnV\u000e\u0018";
                    n = 64;
                    array = z;
                    continue;
                }
                case 64: {
                    array[n2] = intern;
                    n2 = 66;
                    s = "XbJ\u001f";
                    n = 65;
                    array = z;
                    continue;
                }
                case 65: {
                    array[n2] = intern;
                    n2 = 67;
                    s = "XbJ\u001fXT*D\b\u0016^c";
                    n = 66;
                    array = z;
                    continue;
                }
                case 66: {
                    array[n2] = intern;
                    n2 = 68;
                    s = "EjS\f\u0012";
                    n = 67;
                    array = z;
                    continue;
                }
                case 67: {
                    array[n2] = intern;
                    n2 = 69;
                    s = "MrV\u0002\u0018";
                    n = 68;
                    array = z;
                    continue;
                }
                case 68: {
                    array[n2] = intern;
                    n2 = 70;
                    s = "lt\u001c\u001c\u001fMsA\n\u0007\\)\\\u000e\u0003";
                    n = 69;
                    array = z;
                    continue;
                }
                case 69: {
                    array[n2] = intern;
                    n2 = 71;
                    s = "Oh\\\u001f\u0016OsB\u0002\u0014Gb@D\u0013ItF\u0019\u0018U";
                    n = 70;
                    array = z;
                    continue;
                }
                case 70: {
                    array[n2] = intern;
                    n2 = 72;
                    s = "FnV";
                    n = 71;
                    array = z;
                    continue;
                }
                case 71: {
                    array[n2] = intern;
                    n2 = 73;
                    s = "Oh\\\u001f\u0016OsB\u0002\u0014Gb@D\u0007EdY\u000e\u0013\f";
                    n = 72;
                    array = z;
                    continue;
                }
                case 72: {
                    array[n2] = intern;
                    n2 = 74;
                    s = "MiV\u0019\u0018Ec\u001c\u0002\u0019Xb\\\u001fYI\u007fF\u0019\u0016\u0002Tf92mJ";
                    n = 73;
                    array = z;
                    continue;
                }
                case 73: {
                    array[n2] = intern;
                    n2 = 75;
                    s = "Oh\\\u001f\u0016Os";
                    n = 74;
                    array = z;
                    continue;
                }
                case 74: {
                    array[n2] = intern;
                    n2 = 76;
                    s = "^bF\u001e\u0005B'[\u0005\u0003IiF";
                    n = 75;
                    array = z;
                    continue;
                }
                case 75: {
                    array[n2] = intern;
                    n2 = 77;
                    s = "DfA4\u0004Df@\u000e";
                    n = 76;
                    array = z;
                    continue;
                }
                case 76: {
                    array[n2] = intern;
                    n2 = 78;
                    s = "DfA4\u0004Df@\u000e";
                    n = 77;
                    array = z;
                    continue;
                }
                case 77: {
                    array[n2] = intern;
                    n2 = 79;
                    s = "Oh\\\u001f\u0016Os";
                    n = 78;
                    array = z;
                    continue;
                }
                case 78: {
                    array[n2] = intern;
                    n2 = 80;
                    s = "FnV";
                    n = 79;
                    array = z;
                    continue;
                }
                case 79: {
                    array[n2] = intern;
                    n2 = 81;
                    s = "[fm\u001f\u000e\\b";
                    n = 80;
                    array = z;
                    continue;
                }
                case 80: {
                    array[n2] = intern;
                    n2 = 82;
                    s = "DfA4\u0004Df@\u000e";
                    n = 81;
                    array = z;
                    continue;
                }
                case 81: {
                    array[n2] = intern;
                    n2 = 83;
                    s = "_oS\u0019\u0012sjA\f";
                    n = 82;
                    array = z;
                    continue;
                }
                case 82: {
                    array[n2] = intern;
                    n2 = 84;
                    s = "Oh\\\r\u001e^j";
                    n = 83;
                    array = z;
                    continue;
                }
                case 83: {
                    array[n2] = intern;
                    n2 = 85;
                    s = "_l[\u001b(\\uW\u001d\u001eIp";
                    n = 84;
                    array = z;
                    continue;
                }
                case 84: {
                    array[n2] = intern;
                    n2 = 86;
                    s = "_l[\u001b(\\uW\u001d\u001eIp";
                    n = 85;
                    array = z;
                    continue;
                }
                case 85: {
                    array[n2] = intern;
                    n2 = 87;
                    s = "_l[\u001b(\\uW\u001d\u001eIp";
                    n = 86;
                    array = z;
                    continue;
                }
                case 86: {
                    array[n2] = intern;
                    n2 = 88;
                    s = "[fm\u001f\u000e\\b";
                    n = 87;
                    array = z;
                    continue;
                }
                case 87: {
                    array[n2] = intern;
                    n2 = 89;
                    s = "ZdS\u0019\u0013stF\u0019";
                    n = 88;
                    array = z;
                    continue;
                }
                case 88: {
                    array[n2] = intern;
                    n2 = 90;
                    s = "[fm\u001f\u000e\\b";
                    n = 89;
                    array = z;
                    continue;
                }
                case 89: {
                    array[n2] = intern;
                    n2 = 91;
                    s = "ZdS\u0019\u0013siS\u0006\u0012";
                    n = 90;
                    array = z;
                    continue;
                }
                case 90: {
                    array[n2] = intern;
                    n2 = 92;
                    s = "FnV";
                    n = 91;
                    array = z;
                    continue;
                }
                case 91: {
                    array[n2] = intern;
                    n2 = 93;
                    s = "Oh\\\u001f\u0016Os";
                    n = 92;
                    array = z;
                    continue;
                }
                case 92: {
                    break Label_2382;
                }
            }
        }
        array[n2] = intern;
        Z = z;
        X = new a_9("");
        A = new a_9("");
        x = new a_9("");
        ContactPicker.l = false;
    }
    
    public ContactPicker() {
        this.D = new Handler();
        this.v = new HashSet();
        this.T = null;
        this.G = "";
        this.U = null;
        this.p = null;
        this.B = new ArrayList();
        this.w = new ArrayList();
        this.y = new ArrayList();
        this.N = new ArrayList();
        this.V = new Object();
        this.O = new a9q();
    }
    
    private int a(final ListView listView, int n) {
        final ListAdapter adapter = listView.getAdapter();
        try {
            if (adapter instanceof HeaderViewListAdapter) {
                n -= ((HeaderViewListAdapter)adapter).getHeadersCount();
            }
            return n;
        }
        catch (SecurityException ex) {
            throw ex;
        }
    }
    
    static int a(final ContactPicker contactPicker, final ListView listView, final int n) {
        return contactPicker.a(listView, n);
    }
    
    private int a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: iconst_m1      
        //     6: putfield        com/whatsapp/ContactPicker.P:B
        //     9: aload_1        
        //    10: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //    13: bipush          69
        //    15: aaload         
        //    16: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    19: istore          12
        //    21: iload           12
        //    23: ifeq            35
        //    26: aload_0        
        //    27: iconst_2       
        //    28: putfield        com/whatsapp/ContactPicker.P:B
        //    31: iload_2        
        //    32: ifeq            131
        //    35: aload_1        
        //    36: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //    39: bipush          65
        //    41: aaload         
        //    42: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    45: istore          13
        //    47: iload           13
        //    49: ifeq            61
        //    52: aload_0        
        //    53: iconst_3       
        //    54: putfield        com/whatsapp/ContactPicker.P:B
        //    57: iload_2        
        //    58: ifeq            131
        //    61: aload_1        
        //    62: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //    65: bipush          68
        //    67: aaload         
        //    68: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    71: istore          14
        //    73: iload           14
        //    75: ifeq            87
        //    78: aload_0        
        //    79: iconst_1       
        //    80: putfield        com/whatsapp/ContactPicker.P:B
        //    83: iload_2        
        //    84: ifeq            131
        //    87: aload_1        
        //    88: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //    91: bipush          67
        //    93: aaload         
        //    94: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    97: istore          15
        //    99: iload           15
        //   101: ifeq            113
        //   104: aload_0        
        //   105: iconst_4       
        //   106: putfield        com/whatsapp/ContactPicker.P:B
        //   109: iload_2        
        //   110: ifeq            131
        //   113: aload_1        
        //   114: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   117: bipush          66
        //   119: aaload         
        //   120: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   123: ifeq            131
        //   126: aload_0        
        //   127: iconst_0       
        //   128: putfield        com/whatsapp/ContactPicker.P:B
        //   131: aload_0        
        //   132: getfield        com/whatsapp/ContactPicker.P:B
        //   135: ireturn        
        //   136: astore_3       
        //   137: aload_3        
        //   138: athrow         
        //   139: astore          4
        //   141: aload           4
        //   143: athrow         
        //   144: astore          5
        //   146: aload           5
        //   148: athrow         
        //   149: astore          6
        //   151: aload           6
        //   153: athrow         
        //   154: astore          7
        //   156: aload           7
        //   158: athrow         
        //   159: astore          8
        //   161: aload           8
        //   163: athrow         
        //   164: astore          9
        //   166: aload           9
        //   168: athrow         
        //   169: astore          10
        //   171: aload           10
        //   173: athrow         
        //   174: astore          11
        //   176: aload           11
        //   178: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  4      21     136    139    Ljava/lang/SecurityException;
        //  26     31     139    144    Ljava/lang/SecurityException;
        //  35     47     144    149    Ljava/lang/SecurityException;
        //  52     57     149    154    Ljava/lang/SecurityException;
        //  61     73     154    159    Ljava/lang/SecurityException;
        //  78     83     159    164    Ljava/lang/SecurityException;
        //  87     99     164    169    Ljava/lang/SecurityException;
        //  104    109    169    174    Ljava/lang/SecurityException;
        //  113    131    174    179    Ljava/lang/SecurityException;
        //  137    139    139    144    Ljava/lang/SecurityException;
        //  141    144    144    149    Ljava/lang/SecurityException;
        //  146    149    149    154    Ljava/lang/SecurityException;
        //  151    154    154    159    Ljava/lang/SecurityException;
        //  156    159    159    164    Ljava/lang/SecurityException;
        //  161    164    164    169    Ljava/lang/SecurityException;
        //  166    169    169    174    Ljava/lang/SecurityException;
        //  171    174    174    179    Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 96, Size: 96
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
    
    static ActionMode a(final ContactPicker contactPicker, final ActionMode k) {
        return contactPicker.K = k;
    }
    
    private fh a(final ListView listView) {
        final ListAdapter adapter = listView.getAdapter();
        try {
            if (adapter instanceof HeaderViewListAdapter) {
                return (fh)((HeaderViewListAdapter)adapter).getWrappedAdapter();
            }
        }
        catch (SecurityException ex) {
            throw ex;
        }
        return (fh)adapter;
    }
    
    static fh a(final ContactPicker contactPicker, final ListView listView) {
        return contactPicker.a(listView);
    }
    
    static HashMap a(final ContactPicker contactPicker, final HashMap h) {
        return contactPicker.H = h;
    }
    
    static void a(final ContactPicker contactPicker, final ArrayList list) {
        contactPicker.a(list);
    }
    
    private void a(final ArrayList p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/ContactPicker.V:Ljava/lang/Object;
        //     8: astore_3       
        //     9: aload_3        
        //    10: monitorenter   
        //    11: aload_0        
        //    12: getfield        com/whatsapp/ContactPicker.w:Ljava/util/ArrayList;
        //    15: invokevirtual   java/util/ArrayList.clear:()V
        //    18: aload_0        
        //    19: getfield        com/whatsapp/ContactPicker.y:Ljava/util/ArrayList;
        //    22: invokevirtual   java/util/ArrayList.clear:()V
        //    25: aload_0        
        //    26: getfield        com/whatsapp/ContactPicker.N:Ljava/util/ArrayList;
        //    29: invokevirtual   java/util/ArrayList.clear:()V
        //    32: aload_0        
        //    33: getfield        com/whatsapp/ContactPicker.s:Z
        //    36: ifne            46
        //    39: aload_0        
        //    40: getfield        com/whatsapp/ContactPicker.n:Z
        //    43: ifeq            149
        //    46: aload_0        
        //    47: getfield        com/whatsapp/ContactPicker.B:Ljava/util/ArrayList;
        //    50: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    53: astore          5
        //    55: aload           5
        //    57: invokeinterface java/util/Iterator.hasNext:()Z
        //    62: ifeq            145
        //    65: aload           5
        //    67: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    72: checkcast       Lcom/whatsapp/a_9;
        //    75: astore          38
        //    77: aload           38
        //    79: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //    82: ifnull          141
        //    85: aload           38
        //    87: invokevirtual   com/whatsapp/a_9.m:()Z
        //    90: istore          43
        //    92: iload           43
        //    94: ifne            141
        //    97: aload           38
        //    99: aload_1        
        //   100: invokevirtual   com/whatsapp/a_9.a:(Ljava/util/ArrayList;)Z
        //   103: istore          44
        //   105: iload           44
        //   107: ifeq            141
        //   110: aload_0        
        //   111: getfield        com/whatsapp/ContactPicker.v:Ljava/util/Set;
        //   114: aload           38
        //   116: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   119: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   124: istore          45
        //   126: iload           45
        //   128: ifne            141
        //   131: aload_0        
        //   132: getfield        com/whatsapp/ContactPicker.y:Ljava/util/ArrayList;
        //   135: aload           38
        //   137: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   140: pop            
        //   141: iload_2        
        //   142: ifeq            55
        //   145: iload_2        
        //   146: ifeq            400
        //   149: aload_0        
        //   150: getfield        com/whatsapp/ContactPicker.u:Z
        //   153: istore          13
        //   155: iload           13
        //   157: ifeq            236
        //   160: aload_0        
        //   161: getfield        com/whatsapp/ContactPicker.B:Ljava/util/ArrayList;
        //   164: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   167: astore          32
        //   169: aload           32
        //   171: invokeinterface java/util/Iterator.hasNext:()Z
        //   176: ifeq            232
        //   179: aload           32
        //   181: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   186: checkcast       Lcom/whatsapp/a_9;
        //   189: astore          33
        //   191: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   194: aload           33
        //   196: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   199: invokevirtual   com/whatsapp/vy.i:(Ljava/lang/String;)Z
        //   202: ifeq            228
        //   205: aload           33
        //   207: aload_1        
        //   208: invokevirtual   com/whatsapp/a_9.a:(Ljava/util/ArrayList;)Z
        //   211: istore          36
        //   213: iload           36
        //   215: ifeq            228
        //   218: aload_0        
        //   219: getfield        com/whatsapp/ContactPicker.w:Ljava/util/ArrayList;
        //   222: aload           33
        //   224: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   227: pop            
        //   228: iload_2        
        //   229: ifeq            169
        //   232: iload_2        
        //   233: ifeq            400
        //   236: aload_0        
        //   237: getfield        com/whatsapp/ContactPicker.B:Ljava/util/ArrayList;
        //   240: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   243: astore          14
        //   245: aload           14
        //   247: invokeinterface java/util/Iterator.hasNext:()Z
        //   252: ifeq            400
        //   255: aload           14
        //   257: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   262: checkcast       Lcom/whatsapp/a_9;
        //   265: astore          15
        //   267: aload           15
        //   269: aload_1        
        //   270: invokevirtual   com/whatsapp/a_9.a:(Ljava/util/ArrayList;)Z
        //   273: ifeq            396
        //   276: aload           15
        //   278: invokevirtual   com/whatsapp/a_9.m:()Z
        //   281: istore          22
        //   283: iload           22
        //   285: ifeq            314
        //   288: aload           15
        //   290: invokevirtual   com/whatsapp/a_9.o:()Z
        //   293: istore          30
        //   295: iload           30
        //   297: ifne            360
        //   300: aload_0        
        //   301: getfield        com/whatsapp/ContactPicker.w:Ljava/util/ArrayList;
        //   304: aload           15
        //   306: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   309: pop            
        //   310: iload_2        
        //   311: ifeq            360
        //   314: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   317: aload           15
        //   319: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   322: invokevirtual   com/whatsapp/vy.i:(Ljava/lang/String;)Z
        //   325: istore          23
        //   327: iload           23
        //   329: ifeq            360
        //   332: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   335: aload           15
        //   337: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   340: invokevirtual   com/whatsapp/vy.n:(Ljava/lang/String;)Z
        //   343: istore          28
        //   345: iload           28
        //   347: ifne            360
        //   350: aload_0        
        //   351: getfield        com/whatsapp/ContactPicker.w:Ljava/util/ArrayList;
        //   354: aload           15
        //   356: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   359: pop            
        //   360: aload           15
        //   362: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //   365: ifnull          378
        //   368: aload_0        
        //   369: getfield        com/whatsapp/ContactPicker.y:Ljava/util/ArrayList;
        //   372: aload           15
        //   374: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   377: pop            
        //   378: aload           15
        //   380: invokevirtual   com/whatsapp/a_9.m:()Z
        //   383: ifeq            396
        //   386: aload_0        
        //   387: getfield        com/whatsapp/ContactPicker.N:Ljava/util/ArrayList;
        //   390: aload           15
        //   392: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   395: pop            
        //   396: iload_2        
        //   397: ifeq            245
        //   400: aload_3        
        //   401: monitorexit    
        //   402: aload_0        
        //   403: getfield        com/whatsapp/ContactPicker.w:Ljava/util/ArrayList;
        //   406: new             Lcom/whatsapp/a6m;
        //   409: dup            
        //   410: aload_0        
        //   411: invokevirtual   com/whatsapp/ContactPicker.getApplicationContext:()Landroid/content/Context;
        //   414: invokespecial   com/whatsapp/a6m.<init>:(Landroid/content/Context;)V
        //   417: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //   420: aload_0        
        //   421: getfield        com/whatsapp/ContactPicker.y:Ljava/util/ArrayList;
        //   424: new             Lcom/whatsapp/mg;
        //   427: dup            
        //   428: aload_0        
        //   429: invokevirtual   com/whatsapp/ContactPicker.getApplicationContext:()Landroid/content/Context;
        //   432: invokespecial   com/whatsapp/mg.<init>:(Landroid/content/Context;)V
        //   435: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //   438: aload_0        
        //   439: getfield        com/whatsapp/ContactPicker.N:Ljava/util/ArrayList;
        //   442: new             Lcom/whatsapp/mg;
        //   445: dup            
        //   446: aload_0        
        //   447: invokevirtual   com/whatsapp/ContactPicker.getApplicationContext:()Landroid/content/Context;
        //   450: invokespecial   com/whatsapp/mg.<init>:(Landroid/content/Context;)V
        //   453: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //   456: aload_0        
        //   457: getfield        com/whatsapp/ContactPicker.w:Ljava/util/ArrayList;
        //   460: invokevirtual   java/util/ArrayList.size:()I
        //   463: ifne            491
        //   466: new             Lcom/whatsapp/a_9;
        //   469: dup            
        //   470: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   473: bipush          63
        //   475: aaload         
        //   476: invokespecial   com/whatsapp/a_9.<init>:(Ljava/lang/String;)V
        //   479: astore          6
        //   481: aload_0        
        //   482: getfield        com/whatsapp/ContactPicker.w:Ljava/util/ArrayList;
        //   485: aload           6
        //   487: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   490: pop            
        //   491: aload_0        
        //   492: getfield        com/whatsapp/ContactPicker.y:Ljava/util/ArrayList;
        //   495: invokevirtual   java/util/ArrayList.size:()I
        //   498: ifne            526
        //   501: new             Lcom/whatsapp/a_9;
        //   504: dup            
        //   505: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   508: bipush          62
        //   510: aaload         
        //   511: invokespecial   com/whatsapp/a_9.<init>:(Ljava/lang/String;)V
        //   514: astore          8
        //   516: aload_0        
        //   517: getfield        com/whatsapp/ContactPicker.y:Ljava/util/ArrayList;
        //   520: aload           8
        //   522: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   525: pop            
        //   526: aload_0        
        //   527: getfield        com/whatsapp/ContactPicker.N:Ljava/util/ArrayList;
        //   530: invokevirtual   java/util/ArrayList.size:()I
        //   533: ifne            561
        //   536: new             Lcom/whatsapp/a_9;
        //   539: dup            
        //   540: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   543: bipush          64
        //   545: aaload         
        //   546: invokespecial   com/whatsapp/a_9.<init>:(Ljava/lang/String;)V
        //   549: astore          10
        //   551: aload_0        
        //   552: getfield        com/whatsapp/ContactPicker.N:Ljava/util/ArrayList;
        //   555: aload           10
        //   557: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   560: pop            
        //   561: return         
        //   562: astore          39
        //   564: aload           39
        //   566: athrow         
        //   567: astore          40
        //   569: aload           40
        //   571: athrow         
        //   572: astore          41
        //   574: aload           41
        //   576: athrow         
        //   577: astore          42
        //   579: aload           42
        //   581: athrow         
        //   582: astore          4
        //   584: aload_3        
        //   585: monitorexit    
        //   586: aload           4
        //   588: athrow         
        //   589: astore          12
        //   591: aload           12
        //   593: athrow         
        //   594: astore          34
        //   596: aload           34
        //   598: athrow         
        //   599: astore          35
        //   601: aload           35
        //   603: athrow         
        //   604: astore          16
        //   606: aload           16
        //   608: athrow         
        //   609: astore          17
        //   611: aload           17
        //   613: athrow         
        //   614: astore          18
        //   616: aload           18
        //   618: athrow         
        //   619: astore          19
        //   621: aload           19
        //   623: athrow         
        //   624: astore          20
        //   626: aload           20
        //   628: athrow         
        //   629: astore          21
        //   631: aload           21
        //   633: athrow         
        //   634: astore          24
        //   636: aload           24
        //   638: athrow         
        //   639: astore          25
        //   641: aload           25
        //   643: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  11     46     582    589    Any
        //  46     55     582    589    Any
        //  55     77     582    589    Any
        //  77     92     562    567    Ljava/lang/SecurityException;
        //  77     92     582    589    Any
        //  97     105    567    572    Ljava/lang/SecurityException;
        //  97     105    582    589    Any
        //  110    126    572    577    Ljava/lang/SecurityException;
        //  110    126    582    589    Any
        //  131    141    577    582    Ljava/lang/SecurityException;
        //  131    141    582    589    Any
        //  149    155    589    594    Ljava/lang/SecurityException;
        //  149    155    582    589    Any
        //  160    169    582    589    Any
        //  169    191    582    589    Any
        //  191    213    594    599    Ljava/lang/SecurityException;
        //  191    213    582    589    Any
        //  218    228    599    604    Ljava/lang/SecurityException;
        //  218    228    582    589    Any
        //  236    245    582    589    Any
        //  245    267    582    589    Any
        //  267    283    604    609    Ljava/lang/SecurityException;
        //  267    283    582    589    Any
        //  288    295    609    614    Ljava/lang/SecurityException;
        //  288    295    582    589    Any
        //  300    310    614    619    Ljava/lang/SecurityException;
        //  300    310    582    589    Any
        //  314    327    619    624    Ljava/lang/SecurityException;
        //  314    327    582    589    Any
        //  332    345    624    629    Ljava/lang/SecurityException;
        //  332    345    582    589    Any
        //  350    360    629    634    Ljava/lang/SecurityException;
        //  350    360    582    589    Any
        //  360    378    634    639    Ljava/lang/SecurityException;
        //  360    378    582    589    Any
        //  378    396    639    644    Ljava/lang/SecurityException;
        //  378    396    582    589    Any
        //  400    402    582    589    Any
        //  564    567    567    572    Ljava/lang/SecurityException;
        //  564    567    582    589    Any
        //  569    572    572    577    Ljava/lang/SecurityException;
        //  569    572    582    589    Any
        //  574    577    577    582    Ljava/lang/SecurityException;
        //  574    577    582    589    Any
        //  579    582    582    589    Any
        //  584    586    582    589    Any
        //  591    594    582    589    Any
        //  596    599    599    604    Ljava/lang/SecurityException;
        //  596    599    582    589    Any
        //  601    604    582    589    Any
        //  606    609    609    614    Ljava/lang/SecurityException;
        //  606    609    582    589    Any
        //  611    614    614    619    Ljava/lang/SecurityException;
        //  611    614    582    589    Any
        //  616    619    619    624    Ljava/lang/SecurityException;
        //  616    619    582    589    Any
        //  621    624    624    629    Ljava/lang/SecurityException;
        //  621    624    582    589    Any
        //  626    629    629    634    Ljava/lang/SecurityException;
        //  626    629    582    589    Any
        //  631    634    582    589    Any
        //  636    639    582    589    Any
        //  641    644    582    589    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 294, Size: 294
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    static boolean a(final ContactPicker contactPicker) {
        return contactPicker.n;
    }
    
    static boolean a(final ContactPicker contactPicker, final a_9 a_9) {
        return contactPicker.a(a_9);
    }
    
    private boolean a(final a_9 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: new             Ljava/lang/StringBuilder;
        //     7: dup            
        //     8: invokespecial   java/lang/StringBuilder.<init>:()V
        //    11: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //    14: bipush          73
        //    16: aaload         
        //    17: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    20: aload_1        
        //    21: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    24: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    27: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    30: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    33: aload_1        
        //    34: invokestatic    com/whatsapp/ContactPicker.b:(Lcom/whatsapp/a_9;)Z
        //    37: istore          4
        //    39: iload           4
        //    41: ifeq            49
        //    44: iconst_1       
        //    45: ireturn        
        //    46: astore_3       
        //    47: aload_3        
        //    48: athrow         
        //    49: aload_1        
        //    50: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    53: invokestatic    com/whatsapp/App.p:(Ljava/lang/String;)Z
        //    56: istore          6
        //    58: iload           6
        //    60: ifne            44
        //    63: aload_1        
        //    64: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    67: astore          7
        //    69: aload_0        
        //    70: aload_1        
        //    71: putfield        com/whatsapp/ContactPicker.F:Lcom/whatsapp/a_9;
        //    74: aload_0        
        //    75: getfield        com/whatsapp/ContactPicker.s:Z
        //    78: istore          11
        //    80: iload           11
        //    82: ifeq            133
        //    85: aload_0        
        //    86: getfield        com/whatsapp/ContactPicker.S:Z
        //    89: istore          54
        //    91: iload           54
        //    93: ifeq            133
        //    96: aload_0        
        //    97: getfield        com/whatsapp/ContactPicker.E:Ljava/lang/String;
        //   100: invokestatic    com/whatsapp/a_9.f:(Ljava/lang/String;)Z
        //   103: ifne            133
        //   106: aload_0        
        //   107: iconst_0       
        //   108: invokevirtual   com/whatsapp/ContactPicker.showDialog:(I)V
        //   111: iconst_1       
        //   112: ireturn        
        //   113: astore          10
        //   115: aload           10
        //   117: athrow         
        //   118: astore          5
        //   120: aload           5
        //   122: athrow         
        //   123: astore          8
        //   125: aload           8
        //   127: athrow         
        //   128: astore          9
        //   130: aload           9
        //   132: athrow         
        //   133: aload_0        
        //   134: getfield        com/whatsapp/ContactPicker.m:Z
        //   137: ifeq            173
        //   140: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   143: bipush          76
        //   145: aaload         
        //   146: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   149: aload_0        
        //   150: iconst_m1      
        //   151: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   154: aload_1        
        //   155: iconst_1       
        //   156: invokevirtual   com/whatsapp/wc.a:(Lcom/whatsapp/a_9;Z)Landroid/content/Intent;
        //   159: invokevirtual   com/whatsapp/ContactPicker.setResult:(ILandroid/content/Intent;)V
        //   162: aload_0        
        //   163: invokevirtual   com/whatsapp/ContactPicker.finish:()V
        //   166: iconst_1       
        //   167: ireturn        
        //   168: astore          12
        //   170: aload           12
        //   172: athrow         
        //   173: aload_0        
        //   174: getfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //   177: ifnull          410
        //   180: aload_0        
        //   181: new             Landroid/content/Intent;
        //   184: dup            
        //   185: aload_0        
        //   186: ldc_w           Lcom/whatsapp/Conversation;.class
        //   189: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   192: putfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   195: aload_0        
        //   196: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   199: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   202: bipush          80
        //   204: aaload         
        //   205: aload           7
        //   207: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   210: pop            
        //   211: aload_0        
        //   212: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   215: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   218: bipush          81
        //   220: aaload         
        //   221: aload_0        
        //   222: getfield        com/whatsapp/ContactPicker.P:B
        //   225: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;B)Landroid/content/Intent;
        //   228: pop            
        //   229: aload_0        
        //   230: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   233: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   236: bipush          82
        //   238: aaload         
        //   239: iconst_1       
        //   240: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   243: pop            
        //   244: aload_0        
        //   245: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   248: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   251: bipush          87
        //   253: aaload         
        //   254: aload_0        
        //   255: invokevirtual   com/whatsapp/ContactPicker.getIntent:()Landroid/content/Intent;
        //   258: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   261: bipush          86
        //   263: aaload         
        //   264: iconst_0       
        //   265: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   268: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   271: pop            
        //   272: aload_0        
        //   273: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   276: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   279: bipush          74
        //   281: aaload         
        //   282: aload_0        
        //   283: getfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //   286: invokevirtual   android/content/Intent.putParcelableArrayListExtra:(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;
        //   289: pop            
        //   290: aload_0        
        //   291: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   294: ldc_w           335544320
        //   297: invokevirtual   android/content/Intent.addFlags:(I)Landroid/content/Intent;
        //   300: pop            
        //   301: aload_0        
        //   302: invokevirtual   com/whatsapp/ContactPicker.getIntent:()Landroid/content/Intent;
        //   305: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   308: bipush          85
        //   310: aaload         
        //   311: iconst_0       
        //   312: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   315: istore          50
        //   317: iload           50
        //   319: ifne            373
        //   322: aload_0        
        //   323: getfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //   326: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   329: astore          52
        //   331: iload           50
        //   333: istore          53
        //   335: aload           52
        //   337: invokeinterface java/util/Iterator.hasNext:()Z
        //   342: ifeq            910
        //   345: aload           52
        //   347: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   352: checkcast       Landroid/net/Uri;
        //   355: invokestatic    com/whatsapp/util/br.e:(Landroid/net/Uri;)B
        //   358: iconst_1       
        //   359: if_icmpeq       903
        //   362: iload_2        
        //   363: ifeq            897
        //   366: iconst_1       
        //   367: istore          50
        //   369: iload_2        
        //   370: ifeq            890
        //   373: iload           50
        //   375: ifeq            387
        //   378: aload_0        
        //   379: iconst_1       
        //   380: invokevirtual   com/whatsapp/ContactPicker.showDialog:(I)V
        //   383: iload_2        
        //   384: ifeq            44
        //   387: iconst_1       
        //   388: putstatic       com/whatsapp/Conversation.aB:Z
        //   391: aload_0        
        //   392: aload_0        
        //   393: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   396: invokevirtual   com/whatsapp/ContactPicker.startActivity:(Landroid/content/Intent;)V
        //   399: aload_0        
        //   400: invokevirtual   com/whatsapp/ContactPicker.finish:()V
        //   403: iconst_1       
        //   404: ireturn        
        //   405: astore          51
        //   407: aload           51
        //   409: athrow         
        //   410: aload_0        
        //   411: getfield        com/whatsapp/ContactPicker.G:Ljava/lang/String;
        //   414: astore          16
        //   416: aload           16
        //   418: ifnull          632
        //   421: aload_0        
        //   422: getfield        com/whatsapp/ContactPicker.G:Ljava/lang/String;
        //   425: invokevirtual   java/lang/String.length:()I
        //   428: istore          30
        //   430: iload           30
        //   432: ifle            632
        //   435: aload_0        
        //   436: new             Landroid/content/Intent;
        //   439: dup            
        //   440: aload_0        
        //   441: ldc_w           Lcom/whatsapp/Conversation;.class
        //   444: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   447: putfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   450: aload_0        
        //   451: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   454: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   457: bipush          92
        //   459: aaload         
        //   460: aload           7
        //   462: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   465: pop            
        //   466: aload_0        
        //   467: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   470: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   473: bipush          88
        //   475: aaload         
        //   476: aload_0        
        //   477: getfield        com/whatsapp/ContactPicker.P:B
        //   480: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;B)Landroid/content/Intent;
        //   483: pop            
        //   484: aload_0        
        //   485: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   488: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   491: bipush          83
        //   493: aaload         
        //   494: aload_0        
        //   495: getfield        com/whatsapp/ContactPicker.G:Ljava/lang/String;
        //   498: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   501: pop            
        //   502: aload_0        
        //   503: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   506: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   509: bipush          77
        //   511: aaload         
        //   512: iconst_1       
        //   513: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   516: pop            
        //   517: aload_0        
        //   518: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   521: astore          35
        //   523: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   526: bipush          84
        //   528: aaload         
        //   529: astore          36
        //   531: aload_0        
        //   532: getfield        com/whatsapp/ContactPicker.S:Z
        //   535: istore          37
        //   537: iconst_0       
        //   538: istore          38
        //   540: iload           37
        //   542: ifne            548
        //   545: iconst_1       
        //   546: istore          38
        //   548: aload           35
        //   550: aload           36
        //   552: iload           38
        //   554: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   557: pop            
        //   558: aload_0        
        //   559: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   562: ldc_w           335544320
        //   565: invokevirtual   android/content/Intent.addFlags:(I)Landroid/content/Intent;
        //   568: pop            
        //   569: aload_0        
        //   570: getfield        com/whatsapp/ContactPicker.S:Z
        //   573: istore          43
        //   575: iload           43
        //   577: ifeq            589
        //   580: aload_0        
        //   581: iconst_1       
        //   582: invokevirtual   com/whatsapp/ContactPicker.showDialog:(I)V
        //   585: iload_2        
        //   586: ifeq            44
        //   589: iconst_1       
        //   590: putstatic       com/whatsapp/Conversation.aB:Z
        //   593: aload_0        
        //   594: aload_0        
        //   595: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   598: invokevirtual   com/whatsapp/ContactPicker.startActivity:(Landroid/content/Intent;)V
        //   601: aload_0        
        //   602: invokevirtual   com/whatsapp/ContactPicker.finish:()V
        //   605: iconst_1       
        //   606: ireturn        
        //   607: astore          40
        //   609: aload           40
        //   611: athrow         
        //   612: astore          13
        //   614: aload           13
        //   616: athrow         
        //   617: astore          14
        //   619: aload           14
        //   621: athrow         
        //   622: astore          15
        //   624: aload           15
        //   626: athrow         
        //   627: astore          39
        //   629: aload           39
        //   631: athrow         
        //   632: aload_0        
        //   633: getfield        com/whatsapp/ContactPicker.U:Ljava/lang/String;
        //   636: ifnull          762
        //   639: aload_0        
        //   640: new             Landroid/content/Intent;
        //   643: dup            
        //   644: aload_0        
        //   645: ldc_w           Lcom/whatsapp/Conversation;.class
        //   648: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   651: putfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   654: aload_0        
        //   655: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   658: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   661: bipush          72
        //   663: aaload         
        //   664: aload           7
        //   666: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   669: pop            
        //   670: aload_0        
        //   671: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   674: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   677: bipush          89
        //   679: aaload         
        //   680: aload_0        
        //   681: getfield        com/whatsapp/ContactPicker.U:Ljava/lang/String;
        //   684: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   687: pop            
        //   688: aload_0        
        //   689: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   692: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   695: bipush          91
        //   697: aaload         
        //   698: aload_0        
        //   699: getfield        com/whatsapp/ContactPicker.p:Ljava/lang/String;
        //   702: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   705: pop            
        //   706: aload_0        
        //   707: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   710: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   713: bipush          90
        //   715: aaload         
        //   716: aload_0        
        //   717: getfield        com/whatsapp/ContactPicker.P:B
        //   720: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;B)Landroid/content/Intent;
        //   723: pop            
        //   724: aload_0        
        //   725: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   728: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   731: bipush          78
        //   733: aaload         
        //   734: iconst_1       
        //   735: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   738: pop            
        //   739: aload_0        
        //   740: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   743: ldc_w           335544320
        //   746: invokevirtual   android/content/Intent.addFlags:(I)Landroid/content/Intent;
        //   749: pop            
        //   750: aload_0        
        //   751: iconst_1       
        //   752: invokevirtual   com/whatsapp/ContactPicker.showDialog:(I)V
        //   755: iconst_1       
        //   756: ireturn        
        //   757: astore          17
        //   759: aload           17
        //   761: athrow         
        //   762: aload_0        
        //   763: getfield        com/whatsapp/ContactPicker.o:Z
        //   766: ifeq            808
        //   769: aload_0        
        //   770: new             Landroid/content/Intent;
        //   773: dup            
        //   774: invokespecial   android/content/Intent.<init>:()V
        //   777: putfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   780: aload_0        
        //   781: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   784: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   787: bipush          75
        //   789: aaload         
        //   790: aload           7
        //   792: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   795: pop            
        //   796: aload_0        
        //   797: iconst_2       
        //   798: invokevirtual   com/whatsapp/ContactPicker.showDialog:(I)V
        //   801: iconst_1       
        //   802: ireturn        
        //   803: astore          18
        //   805: aload           18
        //   807: athrow         
        //   808: aload_0        
        //   809: getfield        com/whatsapp/ContactPicker.q:Z
        //   812: ifeq            854
        //   815: aload_0        
        //   816: new             Landroid/content/Intent;
        //   819: dup            
        //   820: invokespecial   android/content/Intent.<init>:()V
        //   823: putfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   826: aload_0        
        //   827: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //   830: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   833: bipush          93
        //   835: aaload         
        //   836: aload           7
        //   838: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   841: pop            
        //   842: aload_0        
        //   843: iconst_3       
        //   844: invokevirtual   com/whatsapp/ContactPicker.showDialog:(I)V
        //   847: iconst_1       
        //   848: ireturn        
        //   849: astore          19
        //   851: aload           19
        //   853: athrow         
        //   854: new             Landroid/content/Intent;
        //   857: dup            
        //   858: invokespecial   android/content/Intent.<init>:()V
        //   861: astore          20
        //   863: aload           20
        //   865: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   868: bipush          79
        //   870: aaload         
        //   871: aload           7
        //   873: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   876: pop            
        //   877: aload_0        
        //   878: iconst_m1      
        //   879: aload           20
        //   881: invokevirtual   com/whatsapp/ContactPicker.setResult:(ILandroid/content/Intent;)V
        //   884: aload_0        
        //   885: invokevirtual   com/whatsapp/ContactPicker.finish:()V
        //   888: iconst_1       
        //   889: ireturn        
        //   890: iload           50
        //   892: istore          53
        //   894: goto            335
        //   897: iconst_1       
        //   898: istore          50
        //   900: goto            373
        //   903: iload           53
        //   905: istore          50
        //   907: goto            369
        //   910: iload           53
        //   912: istore          50
        //   914: goto            373
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  4      39     46     49     Ljava/lang/SecurityException;
        //  49     58     118    123    Ljava/lang/SecurityException;
        //  69     80     123    128    Ljava/lang/SecurityException;
        //  85     91     128    133    Ljava/lang/SecurityException;
        //  96     111    113    118    Ljava/lang/SecurityException;
        //  125    128    128    133    Ljava/lang/SecurityException;
        //  130    133    113    118    Ljava/lang/SecurityException;
        //  133    166    168    173    Ljava/lang/SecurityException;
        //  378    383    405    410    Ljava/lang/SecurityException;
        //  387    403    405    410    Ljava/lang/SecurityException;
        //  410    416    612    617    Ljava/lang/SecurityException;
        //  421    430    617    622    Ljava/lang/SecurityException;
        //  435    537    622    627    Ljava/lang/SecurityException;
        //  548    575    627    632    Ljava/lang/SecurityException;
        //  580    585    607    612    Ljava/lang/SecurityException;
        //  589    605    607    612    Ljava/lang/SecurityException;
        //  614    617    617    622    Ljava/lang/SecurityException;
        //  619    622    622    627    Ljava/lang/SecurityException;
        //  629    632    607    612    Ljava/lang/SecurityException;
        //  632    755    757    762    Ljava/lang/SecurityException;
        //  762    801    803    808    Ljava/lang/SecurityException;
        //  808    847    849    854    Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 460, Size: 460
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
    
    static ArrayList b(final ContactPicker contactPicker, final ArrayList w) {
        return contactPicker.W = w;
    }
    
    static HashMap b(final ContactPicker contactPicker) {
        return contactPicker.H;
    }
    
    private static boolean b(final a_9 a_9) {
        return ContactPicker.Z[51].equals(a_9.u);
    }
    
    static fh c(final ContactPicker contactPicker) {
        return contactPicker.r;
    }
    
    static boolean c(final a_9 a_9) {
        return b(a_9);
    }
    
    static void d(final ContactPicker contactPicker) {
        contactPicker.m();
    }
    
    private void d(final boolean b) {
        try {
            if (App.aX == null) {
                App.a((Context)this, 2131231129, 1);
                if (!App.I) {
                    return;
                }
            }
            this.setSupportProgressBarIndeterminateVisibility(true);
            bm.a(new ox(this, b));
        }
        catch (SecurityException ex) {
            throw ex;
        }
    }
    
    static boolean e(final ContactPicker contactPicker) {
        return contactPicker.J;
    }
    
    static fh f(final ContactPicker contactPicker) {
        return contactPicker.Y;
    }
    
    static ArrayList g(final ContactPicker contactPicker) {
        return contactPicker.N;
    }
    
    private void g() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: invokestatic    com/whatsapp/z8.j:()Ljava/util/ArrayList;
        //     7: astore_2       
        //     8: new             Ljava/util/ArrayList;
        //    11: dup            
        //    12: invokespecial   java/util/ArrayList.<init>:()V
        //    15: astore_3       
        //    16: aload_2        
        //    17: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    20: astore          4
        //    22: aload           4
        //    24: invokeinterface java/util/Iterator.hasNext:()Z
        //    29: ifeq            99
        //    32: aload           4
        //    34: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    39: checkcast       Ljava/lang/String;
        //    42: astore          15
        //    44: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    47: aload           15
        //    49: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    52: astore          16
        //    54: aload           16
        //    56: ifnull          95
        //    59: aload           16
        //    61: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //    64: astore          19
        //    66: aload           19
        //    68: ifnonnull       95
        //    71: aload           15
        //    73: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //    76: bipush          70
        //    78: aaload         
        //    79: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //    82: ifeq            95
        //    85: aload_3        
        //    86: aload           16
        //    88: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    91: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    94: pop            
        //    95: iload_1        
        //    96: ifeq            22
        //    99: aload_3        
        //   100: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   103: astore          5
        //   105: aload           5
        //   107: invokeinterface java/util/Iterator.hasNext:()Z
        //   112: ifeq            169
        //   115: aload           5
        //   117: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   122: checkcast       Ljava/lang/String;
        //   125: astore          12
        //   127: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   130: aload           12
        //   132: invokevirtual   com/whatsapp/wc.b:(Ljava/lang/String;)Ljava/util/ArrayList;
        //   135: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   138: astore          13
        //   140: aload           13
        //   142: invokeinterface java/util/Iterator.hasNext:()Z
        //   147: ifeq            165
        //   150: aload           13
        //   152: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   157: checkcast       Lcom/whatsapp/a_9;
        //   160: pop            
        //   161: iload_1        
        //   162: ifeq            140
        //   165: iload_1        
        //   166: ifeq            105
        //   169: aload_3        
        //   170: invokevirtual   java/util/ArrayList.size:()I
        //   173: ifle            257
        //   176: aload_3        
        //   177: iconst_0       
        //   178: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   181: checkcast       Ljava/lang/String;
        //   184: astore          6
        //   186: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   189: invokevirtual   com/whatsapp/wc.i:()Ljava/util/ArrayList;
        //   192: astore          7
        //   194: aload           7
        //   196: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   199: astore          8
        //   201: aload           8
        //   203: invokeinterface java/util/Iterator.hasNext:()Z
        //   208: ifeq            252
        //   211: aload           8
        //   213: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   218: checkcast       Lcom/whatsapp/a_9;
        //   221: astore          9
        //   223: aload           9
        //   225: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   228: ifnull          248
        //   231: aload           9
        //   233: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   236: aload           6
        //   238: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   241: istore          11
        //   243: iload           11
        //   245: ifeq            248
        //   248: iload_1        
        //   249: ifeq            201
        //   252: aload           7
        //   254: invokevirtual   java/util/ArrayList.clear:()V
        //   257: return         
        //   258: astore          17
        //   260: aload           17
        //   262: athrow         
        //   263: astore          18
        //   265: aload           18
        //   267: athrow         
        //   268: astore          10
        //   270: aload           10
        //   272: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  59     66     258    263    Ljava/lang/SecurityException;
        //  71     95     263    268    Ljava/lang/SecurityException;
        //  223    243    268    273    Ljava/lang/SecurityException;
        //  260    263    263    268    Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 113, Size: 113
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
    
    static fh h(final ContactPicker contactPicker) {
        return contactPicker.C;
    }
    
    static a_9 i() {
        return ContactPicker.X;
    }
    
    static void i(final ContactPicker contactPicker) {
        contactPicker.p();
    }
    
    static a_9 j() {
        return ContactPicker.A;
    }
    
    static boolean j(final ContactPicker contactPicker) {
        return contactPicker.L;
    }
    
    static Handler k(final ContactPicker contactPicker) {
        return contactPicker.D;
    }
    
    private void k() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/ContactPicker.w:Ljava/util/ArrayList;
        //     8: invokevirtual   java/util/ArrayList.clear:()V
        //    11: aload_0        
        //    12: getfield        com/whatsapp/ContactPicker.y:Ljava/util/ArrayList;
        //    15: invokevirtual   java/util/ArrayList.clear:()V
        //    18: aload_0        
        //    19: getfield        com/whatsapp/ContactPicker.N:Ljava/util/ArrayList;
        //    22: invokevirtual   java/util/ArrayList.clear:()V
        //    25: aload_0        
        //    26: getfield        com/whatsapp/ContactPicker.s:Z
        //    29: ifne            43
        //    32: aload_0        
        //    33: getfield        com/whatsapp/ContactPicker.n:Z
        //    36: istore          76
        //    38: iload           76
        //    40: ifeq            130
        //    43: aload_0        
        //    44: getfield        com/whatsapp/ContactPicker.B:Ljava/util/ArrayList;
        //    47: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    50: astore_3       
        //    51: aload_3        
        //    52: invokeinterface java/util/Iterator.hasNext:()Z
        //    57: ifeq            126
        //    60: aload_3        
        //    61: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    66: checkcast       Lcom/whatsapp/a_9;
        //    69: astore          69
        //    71: aload_0        
        //    72: getfield        com/whatsapp/ContactPicker.v:Ljava/util/Set;
        //    75: aload           69
        //    77: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    80: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //    85: istore          73
        //    87: iload           73
        //    89: ifne            122
        //    92: aload           69
        //    94: invokevirtual   com/whatsapp/a_9.m:()Z
        //    97: istore          74
        //    99: iload           74
        //   101: ifne            122
        //   104: aload           69
        //   106: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //   109: ifnull          122
        //   112: aload_0        
        //   113: getfield        com/whatsapp/ContactPicker.y:Ljava/util/ArrayList;
        //   116: aload           69
        //   118: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   121: pop            
        //   122: iload_1        
        //   123: ifeq            51
        //   126: iload_1        
        //   127: ifeq            385
        //   130: aload_0        
        //   131: getfield        com/whatsapp/ContactPicker.u:Z
        //   134: istore          42
        //   136: iload           42
        //   138: ifeq            204
        //   141: aload_0        
        //   142: getfield        com/whatsapp/ContactPicker.B:Ljava/util/ArrayList;
        //   145: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   148: astore          65
        //   150: aload           65
        //   152: invokeinterface java/util/Iterator.hasNext:()Z
        //   157: ifeq            200
        //   160: aload           65
        //   162: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   167: checkcast       Lcom/whatsapp/a_9;
        //   170: astore          66
        //   172: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   175: aload           66
        //   177: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   180: invokevirtual   com/whatsapp/vy.i:(Ljava/lang/String;)Z
        //   183: ifeq            196
        //   186: aload_0        
        //   187: getfield        com/whatsapp/ContactPicker.w:Ljava/util/ArrayList;
        //   190: aload           66
        //   192: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   195: pop            
        //   196: iload_1        
        //   197: ifeq            150
        //   200: iload_1        
        //   201: ifeq            385
        //   204: aload_0        
        //   205: getfield        com/whatsapp/ContactPicker.B:Ljava/util/ArrayList;
        //   208: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   211: astore          43
        //   213: aload           43
        //   215: invokeinterface java/util/Iterator.hasNext:()Z
        //   220: ifeq            385
        //   223: aload           43
        //   225: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   230: checkcast       Lcom/whatsapp/a_9;
        //   233: astore          44
        //   235: aload           44
        //   237: invokevirtual   com/whatsapp/a_9.m:()Z
        //   240: istore          47
        //   242: iload           47
        //   244: ifne            265
        //   247: aload           44
        //   249: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //   252: ifnull          265
        //   255: aload_0        
        //   256: getfield        com/whatsapp/ContactPicker.y:Ljava/util/ArrayList;
        //   259: aload           44
        //   261: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   264: pop            
        //   265: aload           44
        //   267: invokevirtual   com/whatsapp/a_9.m:()Z
        //   270: istore          51
        //   272: iload           51
        //   274: ifeq            307
        //   277: aload           44
        //   279: invokevirtual   com/whatsapp/a_9.o:()Z
        //   282: istore          62
        //   284: iload           62
        //   286: ifne            307
        //   289: aload           44
        //   291: getfield        com/whatsapp/a_9.t:Ljava/lang/String;
        //   294: ifnull          307
        //   297: aload_0        
        //   298: getfield        com/whatsapp/ContactPicker.N:Ljava/util/ArrayList;
        //   301: aload           44
        //   303: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   306: pop            
        //   307: aload           44
        //   309: invokevirtual   com/whatsapp/a_9.m:()Z
        //   312: istore          57
        //   314: iload           57
        //   316: ifeq            357
        //   319: aload           44
        //   321: invokevirtual   com/whatsapp/a_9.o:()Z
        //   324: istore          59
        //   326: iload           59
        //   328: ifne            381
        //   331: aload           44
        //   333: getfield        com/whatsapp/a_9.t:Ljava/lang/String;
        //   336: astore          60
        //   338: aload           60
        //   340: ifnull          381
        //   343: aload_0        
        //   344: getfield        com/whatsapp/ContactPicker.w:Ljava/util/ArrayList;
        //   347: aload           44
        //   349: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   352: pop            
        //   353: iload_1        
        //   354: ifeq            381
        //   357: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   360: aload           44
        //   362: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   365: invokevirtual   com/whatsapp/vy.i:(Ljava/lang/String;)Z
        //   368: ifeq            381
        //   371: aload_0        
        //   372: getfield        com/whatsapp/ContactPicker.w:Ljava/util/ArrayList;
        //   375: aload           44
        //   377: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   380: pop            
        //   381: iload_1        
        //   382: ifeq            213
        //   385: aload_0        
        //   386: getfield        com/whatsapp/ContactPicker.w:Ljava/util/ArrayList;
        //   389: new             Lcom/whatsapp/a6m;
        //   392: dup            
        //   393: aload_0        
        //   394: invokevirtual   com/whatsapp/ContactPicker.getApplicationContext:()Landroid/content/Context;
        //   397: invokespecial   com/whatsapp/a6m.<init>:(Landroid/content/Context;)V
        //   400: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //   403: aload_0        
        //   404: getfield        com/whatsapp/ContactPicker.y:Ljava/util/ArrayList;
        //   407: new             Lcom/whatsapp/mg;
        //   410: dup            
        //   411: aload_0        
        //   412: invokevirtual   com/whatsapp/ContactPicker.getApplicationContext:()Landroid/content/Context;
        //   415: invokespecial   com/whatsapp/mg.<init>:(Landroid/content/Context;)V
        //   418: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //   421: aload_0        
        //   422: getfield        com/whatsapp/ContactPicker.N:Ljava/util/ArrayList;
        //   425: new             Lcom/whatsapp/mg;
        //   428: dup            
        //   429: aload_0        
        //   430: invokevirtual   com/whatsapp/ContactPicker.getApplicationContext:()Landroid/content/Context;
        //   433: invokespecial   com/whatsapp/mg.<init>:(Landroid/content/Context;)V
        //   436: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //   439: aload_0        
        //   440: getfield        com/whatsapp/ContactPicker.m:Z
        //   443: istore          9
        //   445: iload           9
        //   447: ifne            549
        //   450: aload_0        
        //   451: getfield        com/whatsapp/ContactPicker.o:Z
        //   454: istore          35
        //   456: iload           35
        //   458: ifne            549
        //   461: aload_0        
        //   462: getfield        com/whatsapp/ContactPicker.L:Z
        //   465: istore          36
        //   467: iload           36
        //   469: ifne            549
        //   472: aload_0        
        //   473: getfield        com/whatsapp/ContactPicker.q:Z
        //   476: istore          37
        //   478: iload           37
        //   480: ifne            549
        //   483: aload_0        
        //   484: getfield        com/whatsapp/ContactPicker.y:Ljava/util/ArrayList;
        //   487: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   490: ifne            549
        //   493: aload_0        
        //   494: invokevirtual   com/whatsapp/ContactPicker.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //   497: astore          38
        //   499: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //   502: ldc_w           2131296284
        //   505: aload_0        
        //   506: getfield        com/whatsapp/ContactPicker.y:Ljava/util/ArrayList;
        //   509: invokevirtual   java/util/ArrayList.size:()I
        //   512: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //   515: astore          39
        //   517: iconst_1       
        //   518: anewarray       Ljava/lang/Object;
        //   521: astore          40
        //   523: aload           40
        //   525: iconst_0       
        //   526: aload_0        
        //   527: getfield        com/whatsapp/ContactPicker.y:Ljava/util/ArrayList;
        //   530: invokevirtual   java/util/ArrayList.size:()I
        //   533: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   536: aastore        
        //   537: aload           38
        //   539: aload           39
        //   541: aload           40
        //   543: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   546: invokevirtual   android/support/v7/app/ActionBar.setSubtitle:(Ljava/lang/CharSequence;)V
        //   549: aload_0        
        //   550: getfield        com/whatsapp/ContactPicker.w:Ljava/util/ArrayList;
        //   553: invokevirtual   java/util/ArrayList.size:()I
        //   556: ifne            570
        //   559: aload_0        
        //   560: getfield        com/whatsapp/ContactPicker.w:Ljava/util/ArrayList;
        //   563: getstatic       com/whatsapp/ContactPicker.x:Lcom/whatsapp/a_9;
        //   566: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   569: pop            
        //   570: aload_0        
        //   571: getfield        com/whatsapp/ContactPicker.y:Ljava/util/ArrayList;
        //   574: invokevirtual   java/util/ArrayList.size:()I
        //   577: ifne            591
        //   580: aload_0        
        //   581: getfield        com/whatsapp/ContactPicker.y:Ljava/util/ArrayList;
        //   584: getstatic       com/whatsapp/ContactPicker.x:Lcom/whatsapp/a_9;
        //   587: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   590: pop            
        //   591: aload_0        
        //   592: getfield        com/whatsapp/ContactPicker.N:Ljava/util/ArrayList;
        //   595: invokevirtual   java/util/ArrayList.size:()I
        //   598: ifne            612
        //   601: aload_0        
        //   602: getfield        com/whatsapp/ContactPicker.N:Ljava/util/ArrayList;
        //   605: getstatic       com/whatsapp/ContactPicker.x:Lcom/whatsapp/a_9;
        //   608: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   611: pop            
        //   612: aload_0        
        //   613: getfield        com/whatsapp/ContactPicker.s:Z
        //   616: istore          20
        //   618: iload           20
        //   620: ifne            751
        //   623: aload_0        
        //   624: getfield        com/whatsapp/ContactPicker.n:Z
        //   627: istore          21
        //   629: iload           21
        //   631: ifne            751
        //   634: aload_0        
        //   635: getfield        com/whatsapp/ContactPicker.u:Z
        //   638: istore          22
        //   640: iload           22
        //   642: ifne            751
        //   645: aload_0        
        //   646: getfield        com/whatsapp/ContactPicker.m:Z
        //   649: istore          23
        //   651: iload           23
        //   653: ifne            751
        //   656: aload_0        
        //   657: getfield        com/whatsapp/ContactPicker.o:Z
        //   660: istore          24
        //   662: iload           24
        //   664: ifne            751
        //   667: aload_0        
        //   668: getfield        com/whatsapp/ContactPicker.L:Z
        //   671: istore          25
        //   673: iload           25
        //   675: ifne            751
        //   678: aload_0        
        //   679: getfield        com/whatsapp/ContactPicker.W:Ljava/util/ArrayList;
        //   682: ifnonnull       751
        //   685: aload_0        
        //   686: getfield        com/whatsapp/ContactPicker.w:Ljava/util/ArrayList;
        //   689: getstatic       com/whatsapp/ContactPicker.X:Lcom/whatsapp/a_9;
        //   692: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   695: pop            
        //   696: aload_0        
        //   697: getfield        com/whatsapp/ContactPicker.w:Ljava/util/ArrayList;
        //   700: getstatic       com/whatsapp/ContactPicker.A:Lcom/whatsapp/a_9;
        //   703: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   706: pop            
        //   707: aload_0        
        //   708: getfield        com/whatsapp/ContactPicker.y:Ljava/util/ArrayList;
        //   711: getstatic       com/whatsapp/ContactPicker.X:Lcom/whatsapp/a_9;
        //   714: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   717: pop            
        //   718: aload_0        
        //   719: getfield        com/whatsapp/ContactPicker.y:Ljava/util/ArrayList;
        //   722: getstatic       com/whatsapp/ContactPicker.A:Lcom/whatsapp/a_9;
        //   725: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   728: pop            
        //   729: aload_0        
        //   730: getfield        com/whatsapp/ContactPicker.N:Ljava/util/ArrayList;
        //   733: getstatic       com/whatsapp/ContactPicker.X:Lcom/whatsapp/a_9;
        //   736: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   739: pop            
        //   740: aload_0        
        //   741: getfield        com/whatsapp/ContactPicker.N:Ljava/util/ArrayList;
        //   744: getstatic       com/whatsapp/ContactPicker.A:Lcom/whatsapp/a_9;
        //   747: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   750: pop            
        //   751: return         
        //   752: astore_2       
        //   753: aload_2        
        //   754: athrow         
        //   755: astore          70
        //   757: aload           70
        //   759: athrow         
        //   760: astore          71
        //   762: aload           71
        //   764: athrow         
        //   765: astore          72
        //   767: aload           72
        //   769: athrow         
        //   770: astore          41
        //   772: aload           41
        //   774: athrow         
        //   775: astore          67
        //   777: aload           67
        //   779: athrow         
        //   780: astore          45
        //   782: aload           45
        //   784: athrow         
        //   785: astore          46
        //   787: aload           46
        //   789: athrow         
        //   790: astore          48
        //   792: aload           48
        //   794: athrow         
        //   795: astore          49
        //   797: aload           49
        //   799: athrow         
        //   800: astore          50
        //   802: aload           50
        //   804: athrow         
        //   805: astore          52
        //   807: aload           52
        //   809: athrow         
        //   810: astore          53
        //   812: aload           53
        //   814: athrow         
        //   815: astore          54
        //   817: aload           54
        //   819: athrow         
        //   820: astore          55
        //   822: aload           55
        //   824: athrow         
        //   825: astore          56
        //   827: aload           56
        //   829: athrow         
        //   830: astore          4
        //   832: aload           4
        //   834: athrow         
        //   835: astore          5
        //   837: aload           5
        //   839: athrow         
        //   840: astore          6
        //   842: aload           6
        //   844: athrow         
        //   845: astore          7
        //   847: aload           7
        //   849: athrow         
        //   850: astore          8
        //   852: aload           8
        //   854: athrow         
        //   855: astore          10
        //   857: aload           10
        //   859: athrow         
        //   860: astore          11
        //   862: aload           11
        //   864: athrow         
        //   865: astore          12
        //   867: aload           12
        //   869: athrow         
        //   870: astore          13
        //   872: aload           13
        //   874: athrow         
        //   875: astore          14
        //   877: aload           14
        //   879: athrow         
        //   880: astore          15
        //   882: aload           15
        //   884: athrow         
        //   885: astore          16
        //   887: aload           16
        //   889: athrow         
        //   890: astore          17
        //   892: aload           17
        //   894: athrow         
        //   895: astore          18
        //   897: aload           18
        //   899: athrow         
        //   900: astore          19
        //   902: aload           19
        //   904: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  4      38     752    755    Ljava/lang/SecurityException;
        //  71     87     755    760    Ljava/lang/SecurityException;
        //  92     99     760    765    Ljava/lang/SecurityException;
        //  104    122    765    770    Ljava/lang/SecurityException;
        //  130    136    770    775    Ljava/lang/SecurityException;
        //  172    196    775    780    Ljava/lang/SecurityException;
        //  235    242    780    785    Ljava/lang/SecurityException;
        //  247    265    785    790    Ljava/lang/SecurityException;
        //  265    272    790    795    Ljava/lang/SecurityException;
        //  277    284    795    800    Ljava/lang/SecurityException;
        //  289    307    800    805    Ljava/lang/SecurityException;
        //  307    314    805    810    Ljava/lang/SecurityException;
        //  319    326    810    815    Ljava/lang/SecurityException;
        //  331    338    815    820    Ljava/lang/SecurityException;
        //  343    353    820    825    Ljava/lang/SecurityException;
        //  357    381    825    830    Ljava/lang/SecurityException;
        //  385    445    830    835    Ljava/lang/SecurityException;
        //  450    456    835    840    Ljava/lang/SecurityException;
        //  461    467    840    845    Ljava/lang/SecurityException;
        //  472    478    845    850    Ljava/lang/SecurityException;
        //  483    549    850    855    Ljava/lang/SecurityException;
        //  549    570    855    860    Ljava/lang/SecurityException;
        //  570    591    860    865    Ljava/lang/SecurityException;
        //  591    612    865    870    Ljava/lang/SecurityException;
        //  612    618    870    875    Ljava/lang/SecurityException;
        //  623    629    875    880    Ljava/lang/SecurityException;
        //  634    640    880    885    Ljava/lang/SecurityException;
        //  645    651    885    890    Ljava/lang/SecurityException;
        //  656    662    890    895    Ljava/lang/SecurityException;
        //  667    673    895    900    Ljava/lang/SecurityException;
        //  678    751    900    905    Ljava/lang/SecurityException;
        //  757    760    760    765    Ljava/lang/SecurityException;
        //  762    765    765    770    Ljava/lang/SecurityException;
        //  782    785    785    790    Ljava/lang/SecurityException;
        //  792    795    795    800    Ljava/lang/SecurityException;
        //  797    800    800    805    Ljava/lang/SecurityException;
        //  807    810    810    815    Ljava/lang/SecurityException;
        //  812    815    815    820    Ljava/lang/SecurityException;
        //  817    820    820    825    Ljava/lang/SecurityException;
        //  822    825    825    830    Ljava/lang/SecurityException;
        //  832    835    835    840    Ljava/lang/SecurityException;
        //  837    840    840    845    Ljava/lang/SecurityException;
        //  842    845    845    850    Ljava/lang/SecurityException;
        //  847    850    850    855    Ljava/lang/SecurityException;
        //  872    875    875    880    Ljava/lang/SecurityException;
        //  877    880    880    885    Ljava/lang/SecurityException;
        //  882    885    885    890    Ljava/lang/SecurityException;
        //  887    890    890    895    Ljava/lang/SecurityException;
        //  892    895    895    900    Ljava/lang/SecurityException;
        //  897    900    900    905    Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 418, Size: 418
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
    
    private void l() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/ContactPicker.B:Ljava/util/ArrayList;
        //     8: astore_2       
        //     9: aload_2        
        //    10: monitorenter   
        //    11: aload_0        
        //    12: getfield        com/whatsapp/ContactPicker.q:Z
        //    15: istore          4
        //    17: iload           4
        //    19: ifeq            36
        //    22: aload_0        
        //    23: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    26: invokevirtual   com/whatsapp/wc.b:()Ljava/util/ArrayList;
        //    29: putfield        com/whatsapp/ContactPicker.B:Ljava/util/ArrayList;
        //    32: iload_1        
        //    33: ifeq            78
        //    36: aload_0        
        //    37: getfield        com/whatsapp/ContactPicker.B:Ljava/util/ArrayList;
        //    40: invokevirtual   java/util/ArrayList.clear:()V
        //    43: aload_0        
        //    44: getfield        com/whatsapp/ContactPicker.J:Z
        //    47: istore          8
        //    49: iload           8
        //    51: ifne            68
        //    54: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    57: aload_0        
        //    58: getfield        com/whatsapp/ContactPicker.B:Ljava/util/ArrayList;
        //    61: invokevirtual   com/whatsapp/wc.c:(Ljava/util/ArrayList;)V
        //    64: iload_1        
        //    65: ifeq            78
        //    68: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    71: aload_0        
        //    72: getfield        com/whatsapp/ContactPicker.B:Ljava/util/ArrayList;
        //    75: invokevirtual   com/whatsapp/wc.b:(Ljava/util/ArrayList;)V
        //    78: aload_0        
        //    79: getfield        com/whatsapp/ContactPicker.W:Ljava/util/ArrayList;
        //    82: ifnull          97
        //    85: aload_0        
        //    86: aload_0        
        //    87: getfield        com/whatsapp/ContactPicker.W:Ljava/util/ArrayList;
        //    90: invokespecial   com/whatsapp/ContactPicker.a:(Ljava/util/ArrayList;)V
        //    93: iload_1        
        //    94: ifeq            101
        //    97: aload_0        
        //    98: invokespecial   com/whatsapp/ContactPicker.k:()V
        //   101: aload_2        
        //   102: monitorexit    
        //   103: return         
        //   104: astore          5
        //   106: aload           5
        //   108: athrow         
        //   109: astore          6
        //   111: aload           6
        //   113: athrow         
        //   114: astore          7
        //   116: aload           7
        //   118: athrow         
        //   119: astore_3       
        //   120: aload_2        
        //   121: monitorexit    
        //   122: aload_3        
        //   123: athrow         
        //   124: astore          9
        //   126: aload           9
        //   128: athrow         
        //   129: astore          10
        //   131: aload           10
        //   133: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  11     17     119    124    Any
        //  22     32     104    109    Ljava/lang/SecurityException;
        //  22     32     119    124    Any
        //  36     49     104    109    Ljava/lang/SecurityException;
        //  36     49     119    124    Any
        //  54     64     109    114    Ljava/lang/SecurityException;
        //  54     64     119    124    Any
        //  68     78     114    119    Ljava/lang/SecurityException;
        //  68     78     119    124    Any
        //  78     93     124    129    Ljava/lang/SecurityException;
        //  78     93     119    124    Any
        //  97     101    129    134    Ljava/lang/SecurityException;
        //  97     101    119    124    Any
        //  101    103    119    124    Any
        //  106    109    109    114    Ljava/lang/SecurityException;
        //  106    109    119    124    Any
        //  111    114    114    119    Ljava/lang/SecurityException;
        //  111    114    119    124    Any
        //  116    119    119    124    Any
        //  120    122    119    124    Any
        //  126    129    129    134    Ljava/lang/SecurityException;
        //  126    129    119    124    Any
        //  131    134    119    124    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 70, Size: 70
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    static void l(final ContactPicker contactPicker) {
        contactPicker.g();
    }
    
    private void m() {
        this.startActivity(new Intent((Context)this, (Class)ContactPickerHelp.class));
    }
    
    static boolean m(final ContactPicker contactPicker) {
        return contactPicker.q;
    }
    
    static a_9 n() {
        return ContactPicker.x;
    }
    
    static boolean n(final ContactPicker contactPicker) {
        return contactPicker.o;
    }
    
    static a_9 o(final ContactPicker contactPicker) {
        return contactPicker.F;
    }
    
    private void o() {
        this.Y.notifyDataSetChanged();
        this.r.notifyDataSetChanged();
        this.C.notifyDataSetChanged();
    }
    
    static ArrayList p(final ContactPicker contactPicker) {
        return contactPicker.W;
    }
    
    private void p() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/ContactPicker.K:Landroid/support/v7/view/ActionMode;
        //     4: astore          4
        //     6: aload           4
        //     8: ifnull          59
        //    11: aload_0        
        //    12: getfield        com/whatsapp/ContactPicker.H:Ljava/util/HashMap;
        //    15: invokevirtual   java/util/HashMap.size:()I
        //    18: istore          5
        //    20: iload           5
        //    22: ifne            38
        //    25: aload_0        
        //    26: getfield        com/whatsapp/ContactPicker.K:Landroid/support/v7/view/ActionMode;
        //    29: invokevirtual   android/support/v7/view/ActionMode.finish:()V
        //    32: getstatic       com/whatsapp/App.I:Z
        //    35: ifeq            59
        //    38: aload_0        
        //    39: getfield        com/whatsapp/ContactPicker.K:Landroid/support/v7/view/ActionMode;
        //    42: invokestatic    java/text/NumberFormat.getInstance:()Ljava/text/NumberFormat;
        //    45: aload_0        
        //    46: getfield        com/whatsapp/ContactPicker.H:Ljava/util/HashMap;
        //    49: invokevirtual   java/util/HashMap.size:()I
        //    52: i2l            
        //    53: invokevirtual   java/text/NumberFormat.format:(J)Ljava/lang/String;
        //    56: invokevirtual   android/support/v7/view/ActionMode.setTitle:(Ljava/lang/CharSequence;)V
        //    59: return         
        //    60: astore_1       
        //    61: aload_1        
        //    62: athrow         
        //    63: astore_2       
        //    64: aload_2        
        //    65: athrow         
        //    66: astore_3       
        //    67: aload_3        
        //    68: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  0      6      60     63     Ljava/lang/SecurityException;
        //  11     20     63     66     Ljava/lang/SecurityException;
        //  25     38     66     69     Ljava/lang/SecurityException;
        //  38     59     66     69     Ljava/lang/SecurityException;
        //  61     63     63     66     Ljava/lang/SecurityException;
        //  64     66     66     69     Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 35, Size: 35
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
    
    static Intent q(final ContactPicker contactPicker) {
        return contactPicker.I;
    }
    
    static void r(final ContactPicker contactPicker) {
        contactPicker.k();
    }
    
    static a9q s(final ContactPicker contactPicker) {
        return contactPicker.O;
    }
    
    static ArrayList t(final ContactPicker contactPicker) {
        return contactPicker.y;
    }
    
    static void u(final ContactPicker contactPicker) {
        contactPicker.l();
    }
    
    static boolean v(final ContactPicker contactPicker) {
        return contactPicker.s;
    }
    
    static void w(final ContactPicker contactPicker) {
        contactPicker.o();
    }
    
    static boolean x(final ContactPicker contactPicker) {
        return contactPicker.m;
    }
    
    static boolean y(final ContactPicker contactPicker) {
        return contactPicker.u;
    }
    
    @Override
    public void a() {
        try {
            if (!ContactPicker.l) {
                this.l();
                this.o();
                this.setSupportProgressBarIndeterminateVisibility(com.whatsapp.contact.f.c());
            }
        }
        catch (SecurityException ex) {
            throw ex;
        }
    }
    
    @Override
    public void a(final String s) {
    }
    
    @Override
    public void a(final Collection collection) {
        this.o();
    }
    
    @Override
    protected void b() {
        try {
            this.o();
            ContactPicker.l = false;
            if (App.w((Context)this) != this.R) {
                this.R = App.w((Context)this);
                this.a();
            }
        }
        catch (SecurityException ex) {
            throw ex;
        }
    }
    
    @Override
    public void b(final String s) {
        final a_9 e = App.S.e(s);
        if (e == null) {
            return;
        }
        final rq rq = new rq(e);
        try {
            if (a_9.a(this.B, rq)) {
                this.o();
            }
        }
        catch (SecurityException ex) {
            throw ex;
        }
    }
    
    @Override
    public void c(final String s) {
        final a_9 e = App.S.e(s);
        if (e == null) {
            return;
        }
        final q4 q4 = new q4(e);
        try {
            if (a_9.a(this.B, q4)) {
                this.o();
            }
        }
        catch (SecurityException ex) {
            throw ex;
        }
    }
    
    @Override
    public void d(final String s) {
        final a_9 e = App.S.e(s);
        if (e == null) {
            return;
        }
        final rw rw = new rw(e);
        try {
            if (a_9.a(this.B, rw)) {
                this.o();
            }
        }
        catch (SecurityException ex) {
            throw ex;
        }
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        }
        catch (IllegalArgumentException ex) {
            return false;
        }
    }
    
    @Override
    protected void f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: invokevirtual   com/whatsapp/ContactPicker.getIntent:()Landroid/content/Intent;
        //     8: astore_2       
        //     9: aload_2        
        //    10: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //    13: ifnull          44
        //    16: aload_2        
        //    17: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //    20: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //    23: iconst_4       
        //    24: aaload         
        //    25: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    28: istore          131
        //    30: iload           131
        //    32: ifeq            44
        //    35: aload_0        
        //    36: iconst_1       
        //    37: putfield        com/whatsapp/ContactPicker.m:Z
        //    40: iload_1        
        //    41: ifeq            2539
        //    44: aload_2        
        //    45: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //    48: iconst_3       
        //    49: aaload         
        //    50: iconst_0       
        //    51: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //    54: istore          12
        //    56: iload           12
        //    58: ifeq            70
        //    61: aload_0        
        //    62: iconst_1       
        //    63: putfield        com/whatsapp/ContactPicker.J:Z
        //    66: iload_1        
        //    67: ifeq            2539
        //    70: aload_2        
        //    71: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //    74: bipush          9
        //    76: aaload         
        //    77: iconst_0       
        //    78: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //    81: istore          13
        //    83: iload           13
        //    85: ifeq            97
        //    88: aload_0        
        //    89: iconst_1       
        //    90: putfield        com/whatsapp/ContactPicker.o:Z
        //    93: iload_1        
        //    94: ifeq            2539
        //    97: aload_2        
        //    98: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   101: iconst_5       
        //   102: aaload         
        //   103: iconst_0       
        //   104: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   107: istore          14
        //   109: iload           14
        //   111: ifeq            133
        //   114: aload_0        
        //   115: invokevirtual   com/whatsapp/ContactPicker.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //   118: ldc_w           2131230933
        //   121: invokevirtual   android/support/v7/app/ActionBar.setTitle:(I)V
        //   124: aload_0        
        //   125: iconst_1       
        //   126: putfield        com/whatsapp/ContactPicker.q:Z
        //   129: iload_1        
        //   130: ifeq            2539
        //   133: aload_2        
        //   134: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   137: bipush          41
        //   139: aaload         
        //   140: iconst_0       
        //   141: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   144: istore          15
        //   146: iload           15
        //   148: ifeq            254
        //   151: aload_0        
        //   152: iconst_1       
        //   153: putfield        com/whatsapp/ContactPicker.s:Z
        //   156: aload_0        
        //   157: iconst_0       
        //   158: putfield        com/whatsapp/ContactPicker.S:Z
        //   161: aload_2        
        //   162: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   165: bipush          44
        //   167: aaload         
        //   168: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   171: astore          122
        //   173: aload           122
        //   175: ifnull          250
        //   178: aload           122
        //   180: invokevirtual   java/lang/String.length:()I
        //   183: istore          124
        //   185: iload           124
        //   187: iconst_1       
        //   188: if_icmple       250
        //   191: aload           122
        //   193: ldc_w           ","
        //   196: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   199: astore          125
        //   201: aload           125
        //   203: arraylength    
        //   204: istore          126
        //   206: iconst_0       
        //   207: istore          127
        //   209: iload           127
        //   211: iload           126
        //   213: if_icmpge       250
        //   216: aload           125
        //   218: iload           127
        //   220: aaload         
        //   221: astore          128
        //   223: aload           128
        //   225: invokevirtual   java/lang/String.length:()I
        //   228: ifle            243
        //   231: aload_0        
        //   232: getfield        com/whatsapp/ContactPicker.v:Ljava/util/Set;
        //   235: aload           128
        //   237: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   242: pop            
        //   243: iinc            127, 1
        //   246: iload_1        
        //   247: ifeq            209
        //   250: iload_1        
        //   251: ifeq            2539
        //   254: aload_2        
        //   255: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   258: bipush          22
        //   260: aaload         
        //   261: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   264: astore          21
        //   266: aload_0        
        //   267: aload           21
        //   269: putfield        com/whatsapp/ContactPicker.E:Ljava/lang/String;
        //   272: aload           21
        //   274: ifnull          305
        //   277: aload_0        
        //   278: iconst_1       
        //   279: putfield        com/whatsapp/ContactPicker.s:Z
        //   282: aload_0        
        //   283: iconst_1       
        //   284: putfield        com/whatsapp/ContactPicker.S:Z
        //   287: aload_0        
        //   288: aload_0        
        //   289: getfield        com/whatsapp/ContactPicker.E:Ljava/lang/String;
        //   292: invokestatic    com/whatsapp/adc.a:(Ljava/lang/String;)Lcom/whatsapp/atf;
        //   295: invokevirtual   com/whatsapp/atf.l:()Ljava/util/Set;
        //   298: putfield        com/whatsapp/ContactPicker.v:Ljava/util/Set;
        //   301: iload_1        
        //   302: ifeq            2539
        //   305: aload_2        
        //   306: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   309: bipush          34
        //   311: aaload         
        //   312: iconst_0       
        //   313: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   316: istore          22
        //   318: iload           22
        //   320: ifeq            342
        //   323: aload_0        
        //   324: invokevirtual   com/whatsapp/ContactPicker.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //   327: ldc_w           2131230932
        //   330: invokevirtual   android/support/v7/app/ActionBar.setTitle:(I)V
        //   333: aload_0        
        //   334: iconst_1       
        //   335: putfield        com/whatsapp/ContactPicker.u:Z
        //   338: iload_1        
        //   339: ifeq            2539
        //   342: aload_2        
        //   343: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   346: bipush          17
        //   348: aaload         
        //   349: iconst_0       
        //   350: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   353: istore          23
        //   355: iload           23
        //   357: ifeq            458
        //   360: aload_0        
        //   361: iconst_1       
        //   362: putfield        com/whatsapp/ContactPicker.n:Z
        //   365: aload_2        
        //   366: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   369: bipush          10
        //   371: aaload         
        //   372: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   375: astore          113
        //   377: aload           113
        //   379: ifnull          454
        //   382: aload           113
        //   384: invokevirtual   java/lang/String.length:()I
        //   387: istore          115
        //   389: iload           115
        //   391: iconst_1       
        //   392: if_icmple       454
        //   395: aload           113
        //   397: ldc_w           ","
        //   400: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   403: astore          116
        //   405: aload           116
        //   407: arraylength    
        //   408: istore          117
        //   410: iconst_0       
        //   411: istore          118
        //   413: iload           118
        //   415: iload           117
        //   417: if_icmpge       454
        //   420: aload           116
        //   422: iload           118
        //   424: aaload         
        //   425: astore          119
        //   427: aload           119
        //   429: invokevirtual   java/lang/String.length:()I
        //   432: ifle            447
        //   435: aload_0        
        //   436: getfield        com/whatsapp/ContactPicker.v:Ljava/util/Set;
        //   439: aload           119
        //   441: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   446: pop            
        //   447: iinc            118, 1
        //   450: iload_1        
        //   451: ifeq            413
        //   454: iload_1        
        //   455: ifeq            2539
        //   458: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   461: bipush          30
        //   463: aaload         
        //   464: aload_2        
        //   465: invokevirtual   android/content/Intent.getScheme:()Ljava/lang/String;
        //   468: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   471: istore          25
        //   473: iload           25
        //   475: ifeq            707
        //   478: aload_2        
        //   479: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   482: astore          106
        //   484: aload           106
        //   486: ifnull          682
        //   489: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   492: bipush          47
        //   494: aaload         
        //   495: aload           106
        //   497: invokevirtual   android/net/Uri.getHost:()Ljava/lang/String;
        //   500: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   503: istore          111
        //   505: iload           111
        //   507: ifeq            682
        //   510: aload_0        
        //   511: iconst_0       
        //   512: putfield        com/whatsapp/ContactPicker.P:B
        //   515: aload_0        
        //   516: aload           106
        //   518: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   521: bipush          16
        //   523: aaload         
        //   524: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //   527: putfield        com/whatsapp/ContactPicker.G:Ljava/lang/String;
        //   530: aload_0        
        //   531: getfield        com/whatsapp/ContactPicker.G:Ljava/lang/String;
        //   534: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   537: istore          112
        //   539: iload           112
        //   541: ifeq            668
        //   544: aload_0        
        //   545: invokevirtual   com/whatsapp/ContactPicker.getBaseContext:()Landroid/content/Context;
        //   548: ldc_w           2131231735
        //   551: iconst_0       
        //   552: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   555: aload_0        
        //   556: invokevirtual   com/whatsapp/ContactPicker.finish:()V
        //   559: return         
        //   560: astore_3       
        //   561: aload_3        
        //   562: athrow         
        //   563: astore          4
        //   565: aload           4
        //   567: athrow         
        //   568: astore          5
        //   570: aload           5
        //   572: athrow         
        //   573: astore          6
        //   575: aload           6
        //   577: athrow         
        //   578: astore          7
        //   580: aload           7
        //   582: athrow         
        //   583: astore          8
        //   585: aload           8
        //   587: athrow         
        //   588: astore          9
        //   590: aload           9
        //   592: athrow         
        //   593: astore          10
        //   595: aload           10
        //   597: athrow         
        //   598: astore          11
        //   600: aload           11
        //   602: athrow         
        //   603: astore          123
        //   605: aload           123
        //   607: athrow         
        //   608: astore          129
        //   610: aload           129
        //   612: athrow         
        //   613: astore          16
        //   615: aload           16
        //   617: athrow         
        //   618: astore          17
        //   620: aload           17
        //   622: athrow         
        //   623: astore          18
        //   625: aload           18
        //   627: athrow         
        //   628: astore          19
        //   630: aload           19
        //   632: athrow         
        //   633: astore          20
        //   635: aload           20
        //   637: athrow         
        //   638: astore          114
        //   640: aload           114
        //   642: athrow         
        //   643: astore          120
        //   645: aload           120
        //   647: athrow         
        //   648: astore          24
        //   650: aload           24
        //   652: athrow         
        //   653: astore          108
        //   655: aload           108
        //   657: athrow         
        //   658: astore          109
        //   660: aload           109
        //   662: athrow         
        //   663: astore          110
        //   665: aload           110
        //   667: athrow         
        //   668: aload_0        
        //   669: iconst_0       
        //   670: putfield        com/whatsapp/ContactPicker.S:Z
        //   673: aload_0        
        //   674: iconst_1       
        //   675: putfield        com/whatsapp/ContactPicker.L:Z
        //   678: iload_1        
        //   679: ifeq            703
        //   682: aload_0        
        //   683: invokevirtual   com/whatsapp/ContactPicker.getBaseContext:()Landroid/content/Context;
        //   686: ldc_w           2131231735
        //   689: iconst_0       
        //   690: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   693: aload_0        
        //   694: invokevirtual   com/whatsapp/ContactPicker.finish:()V
        //   697: return         
        //   698: astore          107
        //   700: aload           107
        //   702: athrow         
        //   703: iload_1        
        //   704: ifeq            2539
        //   707: aload_2        
        //   708: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //   711: astore          28
        //   713: aload           28
        //   715: ifnull          2539
        //   718: aload_0        
        //   719: getfield        com/whatsapp/ContactPicker.Q:Ljava/lang/String;
        //   722: astore          38
        //   724: aload           38
        //   726: ifnonnull       2539
        //   729: aload_0        
        //   730: iconst_1       
        //   731: putfield        com/whatsapp/ContactPicker.S:Z
        //   734: aload_0        
        //   735: iconst_1       
        //   736: putfield        com/whatsapp/ContactPicker.L:Z
        //   739: aload_0        
        //   740: invokevirtual   com/whatsapp/ContactPicker.getIntent:()Landroid/content/Intent;
        //   743: invokevirtual   android/content/Intent.getType:()Ljava/lang/String;
        //   746: ifnonnull       873
        //   749: new             Ljava/lang/StringBuilder;
        //   752: dup            
        //   753: invokespecial   java/lang/StringBuilder.<init>:()V
        //   756: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   759: bipush          7
        //   761: aaload         
        //   762: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   765: aload_2        
        //   766: invokevirtual   android/content/Intent.toString:()Ljava/lang/String;
        //   769: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   772: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   775: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   778: aload_0        
        //   779: invokevirtual   com/whatsapp/ContactPicker.getIntent:()Landroid/content/Intent;
        //   782: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   785: bipush          27
        //   787: aaload         
        //   788: invokevirtual   android/content/Intent.hasExtra:(Ljava/lang/String;)Z
        //   791: istore          104
        //   793: iload           104
        //   795: ifne            818
        //   798: aload_0        
        //   799: invokevirtual   com/whatsapp/ContactPicker.getIntent:()Landroid/content/Intent;
        //   802: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   805: bipush          8
        //   807: aaload         
        //   808: invokevirtual   android/content/Intent.hasExtra:(Ljava/lang/String;)Z
        //   811: istore          105
        //   813: iload           105
        //   815: ifeq            827
        //   818: aload_0        
        //   819: iconst_0       
        //   820: putfield        com/whatsapp/ContactPicker.P:B
        //   823: iload_1        
        //   824: ifeq            885
        //   827: aload_0        
        //   828: invokevirtual   com/whatsapp/ContactPicker.getBaseContext:()Landroid/content/Context;
        //   831: ldc_w           2131231736
        //   834: iconst_0       
        //   835: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   838: aload_0        
        //   839: invokevirtual   com/whatsapp/ContactPicker.finish:()V
        //   842: return         
        //   843: astore          103
        //   845: aload           103
        //   847: athrow         
        //   848: astore          26
        //   850: aload           26
        //   852: athrow         
        //   853: astore          27
        //   855: aload           27
        //   857: athrow         
        //   858: astore          100
        //   860: aload           100
        //   862: athrow         
        //   863: astore          101
        //   865: aload           101
        //   867: athrow         
        //   868: astore          102
        //   870: aload           102
        //   872: athrow         
        //   873: aload_0        
        //   874: aload_0        
        //   875: invokevirtual   com/whatsapp/ContactPicker.getIntent:()Landroid/content/Intent;
        //   878: invokevirtual   android/content/Intent.getType:()Ljava/lang/String;
        //   881: invokespecial   com/whatsapp/ContactPicker.a:(Ljava/lang/String;)I
        //   884: pop            
        //   885: aload_0        
        //   886: getfield        com/whatsapp/ContactPicker.P:B
        //   889: ifeq            1015
        //   892: getstatic       com/whatsapp/App.a_:Landroid/app/ActivityManager;
        //   895: iconst_4       
        //   896: iconst_1       
        //   897: invokevirtual   android/app/ActivityManager.getRecentTasks:(II)Ljava/util/List;
        //   900: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   905: astore          94
        //   907: aload           94
        //   909: invokeinterface java/util/Iterator.hasNext:()Z
        //   914: ifeq            1015
        //   917: aload           94
        //   919: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   924: checkcast       Landroid/app/ActivityManager$RecentTaskInfo;
        //   927: getfield        android/app/ActivityManager$RecentTaskInfo.baseIntent:Landroid/content/Intent;
        //   930: astore          95
        //   932: aload           95
        //   934: ifnull          1341
        //   937: aload           95
        //   939: invokevirtual   android/content/Intent.getComponent:()Landroid/content/ComponentName;
        //   942: astore          96
        //   944: aload           96
        //   946: ifnull          1341
        //   949: aload           96
        //   951: invokevirtual   android/content/ComponentName.getPackageName:()Ljava/lang/String;
        //   954: astore          97
        //   956: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   959: bipush          33
        //   961: aaload         
        //   962: aload           97
        //   964: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   967: ifne            988
        //   970: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   973: bipush          45
        //   975: aaload         
        //   976: aload           97
        //   978: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   981: istore          99
        //   983: iload           99
        //   985: ifeq            1341
        //   988: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   991: bipush          19
        //   993: aaload         
        //   994: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   997: aload_0        
        //   998: invokevirtual   com/whatsapp/ContactPicker.getBaseContext:()Landroid/content/Context;
        //  1001: ldc_w           2131230879
        //  1004: iconst_0       
        //  1005: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //  1008: aload_0        
        //  1009: invokevirtual   com/whatsapp/ContactPicker.finish:()V
        //  1012: return         
        //  1013: astore          93
        //  1015: aload_0        
        //  1016: getfield        com/whatsapp/ContactPicker.P:B
        //  1019: ifne            1161
        //  1022: aload_0        
        //  1023: invokevirtual   com/whatsapp/ContactPicker.getIntent:()Landroid/content/Intent;
        //  1026: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  1029: bipush          14
        //  1031: aaload         
        //  1032: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  1035: astore          89
        //  1037: aload           89
        //  1039: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  1042: ifne            1080
        //  1045: aload_0        
        //  1046: new             Ljava/lang/StringBuilder;
        //  1049: dup            
        //  1050: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1053: aload_0        
        //  1054: getfield        com/whatsapp/ContactPicker.G:Ljava/lang/String;
        //  1057: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1060: aload           89
        //  1062: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1065: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  1068: bipush          49
        //  1070: aaload         
        //  1071: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1074: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1077: putfield        com/whatsapp/ContactPicker.G:Ljava/lang/String;
        //  1080: aload_0        
        //  1081: invokevirtual   com/whatsapp/ContactPicker.getIntent:()Landroid/content/Intent;
        //  1084: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  1087: bipush          11
        //  1089: aaload         
        //  1090: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  1093: astore          91
        //  1095: aload           91
        //  1097: ifnull          1157
        //  1100: aload           91
        //  1102: invokevirtual   java/lang/String.getBytes:()[B
        //  1105: astore          92
        //  1107: aload           92
        //  1109: arraylength    
        //  1110: sipush          4096
        //  1113: if_icmple       1131
        //  1116: new             Ljava/lang/String;
        //  1119: dup            
        //  1120: aload           92
        //  1122: iconst_0       
        //  1123: sipush          4096
        //  1126: invokespecial   java/lang/String.<init>:([BII)V
        //  1129: astore          91
        //  1131: aload_0        
        //  1132: new             Ljava/lang/StringBuilder;
        //  1135: dup            
        //  1136: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1139: aload_0        
        //  1140: getfield        com/whatsapp/ContactPicker.G:Ljava/lang/String;
        //  1143: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1146: aload           91
        //  1148: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1151: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1154: putfield        com/whatsapp/ContactPicker.G:Ljava/lang/String;
        //  1157: iload_1        
        //  1158: ifeq            2539
        //  1161: aload_0        
        //  1162: getfield        com/whatsapp/ContactPicker.P:B
        //  1165: istore          41
        //  1167: iload           41
        //  1169: iconst_4       
        //  1170: if_icmpne       1798
        //  1173: aload_2        
        //  1174: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  1177: bipush          39
        //  1179: aaload         
        //  1180: invokevirtual   android/content/Intent.getParcelableExtra:(Ljava/lang/String;)Landroid/os/Parcelable;
        //  1183: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  1186: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //  1189: astore          63
        //  1191: new             Ljava/lang/StringBuilder;
        //  1194: dup            
        //  1195: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1198: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  1201: bipush          23
        //  1203: aaload         
        //  1204: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1207: aload           63
        //  1209: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //  1212: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1215: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1218: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1221: iconst_m1      
        //  1222: istore          64
        //  1224: aload           63
        //  1226: invokevirtual   android/net/Uri.getScheme:()Ljava/lang/String;
        //  1229: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  1232: bipush          40
        //  1234: aaload         
        //  1235: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1238: ifeq            1394
        //  1241: new             Ljava/io/File;
        //  1244: dup            
        //  1245: aload           63
        //  1247: invokevirtual   android/net/Uri.getSchemeSpecificPart:()Ljava/lang/String;
        //  1250: iconst_2       
        //  1251: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //  1254: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //  1257: astore          72
        //  1259: aload           72
        //  1261: invokevirtual   java/io/File.exists:()Z
        //  1264: ifeq            1358
        //  1267: new             Ljava/io/FileInputStream;
        //  1270: dup            
        //  1271: aload           72
        //  1273: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //  1276: invokespecial   java/io/FileInputStream.<init>:(Ljava/lang/String;)V
        //  1279: astore          73
        //  1281: aload           72
        //  1283: invokevirtual   java/io/File.length:()J
        //  1286: lstore          74
        //  1288: lload           74
        //  1290: l2i            
        //  1291: istore          64
        //  1293: aload           73
        //  1295: astore          67
        //  1297: aconst_null    
        //  1298: astore          66
        //  1300: iload           64
        //  1302: ifgt            1559
        //  1305: aload_0        
        //  1306: invokevirtual   com/whatsapp/ContactPicker.getBaseContext:()Landroid/content/Context;
        //  1309: ldc_w           2131230879
        //  1312: iconst_0       
        //  1313: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //  1316: aload_0        
        //  1317: invokevirtual   com/whatsapp/ContactPicker.finish:()V
        //  1320: aload           66
        //  1322: ifnull          1330
        //  1325: aload           66
        //  1327: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //  1330: aload           67
        //  1332: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //  1335: return         
        //  1336: astore          98
        //  1338: aload           98
        //  1340: athrow         
        //  1341: iload_1        
        //  1342: ifeq            907
        //  1345: goto            1015
        //  1348: astore          90
        //  1350: aload           90
        //  1352: athrow         
        //  1353: astore          40
        //  1355: aload           40
        //  1357: athrow         
        //  1358: new             Ljava/lang/StringBuilder;
        //  1361: dup            
        //  1362: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1365: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  1368: bipush          25
        //  1370: aaload         
        //  1371: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1374: aload           72
        //  1376: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //  1379: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1382: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1385: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1388: aconst_null    
        //  1389: astore          73
        //  1391: goto            1293
        //  1394: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //  1397: aload           63
        //  1399: ldc_w           "r"
        //  1402: invokevirtual   android/content/ContentResolver.openAssetFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
        //  1405: astore          84
        //  1407: aload           84
        //  1409: astore          66
        //  1411: aload           66
        //  1413: ifnonnull       1498
        //  1416: aload_0        
        //  1417: new             Ljava/lang/StringBuilder;
        //  1420: dup            
        //  1421: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1424: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  1427: bipush          24
        //  1429: aaload         
        //  1430: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1433: aload           63
        //  1435: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1438: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1441: invokestatic    com/whatsapp/App.e:(Landroid/content/Context;Ljava/lang/String;)V
        //  1444: aload_0        
        //  1445: invokevirtual   com/whatsapp/ContactPicker.finish:()V
        //  1448: aload           66
        //  1450: ifnull          1458
        //  1453: aload           66
        //  1455: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //  1458: aconst_null    
        //  1459: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //  1462: return         
        //  1463: astore          88
        //  1465: new             Ljava/lang/StringBuilder;
        //  1468: dup            
        //  1469: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1472: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  1475: bipush          18
        //  1477: aaload         
        //  1478: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1481: aload           88
        //  1483: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //  1486: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1489: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1492: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1495: goto            1458
        //  1498: aload           66
        //  1500: invokevirtual   android/content/res/AssetFileDescriptor.createInputStream:()Ljava/io/FileInputStream;
        //  1503: astore          85
        //  1505: aload           85
        //  1507: astore          67
        //  1509: aload           66
        //  1511: invokevirtual   android/content/res/AssetFileDescriptor.getDeclaredLength:()J
        //  1514: lstore          86
        //  1516: lload           86
        //  1518: l2i            
        //  1519: istore          64
        //  1521: goto            1300
        //  1524: astore          83
        //  1526: new             Ljava/lang/StringBuilder;
        //  1529: dup            
        //  1530: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1533: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  1536: bipush          38
        //  1538: aaload         
        //  1539: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1542: aload           83
        //  1544: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //  1547: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1550: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1553: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1556: goto            1330
        //  1559: iload           64
        //  1561: newarray        B
        //  1563: astore          76
        //  1565: aload           67
        //  1567: aload           76
        //  1569: invokevirtual   java/io/FileInputStream.read:([B)I
        //  1572: ifle            1779
        //  1575: new             Ljava/lang/String;
        //  1578: dup            
        //  1579: aload           76
        //  1581: invokespecial   java/lang/String.<init>:([B)V
        //  1584: astore          77
        //  1586: new             Ljava/lang/StringBuilder;
        //  1589: dup            
        //  1590: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1593: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  1596: bipush          12
        //  1598: aaload         
        //  1599: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1602: aload           77
        //  1604: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1607: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1610: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1613: new             Lf;
        //  1616: dup            
        //  1617: invokespecial   f.<init>:()V
        //  1620: astore          78
        //  1622: new             Lj;
        //  1625: dup            
        //  1626: invokespecial   j.<init>:()V
        //  1629: astore          79
        //  1631: aload           78
        //  1633: aload           77
        //  1635: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  1638: bipush          32
        //  1640: aaload         
        //  1641: aload           79
        //  1643: invokevirtual   f.a:(Ljava/lang/String;Ljava/lang/String;Lj;)Z
        //  1646: ifne            1738
        //  1649: new             Ljava/lang/StringBuilder;
        //  1652: dup            
        //  1653: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1656: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  1659: bipush          28
        //  1661: aaload         
        //  1662: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1665: aload           77
        //  1667: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1670: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1673: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1676: aload_0        
        //  1677: invokevirtual   com/whatsapp/ContactPicker.getBaseContext:()Landroid/content/Context;
        //  1680: ldc_w           2131231880
        //  1683: iconst_0       
        //  1684: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //  1687: aload           66
        //  1689: ifnull          1697
        //  1692: aload           66
        //  1694: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //  1697: aload           67
        //  1699: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //  1702: return         
        //  1703: astore          82
        //  1705: new             Ljava/lang/StringBuilder;
        //  1708: dup            
        //  1709: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1712: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  1715: bipush          42
        //  1717: aaload         
        //  1718: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1721: aload           82
        //  1723: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //  1726: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1729: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1732: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1735: goto            1697
        //  1738: aload_0        
        //  1739: iconst_4       
        //  1740: putfield        com/whatsapp/ContactPicker.P:B
        //  1743: aload_0        
        //  1744: aload           77
        //  1746: putfield        com/whatsapp/ContactPicker.U:Ljava/lang/String;
        //  1749: aload_0        
        //  1750: aload           79
        //  1752: getfield        j.c:Ljava/util/List;
        //  1755: iconst_0       
        //  1756: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1761: checkcast       Lr;
        //  1764: iconst_0       
        //  1765: aload           77
        //  1767: invokestatic    o.a:(Lr;ILjava/lang/String;)Lo;
        //  1770: getfield        o.f:Lk;
        //  1773: getfield        k.e:Ljava/lang/String;
        //  1776: putfield        com/whatsapp/ContactPicker.p:Ljava/lang/String;
        //  1779: aload           66
        //  1781: ifnull          1789
        //  1784: aload           66
        //  1786: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //  1789: aload           67
        //  1791: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //  1794: iload_1        
        //  1795: ifeq            2539
        //  1798: aload_0        
        //  1799: aload_2        
        //  1800: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  1803: bipush          6
        //  1805: aaload         
        //  1806: invokevirtual   android/content/Intent.getParcelableArrayListExtra:(Ljava/lang/String;)Ljava/util/ArrayList;
        //  1809: putfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //  1812: aload_0        
        //  1813: getfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //  1816: astore          43
        //  1818: aload           43
        //  1820: ifnonnull       1897
        //  1823: aload_2        
        //  1824: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //  1827: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  1830: bipush          15
        //  1832: aaload         
        //  1833: invokevirtual   android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
        //  1836: checkcast       Landroid/net/Uri;
        //  1839: astore          60
        //  1841: new             Ljava/lang/StringBuilder;
        //  1844: dup            
        //  1845: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1848: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  1851: iconst_2       
        //  1852: aaload         
        //  1853: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1856: aload           60
        //  1858: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1861: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1864: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1867: aload           60
        //  1869: ifnull          1893
        //  1872: aload_0        
        //  1873: new             Ljava/util/ArrayList;
        //  1876: dup            
        //  1877: invokespecial   java/util/ArrayList.<init>:()V
        //  1880: putfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //  1883: aload_0        
        //  1884: getfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //  1887: aload           60
        //  1889: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1892: pop            
        //  1893: iload_1        
        //  1894: ifeq            1991
        //  1897: new             Ljava/lang/StringBuilder;
        //  1900: dup            
        //  1901: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1904: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  1907: bipush          48
        //  1909: aaload         
        //  1910: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1913: aload_0        
        //  1914: getfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //  1917: invokevirtual   java/util/ArrayList.size:()I
        //  1920: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1923: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1926: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1929: aload_0        
        //  1930: getfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //  1933: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  1936: astore          44
        //  1938: aload           44
        //  1940: invokeinterface java/util/Iterator.hasNext:()Z
        //  1945: ifeq            1991
        //  1948: aload           44
        //  1950: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1955: checkcast       Landroid/net/Uri;
        //  1958: astore          59
        //  1960: new             Ljava/lang/StringBuilder;
        //  1963: dup            
        //  1964: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1967: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  1970: bipush          35
        //  1972: aaload         
        //  1973: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1976: aload           59
        //  1978: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1981: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1984: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //  1987: iload_1        
        //  1988: ifeq            1938
        //  1991: aload_0        
        //  1992: getfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //  1995: ifnull          2012
        //  1998: aload_0        
        //  1999: getfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //  2002: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //  2005: istore          47
        //  2007: iload           47
        //  2009: ifeq            2249
        //  2012: new             Ljava/lang/StringBuilder;
        //  2015: dup            
        //  2016: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2019: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  2022: bipush          31
        //  2024: aaload         
        //  2025: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2028: aload_2        
        //  2029: invokevirtual   android/content/Intent.toString:()Ljava/lang/String;
        //  2032: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2035: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2038: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  2041: aload_0        
        //  2042: invokevirtual   com/whatsapp/ContactPicker.getBaseContext:()Landroid/content/Context;
        //  2045: ldc_w           2131231735
        //  2048: iconst_0       
        //  2049: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //  2052: aload_0        
        //  2053: invokevirtual   com/whatsapp/ContactPicker.finish:()V
        //  2056: return         
        //  2057: astore          46
        //  2059: aload           46
        //  2061: athrow         
        //  2062: astore          81
        //  2064: aload           81
        //  2066: athrow         
        //  2067: astore          80
        //  2069: new             Ljava/lang/StringBuilder;
        //  2072: dup            
        //  2073: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2076: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  2079: bipush          43
        //  2081: aaload         
        //  2082: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2085: aload           80
        //  2087: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //  2090: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2093: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2096: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  2099: goto            1789
        //  2102: astore          65
        //  2104: aconst_null    
        //  2105: astore          66
        //  2107: aconst_null    
        //  2108: astore          67
        //  2110: aload           65
        //  2112: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/Throwable;)V
        //  2115: aload           66
        //  2117: ifnull          2125
        //  2120: aload           66
        //  2122: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //  2125: aload           67
        //  2127: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //  2130: goto            1794
        //  2133: astore          71
        //  2135: new             Ljava/lang/StringBuilder;
        //  2138: dup            
        //  2139: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2142: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  2145: bipush          13
        //  2147: aaload         
        //  2148: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2151: aload           71
        //  2153: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //  2156: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2159: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2162: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  2165: goto            2125
        //  2168: astore          68
        //  2170: aconst_null    
        //  2171: astore          66
        //  2173: aconst_null    
        //  2174: astore          67
        //  2176: aload           66
        //  2178: ifnull          2186
        //  2181: aload           66
        //  2183: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //  2186: aload           67
        //  2188: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //  2191: aload           68
        //  2193: athrow         
        //  2194: astore          70
        //  2196: aload           70
        //  2198: athrow         
        //  2199: astore          69
        //  2201: new             Ljava/lang/StringBuilder;
        //  2204: dup            
        //  2205: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2208: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  2211: bipush          46
        //  2213: aaload         
        //  2214: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2217: aload           69
        //  2219: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //  2222: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2225: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2228: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  2231: goto            2186
        //  2234: astore          42
        //  2236: aload           42
        //  2238: athrow         
        //  2239: astore          61
        //  2241: aload           61
        //  2243: athrow         
        //  2244: astore          45
        //  2246: aload           45
        //  2248: athrow         
        //  2249: aload_0        
        //  2250: getfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //  2253: invokevirtual   java/util/ArrayList.size:()I
        //  2256: bipush          10
        //  2258: if_icmple       2282
        //  2261: aload_0        
        //  2262: invokevirtual   com/whatsapp/ContactPicker.getBaseContext:()Landroid/content/Context;
        //  2265: ldc_w           2131231737
        //  2268: iconst_0       
        //  2269: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //  2272: aload_0        
        //  2273: invokevirtual   com/whatsapp/ContactPicker.finish:()V
        //  2276: return         
        //  2277: astore          48
        //  2279: aload           48
        //  2281: athrow         
        //  2282: aload_0        
        //  2283: getfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //  2286: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  2289: astore          49
        //  2291: aload           49
        //  2293: invokeinterface java/util/Iterator.hasNext:()Z
        //  2298: ifeq            2390
        //  2301: aload           49
        //  2303: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2308: checkcast       Landroid/net/Uri;
        //  2311: astore          57
        //  2313: aload           57
        //  2315: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //  2318: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  2321: bipush          37
        //  2323: aaload         
        //  2324: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //  2327: ifeq            2386
        //  2330: new             Ljava/lang/StringBuilder;
        //  2333: dup            
        //  2334: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2337: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  2340: bipush          26
        //  2342: aaload         
        //  2343: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2346: aload           57
        //  2348: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //  2351: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2354: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2357: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  2360: aload_0        
        //  2361: invokevirtual   com/whatsapp/ContactPicker.getBaseContext:()Landroid/content/Context;
        //  2364: ldc_w           2131231736
        //  2367: iconst_0       
        //  2368: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //  2371: aload_0        
        //  2372: aconst_null    
        //  2373: putfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //  2376: aload_0        
        //  2377: invokevirtual   com/whatsapp/ContactPicker.finish:()V
        //  2380: return         
        //  2381: astore          58
        //  2383: aload           58
        //  2385: athrow         
        //  2386: iload_1        
        //  2387: ifeq            2291
        //  2390: aload_0        
        //  2391: getfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //  2394: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  2397: astore          50
        //  2399: aload           50
        //  2401: invokeinterface java/util/Iterator.hasNext:()Z
        //  2406: ifeq            2438
        //  2409: aload           50
        //  2411: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2416: checkcast       Landroid/net/Uri;
        //  2419: astore          55
        //  2421: aload_0        
        //  2422: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  2425: bipush          29
        //  2427: aaload         
        //  2428: aload           55
        //  2430: iconst_1       
        //  2431: invokevirtual   com/whatsapp/ContactPicker.grantUriPermission:(Ljava/lang/String;Landroid/net/Uri;I)V
        //  2434: iload_1        
        //  2435: ifeq            2399
        //  2438: aload_0        
        //  2439: invokevirtual   com/whatsapp/ContactPicker.getIntent:()Landroid/content/Intent;
        //  2442: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  2445: bipush          20
        //  2447: aaload         
        //  2448: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  2451: astore          51
        //  2453: aload           51
        //  2455: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  2458: ifne            2539
        //  2461: new             Ljava/util/ArrayList;
        //  2464: dup            
        //  2465: aload_0        
        //  2466: getfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //  2469: invokevirtual   java/util/ArrayList.size:()I
        //  2472: invokespecial   java/util/ArrayList.<init>:(I)V
        //  2475: astore          52
        //  2477: aload_0        
        //  2478: getfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //  2481: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  2484: astore          53
        //  2486: aload           53
        //  2488: invokeinterface java/util/Iterator.hasNext:()Z
        //  2493: ifeq            2533
        //  2496: aload           52
        //  2498: aload           53
        //  2500: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2505: checkcast       Landroid/net/Uri;
        //  2508: invokevirtual   android/net/Uri.buildUpon:()Landroid/net/Uri$Builder;
        //  2511: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  2514: bipush          36
        //  2516: aaload         
        //  2517: aload           51
        //  2519: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //  2522: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //  2525: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  2528: pop            
        //  2529: iload_1        
        //  2530: ifeq            2486
        //  2533: aload_0        
        //  2534: aload           52
        //  2536: putfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //  2539: aload_0        
        //  2540: ldc_w           2131755396
        //  2543: invokevirtual   com/whatsapp/ContactPicker.findViewById:(I)Landroid/view/View;
        //  2546: checkcast       Lcom/whatsapp/PagerSlidingTabStrip;
        //  2549: astore          29
        //  2551: aload_0        
        //  2552: invokespecial   com/whatsapp/ContactPicker.l:()V
        //  2555: new             Lcom/whatsapp/vb;
        //  2558: dup            
        //  2559: aload_0        
        //  2560: aconst_null    
        //  2561: invokespecial   com/whatsapp/vb.<init>:(Lcom/whatsapp/ContactPicker;Lcom/whatsapp/j;)V
        //  2564: astore          30
        //  2566: aload_0        
        //  2567: aload_0        
        //  2568: ldc_w           2131755397
        //  2571: invokevirtual   com/whatsapp/ContactPicker.findViewById:(I)Landroid/view/View;
        //  2574: checkcast       Landroid/support/v4/view/ViewPager;
        //  2577: putfield        com/whatsapp/ContactPicker.t:Landroid/support/v4/view/ViewPager;
        //  2580: aload_0        
        //  2581: getfield        com/whatsapp/ContactPicker.t:Landroid/support/v4/view/ViewPager;
        //  2584: iconst_3       
        //  2585: invokevirtual   android/support/v4/view/ViewPager.setOffscreenPageLimit:(I)V
        //  2588: aload_0        
        //  2589: getfield        com/whatsapp/ContactPicker.t:Landroid/support/v4/view/ViewPager;
        //  2592: aload           30
        //  2594: invokevirtual   android/support/v4/view/ViewPager.setAdapter:(Landroid/support/v4/view/PagerAdapter;)V
        //  2597: aload_0        
        //  2598: getfield        com/whatsapp/ContactPicker.m:Z
        //  2601: istore          35
        //  2603: iload           35
        //  2605: ifne            2630
        //  2608: aload_0        
        //  2609: getfield        com/whatsapp/ContactPicker.o:Z
        //  2612: istore          36
        //  2614: iload           36
        //  2616: ifne            2630
        //  2619: aload_0        
        //  2620: getfield        com/whatsapp/ContactPicker.L:Z
        //  2623: istore          37
        //  2625: iload           37
        //  2627: ifeq            2677
        //  2630: aload           29
        //  2632: iconst_0       
        //  2633: invokestatic    android/support/v4/view/ViewCompat.setLayoutDirection:(Landroid/view/View;I)V
        //  2636: aload           29
        //  2638: aload_0        
        //  2639: getfield        com/whatsapp/ContactPicker.t:Landroid/support/v4/view/ViewPager;
        //  2642: invokevirtual   com/whatsapp/PagerSlidingTabStrip.setViewPager:(Landroid/support/v4/view/ViewPager;)V
        //  2645: aload           29
        //  2647: new             Lcom/whatsapp/j;
        //  2650: dup            
        //  2651: aload_0        
        //  2652: invokespecial   com/whatsapp/j.<init>:(Lcom/whatsapp/ContactPicker;)V
        //  2655: invokevirtual   com/whatsapp/PagerSlidingTabStrip.setOnPageChangeListener:(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V
        //  2658: aload           29
        //  2660: aload_0        
        //  2661: invokevirtual   com/whatsapp/ContactPicker.getResources:()Landroid/content/res/Resources;
        //  2664: ldc_w           2131361864
        //  2667: invokevirtual   android/content/res/Resources.getDimension:(I)F
        //  2670: invokestatic    android/support/v4/view/ViewCompat.setElevation:(Landroid/view/View;F)V
        //  2673: iload_1        
        //  2674: ifeq            2701
        //  2677: aload           29
        //  2679: bipush          8
        //  2681: invokevirtual   com/whatsapp/PagerSlidingTabStrip.setVisibility:(I)V
        //  2684: aload_0        
        //  2685: invokevirtual   com/whatsapp/ContactPicker.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //  2688: aload_0        
        //  2689: invokevirtual   com/whatsapp/ContactPicker.getResources:()Landroid/content/res/Resources;
        //  2692: ldc_w           2131361864
        //  2695: invokevirtual   android/content/res/Resources.getDimension:(I)F
        //  2698: invokevirtual   android/support/v7/app/ActionBar.setElevation:(F)V
        //  2701: aload_0        
        //  2702: new             Lcom/whatsapp/fh;
        //  2705: dup            
        //  2706: aload_0        
        //  2707: aload_0        
        //  2708: aload_0        
        //  2709: getfield        com/whatsapp/ContactPicker.w:Ljava/util/ArrayList;
        //  2712: invokespecial   com/whatsapp/fh.<init>:(Lcom/whatsapp/ContactPicker;Landroid/content/Context;Ljava/util/ArrayList;)V
        //  2715: putfield        com/whatsapp/ContactPicker.Y:Lcom/whatsapp/fh;
        //  2718: aload_0        
        //  2719: new             Lcom/whatsapp/fl;
        //  2722: dup            
        //  2723: aload_0        
        //  2724: aload_0        
        //  2725: aload_0        
        //  2726: getfield        com/whatsapp/ContactPicker.y:Ljava/util/ArrayList;
        //  2729: invokespecial   com/whatsapp/fl.<init>:(Lcom/whatsapp/ContactPicker;Landroid/content/Context;Ljava/util/ArrayList;)V
        //  2732: putfield        com/whatsapp/ContactPicker.r:Lcom/whatsapp/fh;
        //  2735: aload_0        
        //  2736: new             Lcom/whatsapp/fl;
        //  2739: dup            
        //  2740: aload_0        
        //  2741: aload_0        
        //  2742: aload_0        
        //  2743: getfield        com/whatsapp/ContactPicker.N:Ljava/util/ArrayList;
        //  2746: invokespecial   com/whatsapp/fl.<init>:(Lcom/whatsapp/ContactPicker;Landroid/content/Context;Ljava/util/ArrayList;)V
        //  2749: putfield        com/whatsapp/ContactPicker.C:Lcom/whatsapp/fh;
        //  2752: aload_0        
        //  2753: aload_0        
        //  2754: invokestatic    com/whatsapp/App.w:(Landroid/content/Context;)Z
        //  2757: putfield        com/whatsapp/ContactPicker.R:Z
        //  2760: aload_0        
        //  2761: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/aws;)V
        //  2764: return         
        //  2765: astore          56
        //  2767: new             Ljava/lang/StringBuilder;
        //  2770: dup            
        //  2771: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2774: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //  2777: bipush          21
        //  2779: aaload         
        //  2780: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2783: aload           56
        //  2785: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  2788: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2791: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  2794: goto            2434
        //  2797: astore          31
        //  2799: aload           31
        //  2801: athrow         
        //  2802: astore          32
        //  2804: aload           32
        //  2806: athrow         
        //  2807: astore          33
        //  2809: aload           33
        //  2811: athrow         
        //  2812: astore          34
        //  2814: aload           34
        //  2816: athrow         
        //  2817: astore          68
        //  2819: aload           73
        //  2821: astore          67
        //  2823: aconst_null    
        //  2824: astore          66
        //  2826: goto            2176
        //  2829: astore          68
        //  2831: aconst_null    
        //  2832: astore          67
        //  2834: goto            2176
        //  2837: astore          68
        //  2839: goto            2176
        //  2842: astore          65
        //  2844: aload           73
        //  2846: astore          67
        //  2848: aconst_null    
        //  2849: astore          66
        //  2851: goto            2110
        //  2854: astore          65
        //  2856: aconst_null    
        //  2857: astore          67
        //  2859: goto            2110
        //  2862: astore          65
        //  2864: goto            2110
        //  2867: astore          65
        //  2869: aconst_null    
        //  2870: astore          66
        //  2872: aconst_null    
        //  2873: astore          67
        //  2875: goto            2110
        //  2878: astore          65
        //  2880: aload           73
        //  2882: astore          67
        //  2884: aconst_null    
        //  2885: astore          66
        //  2887: goto            2110
        //  2890: astore          65
        //  2892: aconst_null    
        //  2893: astore          67
        //  2895: goto            2110
        //  2898: astore          65
        //  2900: goto            2110
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  9      30     560    563    Ljava/lang/Exception;
        //  35     40     563    568    Ljava/lang/Exception;
        //  44     56     568    573    Ljava/lang/Exception;
        //  61     66     573    578    Ljava/lang/Exception;
        //  70     83     578    583    Ljava/lang/Exception;
        //  88     93     583    588    Ljava/lang/Exception;
        //  97     109    588    593    Ljava/lang/Exception;
        //  114    129    593    598    Ljava/lang/Exception;
        //  133    146    598    603    Ljava/lang/Exception;
        //  178    185    603    608    Ljava/lang/Exception;
        //  223    243    608    613    Ljava/lang/Exception;
        //  254    272    613    618    Ljava/lang/Exception;
        //  277    301    618    623    Ljava/lang/Exception;
        //  305    318    623    628    Ljava/lang/Exception;
        //  323    338    628    633    Ljava/lang/Exception;
        //  342    355    633    638    Ljava/lang/Exception;
        //  382    389    638    643    Ljava/lang/Exception;
        //  427    447    643    648    Ljava/lang/Exception;
        //  458    473    648    653    Ljava/lang/Exception;
        //  489    505    653    658    Ljava/lang/Exception;
        //  510    539    658    663    Ljava/lang/Exception;
        //  544    559    663    668    Ljava/lang/Exception;
        //  561    563    563    568    Ljava/lang/Exception;
        //  565    568    568    573    Ljava/lang/Exception;
        //  570    573    573    578    Ljava/lang/Exception;
        //  575    578    578    583    Ljava/lang/Exception;
        //  580    583    583    588    Ljava/lang/Exception;
        //  585    588    588    593    Ljava/lang/Exception;
        //  590    593    593    598    Ljava/lang/Exception;
        //  595    598    598    603    Ljava/lang/Exception;
        //  615    618    618    623    Ljava/lang/Exception;
        //  620    623    623    628    Ljava/lang/Exception;
        //  625    628    628    633    Ljava/lang/Exception;
        //  630    633    633    638    Ljava/lang/Exception;
        //  655    658    658    663    Ljava/lang/Exception;
        //  660    663    663    668    Ljava/lang/Exception;
        //  668    678    698    703    Ljava/lang/Exception;
        //  682    697    698    703    Ljava/lang/Exception;
        //  707    713    848    853    Ljava/lang/Exception;
        //  718    724    853    858    Ljava/lang/Exception;
        //  749    793    858    863    Ljava/lang/Exception;
        //  798    813    863    868    Ljava/lang/Exception;
        //  818    823    868    873    Ljava/lang/Exception;
        //  827    842    843    848    Ljava/lang/Exception;
        //  850    853    853    858    Ljava/lang/Exception;
        //  860    863    863    868    Ljava/lang/Exception;
        //  865    868    868    873    Ljava/lang/Exception;
        //  870    873    843    848    Ljava/lang/Exception;
        //  892    907    1013   1015   Ljava/lang/Exception;
        //  907    932    1013   1015   Ljava/lang/Exception;
        //  937    944    1013   1015   Ljava/lang/Exception;
        //  949    956    1013   1015   Ljava/lang/Exception;
        //  956    983    1336   1341   Ljava/lang/Exception;
        //  988    1012   1013   1015   Ljava/lang/Exception;
        //  1037   1080   1348   1353   Ljava/lang/Exception;
        //  1161   1167   1353   1358   Ljava/lang/Exception;
        //  1224   1281   2102   2110   La;
        //  1224   1281   2867   2878   Ljava/io/IOException;
        //  1224   1281   2168   2176   Any
        //  1281   1288   2842   2854   La;
        //  1281   1288   2878   2890   Ljava/io/IOException;
        //  1281   1288   2817   2829   Any
        //  1305   1320   2862   2867   La;
        //  1305   1320   2898   2903   Ljava/io/IOException;
        //  1305   1320   2837   2842   Any
        //  1325   1330   1524   1559   Ljava/io/IOException;
        //  1338   1341   1013   1015   Ljava/lang/Exception;
        //  1358   1388   2102   2110   La;
        //  1358   1388   2867   2878   Ljava/io/IOException;
        //  1358   1388   2168   2176   Any
        //  1394   1407   2102   2110   La;
        //  1394   1407   2867   2878   Ljava/io/IOException;
        //  1394   1407   2168   2176   Any
        //  1416   1448   2854   2862   La;
        //  1416   1448   2890   2898   Ljava/io/IOException;
        //  1416   1448   2829   2837   Any
        //  1453   1458   1463   1498   Ljava/io/IOException;
        //  1498   1505   2854   2862   La;
        //  1498   1505   2890   2898   Ljava/io/IOException;
        //  1498   1505   2829   2837   Any
        //  1509   1516   2862   2867   La;
        //  1509   1516   2898   2903   Ljava/io/IOException;
        //  1509   1516   2837   2842   Any
        //  1559   1687   2862   2867   La;
        //  1559   1687   2898   2903   Ljava/io/IOException;
        //  1559   1687   2837   2842   Any
        //  1692   1697   1703   1738   Ljava/io/IOException;
        //  1738   1779   2862   2867   La;
        //  1738   1779   2898   2903   Ljava/io/IOException;
        //  1738   1779   2837   2842   Any
        //  1784   1789   2067   2102   Ljava/io/IOException;
        //  1784   1789   2062   2067   La;
        //  1798   1818   2234   2239   Ljava/lang/Exception;
        //  1841   1867   2239   2244   Ljava/lang/Exception;
        //  1872   1893   2239   2244   Ljava/lang/Exception;
        //  1991   2007   2244   2249   Ljava/lang/Exception;
        //  2012   2056   2057   2062   Ljava/lang/Exception;
        //  2110   2115   2837   2842   Any
        //  2120   2125   2133   2168   Ljava/io/IOException;
        //  2181   2186   2199   2234   Ljava/io/IOException;
        //  2181   2186   2194   2199   La;
        //  2246   2249   2057   2062   Ljava/lang/Exception;
        //  2249   2276   2277   2282   Ljava/lang/Exception;
        //  2313   2380   2381   2386   Ljava/lang/Exception;
        //  2421   2434   2765   2797   Ljava/lang/SecurityException;
        //  2566   2603   2797   2802   Ljava/lang/Exception;
        //  2608   2614   2802   2807   Ljava/lang/Exception;
        //  2619   2625   2807   2812   Ljava/lang/Exception;
        //  2630   2673   2812   2817   Ljava/lang/Exception;
        //  2677   2701   2812   2817   Ljava/lang/Exception;
        //  2799   2802   2802   2807   Ljava/lang/Exception;
        //  2804   2807   2807   2812   Ljava/lang/Exception;
        //  2809   2812   2812   2817   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 1336, Size: 1336
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    public boolean h() {
        try {
            if (this.K != null) {
                return false;
            }
        }
        catch (SecurityException ex) {
            throw ex;
        }
        try {
            if (this.M == null) {
                this.M = new z3(this);
            }
            this.o();
            this.K = this.startSupportActionMode(this.M);
            return true;
        }
        catch (SecurityException ex2) {
            throw ex2;
        }
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        switch (n) {
            case 1: {
                Label_0037: {
                    if (n2 != -1) {
                        break Label_0037;
                    }
                    try {
                        this.d(false);
                        if (App.I) {
                            Log.i(ContactPicker.Z[50]);
                            return;
                        }
                        break;
                    }
                    catch (SecurityException ex) {
                        throw ex;
                    }
                }
                break;
            }
        }
    }
    
    public boolean onContextItemSelected(final MenuItem menuItem) {
        final a_9 a_9 = (a_9)((ListView)this.t.findViewWithTag((Object)this.t.getCurrentItem())).getItemAtPosition(((AdapterView$AdapterContextMenuInfo)menuItem.getMenuInfo()).position);
        try {
            switch (menuItem.getItemId()) {
                default: {
                    return super.onContextItemSelected(menuItem);
                }
                case 0: {
                    App.a(this, false, a_9.u);
                    return true;
                }
            }
        }
        catch (SecurityException ex) {
            throw ex;
        }
    }
    
    public void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: aload_1        
        //     6: invokespecial   com/whatsapp/VerifyMessageStoreActivity.onCreate:(Landroid/os/Bundle;)V
        //     9: aload_0        
        //    10: ldc_w           2130903099
        //    13: invokevirtual   com/whatsapp/ContactPicker.setContentView:(I)V
        //    16: aload_0        
        //    17: invokevirtual   com/whatsapp/ContactPicker.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    20: astore_3       
        //    21: aload_3        
        //    22: iconst_1       
        //    23: invokevirtual   android/support/v7/app/ActionBar.setDisplayHomeAsUpEnabled:(Z)V
        //    26: aload_3        
        //    27: ldc_w           2131231970
        //    30: invokevirtual   android/support/v7/app/ActionBar.setTitle:(I)V
        //    33: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //    36: bipush          58
        //    38: aaload         
        //    39: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    42: aconst_null    
        //    43: invokestatic    com/whatsapp/util/WhatsAppLibLoader.a:(Landroid/content/Context;)Z
        //    46: ifne            68
        //    49: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //    52: bipush          55
        //    54: aaload         
        //    55: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    58: aload_0        
        //    59: invokevirtual   com/whatsapp/ContactPicker.finish:()V
        //    62: return         
        //    63: astore          4
        //    65: aload           4
        //    67: athrow         
        //    68: getstatic       com/whatsapp/App.aX:Lcom/whatsapp/App$Me;
        //    71: ifnull          86
        //    74: aload_0        
        //    75: invokestatic    com/whatsapp/App.c:(Landroid/content/Context;)I
        //    78: istore          6
        //    80: iload           6
        //    82: iconst_3       
        //    83: if_icmpeq       119
        //    86: aload_0        
        //    87: ldc_w           2131231129
        //    90: iconst_1       
        //    91: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //    94: aload_0        
        //    95: new             Landroid/content/Intent;
        //    98: dup            
        //    99: aload_0        
        //   100: ldc_w           Lcom/whatsapp/Main;.class
        //   103: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   106: invokevirtual   com/whatsapp/ContactPicker.startActivity:(Landroid/content/Intent;)V
        //   109: aload_0        
        //   110: invokevirtual   com/whatsapp/ContactPicker.finish:()V
        //   113: return         
        //   114: astore          5
        //   116: aload           5
        //   118: athrow         
        //   119: aload_0        
        //   120: invokestatic    com/whatsapp/contact/f.c:()Z
        //   123: invokevirtual   com/whatsapp/ContactPicker.setSupportProgressBarIndeterminateVisibility:(Z)V
        //   126: aload_1        
        //   127: ifnonnull       147
        //   130: aload_0        
        //   131: aload_0        
        //   132: invokevirtual   com/whatsapp/ContactPicker.getIntent:()Landroid/content/Intent;
        //   135: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   138: bipush          57
        //   140: aaload         
        //   141: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   144: putfield        com/whatsapp/ContactPicker.Q:Ljava/lang/String;
        //   147: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   150: invokevirtual   com/whatsapp/vy.l:()Z
        //   153: ifne            219
        //   156: iconst_1       
        //   157: putstatic       com/whatsapp/ContactPicker.l:Z
        //   160: invokestatic    android/os/Environment.getExternalStorageState:()Ljava/lang/String;
        //   163: astore          9
        //   165: aload           9
        //   167: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   170: bipush          59
        //   172: aaload         
        //   173: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   176: istore          13
        //   178: iload           13
        //   180: ifne            211
        //   183: aload           9
        //   185: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   188: bipush          56
        //   190: aaload         
        //   191: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   194: istore          14
        //   196: iload           14
        //   198: ifne            211
        //   201: aload_0        
        //   202: bipush          107
        //   204: invokevirtual   com/whatsapp/ContactPicker.showDialog:(I)V
        //   207: iload_2        
        //   208: ifeq            215
        //   211: aload_0        
        //   212: invokevirtual   com/whatsapp/ContactPicker.e:()V
        //   215: iload_2        
        //   216: ifeq            62
        //   219: aload_0        
        //   220: invokevirtual   com/whatsapp/ContactPicker.f:()V
        //   223: return         
        //   224: astore          8
        //   226: aload           8
        //   228: athrow         
        //   229: astore          7
        //   231: aload           7
        //   233: athrow         
        //   234: astore          10
        //   236: aload           10
        //   238: athrow         
        //   239: astore          11
        //   241: aload           11
        //   243: athrow         
        //   244: astore          12
        //   246: aload           12
        //   248: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  21     62     63     68     Ljava/lang/SecurityException;
        //  68     80     114    119    Ljava/lang/SecurityException;
        //  119    126    229    234    Ljava/lang/SecurityException;
        //  130    147    229    234    Ljava/lang/SecurityException;
        //  165    178    234    239    Ljava/lang/SecurityException;
        //  183    196    239    244    Ljava/lang/SecurityException;
        //  201    207    244    249    Ljava/lang/SecurityException;
        //  211    215    244    249    Ljava/lang/SecurityException;
        //  219    223    224    229    Ljava/lang/SecurityException;
        //  236    239    239    244    Ljava/lang/SecurityException;
        //  241    244    244    249    Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 122, Size: 122
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
    public void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        final a_9 a_9 = (a_9)((ListView)view).getItemAtPosition(((AdapterView$AdapterContextMenuInfo)contextMenu$ContextMenuInfo).position);
        try {
            if (!App.p(a_9.u)) {
                return;
            }
        }
        catch (SecurityException ex) {
            throw ex;
        }
        contextMenu.add(0, 0, 0, (CharSequence)String.format(this.getString(2131230843), a_9.t));
        super.onCreateContextMenu(contextMenu, view, contextMenu$ContextMenuInfo);
    }
    
    @Override
    protected Dialog onCreateDialog(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: iload_1        
        //     5: tableswitch {
        //                0: 46
        //                1: 160
        //                2: 488
        //                3: 627
        //                4: 723
        //          default: 40
        //        }
        //    40: aload_0        
        //    41: iload_1        
        //    42: invokespecial   com/whatsapp/VerifyMessageStoreActivity.onCreateDialog:(I)Landroid/app/Dialog;
        //    45: areturn        
        //    46: iconst_2       
        //    47: anewarray       Ljava/lang/Object;
        //    50: astore          23
        //    52: aload           23
        //    54: iconst_0       
        //    55: aload_0        
        //    56: getfield        com/whatsapp/ContactPicker.F:Lcom/whatsapp/a_9;
        //    59: aload_0        
        //    60: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //    63: aastore        
        //    64: aload           23
        //    66: iconst_1       
        //    67: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    70: aload_0        
        //    71: getfield        com/whatsapp/ContactPicker.E:Ljava/lang/String;
        //    74: invokevirtual   com/whatsapp/wc.c:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    77: aload_0        
        //    78: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //    81: aastore        
        //    82: aload_0        
        //    83: ldc_w           2131231476
        //    86: aload           23
        //    88: invokevirtual   com/whatsapp/ContactPicker.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //    91: astore          24
        //    93: new             Landroid/support/v7/app/AlertDialog$Builder;
        //    96: dup            
        //    97: aload_0        
        //    98: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   101: aload           24
        //   103: aload_0        
        //   104: invokevirtual   com/whatsapp/ContactPicker.getBaseContext:()Landroid/content/Context;
        //   107: invokestatic    com/whatsapp/util/cq.c:(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/CharSequence;
        //   110: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;
        //   113: iconst_1       
        //   114: invokevirtual   android/support/v7/app/AlertDialog$Builder.setCancelable:(Z)Landroid/support/v7/app/AlertDialog$Builder;
        //   117: ldc_w           2131230874
        //   120: new             Lcom/whatsapp/lu;
        //   123: dup            
        //   124: aload_0        
        //   125: invokespecial   com/whatsapp/lu.<init>:(Lcom/whatsapp/ContactPicker;)V
        //   128: invokevirtual   android/support/v7/app/AlertDialog$Builder.setNegativeButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   131: ldc_w           2131231435
        //   134: new             Lcom/whatsapp/c4;
        //   137: dup            
        //   138: aload_0        
        //   139: invokespecial   com/whatsapp/c4.<init>:(Lcom/whatsapp/ContactPicker;)V
        //   142: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   145: new             Lcom/whatsapp/aw4;
        //   148: dup            
        //   149: aload_0        
        //   150: invokespecial   com/whatsapp/aw4.<init>:(Lcom/whatsapp/ContactPicker;)V
        //   153: invokevirtual   android/support/v7/app/AlertDialog$Builder.setOnCancelListener:(Landroid/content/DialogInterface$OnCancelListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   156: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   159: areturn        
        //   160: aload_0        
        //   161: getfield        com/whatsapp/ContactPicker.F:Lcom/whatsapp/a_9;
        //   164: invokevirtual   com/whatsapp/a_9.m:()Z
        //   167: istore          12
        //   169: iload           12
        //   171: ifeq            292
        //   174: aload_0        
        //   175: getfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //   178: ifnull          259
        //   181: aload_0        
        //   182: getfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //   185: invokevirtual   java/util/ArrayList.size:()I
        //   188: istore          20
        //   190: iload           20
        //   192: iconst_1       
        //   193: if_icmple       259
        //   196: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //   199: ldc_w           2131296270
        //   202: aload_0        
        //   203: getfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //   206: invokevirtual   java/util/ArrayList.size:()I
        //   209: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //   212: astore          21
        //   214: iconst_2       
        //   215: anewarray       Ljava/lang/Object;
        //   218: astore          22
        //   220: aload           22
        //   222: iconst_0       
        //   223: aload_0        
        //   224: getfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //   227: invokevirtual   java/util/ArrayList.size:()I
        //   230: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   233: aastore        
        //   234: aload           22
        //   236: iconst_1       
        //   237: aload_0        
        //   238: getfield        com/whatsapp/ContactPicker.F:Lcom/whatsapp/a_9;
        //   241: aload_0        
        //   242: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   245: aastore        
        //   246: aload           21
        //   248: aload           22
        //   250: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   253: astore          15
        //   255: iload_2        
        //   256: ifeq            406
        //   259: iconst_1       
        //   260: anewarray       Ljava/lang/Object;
        //   263: astore          19
        //   265: aload           19
        //   267: iconst_0       
        //   268: aload_0        
        //   269: getfield        com/whatsapp/ContactPicker.F:Lcom/whatsapp/a_9;
        //   272: aload_0        
        //   273: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   276: aastore        
        //   277: aload_0        
        //   278: ldc_w           2131231158
        //   281: aload           19
        //   283: invokevirtual   com/whatsapp/ContactPicker.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   286: astore          15
        //   288: iload_2        
        //   289: ifeq            406
        //   292: aload_0        
        //   293: getfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //   296: ifnull          377
        //   299: aload_0        
        //   300: getfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //   303: invokevirtual   java/util/ArrayList.size:()I
        //   306: istore          16
        //   308: iload           16
        //   310: iconst_1       
        //   311: if_icmple       377
        //   314: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //   317: ldc_w           2131296264
        //   320: aload_0        
        //   321: getfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //   324: invokevirtual   java/util/ArrayList.size:()I
        //   327: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //   330: astore          17
        //   332: iconst_2       
        //   333: anewarray       Ljava/lang/Object;
        //   336: astore          18
        //   338: aload           18
        //   340: iconst_0       
        //   341: aload_0        
        //   342: getfield        com/whatsapp/ContactPicker.T:Ljava/util/ArrayList;
        //   345: invokevirtual   java/util/ArrayList.size:()I
        //   348: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   351: aastore        
        //   352: aload           18
        //   354: iconst_1       
        //   355: aload_0        
        //   356: getfield        com/whatsapp/ContactPicker.F:Lcom/whatsapp/a_9;
        //   359: aload_0        
        //   360: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   363: aastore        
        //   364: aload           17
        //   366: aload           18
        //   368: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   371: astore          15
        //   373: iload_2        
        //   374: ifeq            406
        //   377: iconst_1       
        //   378: anewarray       Ljava/lang/Object;
        //   381: astore          14
        //   383: aload           14
        //   385: iconst_0       
        //   386: aload_0        
        //   387: getfield        com/whatsapp/ContactPicker.F:Lcom/whatsapp/a_9;
        //   390: aload_0        
        //   391: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   394: aastore        
        //   395: aload_0        
        //   396: ldc_w           2131230918
        //   399: aload           14
        //   401: invokevirtual   com/whatsapp/ContactPicker.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   404: astore          15
        //   406: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   409: dup            
        //   410: aload_0        
        //   411: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   414: aload           15
        //   416: aload_0        
        //   417: invokevirtual   com/whatsapp/ContactPicker.getBaseContext:()Landroid/content/Context;
        //   420: invokestatic    com/whatsapp/util/cq.c:(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/CharSequence;
        //   423: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;
        //   426: iconst_1       
        //   427: invokevirtual   android/support/v7/app/AlertDialog$Builder.setCancelable:(Z)Landroid/support/v7/app/AlertDialog$Builder;
        //   430: ldc_w           2131230874
        //   433: new             Lcom/whatsapp/adw;
        //   436: dup            
        //   437: aload_0        
        //   438: invokespecial   com/whatsapp/adw.<init>:(Lcom/whatsapp/ContactPicker;)V
        //   441: invokevirtual   android/support/v7/app/AlertDialog$Builder.setNegativeButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   444: ldc_w           2131231435
        //   447: new             Lcom/whatsapp/arw;
        //   450: dup            
        //   451: aload_0        
        //   452: invokespecial   com/whatsapp/arw.<init>:(Lcom/whatsapp/ContactPicker;)V
        //   455: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   458: new             Lcom/whatsapp/ahf;
        //   461: dup            
        //   462: aload_0        
        //   463: invokespecial   com/whatsapp/ahf.<init>:(Lcom/whatsapp/ContactPicker;)V
        //   466: invokevirtual   android/support/v7/app/AlertDialog$Builder.setOnCancelListener:(Landroid/content/DialogInterface$OnCancelListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   469: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   472: areturn        
        //   473: astore          10
        //   475: aload           10
        //   477: athrow         
        //   478: astore          11
        //   480: aload           11
        //   482: athrow         
        //   483: astore          13
        //   485: aload           13
        //   487: athrow         
        //   488: aload_0        
        //   489: getfield        com/whatsapp/ContactPicker.F:Lcom/whatsapp/a_9;
        //   492: invokevirtual   com/whatsapp/a_9.m:()Z
        //   495: ifeq            531
        //   498: iconst_1       
        //   499: anewarray       Ljava/lang/Object;
        //   502: astore          9
        //   504: aload           9
        //   506: iconst_0       
        //   507: aload_0        
        //   508: getfield        com/whatsapp/ContactPicker.F:Lcom/whatsapp/a_9;
        //   511: aload_0        
        //   512: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   515: aastore        
        //   516: aload_0        
        //   517: ldc_w           2131231156
        //   520: aload           9
        //   522: invokevirtual   com/whatsapp/ContactPicker.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   525: astore          8
        //   527: iload_2        
        //   528: ifeq            560
        //   531: iconst_1       
        //   532: anewarray       Ljava/lang/Object;
        //   535: astore          7
        //   537: aload           7
        //   539: iconst_0       
        //   540: aload_0        
        //   541: getfield        com/whatsapp/ContactPicker.F:Lcom/whatsapp/a_9;
        //   544: aload_0        
        //   545: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   548: aastore        
        //   549: aload_0        
        //   550: ldc_w           2131230917
        //   553: aload           7
        //   555: invokevirtual   com/whatsapp/ContactPicker.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   558: astore          8
        //   560: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   563: dup            
        //   564: aload_0        
        //   565: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   568: aload           8
        //   570: aload_0        
        //   571: invokevirtual   com/whatsapp/ContactPicker.getBaseContext:()Landroid/content/Context;
        //   574: invokestatic    com/whatsapp/util/cq.c:(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/CharSequence;
        //   577: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;
        //   580: iconst_1       
        //   581: invokevirtual   android/support/v7/app/AlertDialog$Builder.setCancelable:(Z)Landroid/support/v7/app/AlertDialog$Builder;
        //   584: ldc_w           2131230874
        //   587: new             Lcom/whatsapp/v7;
        //   590: dup            
        //   591: aload_0        
        //   592: invokespecial   com/whatsapp/v7.<init>:(Lcom/whatsapp/ContactPicker;)V
        //   595: invokevirtual   android/support/v7/app/AlertDialog$Builder.setNegativeButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   598: ldc_w           2131231435
        //   601: new             Lcom/whatsapp/hr;
        //   604: dup            
        //   605: aload_0        
        //   606: invokespecial   com/whatsapp/hr.<init>:(Lcom/whatsapp/ContactPicker;)V
        //   609: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   612: new             Lcom/whatsapp/r9;
        //   615: dup            
        //   616: aload_0        
        //   617: invokespecial   com/whatsapp/r9.<init>:(Lcom/whatsapp/ContactPicker;)V
        //   620: invokevirtual   android/support/v7/app/AlertDialog$Builder.setOnCancelListener:(Landroid/content/DialogInterface$OnCancelListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   623: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   626: areturn        
        //   627: iconst_1       
        //   628: anewarray       Ljava/lang/Object;
        //   631: astore          5
        //   633: aload           5
        //   635: iconst_0       
        //   636: aload_0        
        //   637: getfield        com/whatsapp/ContactPicker.F:Lcom/whatsapp/a_9;
        //   640: aload_0        
        //   641: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   644: aastore        
        //   645: aload_0        
        //   646: ldc_w           2131231157
        //   649: aload           5
        //   651: invokevirtual   com/whatsapp/ContactPicker.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   654: astore          6
        //   656: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   659: dup            
        //   660: aload_0        
        //   661: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   664: aload           6
        //   666: aload_0        
        //   667: invokevirtual   com/whatsapp/ContactPicker.getBaseContext:()Landroid/content/Context;
        //   670: invokestatic    com/whatsapp/util/cq.c:(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/CharSequence;
        //   673: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;
        //   676: iconst_1       
        //   677: invokevirtual   android/support/v7/app/AlertDialog$Builder.setCancelable:(Z)Landroid/support/v7/app/AlertDialog$Builder;
        //   680: ldc_w           2131230874
        //   683: new             Lcom/whatsapp/aqj;
        //   686: dup            
        //   687: aload_0        
        //   688: invokespecial   com/whatsapp/aqj.<init>:(Lcom/whatsapp/ContactPicker;)V
        //   691: invokevirtual   android/support/v7/app/AlertDialog$Builder.setNegativeButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   694: ldc_w           2131231435
        //   697: new             Lcom/whatsapp/l4;
        //   700: dup            
        //   701: aload_0        
        //   702: invokespecial   com/whatsapp/l4.<init>:(Lcom/whatsapp/ContactPicker;)V
        //   705: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   708: new             Lcom/whatsapp/ahv;
        //   711: dup            
        //   712: aload_0        
        //   713: invokespecial   com/whatsapp/ahv.<init>:(Lcom/whatsapp/ContactPicker;)V
        //   716: invokevirtual   android/support/v7/app/AlertDialog$Builder.setOnCancelListener:(Landroid/content/DialogInterface$OnCancelListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   719: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   722: areturn        
        //   723: new             Landroid/support/v7/app/AlertDialog$Builder;
        //   726: dup            
        //   727: aload_0        
        //   728: invokespecial   android/support/v7/app/AlertDialog$Builder.<init>:(Landroid/content/Context;)V
        //   731: astore_3       
        //   732: iconst_1       
        //   733: anewarray       Ljava/lang/Object;
        //   736: astore          4
        //   738: aload           4
        //   740: iconst_0       
        //   741: aload_0        
        //   742: ldc_w           2131231720
        //   745: invokevirtual   com/whatsapp/ContactPicker.getString:(I)Ljava/lang/String;
        //   748: aastore        
        //   749: aload_3        
        //   750: aload_0        
        //   751: ldc_w           2131230908
        //   754: aload           4
        //   756: invokevirtual   com/whatsapp/ContactPicker.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   759: invokevirtual   android/support/v7/app/AlertDialog$Builder.setMessage:(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;
        //   762: iconst_1       
        //   763: invokevirtual   android/support/v7/app/AlertDialog$Builder.setCancelable:(Z)Landroid/support/v7/app/AlertDialog$Builder;
        //   766: ldc_w           2131230874
        //   769: new             Lcom/whatsapp/g7;
        //   772: dup            
        //   773: aload_0        
        //   774: invokespecial   com/whatsapp/g7.<init>:(Lcom/whatsapp/ContactPicker;)V
        //   777: invokevirtual   android/support/v7/app/AlertDialog$Builder.setNegativeButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   780: ldc_w           2131231720
        //   783: new             Lcom/whatsapp/a9e;
        //   786: dup            
        //   787: aload_0        
        //   788: invokespecial   com/whatsapp/a9e.<init>:(Lcom/whatsapp/ContactPicker;)V
        //   791: invokevirtual   android/support/v7/app/AlertDialog$Builder.setPositiveButton:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;
        //   794: invokevirtual   android/support/v7/app/AlertDialog$Builder.create:()Landroid/support/v7/app/AlertDialog;
        //   797: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  160    169    473    478    Ljava/lang/SecurityException;
        //  174    190    478    483    Ljava/lang/SecurityException;
        //  292    308    483    488    Ljava/lang/SecurityException;
        //  475    478    478    483    Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 366, Size: 366
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
    public boolean onCreateOptionsMenu(final Menu menu) {
        final Resources resources = this.getResources();
        final String string = this.getString(2131231310);
        Label_0168: {
            if (this.B.isEmpty()) {
                break Label_0168;
            }
            final SearchView searchView = new SearchView(this.getSupportActionBar().getThemedContext());
            try {
                ((TextView)searchView.findViewById(2131755115)).setTextColor(this.getResources().getColor(2131624031));
                searchView.setOnQueryTextListener(new fi(this));
                MenuItemCompat.setActionView(this.z = menu.add(0, 4, 0, 2131231614).setIcon(2130838731), (View)searchView);
                MenuItemCompat.setShowAsAction(this.z, 10);
                MenuItemCompat.setOnActionExpandListener(this.z, new wk(this));
                if (!TextUtils.isEmpty((CharSequence)this.Q)) {
                    MenuItemCompat.expandActionView(this.z);
                    searchView.setQuery(this.Q, true);
                    this.Q = null;
                }
                menu.add(0, 1, 0, 2131231846).setIcon(2130838803);
                menu.add(0, 2, 0, 2131231301).setIcon(2130838785);
                menu.add(0, 0, 0, (CharSequence)string).setIcon(resources.getDrawable(2130838798));
                menu.add(0, 3, 0, 2131231697).setIcon(2130838789);
                return super.onCreateOptionsMenu(menu);
            }
            catch (SecurityException ex) {
                throw ex;
            }
        }
    }
    
    public void onDestroy() {
        Log.i(ContactPicker.Z[71]);
        super.onDestroy();
        App.a((aws)this);
        this.O.a();
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: invokeinterface android/view/MenuItem.getItemId:()I
        //    10: lookupswitch {
        //                0: 68
        //                1: 200
        //                2: 83
        //                3: 222
        //                4: 215
        //          16908332: 228
        //          default: 232
        //        }
        //    68: aload_0        
        //    69: iconst_1       
        //    70: invokevirtual   com/whatsapp/ContactPicker.setSupportProgressBarIndeterminateVisibility:(Z)V
        //    73: aload_0        
        //    74: iconst_1       
        //    75: invokespecial   com/whatsapp/ContactPicker.d:(Z)V
        //    78: iconst_1       
        //    79: ireturn        
        //    80: astore_3       
        //    81: aload_3        
        //    82: athrow         
        //    83: new             Landroid/content/Intent;
        //    86: dup            
        //    87: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //    90: bipush          52
        //    92: aaload         
        //    93: getstatic       android/provider/ContactsContract$Contacts.CONTENT_URI:Landroid/net/Uri;
        //    96: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;Landroid/net/Uri;)V
        //    99: astore          5
        //   101: aload           5
        //   103: aload           5
        //   105: aload_0        
        //   106: invokevirtual   com/whatsapp/ContactPicker.getPackageManager:()Landroid/content/pm/PackageManager;
        //   109: invokevirtual   android/content/Intent.resolveActivity:(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;
        //   112: invokevirtual   android/content/Intent.setComponent:(Landroid/content/ComponentName;)Landroid/content/Intent;
        //   115: pop            
        //   116: aload           5
        //   118: invokevirtual   android/content/Intent.getComponent:()Landroid/content/ComponentName;
        //   121: ifnull          134
        //   124: aload_0        
        //   125: aload           5
        //   127: invokevirtual   com/whatsapp/ContactPicker.startActivity:(Landroid/content/Intent;)V
        //   130: iload_2        
        //   131: ifeq            232
        //   134: aload_0        
        //   135: invokevirtual   com/whatsapp/ContactPicker.getPackageManager:()Landroid/content/pm/PackageManager;
        //   138: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   141: bipush          53
        //   143: aaload         
        //   144: invokevirtual   android/content/pm/PackageManager.getLaunchIntentForPackage:(Ljava/lang/String;)Landroid/content/Intent;
        //   147: astore          9
        //   149: aload           9
        //   151: ifnonnull       161
        //   154: invokestatic    com/whatsapp/App.M:()V
        //   157: iload_2        
        //   158: ifeq            232
        //   161: aload_0        
        //   162: aload           9
        //   164: invokevirtual   com/whatsapp/ContactPicker.startActivity:(Landroid/content/Intent;)V
        //   167: iconst_1       
        //   168: ireturn        
        //   169: astore          10
        //   171: aload           10
        //   173: athrow         
        //   174: astore          8
        //   176: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //   179: bipush          54
        //   181: aaload         
        //   182: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   185: invokestatic    com/whatsapp/App.M:()V
        //   188: iconst_1       
        //   189: ireturn        
        //   190: astore          6
        //   192: aload           6
        //   194: athrow         
        //   195: astore          11
        //   197: aload           11
        //   199: athrow         
        //   200: getstatic       com/whatsapp/fieldstats/aq.TELL_A_FRIEND:Lcom/whatsapp/fieldstats/aq;
        //   203: getstatic       com/whatsapp/fieldstats/ag.CONTACTPICKER_MENU:Lcom/whatsapp/fieldstats/ag;
        //   206: invokestatic    com/whatsapp/aam.a:(Lcom/whatsapp/fieldstats/aq;Lcom/whatsapp/fieldstats/ag;)V
        //   209: aload_0        
        //   210: invokestatic    com/whatsapp/App.a:(Landroid/app/Activity;)V
        //   213: iconst_1       
        //   214: ireturn        
        //   215: aload_0        
        //   216: invokevirtual   com/whatsapp/ContactPicker.onSearchRequested:()Z
        //   219: pop            
        //   220: iconst_1       
        //   221: ireturn        
        //   222: aload_0        
        //   223: invokespecial   com/whatsapp/ContactPicker.m:()V
        //   226: iconst_1       
        //   227: ireturn        
        //   228: aload_0        
        //   229: invokevirtual   com/whatsapp/ContactPicker.finish:()V
        //   232: iconst_1       
        //   233: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  4      68     80     83     Landroid/content/ActivityNotFoundException;
        //  68     78     80     83     Landroid/content/ActivityNotFoundException;
        //  101    130    190    195    Landroid/content/ActivityNotFoundException;
        //  134    149    174    190    Landroid/content/ActivityNotFoundException;
        //  154    157    195    200    Landroid/content/ActivityNotFoundException;
        //  161    167    169    174    Landroid/content/ActivityNotFoundException;
        //  171    174    174    190    Landroid/content/ActivityNotFoundException;
        //  197    200    169    174    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0161:
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
    
    public void onPause() {
        super.onPause();
    }
    
    protected void onRestoreInstanceState(final Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        final String string = bundle.getString(ContactPicker.Z[60]);
        Label_0031: {
            if (string == null) {
                break Label_0031;
            }
            try {
                this.F = App.S.e(string);
                this.I = (Intent)bundle.getParcelable(ContactPicker.Z[61]);
            }
            catch (SecurityException ex) {
                throw ex;
            }
        }
    }
    
    public void onResume() {
        try {
            super.onResume();
            if (!ContactPicker.l) {
                this.b();
            }
        }
        catch (SecurityException ex) {
            throw ex;
        }
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: invokespecial   com/whatsapp/VerifyMessageStoreActivity.onSaveInstanceState:(Landroid/os/Bundle;)V
        //     5: aload_0        
        //     6: getfield        com/whatsapp/ContactPicker.F:Lcom/whatsapp/a_9;
        //     9: ifnull          28
        //    12: aload_1        
        //    13: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //    16: iconst_0       
        //    17: aaload         
        //    18: aload_0        
        //    19: getfield        com/whatsapp/ContactPicker.F:Lcom/whatsapp/a_9;
        //    22: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    25: invokevirtual   android/os/Bundle.putCharSequence:(Ljava/lang/String;Ljava/lang/CharSequence;)V
        //    28: aload_0        
        //    29: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //    32: ifnull          48
        //    35: aload_1        
        //    36: getstatic       com/whatsapp/ContactPicker.Z:[Ljava/lang/String;
        //    39: iconst_1       
        //    40: aaload         
        //    41: aload_0        
        //    42: getfield        com/whatsapp/ContactPicker.I:Landroid/content/Intent;
        //    45: invokevirtual   android/os/Bundle.putParcelable:(Ljava/lang/String;Landroid/os/Parcelable;)V
        //    48: return         
        //    49: astore_2       
        //    50: aload_2        
        //    51: athrow         
        //    52: astore_3       
        //    53: aload_3        
        //    54: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  0      28     49     52     Ljava/lang/SecurityException;
        //  28     48     52     55     Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0028:
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
    
    public boolean onSearchRequested() {
        try {
            if (this.z != null) {
                MenuItemCompat.expandActionView(this.z);
            }
            return false;
        }
        catch (SecurityException ex) {
            throw ex;
        }
    }
}
