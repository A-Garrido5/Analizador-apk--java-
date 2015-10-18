// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Environment;
import android.text.TextUtils;
import javax.crypto.KeyGenerator;
import java.io.UnsupportedEncodingException;
import android.content.ContextWrapper;
import android.accounts.Account;
import android.accounts.AccountManager;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import android.content.SharedPreferences$Editor;
import java.io.OutputStream;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKey;
import android.content.pm.Signature;
import android.backport.util.Base64;
import java.security.NoSuchAlgorithmException;
import com.whatsapp.util.ac;
import android.content.Context;
import java.io.Closeable;
import com.whatsapp.util.b8;
import java.security.MessageDigest;
import java.util.zip.ZipFile;
import android.app.Application;
import java.util.Arrays;
import java.io.InputStream;
import android.os.Debug;
import java.util.Enumeration;
import java.io.IOException;
import com.whatsapp.util.Log;
import dalvik.system.DexFile;
import java.io.File;

public class al5
{
    private static volatile boolean a;
    private static File b;
    private static File c;
    private static final byte[] d;
    private static final String[] e;
    private static boolean f;
    private static final byte[] g;
    private static File h;
    private static final byte[] i;
    private static File j;
    private static boolean k;
    private static final byte[] l;
    private static String m;
    private static boolean n;
    private static int o;
    private static final byte[] p;
    private static File q;
    private static boolean r;
    private static String s;
    private static boolean t;
    private static boolean u;
    private static final String[] z;
    
