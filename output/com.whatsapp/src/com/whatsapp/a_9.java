// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.b6;
import android.content.ContentUris;
import com.whatsapp.contact.ContactProvider;
import android.annotation.TargetApi;
import android.provider.ContactsContract$Contacts;
import java.util.ArrayList;
import android.support.annotation.NonNull;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.content.Context;
import android.content.res.Resources;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import android.provider.ContactsContract$RawContacts;
import android.content.ContentResolver;
import android.graphics.BitmapFactory;
import android.os.Build$VERSION;
import android.net.Uri;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.io.File;
import android.telephony.PhoneNumberUtils;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import com.whatsapp.util.Log;
import com.google.f9;
import com.google.e6;
import android.graphics.Bitmap;
import com.whatsapp.contact.o;
import android.database.Cursor;
import java.util.Map;
import android.util.SparseArray;

public class a_9
{
    private static final SparseArray f;
    public static boolean k;
    public static final String[] y;
    private static final String[] z;
    public long a;
    public boolean b;
    public String c;
    public String d;
    public xg e;
    public boolean g;
    public transient boolean h;
    @Deprecated
    public String i;
    public String j;
    public int l;
    public String m;
    private Map n;
    public String o;
    public long p;
    public int q;
    public String r;
    public long s;
    public String t;
    public String u;
    public int v;
    public Integer w;
    public ad6 x;
    
    static {
        final String[] array = new String[80];
        String s = "zE+~w{V7k";
        int n = -1;
        String[] array2 = array;
        String[] array3 = array;
        int n2 = 0;
        String intern = null;
    Label_2704:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0013';
                        break;
                    }
                    case 0: {
                        c2 = '\u0018';
                        break;
                    }
                    case 1: {
                        c2 = '7';
                        break;
                    }
                    case 2: {
                        c2 = 'D';
                        break;
                    }
                    case 3: {
                        c2 = '\u001f';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array2[n2] = intern;
                    s = "6]";
                    n2 = 1;
                    array2 = array3;
                    n = 0;
                    continue;
                }
                case 0: {
                    array2[n2] = intern;
                    s = "YZ%e|v\u007f+rvO^ xvlv2~gyE7";
                    n2 = 2;
                    array2 = array3;
                    n = 1;
                    continue;
                }
                case 1: {
                    array2[n2] = intern;
                    s = "mG ~g}g,pgwq-svk";
                    n2 = 3;
                    array2 = array3;
                    n = 2;
                    continue;
                }
                case 2: {
                    array2[n2] = intern;
                    n2 = 4;
                    array2 = array3;
                    s = "XDjh{yC7~ch\u0019*zg";
                    n = 3;
                    continue;
                }
                case 3: {
                    array2[n2] = intern;
                    n2 = 5;
                    s = "XDjh{yC7~ch\u0019*zg";
                    n = 4;
                    array2 = array3;
                    continue;
                }
                case 4: {
                    array2[n2] = intern;
                    n2 = 6;
                    s = "wG!qPwY0~plg,pgw~*ofld0mvyZ";
                    n = 5;
                    array2 = array3;
                    continue;
                }
                case 5: {
                    array2[n2] = intern;
                    n2 = 7;
                    s = "lR)o";
                    n = 6;
                    array2 = array3;
                    continue;
                }
                case 6: {
                    array2[n2] = intern;
                    n2 = 8;
                    s = "6]";
                    n = 7;
                    array2 = array3;
                    continue;
                }
                case 7: {
                    array2[n2] = intern;
                    n2 = 9;
                    s = "YA%krjD";
                    n = 8;
                    array2 = array3;
                    continue;
                }
                case 8: {
                    array2[n2] = intern;
                    n2 = 10;
                    s = "lR)o";
                    n = 9;
                    array2 = array3;
                    continue;
                }
                case 9: {
                    array2[n2] = intern;
                    n2 = 11;
                    s = "{B7k|uh6v}\u007fC+qv";
                    n = 10;
                    array2 = array3;
                    continue;
                }
                case 10: {
                    array2[n2] = intern;
                    n2 = 12;
                    s = "\u2036\u201d";
                    n = 11;
                    array2 = array3;
                    continue;
                }
                case 11: {
                    array2[n2] = intern;
                    n2 = 13;
                    s = "XU6pr|T%lg";
                    n = 12;
                    array2 = array3;
                    continue;
                }
                case 12: {
                    array2[n2] = intern;
                    n2 = 14;
                    s = "zE+~w{V7k";
                    n = 13;
                    array2 = array3;
                    continue;
                }
                case 13: {
                    array2[n2] = intern;
                    n2 = 15;
                    s = "{B7k|uh6v}\u007fC+qv";
                    n = 14;
                    array2 = array3;
                    continue;
                }
                case 14: {
                    array2[n2] = intern;
                    n2 = 16;
                    s = "XDjh{yC7~ch\u0019*zg";
                    n = 15;
                    array2 = array3;
                    continue;
                }
                case 15: {
                    array2[n2] = intern;
                    n2 = 17;
                    s = "oV'p}lV'k<\u007fR0o{wC+yrkCkzajX6?";
                    n = 16;
                    array2 = array3;
                    continue;
                }
                case 16: {
                    array2[n2] = intern;
                    n2 = 18;
                    s = "8R6m|j\u0017's|k^*x3kC6zru";
                    n = 17;
                    array2 = array3;
                    continue;
                }
                case 17: {
                    array2[n2] = intern;
                    s = "oV'p}lV'k<\u007fR0o{wC+yrkCk";
                    n = 18;
                    n2 = 19;
                    array2 = array3;
                    continue;
                }
                case 18: {
                    array2[n2] = intern;
                    n2 = 20;
                    array2 = array3;
                    s = "8S!|||R\u0017ka}V)?a}C1m}k\u0017*j\u007ft";
                    n = 19;
                    continue;
                }
                case 19: {
                    array2[n2] = intern;
                    n2 = 21;
                    s = "oV'p}lV'k<\u007fR0o{wC+yrkCkpfl\u001a+y>uR)paa\u0017";
                    n = 20;
                    array2 = array3;
                    continue;
                }
                case 20: {
                    array2[n2] = intern;
                    n2 = 22;
                    s = "8D0mvyZdv`8Y1s\u007f";
                    n = 21;
                    array2 = array3;
                    continue;
                }
                case 21: {
                    array2[n2] = intern;
                    n2 = 23;
                    s = "oV'p}lV'k<\u007fR0o{wC+yrkCk";
                    n = 22;
                    array2 = array3;
                    continue;
                }
                case 22: {
                    array2[n2] = intern;
                    n2 = 24;
                    s = "oV'p}lV'k<\u007fR0o{wC+yrkCk";
                    n = 23;
                    array2 = array3;
                    continue;
                }
                case 23: {
                    array2[n2] = intern;
                    n2 = 25;
                    s = "Bm";
                    n = 24;
                    array2 = array3;
                    continue;
                }
                case 24: {
                    array2[n2] = intern;
                    n2 = 26;
                    s = "{X*kr{Cky|jZ%kg}Eiv}qCizk{R4kzwYdqfu\r";
                    n = 25;
                    array2 = array3;
                    continue;
                }
                case 25: {
                    array2[n2] = intern;
                    n2 = 27;
                    s = "{X*kr{Cky|jZ%kg}Eizk{R4kzwYdqfu\r";
                    n = 26;
                    array2 = array3;
                    continue;
                }
                case 26: {
                    array2[n2] = intern;
                    n2 = 28;
                    s = "0Y1s\u007f1";
                    n = 27;
                    array2 = array3;
                    continue;
                }
                case 27: {
                    array2[n2] = intern;
                    n2 = 29;
                    s = "8^7hr%";
                    n = 28;
                    array2 = array3;
                    continue;
                }
                case 28: {
                    array2[n2] = intern;
                    n2 = 30;
                    s = "8\\!f.";
                    n = 29;
                    array2 = array3;
                    continue;
                }
                case 29: {
                    array2[n2] = intern;
                    n2 = 31;
                    s = "0Y1s\u007f1";
                    n = 30;
                    array2 = array3;
                    continue;
                }
                case 30: {
                    array2[n2] = intern;
                    n2 = 32;
                    s = "jX3@z|\n";
                    n = 31;
                    array2 = array3;
                    continue;
                }
                case 31: {
                    array2[n2] = intern;
                    n2 = 33;
                    s = "8]-{.";
                    n = 32;
                    array2 = array3;
                    continue;
                }
                case 32: {
                    array2[n2] = intern;
                    n2 = 34;
                    s = "8G,p}}\n";
                    n = 33;
                    array2 = array3;
                    continue;
                }
                case 33: {
                    array2[n2] = intern;
                    n2 = 35;
                    s = "hE+}\u007f}Z%kz{\u0017'p}lV'k)";
                    n = 34;
                    array2 = array3;
                    continue;
                }
                case 34: {
                    array2[n2] = intern;
                    n2 = 36;
                    s = "jX3@z|\n";
                    n = 35;
                    array2 = array3;
                    continue;
                }
                case 35: {
                    array2[n2] = intern;
                    n2 = 37;
                    s = "8]-{.";
                    n = 36;
                    array2 = array3;
                    continue;
                }
                case 36: {
                    array2[n2] = intern;
                    n2 = 38;
                    s = "0Y1s\u007f1";
                    n = 37;
                    array2 = array3;
                    continue;
                }
                case 37: {
                    array2[n2] = intern;
                    n2 = 39;
                    s = "8G,p}}\n";
                    n = 38;
                    array2 = array3;
                    continue;
                }
                case 38: {
                    array2[n2] = intern;
                    n2 = 40;
                    s = "8\\!f.";
                    n = 39;
                    array2 = array3;
                    continue;
                }
                case 39: {
                    array2[n2] = intern;
                    n2 = 41;
                    s = "8Y%rv%";
                    n = 40;
                    array2 = array3;
                    continue;
                }
                case 40: {
                    array2[n2] = intern;
                    n2 = 42;
                    s = "8^7hr%";
                    n = 41;
                    array2 = array3;
                    continue;
                }
                case 41: {
                    array2[n2] = intern;
                    n2 = 43;
                    s = "8D0~gmDy";
                    n = 42;
                    array2 = array3;
                    continue;
                }
                case 42: {
                    array2[n2] = intern;
                    n2 = 44;
                    s = "8Y%rv%";
                    n = 43;
                    array2 = array3;
                    continue;
                }
                case 43: {
                    array2[n2] = intern;
                    n2 = 45;
                    s = "0Y1s\u007f1";
                    n = 44;
                    array2 = array3;
                    continue;
                }
                case 44: {
                    array2[n2] = intern;
                    n2 = 46;
                    s = "8S+z`8Y+k3}O-lg4\u0017*pgp^*x3lXd{vtR0z=";
                    n = 45;
                    array2 = array3;
                    continue;
                }
                case 45: {
                    array2[n2] = intern;
                    n2 = 47;
                    s = "Ov\u0007p}lV'k<|R(zg}h4w|lX\u001byztR7?";
                    n = 46;
                    array2 = array3;
                    continue;
                }
                case 46: {
                    array2[n2] = intern;
                    n2 = 48;
                    s = "Ov\u0007p}lV'k<|R(zg}h4w|lX\u001byztR7?";
                    n = 47;
                    array2 = array3;
                    continue;
                }
                case 47: {
                    array2[n2] = intern;
                    n2 = 49;
                    s = "8S+z`8Y+k3}O-lg4\u0017*pgp^*x3lXd{vtR0z=";
                    n = 48;
                    array2 = array3;
                    continue;
                }
                case 48: {
                    array2[n2] = intern;
                    n2 = 50;
                    s = "{X*kr{Cko{wY!qfuU!m<r^ 0}m[(";
                    n = 49;
                    array2 = array3;
                    continue;
                }
                case 49: {
                    array2[n2] = intern;
                    n2 = 51;
                    s = "\u007fR0[v~V1sg";
                    n = 50;
                    array2 = array3;
                    continue;
                }
                case 50: {
                    array2[n2] = intern;
                    n2 = 52;
                    s = "8D,pftSd}v8G1}\u007fqT";
                    n = 51;
                    array2 = array3;
                    continue;
                }
                case 51: {
                    array2[n2] = intern;
                    n2 = 53;
                    s = "\u007fR0[v~V1sg8Z!k{wSdp}8";
                    n = 52;
                    array2 = array3;
                    continue;
                }
                case 52: {
                    array2[n2] = intern;
                    n2 = 54;
                    s = "\u007fR0[v~V1sg8Z!k{wSdrzkD-qt8X*?";
                    n = 53;
                    array2 = array3;
                    continue;
                }
                case 53: {
                    array2[n2] = intern;
                    n2 = 55;
                    s = "8D,pftSdq|l\u00170waw@d~}a\u0017!gp}G0v|vD";
                    n = 54;
                    array2 = array3;
                    continue;
                }
                case 54: {
                    array2[n2] = intern;
                    n2 = 56;
                    s = "\u007fR0[v~V1sg8Z!k{wSdp}8";
                    n = 55;
                    array2 = array3;
                    continue;
                }
                case 55: {
                    array2[n2] = intern;
                    n2 = 57;
                    s = "6]4x";
                    n = 56;
                    array2 = array3;
                    continue;
                }
                case 56: {
                    array2[n2] = intern;
                    n2 = 58;
                    s = "6Y+rv|^%";
                    n = 57;
                    array2 = array3;
                    continue;
                }
                case 57: {
                    array2[n2] = intern;
                    n2 = 59;
                    s = "6]4x";
                    n = 58;
                    array2 = array3;
                    continue;
                }
                case 58: {
                    array2[n2] = intern;
                    n2 = 60;
                    s = "HE+yztRdOz{C1mvk";
                    n = 59;
                    array2 = array3;
                    continue;
                }
                case 59: {
                    array2[n2] = intern;
                    n2 = 61;
                    s = "{V(sL{B7k|uh6v}\u007fC+qv";
                    n = 60;
                    array2 = array3;
                    continue;
                }
                case 60: {
                    array2[n2] = intern;
                    n2 = 62;
                    s = "|V0~ ";
                    n = 61;
                    array2 = array3;
                    continue;
                }
                case 61: {
                    array2[n2] = intern;
                    n2 = 63;
                    s = "jV3@pwY0~plh-{3%\u0017{?RVsdrzuR0fc}\n{";
                    n = 62;
                    array2 = array3;
                    continue;
                }
                case 62: {
                    array2[n2] = intern;
                    n2 = 64;
                    s = "|V0~*";
                    n = 63;
                    array2 = array3;
                    continue;
                }
                case 63: {
                    array2[n2] = intern;
                    n2 = 65;
                    s = "nY 1rvS6pz|\u0019'jakX61zlR)0}yZ!";
                    n = 64;
                    array2 = array3;
                    continue;
                }
                case 64: {
                    array2[n2] = intern;
                    n2 = 66;
                    s = "|V0~$";
                    n = 65;
                    array2 = array3;
                    continue;
                }
                case 65: {
                    array2[n2] = intern;
                    n2 = 67;
                    s = "|V0~$";
                    n = 66;
                    array2 = array3;
                    continue;
                }
                case 66: {
                    array2[n2] = intern;
                    n2 = 68;
                    s = "|V0~!";
                    n = 67;
                    array2 = array3;
                    continue;
                }
                case 67: {
                    array2[n2] = intern;
                    n2 = 69;
                    s = "|V0~*";
                    n = 68;
                    array2 = array3;
                    continue;
                }
                case 68: {
                    array2[n2] = intern;
                    n2 = 70;
                    s = "|V0~ ";
                    n = 69;
                    array2 = array3;
                    continue;
                }
                case 69: {
                    array2[n2] = intern;
                    n2 = 71;
                    s = "|V0~!";
                    n = 70;
                    array2 = array3;
                    continue;
                }
                case 70: {
                    array2[n2] = intern;
                    n2 = 72;
                    s = "uX1qg}S";
                    n = 71;
                    array2 = array3;
                    continue;
                }
                case 71: {
                    array2[n2] = intern;
                    n2 = 73;
                    s = "8Q1s\u007f8Q-sv8Z-l`qY#?z|\r";
                    n = 72;
                    array2 = array3;
                    continue;
                }
                case 72: {
                    array2[n2] = intern;
                    n2 = 74;
                    s = "8C,j~z\u0017\"v\u007f}\u0017)v`k^*x3qS~";
                    n = 73;
                    array2 = array3;
                    continue;
                }
                case 73: {
                    array2[n2] = intern;
                    n2 = 75;
                    s = "oV'p}lV'k<\u007fR0o{wC+lgjR%r<";
                    n = 74;
                    array2 = array3;
                    continue;
                }
                case 74: {
                    array2[n2] = intern;
                    n2 = 76;
                    s = "oV'p}lV'k<\u007fR0o{wC+lgjR%r<";
                    n = 75;
                    array2 = array3;
                    continue;
                }
                case 75: {
                    array2[n2] = intern;
                    n2 = 77;
                    s = "uX1qg}S\u001bm|";
                    n = 76;
                    array2 = array3;
                    continue;
                }
                case 76: {
                    array2[n2] = intern;
                    n2 = 78;
                    s = "7T+j}l\u0017";
                    n = 77;
                    array2 = array3;
                    continue;
                }
                case 77: {
                    array2[n2] = intern;
                    n2 = 79;
                    s = "lR)o";
                    n = 78;
                    array2 = array3;
                    continue;
                }
                case 78: {
                    array2[n2] = intern;
                    z = array3;
                    final String[] array4 = new String[19];
                    s = "G^ ";
                    n = 79;
                    array2 = array4;
                    array3 = array4;
                    n2 = 0;
                    continue;
                }
                case 79: {
                    array2[n2] = intern;
                    s = "r^ ";
                    n = 80;
                    n2 = 1;
                    array2 = array3;
                    continue;
                }
                case 80: {
                    array2[n2] = intern;
                    s = "qD\u001bh{yC7~chh1lvj";
                    n = 81;
                    n2 = 2;
                    array2 = array3;
                    continue;
                }
                case 81: {
                    array2[n2] = intern;
                    s = "kC%kfk";
                    n = 82;
                    n2 = 3;
                    array2 = array3;
                    continue;
                }
                case 82: {
                    array2[n2] = intern;
                    n2 = 4;
                    s = "vB)}vj";
                    n = 83;
                    array2 = array3;
                    continue;
                }
                case 83: {
                    array2[n2] = intern;
                    n2 = 5;
                    s = "jV3@pwY0~plh-{";
                    n = 84;
                    array2 = array3;
                    continue;
                }
                case 84: {
                    array2[n2] = intern;
                    n2 = 6;
                    s = "|^7o\u007fyN\u001bqruR";
                    n = 85;
                    array2 = array3;
                    continue;
                }
                case 85: {
                    array2[n2] = intern;
                    n2 = 7;
                    s = "h_+qvGC=ov";
                    n = 86;
                    array2 = array3;
                    continue;
                }
                case 86: {
                    array2[n2] = intern;
                    n2 = 8;
                    s = "h_+qvG[%}vt";
                    n = 87;
                    array2 = array3;
                    continue;
                }
                case 87: {
                    array2[n2] = intern;
                    n2 = 9;
                    s = "mY7zvvh)ltGT+j}l";
                    n = 88;
                    array2 = array3;
                    continue;
                }
                case 88: {
                    array2[n2] = intern;
                    n2 = 10;
                    s = "h_+k|GC7";
                    n = 89;
                    array2 = array3;
                    continue;
                }
                case 89: {
                    array2[n2] = intern;
                    n2 = 11;
                    s = "l_1rqGC7";
                    n = 90;
                    array2 = array3;
                    continue;
                }
                case 90: {
                    array2[n2] = intern;
                    n2 = 12;
                    s = "h_+k|G^ @gqZ!lgyZ4";
                    n = 91;
                    array2 = array3;
                    continue;
                }
                case 91: {
                    array2[n2] = intern;
                    n2 = 13;
                    s = "\u007f^2z}GY%rv";
                    n = 92;
                    array2 = array3;
                    continue;
                }
                case 92: {
                    array2[n2] = intern;
                    n2 = 14;
                    s = "~V)v\u007fah*~~}";
                    n = 93;
                    array2 = array3;
                    continue;
                }
                case 93: {
                    array2[n2] = intern;
                    n2 = 15;
                    s = "oV\u001bqruR";
                    n = 94;
                    array2 = array3;
                    continue;
                }
                case 94: {
                    array2[n2] = intern;
                    n2 = 16;
                    s = "kX6kLvV)z";
                    n = 95;
                    array2 = array3;
                    continue;
                }
                case 95: {
                    array2[n2] = intern;
                    n2 = 17;
                    s = "kC%kfkh0v~}D0~~h";
                    n = 96;
                    array2 = array3;
                    continue;
                }
                case 96: {
                    array2[n2] = intern;
                    n2 = 18;
                    s = "{V(srz^(vga";
                    n = 97;
                    array2 = array3;
                    continue;
                }
                case 97: {
                    break Label_2704;
                }
            }
        }
        array2[n2] = intern;
        y = array3;
        f = new SparseArray();
    }
    
    private a_9(final Cursor p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: aload_0        
        //     3: invokespecial   java/lang/Object.<init>:()V
        //     6: aload_0        
        //     7: ldc2_w          -1
        //    10: putfield        com/whatsapp/a_9.p:J
        //    13: aload_0        
        //    14: aconst_null    
        //    15: putfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //    18: aload_0        
        //    19: aconst_null    
        //    20: putfield        com/whatsapp/a_9.w:Ljava/lang/Integer;
        //    23: aload_0        
        //    24: iconst_0       
        //    25: putfield        com/whatsapp/a_9.g:Z
        //    28: aload_0        
        //    29: aconst_null    
        //    30: putfield        com/whatsapp/a_9.i:Ljava/lang/String;
        //    33: aload_0        
        //    34: iload_2        
        //    35: putfield        com/whatsapp/a_9.h:Z
        //    38: aload_0        
        //    39: aload_1        
        //    40: iload_2        
        //    41: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //    46: putfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    49: aload_0        
        //    50: aload_1        
        //    51: iconst_3       
        //    52: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //    57: putfield        com/whatsapp/a_9.d:Ljava/lang/String;
        //    60: aload_0        
        //    61: aload_1        
        //    62: bipush          17
        //    64: invokeinterface android/database/Cursor.getLong:(I)J
        //    69: putfield        com/whatsapp/a_9.s:J
        //    72: aload_0        
        //    73: aload_1        
        //    74: iconst_0       
        //    75: invokeinterface android/database/Cursor.getLong:(I)J
        //    80: putfield        com/whatsapp/a_9.p:J
        //    83: aload_0        
        //    84: aload_1        
        //    85: bipush          6
        //    87: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //    92: putfield        com/whatsapp/a_9.t:Ljava/lang/String;
        //    95: aload_0        
        //    96: aload_1        
        //    97: bipush          7
        //    99: invokeinterface android/database/Cursor.getInt:(I)I
        //   104: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   107: putfield        com/whatsapp/a_9.w:Ljava/lang/Integer;
        //   110: aload_0        
        //   111: aload_1        
        //   112: bipush          8
        //   114: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   119: putfield        com/whatsapp/a_9.m:Ljava/lang/String;
        //   122: aload_1        
        //   123: iconst_4       
        //   124: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   129: astore_3       
        //   130: aload_1        
        //   131: iconst_5       
        //   132: invokeinterface android/database/Cursor.getLong:(I)J
        //   137: lstore          4
        //   139: lload           4
        //   141: lconst_0       
        //   142: lcmp           
        //   143: ifgt            155
        //   146: lload           4
        //   148: ldc2_w          -2
        //   151: lcmp           
        //   152: ifne            194
        //   155: aload_3        
        //   156: ifnull          194
        //   159: aload_3        
        //   160: invokestatic    com/whatsapp/contact/o.a:(Ljava/lang/String;)Z
        //   163: istore          11
        //   165: iload           11
        //   167: ifeq            194
        //   170: aload_0        
        //   171: new             Lcom/whatsapp/xg;
        //   174: dup            
        //   175: lload           4
        //   177: aload_3        
        //   178: invokespecial   com/whatsapp/xg.<init>:(JLjava/lang/String;)V
        //   181: putfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //   184: getstatic       com/whatsapp/a_9.k:Z
        //   187: istore          12
        //   189: iload           12
        //   191: ifeq            203
        //   194: aload_3        
        //   195: ifnull          203
        //   198: aload_0        
        //   199: aload_3        
        //   200: putfield        com/whatsapp/a_9.i:Ljava/lang/String;
        //   203: aload_1        
        //   204: iconst_2       
        //   205: invokeinterface android/database/Cursor.getInt:(I)I
        //   210: istore          7
        //   212: iload           7
        //   214: iload_2        
        //   215: if_icmpne       355
        //   218: aload_0        
        //   219: iload_2        
        //   220: putfield        com/whatsapp/a_9.b:Z
        //   223: aload_0        
        //   224: aload_1        
        //   225: bipush          9
        //   227: invokeinterface android/database/Cursor.getInt:(I)I
        //   232: putfield        com/whatsapp/a_9.l:I
        //   235: aload_0        
        //   236: aload_1        
        //   237: bipush          10
        //   239: invokeinterface android/database/Cursor.getInt:(I)I
        //   244: putfield        com/whatsapp/a_9.v:I
        //   247: aload_0        
        //   248: aload_1        
        //   249: bipush          11
        //   251: invokeinterface android/database/Cursor.getInt:(I)I
        //   256: putfield        com/whatsapp/a_9.q:I
        //   259: aload_0        
        //   260: aload_1        
        //   261: bipush          12
        //   263: invokeinterface android/database/Cursor.getLong:(I)J
        //   268: putfield        com/whatsapp/a_9.a:J
        //   271: aload_0        
        //   272: aload_1        
        //   273: bipush          13
        //   275: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   280: putfield        com/whatsapp/a_9.c:Ljava/lang/String;
        //   283: aload_0        
        //   284: aload_1        
        //   285: bipush          14
        //   287: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   292: putfield        com/whatsapp/a_9.j:Ljava/lang/String;
        //   295: aload_0        
        //   296: aload_1        
        //   297: bipush          15
        //   299: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   304: putfield        com/whatsapp/a_9.o:Ljava/lang/String;
        //   307: aload_0        
        //   308: aload_1        
        //   309: bipush          16
        //   311: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   316: putfield        com/whatsapp/a_9.r:Ljava/lang/String;
        //   319: aload_0        
        //   320: aload_1        
        //   321: bipush          18
        //   323: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   328: invokestatic    com/whatsapp/ad6.fromText:(Ljava/lang/String;)Lcom/whatsapp/ad6;
        //   331: putfield        com/whatsapp/a_9.x:Lcom/whatsapp/ad6;
        //   334: return         
        //   335: astore          9
        //   337: aload           9
        //   339: athrow         
        //   340: astore          10
        //   342: aload           10
        //   344: athrow         
        //   345: astore          8
        //   347: aload           8
        //   349: athrow         
        //   350: astore          6
        //   352: aload           6
        //   354: athrow         
        //   355: iconst_0       
        //   356: istore_2       
        //   357: goto            218
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  159    165    335    340    Ljava/lang/IllegalArgumentException;
        //  170    189    340    345    Ljava/lang/IllegalArgumentException;
        //  198    203    345    350    Ljava/lang/IllegalArgumentException;
        //  203    212    350    355    Ljava/lang/IllegalArgumentException;
        //  337    340    340    345    Ljava/lang/IllegalArgumentException;
        //  342    345    345    350    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 169, Size: 169
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
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
    
    public a_9(final o o) {
        this(o.e(), o.g(), o.c(), o.f(), o.d());
        this.r = o.a();
    }
    
    public a_9(final xg e, final String t, final int n, final String m) {
        this.p = -1L;
        this.e = null;
        this.w = null;
        this.g = false;
        this.i = null;
        this.h = true;
        this.e = e;
        this.t = t;
        this.w = n;
        this.m = m;
    }
    
    public a_9(final String u) {
        this.p = -1L;
        this.e = null;
        this.w = null;
        this.g = false;
        this.i = null;
        this.h = true;
        this.u = u;
        this.b = true;
        this.e = null;
    }
    
    public a_9(final String s, final long n, final String s2, final int n2, final String s3) {
        this(new xg(n, s), s2, n2, s3);
    }
    
    private a_9(final String u, final boolean b, final String s, final long n, final String t) {
        this.p = -1L;
        this.e = null;
        this.w = null;
        this.g = false;
        this.i = null;
        this.h = true;
        this.u = u;
        this.b = b;
        this.t = t;
        if ((n <= 0L && n != -2L) || s == null) {
            return;
        }
        try {
            if (com.whatsapp.contact.o.a(s)) {
                this.e = new xg(n, s);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public static Bitmap a(final int p0, final int p1, final float p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/a_9.k:Z
        //     3: istore_3       
        //     4: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //     7: invokevirtual   com/whatsapp/App.getResources:()Landroid/content/res/Resources;
        //    10: iload_0        
        //    11: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //    14: astore          4
        //    16: iload_1        
        //    17: iload_1        
        //    18: getstatic       android/graphics/Bitmap$Config.ARGB_8888:Landroid/graphics/Bitmap$Config;
        //    21: invokestatic    android/graphics/Bitmap.createBitmap:(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
        //    24: astore          5
        //    26: new             Landroid/graphics/Canvas;
        //    29: dup            
        //    30: aload           5
        //    32: invokespecial   android/graphics/Canvas.<init>:(Landroid/graphics/Bitmap;)V
        //    35: astore          6
        //    37: aload           4
        //    39: iconst_0       
        //    40: iconst_0       
        //    41: iload_1        
        //    42: iload_1        
        //    43: invokevirtual   android/graphics/drawable/Drawable.setBounds:(IIII)V
        //    46: aload           4
        //    48: instanceof      Landroid/graphics/drawable/BitmapDrawable;
        //    51: ifeq            184
        //    54: new             Landroid/graphics/Paint;
        //    57: dup            
        //    58: invokespecial   android/graphics/Paint.<init>:()V
        //    61: astore          7
        //    63: new             Landroid/graphics/RectF;
        //    66: dup            
        //    67: fconst_0       
        //    68: fconst_0       
        //    69: iload_1        
        //    70: i2f            
        //    71: iload_1        
        //    72: i2f            
        //    73: invokespecial   android/graphics/RectF.<init>:(FFFF)V
        //    76: astore          8
        //    78: aload           7
        //    80: iconst_1       
        //    81: invokevirtual   android/graphics/Paint.setAntiAlias:(Z)V
        //    84: aload           7
        //    86: iconst_1       
        //    87: invokevirtual   android/graphics/Paint.setDither:(Z)V
        //    90: aload           7
        //    92: iconst_1       
        //    93: invokevirtual   android/graphics/Paint.setFilterBitmap:(Z)V
        //    96: aload           6
        //    98: iconst_0       
        //    99: iconst_0       
        //   100: iconst_0       
        //   101: iconst_0       
        //   102: invokevirtual   android/graphics/Canvas.drawARGB:(IIII)V
        //   105: aload           7
        //   107: iconst_m1      
        //   108: invokevirtual   android/graphics/Paint.setColor:(I)V
        //   111: fload_2        
        //   112: fconst_0       
        //   113: fcmpl          
        //   114: iflt            132
        //   117: aload           6
        //   119: aload           8
        //   121: fload_2        
        //   122: fload_2        
        //   123: aload           7
        //   125: invokevirtual   android/graphics/Canvas.drawRoundRect:(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V
        //   128: iload_3        
        //   129: ifeq            146
        //   132: aload           6
        //   134: aload           8
        //   136: fconst_0       
        //   137: ldc_w           360.0
        //   140: iconst_1       
        //   141: aload           7
        //   143: invokevirtual   android/graphics/Canvas.drawArc:(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V
        //   146: aload           7
        //   148: new             Landroid/graphics/PorterDuffXfermode;
        //   151: dup            
        //   152: getstatic       android/graphics/PorterDuff$Mode.SRC_IN:Landroid/graphics/PorterDuff$Mode;
        //   155: invokespecial   android/graphics/PorterDuffXfermode.<init>:(Landroid/graphics/PorterDuff$Mode;)V
        //   158: invokevirtual   android/graphics/Paint.setXfermode:(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;
        //   161: pop            
        //   162: aload           6
        //   164: aload           4
        //   166: checkcast       Landroid/graphics/drawable/BitmapDrawable;
        //   169: invokevirtual   android/graphics/drawable/BitmapDrawable.getBitmap:()Landroid/graphics/Bitmap;
        //   172: aconst_null    
        //   173: aload           8
        //   175: aload           7
        //   177: invokevirtual   android/graphics/Canvas.drawBitmap:(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V
        //   180: iload_3        
        //   181: ifeq            191
        //   184: aload           4
        //   186: aload           6
        //   188: invokevirtual   android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
        //   191: aload           5
        //   193: areturn        
        //   194: astore          9
        //   196: aload           9
        //   198: athrow         
        //   199: astore          10
        //   201: aload           10
        //   203: athrow         
        //   204: astore          11
        //   206: aload           11
        //   208: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  78     111    194    199    Ljava/lang/IllegalArgumentException;
        //  117    128    199    204    Ljava/lang/IllegalArgumentException;
        //  132    146    199    204    Ljava/lang/IllegalArgumentException;
        //  146    180    204    209    Ljava/lang/IllegalArgumentException;
        //  184    191    204    209    Ljava/lang/IllegalArgumentException;
        //  196    199    199    204    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 108, Size: 108
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
    
    public static a_9 a(final Cursor cursor) {
        while (true) {
            boolean b = true;
            while (true) {
                try {
                    final String string = cursor.getString(1);
                    if (cursor.getInt(2) == (b ? 1 : 0)) {
                        final a_9 a_9 = new a_9(string, b, cursor.getString(3), cursor.getLong(4), cursor.getString(5));
                        a_9.p = cursor.getLong(0);
                        return a_9;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                b = false;
                continue;
            }
        }
    }
    
    public static String a(final String s) {
        final String string = '+' + s;
        try {
            final e6 a = e6.a();
            return a.a(a.b(string, a_9.z[25]), f9.INTERNATIONAL);
        }
        catch (Exception ex) {
            Log.e(a_9.z[27] + string + " " + ex.getMessage());
            return string;
        }
        catch (ExceptionInInitializerError exceptionInInitializerError) {
            Log.e(a_9.z[26] + string + " " + exceptionInInitializerError.getMessage());
            return string;
        }
    }
    
    public static void a(final Collection collection, final String s, final String s2) {
    Block_4:
        while (true) {
            final boolean k = a_9.k;
            final int size = collection.size();
            try {
                Log.i(s + a_9.z[78] + size);
                if (App.aV < 1) {
                    return;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            if (size < 5000) {
                for (final a_9 a_9 : collection) {
                    if (k) {
                        break Block_4;
                    }
                }
            }
            return;
        }
    }
    
    public static boolean a(final List list, final w2 w2) {
        final boolean k = a_9.k;
        if (list != null) {
            final Iterator<a_9> iterator = list.iterator();
            boolean b = false;
            while (iterator.hasNext()) {
                boolean b2;
                while (true) {
                    final a_9 a_9 = iterator.next();
                    while (true) {
                        try {
                            if (w2.a(a_9) || b) {
                                b2 = true;
                                if (k) {
                                    return b2;
                                }
                                break;
                            }
                        }
                        catch (IllegalArgumentException ex) {
                            try {
                                throw ex;
                            }
                            catch (IllegalArgumentException ex2) {
                                throw ex2;
                            }
                        }
                        b2 = false;
                        continue;
                    }
                }
                b = b2;
            }
            return b;
        }
        return false;
    }
    
    public static Bitmap b(final int n) {
        final Bitmap bitmap = (Bitmap)a_9.f.get(n);
        if (bitmap != null) {
            return bitmap;
        }
        final Bitmap a = a(n, App.aq.getResources().getDimensionPixelSize(2131361952), App.aq.getResources().getDimension(2131361814));
        a_9.f.put(n, (Object)a);
        return a;
    }
    
    public static a_9 b(final Cursor cursor) {
        return new a_9(cursor);
    }
    
    public static String b(String s) {
        Label_0022: {
            if (s != null) {
                break Label_0022;
            }
            try {
                Log.w(a_9.z[50]);
                s = null;
                return s;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        final int index = s.indexOf(64);
        if (index == -1) {
            return s;
        }
        try {
            if (c(s)) {
                return s.substring(1 + s.indexOf("-"), s.lastIndexOf("@"));
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        String s2 = s.substring(0, index);
        try {
            if (PhoneNumberUtils.isGlobalPhoneNumber(s2)) {
                if (!adc.b(s)) {
                    s2 = a(s2);
                    if (!a_9.k) {
                        return s2;
                    }
                }
                s2 = "+" + s2;
            }
            return s2;
        }
        catch (IllegalArgumentException ex3) {
            throw ex3;
        }
    }
    
    public static boolean c(final String s) {
        return s.substring(1 + s.lastIndexOf("@"), s.length()).equals(a_9.z[79]);
    }
    
    public static boolean d(final String s) {
        return a_9.z[14].equals(s);
    }
    
    public static File e(final String s) {
        final File file = new File(App.M, a_9.z[60]);
        while (true) {
            if (file.exists()) {
                break Label_0051;
            }
            file.mkdirs();
            final File file2 = new File(file, a_9.z[58]);
            try {
                file2.createNewFile();
                final int index = s.indexOf("@");
                if (index > 0) {
                    try {
                        return new File(file, s.substring(0, index) + a_9.z[57]);
                    }
                    catch (IOException ex) {
                        throw ex;
                    }
                }
                return new File(file, s + a_9.z[59]);
            }
            catch (IOException ex2) {
                continue;
            }
            break;
        }
    }
    
    public static boolean f(final String s) {
        if (s != null) {
            try {
                if (s.endsWith(a_9.z[13])) {
                    return true;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        return false;
    }
    
    public static File g(final String s) {
        final File file = new File(App.aq.getFilesDir(), a_9.z[9]);
        try {
            if (!file.exists()) {
                file.mkdirs();
            }
            return new File(file, s + a_9.z[8]);
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public static boolean h(final String s) {
        try {
            if (f(s)) {
                return true;
            }
            final String s2 = s;
            final boolean b = d(s2);
            if (b) {
                return true;
            }
            return false;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final String s2 = s;
            final boolean b = d(s2);
            if (b) {
                return true;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return false;
    }
    
    private String u() {
        try {
            final Uri b = this.b(App.i);
            if (b != null) {
                final Cursor query = App.i.query(b, (String[])null, (String)null, (String[])null, (String)null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            return query.getString(query.getColumnIndex(a_9.z[15]));
                        }
                        return null;
                    }
                    finally {
                        query.close();
                    }
                }
            }
        }
        catch (SQLiteException ex) {
            Log.b((Throwable)ex);
        }
        return null;
    }
    
    public int A() {
        try {
            if (h(this.u)) {
                return 2130837597;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            if (!adc.b(this.u)) {
                return 2130837599;
            }
            final a_9 a_9 = this;
            final String s = a_9.u;
            final String[] array = com.whatsapp.a_9.z;
            final int n = 10;
            final String s2 = array[n];
            final boolean b = s.contains(s2);
            if (b) {
                return 2130837604;
            }
            return 2130837602;
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        try {
            final a_9 a_9 = this;
            final String s = a_9.u;
            final String[] array = com.whatsapp.a_9.z;
            final int n = 10;
            final String s2 = array[n];
            final boolean b = s.contains(s2);
            if (b) {
                return 2130837604;
            }
        }
        catch (IllegalArgumentException ex3) {
            throw ex3;
        }
        return 2130837602;
    }
    
    public Bitmap a(final int n) {
        Bitmap bitmap = null;
        Label_0036: {
            if (Build$VERSION.SDK_INT >= 21) {
                bitmap = b(this.A());
                if (!a_9.k) {
                    break Label_0036;
                }
            }
            bitmap = BitmapFactory.decodeResource(App.aq.getResources(), this.A());
        }
        if (n == 0) {
            return bitmap;
        }
        return Bitmap.createScaledBitmap(bitmap, n, n, true);
    }
    
    public Bitmap a(final int p0, final float p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_3       
        //     2: aconst_null    
        //     3: astore          4
        //     5: getstatic       com/whatsapp/a_9.k:Z
        //     8: istore          5
        //    10: iload_1        
        //    11: i2f            
        //    12: fstore          6
        //    14: invokestatic    com/whatsapp/vc.b:()Lcom/whatsapp/vc;
        //    17: getfield        com/whatsapp/vc.b:F
        //    20: fstore          24
        //    22: fload           6
        //    24: fload           24
        //    26: ldc_w           96.0
        //    29: fmul           
        //    30: fcmpl          
        //    31: iflt            366
        //    34: aload_0        
        //    35: getfield        com/whatsapp/a_9.h:Z
        //    38: ifeq            1210
        //    41: aload_0        
        //    42: iload_3        
        //    43: invokevirtual   com/whatsapp/a_9.a:(Z)Ljava/io/InputStream;
        //    46: astore          78
        //    48: aload           78
        //    50: astore          18
        //    52: aload_0        
        //    53: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    56: ifnull          193
        //    59: aload_0        
        //    60: invokevirtual   com/whatsapp/a_9.m:()Z
        //    63: istore          69
        //    65: iload           69
        //    67: ifeq            81
        //    70: aload_0        
        //    71: invokevirtual   com/whatsapp/a_9.o:()Z
        //    74: istore          77
        //    76: iload           77
        //    78: ifeq            114
        //    81: aload_0        
        //    82: invokevirtual   com/whatsapp/a_9.m:()Z
        //    85: istore          70
        //    87: iload           70
        //    89: ifne            193
        //    92: aload_0        
        //    93: invokevirtual   com/whatsapp/a_9.k:()Z
        //    96: istore          71
        //    98: iload           71
        //   100: ifne            193
        //   103: aload_0        
        //   104: getfield        com/whatsapp/a_9.b:Z
        //   107: istore          72
        //   109: iload           72
        //   111: ifeq            193
        //   114: iload_3        
        //   115: ifeq            158
        //   118: aload_0        
        //   119: getfield        com/whatsapp/a_9.v:I
        //   122: istore          75
        //   124: iload           75
        //   126: ifeq            141
        //   129: aload_0        
        //   130: iconst_1       
        //   131: invokevirtual   com/whatsapp/a_9.b:(Z)Z
        //   134: istore          76
        //   136: iload           76
        //   138: ifeq            193
        //   141: aload_0        
        //   142: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   145: aload_0        
        //   146: getfield        com/whatsapp/a_9.v:I
        //   149: iconst_1       
        //   150: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;II)V
        //   153: iload           5
        //   155: ifeq            193
        //   158: aload_0        
        //   159: getfield        com/whatsapp/a_9.q:I
        //   162: istore          73
        //   164: iload           73
        //   166: ifeq            181
        //   169: aload_0        
        //   170: iconst_0       
        //   171: invokevirtual   com/whatsapp/a_9.b:(Z)Z
        //   174: istore          74
        //   176: iload           74
        //   178: ifeq            193
        //   181: aload_0        
        //   182: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   185: aload_0        
        //   186: getfield        com/whatsapp/a_9.q:I
        //   189: iconst_2       
        //   190: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;II)V
        //   193: aload           18
        //   195: ifnull          978
        //   198: new             Landroid/graphics/BitmapFactory$Options;
        //   201: dup            
        //   202: invokespecial   android/graphics/BitmapFactory$Options.<init>:()V
        //   205: astore          40
        //   207: aload           40
        //   209: iconst_1       
        //   210: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //   213: aload           18
        //   215: aconst_null    
        //   216: aload           40
        //   218: invokestatic    android/graphics/BitmapFactory.decodeStream:(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   221: pop            
        //   222: aload           18
        //   224: invokevirtual   java/io/InputStream.close:()V
        //   227: aload_0        
        //   228: iload_3        
        //   229: invokevirtual   com/whatsapp/a_9.a:(Z)Ljava/io/InputStream;
        //   232: astore          46
        //   234: aload           46
        //   236: astore          8
        //   238: aload           8
        //   240: ifnonnull       516
        //   243: new             Ljava/lang/StringBuilder;
        //   246: dup            
        //   247: invokespecial   java/lang/StringBuilder.<init>:()V
        //   250: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   253: bipush          23
        //   255: aaload         
        //   256: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   259: aload_0        
        //   260: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   263: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   266: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   269: bipush          22
        //   271: aaload         
        //   272: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   275: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   278: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   281: aload           8
        //   283: ifnull          291
        //   286: aload           8
        //   288: invokevirtual   java/io/InputStream.close:()V
        //   291: iconst_0       
        //   292: ifeq            299
        //   295: aconst_null    
        //   296: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   299: aconst_null    
        //   300: areturn        
        //   301: astore          23
        //   303: aload           23
        //   305: athrow         
        //   306: astore          17
        //   308: aconst_null    
        //   309: astore          18
        //   311: aconst_null    
        //   312: astore          19
        //   314: new             Ljava/lang/StringBuilder;
        //   317: dup            
        //   318: invokespecial   java/lang/StringBuilder.<init>:()V
        //   321: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   324: bipush          17
        //   326: aaload         
        //   327: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   330: aload           17
        //   332: invokevirtual   android/database/sqlite/SQLiteException.toString:()Ljava/lang/String;
        //   335: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   338: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   341: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   344: aload           18
        //   346: ifnull          354
        //   349: aload           18
        //   351: invokevirtual   java/io/InputStream.close:()V
        //   354: aload           19
        //   356: ifnull          364
        //   359: aload           19
        //   361: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   364: aconst_null    
        //   365: areturn        
        //   366: iconst_0       
        //   367: istore_3       
        //   368: goto            34
        //   371: astore          25
        //   373: aload           25
        //   375: athrow         
        //   376: astore          26
        //   378: aload           26
        //   380: athrow         
        //   381: astore          27
        //   383: aload           27
        //   385: athrow         
        //   386: astore          28
        //   388: aload           28
        //   390: athrow         
        //   391: astore          29
        //   393: aload           29
        //   395: athrow         
        //   396: astore          30
        //   398: aload           30
        //   400: athrow         
        //   401: astore          31
        //   403: aload           31
        //   405: athrow         
        //   406: astore          32
        //   408: aload           32
        //   410: athrow         
        //   411: astore          33
        //   413: aload           33
        //   415: athrow         
        //   416: astore          34
        //   418: aload           34
        //   420: athrow         
        //   421: astore          35
        //   423: aload           35
        //   425: athrow         
        //   426: astore          36
        //   428: aload           36
        //   430: athrow         
        //   431: astore          42
        //   433: new             Ljava/lang/StringBuilder;
        //   436: dup            
        //   437: invokespecial   java/lang/StringBuilder.<init>:()V
        //   440: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   443: bipush          24
        //   445: aaload         
        //   446: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   449: aload_0        
        //   450: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   453: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   456: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   459: bipush          18
        //   461: aaload         
        //   462: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   465: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   468: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   471: aload           42
        //   473: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   476: aload           18
        //   478: ifnull          486
        //   481: aload           18
        //   483: invokevirtual   java/io/InputStream.close:()V
        //   486: iconst_0       
        //   487: ifeq            494
        //   490: aconst_null    
        //   491: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   494: aconst_null    
        //   495: areturn        
        //   496: astore          45
        //   498: aload           45
        //   500: athrow         
        //   501: astore          43
        //   503: aload           43
        //   505: athrow         
        //   506: astore          68
        //   508: aload           68
        //   510: athrow         
        //   511: astore          66
        //   513: aload           66
        //   515: athrow         
        //   516: aload           40
        //   518: aload           40
        //   520: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //   523: iload_1        
        //   524: idiv           
        //   525: aload           40
        //   527: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //   530: iload_1        
        //   531: idiv           
        //   532: invokestatic    java/lang/Math.max:(II)I
        //   535: putfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   538: aload           40
        //   540: iconst_1       
        //   541: putfield        android/graphics/BitmapFactory$Options.inDither:Z
        //   544: aload           40
        //   546: iconst_0       
        //   547: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //   550: aload           40
        //   552: iconst_0       
        //   553: putfield        android/graphics/BitmapFactory$Options.inScaled:Z
        //   556: aload           40
        //   558: getstatic       android/graphics/Bitmap$Config.ARGB_8888:Landroid/graphics/Bitmap$Config;
        //   561: putfield        android/graphics/BitmapFactory$Options.inPreferredConfig:Landroid/graphics/Bitmap$Config;
        //   564: aload           8
        //   566: aconst_null    
        //   567: aload           40
        //   569: invokestatic    android/graphics/BitmapFactory.decodeStream:(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   572: astore          47
        //   574: aload           47
        //   576: astore          13
        //   578: aload           13
        //   580: ifnonnull       653
        //   583: new             Ljava/lang/StringBuilder;
        //   586: dup            
        //   587: invokespecial   java/lang/StringBuilder.<init>:()V
        //   590: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   593: bipush          19
        //   595: aaload         
        //   596: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   599: aload_0        
        //   600: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   603: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   606: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   609: bipush          20
        //   611: aaload         
        //   612: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   615: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   618: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   621: aload           8
        //   623: ifnull          631
        //   626: aload           8
        //   628: invokevirtual   java/io/InputStream.close:()V
        //   631: aload           13
        //   633: ifnull          641
        //   636: aload           13
        //   638: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   641: aconst_null    
        //   642: areturn        
        //   643: astore          65
        //   645: aload           65
        //   647: athrow         
        //   648: astore          63
        //   650: aload           63
        //   652: athrow         
        //   653: iload_1        
        //   654: iload_1        
        //   655: getstatic       android/graphics/Bitmap$Config.ARGB_8888:Landroid/graphics/Bitmap$Config;
        //   658: invokestatic    android/graphics/Bitmap.createBitmap:(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
        //   661: astore          48
        //   663: new             Landroid/graphics/Canvas;
        //   666: dup            
        //   667: aload           48
        //   669: invokespecial   android/graphics/Canvas.<init>:(Landroid/graphics/Bitmap;)V
        //   672: astore          49
        //   674: new             Landroid/graphics/Paint;
        //   677: dup            
        //   678: invokespecial   android/graphics/Paint.<init>:()V
        //   681: astore          50
        //   683: new             Landroid/graphics/RectF;
        //   686: dup            
        //   687: fconst_0       
        //   688: fconst_0       
        //   689: iload_1        
        //   690: i2f            
        //   691: iload_1        
        //   692: i2f            
        //   693: invokespecial   android/graphics/RectF.<init>:(FFFF)V
        //   696: astore          51
        //   698: aload           50
        //   700: iconst_1       
        //   701: invokevirtual   android/graphics/Paint.setAntiAlias:(Z)V
        //   704: aload           50
        //   706: iconst_1       
        //   707: invokevirtual   android/graphics/Paint.setDither:(Z)V
        //   710: aload           50
        //   712: iconst_1       
        //   713: invokevirtual   android/graphics/Paint.setFilterBitmap:(Z)V
        //   716: aload           49
        //   718: iconst_0       
        //   719: iconst_0       
        //   720: iconst_0       
        //   721: iconst_0       
        //   722: invokevirtual   android/graphics/Canvas.drawARGB:(IIII)V
        //   725: aload           50
        //   727: iconst_m1      
        //   728: invokevirtual   android/graphics/Paint.setColor:(I)V
        //   731: fload_2        
        //   732: fconst_0       
        //   733: fcmpl          
        //   734: ifne            751
        //   737: aload           49
        //   739: aload           51
        //   741: aload           50
        //   743: invokevirtual   android/graphics/Canvas.drawRect:(Landroid/graphics/RectF;Landroid/graphics/Paint;)V
        //   746: iload           5
        //   748: ifeq            787
        //   751: fload_2        
        //   752: fconst_0       
        //   753: fcmpl          
        //   754: ifle            773
        //   757: aload           49
        //   759: aload           51
        //   761: fload_2        
        //   762: fload_2        
        //   763: aload           50
        //   765: invokevirtual   android/graphics/Canvas.drawRoundRect:(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V
        //   768: iload           5
        //   770: ifeq            787
        //   773: aload           49
        //   775: aload           51
        //   777: fconst_0       
        //   778: ldc_w           360.0
        //   781: iconst_1       
        //   782: aload           50
        //   784: invokevirtual   android/graphics/Canvas.drawArc:(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V
        //   787: aload           50
        //   789: new             Landroid/graphics/PorterDuffXfermode;
        //   792: dup            
        //   793: getstatic       android/graphics/PorterDuff$Mode.SRC_IN:Landroid/graphics/PorterDuff$Mode;
        //   796: invokespecial   android/graphics/PorterDuffXfermode.<init>:(Landroid/graphics/PorterDuff$Mode;)V
        //   799: invokevirtual   android/graphics/Paint.setXfermode:(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;
        //   802: pop            
        //   803: new             Landroid/graphics/RectF;
        //   806: dup            
        //   807: fconst_0       
        //   808: fconst_0       
        //   809: iload_1        
        //   810: i2f            
        //   811: iload_1        
        //   812: i2f            
        //   813: invokespecial   android/graphics/RectF.<init>:(FFFF)V
        //   816: astore          57
        //   818: aload           13
        //   820: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   823: aload           13
        //   825: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   828: isub           
        //   829: iconst_2       
        //   830: idiv           
        //   831: istore          58
        //   833: iload           58
        //   835: ifle            868
        //   838: new             Landroid/graphics/Rect;
        //   841: dup            
        //   842: iload           58
        //   844: iconst_0       
        //   845: aload           13
        //   847: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   850: iload           58
        //   852: isub           
        //   853: aload           13
        //   855: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   858: invokespecial   android/graphics/Rect.<init>:(IIII)V
        //   861: astore          59
        //   863: iload           5
        //   865: ifeq            894
        //   868: new             Landroid/graphics/Rect;
        //   871: dup            
        //   872: iconst_0       
        //   873: iload           58
        //   875: ineg           
        //   876: aload           13
        //   878: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   881: iload           58
        //   883: aload           13
        //   885: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   888: iadd           
        //   889: invokespecial   android/graphics/Rect.<init>:(IIII)V
        //   892: astore          59
        //   894: aload           49
        //   896: aload           13
        //   898: aload           59
        //   900: aload           57
        //   902: aload           50
        //   904: invokevirtual   android/graphics/Canvas.drawBitmap:(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V
        //   907: aload           13
        //   909: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   912: aload           8
        //   914: ifnull          922
        //   917: aload           8
        //   919: invokevirtual   java/io/InputStream.close:()V
        //   922: aload           13
        //   924: ifnull          932
        //   927: aload           13
        //   929: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   932: aload           48
        //   934: areturn        
        //   935: astore          52
        //   937: aload           52
        //   939: athrow         
        //   940: astore          53
        //   942: aload           53
        //   944: athrow         
        //   945: astore          54
        //   947: aload           54
        //   949: athrow         
        //   950: astore          55
        //   952: aload           55
        //   954: athrow         
        //   955: astore          17
        //   957: aload           8
        //   959: astore          18
        //   961: aload           13
        //   963: astore          19
        //   965: goto            314
        //   968: astore          62
        //   970: aload           62
        //   972: athrow         
        //   973: astore          60
        //   975: aload           60
        //   977: athrow         
        //   978: aload_0        
        //   979: iconst_0       
        //   980: putfield        com/whatsapp/a_9.h:Z
        //   983: aload           18
        //   985: ifnull          993
        //   988: aload           18
        //   990: invokevirtual   java/io/InputStream.close:()V
        //   993: iconst_0       
        //   994: ifeq            1001
        //   997: aconst_null    
        //   998: invokevirtual   android/graphics/Bitmap.recycle:()V
        //  1001: aconst_null    
        //  1002: areturn        
        //  1003: astore          39
        //  1005: aload           39
        //  1007: athrow         
        //  1008: astore          37
        //  1010: aload           37
        //  1012: athrow         
        //  1013: astore          22
        //  1015: aload           22
        //  1017: athrow         
        //  1018: astore          20
        //  1020: aload           20
        //  1022: athrow         
        //  1023: astore          12
        //  1025: aconst_null    
        //  1026: astore          8
        //  1028: aconst_null    
        //  1029: astore          13
        //  1031: new             Ljava/lang/StringBuilder;
        //  1034: dup            
        //  1035: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1038: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //  1041: bipush          21
        //  1043: aaload         
        //  1044: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1047: aload           12
        //  1049: invokevirtual   java/lang/OutOfMemoryError.toString:()Ljava/lang/String;
        //  1052: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1055: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1058: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1061: aload           8
        //  1063: ifnull          1071
        //  1066: aload           8
        //  1068: invokevirtual   java/io/InputStream.close:()V
        //  1071: aload           13
        //  1073: ifnull          1081
        //  1076: aload           13
        //  1078: invokevirtual   android/graphics/Bitmap.recycle:()V
        //  1081: aconst_null    
        //  1082: areturn        
        //  1083: astore          16
        //  1085: aload           16
        //  1087: athrow         
        //  1088: astore          14
        //  1090: aload           14
        //  1092: athrow         
        //  1093: astore          7
        //  1095: aconst_null    
        //  1096: astore          8
        //  1098: aload           8
        //  1100: ifnull          1108
        //  1103: aload           8
        //  1105: invokevirtual   java/io/InputStream.close:()V
        //  1108: aload           4
        //  1110: ifnull          1118
        //  1113: aload           4
        //  1115: invokevirtual   android/graphics/Bitmap.recycle:()V
        //  1118: aload           7
        //  1120: athrow         
        //  1121: astore          11
        //  1123: aload           11
        //  1125: athrow         
        //  1126: astore          9
        //  1128: aload           9
        //  1130: athrow         
        //  1131: astore          7
        //  1133: aload           18
        //  1135: astore          8
        //  1137: aconst_null    
        //  1138: astore          4
        //  1140: goto            1098
        //  1143: astore          7
        //  1145: aconst_null    
        //  1146: astore          4
        //  1148: goto            1098
        //  1151: astore          7
        //  1153: aload           13
        //  1155: astore          4
        //  1157: goto            1098
        //  1160: astore          7
        //  1162: aload           18
        //  1164: astore          8
        //  1166: aload           19
        //  1168: astore          4
        //  1170: goto            1098
        //  1173: astore          12
        //  1175: aload           18
        //  1177: astore          8
        //  1179: aconst_null    
        //  1180: astore          13
        //  1182: goto            1031
        //  1185: astore          12
        //  1187: aconst_null    
        //  1188: astore          13
        //  1190: goto            1031
        //  1193: astore          12
        //  1195: goto            1031
        //  1198: astore          17
        //  1200: aload           8
        //  1202: astore          18
        //  1204: aconst_null    
        //  1205: astore          19
        //  1207: goto            314
        //  1210: aconst_null    
        //  1211: astore          18
        //  1213: goto            52
        //  1216: astore          17
        //  1218: aconst_null    
        //  1219: astore          19
        //  1221: goto            314
        //  1224: astore          44
        //  1226: goto            494
        //  1229: astore          67
        //  1231: goto            299
        //  1234: astore          64
        //  1236: goto            641
        //  1239: astore          61
        //  1241: goto            932
        //  1244: astore          38
        //  1246: goto            1001
        //  1249: astore          21
        //  1251: goto            364
        //  1254: astore          15
        //  1256: goto            1081
        //  1259: astore          10
        //  1261: goto            1118
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  14     22     301    306    Ljava/io/IOException;
        //  14     22     306    314    Landroid/database/sqlite/SQLiteException;
        //  14     22     1023   1031   Ljava/lang/OutOfMemoryError;
        //  14     22     1093   1098   Any
        //  34     48     306    314    Landroid/database/sqlite/SQLiteException;
        //  34     48     1023   1031   Ljava/lang/OutOfMemoryError;
        //  34     48     1093   1098   Any
        //  52     65     371    376    Ljava/io/IOException;
        //  52     65     1216   1224   Landroid/database/sqlite/SQLiteException;
        //  52     65     1173   1185   Ljava/lang/OutOfMemoryError;
        //  52     65     1131   1143   Any
        //  70     76     376    381    Ljava/io/IOException;
        //  70     76     1216   1224   Landroid/database/sqlite/SQLiteException;
        //  70     76     1173   1185   Ljava/lang/OutOfMemoryError;
        //  70     76     1131   1143   Any
        //  81     87     381    386    Ljava/io/IOException;
        //  81     87     1216   1224   Landroid/database/sqlite/SQLiteException;
        //  81     87     1173   1185   Ljava/lang/OutOfMemoryError;
        //  81     87     1131   1143   Any
        //  92     98     386    391    Ljava/io/IOException;
        //  92     98     1216   1224   Landroid/database/sqlite/SQLiteException;
        //  92     98     1173   1185   Ljava/lang/OutOfMemoryError;
        //  92     98     1131   1143   Any
        //  103    109    391    401    Ljava/io/IOException;
        //  103    109    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  103    109    1173   1185   Ljava/lang/OutOfMemoryError;
        //  103    109    1131   1143   Any
        //  118    124    401    406    Ljava/io/IOException;
        //  118    124    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  118    124    1173   1185   Ljava/lang/OutOfMemoryError;
        //  118    124    1131   1143   Any
        //  129    136    406    411    Ljava/io/IOException;
        //  129    136    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  129    136    1173   1185   Ljava/lang/OutOfMemoryError;
        //  129    136    1131   1143   Any
        //  141    153    411    416    Ljava/io/IOException;
        //  141    153    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  141    153    1173   1185   Ljava/lang/OutOfMemoryError;
        //  141    153    1131   1143   Any
        //  158    164    416    421    Ljava/io/IOException;
        //  158    164    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  158    164    1173   1185   Ljava/lang/OutOfMemoryError;
        //  158    164    1131   1143   Any
        //  169    176    421    426    Ljava/io/IOException;
        //  169    176    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  169    176    1173   1185   Ljava/lang/OutOfMemoryError;
        //  169    176    1131   1143   Any
        //  181    193    426    431    Ljava/io/IOException;
        //  181    193    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  181    193    1173   1185   Ljava/lang/OutOfMemoryError;
        //  181    193    1131   1143   Any
        //  198    222    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  198    222    1173   1185   Ljava/lang/OutOfMemoryError;
        //  198    222    1131   1143   Any
        //  222    227    431    506    Ljava/io/IOException;
        //  222    227    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  222    227    1173   1185   Ljava/lang/OutOfMemoryError;
        //  222    227    1131   1143   Any
        //  227    234    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  227    234    1173   1185   Ljava/lang/OutOfMemoryError;
        //  227    234    1131   1143   Any
        //  243    281    1198   1210   Landroid/database/sqlite/SQLiteException;
        //  243    281    1185   1193   Ljava/lang/OutOfMemoryError;
        //  243    281    1143   1151   Any
        //  286    291    506    511    Ljava/io/IOException;
        //  295    299    511    516    Ljava/io/IOException;
        //  303    306    306    314    Landroid/database/sqlite/SQLiteException;
        //  303    306    1023   1031   Ljava/lang/OutOfMemoryError;
        //  303    306    1093   1098   Any
        //  314    344    1160   1173   Any
        //  349    354    1013   1018   Ljava/io/IOException;
        //  359    364    1018   1023   Ljava/io/IOException;
        //  373    376    376    381    Ljava/io/IOException;
        //  373    376    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  373    376    1173   1185   Ljava/lang/OutOfMemoryError;
        //  373    376    1131   1143   Any
        //  378    381    381    386    Ljava/io/IOException;
        //  378    381    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  378    381    1173   1185   Ljava/lang/OutOfMemoryError;
        //  378    381    1131   1143   Any
        //  383    386    386    391    Ljava/io/IOException;
        //  383    386    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  383    386    1173   1185   Ljava/lang/OutOfMemoryError;
        //  383    386    1131   1143   Any
        //  388    391    391    401    Ljava/io/IOException;
        //  388    391    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  388    391    1173   1185   Ljava/lang/OutOfMemoryError;
        //  388    391    1131   1143   Any
        //  393    396    396    401    Ljava/io/IOException;
        //  393    396    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  393    396    1173   1185   Ljava/lang/OutOfMemoryError;
        //  393    396    1131   1143   Any
        //  398    401    401    406    Ljava/io/IOException;
        //  398    401    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  398    401    1173   1185   Ljava/lang/OutOfMemoryError;
        //  398    401    1131   1143   Any
        //  403    406    406    411    Ljava/io/IOException;
        //  403    406    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  403    406    1173   1185   Ljava/lang/OutOfMemoryError;
        //  403    406    1131   1143   Any
        //  408    411    411    416    Ljava/io/IOException;
        //  408    411    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  408    411    1173   1185   Ljava/lang/OutOfMemoryError;
        //  408    411    1131   1143   Any
        //  413    416    416    421    Ljava/io/IOException;
        //  413    416    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  413    416    1173   1185   Ljava/lang/OutOfMemoryError;
        //  413    416    1131   1143   Any
        //  418    421    421    426    Ljava/io/IOException;
        //  418    421    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  418    421    1173   1185   Ljava/lang/OutOfMemoryError;
        //  418    421    1131   1143   Any
        //  423    426    426    431    Ljava/io/IOException;
        //  423    426    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  423    426    1173   1185   Ljava/lang/OutOfMemoryError;
        //  423    426    1131   1143   Any
        //  428    431    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  428    431    1173   1185   Ljava/lang/OutOfMemoryError;
        //  428    431    1131   1143   Any
        //  433    476    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  433    476    1173   1185   Ljava/lang/OutOfMemoryError;
        //  433    476    1131   1143   Any
        //  481    486    496    501    Ljava/io/IOException;
        //  490    494    501    506    Ljava/io/IOException;
        //  498    501    1224   1229   Ljava/io/IOException;
        //  503    506    1224   1229   Ljava/io/IOException;
        //  508    511    1229   1234   Ljava/io/IOException;
        //  513    516    1229   1234   Ljava/io/IOException;
        //  516    574    1198   1210   Landroid/database/sqlite/SQLiteException;
        //  516    574    1185   1193   Ljava/lang/OutOfMemoryError;
        //  516    574    1143   1151   Any
        //  583    621    955    968    Landroid/database/sqlite/SQLiteException;
        //  583    621    1193   1198   Ljava/lang/OutOfMemoryError;
        //  583    621    1151   1160   Any
        //  626    631    643    648    Ljava/io/IOException;
        //  636    641    648    653    Ljava/io/IOException;
        //  645    648    1234   1239   Ljava/io/IOException;
        //  650    653    1234   1239   Ljava/io/IOException;
        //  653    698    955    968    Landroid/database/sqlite/SQLiteException;
        //  653    698    1193   1198   Ljava/lang/OutOfMemoryError;
        //  653    698    1151   1160   Any
        //  698    731    935    945    Ljava/io/IOException;
        //  698    731    955    968    Landroid/database/sqlite/SQLiteException;
        //  698    731    1193   1198   Ljava/lang/OutOfMemoryError;
        //  698    731    1151   1160   Any
        //  737    746    935    945    Ljava/io/IOException;
        //  737    746    955    968    Landroid/database/sqlite/SQLiteException;
        //  737    746    1193   1198   Ljava/lang/OutOfMemoryError;
        //  737    746    1151   1160   Any
        //  757    768    945    950    Ljava/io/IOException;
        //  757    768    955    968    Landroid/database/sqlite/SQLiteException;
        //  757    768    1193   1198   Ljava/lang/OutOfMemoryError;
        //  757    768    1151   1160   Any
        //  773    787    950    955    Ljava/io/IOException;
        //  773    787    955    968    Landroid/database/sqlite/SQLiteException;
        //  773    787    1193   1198   Ljava/lang/OutOfMemoryError;
        //  773    787    1151   1160   Any
        //  787    833    955    968    Landroid/database/sqlite/SQLiteException;
        //  787    833    1193   1198   Ljava/lang/OutOfMemoryError;
        //  787    833    1151   1160   Any
        //  838    863    955    968    Landroid/database/sqlite/SQLiteException;
        //  838    863    1193   1198   Ljava/lang/OutOfMemoryError;
        //  838    863    1151   1160   Any
        //  868    894    955    968    Landroid/database/sqlite/SQLiteException;
        //  868    894    1193   1198   Ljava/lang/OutOfMemoryError;
        //  868    894    1151   1160   Any
        //  894    912    955    968    Landroid/database/sqlite/SQLiteException;
        //  894    912    1193   1198   Ljava/lang/OutOfMemoryError;
        //  894    912    1151   1160   Any
        //  917    922    968    973    Ljava/io/IOException;
        //  927    932    973    978    Ljava/io/IOException;
        //  937    940    940    945    Ljava/io/IOException;
        //  937    940    955    968    Landroid/database/sqlite/SQLiteException;
        //  937    940    1193   1198   Ljava/lang/OutOfMemoryError;
        //  937    940    1151   1160   Any
        //  942    945    945    950    Ljava/io/IOException;
        //  942    945    955    968    Landroid/database/sqlite/SQLiteException;
        //  942    945    1193   1198   Ljava/lang/OutOfMemoryError;
        //  942    945    1151   1160   Any
        //  947    950    950    955    Ljava/io/IOException;
        //  947    950    955    968    Landroid/database/sqlite/SQLiteException;
        //  947    950    1193   1198   Ljava/lang/OutOfMemoryError;
        //  947    950    1151   1160   Any
        //  952    955    955    968    Landroid/database/sqlite/SQLiteException;
        //  952    955    1193   1198   Ljava/lang/OutOfMemoryError;
        //  952    955    1151   1160   Any
        //  970    973    1239   1244   Ljava/io/IOException;
        //  975    978    1239   1244   Ljava/io/IOException;
        //  978    983    1216   1224   Landroid/database/sqlite/SQLiteException;
        //  978    983    1173   1185   Ljava/lang/OutOfMemoryError;
        //  978    983    1131   1143   Any
        //  988    993    1003   1008   Ljava/io/IOException;
        //  997    1001   1008   1013   Ljava/io/IOException;
        //  1005   1008   1244   1249   Ljava/io/IOException;
        //  1010   1013   1244   1249   Ljava/io/IOException;
        //  1015   1018   1249   1254   Ljava/io/IOException;
        //  1020   1023   1249   1254   Ljava/io/IOException;
        //  1031   1061   1151   1160   Any
        //  1066   1071   1083   1088   Ljava/io/IOException;
        //  1076   1081   1088   1093   Ljava/io/IOException;
        //  1085   1088   1254   1259   Ljava/io/IOException;
        //  1090   1093   1254   1259   Ljava/io/IOException;
        //  1103   1108   1121   1126   Ljava/io/IOException;
        //  1113   1118   1126   1131   Ljava/io/IOException;
        //  1123   1126   1259   1264   Ljava/io/IOException;
        //  1128   1131   1259   1264   Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 622, Size: 622
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
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
    
    public Bitmap a(final int n, final float n2, final boolean b) {
        Label_0029: {
            if (!b) {
                break Label_0029;
            }
            final Bitmap a = (Bitmap)App.Z.get(this.c(n, n2));
            if (a == null) {
                break Label_0029;
            }
            return a;
        }
        final Bitmap a = this.a(n, n2);
        if (!b || a == null) {
            return a;
        }
        try {
            App.Z.put(this.c(n, n2), a);
            return a;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public Uri a(final ContentResolver contentResolver) {
        if (this.e() == null) {
            return null;
        }
        return ContactsContract$RawContacts.getContactLookupUri(contentResolver, this.e());
    }
    
    public b7 a(final Class clazz) {
        if (this.n != null) {
            final b7 b7 = this.n.get(clazz);
            if (b7 != null) {
                return b7;
            }
        }
        if (clazz == ad6.class) {
            try {
                if (this.x != null) {
                    final a_9 a_9 = this;
                    return a_9.x;
                }
                return ad6.getDefault();
            }
            catch (NoSuchMethodException ex) {
                try {
                    throw ex;
                }
                catch (NoSuchMethodException ex2) {
                    throw ex2;
                }
            }
            try {
                final a_9 a_9 = this;
                return a_9.x;
            }
            catch (NoSuchMethodException ex6) {}
            return ad6.getDefault();
        }
        try {
            return (b7)clazz.getMethod(a_9.z[51], (Class<?>[])new Class[0]).invoke(null, new Object[0]);
        }
        catch (NoSuchMethodException ex3) {
            throw new RuntimeException(a_9.z[54] + clazz, ex3);
        }
        catch (InvocationTargetException ex4) {
            throw new RuntimeException(a_9.z[53] + clazz + a_9.z[55], ex4);
        }
        catch (IllegalAccessException ex5) {
            throw new RuntimeException(a_9.z[56] + clazz + a_9.z[52], ex5);
        }
    }
    
    public InputStream a(final ContentResolver p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: invokevirtual   com/whatsapp/a_9.b:(Landroid/content/ContentResolver;)Landroid/net/Uri;
        //     5: astore_3       
        //     6: aconst_null    
        //     7: astore          4
        //     9: aload_3        
        //    10: ifnull          119
        //    13: iload_2        
        //    14: ifeq            134
        //    17: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    20: istore          6
        //    22: iload           6
        //    24: bipush          14
        //    26: if_icmplt       134
        //    29: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    32: bipush          6
        //    34: aaload         
        //    35: astore          8
        //    37: iconst_3       
        //    38: anewarray       Ljava/lang/Class;
        //    41: astore          9
        //    43: aload           9
        //    45: iconst_0       
        //    46: ldc_w           Landroid/content/ContentResolver;.class
        //    49: aastore        
        //    50: aload           9
        //    52: iconst_1       
        //    53: ldc_w           Landroid/net/Uri;.class
        //    56: aastore        
        //    57: aload           9
        //    59: iconst_2       
        //    60: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //    63: aastore        
        //    64: ldc_w           Landroid/provider/ContactsContract$Contacts;.class
        //    67: aload           8
        //    69: aload           9
        //    71: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    74: astore          10
        //    76: aload           10
        //    78: iconst_1       
        //    79: invokevirtual   java/lang/reflect/Method.setAccessible:(Z)V
        //    82: iconst_3       
        //    83: anewarray       Ljava/lang/Object;
        //    86: astore          11
        //    88: aload           11
        //    90: iconst_0       
        //    91: aload_1        
        //    92: aastore        
        //    93: aload           11
        //    95: iconst_1       
        //    96: aload_3        
        //    97: aastore        
        //    98: aload           11
        //   100: iconst_2       
        //   101: iconst_1       
        //   102: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   105: aastore        
        //   106: aload           10
        //   108: aconst_null    
        //   109: aload           11
        //   111: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   114: checkcast       Ljava/io/InputStream;
        //   117: astore          4
        //   119: aload           4
        //   121: areturn        
        //   122: astore          5
        //   124: aload           5
        //   126: athrow         
        //   127: astore          7
        //   129: aload           7
        //   131: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   134: aload_1        
        //   135: aload_3        
        //   136: invokestatic    android/provider/ContactsContract$Contacts.openContactPhotoInputStream:(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/io/InputStream;
        //   139: areturn        
        //   140: astore          7
        //   142: goto            129
        //   145: astore          7
        //   147: goto            129
        //   150: astore          7
        //   152: goto            129
        //   155: astore          7
        //   157: goto            129
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  17     22     122    127    Ljava/lang/SecurityException;
        //  29     119    155    160    Ljava/lang/SecurityException;
        //  29     119    145    150    Ljava/lang/NoSuchMethodException;
        //  29     119    127    129    Ljava/lang/IllegalAccessException;
        //  29     119    150    155    Ljava/lang/reflect/InvocationTargetException;
        //  29     119    140    145    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0119:
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
    
    public InputStream a(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/a_9.h:Z
        //     4: istore_3       
        //     5: aconst_null    
        //     6: astore          4
        //     8: iload_3        
        //     9: ifeq            236
        //    12: iload_1        
        //    13: ifeq            136
        //    16: aload_0        
        //    17: invokevirtual   com/whatsapp/a_9.b:()Ljava/io/File;
        //    20: astore          5
        //    22: aload           5
        //    24: invokevirtual   java/io/File.exists:()Z
        //    27: ifne            213
        //    30: aload_0        
        //    31: invokevirtual   com/whatsapp/a_9.y:()Ljava/io/File;
        //    34: astore          5
        //    36: aload_0        
        //    37: getfield        com/whatsapp/a_9.v:I
        //    40: ifle            213
        //    43: invokestatic    android/os/Environment.getExternalStorageState:()Ljava/lang/String;
        //    46: astore          9
        //    48: aload           9
        //    50: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    53: bipush          72
        //    55: aaload         
        //    56: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    59: ifeq            130
        //    62: aload           9
        //    64: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    67: bipush          77
        //    69: aaload         
        //    70: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    73: istore          12
        //    75: iload           12
        //    77: ifne            130
        //    80: new             Ljava/lang/StringBuilder;
        //    83: dup            
        //    84: invokespecial   java/lang/StringBuilder.<init>:()V
        //    87: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    90: bipush          75
        //    92: aaload         
        //    93: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    96: aload_0        
        //    97: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   100: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   103: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   106: bipush          73
        //   108: aaload         
        //   109: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   112: aload_0        
        //   113: getfield        com/whatsapp/a_9.v:I
        //   116: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   119: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   122: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   125: aload_0        
        //   126: iconst_0       
        //   127: putfield        com/whatsapp/a_9.v:I
        //   130: getstatic       com/whatsapp/a_9.k:Z
        //   133: ifeq            213
        //   136: aload_0        
        //   137: invokevirtual   com/whatsapp/a_9.y:()Ljava/io/File;
        //   140: astore          5
        //   142: aload           5
        //   144: invokevirtual   java/io/File.exists:()Z
        //   147: ifne            213
        //   150: aload_0        
        //   151: invokevirtual   com/whatsapp/a_9.b:()Ljava/io/File;
        //   154: astore          5
        //   156: aload_0        
        //   157: getfield        com/whatsapp/a_9.q:I
        //   160: ifle            213
        //   163: new             Ljava/lang/StringBuilder;
        //   166: dup            
        //   167: invokespecial   java/lang/StringBuilder.<init>:()V
        //   170: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   173: bipush          76
        //   175: aaload         
        //   176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   179: aload_0        
        //   180: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   183: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   186: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   189: bipush          74
        //   191: aaload         
        //   192: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   195: aload_0        
        //   196: getfield        com/whatsapp/a_9.q:I
        //   199: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   202: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   205: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   208: aload_0        
        //   209: iconst_0       
        //   210: putfield        com/whatsapp/a_9.q:I
        //   213: aload           5
        //   215: invokevirtual   java/io/File.exists:()Z
        //   218: ifeq            265
        //   221: new             Ljava/io/FileInputStream;
        //   224: dup            
        //   225: aload           5
        //   227: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   230: astore          6
        //   232: aload           6
        //   234: astore          4
        //   236: aload           4
        //   238: areturn        
        //   239: astore_2       
        //   240: aload_2        
        //   241: athrow         
        //   242: astore          10
        //   244: aload           10
        //   246: athrow         
        //   247: astore          11
        //   249: aload           11
        //   251: athrow         
        //   252: astore          8
        //   254: aload           8
        //   256: athrow         
        //   257: astore          7
        //   259: aload_0        
        //   260: iload_1        
        //   261: invokevirtual   com/whatsapp/a_9.c:(Z)Ljava/io/InputStream;
        //   264: areturn        
        //   265: aload_0        
        //   266: iload_1        
        //   267: invokevirtual   com/whatsapp/a_9.c:(Z)Ljava/io/InputStream;
        //   270: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  0      5      239    242    Ljava/io/FileNotFoundException;
        //  48     75     242    247    Ljava/io/FileNotFoundException;
        //  80     130    247    252    Ljava/io/FileNotFoundException;
        //  156    213    252    257    Ljava/io/FileNotFoundException;
        //  221    232    257    265    Ljava/io/FileNotFoundException;
        //  244    247    247    252    Ljava/io/FileNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 128, Size: 128
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
    
    public CharSequence a(final Resources p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/a_9.w:Ljava/lang/Integer;
        //     4: astore          5
        //     6: aload           5
        //     8: ifnull          67
        //    11: aload_0        
        //    12: getfield        com/whatsapp/a_9.w:Ljava/lang/Integer;
        //    15: invokevirtual   java/lang/Integer.intValue:()I
        //    18: istore          6
        //    20: iload           6
        //    22: ifne            52
        //    25: aload_0        
        //    26: getfield        com/whatsapp/a_9.m:Ljava/lang/String;
        //    29: ifnull          52
        //    32: aload_0        
        //    33: getfield        com/whatsapp/a_9.m:Ljava/lang/String;
        //    36: astore          7
        //    38: aload           7
        //    40: areturn        
        //    41: astore_2       
        //    42: aload_2        
        //    43: athrow         
        //    44: astore_3       
        //    45: aload_3        
        //    46: athrow         
        //    47: astore          4
        //    49: aload           4
        //    51: athrow         
        //    52: aload_1        
        //    53: aload_0        
        //    54: getfield        com/whatsapp/a_9.w:Ljava/lang/Integer;
        //    57: invokevirtual   java/lang/Integer.intValue:()I
        //    60: invokestatic    android/provider/ContactsContract$CommonDataKinds$Phone.getTypeLabelResource:(I)I
        //    63: invokevirtual   android/content/res/Resources.getString:(I)Ljava/lang/String;
        //    66: areturn        
        //    67: aconst_null    
        //    68: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      6      41     44     Ljava/lang/IllegalArgumentException;
        //  11     20     44     47     Ljava/lang/IllegalArgumentException;
        //  25     38     47     52     Ljava/lang/IllegalArgumentException;
        //  42     44     44     47     Ljava/lang/IllegalArgumentException;
        //  45     47     47     52     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 37, Size: 37
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
    
    public String a() {
        while (true) {
            while (true) {
                try {
                    if (this.k()) {
                        return null;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                if (this.m()) {
                    final qo d = App.s.d(this.u);
                    if (d != null) {
                        final a_9 e = App.S.e(d.b);
                        try {
                            if (d.a == 0) {
                                return App.aq.getString(2131230968, new Object[] { e.l() });
                            }
                        }
                        catch (IllegalArgumentException ex2) {
                            throw ex2;
                        }
                        try {
                            if (d.a == 1) {
                                return App.aq.getString(2131230969, new Object[] { e.l() });
                            }
                        }
                        catch (IllegalArgumentException ex3) {
                            throw ex3;
                        }
                    }
                    if (!a_9.k) {
                        continue;
                    }
                }
                final int a = App.s.a(this.u, null);
                if (a == 0) {
                    try {
                        return App.aq.getString(2131230964);
                    }
                    catch (IllegalArgumentException ex4) {
                        throw ex4;
                    }
                }
                if (a == 1) {
                    break;
                }
                continue;
            }
        }
        try {
            return App.aq.getString(2131230965);
        }
        catch (IllegalArgumentException ex5) {
            throw ex5;
        }
    }
    
    public String a(final Context context) {
        try {
            if (a_9.z[0].equals(this.u)) {
                return context.getString(2131230850);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            if (!TextUtils.isEmpty((CharSequence)this.t)) {
                return this.t;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        try {
            if (this.m()) {
                return context.getString(2131231228);
            }
        }
        catch (IllegalArgumentException ex3) {
            throw ex3;
        }
        if (this.k()) {
            final int j = adc.a(this.u).j();
            return String.format(App.C.a(2131296261, j), j);
        }
        return "\u202a" + this.f() + "\u202c";
    }
    
    public String a(final SharedPreferences sharedPreferences) {
        while (true) {
            if (sharedPreferences.getBoolean(a_9.z[61], true)) {
                try {
                    if (this.e == null) {
                        return null;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                return this.u();
            }
            continue;
        }
    }
    
    public void a(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //     4: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //     7: invokevirtual   com/whatsapp/wc.e:()Lcom/whatsapp/a_d;
        //    10: getfield        com/whatsapp/a_d.u:Ljava/lang/String;
        //    13: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    16: istore          5
        //    18: iload           5
        //    20: ifeq            40
        //    23: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    26: invokevirtual   com/whatsapp/wc.e:()Lcom/whatsapp/a_d;
        //    29: iload_1        
        //    30: iload_2        
        //    31: invokevirtual   com/whatsapp/a_d.a:(II)V
        //    34: getstatic       com/whatsapp/a_9.k:Z
        //    37: ifeq            73
        //    40: aload_0        
        //    41: iload_1        
        //    42: putfield        com/whatsapp/a_9.v:I
        //    45: aload_0        
        //    46: iload_2        
        //    47: putfield        com/whatsapp/a_9.q:I
        //    50: aload_0        
        //    51: invokestatic    java/lang/System.currentTimeMillis:()J
        //    54: putfield        com/whatsapp/a_9.a:J
        //    57: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    60: aload_0        
        //    61: invokevirtual   com/whatsapp/wc.a:(Lcom/whatsapp/a_9;)V
        //    64: return         
        //    65: astore_3       
        //    66: aload_3        
        //    67: athrow         
        //    68: astore          4
        //    70: aload           4
        //    72: athrow         
        //    73: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      18     65     68     Ljava/lang/IllegalArgumentException;
        //  23     40     68     73     Ljava/lang/IllegalArgumentException;
        //  40     64     68     73     Ljava/lang/IllegalArgumentException;
        //  66     68     68     73     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0040:
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
    
    public void a(@NonNull final b7 b7) {
        this.a(b7.getClass(), b7);
    }
    
    public void a(final Class p0, final b7 p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/a_9.n:Ljava/util/Map;
        //     4: ifnonnull       29
        //     7: aload_0        
        //     8: monitorenter   
        //     9: aload_0        
        //    10: getfield        com/whatsapp/a_9.n:Ljava/util/Map;
        //    13: ifnonnull       27
        //    16: aload_0        
        //    17: new             Ljava/util/HashMap;
        //    20: dup            
        //    21: invokespecial   java/util/HashMap.<init>:()V
        //    24: putfield        com/whatsapp/a_9.n:Ljava/util/Map;
        //    27: aload_0        
        //    28: monitorexit    
        //    29: aload_0        
        //    30: getfield        com/whatsapp/a_9.n:Ljava/util/Map;
        //    33: aload_1        
        //    34: aload_2        
        //    35: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    40: pop            
        //    41: aload_1        
        //    42: ldc_w           Lcom/whatsapp/ad6;.class
        //    45: if_acmpne       56
        //    48: aload_0        
        //    49: aload_2        
        //    50: checkcast       Lcom/whatsapp/ad6;
        //    53: putfield        com/whatsapp/a_9.x:Lcom/whatsapp/ad6;
        //    56: return         
        //    57: astore          5
        //    59: aload_0        
        //    60: monitorexit    
        //    61: aload           5
        //    63: athrow         
        //    64: astore_3       
        //    65: aload_3        
        //    66: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  9      27     57     64     Any
        //  27     29     57     64     Any
        //  29     41     64     67     Ljava/lang/IllegalArgumentException;
        //  48     56     64     67     Ljava/lang/IllegalArgumentException;
        //  59     61     57     64     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0029:
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
    
    public void a(final byte[] p0, final byte[] p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ifnull          12
        //     4: aload_1        
        //     5: aload_0        
        //     6: invokevirtual   com/whatsapp/a_9.b:()Ljava/io/File;
        //     9: invokestatic    com/whatsapp/util/br.a:([BLjava/io/File;)V
        //    12: aload_2        
        //    13: ifnull          24
        //    16: aload_2        
        //    17: aload_0        
        //    18: invokevirtual   com/whatsapp/a_9.y:()Ljava/io/File;
        //    21: invokestatic    com/whatsapp/util/br.a:([BLjava/io/File;)V
        //    24: return         
        //    25: astore          5
        //    27: aload           5
        //    29: athrow         
        //    30: astore          4
        //    32: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    35: iconst_3       
        //    36: aaload         
        //    37: aload           4
        //    39: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    42: return         
        //    43: astore_3       
        //    44: aload_3        
        //    45: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      12     25     30     Ljava/io/IOException;
        //  16     24     43     46     Ljava/io/IOException;
        //  27     30     30     43     Ljava/io/IOException;
        //  44     46     30     43     Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0024:
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
    
    public boolean a(final o p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/a_9.k:Z
        //     3: istore_2       
        //     4: new             Lcom/whatsapp/xg;
        //     7: dup            
        //     8: aload_1        
        //     9: invokevirtual   com/whatsapp/contact/o.g:()J
        //    12: aload_1        
        //    13: invokevirtual   com/whatsapp/contact/o.e:()Ljava/lang/String;
        //    16: invokespecial   com/whatsapp/xg.<init>:(JLjava/lang/String;)V
        //    19: astore_3       
        //    20: aload_0        
        //    21: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //    24: ifnull          45
        //    27: aload_0        
        //    28: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //    31: aload_3        
        //    32: invokevirtual   com/whatsapp/xg.equals:(Ljava/lang/Object;)Z
        //    35: istore          16
        //    37: iconst_0       
        //    38: istore          5
        //    40: iload           16
        //    42: ifne            53
        //    45: aload_0        
        //    46: aload_3        
        //    47: putfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //    50: iconst_1       
        //    51: istore          5
        //    53: aload_1        
        //    54: invokevirtual   com/whatsapp/contact/o.c:()Ljava/lang/String;
        //    57: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    60: ifne            96
        //    63: aload_0        
        //    64: getfield        com/whatsapp/a_9.t:Ljava/lang/String;
        //    67: aload_1        
        //    68: invokevirtual   com/whatsapp/contact/o.c:()Ljava/lang/String;
        //    71: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //    74: istore          15
        //    76: iload           15
        //    78: ifne            96
        //    81: aload_0        
        //    82: aload_1        
        //    83: invokevirtual   com/whatsapp/contact/o.c:()Ljava/lang/String;
        //    86: putfield        com/whatsapp/a_9.t:Ljava/lang/String;
        //    89: aload_0        
        //    90: invokevirtual   com/whatsapp/a_9.g:()V
        //    93: iconst_1       
        //    94: istore          5
        //    96: aload_0        
        //    97: getfield        com/whatsapp/a_9.w:Ljava/lang/Integer;
        //   100: invokevirtual   java/lang/Integer.intValue:()I
        //   103: aload_1        
        //   104: invokevirtual   com/whatsapp/contact/o.f:()I
        //   107: if_icmpeq       159
        //   110: aload_0        
        //   111: aload_1        
        //   112: invokevirtual   com/whatsapp/contact/o.f:()I
        //   115: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   118: putfield        com/whatsapp/a_9.w:Ljava/lang/Integer;
        //   121: aload_0        
        //   122: getfield        com/whatsapp/a_9.w:Ljava/lang/Integer;
        //   125: invokevirtual   java/lang/Integer.intValue:()I
        //   128: istore          14
        //   130: iload           14
        //   132: ifeq            144
        //   135: aload_0        
        //   136: aconst_null    
        //   137: putfield        com/whatsapp/a_9.m:Ljava/lang/String;
        //   140: iload_2        
        //   141: ifeq            195
        //   144: aload_0        
        //   145: aload_1        
        //   146: invokevirtual   com/whatsapp/contact/o.d:()Ljava/lang/String;
        //   149: putfield        com/whatsapp/a_9.m:Ljava/lang/String;
        //   152: iload_2        
        //   153: ifeq            195
        //   156: iconst_1       
        //   157: istore          5
        //   159: aload_0        
        //   160: getfield        com/whatsapp/a_9.w:Ljava/lang/Integer;
        //   163: invokevirtual   java/lang/Integer.intValue:()I
        //   166: ifne            198
        //   169: aload_0        
        //   170: getfield        com/whatsapp/a_9.m:Ljava/lang/String;
        //   173: aload_1        
        //   174: invokevirtual   com/whatsapp/contact/o.d:()Ljava/lang/String;
        //   177: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //   180: istore          10
        //   182: iload           10
        //   184: ifne            198
        //   187: aload_0        
        //   188: aload_1        
        //   189: invokevirtual   com/whatsapp/contact/o.d:()Ljava/lang/String;
        //   192: putfield        com/whatsapp/a_9.m:Ljava/lang/String;
        //   195: iconst_1       
        //   196: istore          5
        //   198: aload_1        
        //   199: invokevirtual   com/whatsapp/contact/o.a:()Ljava/lang/String;
        //   202: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   205: ifne            271
        //   208: aload_0        
        //   209: getfield        com/whatsapp/a_9.r:Ljava/lang/String;
        //   212: aload_1        
        //   213: invokevirtual   com/whatsapp/contact/o.a:()Ljava/lang/String;
        //   216: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //   219: istore          9
        //   221: iload           9
        //   223: ifne            271
        //   226: aload_0        
        //   227: aload_1        
        //   228: invokevirtual   com/whatsapp/contact/o.a:()Ljava/lang/String;
        //   231: putfield        com/whatsapp/a_9.r:Ljava/lang/String;
        //   234: iconst_1       
        //   235: ireturn        
        //   236: astore          4
        //   238: aload           4
        //   240: athrow         
        //   241: astore          6
        //   243: aload           6
        //   245: athrow         
        //   246: astore          11
        //   248: aload           11
        //   250: athrow         
        //   251: astore          12
        //   253: aload           12
        //   255: athrow         
        //   256: astore          13
        //   258: aload           13
        //   260: athrow         
        //   261: astore          7
        //   263: aload           7
        //   265: athrow         
        //   266: astore          8
        //   268: aload           8
        //   270: athrow         
        //   271: iload           5
        //   273: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  20     37     236    241    Ljava/lang/IllegalArgumentException;
        //  53     76     241    246    Ljava/lang/IllegalArgumentException;
        //  110    130    246    251    Ljava/lang/IllegalArgumentException;
        //  135    140    251    256    Ljava/lang/IllegalArgumentException;
        //  144    152    256    261    Ljava/lang/IllegalArgumentException;
        //  159    182    261    266    Ljava/lang/IllegalArgumentException;
        //  198    221    266    271    Ljava/lang/IllegalArgumentException;
        //  248    251    251    256    Ljava/lang/IllegalArgumentException;
        //  253    256    256    261    Ljava/lang/IllegalArgumentException;
        //  258    261    261    266    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 136, Size: 136
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
    
    public boolean a(final ArrayList p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/a_9.k:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: ifnull          19
        //     8: aload_1        
        //     9: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //    12: istore          4
        //    14: iload           4
        //    16: ifeq            24
        //    19: iconst_1       
        //    20: ireturn        
        //    21: astore_3       
        //    22: aload_3        
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        com/whatsapp/a_9.t:Ljava/lang/String;
        //    28: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    31: ifne            47
        //    34: aload_0        
        //    35: getfield        com/whatsapp/a_9.t:Ljava/lang/String;
        //    38: invokestatic    com/whatsapp/util/cq.b:(Ljava/lang/CharSequence;)Ljava/lang/String;
        //    41: astore          26
        //    43: iload_2        
        //    44: ifeq            397
        //    47: aload_0        
        //    48: invokevirtual   com/whatsapp/a_9.k:()Z
        //    51: istore          6
        //    53: iload           6
        //    55: ifeq            71
        //    58: aload_0        
        //    59: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    62: invokestatic    com/whatsapp/adc.h:(Ljava/lang/String;)Ljava/lang/String;
        //    65: astore          26
        //    67: iload_2        
        //    68: ifeq            397
        //    71: aload_0        
        //    72: invokevirtual   com/whatsapp/a_9.f:()Ljava/lang/String;
        //    75: astore          7
        //    77: aload           7
        //    79: ifnull          215
        //    82: aload_1        
        //    83: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    86: astore          15
        //    88: iconst_1       
        //    89: istore          16
        //    91: aload           15
        //    93: invokeinterface java/util/Iterator.hasNext:()Z
        //    98: ifeq            390
        //   101: aload           15
        //   103: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   108: checkcast       Ljava/lang/String;
        //   111: astore          18
        //   113: invokestatic    com/whatsapp/util/by.a:()Ljava/text/BreakIterator;
        //   116: astore          19
        //   118: aload           19
        //   120: aload           7
        //   122: invokevirtual   java/text/BreakIterator.setText:(Ljava/lang/String;)V
        //   125: aload           19
        //   127: invokevirtual   java/text/BreakIterator.first:()I
        //   130: istore          20
        //   132: aload           19
        //   134: invokevirtual   java/text/BreakIterator.next:()I
        //   137: istore          21
        //   139: iload           20
        //   141: istore          22
        //   143: iload           21
        //   145: istore          23
        //   147: iconst_0       
        //   148: istore          24
        //   150: iload           23
        //   152: iconst_m1      
        //   153: if_icmpeq       194
        //   156: aload           7
        //   158: iload           22
        //   160: iload           23
        //   162: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   165: invokestatic    com/whatsapp/vy.h:(Ljava/lang/String;)Ljava/lang/String;
        //   168: aload           18
        //   170: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   173: ifeq            183
        //   176: iload_2        
        //   177: ifeq            384
        //   180: iconst_1       
        //   181: istore          24
        //   183: aload           19
        //   185: invokevirtual   java/text/BreakIterator.next:()I
        //   188: istore          25
        //   190: iload_2        
        //   191: ifeq            373
        //   194: iload           24
        //   196: ifne            366
        //   199: iload_2        
        //   200: ifeq            360
        //   203: iconst_0       
        //   204: istore          17
        //   206: iload_2        
        //   207: ifeq            353
        //   210: iload           17
        //   212: ifne            19
        //   215: aload_0        
        //   216: invokevirtual   com/whatsapp/a_9.k:()Z
        //   219: ifne            314
        //   222: aload_0        
        //   223: invokevirtual   com/whatsapp/a_9.m:()Z
        //   226: istore          9
        //   228: iload           9
        //   230: ifne            314
        //   233: aload_0        
        //   234: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   237: bipush          64
        //   239: invokevirtual   java/lang/String.indexOf:(I)I
        //   242: istore          10
        //   244: iload           10
        //   246: ifle            314
        //   249: aload_0        
        //   250: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   253: iconst_0       
        //   254: iload           10
        //   256: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   259: astore          11
        //   261: aload_1        
        //   262: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   265: astore          12
        //   267: iconst_1       
        //   268: istore          13
        //   270: aload           12
        //   272: invokeinterface java/util/Iterator.hasNext:()Z
        //   277: ifeq            346
        //   280: aload           11
        //   282: aload           12
        //   284: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   289: checkcast       Ljava/lang/String;
        //   292: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   295: ifne            339
        //   298: iload_2        
        //   299: ifeq            333
        //   302: iconst_0       
        //   303: istore          14
        //   305: iload_2        
        //   306: ifeq            326
        //   309: iload           14
        //   311: ifne            19
        //   314: iconst_0       
        //   315: ireturn        
        //   316: astore          5
        //   318: aload           5
        //   320: athrow         
        //   321: astore          8
        //   323: aload           8
        //   325: athrow         
        //   326: iload           14
        //   328: istore          13
        //   330: goto            270
        //   333: iconst_0       
        //   334: istore          14
        //   336: goto            309
        //   339: iload           13
        //   341: istore          14
        //   343: goto            305
        //   346: iload           13
        //   348: istore          14
        //   350: goto            309
        //   353: iload           17
        //   355: istore          16
        //   357: goto            91
        //   360: iconst_0       
        //   361: istore          17
        //   363: goto            210
        //   366: iload           16
        //   368: istore          17
        //   370: goto            206
        //   373: iload           23
        //   375: istore          22
        //   377: iload           25
        //   379: istore          23
        //   381: goto            150
        //   384: iconst_1       
        //   385: istore          24
        //   387: goto            194
        //   390: iload           16
        //   392: istore          17
        //   394: goto            210
        //   397: aload           26
        //   399: astore          7
        //   401: goto            77
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  8      14     21     24     Ljava/lang/IllegalArgumentException;
        //  47     53     316    321    Ljava/lang/IllegalArgumentException;
        //  215    228    321    326    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0215:
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
    
    public Bitmap b(final int n, final float n2) {
        return (Bitmap)App.Z.get(this.c(n, n2));
    }
    
    public Uri b(final ContentResolver contentResolver) {
        final Uri a = this.a(contentResolver);
        Uri lookupContact = null;
        if (a == null) {
            return lookupContact;
        }
        try {
            lookupContact = ContactsContract$Contacts.lookupContact(contentResolver, a);
            return lookupContact;
        }
        catch (SecurityException ex) {
            throw ex;
        }
        catch (IllegalArgumentException ex2) {
            Log.b(ex2);
            return null;
        }
        catch (IllegalStateException ex3) {
            Log.b(ex3);
            return null;
        }
    }
    
    public File b() {
        try {
            if (this.u.equals(App.S.e().u)) {
                return App.S.e().b();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return e(this.u);
    }
    
    public String b(final SharedPreferences sharedPreferences) {
        while (true) {
            if (sharedPreferences.getBoolean(a_9.z[11], true)) {
                try {
                    if (this.e == null) {
                        return null;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                return this.u();
            }
            continue;
        }
    }
    
    public boolean b(final boolean b) {
        try {
            if (this.u.equals(App.S.e().u)) {
                return App.S.e().b(b);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            if (604800000L + this.a < System.currentTimeMillis()) {
                return true;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return false;
    }
    
    @TargetApi(17)
    public File c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/File;
        //     3: dup            
        //     4: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //     7: invokevirtual   com/whatsapp/App.getFilesDir:()Ljava/io/File;
        //    10: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    13: iconst_2       
        //    14: aaload         
        //    15: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    18: astore_1       
        //    19: aload_1        
        //    20: invokevirtual   java/io/File.exists:()Z
        //    23: ifne            31
        //    26: aload_1        
        //    27: invokevirtual   java/io/File.mkdirs:()Z
        //    30: pop            
        //    31: aload_1        
        //    32: iconst_1       
        //    33: iconst_0       
        //    34: invokevirtual   java/io/File.setExecutable:(ZZ)Z
        //    37: pop            
        //    38: new             Ljava/io/File;
        //    41: dup            
        //    42: aload_1        
        //    43: new             Ljava/lang/StringBuilder;
        //    46: dup            
        //    47: invokespecial   java/lang/StringBuilder.<init>:()V
        //    50: aload_0        
        //    51: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    54: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    57: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    60: iconst_1       
        //    61: aaload         
        //    62: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    65: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    68: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    71: astore          4
        //    73: aload           4
        //    75: invokevirtual   java/io/File.exists:()Z
        //    78: istore          6
        //    80: iload           6
        //    82: ifeq            100
        //    85: aload           4
        //    87: astore          9
        //    89: aload           9
        //    91: areturn        
        //    92: astore_2       
        //    93: aload_2        
        //    94: athrow         
        //    95: astore          5
        //    97: aload           5
        //    99: athrow         
        //   100: new             Ljava/io/FileOutputStream;
        //   103: dup            
        //   104: aload           4
        //   106: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   109: astore          7
        //   111: aload_0        
        //   112: sipush          512
        //   115: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   118: invokevirtual   com/whatsapp/App.getResources:()Landroid/content/res/Resources;
        //   121: ldc_w           2131361814
        //   124: invokevirtual   android/content/res/Resources.getDimension:(I)F
        //   127: iconst_0       
        //   128: invokevirtual   com/whatsapp/a_9.a:(IFZ)Landroid/graphics/Bitmap;
        //   131: astore          8
        //   133: aconst_null    
        //   134: astore          9
        //   136: aload           7
        //   138: ifnull          89
        //   141: aconst_null    
        //   142: astore          9
        //   144: aload           8
        //   146: ifnull          89
        //   149: aload           8
        //   151: getstatic       android/graphics/Bitmap$CompressFormat.JPEG:Landroid/graphics/Bitmap$CompressFormat;
        //   154: bipush          100
        //   156: aload           7
        //   158: invokevirtual   android/graphics/Bitmap.compress:(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
        //   161: pop            
        //   162: aload           4
        //   164: areturn        
        //   165: astore          11
        //   167: aconst_null    
        //   168: astore          7
        //   170: goto            111
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  19     31     92     95     Ljava/io/IOException;
        //  73     80     95     100    Ljava/io/IOException;
        //  100    111    165    173    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0089:
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
    
    protected InputStream c(final boolean b) {
        final boolean k = a_9.k;
        final ContentResolver contentResolver = App.aq.getContentResolver();
        InputStream inputStream = this.a(contentResolver, b);
        if (inputStream == null) {
            final Iterator<Long> iterator = App.S.n(this).iterator();
            while (iterator.hasNext()) {
                inputStream = new a_9(this.e.a, iterator.next(), this.t, 0, null).a(contentResolver, b);
                if ((inputStream != null && !k) || k) {
                    break;
                }
            }
        }
        return inputStream;
    }
    
    public String c(final int n, final float n2) {
        return this.d() + "_" + Integer.toString(n) + "_" + Float.toString(n2);
    }
    
    public String d() {
        try {
            if (this.e != null) {
                return this.e.toString();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return this.u;
    }
    
    public Uri e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //     4: astore          4
        //     6: aload           4
        //     8: ifnull          45
        //    11: aload_0        
        //    12: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //    15: getfield        com/whatsapp/xg.b:J
        //    18: lstore          5
        //    20: lload           5
        //    22: ldc2_w          -2
        //    25: lcmp           
        //    26: ifeq            45
        //    29: aload_0        
        //    30: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //    33: getfield        com/whatsapp/xg.b:J
        //    36: lstore          7
        //    38: lload           7
        //    40: lconst_0       
        //    41: lcmp           
        //    42: ifge            56
        //    45: aconst_null    
        //    46: areturn        
        //    47: astore_1       
        //    48: aload_1        
        //    49: athrow         
        //    50: astore_2       
        //    51: aload_2        
        //    52: athrow         
        //    53: astore_3       
        //    54: aload_3        
        //    55: athrow         
        //    56: getstatic       android/provider/ContactsContract$RawContacts.CONTENT_URI:Landroid/net/Uri;
        //    59: aload_0        
        //    60: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //    63: getfield        com/whatsapp/xg.b:J
        //    66: invokestatic    android/content/ContentUris.withAppendedId:(Landroid/net/Uri;J)Landroid/net/Uri;
        //    69: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      6      47     50     Ljava/lang/IllegalArgumentException;
        //  11     20     50     53     Ljava/lang/IllegalArgumentException;
        //  29     38     53     56     Ljava/lang/IllegalArgumentException;
        //  48     50     50     53     Ljava/lang/IllegalArgumentException;
        //  51     53     53     56     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 38, Size: 38
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
    public boolean equals(final Object o) {
        if (this != o) {
            if (o != null) {
                try {
                    if (o.getClass() != this.getClass()) {
                        return false;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                final a_9 a_9 = (a_9)o;
                try {
                    if (!TextUtils.equals((CharSequence)this.u, (CharSequence)a_9.u)) {
                        return false;
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
                try {
                    if (this.e != null) {
                        return this.e.equals(a_9.e);
                    }
                    final a_9 a_10 = a_9;
                    final xg xg = a_10.e;
                    if (xg != null) {
                        return false;
                    }
                    return true;
                }
                catch (IllegalArgumentException ex3) {
                    throw ex3;
                }
                try {
                    final a_9 a_10 = a_9;
                    final xg xg = a_10.e;
                    if (xg != null) {
                        return false;
                    }
                    return true;
                }
                catch (IllegalArgumentException ex4) {
                    throw ex4;
                }
                return this.e.equals(a_9.e);
            }
            return false;
        }
        return true;
    }
    
    public String f() {
        return b(this.u);
    }
    
    public void g() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/a_9.k:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //     8: ifnull          341
        //    11: iconst_4       
        //    12: anewarray       Ljava/lang/String;
        //    15: astore          4
        //    17: aload           4
        //    19: iconst_0       
        //    20: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    23: bipush          68
        //    25: aaload         
        //    26: aastore        
        //    27: aload           4
        //    29: iconst_1       
        //    30: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    33: bipush          62
        //    35: aaload         
        //    36: aastore        
        //    37: aload           4
        //    39: iconst_2       
        //    40: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    43: bipush          66
        //    45: aaload         
        //    46: aastore        
        //    47: aload           4
        //    49: iconst_3       
        //    50: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    53: bipush          64
        //    55: aaload         
        //    56: aastore        
        //    57: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //    60: astore          5
        //    62: getstatic       android/provider/ContactsContract$Data.CONTENT_URI:Landroid/net/Uri;
        //    65: astore          6
        //    67: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    70: bipush          63
        //    72: aaload         
        //    73: astore          7
        //    75: iconst_2       
        //    76: anewarray       Ljava/lang/String;
        //    79: astore          8
        //    81: aload           8
        //    83: iconst_0       
        //    84: aload_0        
        //    85: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //    88: getfield        com/whatsapp/xg.b:J
        //    91: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //    94: aastore        
        //    95: aload           8
        //    97: iconst_1       
        //    98: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   101: bipush          65
        //   103: aaload         
        //   104: aastore        
        //   105: aload           5
        //   107: aload           6
        //   109: aload           4
        //   111: aload           7
        //   113: aload           8
        //   115: aconst_null    
        //   116: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   119: astore          9
        //   121: aload           9
        //   123: ifnull          341
        //   126: aload           9
        //   128: invokeinterface android/database/Cursor.moveToNext:()Z
        //   133: ifeq            334
        //   136: aload_0        
        //   137: aload           9
        //   139: aload           9
        //   141: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   144: bipush          71
        //   146: aaload         
        //   147: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   152: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   157: putfield        com/whatsapp/a_9.c:Ljava/lang/String;
        //   160: aload_0        
        //   161: aload           9
        //   163: aload           9
        //   165: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   168: bipush          70
        //   170: aaload         
        //   171: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   176: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   181: putfield        com/whatsapp/a_9.j:Ljava/lang/String;
        //   184: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   187: istore          11
        //   189: iload           11
        //   191: bipush          11
        //   193: if_icmpge       334
        //   196: aload           9
        //   198: aload           9
        //   200: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   203: bipush          67
        //   205: aaload         
        //   206: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   211: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   216: astore          12
        //   218: aload           9
        //   220: aload           9
        //   222: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   225: bipush          69
        //   227: aaload         
        //   228: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   233: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   238: astore          13
        //   240: aload           13
        //   242: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   245: istore          20
        //   247: iload           20
        //   249: ifne            298
        //   252: aload           12
        //   254: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   257: istore          22
        //   259: iload           22
        //   261: ifne            298
        //   264: aload_0        
        //   265: new             Ljava/lang/StringBuilder;
        //   268: dup            
        //   269: invokespecial   java/lang/StringBuilder.<init>:()V
        //   272: aload           13
        //   274: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   277: ldc_w           " "
        //   280: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   283: aload           12
        //   285: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   288: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   291: putfield        com/whatsapp/a_9.r:Ljava/lang/String;
        //   294: iload_1        
        //   295: ifeq            334
        //   298: aload           13
        //   300: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   303: istore          21
        //   305: iload           21
        //   307: ifne            320
        //   310: aload_0        
        //   311: aload           13
        //   313: putfield        com/whatsapp/a_9.r:Ljava/lang/String;
        //   316: iload_1        
        //   317: ifeq            334
        //   320: aload           12
        //   322: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   325: ifne            334
        //   328: aload_0        
        //   329: aload           12
        //   331: putfield        com/whatsapp/a_9.r:Ljava/lang/String;
        //   334: aload           9
        //   336: invokeinterface android/database/Cursor.close:()V
        //   341: aload_0        
        //   342: getfield        com/whatsapp/a_9.c:Ljava/lang/String;
        //   345: ifnonnull       355
        //   348: aload_0        
        //   349: ldc_w           ""
        //   352: putfield        com/whatsapp/a_9.c:Ljava/lang/String;
        //   355: aload_0        
        //   356: getfield        com/whatsapp/a_9.j:Ljava/lang/String;
        //   359: ifnonnull       369
        //   362: aload_0        
        //   363: ldc_w           ""
        //   366: putfield        com/whatsapp/a_9.j:Ljava/lang/String;
        //   369: return         
        //   370: astore          10
        //   372: aload           10
        //   374: athrow         
        //   375: astore          14
        //   377: aload           14
        //   379: athrow         
        //   380: astore          15
        //   382: aload           15
        //   384: athrow         
        //   385: astore          16
        //   387: aload           16
        //   389: athrow         
        //   390: astore          17
        //   392: aload           17
        //   394: athrow         
        //   395: astore          18
        //   397: aload           18
        //   399: athrow         
        //   400: astore          19
        //   402: aload           19
        //   404: athrow         
        //   405: astore_2       
        //   406: aload_2        
        //   407: athrow         
        //   408: astore_3       
        //   409: aload_3        
        //   410: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  126    189    370    375    Ljava/lang/IllegalArgumentException;
        //  240    247    375    380    Ljava/lang/IllegalArgumentException;
        //  252    259    380    385    Ljava/lang/IllegalArgumentException;
        //  264    294    385    390    Ljava/lang/IllegalArgumentException;
        //  298    305    390    395    Ljava/lang/IllegalArgumentException;
        //  310    316    395    400    Ljava/lang/IllegalArgumentException;
        //  320    334    400    405    Ljava/lang/IllegalArgumentException;
        //  341    355    405    408    Ljava/lang/IllegalArgumentException;
        //  355    369    408    411    Ljava/lang/IllegalArgumentException;
        //  377    380    380    385    Ljava/lang/IllegalArgumentException;
        //  382    385    385    390    Ljava/lang/IllegalArgumentException;
        //  387    390    390    395    Ljava/lang/IllegalArgumentException;
        //  392    395    395    400    Ljava/lang/IllegalArgumentException;
        //  397    400    400    405    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 190, Size: 190
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
    
    public Uri h() {
        return ContentUris.withAppendedId(ContactProvider.c, this.p);
    }
    
    @Override
    public int hashCode() {
        try {
            if (this.e != null) {
                return this.e.hashCode();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return this.u.hashCode();
    }
    
    public String i() {
        if (adc.b(this.u)) {
            return this.u.substring(0, this.u.indexOf("-")) + a_9.z[16];
        }
        return null;
    }
    
    @Deprecated
    public String j() {
        Label_0070: {
            try {
                if (!adc.b(this.u)) {
                    break Label_0070;
                }
                final a_9 a_9 = this;
                final String s = a_9.i;
                if (s != null) {
                    final a_9 a_10 = this;
                    return a_10.i;
                }
                return this.u.substring(0, this.u.indexOf("-")) + com.whatsapp.a_9.z[4];
            }
            catch (IllegalArgumentException ex) {
                try {
                    throw ex;
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
            try {
                final a_9 a_9 = this;
                final String s = a_9.i;
                if (s != null) {
                    final a_9 a_10 = this;
                    return a_10.i;
                }
            }
            catch (IllegalArgumentException ex4) {}
            return this.u.substring(0, this.u.indexOf("-")) + a_9.z[4];
            try {
                if (this.k()) {
                    return App.au() + a_9.z[5];
                }
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
        }
        return null;
    }
    
    public boolean k() {
        return f(this.u);
    }
    
    public String l() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //     4: astore          4
        //     6: aload           4
        //     8: ifnull          50
        //    11: aload_0        
        //    12: getfield        com/whatsapp/a_9.c:Ljava/lang/String;
        //    15: astore          5
        //    17: aload           5
        //    19: ifnull          50
        //    22: aload_0        
        //    23: getfield        com/whatsapp/a_9.c:Ljava/lang/String;
        //    26: invokevirtual   java/lang/String.length:()I
        //    29: ifeq            50
        //    32: aload_0        
        //    33: getfield        com/whatsapp/a_9.c:Ljava/lang/String;
        //    36: astore          6
        //    38: aload           6
        //    40: areturn        
        //    41: astore_1       
        //    42: aload_1        
        //    43: athrow         
        //    44: astore_2       
        //    45: aload_2        
        //    46: athrow         
        //    47: astore_3       
        //    48: aload_3        
        //    49: athrow         
        //    50: aload_0        
        //    51: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    54: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //    57: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      6      41     44     Ljava/lang/IllegalArgumentException;
        //  11     17     44     47     Ljava/lang/IllegalArgumentException;
        //  22     38     47     50     Ljava/lang/IllegalArgumentException;
        //  42     44     44     47     Ljava/lang/IllegalArgumentException;
        //  45     47     47     50     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 32, Size: 32
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
    
    public boolean m() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //     4: ifnonnull       240
        //     7: new             Ljava/lang/StringBuilder;
        //    10: dup            
        //    11: invokespecial   java/lang/StringBuilder.<init>:()V
        //    14: astore_1       
        //    15: aload_1        
        //    16: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    19: bipush          32
        //    21: aaload         
        //    22: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    25: aload_0        
        //    26: getfield        com/whatsapp/a_9.p:J
        //    29: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    32: pop            
        //    33: aload_1        
        //    34: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    37: bipush          33
        //    39: aaload         
        //    40: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    43: astore          4
        //    45: aload_0        
        //    46: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    49: ifnonnull       216
        //    52: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    55: bipush          31
        //    57: aaload         
        //    58: astore          5
        //    60: aload           4
        //    62: aload           5
        //    64: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    67: pop            
        //    68: aload_1        
        //    69: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    72: bipush          30
        //    74: aaload         
        //    75: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    78: pop            
        //    79: aload_0        
        //    80: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //    83: astore          10
        //    85: aload           10
        //    87: ifnonnull       107
        //    90: aload_1        
        //    91: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    94: bipush          28
        //    96: aaload         
        //    97: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   100: pop            
        //   101: getstatic       com/whatsapp/a_9.k:Z
        //   104: ifeq            135
        //   107: aload_1        
        //   108: aload_0        
        //   109: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //   112: getfield        com/whatsapp/xg.b:J
        //   115: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   118: ldc_w           "-"
        //   121: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   124: aload_0        
        //   125: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //   128: getfield        com/whatsapp/xg.a:Ljava/lang/String;
        //   131: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   134: pop            
        //   135: aload_1        
        //   136: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   139: bipush          34
        //   141: aaload         
        //   142: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   145: aload_0        
        //   146: getfield        com/whatsapp/a_9.w:Ljava/lang/Integer;
        //   149: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   152: pop            
        //   153: aload_1        
        //   154: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   157: bipush          29
        //   159: aaload         
        //   160: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   163: aload_0        
        //   164: getfield        com/whatsapp/a_9.b:Z
        //   167: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   170: pop            
        //   171: aload_0        
        //   172: getfield        com/whatsapp/a_9.p:J
        //   175: ldc2_w          -1
        //   178: lcmp           
        //   179: ifeq            211
        //   182: new             Ljava/lang/StringBuilder;
        //   185: dup            
        //   186: invokespecial   java/lang/StringBuilder.<init>:()V
        //   189: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   192: bipush          35
        //   194: aaload         
        //   195: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   198: aload_1        
        //   199: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   202: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   205: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   208: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   211: iconst_0       
        //   212: ireturn        
        //   213: astore_2       
        //   214: aload_2        
        //   215: athrow         
        //   216: aload_0        
        //   217: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   220: astore          5
        //   222: goto            60
        //   225: astore          6
        //   227: aload           6
        //   229: athrow         
        //   230: astore          7
        //   232: aload           7
        //   234: athrow         
        //   235: astore          12
        //   237: aload           12
        //   239: athrow         
        //   240: aload_0        
        //   241: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   244: invokestatic    com/whatsapp/adc.b:(Ljava/lang/String;)Z
        //   247: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  15     60     213    216    Ljava/lang/IllegalArgumentException;
        //  60     85     225    230    Ljava/lang/IllegalArgumentException;
        //  90     107    230    235    Ljava/lang/IllegalArgumentException;
        //  107    135    230    235    Ljava/lang/IllegalArgumentException;
        //  135    211    235    240    Ljava/lang/IllegalArgumentException;
        //  227    230    230    235    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 121, Size: 121
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
    
    public String n() {
        final String a = this.a();
        if (a != null) {
            return a;
        }
        final long e = App.s.e(this.u);
        if (e == 0L) {
            return "";
        }
        if (e == 1L) {
            try {
                return App.aq.getString(2131230962);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        return App.aq.getString(2131230966) + " " + b6.d((Context)App.aq, App.b(e));
    }
    
    public boolean o() {
        return this.u.substring(1 + this.u.lastIndexOf("@"), this.u.length()).equals(a_9.z[7]);
    }
    
    public String p() {
        if (this.a() == null) {
            final long e = App.s.e(this.u);
            try {
                if (1L != App.s.e(this.u)) {
                    return b6.d((Context)App.aq, App.b(e));
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        return null;
    }
    
    public String q() {
        String a = this.a((Context)App.aq);
        if (a == null) {
            a = null;
        }
        else if (!App.ak()) {
            return a_9.z[12] + a + "\u202c";
        }
        return a;
    }
    
    public boolean r() {
        try {
            if (h(this.u)) {
                return false;
            }
            final a_9 a_9 = this;
            final String s = a_9.t;
            final boolean b = TextUtils.isEmpty((CharSequence)s);
            if (b) {
                return true;
            }
            return false;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final a_9 a_9 = this;
            final String s = a_9.t;
            final boolean b = TextUtils.isEmpty((CharSequence)s);
            if (b) {
                return true;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public boolean s() {
        try {
            if (this.b(App.aq.getResources().getDimensionPixelSize(2131361952), App.aq.getResources().getDimension(2131361814)) != null) {
                return true;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return false;
    }
    
    public String t() {
        try {
            if (this.x == null) {
                return ad6.getDefault().getText();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return this.x.getText();
    }
    
    @Override
    public String toString() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/a_9.k:Z
        //     3: istore_1       
        //     4: new             Ljava/lang/StringBuilder;
        //     7: dup            
        //     8: invokespecial   java/lang/StringBuilder.<init>:()V
        //    11: astore_2       
        //    12: aload_2        
        //    13: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    16: bipush          36
        //    18: aaload         
        //    19: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    22: aload_0        
        //    23: getfield        com/whatsapp/a_9.p:J
        //    26: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    29: pop            
        //    30: aload_2        
        //    31: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    34: bipush          37
        //    36: aaload         
        //    37: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    40: astore          5
        //    42: aload_0        
        //    43: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    46: ifnonnull       253
        //    49: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    52: bipush          45
        //    54: aaload         
        //    55: astore          6
        //    57: aload           5
        //    59: aload           6
        //    61: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    64: pop            
        //    65: aload_2        
        //    66: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    69: bipush          40
        //    71: aaload         
        //    72: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    75: pop            
        //    76: aload_0        
        //    77: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //    80: astore          11
        //    82: aload           11
        //    84: ifnonnull       102
        //    87: aload_2        
        //    88: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    91: bipush          38
        //    93: aaload         
        //    94: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    97: pop            
        //    98: iload_1        
        //    99: ifeq            130
        //   102: aload_2        
        //   103: aload_0        
        //   104: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //   107: getfield        com/whatsapp/xg.b:J
        //   110: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   113: ldc_w           "-"
        //   116: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   119: aload_0        
        //   120: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //   123: getfield        com/whatsapp/xg.a:Ljava/lang/String;
        //   126: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   129: pop            
        //   130: aload_2        
        //   131: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   134: bipush          39
        //   136: aaload         
        //   137: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   140: aload_0        
        //   141: getfield        com/whatsapp/a_9.w:Ljava/lang/Integer;
        //   144: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   147: pop            
        //   148: aload_2        
        //   149: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   152: bipush          42
        //   154: aaload         
        //   155: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   158: aload_0        
        //   159: getfield        com/whatsapp/a_9.b:Z
        //   162: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   165: pop            
        //   166: aload_0        
        //   167: invokevirtual   com/whatsapp/a_9.m:()Z
        //   170: istore          18
        //   172: iload           18
        //   174: ifeq            220
        //   177: aload_2        
        //   178: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   181: bipush          41
        //   183: aaload         
        //   184: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   187: aload_0        
        //   188: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   191: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   194: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   197: pop            
        //   198: aload_2        
        //   199: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   202: bipush          43
        //   204: aaload         
        //   205: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   208: aload_0        
        //   209: getfield        com/whatsapp/a_9.d:Ljava/lang/String;
        //   212: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   215: pop            
        //   216: iload_1        
        //   217: ifeq            245
        //   220: getstatic       com/whatsapp/App.aV:I
        //   223: iconst_1       
        //   224: if_icmplt       245
        //   227: aload_2        
        //   228: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   231: bipush          44
        //   233: aaload         
        //   234: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   237: aload_0        
        //   238: getfield        com/whatsapp/a_9.t:Ljava/lang/String;
        //   241: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   244: pop            
        //   245: aload_2        
        //   246: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   249: areturn        
        //   250: astore_3       
        //   251: aload_3        
        //   252: athrow         
        //   253: aload_0        
        //   254: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   257: astore          6
        //   259: goto            57
        //   262: astore          7
        //   264: aload           7
        //   266: athrow         
        //   267: astore          8
        //   269: aload           8
        //   271: athrow         
        //   272: astore          13
        //   274: aload           13
        //   276: athrow         
        //   277: astore          14
        //   279: aload           14
        //   281: athrow         
        //   282: astore          15
        //   284: aload           15
        //   286: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  12     57     250    253    Ljava/lang/IllegalArgumentException;
        //  57     82     262    267    Ljava/lang/IllegalArgumentException;
        //  87     98     267    272    Ljava/lang/IllegalArgumentException;
        //  102    130    267    272    Ljava/lang/IllegalArgumentException;
        //  130    172    272    277    Ljava/lang/IllegalArgumentException;
        //  177    216    277    282    Ljava/lang/IllegalArgumentException;
        //  220    245    282    287    Ljava/lang/IllegalArgumentException;
        //  264    267    267    272    Ljava/lang/IllegalArgumentException;
        //  274    277    277    282    Ljava/lang/IllegalArgumentException;
        //  279    282    282    287    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 144, Size: 144
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
    
    public long v() {
        try {
            if (this.e == null) {
                return 0L;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return this.e.b;
    }
    
    public void w() {
        final boolean k = a_9.k;
        final Iterator<String> iterator = App.Z.snapshot().keySet().iterator();
        while (true) {
            Label_0063: {
                if (!iterator.hasNext()) {
                    break Label_0063;
                }
                final String s = iterator.next();
                try {
                    if (s.startsWith(this.d())) {
                        App.Z.remove(s);
                    }
                    if (k) {
                        this.h = true;
                        return;
                    }
                    continue;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
        }
    }
    
    public Bitmap x() {
        return b(this.A());
    }
    
    public File y() {
        try {
            if (this.u.equals(App.S.e().u)) {
                return App.S.e().b();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return g(this.u);
    }
    
    public void z() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/a_9.k:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: invokevirtual   com/whatsapp/a_9.b:()Ljava/io/File;
        //     8: astore_2       
        //     9: aload_2        
        //    10: invokevirtual   java/io/File.exists:()Z
        //    13: istore          5
        //    15: iload           5
        //    17: ifeq            29
        //    20: aload_2        
        //    21: invokevirtual   java/io/File.delete:()Z
        //    24: pop            
        //    25: iload_1        
        //    26: ifeq            67
        //    29: new             Ljava/lang/StringBuilder;
        //    32: dup            
        //    33: invokespecial   java/lang/StringBuilder.<init>:()V
        //    36: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    39: bipush          48
        //    41: aaload         
        //    42: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    45: aload_2        
        //    46: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    49: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    52: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //    55: bipush          49
        //    57: aaload         
        //    58: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    61: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    64: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    67: aload_0        
        //    68: invokevirtual   com/whatsapp/a_9.y:()Ljava/io/File;
        //    71: astore          6
        //    73: aload           6
        //    75: invokevirtual   java/io/File.exists:()Z
        //    78: istore          9
        //    80: iload           9
        //    82: ifeq            95
        //    85: aload           6
        //    87: invokevirtual   java/io/File.delete:()Z
        //    90: pop            
        //    91: iload_1        
        //    92: ifeq            134
        //    95: new             Ljava/lang/StringBuilder;
        //    98: dup            
        //    99: invokespecial   java/lang/StringBuilder.<init>:()V
        //   102: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   105: bipush          47
        //   107: aaload         
        //   108: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   111: aload           6
        //   113: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   116: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   119: getstatic       com/whatsapp/a_9.z:[Ljava/lang/String;
        //   122: bipush          46
        //   124: aaload         
        //   125: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   128: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   131: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   134: return         
        //   135: astore_3       
        //   136: aload_3        
        //   137: athrow         
        //   138: astore          4
        //   140: aload           4
        //   142: athrow         
        //   143: astore          7
        //   145: aload           7
        //   147: athrow         
        //   148: astore          8
        //   150: aload           8
        //   152: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  9      15     135    138    Ljava/lang/IllegalArgumentException;
        //  20     25     138    143    Ljava/lang/IllegalArgumentException;
        //  29     67     138    143    Ljava/lang/IllegalArgumentException;
        //  73     80     143    148    Ljava/lang/IllegalArgumentException;
        //  85     91     148    153    Ljava/lang/IllegalArgumentException;
        //  95     134    148    153    Ljava/lang/IllegalArgumentException;
        //  136    138    138    143    Ljava/lang/IllegalArgumentException;
        //  145    148    148    153    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 73, Size: 73
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
}