    static {
        final String[] array = new String[179];
        String s = "\u0019&C$*";
        int n = -1;
        String[] array2 = array;
        String[] array3 = array;
        int n2 = 0;
        String intern = null;
    Label_5227:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int j = charArray.length, n3 = 0; j > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0012';
                        break;
                    }
                    case 0: {
                        c2 = 'L';
                        break;
                    }
                    case 1: {
                        c2 = 'r';
                        break;
                    }
                    case 2: {
                        c2 = '\u0005';
                        break;
                    }
                    case 3: {
                        c2 = '\t';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array2[n2] = intern;
                    n2 = 1;
                    array2 = array3;
                    s = "\u001f:D$ yD";
                    n = 0;
                    continue;
                }
                case 0: {
                    array2[n2] = intern;
                    s = "/\u0013ijg \u0013qls$\u0013va=(\u001bbla8\u0017w){?Rk|~ ";
                    n = 1;
                    n2 = 2;
                    array2 = array3;
                    continue;
                }
                case 1: {
                    array2[n2] = intern;
                    n2 = 3;
                    array2 = array3;
                    s = "/\u0013ijg \u0013qls$\u0013va=(\u001bbla8\u0017w)";
                    n = 2;
                    continue;
                }
                case 2: {
                    array2[n2] = intern;
                    n2 = 4;
                    s = "/\u0013ijg \u0013qls$\u0013va=)\u001cffv%\u001cb&w>\u0000j{2";
                    n = 3;
                    array2 = array3;
                    continue;
                }
                case 3: {
                    array2[n2] = intern;
                    s = "\u000160";
                    n = 4;
                    n2 = 5;
                    array2 = array3;
                    continue;
                }
                case 4: {
                    array2[n2] = intern;
                    n2 = 6;
                    array2 = array3;
                    s = "\u0019&C$*";
                    n = 5;
                    continue;
                }
                case 5: {
                    array2[n2] = intern;
                    n2 = 7;
                    s = "\u001c0NMT~%l}z\u0004\u001fdjA\u000434H|(JG@F";
                    n = 6;
                    array2 = array3;
                    continue;
                }
                case 6: {
                    array2[n2] = intern;
                    n2 = 8;
                    s = "\u001c\u0000jo{ \u0017%Y{/\u0006p{w?";
                    n = 7;
                    array2 = array3;
                    continue;
                }
                case 7: {
                    array2[n2] = intern;
                    s = "/\u001dh'e$\u0013qzs<\u0002Zy`)\u0014`{w\"\u0011`z";
                    n = 8;
                    n2 = 9;
                    array2 = array3;
                    continue;
                }
                case 8: {
                    array2[n2] = intern;
                    n2 = 10;
                    array2 = array3;
                    s = ")\nql`\"\u0013iV\u007f)\u0016lhM?\u0006d}w";
                    n = 9;
                    continue;
                }
                case 9: {
                    array2[n2] = intern;
                    n2 = 11;
                    s = "#\u0010c&b;]jevc\u001a`hv)\u0000(d{?\u001fd}q$";
                    n = 10;
                    array2 = array3;
                    continue;
                }
                case 10: {
                    array2[n2] = intern;
                    n2 = 12;
                    s = "|B59\"|B59";
                    n = 11;
                    array2 = array3;
                    continue;
                }
                case 11: {
                    array2[n2] = intern;
                    n2 = 13;
                    s = "#\u001eaVb;";
                    n = 12;
                    array2 = array3;
                    continue;
                }
                case 12: {
                    array2[n2] = intern;
                    n2 = 14;
                    s = "\u0004\u001fdjA\u000434";
                    n = 13;
                    array2 = array3;
                    continue;
                }
                case 13: {
                    array2[n2] = intern;
                    n2 = 15;
                    s = "\u0004\u001fdjA\u000434";
                    n = 14;
                    array2 = array3;
                    continue;
                }
                case 14: {
                    array2[n2] = intern;
                    n2 = 16;
                    s = "/\u001dh'u#\u001dbew";
                    n = 15;
                    array2 = array3;
                    continue;
                }
                case 15: {
                    array2[n2] = intern;
                    n2 = 17;
                    s = "?\u000bkj`c\u001b";
                    n = 16;
                    array2 = array3;
                    continue;
                }
                case 16: {
                    array2[n2] = intern;
                    n2 = 18;
                    s = "?\u000bkj`c\u0017%";
                    n = 17;
                    array2 = array3;
                    continue;
                }
                case 17: {
                    array2[n2] = intern;
                    n2 = 19;
                    s = "?\u000bkj`c\u0017";
                    n = 18;
                    array2 = array3;
                    continue;
                }
                case 18: {
                    array2[n2] = intern;
                    n2 = 20;
                    s = "?\u000bkj`c\u0007khp \u0017%}}l\u0005w`f)R";
                    n = 19;
                    array2 = array3;
                    continue;
                }
                case 19: {
                    array2[n2] = intern;
                    n2 = 21;
                    s = "!\u001dpgf)\u0016";
                    n = 20;
                    array2 = array3;
                    continue;
                }
                case 20: {
                    array2[n2] = intern;
                    n2 = 22;
                    s = "/\u001dh'u#\u001dbew";
                    n = 21;
                    array2 = array3;
                    continue;
                }
                case 21: {
                    array2[n2] = intern;
                    n2 = 23;
                    s = "<\u0005";
                    n = 22;
                    array2 = array3;
                    continue;
                }
                case 22: {
                    array2[n2] = intern;
                    n2 = 24;
                    s = ">\u0017ffd)\u0000|)f#\u0019`g2$\u0017dmw>Rh`a!\u0013qjz";
                    n = 23;
                    array2 = array3;
                    continue;
                }
                case 23: {
                    array2[n2] = intern;
                    n2 = 25;
                    s = "-\u001ash~%\u0016l}kc\u0017w{}>";
                    n = 24;
                    array2 = array3;
                    continue;
                }
                case 24: {
                    array2[n2] = intern;
                    n2 = 26;
                    s = "<\u0013vze#\u0000a)z)\u0013al`l\u001flz\u007f-\u0006fa";
                    n = 25;
                    array2 = array3;
                    continue;
                }
                case 25: {
                    array2[n2] = intern;
                    n2 = 27;
                    s = ")\nql`\"\u0013iV`/-ffb%\u0017aVf#-lgf)\u0000kh~";
                    n = 26;
                    array2 = array3;
                    continue;
                }
                case 26: {
                    array2[n2] = intern;
                    n2 = 28;
                    s = "/\u001dh'e$\u0013qzs<\u0002Zy`)\u0014`{w\"\u0011`z";
                    n = 27;
                    array2 = array3;
                    continue;
                }
                case 27: {
                    array2[n2] = intern;
                    n2 = 29;
                    s = "?\u0016n";
                    n = 28;
                    array2 = array3;
                    continue;
                }
                case 28: {
                    array2[n2] = intern;
                    n2 = 30;
                    s = "?\u0016n";
                    n = 29;
                    array2 = array3;
                    continue;
                }
                case 29: {
                    array2[n2] = intern;
                    n2 = 31;
                    s = "-\u001ca{}%\u0016Z`v";
                    n = 30;
                    array2 = array3;
                    continue;
                }
                case 30: {
                    array2[n2] = intern;
                    n2 = 32;
                    s = "?\u0016n";
                    n = 31;
                    array2 = array3;
                    continue;
                }
                case 31: {
                    array2[n2] = intern;
                    n2 = 33;
                    s = "-\u001ca{}%\u0016Z`v";
                    n = 32;
                    array2 = array3;
                    continue;
                }
                case 32: {
                    array2[n2] = intern;
                    n2 = 34;
                    s = "/\u001dh's\"\u0016wf{(\\ff\u007f!\u0013kmab\u001fjgy)\u000b";
                    n = 33;
                    array2 = array3;
                    continue;
                }
                case 33: {
                    array2[n2] = intern;
                    n2 = 35;
                    s = "<\u0001";
                    n = 34;
                    array2 = array3;
                    continue;
                }
                case 34: {
                    array2[n2] = intern;
                    n2 = 36;
                    s = "-\u0002u&\u007f(G*l`>\u001dw)";
                    n = 35;
                    array2 = array3;
                    continue;
                }
                case 35: {
                    array2[n2] = intern;
                    n2 = 37;
                    s = "/\u001edza)\u0001+mw4";
                    n = 36;
                    array2 = array3;
                    continue;
                }
                case 36: {
                    array2[n2] = intern;
                    n2 = 38;
                    s = "\u000160";
                    n = 37;
                    array2 = array3;
                    continue;
                }
                case 37: {
                    array2[n2] = intern;
                    n2 = 39;
                    s = "\"\u0007ie";
                    n = 38;
                    array2 = array3;
                    continue;
                }
                case 38: {
                    array2[n2] = intern;
                    n2 = 40;
                    s = "/\u001dh'e$\u0013qzs<\u0002Zy`)\u0014`{w\"\u0011`z";
                    n = 39;
                    array2 = array3;
                    continue;
                }
                case 39: {
                    array2[n2] = intern;
                    n2 = 41;
                    s = ")\nql`\"\u0013iV`/-`q{?\u0006v";
                    n = 40;
                    array2 = array3;
                    continue;
                }
                case 40: {
                    array2[n2] = intern;
                    n2 = 42;
                    s = "\u000160";
                    n = 41;
                    array2 = array3;
                    continue;
                }
                case 41: {
                    array2[n2] = intern;
                    n2 = 43;
                    s = "\u001f:D8B\u001e<B";
                    n = 42;
                    array2 = array3;
                    continue;
                }
                case 42: {
                    array2[n2] = intern;
                    n2 = 44;
                    s = "\r7V";
                    n = 43;
                    array2 = array3;
                    continue;
                }
                case 43: {
                    array2[n2] = intern;
                    n2 = 45;
                    s = "c\u001fk}=?\u0016fh`(]gzf*\u001dimw>]Lgb9\u0006Hhb<\u0017w&q#\u001f+k~9\u0017v}s/\u0019v's<\u0002hh`8\\fou";
                    n = 44;
                    array2 = array3;
                    continue;
                }
                case 44: {
                    array2[n2] = intern;
                    n2 = 46;
                    s = "/\u001dh'e$\u0013qzs<\u0002Zy`)\u0014`{w\"\u0011`z";
                    n = 45;
                    array2 = array3;
                    continue;
                }
                case 45: {
                    array2[n2] = intern;
                    n2 = 47;
                    s = "?\u000bkj`c\u0002wltc\u0001`}=)\u0000wf`";
                    n = 46;
                    array2 = array3;
                    continue;
                }
                case 46: {
                    array2[n2] = intern;
                    n2 = 48;
                    s = ")\nql`\"\u0013iV`/-ffb%\u0017aVf#-lgf)\u0000kh~";
                    n = 47;
                    array2 = array3;
                    continue;
                }
                case 47: {
                    array2[n2] = intern;
                    n2 = 49;
                    s = "?\u000bkj`c\u0002wltc\u0001`}";
                    n = 48;
                    array2 = array3;
                    continue;
                }
                case 48: {
                    array2[n2] = intern;
                    n2 = 50;
                    s = "/\u001dh'e$\u0013qzs<\u0002";
                    n = 49;
                    array2 = array3;
                    continue;
                }
                case 49: {
                    array2[n2] = intern;
                    n2 = 51;
                    s = "\u001f:D8B\u001e<B";
                    n = 50;
                    array2 = array3;
                    continue;
                }
                case 50: {
                    array2[n2] = intern;
                    n2 = 52;
                    s = "c\u0001|zf)\u001f*e{.]i`p/-hh~ \u001dfVv)\u0010pnM=\u0017h|<?\u001d";
                    n = 51;
                    array2 = array3;
                    continue;
                }
                case 51: {
                    array2[n2] = intern;
                    n2 = 53;
                    s = "-\u0002u&\u007f(G*kk8\u0017v&w>\u0000j{2";
                    n = 52;
                    array2 = array3;
                    continue;
                }
                case 52: {
                    array2[n2] = intern;
                    n2 = 54;
                    s = "/\u001edza)\u0001+mw4";
                    n = 53;
                    array2 = array3;
                    continue;
                }
                case 53: {
                    array2[n2] = intern;
                    n2 = 55;
                    s = "\"\u0007ie";
                    n = 54;
                    array2 = array3;
                    continue;
                }
                case 54: {
                    array2[n2] = intern;
                    n2 = 56;
                    s = "\u0019&C$*";
                    n = 55;
                    array2 = array3;
                    continue;
                }
                case 55: {
                    array2[n2] = intern;
                    n2 = 57;
                    s = "\u000160";
                    n = 56;
                    array2 = array3;
                    continue;
                }
                case 56: {
                    array2[n2] = intern;
                    n2 = 58;
                    s = ".\u0013fbg<\u0011lyz)\u0000*aw-\u0016`{?!\u001bvds8\u0011m";
                    n = 57;
                    array2 = array3;
                    continue;
                }
                case 57: {
                    array2[n2] = intern;
                    n2 = 59;
                    s = ".\u0013fbg<\u0011lyz)\u0000*mpc\u0015`}=%\u001d`{`#\u0000%";
                    n = 58;
                    array2 = array3;
                    continue;
                }
                case 58: {
                    array2[n2] = intern;
                    n2 = 60;
                    s = ".\u0013fbg<\u0011lyz)\u0000*mpc\u0015`}=%\u001d`{`#\u0000%";
                    n = 59;
                    array2 = array3;
                    continue;
                }
                case 59: {
                    array2[n2] = intern;
                    n2 = 61;
                    s = ".\u0013fbg<\u0011lyz)\u0000*mpc\u0015`}=/\u0013k.fl\u0014lgvl";
                    n = 60;
                    array2 = array3;
                    continue;
                }
                case 60: {
                    array2[n2] = intern;
                    n2 = 62;
                    s = ".\u0013fbg<\u0019`p=(\u0010*nw8\u0002d{s!\u0001*m})\u0001(g}8_`q{?\u0006";
                    n = 61;
                    array2 = array3;
                    continue;
                }
                case 61: {
                    array2[n2] = intern;
                    n2 = 63;
                    s = ".\u0013fbg<\u0011lyz)\u0000*mpc\u0015`}=%\u001d`{`#\u0000%";
                    n = 62;
                    array2 = array3;
                    continue;
                }
                case 62: {
                    array2[n2] = intern;
                    n2 = 64;
                    s = ".\u0013fbg<\u0011lyz)\u0000*mpc\u0015`}=%\u001d`{`#\u0000%";
                    n = 63;
                    array2 = array3;
                    continue;
                }
                case 63: {
                    array2[n2] = intern;
                    n2 = 65;
                    s = ".\u0013fbg<\u0011lyz)\u0000*mpc\u0015`}=)\u0000wf`l";
                    n = 64;
                    array2 = array3;
                    continue;
                }
                case 64: {
                    array2[n2] = intern;
                    n2 = 66;
                    s = ".\u0013fbg<\u0011lyz)\u0000*mpc\u0015`}=%\u001d`{`#\u0000%";
                    n = 65;
                    array2 = array3;
                    continue;
                }
                case 65: {
                    array2[n2] = intern;
                    n2 = 67;
                    s = "l\u0001lswl\u001flz\u007f-\u0006fa";
                    n = 66;
                    array2 = array3;
                    continue;
                }
                case 66: {
                    array2[n2] = intern;
                    n2 = 68;
                    s = ".\u0013fbg<\u0019`p=+\u0017q`|*\u001d*m})\u0001(g}8_`q{?\u0006";
                    n = 67;
                    array2 = array3;
                    continue;
                }
                case 67: {
                    array2[n2] = intern;
                    n2 = 69;
                    s = ".\u0013fbg<\u0019`p=?\u0017q&g\"\u0013gewa\u0006j$e>\u001bql2";
                    n = 68;
                    array2 = array3;
                    continue;
                }
                case 68: {
                    array2[n2] = intern;
                    n2 = 70;
                    s = "'\u0017|";
                    n = 69;
                    array2 = array3;
                    continue;
                }
                case 69: {
                    array2[n2] = intern;
                    n2 = 71;
                    s = "?\u000bkj`c\u0002wltc\u0001`}=)]`q{?\u0006*l`>\u001dw";
                    n = 70;
                    array2 = array3;
                    continue;
                }
                case 70: {
                    array2[n2] = intern;
                    n2 = 72;
                    s = ")\nql`\"\u0013iV`/-`q{?\u0006v";
                    n = 71;
                    array2 = array3;
                    continue;
                }
                case 71: {
                    array2[n2] = intern;
                    n2 = 73;
                    s = "?\u000bkj`c\u0002wltc\u0001`}=)]`q{?\u0006";
                    n = 72;
                    array2 = array3;
                    continue;
                }
                case 72: {
                    array2[n2] = intern;
                    n2 = 74;
                    s = "/\u001dh'e$\u0013qzs<\u0002Zy`)\u0014`{w\"\u0011`z";
                    n = 73;
                    array2 = array3;
                    continue;
                }
                case 73: {
                    array2[n2] = intern;
                    n2 = 75;
                    s = "#\u0000b's/\u0000d'S\u000f D";
                    n = 74;
                    array2 = array3;
                    continue;
                }
                case 74: {
                    array2[n2] = intern;
                    n2 = 76;
                    s = "?\u000bkj`c\u0002wltc\u0001`}=?\u0006d}wl";
                    n = 75;
                    array2 = array3;
                    continue;
                }
                case 75: {
                    array2[n2] = intern;
                    n2 = 77;
                    s = "/\u001dh'e$\u0013qzs<\u0002Zy`)\u0014`{w\"\u0011`z";
                    n = 76;
                    array2 = array3;
                    continue;
                }
                case 76: {
                    array2[n2] = intern;
                    n2 = 78;
                    s = ")\nql`\"\u0013iV\u007f)\u0016lhM?\u0006d}w";
                    n = 77;
                    array2 = array3;
                    continue;
                }
                case 77: {
                    array2[n2] = intern;
                    n2 = 79;
                    s = "?\u000bkj`c\u0002wltc\u0001`}=?\u0006d}wc\u0017w{}>";
                    n = 78;
                    array2 = array3;
                    continue;
                }
                case 78: {
                    array2[n2] = intern;
                    n2 = 80;
                    s = ">\u0017ffd)\u0000|)f#\u0019`g2$\u0017dmw>Rh`a!\u0013qjz";
                    n = 79;
                    array2 = array3;
                    continue;
                }
                case 79: {
                    array2[n2] = intern;
                    n2 = 81;
                    s = "9\u001cdk~)Rqf2;\u0000l}wl\u001b";
                    n = 80;
                    array2 = array3;
                    continue;
                }
                case 80: {
                    array2[n2] = intern;
                    n2 = 82;
                    s = "+\u0017q&`c\u0001qhf)]`{`#\u0000%";
                    n = 81;
                    array2 = array3;
                    continue;
                }
                case 81: {
                    array2[n2] = intern;
                    n2 = 83;
                    s = "+\u0017q&`c\u0017";
                    n = 82;
                    array2 = array3;
                    continue;
                }
                case 82: {
                    array2[n2] = intern;
                    n2 = 84;
                    s = "+\u0017q)p5\u0006`)s>\u0000dp";
                    n = 83;
                    array2 = array3;
                    continue;
                }
                case 83: {
                    array2[n2] = intern;
                    n2 = 85;
                    s = "'\u0017|";
                    n = 84;
                    array2 = array3;
                    continue;
                }
                case 84: {
                    array2[n2] = intern;
                    n2 = 86;
                    s = ">\u0011";
                    n = 85;
                    array2 = array3;
                    continue;
                }
                case 85: {
                    array2[n2] = intern;
                    n2 = 87;
                    s = "!\u001dpgf)\u0016";
                    n = 86;
                    array2 = array3;
                    continue;
                }
                case 86: {
                    array2[n2] = intern;
                    n2 = 88;
                    s = "c\u0001|zf)\u001f*k{\"]v|";
                    n = 87;
                    array2 = array3;
                    continue;
                }
                case 87: {
                    array2[n2] = intern;
                    n2 = 89;
                    s = "-\u0002u&v \u000b%";
                    n = 88;
                    array2 = array3;
                    continue;
                }
                case 88: {
                    array2[n2] = intern;
                    n2 = 90;
                    s = "c\u0001|zf)\u001f*qp%\u001c*zg";
                    n = 89;
                    array2 = array3;
                    continue;
                }
                case 89: {
                    array2[n2] = intern;
                    n2 = 91;
                    s = "bB";
                    n = 90;
                    array2 = array3;
                    continue;
                }
                case 90: {
                    array2[n2] = intern;
                    n2 = 92;
                    s = "-\u0002u&v \u000b%";
                    n = 91;
                    array2 = array3;
                    continue;
                }
                case 91: {
                    array2[n2] = intern;
                    n2 = 93;
                    s = "-\u0002u&q$\u0017fb=\"\u001dhlf$\u001da)";
                    n = 92;
                    array2 = array3;
                    continue;
                }
                case 92: {
                    array2[n2] = intern;
                    n2 = 94;
                    s = "bB";
                    n = 93;
                    array2 = array3;
                    continue;
                }
                case 93: {
                    array2[n2] = intern;
                    n2 = 95;
                    s = "\u001f:D$ yD";
                    n = 94;
                    array2 = array3;
                    continue;
                }
                case 94: {
                    array2[n2] = intern;
                    n2 = 96;
                    s = "b\u001cjdw(\u001bd";
                    n = 95;
                    array2 = array3;
                    continue;
                }
                case 95: {
                    array2[n2] = intern;
                    n2 = 97;
                    s = "\r7V&]\n0*G}\u001c\u0013am{\"\u0015";
                    n = 96;
                    array2 = array3;
                    continue;
                }
                case 96: {
                    array2[n2] = intern;
                    n2 = 98;
                    s = "\r7V&]\n0*G}\u001c\u0013am{\"\u0015";
                    n = 97;
                    array2 = array3;
                    continue;
                }
                case 97: {
                    array2[n2] = intern;
                    n2 = 99;
                    s = "9\u001cdk~)Rqf2;\u0000l}wl";
                    n = 98;
                    array2 = array3;
                    continue;
                }
                case 98: {
                    array2[n2] = intern;
                    n2 = 100;
                    s = "?\u0017q&g\"\u0013gewl\u0006j)e>\u001bql2)";
                    n = 99;
                    array2 = array3;
                    continue;
                }
                case 99: {
                    array2[n2] = intern;
                    n2 = 101;
                    s = ">]`&";
                    n = 100;
                    array2 = array3;
                    continue;
                }
                case 100: {
                    array2[n2] = intern;
                    n2 = 102;
                    s = "\r7V&]\n0*G}\u001c\u0013am{\"\u0015";
                    n = 101;
                    array2 = array3;
                    continue;
                }
                case 101: {
                    array2[n2] = intern;
                    n2 = 103;
                    s = "\r7V&]\n0*G}\u001c\u0013am{\"\u0015";
                    n = 102;
                    array2 = array3;
                    continue;
                }
                case 102: {
                    array2[n2] = intern;
                    n2 = 104;
                    s = "l\u0001lswl\u001flz\u007f-\u0006fa";
                    n = 103;
                    array2 = array3;
                    continue;
                }
                case 103: {
                    array2[n2] = intern;
                    n2 = 105;
                    s = "*\u0000jp}<\u001epz";
                    n = 104;
                    array2 = array3;
                    continue;
                }
                case 104: {
                    array2[n2] = intern;
                    n2 = 106;
                    s = "\b\u0017g|a\u001e=H";
                    n = 105;
                    array2 = array3;
                    continue;
                }
                case 105: {
                    array2[n2] = intern;
                    n2 = 107;
                    s = " \u001bql|%\u001cb";
                    n = 106;
                    array2 = array3;
                    continue;
                }
                case 106: {
                    array2[n2] = intern;
                    n2 = 108;
                    s = "%\u0006c||6";
                    n = 107;
                    array2 = array3;
                    continue;
                }
                case 107: {
                    array2[n2] = intern;
                    n2 = 109;
                    s = ":\u001bies%\u001cwf\u007f";
                    n = 108;
                    array2 = array3;
                    continue;
                }
                case 108: {
                    array2[n2] = intern;
                    n2 = 110;
                    s = "+\u001bknw>\u0004le~%\u0013k";
                    n = 109;
                    array2 = array3;
                    continue;
                }
                case 109: {
                    array2[n2] = intern;
                    n2 = 111;
                    s = "(\u0013h`s\"\u0015qf";
                    n = 110;
                    array2 = array3;
                    continue;
                }
                case 110: {
                    array2[n2] = intern;
                    n2 = 112;
                    s = "+\u001bknw>\u0000`h~";
                    n = 111;
                    array2 = array3;
                    continue;
                }
                case 111: {
                    array2[n2] = intern;
                    n2 = 113;
                    s = "\r\u0011mff&\u0013k";
                    n = 112;
                    array2 = array3;
                    continue;
                }
                case 112: {
                    array2[n2] = intern;
                    n2 = 114;
                    s = "\n\u0000`lJ}B";
                    n = 113;
                    array2 = array3;
                    continue;
                }
                case 113: {
                    array2[n2] = intern;
                    n2 = 115;
                    s = "(\u0017g|u";
                    n = 114;
                    array2 = array3;
                    continue;
                }
                case 114: {
                    array2[n2] = intern;
                    n2 = 116;
                    s = "4\u0016dgv>\u001dlm";
                    n = 115;
                    array2 = array3;
                    continue;
                }
                case 115: {
                    array2[n2] = intern;
                    n2 = 117;
                    s = "<\u001biff4";
                    n = 116;
                    array2 = array3;
                    continue;
                }
                case 116: {
                    array2[n2] = intern;
                    n2 = 118;
                    s = "!\u001bp`";
                    n = 117;
                    array2 = array3;
                    continue;
                }
                case 117: {
                    array2[n2] = intern;
                    n2 = 119;
                    s = "(\u0017g|u";
                    n = 118;
                    array2 = array3;
                    continue;
                }
                case 118: {
                    array2[n2] = intern;
                    n2 = 120;
                    s = "\b\u0013wbk";
                    n = 119;
                    array2 = array3;
                    continue;
                }
                case 119: {
                    array2[n2] = intern;
                    n2 = 121;
                    s = "\u0001;P@";
                    n = 120;
                    array2 = array3;
                    continue;
                }
                case 120: {
                    array2[n2] = intern;
                    n2 = 122;
                    s = "\n\u0000jp}\u001c\u001epz";
                    n = 121;
                    array2 = array3;
                    continue;
                }
                case 121: {
                    array2[n2] = intern;
                    n2 = 123;
                    s = "/\u0000lzy)\u001ej{}!";
                    n = 122;
                    array2 = array3;
                    continue;
                }
                case 122: {
                    array2[n2] = intern;
                    n2 = 124;
                    s = "\u001a\u001bies%\u001cWF_";
                    n = 123;
                    array2 = array3;
                    continue;
                }
                case 123: {
                    array2[n2] = intern;
                    n2 = 125;
                    s = "/\u000bdg}+\u0017k";
                    n = 124;
                    array2 = array3;
                    continue;
                }
                case 124: {
                    array2[n2] = intern;
                    n2 = 126;
                    s = "(\u0017g|a";
                    n = 125;
                    array2 = array3;
                    continue;
                }
                case 125: {
                    array2[n2] = intern;
                    n2 = 127;
                    s = "*\u0013nla$\u001fjf";
                    n = 126;
                    array2 = array3;
                    continue;
                }
                case 126: {
                    array2[n2] = intern;
                    n2 = 128;
                    s = "<\u0017wjw<\u0006lf|";
                    n = 127;
                    array2 = array3;
                    continue;
                }
                case 127: {
                    array2[n2] = intern;
                    n2 = 129;
                    s = "\u0000\u0017`M`\u0003\u001bA";
                    n = 128;
                    array2 = array3;
                    continue;
                }
                case 128: {
                    array2[n2] = intern;
                    n2 = 130;
                    s = "\u0000\u001dwM\u007f#\u0016KJF)\u0013h";
                    n = 129;
                    array2 = array3;
                    continue;
                }
                case 129: {
                    array2[n2] = intern;
                    n2 = 131;
                    s = "!\u001dahq#";
                    n = 130;
                    array2 = array3;
                    continue;
                }
                case 130: {
                    array2[n2] = intern;
                    n2 = 132;
                    s = "\u0000\u001bql5\"\u001bkn2\u001e\u001dh";
                    n = 131;
                    array2 = array3;
                    continue;
                }
                case 131: {
                    array2[n2] = intern;
                    n2 = 133;
                    s = "\u001e\\P'@bC<;\"";
                    n = 132;
                    array2 = array3;
                    continue;
                }
                case 132: {
                    array2[n2] = intern;
                    n2 = 134;
                    s = "(\u0017g|u";
                    n = 133;
                    array2 = array3;
                    continue;
                }
                case 133: {
                    array2[n2] = intern;
                    n2 = 135;
                    s = "\u000b;KNW\u001e$le~-\u001bk";
                    n = 134;
                    array2 = array3;
                    continue;
                }
                case 134: {
                    array2[n2] = intern;
                    n2 = 136;
                    s = "*\u001di`}!\u001da";
                    n = 135;
                    array2 = array3;
                    continue;
                }
                case 135: {
                    array2[n2] = intern;
                    n2 = 137;
                    s = "(\u0017g|u";
                    n = 136;
                    array2 = array3;
                    continue;
                }
                case 136: {
                    array2[n2] = intern;
                    n2 = 138;
                    s = "/\u000bdg}+\u0017k";
                    n = 137;
                    array2 = array3;
                    continue;
                }
                case 137: {
                    array2[n2] = intern;
                    n2 = 139;
                    s = "*\u0000jpv:\u001bies%\u001c";
                    n = 138;
                    array2 = array3;
                    continue;
                }
                case 138: {
                    array2[n2] = intern;
                    n2 = 140;
                    s = "*\u0000`lj}B";
                    n = 139;
                    array2 = array3;
                    continue;
                }
                case 139: {
                    array2[n2] = intern;
                    n2 = 141;
                    s = "\u001b\u001bimB9\b\u007few";
                    n = 140;
                    array2 = array3;
                    continue;
                }
                case 140: {
                    array2[n2] = intern;
                    n2 = 142;
                    s = ".\u001bjg{4";
                    n = 141;
                    array2 = array3;
                    continue;
                }
                case 141: {
                    array2[n2] = intern;
                    n2 = 143;
                    s = "\u000b\u001bknw> `h~";
                    n = 142;
                    array2 = array3;
                    continue;
                }
                case 142: {
                    array2[n2] = intern;
                    n2 = 144;
                    s = "\u001a\u001bies%\u001cWF_";
                    n = 143;
                    array2 = array3;
                    continue;
                }
                case 143: {
                    array2[n2] = intern;
                    n2 = 145;
                    s = "\u00146Dgv>\u001dlm";
                    n = 144;
                    array2 = array3;
                    continue;
                }
                case 144: {
                    array2[n2] = intern;
                    n2 = 146;
                    s = "(\u0017g|u";
                    n = 145;
                    array2 = array3;
                    continue;
                }
                case 145: {
                    array2[n2] = intern;
                    n2 = 147;
                    s = "(\u0017g|u";
                    n = 146;
                    array2 = array3;
                    continue;
                }
                case 146: {
                    array2[n2] = intern;
                    n2 = 148;
                    s = "(\u0017g|u";
                    n = 147;
                    array2 = array3;
                    continue;
                }
                case 147: {
                    array2[n2] = intern;
                    n2 = 149;
                    s = "\u000e\u001bjg{4";
                    n = 148;
                    array2 = array3;
                    continue;
                }
                case 148: {
                    array2[n2] = intern;
                    n2 = 150;
                    s = "(\u0017g|u";
                    n = 149;
                    array2 = array3;
                    continue;
                }
                case 149: {
                    array2[n2] = intern;
                    n2 = 151;
                    s = "-\u001ca{}a\u001ba";
                    n = 150;
                    array2 = array3;
                    continue;
                }
                case 150: {
                    array2[n2] = intern;
                    n2 = 152;
                    s = " \u0017`m`#\u001ba";
                    n = 151;
                    array2 = array3;
                    continue;
                }
                case 151: {
                    array2[n2] = intern;
                    n2 = 153;
                    s = "(\u0013wbk";
                    n = 152;
                    array2 = array3;
                    continue;
                }
                case 152: {
                    array2[n2] = intern;
                    n2 = 154;
                    s = "-\u0011mff&\u0013k";
                    n = 153;
                    array2 = array3;
                    continue;
                }
                case 153: {
                    array2[n2] = intern;
                    n2 = 155;
                    s = "*\u0013nlA$\u001fjf";
                    n = 154;
                    array2 = array3;
                    continue;
                }
                case 154: {
                    array2[n2] = intern;
                    n2 = 156;
                    s = "(\u0017g|u";
                    n = 155;
                    array2 = array3;
                    continue;
                }
                case 155: {
                    array2[n2] = intern;
                    n2 = 157;
                    s = "\u001c\u001biff4 jd";
                    n = 156;
                    array2 = array3;
                    continue;
                }
                case 156: {
                    array2[n2] = intern;
                    n2 = 158;
                    s = " \u001dwm\u007f#\u0016";
                    n = 157;
                    array2 = array3;
                    continue;
                }
                case 157: {
                    array2[n2] = intern;
                    n2 = 159;
                    s = ">\u0007w8+~B";
                    n = 158;
                    array2 = array3;
                    continue;
                }
                case 158: {
                    array2[n2] = intern;
                    n2 = 160;
                    s = "\n\u0007b|_#\u0016";
                    n = 159;
                    array2 = array3;
                    continue;
                }
                case 159: {
                    array2[n2] = intern;
                    n2 = 161;
                    s = "\n\u0000jpv\u001a\u001bies%\u001c";
                    n = 160;
                    array2 = array3;
                    continue;
                }
                case 160: {
                    array2[n2] = intern;
                    n2 = 162;
                    s = "\u001c\u0017wjw<\u0006lf|l0p`~(";
                    n = 161;
                    array2 = array3;
                    continue;
                }
                case 161: {
                    array2[n2] = intern;
                    n2 = 163;
                    s = "\u0001\u001dAhQ#";
                    n = 162;
                    array2 = array3;
                    continue;
                }
                case 162: {
                    array2[n2] = intern;
                    n2 = 164;
                    s = "-\u0002u&q9\u0001qf\u007fa\u0000jd2";
                    n = 163;
                    array2 = array3;
                    continue;
                }
                case 163: {
                    array2[n2] = intern;
                    n2 = 165;
                    s = "\u000f\u0000lzy)\u001ej[]\u0001";
                    n = 164;
                    array2 = array3;
                    continue;
                }
                case 164: {
                    array2[n2] = intern;
                    n2 = 166;
                    s = "*\u0007b|";
                    n = 165;
                    array2 = array3;
                    continue;
                }
                case 165: {
                    array2[n2] = intern;
                    n2 = 167;
                    s = "a FD[\u0014";
                    n = 166;
                    array2 = array3;
                    continue;
                }
                case 166: {
                    array2[n2] = intern;
                    n2 = 168;
                    s = ">\u0011h`j";
                    n = 167;
                    array2 = array3;
                    continue;
                }
                case 167: {
                    array2[n2] = intern;
                    n2 = 169;
                    s = "\u0005&C\\\\\u0016";
                    n = 168;
                    array2 = array3;
                    continue;
                }
                case 168: {
                    array2[n2] = intern;
                    n2 = 170;
                    s = ";\u001bimb9\b\u007few";
                    n = 169;
                    array2 = array3;
                    continue;
                }
                case 169: {
                    array2[n2] = intern;
                    n2 = 171;
                    s = "(\u0017g|u";
                    n = 170;
                    array2 = array3;
                    continue;
                }
                case 170: {
                    array2[n2] = intern;
                    n2 = 172;
                    s = "\b\u0013h`s\"5QF";
                    n = 171;
                    array2 = array3;
                    continue;
                }
                case 171: {
                    array2[n2] = intern;
                    n2 = 173;
                    s = "\b\u0017}}w>Uv)T#\u001elf_#\u0016";
                    n = 172;
                    array2 = array3;
                    continue;
                }
                case 172: {
                    array2[n2] = intern;
                    n2 = 174;
                    s = "\r\u001ca{}a;A";
                    n = 173;
                    array2 = array3;
                    continue;
                }
                case 173: {
                    array2[n2] = intern;
                    n2 = 175;
                    s = "/\u001dh'u)\u001c|d}8\u001bjg<?\u0007ul`9\u0001`{";
                    n = 174;
                    array2 = array3;
                    continue;
                }
                case 174: {
                    array2[n2] = intern;
                    n2 = 176;
                    s = "c\u0016`\u007f=/\u001dh'u)\u001c|d}8\u001bjg<?\u0007ul`9\u0001`{<(\u0013`d}\"";
                    n = 175;
                    array2 = array3;
                    continue;
                }
                case 175: {
                    array2[n2] = intern;
                    n2 = 177;
                    s = "\u001f:D$ yD";
                    n = 176;
                    array2 = array3;
                    continue;
                }
                case 176: {
                    array2[n2] = intern;
                    n2 = 178;
                    s = "\r7V";
                    n = 177;
                    array2 = array3;
                    continue;
                }
                case 177: {
                    array2[n2] = intern;
                    z = array3;
                    final String[] array4 = new String[11];
                    s = "/\u001dh'p \u0007`zf-\u0011nz<?\u0017d{q$\u0013uy";
                    n = 178;
                    array2 = array4;
                    array3 = array4;
                    n2 = 0;
                    continue;
                }
                case 178: {
                    array2[n2] = intern;
                    n2 = 1;
                    s = "/\u001dh'p \u0007`zf-\u0011nz<$\u001dhl";
                    n = 179;
                    array2 = array3;
                    continue;
                }
                case 179: {
                    array2[n2] = intern;
                    s = "/\u001dh'p \u0007`zf-\u0011nz<?\u0017q|b";
                    n = 180;
                    n2 = 2;
                    array2 = array3;
                    continue;
                }
                case 180: {
                    array2[n2] = intern;
                    n2 = 3;
                    s = "/\u001dh'p \u0007`zf-\u0011nz<-\u0002uo{\"\u0016`{";
                    n = 181;
                    array2 = array3;
                    continue;
                }
                case 181: {
                    array2[n2] = intern;
                    n2 = 4;
                    s = "/\u001dh'p \u0007`zf-\u0011nz<?\u0017q}{\"\u0015v";
                    n = 182;
                    array2 = array3;
                    continue;
                }
                case 182: {
                    array2[n2] = intern;
                    s = "/\u001dh'p \u0007`zf-\u0011nz<.\u0001qo} \u0016`{";
                    n = 183;
                    n2 = 5;
                    array2 = array3;
                    continue;
                }
                case 183: {
                    array2[n2] = intern;
                    n2 = 6;
                    s = "/\u001dh'p \u0007`zf-\u0011nz<-\u0002uzw8\u0006lgu?";
                    n = 184;
                    array2 = array3;
                    continue;
                }
                case 184: {
                    array2[n2] = intern;
                    n2 = 7;
                    s = "/\u001dh'p \u0007`zf-\u0011nz<-\u0002uds>\u0006";
                    n = 185;
                    array2 = array3;
                    continue;
                }
                case 185: {
                    array2[n2] = intern;
                    n2 = 8;
                    s = "/\u001dh'p \u0007`zf-\u0011nz<-\u0011fl~)\u0000jdw8\u0017w|{";
                    n = 186;
                    array2 = array3;
                    continue;
                }
                case 186: {
                    array2[n2] = intern;
                    s = "/\u001dh'p \u0007`zf-\u0011nz<\u000e\u0001qJ}!\u001fdgv\u001c\u0000jjw?\u0001j{";
                    n = 187;
                    n2 = 9;
                    array2 = array3;
                    continue;
                }
                case 187: {
                    array2[n2] = intern;
                    n2 = 10;
                    s = "/\u001dh'p \u0007`zf-\u0011nz<?@u";
                    n = 188;
                    array2 = array3;
                    continue;
                }
                case 188: {
                    break Label_5227;
                }
            }
        }
        array2[n2] = intern;
        e = array3;
        p = new byte[] { 0, 1 };
        l = new byte[] { 0, 2 };
        g = new byte[] { 0, 1 };
        d = new byte[] { 0, 2 };
        i = new byte[] { 0, 1 };
        al5.s = null;
        al5.m = null;
        al5.f = false;
        al5.u = false;
        al5.r = false;
        al5.t = false;
        al5.k = false;
        al5.n = false;
        al5.b = null;
        al5.j = null;
        al5.c = null;
        al5.h = null;
        al5.q = null;
        al5.o = 0;
        al5.a = false;
    }
    
    public static String A() {
        while (true) {
            final boolean i = App.I;
            final StringBuilder sb = new StringBuilder();
            int n = 15;
            while (true) {
                int n2 = 0;
                Label_0100: {
                    try {
                        final Enumeration entries = new DexFile(App.aq.getApplicationInfo().sourceDir).entries();
                        if (entries.hasMoreElements()) {
                            n2 = n - 1;
                            if (n2 >= 0 || i) {
                                sb.append(entries.nextElement());
                                sb.append(";");
                                if (!i) {
                                    break Label_0100;
                                }
                            }
                        }
                        return sb.toString();
                    }
                    catch (IOException ex) {
                        Log.b(ex);
                        return sb.toString();
                    }
                }
                n = n2;
                continue;
            }
        }
    }
    
    private static String B() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.aV:I
        //     3: istore_2       
        //     4: iload_2        
        //     5: iconst_3       
        //     6: if_icmpeq       16
        //     9: getstatic       com/whatsapp/App.aS:I
        //    12: iconst_3       
        //    13: if_icmpne       26
        //    16: getstatic       com/whatsapp/a6c.h:Ljava/lang/String;
        //    19: areturn        
        //    20: astore_0       
        //    21: aload_0        
        //    22: athrow         
        //    23: astore_1       
        //    24: aload_1        
        //    25: athrow         
        //    26: getstatic       com/whatsapp/a6c.e:Ljava/lang/String;
        //    29: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      4      20     23     Ljava/lang/NullPointerException;
        //  9      16     23     26     Ljava/lang/NullPointerException;
        //  16     20     23     26     Ljava/lang/NullPointerException;
        //  21     23     23     26     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0016:
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
    
    private static File C() {
        return new File(App.aq.getFilesDir(), al5.z[85]);
    }
    
    private static File D() {
        try {
            if (al5.a) {
                return al5.c;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return new File(App.M, al5.z[8]);
    }
    
    public static boolean E() {
        return App.aq.getSharedPreferences(al5.z[28], 0).getBoolean(al5.z[27], false);
    }
    
    private static File F() {
        try {
            if (al5.a) {
                return al5.q;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return new File(App.aq.getFilesDir(), al5.z[13]);
    }
    
    private static String G() {
        try {
            if (al5.a) {
                return al5.s;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return m();
    }
    
    public static int H() {
        final boolean i = App.I;
        try {
            if (al5.o != 0) {
                return al5.o;
            }
        }
        catch (IOException ex) {
            throw ex;
        }
        try {
            final Enumeration entries = new DexFile(App.aq.getApplicationInfo().sourceDir).entries();
            while (entries.hasMoreElements()) {
                entries.nextElement();
                ++al5.o;
                if (i) {
                    break;
                }
            }
            return al5.o;
        }
        catch (IOException ex2) {
            Log.b(ex2);
            return al5.o;
        }
    }
    
    static boolean I() {
        while (true) {
            try {
                if (al5.a) {
                    return al5.r;
                }
            }
            catch (Exception ex) {
                throw ex;
            }
            try {
                final boolean exists = new File(al5.z[52]).exists();
                final boolean r = false;
                if (exists) {
                    return true;
                }
                return r;
            }
            catch (Exception ex2) {
                return false;
            }
        }
    }
    
    public static boolean J() {
        return w().exists();
    }
    
    public static Boolean K() {
        boolean b = true;
        final int int1 = App.aq.getSharedPreferences(al5.z[40], 0).getInt(al5.z[41], -1);
        if (int1 == -1) {
            return null;
        }
        if (int1 != (b ? 1 : 0)) {
            b = false;
        }
        return b;
    }
    
    public static boolean L() {
        try {
            if (!C().exists()) {
                return true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    public static String M() {
        final String g = G();
        if (g != null) {
            return d(g);
        }
        return null;
    }
    
    static String N() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/al5.a:Z
        //     3: ifeq            17
        //     6: getstatic       com/whatsapp/al5.m:Ljava/lang/String;
        //     9: astore          13
        //    11: aload           13
        //    13: areturn        
        //    14: astore_0       
        //    15: aload_0        
        //    16: athrow         
        //    17: getstatic       android/os/Build.MANUFACTURER:Ljava/lang/String;
        //    20: ifnonnull       128
        //    23: ldc_w           ""
        //    26: astore_2       
        //    27: getstatic       android/os/Build$VERSION.RELEASE:Ljava/lang/String;
        //    30: ifnonnull       138
        //    33: ldc_w           ""
        //    36: astore          4
        //    38: getstatic       android/os/Build.DISPLAY:Ljava/lang/String;
        //    41: ifnonnull       151
        //    44: ldc_w           ""
        //    47: astore          6
        //    49: getstatic       android/os/Build.MODEL:Ljava/lang/String;
        //    52: ifnonnull       164
        //    55: ldc_w           ""
        //    58: astore          8
        //    60: invokestatic    com/whatsapp/a8q.a:()Ljava/lang/String;
        //    63: astore          9
        //    65: aload           9
        //    67: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //    70: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //    73: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //    76: sipush          138
        //    79: aaload         
        //    80: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    83: ifeq            172
        //    86: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //    89: bipush          125
        //    91: aaload         
        //    92: astore          11
        //    94: new             Ljava/lang/StringBuilder;
        //    97: dup            
        //    98: invokespecial   java/lang/StringBuilder.<init>:()V
        //   101: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   104: sipush          164
        //   107: aaload         
        //   108: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   111: aload           11
        //   113: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   116: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   119: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   122: aload           11
        //   124: areturn        
        //   125: astore_1       
        //   126: aload_1        
        //   127: athrow         
        //   128: getstatic       android/os/Build.MANUFACTURER:Ljava/lang/String;
        //   131: astore_2       
        //   132: goto            27
        //   135: astore_3       
        //   136: aload_3        
        //   137: athrow         
        //   138: getstatic       android/os/Build$VERSION.RELEASE:Ljava/lang/String;
        //   141: astore          4
        //   143: goto            38
        //   146: astore          5
        //   148: aload           5
        //   150: athrow         
        //   151: getstatic       android/os/Build.DISPLAY:Ljava/lang/String;
        //   154: astore          6
        //   156: goto            49
        //   159: astore          7
        //   161: aload           7
        //   163: athrow         
        //   164: getstatic       android/os/Build.MODEL:Ljava/lang/String;
        //   167: astore          8
        //   169: goto            60
        //   172: aload_2        
        //   173: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //   176: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   179: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   182: sipush          134
        //   185: aaload         
        //   186: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   189: ifeq            203
        //   192: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   195: bipush          115
        //   197: aaload         
        //   198: astore          11
        //   200: goto            94
        //   203: aload           4
        //   205: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //   208: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   211: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   214: sipush          156
        //   217: aaload         
        //   218: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   221: ifeq            235
        //   224: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   227: bipush          119
        //   229: aaload         
        //   230: astore          11
        //   232: goto            94
        //   235: aload           6
        //   237: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //   240: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   243: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   246: sipush          171
        //   249: aaload         
        //   250: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   253: ifeq            268
        //   256: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   259: sipush          146
        //   262: aaload         
        //   263: astore          11
        //   265: goto            94
        //   268: aload           8
        //   270: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //   273: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   276: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   279: sipush          150
        //   282: aaload         
        //   283: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   286: ifeq            301
        //   289: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   292: sipush          147
        //   295: aaload         
        //   296: astore          11
        //   298: goto            94
        //   301: aload           9
        //   303: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //   306: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   309: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   312: sipush          137
        //   315: aaload         
        //   316: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   319: ifeq            334
        //   322: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   325: sipush          148
        //   328: aaload         
        //   329: astore          11
        //   331: goto            94
        //   334: aload           6
        //   336: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   339: bipush          120
        //   341: aaload         
        //   342: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   345: ifeq            360
        //   348: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   351: sipush          153
        //   354: aaload         
        //   355: astore          11
        //   357: goto            94
        //   360: aload_2        
        //   361: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   364: sipush          145
        //   367: aaload         
        //   368: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   371: ifeq            385
        //   374: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   377: bipush          116
        //   379: aaload         
        //   380: astore          11
        //   382: goto            94
        //   385: aload           4
        //   387: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   390: sipush          161
        //   393: aaload         
        //   394: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   397: ifeq            412
        //   400: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   403: sipush          139
        //   406: aaload         
        //   407: astore          11
        //   409: goto            94
        //   412: aload           4
        //   414: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   417: bipush          124
        //   419: aaload         
        //   420: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   423: ifne            445
        //   426: aload           6
        //   428: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   431: sipush          144
        //   434: aaload         
        //   435: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   438: istore          12
        //   440: iload           12
        //   442: ifeq            461
        //   445: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   448: bipush          109
        //   450: aaload         
        //   451: astore          11
        //   453: goto            94
        //   456: astore          10
        //   458: aload           10
        //   460: athrow         
        //   461: aload           4
        //   463: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   466: sipush          141
        //   469: aaload         
        //   470: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   473: ifeq            488
        //   476: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   479: sipush          170
        //   482: aaload         
        //   483: astore          11
        //   485: goto            94
        //   488: aload           6
        //   490: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   493: bipush          121
        //   495: aaload         
        //   496: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   499: ifeq            513
        //   502: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   505: bipush          118
        //   507: aaload         
        //   508: astore          11
        //   510: goto            94
        //   513: aload           6
        //   515: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   518: sipush          169
        //   521: aaload         
        //   522: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   525: ifeq            539
        //   528: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   531: bipush          108
        //   533: aaload         
        //   534: astore          11
        //   536: goto            94
        //   539: aload           6
        //   541: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   544: bipush          106
        //   546: aaload         
        //   547: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   550: ifeq            564
        //   553: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   556: bipush          126
        //   558: aaload         
        //   559: astore          11
        //   561: goto            94
        //   564: aload           6
        //   566: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   569: bipush          114
        //   571: aaload         
        //   572: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   575: ifeq            590
        //   578: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   581: sipush          140
        //   584: aaload         
        //   585: astore          11
        //   587: goto            94
        //   590: aload           6
        //   592: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   595: sipush          162
        //   598: aaload         
        //   599: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   602: ifeq            617
        //   605: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   608: sipush          128
        //   611: aaload         
        //   612: astore          11
        //   614: goto            94
        //   617: aload           6
        //   619: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   622: sipush          149
        //   625: aaload         
        //   626: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   629: ifeq            644
        //   632: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   635: sipush          142
        //   638: aaload         
        //   639: astore          11
        //   641: goto            94
        //   644: aload           6
        //   646: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   649: sipush          132
        //   652: aaload         
        //   653: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   656: ifeq            670
        //   659: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   662: bipush          107
        //   664: aaload         
        //   665: astore          11
        //   667: goto            94
        //   670: aload           6
        //   672: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   675: sipush          135
        //   678: aaload         
        //   679: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   682: ifeq            696
        //   685: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   688: bipush          110
        //   690: aaload         
        //   691: astore          11
        //   693: goto            94
        //   696: aload           6
        //   698: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   701: sipush          143
        //   704: aaload         
        //   705: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   708: ifeq            722
        //   711: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   714: bipush          112
        //   716: aaload         
        //   717: astore          11
        //   719: goto            94
        //   722: aload           6
        //   724: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   727: sipush          133
        //   730: aaload         
        //   731: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   734: ifeq            749
        //   737: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   740: sipush          159
        //   743: aaload         
        //   744: astore          11
        //   746: goto            94
        //   749: aload           8
        //   751: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   754: sipush          163
        //   757: aaload         
        //   758: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   761: ifeq            776
        //   764: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   767: sipush          131
        //   770: aaload         
        //   771: astore          11
        //   773: goto            94
        //   776: aload           6
        //   778: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   781: sipush          165
        //   784: aaload         
        //   785: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   788: ifeq            802
        //   791: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   794: bipush          123
        //   796: aaload         
        //   797: astore          11
        //   799: goto            94
        //   802: aload           6
        //   804: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   807: sipush          129
        //   810: aaload         
        //   811: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   814: ifeq            829
        //   817: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   820: sipush          152
        //   823: aaload         
        //   824: astore          11
        //   826: goto            94
        //   829: aload           6
        //   831: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   834: sipush          173
        //   837: aaload         
        //   838: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   841: ifeq            856
        //   844: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   847: sipush          136
        //   850: aaload         
        //   851: astore          11
        //   853: goto            94
        //   856: aload           6
        //   858: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   861: sipush          174
        //   864: aaload         
        //   865: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   868: ifeq            883
        //   871: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   874: sipush          151
        //   877: aaload         
        //   878: astore          11
        //   880: goto            94
        //   883: aload           6
        //   885: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   888: bipush          122
        //   890: aaload         
        //   891: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   894: ifeq            908
        //   897: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   900: bipush          105
        //   902: aaload         
        //   903: astore          11
        //   905: goto            94
        //   908: aload           6
        //   910: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   913: sipush          157
        //   916: aaload         
        //   917: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   920: ifeq            934
        //   923: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   926: bipush          117
        //   928: aaload         
        //   929: astore          11
        //   931: goto            94
        //   934: aload           6
        //   936: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   939: bipush          113
        //   941: aaload         
        //   942: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   945: ifeq            960
        //   948: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   951: sipush          154
        //   954: aaload         
        //   955: astore          11
        //   957: goto            94
        //   960: aload           9
        //   962: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   965: sipush          160
        //   968: aaload         
        //   969: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   972: ifeq            987
        //   975: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   978: sipush          166
        //   981: aaload         
        //   982: astore          11
        //   984: goto            94
        //   987: aload           9
        //   989: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   992: sipush          155
        //   995: aaload         
        //   996: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   999: ifeq            1013
        //  1002: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //  1005: bipush          127
        //  1007: aaload         
        //  1008: astore          11
        //  1010: goto            94
        //  1013: aload           9
        //  1015: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //  1018: sipush          130
        //  1021: aaload         
        //  1022: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //  1025: ifeq            1040
        //  1028: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //  1031: sipush          158
        //  1034: aaload         
        //  1035: astore          11
        //  1037: goto            94
        //  1040: aload           9
        //  1042: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //  1045: sipush          167
        //  1048: aaload         
        //  1049: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //  1052: ifeq            1067
        //  1055: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //  1058: sipush          168
        //  1061: aaload         
        //  1062: astore          11
        //  1064: goto            94
        //  1067: aload           6
        //  1069: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //  1072: sipush          172
        //  1075: aaload         
        //  1076: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //  1079: ifeq            1093
        //  1082: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //  1085: bipush          111
        //  1087: aaload         
        //  1088: astore          11
        //  1090: goto            94
        //  1093: aconst_null    
        //  1094: astore          11
        //  1096: goto            94
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      11     14     17     Ljava/lang/NullPointerException;
        //  17     23     125    128    Ljava/lang/NullPointerException;
        //  27     33     135    138    Ljava/lang/NullPointerException;
        //  38     44     146    151    Ljava/lang/NullPointerException;
        //  49     55     159    164    Ljava/lang/NullPointerException;
        //  412    440    456    461    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 463, Size: 463
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
    
    static boolean O() {
        try {
            if (al5.a) {
                return al5.u;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return Debug.isDebuggerConnected();
    }
    
    public static byte[] P() {
        return Q();
    }
    
    private static byte[] Q() {
        return a(16);
    }
    
    public static String R() {
        return App.aq.getSharedPreferences(al5.z[9], 0).getString(al5.z[10], (String)null);
    }
    
    public static s6 a(final InputStream inputStream) {
        final boolean i = App.I;
        final byte[] array = new byte[al5.i.length];
        final byte[] array2 = new byte[32];
        final byte[] array3 = new byte[16];
        final byte[] array4 = new byte[16];
        final byte[] array5 = new byte[1 + array.length + array2.length + array3.length + array4.length];
        inputStream.read(array5);
        System.arraycopy(array5, 0, array, 0, al5.i.length);
        final int n = 0 + al5.i.length;
        try {
            if (!Arrays.equals(array, al5.d)) {
                try {
                    if (!Arrays.equals(array, al5.g)) {
                        throw new atx((he)null);
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
            }
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
        final int n2 = n + 1;
        final String value = String.valueOf(array5[n]);
        final byte[][] array6 = { array2, array3, array4 };
        final int length = array6.length;
        int n3 = n2;
        int j = 0;
        while (j < length) {
            final byte[] array7 = array6[j];
            System.arraycopy(array5, n3, array7, 0, array7.length);
            n3 += array7.length;
            ++j;
            if (i) {
                break;
            }
        }
        return new s6(array, value, array2, array3, array4);
    }
    
    public static String a(final Application application) {
        while (true) {
            final boolean i = App.I;
            InputStream inputStream = null;
            while (true) {
                int n3 = 0;
                Label_0234: {
                    try {
                        final ZipFile zipFile = new ZipFile(application.getPackageCodePath());
                        inputStream = zipFile.getInputStream(zipFile.getEntry(al5.z[37]));
                        final MessageDigest instance = MessageDigest.getInstance(al5.z[38]);
                        final byte[] array = new byte[8192];
                        do {
                            final int read = inputStream.read(array);
                            if (read <= 0) {
                                break;
                            }
                            instance.update(array, 0, read);
                        } while (!i);
                        final byte[] digest = instance.digest();
                        final StringBuilder sb = new StringBuilder();
                        final int length = digest.length;
                        final int n = 0;
                        if (n < length) {
                            int n2 = digest[n];
                            if (n2 < 0) {
                                n2 += 256;
                            }
                            sb.append(Character.forDigit(n2 >> 4, 16));
                            sb.append(Character.forDigit(n2 % 16, 16));
                            n3 = n + 1;
                            if (!i) {
                                break Label_0234;
                            }
                        }
                        return sb.toString();
                    }
                    catch (Exception ex) {
                        Log.e(al5.z[36] + ex.toString());
                        b8.a(inputStream);
                        return al5.z[39];
                    }
                    finally {
                        b8.a(inputStream);
                    }
                }
                final int n = n3;
                continue;
            }
        }
    }
    
    public static String a(final Context context) {
        final boolean i = App.I;
        final Signature[] a = ac.a(context);
        Label_0022: {
            if (a == null) {
                break Label_0022;
            }
            try {
                if (a.length == 0) {
                    return null;
                }
            }
            catch (NoSuchAlgorithmException ex) {
                try {
                    throw ex;
                }
                catch (NoSuchAlgorithmException ex2) {
                    throw ex2;
                }
            }
        }
        try {
            final MessageDigest instance = MessageDigest.getInstance(al5.z[95]);
            instance.reset();
            final int length = a.length;
            int j = 0;
            while (j < length) {
                instance.update(a[j].toByteArray());
                ++j;
                if (i) {
                    break;
                }
            }
            return Base64.encodeToString(instance.digest(), 2);
        }
        catch (NoSuchAlgorithmException ex3) {
            Log.b(ex3);
            return null;
        }
    }
    
    public static SecretKey a(final byte[] array, final byte[] array2, final int n, final int n2) {
        final boolean i = App.I;
        final char[] array3 = new char[array.length];
        int j = 0;
        while (j < array.length) {
            array3[j] = (char)array[j];
            ++j;
            if (i) {
                break;
            }
        }
        final PBEKeySpec pbeKeySpec = new PBEKeySpec(array3, array2, n, n2);
        SecretKeyFactory secretKeyFactory;
        try {
            final SecretKeyFactory instance;
            secretKeyFactory = (instance = SecretKeyFactory.getInstance(al5.z[7]));
            final PBEKeySpec pbeKeySpec2 = pbeKeySpec;
            final SecretKey generateSecret = instance.generateSecret(pbeKeySpec2);
            return generateSecret;
        }
        catch (NoSuchAlgorithmException ex) {
            throw new AssertionError((Object)ex);
        }
        try {
            final SecretKeyFactory instance = secretKeyFactory;
            final PBEKeySpec pbeKeySpec2 = pbeKeySpec;
            final SecretKey generateSecret2;
            final SecretKey generateSecret = generateSecret2 = instance.generateSecret(pbeKeySpec2);
            return generateSecret2;
        }
        catch (InvalidKeySpecException ex2) {
            throw new AssertionError((Object)ex2);
        }
    }
    
    public static void a() {
        w().delete();
        b().delete();
    }
    
    public static void a(final OutputStream outputStream, final f3 f3) {
        int i = 0;
        final boolean j = App.I;
        final byte[][] array = { al5.i, { Byte.parseByte(f3.c.e) }, f3.c.a, f3.c.c, f3.c.d };
        while (i < array.length) {
            outputStream.write(array[i]);
            ++i;
            if (j) {
                break;
            }
        }
    }
    
    private static void a(final String s) {
        Log.i(al5.z[76] + s);
        final SharedPreferences$Editor edit = App.aq.getSharedPreferences(al5.z[77], 0).edit();
        try {
            edit.putString(al5.z[78], s);
            if (!edit.commit()) {
                Log.w(al5.z[79]);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    private static void a(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //     3: bipush          73
        //     5: aaload         
        //     6: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     9: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    12: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //    15: bipush          74
        //    17: aaload         
        //    18: iconst_0       
        //    19: invokevirtual   com/whatsapp/App.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //    22: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //    27: astore_1       
        //    28: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //    31: bipush          72
        //    33: aaload         
        //    34: astore_3       
        //    35: iconst_0       
        //    36: istore          4
        //    38: iload_0        
        //    39: ifeq            45
        //    42: iconst_1       
        //    43: istore          4
        //    45: aload_1        
        //    46: aload_3        
        //    47: iload           4
        //    49: invokeinterface android/content/SharedPreferences$Editor.putInt:(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
        //    54: pop            
        //    55: aload_1        
        //    56: invokeinterface android/content/SharedPreferences$Editor.commit:()Z
        //    61: ifne            73
        //    64: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //    67: bipush          71
        //    69: aaload         
        //    70: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    73: return         
        //    74: astore_2       
        //    75: aload_2        
        //    76: athrow         
        //    77: astore          5
        //    79: aload           5
        //    81: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  28     35     74     77     Ljava/lang/NullPointerException;
        //  45     73     77     82     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0045:
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
    
    private static void a(final byte[] array, final File file) {
        ObjectOutputStream objectOutputStream;
        try {
            final ObjectOutputStream objectOutputStream2;
            objectOutputStream = (objectOutputStream2 = new ObjectOutputStream(new FileOutputStream(file)));
            final byte[] array2 = array;
            objectOutputStream2.writeObject(array2);
            final ObjectOutputStream objectOutputStream3 = objectOutputStream;
            b8.a(objectOutputStream3);
            return;
        }
        finally {
            final Object o2;
            final Object o = o2;
            objectOutputStream = null;
        }
        while (true) {
            try {
                final ObjectOutputStream objectOutputStream2 = objectOutputStream;
                final byte[] array2 = array;
                objectOutputStream2.writeObject(array2);
                final ObjectOutputStream objectOutputStream3 = objectOutputStream;
                b8.a(objectOutputStream3);
                return;
                b8.a(objectOutputStream);
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    private static boolean a(final Application p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: getstatic       com/whatsapp/al5.a:Z
        //     7: ifeq            21
        //    10: getstatic       com/whatsapp/al5.n:Z
        //    13: istore          5
        //    15: iload           5
        //    17: ireturn        
        //    18: astore_3       
        //    19: aload_3        
        //    20: athrow         
        //    21: aload_0        
        //    22: invokevirtual   android/app/Application.getPackageName:()Ljava/lang/String;
        //    25: astore          4
        //    27: iconst_0       
        //    28: istore          5
        //    30: aload           4
        //    32: ifnull          15
        //    35: aload           4
        //    37: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //    40: bipush          50
        //    42: aaload         
        //    43: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    46: istore          7
        //    48: iconst_0       
        //    49: istore          5
        //    51: iload           7
        //    53: ifeq            15
        //    56: aload_0        
        //    57: invokevirtual   android/app/Application.getPackageManager:()Landroid/content/pm/PackageManager;
        //    60: astore          8
        //    62: iconst_0       
        //    63: istore          5
        //    65: aload           8
        //    67: ifnull          15
        //    70: aload           8
        //    72: aload           4
        //    74: bipush          64
        //    76: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //    79: astore          10
        //    81: iconst_0       
        //    82: istore          5
        //    84: aload           10
        //    86: ifnull          15
        //    89: aload           10
        //    91: getfield        android/content/pm/PackageInfo.signatures:[Landroid/content/pm/Signature;
        //    94: astore          12
        //    96: iconst_0       
        //    97: istore          5
        //    99: aload           12
        //   101: ifnull          15
        //   104: aload           10
        //   106: getfield        android/content/pm/PackageInfo.signatures:[Landroid/content/pm/Signature;
        //   109: astore          13
        //   111: aload           13
        //   113: arraylength    
        //   114: istore          14
        //   116: iconst_0       
        //   117: istore          15
        //   119: iconst_0       
        //   120: istore          5
        //   122: iload           15
        //   124: iload           14
        //   126: if_icmpge       15
        //   129: aload           13
        //   131: iload           15
        //   133: aaload         
        //   134: astore          16
        //   136: aload           16
        //   138: ifnull          174
        //   141: aload           16
        //   143: invokevirtual   android/content/pm/Signature.toCharsString:()Ljava/lang/String;
        //   146: aload_1        
        //   147: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   150: istore          18
        //   152: iload           18
        //   154: ifeq            174
        //   157: iconst_1       
        //   158: ireturn        
        //   159: astore          6
        //   161: aload           6
        //   163: athrow         
        //   164: astore          11
        //   166: aload           11
        //   168: athrow         
        //   169: astore          17
        //   171: aload           17
        //   173: athrow         
        //   174: iinc            15, 1
        //   177: iload_2        
        //   178: ifeq            119
        //   181: iconst_0       
        //   182: ireturn        
        //   183: astore          9
        //   185: iconst_0       
        //   186: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  4      15     18     21     Landroid/content/pm/PackageManager$NameNotFoundException;
        //  35     48     159    164    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  70     81     183    187    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  89     96     164    169    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  141    152    169    174    Landroid/content/pm/PackageManager$NameNotFoundException;
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
    
    private static boolean a(final File file, final byte[] array, final String s, final byte[] array2) {
        final boolean i = App.I;
        try {
            final byte[] j = i();
            final byte[] q = Q();
            final SecretKeySpec secretKeySpec = new SecretKeySpec(a(s, j), al5.z[97]);
            final Cipher instance = Cipher.getInstance(al5.z[98]);
            instance.init(1, secretKeySpec, new IvParameterSpec(q));
            final byte[] doFinal = instance.doFinal(array);
            final byte[] array3 = new byte[array2.length + j.length + q.length + doFinal.length];
            final byte[][] array4 = { array2, j, q, doFinal };
            final int length = array4.length;
            int k = 0;
            int n = 0;
            while (k < length) {
                final byte[] array5 = array4[k];
                System.arraycopy(array5, 0, array3, n, array5.length);
                n += array5.length;
                ++k;
                if (i) {
                    break;
                }
            }
            a(array3, file);
            return Arrays.equals(array3, a(file));
        }
        catch (Exception ex) {
            Log.b(al5.z[99] + file.toString(), ex);
            return false;
        }
    }
    
    public static boolean a(final String s, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        final boolean i = App.I;
        final File file = new File(App.aq.getFilesDir(), al5.z[70]);
        final byte[] array6 = new byte[16];
        final byte[] array7 = { Byte.parseByte(s) };
        final byte[] array8 = new byte[al5.i.length + array7.length + array.length + array4.length + array3.length + array6.length + array2.length];
        final byte[][] array9 = { al5.i, array7, array, array4, array3, array6, array2 };
        final int length = array9.length;
        int j = 0;
        int n = 0;
        while (j < length) {
            final byte[] array10 = array9[j];
            System.arraycopy(array10, 0, array8, n, array10.length);
            n += array10.length;
            ++j;
            if (i) {
                break;
            }
        }
        try {
            a(array8, file);
            final byte[] a = a(file);
            n();
            return Arrays.equals(array8, a);
        }
        catch (Exception ex) {
            Log.e(al5.z[69] + ex.toString());
            return false;
        }
    }
    
    public static boolean a(final byte[] array, final String s) {
        final File w = w();
        final boolean a = a(w, array, a6c.r + s + G(), al5.l);
        final File d = D();
        try {
            if (!d.exists() && !d.mkdirs()) {
                return a;
            }
        }
        catch (Exception ex) {
            try {
                throw ex;
            }
            catch (Exception ex2) {
                throw ex2;
            }
        }
        final File b = b();
        final byte[] a2 = a(w);
        try {
            a(a2, b);
            Log.i(al5.z[101] + Arrays.equals(a2, a(b)));
            return a;
        }
        catch (Exception ex3) {
            Log.e(al5.z[100]);
            return a;
        }
    }
    
    private static byte[] a(final int n) {
        try {
            final byte[] array = new byte[n];
            SecureRandom.getInstance(al5.z[51]).nextBytes(array);
            return array;
        }
        catch (NoSuchAlgorithmException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    private static byte[] a(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   java/io/File.exists:()Z
        //     4: ifeq            105
        //     7: aload_0        
        //     8: invokevirtual   java/io/File.length:()J
        //    11: lstore_2       
        //    12: lload_2        
        //    13: lconst_0       
        //    14: lcmp           
        //    15: ifle            105
        //    18: new             Ljava/io/ObjectInputStream;
        //    21: dup            
        //    22: new             Ljava/io/FileInputStream;
        //    25: dup            
        //    26: aload_0        
        //    27: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    30: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //    33: astore          4
        //    35: aload           4
        //    37: invokevirtual   java/io/ObjectInputStream.readObject:()Ljava/lang/Object;
        //    40: checkcast       [B
        //    43: checkcast       [B
        //    46: astore          10
        //    48: aload           4
        //    50: ifnull          58
        //    53: aload           4
        //    55: invokevirtual   java/io/ObjectInputStream.close:()V
        //    58: aload           10
        //    60: areturn        
        //    61: astore_1       
        //    62: aload_1        
        //    63: athrow         
        //    64: astore          12
        //    66: aload           12
        //    68: athrow         
        //    69: astore          11
        //    71: aload           11
        //    73: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //    76: aload           10
        //    78: areturn        
        //    79: astore          5
        //    81: aconst_null    
        //    82: astore          4
        //    84: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //    87: bipush          84
        //    89: aaload         
        //    90: aload           5
        //    92: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    95: aload           4
        //    97: ifnull          105
        //   100: aload           4
        //   102: invokevirtual   java/io/ObjectInputStream.close:()V
        //   105: aconst_null    
        //   106: areturn        
        //   107: astore          9
        //   109: aload           9
        //   111: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   114: goto            105
        //   117: astore          6
        //   119: aconst_null    
        //   120: astore          4
        //   122: aload           4
        //   124: ifnull          132
        //   127: aload           4
        //   129: invokevirtual   java/io/ObjectInputStream.close:()V
        //   132: aload           6
        //   134: athrow         
        //   135: astore          8
        //   137: aload           8
        //   139: athrow         
        //   140: astore          7
        //   142: aload           7
        //   144: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   147: goto            132
        //   150: astore          6
        //   152: goto            122
        //   155: astore          5
        //   157: goto            84
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      12     61     64     Ljava/io/IOException;
        //  18     35     79     84     Ljava/lang/Exception;
        //  18     35     117    122    Any
        //  35     48     155    160    Ljava/lang/Exception;
        //  35     48     150    155    Any
        //  53     58     64     69     Ljava/lang/NullPointerException;
        //  53     58     69     79     Ljava/io/IOException;
        //  66     69     69     79     Ljava/io/IOException;
        //  84     95     150    155    Any
        //  100    105    107    117    Ljava/io/IOException;
        //  127    132    135    140    Ljava/lang/NullPointerException;
        //  127    132    140    150    Ljava/io/IOException;
        //  137    140    140    150    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 78, Size: 78
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
    
    private static byte[] a(final File file, final String s, final byte[] array) {
        final byte[] a = a(file);
        byte[] doFinal = null;
        if (a != null) {
            Label_0092: {
                try {
                    if (a.length < 20 + (16 + (4 + array.length))) {
                        throw new InvalidParameterException(file.toString() + al5.z[104]);
                    }
                    break Label_0092;
                }
                catch (Exception ex) {
                    try {
                        throw ex;
                    }
                    catch (Exception ex2) {
                        final File file2 = file;
                        file2.delete();
                        final atx atx = (atx)ex2;
                        final boolean b = atx instanceof atx;
                        if (b) {
                            final atx atx2 = (atx)ex2;
                            throw atx2;
                        }
                        throw new RuntimeException(ex2);
                    }
                }
                try {
                    final File file2 = file;
                    file2.delete();
                    final Exception ex2;
                    final atx atx = (atx)ex2;
                    final boolean b = atx instanceof atx;
                    if (b) {
                        final atx atx2 = (atx)ex2;
                        throw atx2;
                    }
                    throw new RuntimeException(ex2);
                }
                catch (Exception ex4) {}
            }
            final byte[] array2 = new byte[array.length];
            System.arraycopy(a, 0, array2, 0, array.length);
            final int n = array.length + 0;
            try {
                if (!Arrays.equals(array2, array)) {
                    throw new atx((he)null);
                }
            }
            catch (Exception ex3) {
                throw ex3;
            }
            final byte[] array3 = new byte[4];
            System.arraycopy(a, n, array3, 0, 4);
            final int n2 = n + 4;
            final byte[] array4 = new byte[16];
            System.arraycopy(a, n2, array4, 0, 16);
            final int n3 = n2 + 16;
            final SecretKeySpec secretKeySpec = new SecretKeySpec(a(s, array3), al5.z[103]);
            final Cipher instance = Cipher.getInstance(al5.z[102]);
            instance.init(2, secretKeySpec, new IvParameterSpec(array4));
            doFinal = instance.doFinal(a, n3, a.length - n3);
            return doFinal;
        }
        return doFinal;
    }
    
    private static byte[] a(final String s, final byte[] array) {
        return new SecretKeySpec(a(s.getBytes(), array, 16, 128).getEncoded(), al5.z[178]).getEncoded();
    }
    
    public static byte[] a(final byte[] array) {
        return a(array, al5.i, false);
    }
    
    public static byte[] a(final byte[] p0, final byte[] p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_3       
        //     2: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //     5: iconst_1       
        //     6: aaload         
        //     7: invokestatic    java/security/MessageDigest.getInstance:(Ljava/lang/String;)Ljava/security/MessageDigest;
        //    10: astore          15
        //    12: aload           15
        //    14: astore          5
        //    16: aload           5
        //    18: ifnonnull       73
        //    21: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //    24: iconst_2       
        //    25: aaload         
        //    26: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    29: aconst_null    
        //    30: areturn        
        //    31: astore          4
        //    33: new             Ljava/lang/StringBuilder;
        //    36: dup            
        //    37: invokespecial   java/lang/StringBuilder.<init>:()V
        //    40: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //    43: iconst_3       
        //    44: aaload         
        //    45: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    48: aload           4
        //    50: invokevirtual   java/security/NoSuchAlgorithmException.toString:()Ljava/lang/String;
        //    53: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    56: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    59: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    62: aconst_null    
        //    63: astore          5
        //    65: goto            16
        //    68: astore          14
        //    70: aload           14
        //    72: athrow         
        //    73: ldc_w           ""
        //    76: astore          6
        //    78: iload_2        
        //    79: ifeq            94
        //    82: aload_1        
        //    83: getstatic       com/whatsapp/al5.g:[B
        //    86: invokestatic    java/util/Arrays.equals:([B[B)Z
        //    89: invokestatic    com/whatsapp/al5.b:(Z)Ljava/lang/String;
        //    92: astore          6
        //    94: aload           6
        //    96: ifnull          239
        //    99: aload           6
        //   101: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   104: iconst_0       
        //   105: aaload         
        //   106: invokevirtual   java/lang/String.getBytes:(Ljava/lang/String;)[B
        //   109: astore          12
        //   111: aload           12
        //   113: astore          8
        //   115: aload           8
        //   117: arraylength    
        //   118: istore          7
        //   120: iload           7
        //   122: aload_0        
        //   123: arraylength    
        //   124: iadd           
        //   125: newarray        B
        //   127: astore          9
        //   129: iload           7
        //   131: ifle            233
        //   134: aload           8
        //   136: iconst_0       
        //   137: aload           9
        //   139: iconst_0       
        //   140: aload           8
        //   142: arraylength    
        //   143: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   146: iload           7
        //   148: iconst_0       
        //   149: iadd           
        //   150: istore          10
        //   152: aload_0        
        //   153: iconst_0       
        //   154: aload           9
        //   156: iload           10
        //   158: aload_0        
        //   159: arraylength    
        //   160: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   163: aload           5
        //   165: invokevirtual   java/security/MessageDigest.reset:()V
        //   168: aload           5
        //   170: aload           9
        //   172: invokevirtual   java/security/MessageDigest.update:([B)V
        //   175: aload           5
        //   177: invokevirtual   java/security/MessageDigest.digest:()[B
        //   180: areturn        
        //   181: astore          11
        //   183: new             Ljava/lang/StringBuilder;
        //   186: dup            
        //   187: invokespecial   java/lang/StringBuilder.<init>:()V
        //   190: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   193: iconst_4       
        //   194: aaload         
        //   195: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   198: aload           11
        //   200: invokevirtual   java/io/UnsupportedEncodingException.toString:()Ljava/lang/String;
        //   203: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   206: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   209: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   212: aload_3        
        //   213: astore          8
        //   215: iconst_0       
        //   216: istore          7
        //   218: goto            120
        //   221: astore          13
        //   223: aload           8
        //   225: astore_3       
        //   226: aload           13
        //   228: astore          11
        //   230: goto            183
        //   233: iconst_0       
        //   234: istore          10
        //   236: goto            152
        //   239: iconst_0       
        //   240: istore          7
        //   242: aconst_null    
        //   243: astore          8
        //   245: goto            120
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                    
        //  -----  -----  -----  -----  ----------------------------------------
        //  2      12     31     68     Ljava/security/NoSuchAlgorithmException;
        //  21     29     68     73     Ljava/security/NoSuchAlgorithmException;
        //  99     111    181    183    Ljava/io/UnsupportedEncodingException;
        //  115    120    221    233    Ljava/io/UnsupportedEncodingException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0120:
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
    
    public static byte[] a(final byte[] array, final byte[][] array2) {
        final boolean i = App.I;
        try {
            final Mac instance = Mac.getInstance(al5.z[14]);
            instance.init(new SecretKeySpec(array, al5.z[15]));
            final int length = array2.length;
            int j = 0;
            while (j < length) {
                instance.update(array2[j]);
                ++j;
                if (i) {
                    break;
                }
            }
            return instance.doFinal();
        }
        catch (GeneralSecurityException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static s6 b(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_1       
        //     2: aload_0        
        //     3: invokevirtual   java/io/File.exists:()Z
        //     6: ifne            23
        //     9: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //    12: bipush          62
        //    14: aaload         
        //    15: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    18: aload_1        
        //    19: areturn        
        //    20: astore_2       
        //    21: aload_2        
        //    22: athrow         
        //    23: new             Ljava/io/FileInputStream;
        //    26: dup            
        //    27: aload_0        
        //    28: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    31: astore_3       
        //    32: aload_3        
        //    33: invokestatic    com/whatsapp/al5.a:(Ljava/io/InputStream;)Lcom/whatsapp/s6;
        //    36: astore          14
        //    38: aload           14
        //    40: astore_1       
        //    41: aload_3        
        //    42: ifnull          18
        //    45: aload_3        
        //    46: invokevirtual   java/io/FileInputStream.close:()V
        //    49: aload_1        
        //    50: areturn        
        //    51: astore          15
        //    53: new             Ljava/lang/StringBuilder;
        //    56: dup            
        //    57: invokespecial   java/lang/StringBuilder.<init>:()V
        //    60: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //    63: bipush          63
        //    65: aaload         
        //    66: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    69: aload           15
        //    71: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //    74: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    77: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    80: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    83: aload_1        
        //    84: areturn        
        //    85: astore          18
        //    87: aconst_null    
        //    88: astore_3       
        //    89: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //    92: bipush          58
        //    94: aaload         
        //    95: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    98: aconst_null    
        //    99: astore_1       
        //   100: aload_3        
        //   101: ifnull          18
        //   104: aload_3        
        //   105: invokevirtual   java/io/FileInputStream.close:()V
        //   108: aconst_null    
        //   109: areturn        
        //   110: astore          7
        //   112: new             Ljava/lang/StringBuilder;
        //   115: dup            
        //   116: invokespecial   java/lang/StringBuilder.<init>:()V
        //   119: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   122: bipush          60
        //   124: aaload         
        //   125: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   128: aload           7
        //   130: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //   133: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   136: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   139: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   142: aconst_null    
        //   143: areturn        
        //   144: astore          17
        //   146: aconst_null    
        //   147: astore_3       
        //   148: new             Ljava/lang/StringBuilder;
        //   151: dup            
        //   152: invokespecial   java/lang/StringBuilder.<init>:()V
        //   155: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   158: bipush          61
        //   160: aaload         
        //   161: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   164: aload_0        
        //   165: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   168: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   171: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   174: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   177: aconst_null    
        //   178: astore_1       
        //   179: aload_3        
        //   180: ifnull          18
        //   183: aload_3        
        //   184: invokevirtual   java/io/FileInputStream.close:()V
        //   187: aconst_null    
        //   188: areturn        
        //   189: astore          9
        //   191: new             Ljava/lang/StringBuilder;
        //   194: dup            
        //   195: invokespecial   java/lang/StringBuilder.<init>:()V
        //   198: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   201: bipush          64
        //   203: aaload         
        //   204: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   207: aload           9
        //   209: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //   212: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   215: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   218: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   221: aconst_null    
        //   222: areturn        
        //   223: astore          12
        //   225: aconst_null    
        //   226: astore          11
        //   228: new             Ljava/lang/StringBuilder;
        //   231: dup            
        //   232: invokespecial   java/lang/StringBuilder.<init>:()V
        //   235: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   238: bipush          65
        //   240: aaload         
        //   241: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   244: aload           12
        //   246: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   249: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   252: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   255: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   258: aconst_null    
        //   259: astore_1       
        //   260: aload           11
        //   262: ifnull          18
        //   265: aload           11
        //   267: invokevirtual   java/io/FileInputStream.close:()V
        //   270: aconst_null    
        //   271: areturn        
        //   272: astore          13
        //   274: new             Ljava/lang/StringBuilder;
        //   277: dup            
        //   278: invokespecial   java/lang/StringBuilder.<init>:()V
        //   281: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   284: bipush          59
        //   286: aaload         
        //   287: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   290: aload           13
        //   292: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //   295: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   298: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   301: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   304: aconst_null    
        //   305: areturn        
        //   306: astore          16
        //   308: aconst_null    
        //   309: astore_3       
        //   310: aload           16
        //   312: astore          5
        //   314: aload_3        
        //   315: ifnull          322
        //   318: aload_3        
        //   319: invokevirtual   java/io/FileInputStream.close:()V
        //   322: aload           5
        //   324: athrow         
        //   325: astore          6
        //   327: new             Ljava/lang/StringBuilder;
        //   330: dup            
        //   331: invokespecial   java/lang/StringBuilder.<init>:()V
        //   334: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   337: bipush          66
        //   339: aaload         
        //   340: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   343: aload           6
        //   345: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //   348: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   351: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   354: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   357: goto            322
        //   360: astore          5
        //   362: goto            314
        //   365: astore          5
        //   367: aload           11
        //   369: astore_3       
        //   370: goto            314
        //   373: astore          10
        //   375: aload_3        
        //   376: astore          11
        //   378: aload           10
        //   380: astore          12
        //   382: goto            228
        //   385: astore          8
        //   387: goto            148
        //   390: astore          4
        //   392: goto            89
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  2      18     20     23     Ljava/lang/Exception;
        //  23     32     85     89     Lcom/whatsapp/atx;
        //  23     32     144    148    Ljava/io/FileNotFoundException;
        //  23     32     223    228    Ljava/io/IOException;
        //  23     32     306    314    Any
        //  32     38     390    395    Lcom/whatsapp/atx;
        //  32     38     385    390    Ljava/io/FileNotFoundException;
        //  32     38     373    385    Ljava/io/IOException;
        //  32     38     360    365    Any
        //  45     49     51     85     Ljava/lang/Exception;
        //  89     98     360    365    Any
        //  104    108    110    144    Ljava/lang/Exception;
        //  148    177    360    365    Any
        //  183    187    189    223    Ljava/lang/Exception;
        //  228    258    365    373    Any
        //  265    270    272    306    Ljava/lang/Exception;
        //  318    322    325    360    Ljava/lang/Exception;
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
    
    private static File b() {
        try {
            if (al5.a) {
                return al5.b;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return new File(D(), al5.z[96]);
    }
    
    private static String b(final boolean b) {
        final boolean i = App.I;
        final AccountManager value = AccountManager.get(App.aq.getApplicationContext());
        if (value != null) {
            final Account[] accountsByType = value.getAccountsByType(al5.z[22]);
            if (accountsByType != null) {
                final int length = accountsByType.length;
                int j = 0;
                while (j < length) {
                    final Account account = accountsByType[j];
                    Label_0085: {
                        Label_0120: {
                            try {
                                if (account.name == null) {
                                    break Label_0120;
                                }
                                if (b) {
                                    final Account account2 = account;
                                    return account2.name;
                                }
                                break Label_0085;
                            }
                            catch (NullPointerException ex) {
                                try {
                                    throw ex;
                                }
                                catch (NullPointerException ex2) {
                                    throw ex2;
                                }
                            }
                            try {
                                final Account account2 = account;
                                return account2.name;
                            }
                            catch (NullPointerException ex3) {}
                            break Label_0085;
                        }
                        ++j;
                        if (i) {
                            break;
                        }
                        continue;
                    }
                    final int index = account.name.indexOf(64);
                    if (index > 0) {
                        return account.name.substring(0, index);
                    }
                    return account.name;
                }
            }
        }
        return "";
    }
    
    public static String b(final byte[] array) {
        final boolean i = App.I;
        final StringBuilder sb = new StringBuilder();
        final int length = array.length;
        int j = 0;
        while (j < length) {
            final byte b = array[j];
            sb.append(Character.forDigit(0xF & b >>> 4, 16));
            sb.append(Character.forDigit(b & 0xF, 16));
            ++j;
            if (i) {
                break;
            }
        }
        return sb.toString();
    }
    
    static boolean b(final Application application) {
        try {
            if (al5.a) {
                return al5.n;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return a(application, B());
    }
    
    public static boolean b(final byte[] f, final String s) {
        try {
            if (a(F(), f, a6c.o + s, al5.p)) {
                App.F = f;
                return true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    public static byte[] b(final Context context) {
        final boolean i = App.I;
        InputStream inputStream = null;
        try {
            final ZipFile zipFile = new ZipFile(new ContextWrapper(context).getPackageCodePath());
            inputStream = zipFile.getInputStream(zipFile.getEntry(al5.z[54]));
            final MessageDigest instance = MessageDigest.getInstance(al5.z[57]);
            final byte[] array = new byte[8192];
            do {
                final int read = inputStream.read(array);
                if (read <= 0) {
                    break;
                }
                instance.update(array, 0, read);
            } while (!i);
            return instance.digest();
        }
        catch (Exception ex) {
            Log.e(al5.z[53] + ex.toString());
            b8.a(inputStream);
            final String[] array2 = al5.z;
            final int n = 55;
            final String s = array2[n];
            final String[] array3 = al5.z;
            final int n2 = 56;
            final String s2 = array3[n2];
            final byte[] bytes = s.getBytes(s2);
            return bytes;
        }
        finally {
            b8.a(inputStream);
        }
        try {
            final String[] array2 = al5.z;
            final int n = 55;
            final String s = array2[n];
            final String[] array3 = al5.z;
            final int n2 = 56;
            final String s2 = array3[n2];
            final byte[] bytes2;
            final byte[] bytes = bytes2 = s.getBytes(s2);
            return bytes2;
        }
        catch (UnsupportedEncodingException ex2) {
            throw new Error(ex2);
        }
    }
    
    public static byte[] b(final String s) {
        try {
            return a(w(), a6c.r + s + G(), al5.l);
        }
        catch (atx atx) {
            Log.c(al5.z[24], atx);
            return null;
        }
    }
    
    static String c(final String s) {
        final byte[] decode = Base64.decode(a6c.a, 0);
        final byte[] bytes = a(App.aq).getBytes();
        final int length = decode.length;
        final int length2 = bytes.length;
        final byte[] array = new byte[length + length2];
        System.arraycopy(decode, 0, array, 0, length);
        System.arraycopy(bytes, 0, array, length, length2);
        return new String(Base64.encode(a(array, new byte[][] { a(array, new byte[][] { s.getBytes() }) }), 2));
    }
    
    static void c(final Application application) {
        al5.a = false;
        al5.m = N();
        al5.f = v();
        al5.u = O();
        al5.r = I();
        al5.t = g();
        al5.k = e();
        al5.n = b(application);
        al5.s = G();
        al5.c = D();
        al5.b = b();
        al5.j = w();
        al5.h = y();
        al5.q = F();
        al5.a = true;
    }
    
    static boolean c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/os/Build.PRODUCT:Ljava/lang/String;
        //     3: astore_0       
        //     4: aload_0        
        //     5: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //     8: istore_2       
        //     9: iload_2        
        //    10: ifeq            18
        //    13: iconst_1       
        //    14: ireturn        
        //    15: astore_1       
        //    16: aload_1        
        //    17: athrow         
        //    18: aload_0        
        //    19: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //    22: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //    25: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //    28: bipush          32
        //    30: aaload         
        //    31: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    34: istore          4
        //    36: iload           4
        //    38: ifne            13
        //    41: getstatic       android/os/Build.MODEL:Ljava/lang/String;
        //    44: astore          5
        //    46: aload           5
        //    48: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    51: istore          7
        //    53: iload           7
        //    55: ifne            13
        //    58: aload           5
        //    60: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //    63: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //    66: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //    69: bipush          30
        //    71: aaload         
        //    72: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    75: istore          9
        //    77: iload           9
        //    79: ifne            13
        //    82: getstatic       android/os/Build.MANUFACTURER:Ljava/lang/String;
        //    85: astore          10
        //    87: aload           10
        //    89: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    92: istore          12
        //    94: iload           12
        //    96: ifne            13
        //    99: aload           10
        //   101: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //   104: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   107: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   110: bipush          29
        //   112: aaload         
        //   113: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   116: istore          14
        //   118: iload           14
        //   120: ifne            13
        //   123: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //   126: astore          16
        //   128: aload           16
        //   130: ifnull          13
        //   133: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   136: bipush          31
        //   138: aaload         
        //   139: astore          18
        //   141: aload           18
        //   143: ifnull          13
        //   146: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //   149: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   152: bipush          33
        //   154: aaload         
        //   155: invokestatic    android/provider/Settings$Secure.getString:(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
        //   158: astore          20
        //   160: aload           20
        //   162: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   165: istore          22
        //   167: iload           22
        //   169: ifne            13
        //   172: getstatic       com/whatsapp/App.h:Landroid/telephony/TelephonyManager;
        //   175: astore          24
        //   177: aload           24
        //   179: ifnull          13
        //   182: iconst_0       
        //   183: ireturn        
        //   184: astore_3       
        //   185: aload_3        
        //   186: athrow         
        //   187: astore          6
        //   189: aload           6
        //   191: athrow         
        //   192: astore          8
        //   194: aload           8
        //   196: athrow         
        //   197: astore          11
        //   199: aload           11
        //   201: athrow         
        //   202: astore          13
        //   204: aload           13
        //   206: athrow         
        //   207: astore          15
        //   209: aload           15
        //   211: athrow         
        //   212: astore          17
        //   214: aload           17
        //   216: athrow         
        //   217: astore          21
        //   219: aload           21
        //   221: athrow         
        //   222: astore          23
        //   224: aload           23
        //   226: athrow         
        //   227: astore          19
        //   229: iconst_1       
        //   230: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      9      15     18     Ljava/lang/NullPointerException;
        //  18     36     184    187    Ljava/lang/NullPointerException;
        //  46     53     187    192    Ljava/lang/NullPointerException;
        //  58     77     192    197    Ljava/lang/NullPointerException;
        //  87     94     197    202    Ljava/lang/NullPointerException;
        //  99     118    202    207    Ljava/lang/NullPointerException;
        //  123    128    207    212    Ljava/lang/NullPointerException;
        //  133    141    212    217    Ljava/lang/NullPointerException;
        //  146    160    227    231    Ljava/lang/NullPointerException;
        //  160    167    217    222    Ljava/lang/NullPointerException;
        //  172    177    222    227    Ljava/lang/NullPointerException;
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
    
    public static boolean c(final byte[] f, final String s) {
        try {
            if (a(y(), f, a6c.o + s, al5.p)) {
                App.F = f;
                return true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    public static byte[] c(final byte[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: invokestatic    com/whatsapp/al5.G:()Ljava/lang/String;
        //     7: astore_2       
        //     8: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //    11: iconst_5       
        //    12: aaload         
        //    13: invokestatic    java/security/MessageDigest.getInstance:(Ljava/lang/String;)Ljava/security/MessageDigest;
        //    16: aload_2        
        //    17: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //    20: bipush          6
        //    22: aaload         
        //    23: invokevirtual   java/lang/String.getBytes:(Ljava/lang/String;)[B
        //    26: invokevirtual   java/security/MessageDigest.digest:([B)[B
        //    29: astore          9
        //    31: aload           9
        //    33: astore          4
        //    35: aload           4
        //    37: ifnull          86
        //    40: aload           4
        //    42: arraylength    
        //    43: istore          6
        //    45: iload           6
        //    47: ifle            86
        //    50: iconst_0       
        //    51: istore          7
        //    53: iload           7
        //    55: aload_0        
        //    56: arraylength    
        //    57: if_icmpge       86
        //    60: aload_0        
        //    61: iload           7
        //    63: aload_0        
        //    64: iload           7
        //    66: baload         
        //    67: aload           4
        //    69: iload           7
        //    71: aload           4
        //    73: arraylength    
        //    74: irem           
        //    75: baload         
        //    76: ixor           
        //    77: i2b            
        //    78: bastore        
        //    79: iinc            7, 1
        //    82: iload_1        
        //    83: ifeq            53
        //    86: aload_0        
        //    87: areturn        
        //    88: astore          8
        //    90: aconst_null    
        //    91: astore          4
        //    93: goto            35
        //    96: astore_3       
        //    97: aconst_null    
        //    98: astore          4
        //   100: goto            35
        //   103: astore          5
        //   105: aload           5
        //   107: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                    
        //  -----  -----  -----  -----  ----------------------------------------
        //  8      31     88     96     Ljava/security/NoSuchAlgorithmException;
        //  8      31     96     103    Ljava/io/UnsupportedEncodingException;
        //  40     45     103    108    Ljava/security/NoSuchAlgorithmException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0053:
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
    
    public static String d(final String s) {
        try {
            final MessageDigest instance = MessageDigest.getInstance(al5.z[42]);
            instance.update(s.getBytes());
            return b(instance.digest());
        }
        catch (NoSuchAlgorithmException ex) {
            return null;
        }
    }
    
    public static boolean d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_0       
        //     2: invokestatic    java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
        //     5: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //     8: bipush          35
        //    10: aaload         
        //    11: invokevirtual   java/lang/Runtime.exec:(Ljava/lang/String;)Ljava/lang/Process;
        //    14: astore          14
        //    16: new             Ljava/io/BufferedInputStream;
        //    19: dup            
        //    20: aload           14
        //    22: invokevirtual   java/lang/Process.getInputStream:()Ljava/io/InputStream;
        //    25: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //    28: astore_3       
        //    29: new             Ljava/io/BufferedInputStream;
        //    32: dup            
        //    33: aload           14
        //    35: invokevirtual   java/lang/Process.getErrorStream:()Ljava/io/InputStream;
        //    38: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //    41: astore_2       
        //    42: aload           14
        //    44: invokevirtual   java/lang/Process.waitFor:()I
        //    47: pop            
        //    48: aload_2        
        //    49: invokevirtual   java/io/BufferedInputStream.available:()I
        //    52: istore          16
        //    54: aload_2        
        //    55: iload           16
        //    57: newarray        B
        //    59: iconst_0       
        //    60: iload           16
        //    62: invokevirtual   java/io/BufferedInputStream.read:([BII)I
        //    65: pop            
        //    66: aload_3        
        //    67: invokevirtual   java/io/BufferedInputStream.available:()I
        //    70: istore          18
        //    72: iload           18
        //    74: newarray        B
        //    76: astore          19
        //    78: aload_3        
        //    79: aload           19
        //    81: iconst_0       
        //    82: iload           18
        //    84: invokevirtual   java/io/BufferedInputStream.read:([BII)I
        //    87: pop            
        //    88: new             Ljava/lang/String;
        //    91: dup            
        //    92: aload           19
        //    94: invokespecial   java/lang/String.<init>:([B)V
        //    97: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   100: bipush          34
        //   102: aaload         
        //   103: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   106: istore          21
        //   108: iload           21
        //   110: ifeq            155
        //   113: iconst_1       
        //   114: istore          9
        //   116: aload_3        
        //   117: ifnull          124
        //   120: aload_3        
        //   121: invokevirtual   java/io/BufferedInputStream.close:()V
        //   124: aload_2        
        //   125: ifnull          132
        //   128: aload_2        
        //   129: invokevirtual   java/io/BufferedInputStream.close:()V
        //   132: iload           9
        //   134: ireturn        
        //   135: astore          29
        //   137: aload           29
        //   139: athrow         
        //   140: astore          28
        //   142: goto            124
        //   145: astore          27
        //   147: aload           27
        //   149: athrow         
        //   150: astore          26
        //   152: iload           9
        //   154: ireturn        
        //   155: aload_3        
        //   156: ifnull          163
        //   159: aload_3        
        //   160: invokevirtual   java/io/BufferedInputStream.close:()V
        //   163: iconst_0       
        //   164: istore          9
        //   166: aload_2        
        //   167: ifnull          132
        //   170: aload_2        
        //   171: invokevirtual   java/io/BufferedInputStream.close:()V
        //   174: iconst_0       
        //   175: ireturn        
        //   176: astore          23
        //   178: aload           23
        //   180: athrow         
        //   181: astore          22
        //   183: iconst_0       
        //   184: ireturn        
        //   185: astore          25
        //   187: aload           25
        //   189: athrow         
        //   190: astore          24
        //   192: goto            163
        //   195: astore          8
        //   197: aconst_null    
        //   198: astore_2       
        //   199: aload           8
        //   201: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   204: aload_0        
        //   205: ifnull          212
        //   208: aload_0        
        //   209: invokevirtual   java/io/BufferedInputStream.close:()V
        //   212: iconst_0       
        //   213: istore          9
        //   215: aload_2        
        //   216: ifnull          132
        //   219: aload_2        
        //   220: invokevirtual   java/io/BufferedInputStream.close:()V
        //   223: iconst_0       
        //   224: ireturn        
        //   225: astore          11
        //   227: aload           11
        //   229: athrow         
        //   230: astore          10
        //   232: iconst_0       
        //   233: ireturn        
        //   234: astore          13
        //   236: aload           13
        //   238: athrow         
        //   239: astore          12
        //   241: goto            212
        //   244: astore_1       
        //   245: aconst_null    
        //   246: astore_2       
        //   247: aconst_null    
        //   248: astore_3       
        //   249: aload_3        
        //   250: ifnull          257
        //   253: aload_3        
        //   254: invokevirtual   java/io/BufferedInputStream.close:()V
        //   257: aload_2        
        //   258: ifnull          265
        //   261: aload_2        
        //   262: invokevirtual   java/io/BufferedInputStream.close:()V
        //   265: aload_1        
        //   266: athrow         
        //   267: astore          7
        //   269: aload           7
        //   271: athrow         
        //   272: astore          6
        //   274: goto            257
        //   277: astore          5
        //   279: aload           5
        //   281: athrow         
        //   282: astore          4
        //   284: goto            265
        //   287: astore_1       
        //   288: aconst_null    
        //   289: astore_2       
        //   290: goto            249
        //   293: astore_1       
        //   294: goto            249
        //   297: astore_1       
        //   298: aload_0        
        //   299: astore_3       
        //   300: goto            249
        //   303: astore          8
        //   305: aload_3        
        //   306: astore_0       
        //   307: aconst_null    
        //   308: astore_2       
        //   309: goto            199
        //   312: astore          8
        //   314: aload_3        
        //   315: astore_0       
        //   316: goto            199
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  2      29     195    199    Ljava/lang/Exception;
        //  2      29     244    249    Any
        //  29     42     303    312    Ljava/lang/Exception;
        //  29     42     287    293    Any
        //  42     108    312    319    Ljava/lang/Exception;
        //  42     108    293    297    Any
        //  120    124    135    140    Ljava/lang/NullPointerException;
        //  120    124    140    145    Ljava/io/IOException;
        //  128    132    145    150    Ljava/lang/NullPointerException;
        //  128    132    150    155    Ljava/io/IOException;
        //  137    140    140    145    Ljava/io/IOException;
        //  147    150    150    155    Ljava/io/IOException;
        //  159    163    185    190    Ljava/lang/NullPointerException;
        //  159    163    190    195    Ljava/io/IOException;
        //  170    174    176    181    Ljava/lang/NullPointerException;
        //  170    174    181    185    Ljava/io/IOException;
        //  178    181    181    185    Ljava/io/IOException;
        //  187    190    190    195    Ljava/io/IOException;
        //  199    204    297    303    Any
        //  208    212    234    239    Ljava/lang/NullPointerException;
        //  208    212    239    244    Ljava/io/IOException;
        //  219    223    225    230    Ljava/lang/NullPointerException;
        //  219    223    230    234    Ljava/io/IOException;
        //  227    230    230    234    Ljava/io/IOException;
        //  236    239    239    244    Ljava/io/IOException;
        //  253    257    267    272    Ljava/lang/NullPointerException;
        //  253    257    272    277    Ljava/io/IOException;
        //  261    265    277    282    Ljava/lang/NullPointerException;
        //  261    265    282    287    Ljava/io/IOException;
        //  269    272    272    277    Ljava/io/IOException;
        //  279    282    282    287    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 175, Size: 175
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
    
    static boolean e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/al5.a:Z
        //     3: ifeq            17
        //     6: getstatic       com/whatsapp/al5.k:Z
        //     9: istore          7
        //    11: iload           7
        //    13: ireturn        
        //    14: astore_0       
        //    15: aload_0        
        //    16: athrow         
        //    17: new             Ljava/io/File;
        //    20: dup            
        //    21: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //    24: sipush          176
        //    27: aaload         
        //    28: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    31: astore_1       
        //    32: aload_1        
        //    33: invokevirtual   java/io/File.exists:()Z
        //    36: ifeq            43
        //    39: iconst_1       
        //    40: putstatic       com/whatsapp/al5.k:Z
        //    43: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    46: invokevirtual   com/whatsapp/App.getPackageManager:()Landroid/content/pm/PackageManager;
        //    49: astore          4
        //    51: aload           4
        //    53: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //    56: sipush          175
        //    59: aaload         
        //    60: sipush          128
        //    63: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //    66: pop            
        //    67: iconst_1       
        //    68: putstatic       com/whatsapp/al5.k:Z
        //    71: getstatic       com/whatsapp/al5.k:Z
        //    74: ireturn        
        //    75: astore_2       
        //    76: aload_2        
        //    77: athrow         
        //    78: astore_3       
        //    79: goto            43
        //    82: astore          5
        //    84: goto            71
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  0      11     14     17     Ljava/lang/Exception;
        //  17     32     78     82     Ljava/lang/Exception;
        //  32     43     75     78     Ljava/lang/Exception;
        //  51     71     82     87     Landroid/content/pm/PackageManager$NameNotFoundException;
        //  76     78     78     82     Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0071:
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
    
    public static byte[] e(final String s) {
        try {
            return a(F(), a6c.o + s, al5.p);
        }
        catch (atx atx) {
            Log.w(al5.z[11]);
            return null;
        }
    }
    
    public static void f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    android/os/Environment.getExternalStorageState:()Ljava/lang/String;
        //     3: astore_0       
        //     4: aload_0        
        //     5: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //     8: bipush          21
        //    10: aaload         
        //    11: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    14: istore_2       
        //    15: iload_2        
        //    16: ifne            23
        //    19: return         
        //    20: astore_1       
        //    21: aload_1        
        //    22: athrow         
        //    23: invokestatic    com/whatsapp/al5.b:()Ljava/io/File;
        //    26: astore_3       
        //    27: invokestatic    com/whatsapp/al5.w:()Ljava/io/File;
        //    30: astore          4
        //    32: aload           4
        //    34: invokestatic    com/whatsapp/al5.a:(Ljava/io/File;)[B
        //    37: astore          5
        //    39: aload_3        
        //    40: invokestatic    com/whatsapp/al5.a:(Ljava/io/File;)[B
        //    43: astore          6
        //    45: aload_3        
        //    46: invokevirtual   java/io/File.exists:()Z
        //    49: istore          7
        //    51: new             Ljava/lang/StringBuilder;
        //    54: dup            
        //    55: invokespecial   java/lang/StringBuilder.<init>:()V
        //    58: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //    61: bipush          18
        //    63: aaload         
        //    64: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    67: iload           7
        //    69: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    72: ldc_w           " "
        //    75: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    78: astore          9
        //    80: iload           7
        //    82: ifeq            261
        //    85: aload_3        
        //    86: invokevirtual   java/io/File.lastModified:()J
        //    89: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    92: astore          10
        //    94: aload           10
        //    96: astore          11
        //    98: aload           9
        //   100: aload           11
        //   102: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   105: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   108: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   111: aload           5
        //   113: ifnonnull       121
        //   116: aload           6
        //   118: ifnull          19
        //   121: aload           5
        //   123: aload           6
        //   125: invokestatic    java/util/Arrays.equals:([B[B)Z
        //   128: istore          15
        //   130: iload           15
        //   132: ifne            19
        //   135: aload           5
        //   137: ifnull          155
        //   140: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   143: bipush          19
        //   145: aaload         
        //   146: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   149: getstatic       com/whatsapp/App.I:Z
        //   152: ifeq            284
        //   155: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   158: bipush          17
        //   160: aaload         
        //   161: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   164: aload_0        
        //   165: invokestatic    com/whatsapp/al5.a:(Ljava/lang/String;)V
        //   168: aload_3        
        //   169: invokevirtual   java/io/File.exists:()Z
        //   172: invokestatic    com/whatsapp/al5.a:(Z)V
        //   175: ldc_w           "i"
        //   178: astore          16
        //   180: aload           4
        //   182: astore          17
        //   184: aload           6
        //   186: astore          18
        //   188: aload           18
        //   190: aload           17
        //   192: invokestatic    com/whatsapp/al5.a:([BLjava/io/File;)V
        //   195: aload           18
        //   197: aload           17
        //   199: invokestatic    com/whatsapp/al5.a:(Ljava/io/File;)[B
        //   202: invokestatic    java/util/Arrays.equals:([B[B)Z
        //   205: pop            
        //   206: ldc_w           "i"
        //   209: aload           16
        //   211: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   214: ifeq            19
        //   217: invokestatic    com/whatsapp/al5.q:()V
        //   220: return         
        //   221: astore          21
        //   223: aload           21
        //   225: athrow         
        //   226: astore          19
        //   228: new             Ljava/lang/StringBuilder;
        //   231: dup            
        //   232: invokespecial   java/lang/StringBuilder.<init>:()V
        //   235: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   238: bipush          20
        //   240: aaload         
        //   241: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   244: aload           16
        //   246: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   249: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   252: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   255: return         
        //   256: astore          8
        //   258: aload           8
        //   260: athrow         
        //   261: ldc_w           ""
        //   264: astore          11
        //   266: goto            98
        //   269: astore          12
        //   271: aload           12
        //   273: athrow         
        //   274: astore          13
        //   276: aload           13
        //   278: athrow         
        //   279: astore          14
        //   281: aload           14
        //   283: athrow         
        //   284: aload           5
        //   286: astore          18
        //   288: ldc_w           "e"
        //   291: astore          16
        //   293: aload_3        
        //   294: astore          17
        //   296: goto            188
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      15     20     23     Ljava/lang/Exception;
        //  51     80     256    261    Ljava/lang/Exception;
        //  85     94     256    261    Ljava/lang/Exception;
        //  98     111    269    274    Ljava/lang/Exception;
        //  121    130    274    284    Ljava/lang/Exception;
        //  188    206    226    256    Ljava/lang/Exception;
        //  206    220    221    226    Ljava/lang/Exception;
        //  223    226    226    256    Ljava/lang/Exception;
        //  271    274    274    284    Ljava/lang/Exception;
        //  276    279    279    284    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 137, Size: 137
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
    
    public static byte[] f(final String s) {
        try {
            return a(y(), a6c.o + s, al5.p);
        }
        catch (atx atx) {
            Log.c(al5.z[26], atx);
            return null;
        }
    }
    
    static boolean g() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_0       
        //     4: getstatic       com/whatsapp/al5.a:Z
        //     7: ifeq            21
        //    10: getstatic       com/whatsapp/al5.t:Z
        //    13: istore          12
        //    15: iload           12
        //    17: ireturn        
        //    18: astore_1       
        //    19: aload_1        
        //    20: athrow         
        //    21: new             Ljava/io/File;
        //    24: dup            
        //    25: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //    28: bipush          45
        //    30: aaload         
        //    31: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    34: astore_2       
        //    35: aload_2        
        //    36: invokevirtual   java/io/File.exists:()Z
        //    39: ifeq            46
        //    42: iconst_1       
        //    43: putstatic       com/whatsapp/al5.t:Z
        //    46: getstatic       com/whatsapp/al5.e:[Ljava/lang/String;
        //    49: astore          5
        //    51: aload           5
        //    53: arraylength    
        //    54: istore          6
        //    56: iconst_0       
        //    57: istore          7
        //    59: iload           7
        //    61: iload           6
        //    63: if_icmpge       103
        //    66: aload           5
        //    68: iload           7
        //    70: aaload         
        //    71: astore          8
        //    73: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    76: invokevirtual   com/whatsapp/App.getPackageManager:()Landroid/content/pm/PackageManager;
        //    79: astore          9
        //    81: aload           9
        //    83: aload           8
        //    85: sipush          128
        //    88: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //    91: pop            
        //    92: iconst_1       
        //    93: putstatic       com/whatsapp/al5.t:Z
        //    96: iinc            7, 1
        //    99: iload_0        
        //   100: ifeq            59
        //   103: getstatic       com/whatsapp/al5.t:Z
        //   106: ireturn        
        //   107: astore_3       
        //   108: aload_3        
        //   109: athrow         
        //   110: astore          4
        //   112: goto            46
        //   115: astore          10
        //   117: goto            96
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  4      15     18     21     Ljava/lang/Exception;
        //  21     35     110    115    Ljava/lang/Exception;
        //  35     46     107    110    Ljava/lang/Exception;
        //  81     96     115    120    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  108    110    110    115    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0096:
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
    
    public static byte[] g(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/whatsapp/al5.w:()Ljava/io/File;
        //     3: new             Ljava/lang/StringBuilder;
        //     6: dup            
        //     7: invokespecial   java/lang/StringBuilder.<init>:()V
        //    10: getstatic       com/whatsapp/a6c.r:Ljava/lang/String;
        //    13: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    16: aload_0        
        //    17: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    20: invokestatic    com/whatsapp/al5.G:()Ljava/lang/String;
        //    23: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    26: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    29: getstatic       com/whatsapp/al5.l:[B
        //    32: invokestatic    com/whatsapp/al5.a:(Ljava/io/File;Ljava/lang/String;[B)[B
        //    35: astore_2       
        //    36: aload_2        
        //    37: astore_3       
        //    38: aload_3        
        //    39: ifnonnull       148
        //    42: invokestatic    android/os/Environment.getExternalStorageState:()Ljava/lang/String;
        //    45: invokestatic    com/whatsapp/al5.a:(Ljava/lang/String;)V
        //    48: invokestatic    com/whatsapp/al5.b:()Ljava/io/File;
        //    51: astore          6
        //    53: aload           6
        //    55: invokevirtual   java/io/File.exists:()Z
        //    58: invokestatic    com/whatsapp/al5.a:(Z)V
        //    61: aload           6
        //    63: new             Ljava/lang/StringBuilder;
        //    66: dup            
        //    67: invokespecial   java/lang/StringBuilder.<init>:()V
        //    70: getstatic       com/whatsapp/a6c.r:Ljava/lang/String;
        //    73: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    76: aload_0        
        //    77: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    80: invokestatic    com/whatsapp/al5.G:()Ljava/lang/String;
        //    83: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    86: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    89: getstatic       com/whatsapp/al5.l:[B
        //    92: invokestatic    com/whatsapp/al5.a:(Ljava/io/File;Ljava/lang/String;[B)[B
        //    95: astore_3       
        //    96: aload_3        
        //    97: ifnull          142
        //   100: invokestatic    com/whatsapp/al5.w:()Ljava/io/File;
        //   103: astore          7
        //   105: aload           6
        //   107: invokestatic    com/whatsapp/al5.a:(Ljava/io/File;)[B
        //   110: astore          9
        //   112: aload           9
        //   114: aload           7
        //   116: invokestatic    com/whatsapp/al5.a:([BLjava/io/File;)V
        //   119: aload           9
        //   121: aload           7
        //   123: invokestatic    com/whatsapp/al5.a:(Ljava/io/File;)[B
        //   126: invokestatic    java/util/Arrays.equals:([B[B)Z
        //   129: pop            
        //   130: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   133: bipush          83
        //   135: aaload         
        //   136: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   139: invokestatic    com/whatsapp/al5.q:()V
        //   142: getstatic       com/whatsapp/App.I:Z
        //   145: ifeq            151
        //   148: invokestatic    com/whatsapp/al5.f:()V
        //   151: aload_3        
        //   152: areturn        
        //   153: astore          5
        //   155: new             Ljava/lang/StringBuilder;
        //   158: dup            
        //   159: invokespecial   java/lang/StringBuilder.<init>:()V
        //   162: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   165: bipush          82
        //   167: aaload         
        //   168: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   171: aload           5
        //   173: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //   176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   179: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   182: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   185: goto            48
        //   188: astore_1       
        //   189: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   192: bipush          80
        //   194: aaload         
        //   195: aload_1        
        //   196: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   199: aconst_null    
        //   200: areturn        
        //   201: astore          8
        //   203: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   206: bipush          81
        //   208: aaload         
        //   209: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   212: goto            142
        //   215: astore          4
        //   217: aload           4
        //   219: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      36     188    201    Lcom/whatsapp/atx;
        //  42     48     153    188    Ljava/lang/Exception;
        //  42     48     188    201    Lcom/whatsapp/atx;
        //  48     96     188    201    Lcom/whatsapp/atx;
        //  100    105    188    201    Lcom/whatsapp/atx;
        //  105    142    201    215    Ljava/lang/Exception;
        //  105    142    188    201    Lcom/whatsapp/atx;
        //  142    148    215    220    Ljava/lang/Exception;
        //  142    148    188    201    Lcom/whatsapp/atx;
        //  148    151    215    220    Ljava/lang/Exception;
        //  148    151    188    201    Lcom/whatsapp/atx;
        //  155    185    188    201    Lcom/whatsapp/atx;
        //  203    212    188    201    Lcom/whatsapp/atx;
        //  217    220    188    201    Lcom/whatsapp/atx;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 95, Size: 95
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
    
    public static void h() {
        y().delete();
    }
    
    public static boolean h(final String s) {
        final File w = w();
        Label_0035: {
            try {
                final boolean exists = w.exists();
                final boolean b = false;
                if (!exists) {
                    return b;
                }
                final File file = w;
                final long n = file.length();
                final long n2 = 0L;
                final long n3 = lcmp(n, n2);
                if (n3 <= 0) {
                    return false;
                }
                break Label_0035;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            try {
                final File file = w;
                final long n = file.length();
                final long n2 = 0L;
                final long n3 = lcmp(n, n2);
                if (n3 <= 0) {
                    return false;
                }
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
        }
        final byte[] b3 = b(s);
        boolean b = false;
        if (b3 != null) {
            b = true;
        }
        return b;
    }
    
    private static byte[] i() {
        return a(4);
    }
    
    public static String j() {
        byte[] a;
        while (true) {
            final File w = w();
            while (true) {
                try {
                    if (!w.exists()) {
                        return null;
                    }
                }
                catch (NoSuchAlgorithmException ex) {
                    throw ex;
                }
                a = a(w);
                if (a != null) {
                    break;
                }
                continue;
            }
        }
        try {
            final MessageDigest instance = MessageDigest.getInstance(al5.z[177]);
            instance.reset();
            instance.update(a);
            return Base64.encodeToString(instance.digest(), 2);
        }
        catch (NoSuchAlgorithmException ex2) {
            Log.b(ex2);
            return null;
        }
    }
    
    public static byte[] k() {
        try {
            final KeyGenerator instance = KeyGenerator.getInstance(al5.z[44]);
            instance.init(160, SecureRandom.getInstance(al5.z[43]));
            return instance.generateKey().getEncoded();
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    
    static boolean l() {
        while (true) {
            final String subscriberId = App.h.getSubscriberId();
            try {
                if (TextUtils.isEmpty((CharSequence)subscriberId)) {
                    return true;
                }
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            try {
                if (!subscriberId.contains(al5.z[12])) {
                    return false;
                }
                return true;
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
        }
    }
    
    private static String m() {
        return b(true);
    }
    
    public static f3 n() {
        File c;
        byte[] a;
        while (true) {
            c = C();
            while (true) {
                try {
                    if (!c.exists()) {
                        Log.w(al5.z[68]);
                        return null;
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
                a = a(c);
                if (a != null) {
                    break;
                }
                continue;
            }
        }
        try {
            if (a.length < 32 + (16 + (32 + (16 + (32 + (1 + al5.i.length)))))) {
                throw new InvalidParameterException(c.toString() + al5.z[67]);
            }
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
        final byte[] array = new byte[al5.i.length];
        System.arraycopy(a, 0, array, 0, al5.i.length);
        final int n = 0 + al5.i.length;
        try {
            if (!Arrays.equals(array, al5.i)) {
                throw new atx((he)null);
            }
        }
        catch (NullPointerException ex3) {
            throw ex3;
        }
        final int n2 = n + 1;
        final String value = String.valueOf(a[n]);
        final byte[] array2 = new byte[32];
        System.arraycopy(a, n2, array2, 0, 32);
        final int n3 = n2 + 32;
        final byte[] array3 = new byte[16];
        System.arraycopy(a, n3, array3, 0, 16);
        final int n4 = n3 + 16;
        final byte[] array4 = new byte[32];
        System.arraycopy(a, n4, array4, 0, 32);
        final int n5 = n4 + 32;
        final byte[] q = Q();
        final int n6 = n5 + 16;
        final byte[] array5 = new byte[32];
        System.arraycopy(a, n6, array5, 0, 32);
        return new f3(array, value, array2, array3, array4, q, array5);
    }
    
    static boolean o() {
        try {
            Class.forName(al5.z[75]);
            return true;
        }
        catch (ClassNotFoundException ex) {
            return false;
        }
    }
    
    public static void p() {
        F().delete();
    }
    
    private static void q() {
        Log.i(al5.z[49]);
        final SharedPreferences$Editor edit = App.aq.getSharedPreferences(al5.z[46], 0).edit();
        try {
            edit.putBoolean(al5.z[48], true);
            if (!edit.commit()) {
                Log.w(al5.z[47]);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    public static boolean r() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/whatsapp/al5.n:()Lcom/whatsapp/f3;
        //     3: astore_1       
        //     4: aload_1        
        //     5: ifnull          33
        //     8: aload_1        
        //     9: getfield        com/whatsapp/f3.c:Lcom/whatsapp/s6;
        //    12: getfield        com/whatsapp/s6.c:[B
        //    15: astore          4
        //    17: aload           4
        //    19: ifnull          33
        //    22: aload_1        
        //    23: getfield        com/whatsapp/f3.b:[B
        //    26: astore          5
        //    28: aload           5
        //    30: ifnonnull       54
        //    33: iconst_0       
        //    34: ireturn        
        //    35: astore_0       
        //    36: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //    39: bipush          25
        //    41: aaload         
        //    42: aload_0        
        //    43: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    46: iconst_0       
        //    47: ireturn        
        //    48: astore_2       
        //    49: aload_2        
        //    50: athrow         
        //    51: astore_3       
        //    52: aload_3        
        //    53: athrow         
        //    54: aload_1        
        //    55: getfield        com/whatsapp/f3.c:Lcom/whatsapp/s6;
        //    58: getfield        com/whatsapp/s6.c:[B
        //    61: invokestatic    com/whatsapp/al5.a:([B)[B
        //    64: aload_1        
        //    65: getfield        com/whatsapp/f3.b:[B
        //    68: invokestatic    java/util/Arrays.equals:([B[B)Z
        //    71: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      4      35     48     Ljava/lang/Exception;
        //  8      17     48     51     Ljava/lang/Exception;
        //  22     28     51     54     Ljava/lang/Exception;
        //  49     51     51     54     Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 39, Size: 39
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
    
    static Boolean s() {
        try {
            return Environment.getExternalStorageState().equals(al5.z[87]);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    static int t() {
        final AccountManager value = AccountManager.get(App.aq.getApplicationContext());
        int length = -1;
        if (value == null) {
            return length;
        }
        try {
            length = value.getAccountsByType(al5.z[16]).length;
            return length;
        }
        catch (Exception ex) {
            return length;
        }
    }
    
    public static boolean u() {
        return C().delete();
    }
    
    static boolean v() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_2       
        //     1: istore_0       
        //     2: iconst_1       
        //     3: istore_1       
        //     4: getstatic       com/whatsapp/al5.a:Z
        //     7: ifeq            19
        //    10: getstatic       com/whatsapp/al5.f:Z
        //    13: istore_1       
        //    14: iload_1        
        //    15: ireturn        
        //    16: astore_2       
        //    17: aload_2        
        //    18: athrow         
        //    19: new             Ljava/io/File;
        //    22: dup            
        //    23: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //    26: bipush          88
        //    28: aaload         
        //    29: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    32: astore_3       
        //    33: new             Ljava/io/File;
        //    36: dup            
        //    37: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //    40: bipush          90
        //    42: aaload         
        //    43: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    46: astore          4
        //    48: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    51: bipush          9
        //    53: if_icmplt       689
        //    56: aload_3        
        //    57: invokevirtual   java/io/File.canExecute:()Z
        //    60: istore          58
        //    62: iload           58
        //    64: ifeq            454
        //    67: iload_1        
        //    68: istore          6
        //    70: aload           4
        //    72: invokevirtual   java/io/File.canExecute:()Z
        //    75: istore          62
        //    77: iload           62
        //    79: ifeq            470
        //    82: iload_1        
        //    83: istore_0       
        //    84: invokestatic    com/whatsapp/al5.c:()Z
        //    87: istore          7
        //    89: invokestatic    com/whatsapp/al5.l:()Z
        //    92: istore          8
        //    94: new             Ljava/lang/StringBuilder;
        //    97: dup            
        //    98: invokespecial   java/lang/StringBuilder.<init>:()V
        //   101: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   104: bipush          89
        //   106: aaload         
        //   107: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   110: astore          10
        //   112: aload_3        
        //   113: invokevirtual   java/io/File.exists:()Z
        //   116: istore          11
        //   118: iload           11
        //   120: ifeq            516
        //   123: iload_1        
        //   124: istore          12
        //   126: aload           10
        //   128: iload           12
        //   130: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   133: astore          14
        //   135: aload_3        
        //   136: invokevirtual   java/io/File.canRead:()Z
        //   139: istore          15
        //   141: iload           15
        //   143: ifeq            527
        //   146: iload_1        
        //   147: istore          16
        //   149: aload           14
        //   151: iload           16
        //   153: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   156: astore          18
        //   158: aload_3        
        //   159: invokevirtual   java/io/File.canWrite:()Z
        //   162: istore          19
        //   164: iload           19
        //   166: ifeq            538
        //   169: iload_1        
        //   170: istore          20
        //   172: aload           18
        //   174: iload           20
        //   176: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   179: iload           6
        //   181: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   184: astore          22
        //   186: iload           7
        //   188: ifeq            549
        //   191: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   194: bipush          91
        //   196: aaload         
        //   197: astore          23
        //   199: aload           22
        //   201: aload           23
        //   203: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   206: astore          25
        //   208: iload           8
        //   210: ifeq            562
        //   213: ldc_w           "3"
        //   216: astore          26
        //   218: aload           25
        //   220: aload           26
        //   222: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   225: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   228: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   231: new             Ljava/lang/StringBuilder;
        //   234: dup            
        //   235: invokespecial   java/lang/StringBuilder.<init>:()V
        //   238: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   241: bipush          92
        //   243: aaload         
        //   244: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   247: astore          28
        //   249: aload           4
        //   251: invokevirtual   java/io/File.exists:()Z
        //   254: istore          29
        //   256: iload           29
        //   258: ifeq            575
        //   261: iload_1        
        //   262: istore          30
        //   264: aload           28
        //   266: iload           30
        //   268: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   271: astore          32
        //   273: aload           4
        //   275: invokevirtual   java/io/File.canRead:()Z
        //   278: istore          33
        //   280: iload           33
        //   282: ifeq            586
        //   285: iload_1        
        //   286: istore          34
        //   288: aload           32
        //   290: iload           34
        //   292: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   295: astore          36
        //   297: aload           4
        //   299: invokevirtual   java/io/File.canWrite:()Z
        //   302: istore          37
        //   304: iload           37
        //   306: ifeq            597
        //   309: iload_1        
        //   310: istore          38
        //   312: aload           36
        //   314: iload           38
        //   316: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   319: iload_0        
        //   320: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   323: astore          40
        //   325: iload           7
        //   327: ifeq            608
        //   330: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   333: bipush          94
        //   335: aaload         
        //   336: astore          41
        //   338: aload           40
        //   340: aload           41
        //   342: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   345: astore          43
        //   347: iload           8
        //   349: ifeq            621
        //   352: ldc_w           "3"
        //   355: astore          44
        //   357: aload           43
        //   359: aload           44
        //   361: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   364: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   367: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   370: aload_3        
        //   371: invokevirtual   java/io/File.exists:()Z
        //   374: istore          46
        //   376: iload           46
        //   378: ifne            14
        //   381: aload           4
        //   383: invokevirtual   java/io/File.exists:()Z
        //   386: istore          48
        //   388: iload           48
        //   390: ifne            14
        //   393: new             Ljava/io/FileInputStream;
        //   396: dup            
        //   397: aload_3        
        //   398: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   401: astore          49
        //   403: aload           49
        //   405: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   408: aload           49
        //   410: ifnonnull       14
        //   413: new             Ljava/io/FileInputStream;
        //   416: dup            
        //   417: aload           4
        //   419: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   422: astore          50
        //   424: aload           50
        //   426: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   429: aload           50
        //   431: ifnonnull       14
        //   434: iconst_0       
        //   435: ireturn        
        //   436: astore          55
        //   438: aload           55
        //   440: athrow         
        //   441: astore          56
        //   443: aload           56
        //   445: athrow         
        //   446: astore          57
        //   448: iload_0        
        //   449: istore          6
        //   451: goto            84
        //   454: iconst_0       
        //   455: istore          6
        //   457: goto            70
        //   460: astore          60
        //   462: aload           60
        //   464: athrow         
        //   465: astore          61
        //   467: goto            84
        //   470: iconst_0       
        //   471: istore_0       
        //   472: goto            84
        //   475: astore          5
        //   477: iload_0        
        //   478: istore          6
        //   480: new             Ljava/lang/StringBuilder;
        //   483: dup            
        //   484: invokespecial   java/lang/StringBuilder.<init>:()V
        //   487: getstatic       com/whatsapp/al5.z:[Ljava/lang/String;
        //   490: bipush          93
        //   492: aaload         
        //   493: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   496: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   499: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   502: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   505: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   508: goto            84
        //   511: astore          9
        //   513: aload           9
        //   515: athrow         
        //   516: iconst_0       
        //   517: istore          12
        //   519: goto            126
        //   522: astore          13
        //   524: aload           13
        //   526: athrow         
        //   527: iconst_0       
        //   528: istore          16
        //   530: goto            149
        //   533: astore          17
        //   535: aload           17
        //   537: athrow         
        //   538: iconst_0       
        //   539: istore          20
        //   541: goto            172
        //   544: astore          21
        //   546: aload           21
        //   548: athrow         
        //   549: ldc_w           ""
        //   552: astore          23
        //   554: goto            199
        //   557: astore          24
        //   559: aload           24
        //   561: athrow         
        //   562: ldc_w           ""
        //   565: astore          26
        //   567: goto            218
        //   570: astore          27
        //   572: aload           27
        //   574: athrow         
        //   575: iconst_0       
        //   576: istore          30
        //   578: goto            264
        //   581: astore          31
        //   583: aload           31
        //   585: athrow         
        //   586: iconst_0       
        //   587: istore          34
        //   589: goto            288
        //   592: astore          35
        //   594: aload           35
        //   596: athrow         
        //   597: iconst_0       
        //   598: istore          38
        //   600: goto            312
        //   603: astore          39
        //   605: aload           39
        //   607: athrow         
        //   608: ldc_w           ""
        //   611: astore          41
        //   613: goto            338
        //   616: astore          42
        //   618: aload           42
        //   620: athrow         
        //   621: ldc_w           ""
        //   624: astore          44
        //   626: goto            357
        //   629: astore          45
        //   631: aload           45
        //   633: athrow         
        //   634: astore          47
        //   636: aload           47
        //   638: athrow         
        //   639: astore          54
        //   641: aconst_null    
        //   642: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   645: aconst_null    
        //   646: astore          49
        //   648: goto            408
        //   651: astore          53
        //   653: aconst_null    
        //   654: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   657: aload           53
        //   659: athrow         
        //   660: astore          52
        //   662: aload           49
        //   664: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   667: aload           49
        //   669: astore          50
        //   671: goto            429
        //   674: astore          51
        //   676: aload           49
        //   678: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   681: aload           51
        //   683: athrow         
        //   684: astore          59
        //   686: goto            480
        //   689: iload_0        
        //   690: istore          6
        //   692: goto            84
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  4      14     16     19     Ljava/lang/Exception;
        //  48     62     436    454    Ljava/lang/Exception;
        //  48     62     475    480    Ljava/lang/NoSuchMethodError;
        //  70     77     460    470    Ljava/lang/Exception;
        //  70     77     684    689    Ljava/lang/NoSuchMethodError;
        //  94     118    511    516    Ljava/lang/Exception;
        //  126    141    522    527    Ljava/lang/Exception;
        //  149    164    533    538    Ljava/lang/Exception;
        //  172    186    544    549    Ljava/lang/Exception;
        //  191    199    544    549    Ljava/lang/Exception;
        //  199    208    557    562    Ljava/lang/Exception;
        //  218    256    570    575    Ljava/lang/Exception;
        //  264    280    581    586    Ljava/lang/Exception;
        //  288    304    592    597    Ljava/lang/Exception;
        //  312    325    603    608    Ljava/lang/Exception;
        //  330    338    603    608    Ljava/lang/Exception;
        //  338    347    616    621    Ljava/lang/Exception;
        //  357    376    629    634    Ljava/lang/Exception;
        //  381    388    634    639    Ljava/lang/Exception;
        //  393    403    639    651    Ljava/lang/Exception;
        //  393    403    651    660    Any
        //  413    424    660    674    Ljava/lang/Exception;
        //  413    424    674    684    Any
        //  438    441    441    454    Ljava/lang/Exception;
        //  438    441    475    480    Ljava/lang/NoSuchMethodError;
        //  443    446    446    454    Ljava/lang/Exception;
        //  443    446    475    480    Ljava/lang/NoSuchMethodError;
        //  462    465    465    470    Ljava/lang/Exception;
        //  462    465    684    689    Ljava/lang/NoSuchMethodError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 331, Size: 331
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
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
    
    private static File w() {
        try {
            if (al5.a) {
                return al5.j;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return new File(App.aq.getFilesDir(), al5.z[86]);
    }
    
    static boolean x() {
        return al5.a;
    }
    
    private static File y() {
        try {
            if (al5.a) {
                return al5.h;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return new File(App.aq.getFilesDir(), al5.z[23]);
    }
    
    public static Boolean z() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/whatsapp/al5.b:()Ljava/io/File;
        //     3: astore_0       
        //     4: aload_0        
        //     5: invokevirtual   java/io/File.exists:()Z
        //     8: istore_2       
        //     9: iload_2        
        //    10: ifne            18
        //    13: aconst_null    
        //    14: areturn        
        //    15: astore_1       
        //    16: aload_1        
        //    17: athrow         
        //    18: invokestatic    com/whatsapp/al5.w:()Ljava/io/File;
        //    21: astore_3       
        //    22: aload_3        
        //    23: invokevirtual   java/io/File.exists:()Z
        //    26: istore          5
        //    28: iload           5
        //    30: ifeq            13
        //    33: aload_3        
        //    34: invokestatic    com/whatsapp/al5.a:(Ljava/io/File;)[B
        //    37: astore          6
        //    39: aload_0        
        //    40: invokestatic    com/whatsapp/al5.a:(Ljava/io/File;)[B
        //    43: astore          7
        //    45: aload           6
        //    47: ifnull          55
        //    50: aload           7
        //    52: ifnonnull       74
        //    55: iconst_0       
        //    56: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    59: astore          9
        //    61: aload           9
        //    63: areturn        
        //    64: astore          4
        //    66: aload           4
        //    68: athrow         
        //    69: astore          8
        //    71: aload           8
        //    73: athrow         
        //    74: aload           6
        //    76: aload           7
        //    78: invokestatic    java/util/Arrays.equals:([B[B)Z
        //    81: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    84: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      9      15     18     Ljava/lang/NullPointerException;
        //  22     28     64     69     Ljava/lang/NullPointerException;
        //  55     61     69     74     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0055:
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
}
