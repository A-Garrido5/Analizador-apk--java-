// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.webkit.MimeTypeMap;
import java.net.MalformedURLException;
import com.whatsapp.al5;
import android.os.Debug;
import android.media.MediaMetadataRetriever;
import com.whatsapp.gu;
import java.nio.ByteBuffer;
import android.graphics.Bitmap$CompressFormat;
import java.io.ByteArrayOutputStream;
import com.whatsapp.MediaData;
import com.whatsapp.protocol.bi;
import android.content.SharedPreferences;
import android.content.Intent;
import com.whatsapp.gallerypicker.GalleryPicker;
import android.provider.MediaStore$Images$Media;
import android.app.Activity;
import android.net.Uri$Builder;
import java.net.URL;
import com.whatsapp.App;
import android.content.SharedPreferences$Editor;
import android.content.Context;
import android.os.Build$VERSION;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.io.FileNotFoundException;
import android.text.TextUtils;
import android.net.Uri;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import java.io.OutputStream;
import java.io.InputStream;
import com.whatsapp.ym;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.text.DecimalFormat;
import java.io.File;
import android.graphics.BitmapFactory$Options;

public class br
{
    public static BitmapFactory$Options a;
    private static String b;
    private static int c;
    private static File d;
    private static final DecimalFormat e;
    public static u f;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[160];
        String s = "UcY5\u000bWkA5";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_4096:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'T';
                        break;
                    }
                    case 0: {
                        c2 = '3';
                        break;
                    }
                    case 1: {
                        c2 = '\n';
                        break;
                    }
                    case 2: {
                        c2 = '5';
                        break;
                    }
                    case 3: {
                        c2 = 'P';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0013v\u00156=_oj45Go\u000f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "UcY5\u000bZdQ5,";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "^oQ95UcY5!GcY#{Zd\\$2ZfP3;FdA5&\u0013l\\<1lc[41K0";
                    n = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "PeX~#[kA#5Czj &VlP\"1]iP#";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "UcY5\u000bWkA5";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "UcY5\u000bZdQ5,";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "^oQ95UcY5!GcY#{Zd\\$2ZfP3;FdA5&\u001cyT&1lzG52@US1=_oQ";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0013v\u0015p ZgPj";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0013v\u00156=_oj45Go\u000f";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    s = "^oQ95UcY5!GcY#{Zd\\$2ZfP3;FdA5&\u0013l\\<1lc[41K0";
                    n = 9;
                    n2 = 10;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    array = z2;
                    s = "PkE$=\\d";
                    n = 10;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "^oQ95UcY5!GcY#{ToA99RmP1:WyP>0\u001cyP3!AcA)1KiP  Ze[";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u001d`E7";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "^oQ95UcY5!GcY#{ToA99RmP1:WyP>0\u001c~]%9QUW9 ^kEp=@*[%8_";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "@kX 8VUG? R~P\u000f=^kR5{Uc[18ly\\*1\t";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "}e\u00156=_o\u0015";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u0013v\u0015";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "@kX 8VUG? R~P\u000f=^kR5{UxZ=tFx\\j";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "@kX 8VUG? R~P\u000f=^kR5{\\eXp";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "VrA5&]kY\u000f2ZfP\u000f=^kR5";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "^oQ95F~\\<'\u001cmP>1AkA51K~P\":Rf\\=5ToS98V%F1\"VUE\"1Uyj65ZfP4";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "PeX~#[kA#5Czj &VlP\"1]iP#";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "\u0013eG93Zd\u000f";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u0013eG93Zd\u000f";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "^oQ95UcY5!GcY#{Uc[48RxR5'Gl\\<1ZdQ5,\u0013~L 1\t";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "^oQ95UcY5!GcY#{Uc[48RxR5'Gl\\<1ZdQ5,\u001cdZp2ZfP#tUeGp JzPj";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "\u001e]t";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "\u0013~Z$5_0";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "UcY5\u000bZdQ5,\t";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "^oQ95UcY5!GcY#{Uc[48RxR5'Gl\\<1ZdQ5,\u001cdS5n";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "Uf\\ y[";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "AeA1 Ze[";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "}e\u00156=_o\u0015";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "Uf\\ yE";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "PeX~#[kA#5Czj &VlP\"1]iP#";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "VrA5&]kY\u000f2ZfP\u000f=^kR5";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "\u001e]t";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "UcY5\u000bWkA5";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "PeX~#[kA#5Czj &VlP\"1]iP#";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "^oQ95UcY5!GcY#{AoT45QfP6=_o[19V%";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "^oQ95UcY5!GcY#{Zd\\$2ZfP3;FdA5&\u001cyT&1lzG52@US1=_oQ";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "UcY5\u000bZdQ5,";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "CxP 5Aoj99RmP\u000f2\\xj#1]n\u001a3;Cs\u0015#=Io\u000f";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "CxP 5Aoj99RmP\u000f2\\xj#1]n\u001a?;^*";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "\u0013gT(n";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "}e\u0015#$RiPp8VlAp;]*Q5\"ZiP";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "CxP 5Aoj99RmP\u000f2\\xj#1]n\u001a3;Cs\u0015";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "\u0013xP3;^zG5'@0";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "^kM\u000f=GoX#";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "RdQ\";Zn\u001b=1WcT~5P~\\?:\u001dCx\u0011\u0013vUv\u0011\u0004g_g\u0015";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    s = "\u001dgEd";
                    n = 50;
                    n2 = 51;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    array = z2;
                    s = "\\\u007fA !G";
                    n = 51;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    s = "\u001d`E7";
                    n = 52;
                    n2 = 53;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    array = z2;
                    s = "}oM%'";
                    n = 53;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "RdQ\";Zn\u001b9:Go[$zRiA9;]$e\u0019\u0017x";
                    n = 54;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "RdQ\";Zn\u001b9:Go[$zRiA9;]$e\u0019\u0017x";
                    n = 55;
                    array = z2;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "RdQ\";Zn\u001b9:Go[$zRiA9;]$e\u0019\u0017x";
                    n = 56;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "^\u007fF97";
                    n = 57;
                    array = z2;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "^eA?&\\fT~7^z";
                    n = 58;
                    array = z2;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "RdQ\";Zn\u001b9:Go[$zRiA9;]$e\u0019\u0017x";
                    n = 59;
                    array = z2;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    n2 = 61;
                    s = "PeX~#[kA#5Cz\u001b17GcZ>zdBt\u0004\u0007rZe\u000f\u0006vIz\u0002\u0010zDr";
                    n = 60;
                    array = z2;
                    continue;
                }
                case 60: {
                    array[n2] = intern;
                    n2 = 62;
                    s = "\\\u007fA !G";
                    n = 61;
                    array = z2;
                    continue;
                }
                case 61: {
                    array[n2] = intern;
                    n2 = 63;
                    s = "RdQ\";Zn\u001b9:Go[$zRiA9;]$r\u0015\u0000lIz\u001e\u0000vDa";
                    n = 62;
                    array = z2;
                    continue;
                }
                case 62: {
                    array[n2] = intern;
                    n2 = 64;
                    s = "RdQ\";Zn\u001b9:Go[$zVrA\"5\u001dy\\*1\u007fcX9 ";
                    n = 63;
                    array = z2;
                    continue;
                }
                case 63: {
                    array[n2] = intern;
                    n2 = 65;
                    s = "\u0013v\u0015";
                    n = 64;
                    array = z2;
                    continue;
                }
                case 64: {
                    array[n2] = intern;
                    n2 = 66;
                    s = "@e@>0AoV?&WoG";
                    n = 65;
                    array = z2;
                    continue;
                }
                case 65: {
                    array[n2] = intern;
                    n2 = 67;
                    s = "R\u007fQ9;\u001c ";
                    n = 66;
                    array = z2;
                    continue;
                }
                case 66: {
                    array[n2] = intern;
                    n2 = 68;
                    s = "R\u007fQ9;\u001c ";
                    n = 67;
                    array = z2;
                    continue;
                }
                case 67: {
                    array[n2] = intern;
                    n2 = 69;
                    s = "ZgT71\u001c ";
                    n = 68;
                    array = z2;
                    continue;
                }
                case 68: {
                    array[n2] = intern;
                    n2 = 70;
                    s = "RdQ\";Zn\u001b9:Go[$zVrA\"5\u001dC{\u0019\u0000zKy\u000f\u001d}^p\u001e\u0000`";
                    n = 69;
                    array = z2;
                    continue;
                }
                case 69: {
                    array[n2] = intern;
                    n2 = 71;
                    s = "^oQ95\u001el\\<1\u001e\u007fA98@%T $\u0013";
                    n = 70;
                    array = z2;
                    continue;
                }
                case 70: {
                    array[n2] = intern;
                    n2 = 72;
                    s = "Ee\\31AoV?&WoG";
                    n = 71;
                    array = z2;
                    continue;
                }
                case 71: {
                    array[n2] = intern;
                    n2 = 73;
                    s = "RdQ\";Zn\u001b=1WcT~5P~\\?:\u001d\\|\u0014\u0011|Uv\u0011\u0004g_g\u0015";
                    n = 72;
                    array = z2;
                    continue;
                }
                case 72: {
                    array[n2] = intern;
                    n2 = 74;
                    s = "RdQ\";Zn\u001b &\\|\\41A$x50Zkf$;Ao\u001b5,GxT~\u0019rRj\u0012\rgOf";
                    n = 73;
                    array = z2;
                    continue;
                }
                case 73: {
                    array[n2] = intern;
                    n2 = 75;
                    s = "\u0019 \u001f";
                    n = 74;
                    array = z2;
                    continue;
                }
                case 74: {
                    array[n2] = intern;
                    n2 = 76;
                    s = "eCq";
                    n = 75;
                    array = z2;
                    continue;
                }
                case 75: {
                    array[n2] = intern;
                    n2 = 77;
                    s = "c^a";
                    n = 76;
                    array = z2;
                    continue;
                }
                case 76: {
                    array[n2] = intern;
                    n2 = 78;
                    s = "r_q";
                    n = 77;
                    array = z2;
                    continue;
                }
                case 77: {
                    array[n2] = intern;
                    n2 = 79;
                    s = "zGr";
                    n = 78;
                    array = z2;
                    continue;
                }
                case 78: {
                    array[n2] = intern;
                    n2 = 80;
                    s = "@kX 8VUG? R~P\u000f=^kR5{@iT<1\u001c";
                    n = 79;
                    array = z2;
                    continue;
                }
                case 79: {
                    array[n2] = intern;
                    n2 = 81;
                    s = "\u0013v\u0015";
                    n = 80;
                    array = z2;
                    continue;
                }
                case 80: {
                    array[n2] = intern;
                    n2 = 82;
                    s = "@kX 8VUG? R~P\u000f=^kR5{WoV?0V%Z% \u001eeS}9VgZ\"-";
                    n = 81;
                    array = z2;
                    continue;
                }
                case 81: {
                    array[n2] = intern;
                    n2 = 83;
                    s = "@kX 8VUG? R~P\u000f=^kR5{]eA\u000f5lcX13V0";
                    n = 82;
                    array = z2;
                    continue;
                }
                case 82: {
                    array[n2] = intern;
                    n2 = 84;
                    s = "@kX 8VUG? R~P\u000f=^kR5{AeA1 V%Z% \u001eeS}9VgZ\"-";
                    n = 83;
                    array = z2;
                    continue;
                }
                case 83: {
                    array[n2] = intern;
                    n2 = 85;
                    s = "@kX 8VUG? R~P\u000f=^kR5{@iT<1\u001ce@$y\\l\u0018=1^eG)";
                    n = 84;
                    array = z2;
                    continue;
                }
                case 84: {
                    array[n2] = intern;
                    n2 = 86;
                    s = "@kX 8VUG? R~P\u000f=^kR5{AeA1 V";
                    n = 85;
                    array = z2;
                    continue;
                }
                case 85: {
                    array[n2] = intern;
                    n2 = 87;
                    s = "AoF35_o\u0015$<FgWp \\*\u0004`dK;\u0005`";
                    n = 86;
                    array = z2;
                    continue;
                }
                case 86: {
                    array[n2] = intern;
                    n2 = 88;
                    s = "\u001cbP93[~\u000f";
                    n = 87;
                    array = z2;
                    continue;
                }
                case 87: {
                    array[n2] = intern;
                    n2 = 89;
                    s = "\\x\\7\u000bGb@=6]k\\<{DcQ$<\t";
                    n = 88;
                    array = z2;
                    continue;
                }
                case 88: {
                    array[n2] = intern;
                    n2 = 90;
                    s = "RdQ\";Zn\u001b9:Go[$zRiA9;]$x\u0015\u0010zKj\u0003\u0017rD{\u0015\u0006lYv\u0011\u001alL|\u001c\u0011";
                    n = 89;
                    array = z2;
                    continue;
                }
                case 89: {
                    array[n2] = intern;
                    n2 = 91;
                    s = "ToA=1WcT4!AkA9;]yP3;]nF";
                    n = 90;
                    array = z2;
                    continue;
                }
                case 90: {
                    array[n2] = intern;
                    n2 = 92;
                    s = "UcY5";
                    n = 91;
                    array = z2;
                    continue;
                }
                case 91: {
                    array[n2] = intern;
                    n2 = 93;
                    s = "|x\\5:GkA9;]";
                    n = 92;
                    array = z2;
                    continue;
                }
                case 92: {
                    array[n2] = intern;
                    n2 = 94;
                    s = "lnT$5";
                    n = 93;
                    array = z2;
                    continue;
                }
                case 93: {
                    array[n2] = intern;
                    n2 = 95;
                    s = "^oQ95";
                    n = 94;
                    array = z2;
                    continue;
                }
                case 94: {
                    array[n2] = intern;
                    n2 = 96;
                    s = "Pe[$1]~";
                    n = 95;
                    array = z2;
                    continue;
                }
                case 95: {
                    array[n2] = intern;
                    n2 = 97;
                    s = "@kX 8VUG? R~P\u000f=^kR5{P\u007fG#;AU\\#\u000bVgE$-";
                    n = 96;
                    array = z2;
                    continue;
                }
                case 96: {
                    array[n2] = intern;
                    n2 = 98;
                    s = "\\x\\5:GkA9;]";
                    n = 97;
                    array = z2;
                    continue;
                }
                case 97: {
                    array[n2] = intern;
                    n2 = 99;
                    s = "|x\\5:GkA9;]";
                    n = 98;
                    array = z2;
                    continue;
                }
                case 98: {
                    array[n2] = intern;
                    n2 = 100;
                    s = "@kX 8VUG? R~P\u000f=^kR5{]ej?&Zo[$5GcZ>\u000bZdS?";
                    n = 99;
                    array = z2;
                    continue;
                }
                case 99: {
                    array[n2] = intern;
                    n2 = 101;
                    s = "@kX 8VUG? R~P\u000f=^kR5{\\x\\5:GkA9;]*";
                    n = 100;
                    array = z2;
                    continue;
                }
                case 100: {
                    array[n2] = intern;
                    n2 = 102;
                    s = "^oQ95UcY5!GcY#{Zd\\$2ZfP3;FdA5&\u001cyT&1lzG52@US1=_oQ";
                    n = 101;
                    array = z2;
                    continue;
                }
                case 101: {
                    array[n2] = intern;
                    n2 = 103;
                    s = "PeX~#[kA#5Czj &VlP\"1]iP#";
                    n = 102;
                    array = z2;
                    continue;
                }
                case 102: {
                    array[n2] = intern;
                    n2 = 104;
                    s = "UcY5\u000bZdQ5,";
                    n = 103;
                    array = z2;
                    continue;
                }
                case 103: {
                    array[n2] = intern;
                    n2 = 105;
                    s = "^oQ95UcY5!GcY#{@o[49Vn\\12ZfPp'Ai\u000f";
                    n = 104;
                    array = z2;
                    continue;
                }
                case 104: {
                    array[n2] = intern;
                    n2 = 106;
                    s = "^oQ95UcY5!GcY#{@o[49Vn\\12ZfPp'VdQj";
                    n = 105;
                    array = z2;
                    continue;
                }
                case 105: {
                    array[n2] = intern;
                    n2 = 107;
                    s = "AoY55@o";
                    n = 106;
                    array = z2;
                    continue;
                }
                case 106: {
                    array[n2] = intern;
                    n2 = 108;
                    s = "AoY55@o";
                    n = 107;
                    array = z2;
                    continue;
                }
                case 107: {
                    array[n2] = intern;
                    n2 = 109;
                    s = "PkE$!Aos\"5^o";
                    n = 108;
                    array = z2;
                    continue;
                }
                case 108: {
                    array[n2] = intern;
                    n2 = 110;
                    s = "AoY55@o";
                    n = 109;
                    array = z2;
                    continue;
                }
                case 109: {
                    array[n2] = intern;
                    n2 = 111;
                    s = "AoY55@o";
                    n = 110;
                    array = z2;
                    continue;
                }
                case 110: {
                    array[n2] = intern;
                    n2 = 112;
                    s = "@oA\u00145Gkf?!AiP";
                    n = 111;
                    array = z2;
                    continue;
                }
                case 111: {
                    array[n2] = intern;
                    n2 = 113;
                    s = "AoY55@o";
                    n = 112;
                    array = z2;
                    continue;
                }
                case 112: {
                    array[n2] = intern;
                    n2 = 114;
                    s = "AoY55@o";
                    n = 113;
                    array = z2;
                    continue;
                }
                case 113: {
                    array[n2] = intern;
                    n2 = 115;
                    s = "AoY55@o";
                    n = 114;
                    array = z2;
                    continue;
                }
                case 114: {
                    array[n2] = intern;
                    n2 = 116;
                    s = "AoY55@o";
                    n = 115;
                    array = z2;
                    continue;
                }
                case 115: {
                    array[n2] = intern;
                    n2 = 117;
                    s = "AoY55@o";
                    n = 116;
                    array = z2;
                    continue;
                }
                case 116: {
                    array[n2] = intern;
                    n2 = 118;
                    s = "AoY55@o";
                    n = 117;
                    array = z2;
                    continue;
                }
                case 117: {
                    array[n2] = intern;
                    n2 = 119;
                    s = "ToA\u00159QoQ41WZ\\3 FxP";
                    n = 118;
                    array = z2;
                    continue;
                }
                case 118: {
                    array[n2] = intern;
                    n2 = 120;
                    s = "^oQ95UcY5!GcY#{AeA1 V*C90Ve\u0015$<FgWp";
                    n = 119;
                    array = z2;
                    continue;
                }
                case 119: {
                    array[n2] = intern;
                    n2 = 121;
                    s = "ToA\u0016&RgP\u0011 gcX5";
                    n = 120;
                    array = z2;
                    continue;
                }
                case 120: {
                    array[n2] = intern;
                    n2 = 122;
                    s = "RdQ\";Zn\u001b=1WcT~\u0019Vn\\1\u0019V~T45Gkg5 AcP&1A";
                    n = 121;
                    array = z2;
                    continue;
                }
                case 121: {
                    array[n2] = intern;
                    n2 = 123;
                    s = "^oQ95UcY5!GcY#{PkY3!_kA59Vn\\1<Ry]p";
                    n = 122;
                    array = z2;
                    continue;
                }
                case 122: {
                    array[n2] = intern;
                    n2 = 124;
                    s = "^oQ95UcY5!GcY#{PkY3!_kA59Vn\\1<Ry]\u007f7_eF5t";
                    n = 123;
                    array = z2;
                    continue;
                }
                case 123: {
                    array[n2] = intern;
                    n2 = 125;
                    s = "^oQ95UcY5!GcY#{PkY3!_kA59Vn\\1<Ry]\u007f0ZmP# Vx\u0015";
                    n = 124;
                    array = z2;
                    continue;
                }
                case 124: {
                    array[n2] = intern;
                    n2 = 126;
                    s = "^oQ95UcY5!GcY#{PkY3!_kA59Vn\\1<Ry]\u007f7_eF5t";
                    n = 125;
                    array = z2;
                    continue;
                }
                case 125: {
                    array[n2] = intern;
                    n2 = 127;
                    s = "`Bt}f\u0006<";
                    n = 126;
                    array = z2;
                    continue;
                }
                case 126: {
                    array[n2] = intern;
                    n2 = 128;
                    s = "^oQ95UcY5!GcY#{PkY3!_kA59Vn\\1<Ry]\u007f0ZmP# Vx\u00159'\u0013d@<8";
                    n = 127;
                    array = z2;
                    continue;
                }
                case 127: {
                    array[n2] = intern;
                    n2 = 129;
                    s = "^oQ95UcY5!GcY#{PkY3!_kA59Vn\\1<Ry]\u007f7_eF5t";
                    n = 128;
                    array = z2;
                    continue;
                }
                case 128: {
                    array[n2] = intern;
                    n2 = 130;
                    s = "^oQ95UcY5!GcY#{PbP3?^oQ95UcY5'ZpPp'Ai\u000f";
                    n = 129;
                    array = z2;
                    continue;
                }
                case 129: {
                    array[n2] = intern;
                    n2 = 131;
                    s = "^oQ95UcY5!GcY#{PbP3?^oQ95UcY5'ZpP\u007f \\e\u0015<5AmPj";
                    n = 130;
                    array = z2;
                    continue;
                }
                case 130: {
                    array[n2] = intern;
                    n2 = 132;
                    s = "]kA9\"V*]55C*F9.V0";
                    n = 131;
                    array = z2;
                    continue;
                }
                case 131: {
                    array[n2] = intern;
                    n2 = 133;
                    s = "\u0013aw";
                    n = 132;
                    array = z2;
                    continue;
                }
                case 132: {
                    array[n2] = intern;
                    n2 = 134;
                    s = "UcY5";
                    n = 133;
                    array = z2;
                    continue;
                }
                case 133: {
                    array[n2] = intern;
                    n2 = 135;
                    s = "UcY5";
                    n = 134;
                    array = z2;
                    continue;
                }
                case 134: {
                    array[n2] = intern;
                    n2 = 136;
                    s = "lnT$5";
                    n = 135;
                    array = z2;
                    continue;
                }
                case 135: {
                    array[n2] = intern;
                    n2 = 137;
                    s = "RdQ\";Zn\u001b9:Go[$zRiA9;]$e\u0019\u0017x";
                    n = 136;
                    array = z2;
                    continue;
                }
                case 136: {
                    array[n2] = intern;
                    n2 = 138;
                    s = "^kM\u000f=GoX#";
                    n = 137;
                    array = z2;
                    continue;
                }
                case 137: {
                    array[n2] = intern;
                    n2 = 139;
                    s = "ZgT71\u001c ";
                    n = 138;
                    array = z2;
                    continue;
                }
                case 138: {
                    array[n2] = intern;
                    n2 = 140;
                    s = "AoV9$Zo[$";
                    n = 139;
                    array = z2;
                    continue;
                }
                case 139: {
                    array[n2] = intern;
                    n2 = 141;
                    s = "@kX 8VUG? R~P\u000f=^kR5{DcQ$<\u000e";
                    n = 140;
                    array = z2;
                    continue;
                }
                case 140: {
                    array[n2] = intern;
                    n2 = 142;
                    s = "\u0013v\u0015#5^zY5\u000b@cO5i";
                    n = 141;
                    array = z2;
                    continue;
                }
                case 141: {
                    array[n2] = intern;
                    n2 = 143;
                    s = "@kX 8VUG? R~P\u000f=^kR5{]eA\u000f5lcX13V0";
                    n = 142;
                    array = z2;
                    continue;
                }
                case 142: {
                    array[n2] = intern;
                    n2 = 144;
                    s = "}e\u00156=_o\u0015";
                    n = 143;
                    array = z2;
                    continue;
                }
                case 143: {
                    array[n2] = intern;
                    n2 = 145;
                    s = "@kX 8VUG? R~P\u000f=^kR5{Pk[w \u0013fZ10\u0013c[ !GyA\"1Rg";
                    n = 144;
                    array = z2;
                    continue;
                }
                case 144: {
                    array[n2] = intern;
                    n2 = 146;
                    s = "pk[>;G*Y?5W*W9 ^kEp'GxP19\u0013";
                    n = 145;
                    array = z2;
                    continue;
                }
                case 145: {
                    array[n2] = intern;
                    n2 = 147;
                    s = "\u0013v\u001581Zm]$i";
                    n = 146;
                    array = z2;
                    continue;
                }
                case 146: {
                    array[n2] = intern;
                    n2 = 148;
                    s = "@kX 8VUG? R~P\u000f=^kR5{CxP61A{@18Z~L\u007f1AxZ\"t@n^9:G7";
                    n = 147;
                    array = z2;
                    continue;
                }
                case 147: {
                    array[n2] = intern;
                    n2 = 149;
                    s = "AoQ17GoQ&1Ay\\?:\u001cdZ$yFxY";
                    n = 148;
                    array = z2;
                    continue;
                }
                case 148: {
                    array[n2] = intern;
                    n2 = 150;
                    s = "\u0019 \u001f";
                    n = 149;
                    array = z2;
                    continue;
                }
                case 149: {
                    array[n2] = intern;
                    n2 = 151;
                    s = "\u0019 \u001f";
                    n = 150;
                    array = z2;
                    continue;
                }
                case 150: {
                    array[n2] = intern;
                    n2 = 152;
                    s = "R\u007fQ9;";
                    n = 151;
                    array = z2;
                    continue;
                }
                case 151: {
                    array[n2] = intern;
                    n2 = 153;
                    s = "GoM${K'C35An";
                    n = 152;
                    array = z2;
                    continue;
                }
                case 152: {
                    array[n2] = intern;
                    n2 = 154;
                    s = "EcQ5;";
                    n = 153;
                    array = z2;
                    continue;
                }
                case 153: {
                    array[n2] = intern;
                    n2 = 155;
                    s = "GoM$";
                    n = 154;
                    array = z2;
                    continue;
                }
                case 154: {
                    array[n2] = intern;
                    n2 = 156;
                    s = "ZgT71";
                    n = 155;
                    array = z2;
                    continue;
                }
                case 155: {
                    array[n2] = intern;
                    n2 = 157;
                    s = "AeA1 Ze[";
                    n = 156;
                    array = z2;
                    continue;
                }
                case 156: {
                    array[n2] = intern;
                    n2 = 158;
                    s = "PkE$=\\d";
                    n = 157;
                    array = z2;
                    continue;
                }
                case 157: {
                    array[n2] = intern;
                    n2 = 159;
                    s = "\u0003:\u0005`";
                    n = 158;
                    array = z2;
                    continue;
                }
                case 158: {
                    break Label_4096;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        e = new DecimalFormat(br.z[159], new DecimalFormatSymbols(Locale.US));
        br.c = -1;
        br.a = new BitmapFactory$Options();
        br.a.inDither = true;
        br.f = new u(10);
    }
    
    public static float a(final int n, final int n2, final long n3) {
        if (n == 0 || n2 == 0) {
            return 3.0f;
        }
        final float n4 = 8000.0f * (1024 * (1024 * ym.k)) / (96000 + 3 * (n * n2));
        final float n5 = Math.max(0.0f, n4 - n3) / n4;
        return 3.0f + n5 * (6.0f * n5);
    }
    
    public static int a(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/os/Build$VERSION.SDK_INT:I
        //     3: istore_3       
        //     4: iconst_0       
        //     5: istore          4
        //     7: iload_3        
        //     8: bipush          10
        //    10: if_icmplt       97
        //    13: iconst_0       
        //    14: istore          4
        //    16: aload_0        
        //    17: ifnull          97
        //    20: aload_0        
        //    21: invokevirtual   java/io/File.exists:()Z
        //    24: istore          5
        //    26: iconst_0       
        //    27: istore          4
        //    29: iload           5
        //    31: ifeq            97
        //    34: new             Landroid/media/MediaMetadataRetriever;
        //    37: dup            
        //    38: invokespecial   android/media/MediaMetadataRetriever.<init>:()V
        //    41: astore          6
        //    43: aload           6
        //    45: aload_0        
        //    46: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    49: invokevirtual   android/media/MediaMetadataRetriever.setDataSource:(Ljava/lang/String;)V
        //    52: aload           6
        //    54: bipush          9
        //    56: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //    59: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    62: lstore          8
        //    64: lload           8
        //    66: ldc2_w          1000
        //    69: ldiv           
        //    70: lstore          10
        //    72: lload           10
        //    74: l2i            
        //    75: istore          4
        //    77: iload           4
        //    79: ifne            92
        //    82: lload           8
        //    84: lconst_0       
        //    85: lcmp           
        //    86: ifeq            92
        //    89: iconst_1       
        //    90: istore          4
        //    92: aload           6
        //    94: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //    97: iload           4
        //    99: ireturn        
        //   100: astore_1       
        //   101: aload_1        
        //   102: athrow         
        //   103: astore_2       
        //   104: aload_2        
        //   105: athrow         
        //   106: astore          7
        //   108: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   111: bipush          91
        //   113: aaload         
        //   114: aload           7
        //   116: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   119: iconst_0       
        //   120: istore          4
        //   122: goto            92
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      4      100    103    Ljava/lang/Exception;
        //  20     26     103    106    Ljava/lang/Exception;
        //  43     72     106    125    Ljava/lang/Exception;
        //  101    103    103    106    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 65, Size: 65
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
    
    public static int a(final InputStream inputStream, final OutputStream outputStream) {
        final boolean l = Log.l;
        final byte[] array = new byte[4096];
        int n = 0;
        do {
            final int read = inputStream.read(array, 0, array.length);
            if (read < 0) {
                break;
            }
            outputStream.write(array, 0, read);
            n += read;
        } while (!l);
        return n;
    }
    
    private static int a(final String p0, final byte p1, final int p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore          4
        //     5: iconst_m1      
        //     6: istore          5
        //     8: iload_1        
        //     9: iload_2        
        //    10: iload_3        
        //    11: invokestatic    com/whatsapp/qf.a:(BIZ)Ljava/io/File;
        //    14: astore          6
        //    16: aload           6
        //    18: invokevirtual   java/io/File.exists:()Z
        //    21: istore          7
        //    23: iconst_0       
        //    24: istore          8
        //    26: iload           7
        //    28: ifeq            231
        //    31: aload           6
        //    33: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //    36: astore          9
        //    38: iconst_0       
        //    39: istore          8
        //    41: aload           9
        //    43: ifnull          192
        //    46: new             Ljava/lang/StringBuilder;
        //    49: dup            
        //    50: invokespecial   java/lang/StringBuilder.<init>:()V
        //    53: iload_1        
        //    54: iload_2        
        //    55: invokestatic    com/whatsapp/util/br.a:(II)Ljava/lang/String;
        //    58: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    61: ldc_w           "-"
        //    64: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    67: aload_0        
        //    68: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    71: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //    74: bipush          27
        //    76: aaload         
        //    77: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    80: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    83: astore          11
        //    85: aload           9
        //    87: arraylength    
        //    88: istore          12
        //    90: aload           9
        //    92: arraylength    
        //    93: istore          13
        //    95: iconst_0       
        //    96: istore          14
        //    98: iload           14
        //   100: iload           13
        //   102: if_icmpge       369
        //   105: aload           9
        //   107: iload           14
        //   109: aaload         
        //   110: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   113: astore          16
        //   115: aload           16
        //   117: aload           11
        //   119: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   122: ifeq            335
        //   125: aload           16
        //   127: invokevirtual   java/lang/String.length:()I
        //   130: istore          19
        //   132: iload           19
        //   134: bipush          19
        //   136: if_icmple       335
        //   139: aload           16
        //   141: bipush          15
        //   143: bipush          19
        //   145: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   148: astore          20
        //   150: aload           20
        //   152: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   155: istore          22
        //   157: iload           22
        //   159: istore          15
        //   161: iload           15
        //   163: iload           5
        //   165: if_icmple       335
        //   168: iload           14
        //   170: iconst_1       
        //   171: iadd           
        //   172: istore          18
        //   174: iload           4
        //   176: ifeq            358
        //   179: iload           4
        //   181: ifeq            347
        //   184: iload           15
        //   186: istore          5
        //   188: iload           12
        //   190: istore          8
        //   192: new             Ljava/lang/StringBuilder;
        //   195: dup            
        //   196: invokespecial   java/lang/StringBuilder.<init>:()V
        //   199: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   202: bipush          26
        //   204: aaload         
        //   205: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   208: iload_1        
        //   209: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   212: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   215: bipush          23
        //   217: aaload         
        //   218: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   221: iload_2        
        //   222: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   225: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   228: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   231: new             Ljava/lang/StringBuilder;
        //   234: dup            
        //   235: invokespecial   java/lang/StringBuilder.<init>:()V
        //   238: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   241: bipush          25
        //   243: aaload         
        //   244: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   247: iload_1        
        //   248: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   251: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   254: bipush          24
        //   256: aaload         
        //   257: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   260: iload_2        
        //   261: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   264: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   267: bipush          29
        //   269: aaload         
        //   270: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   273: iload           5
        //   275: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   278: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   281: bipush          28
        //   283: aaload         
        //   284: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   287: iload           8
        //   289: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   292: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   295: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   298: iload           5
        //   300: ireturn        
        //   301: astore          17
        //   303: aload           17
        //   305: athrow         
        //   306: astore          21
        //   308: new             Ljava/lang/StringBuilder;
        //   311: dup            
        //   312: invokespecial   java/lang/StringBuilder.<init>:()V
        //   315: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   318: bipush          30
        //   320: aaload         
        //   321: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   324: aload           16
        //   326: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   329: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   332: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   335: iload           5
        //   337: istore          15
        //   339: goto            168
        //   342: astore          10
        //   344: aload           10
        //   346: athrow         
        //   347: iload           15
        //   349: istore          5
        //   351: iload           12
        //   353: istore          8
        //   355: goto            231
        //   358: iload           18
        //   360: istore          14
        //   362: iload           15
        //   364: istore          5
        //   366: goto            98
        //   369: iload           5
        //   371: istore          15
        //   373: goto            179
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  115    132    301    306    Ljava/lang/NumberFormatException;
        //  150    157    306    335    Ljava/lang/NumberFormatException;
        //  192    231    342    347    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 173, Size: 173
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
    
    public static Bitmap a(final Bitmap bitmap, final int n, final float n2) {
        while (true) {
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled()) {
                        return null;
                    }
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
                final Bitmap bitmap2 = Bitmap.createBitmap(n, n, Bitmap$Config.ARGB_8888);
                final Canvas canvas = new Canvas(bitmap2);
                final Paint paint = new Paint();
                final RectF rectF = new RectF(0.0f, 0.0f, (float)n, (float)n);
                final int n3 = (bitmap.getWidth() - bitmap.getHeight()) / 2;
                Rect rect = null;
                Label_0136: {
                    if (n3 > 0) {
                        rect = new Rect(n3, 0, bitmap.getWidth() - n3, bitmap.getHeight());
                        if (!Log.l) {
                            break Label_0136;
                        }
                    }
                    rect = new Rect(0, -n3, bitmap.getWidth(), n3 + bitmap.getHeight());
                }
                paint.setAntiAlias(true);
                paint.setDither(true);
                paint.setFilterBitmap(true);
                canvas.drawARGB(0, 0, 0, 0);
                paint.setColor(-1);
                canvas.drawRoundRect(rectF, n2, n2, paint);
                paint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.SRC_IN));
                canvas.drawBitmap(bitmap, rect, rectF, paint);
                return bitmap2;
            }
            continue;
        }
    }
    
    public static Bitmap a(final Uri uri, final int n, final int n2) {
        Label_0018: {
            if (uri == null) {
                break Label_0018;
            }
            try {
                if (TextUtils.isEmpty((CharSequence)uri.toString())) {
                    try {
                        throw new FileNotFoundException(br.z[16] + uri);
                    }
                    catch (OutOfMemoryError outOfMemoryError) {
                        throw outOfMemoryError;
                    }
                }
            }
            catch (OutOfMemoryError outOfMemoryError2) {
                throw outOfMemoryError2;
            }
        }
        Log.i(br.z[18] + uri.toString());
        final Matrix a = a(uri);
        final BitmapFactory$Options a2 = a(uri, n);
        while (true) {
            try {
                final Bitmap bitmap = a(uri, n, n2, a2, a);
                Log.i(br.z[15] + bitmap.getWidth() + br.z[17] + bitmap.getHeight());
                return bitmap;
            }
            catch (OutOfMemoryError outOfMemoryError3) {
                a2.inSampleSize *= 2;
                Log.i(br.z[19] + a2.inSampleSize);
                final Bitmap bitmap = a(uri, n, n2, a2, a);
                continue;
            }
            break;
        }
    }
    
    private static Bitmap a(final Uri p0, final int p1, final int p2, final BitmapFactory$Options p3, final Matrix p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokestatic    com/whatsapp/util/br.f:(Landroid/net/Uri;)Ljava/io/InputStream;
        //     4: astore          5
        //     6: aload           5
        //     8: aconst_null    
        //     9: aload_3        
        //    10: invokestatic    android/graphics/BitmapFactory.decodeStream:(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //    13: astore          7
        //    15: aload           5
        //    17: invokevirtual   java/io/InputStream.close:()V
        //    20: aload           7
        //    22: ifnull          49
        //    25: aload           7
        //    27: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //    30: istore          11
        //    32: iload           11
        //    34: ifeq            49
        //    37: aload           7
        //    39: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //    42: istore          12
        //    44: iload           12
        //    46: ifne            117
        //    49: new             Ljava/lang/StringBuilder;
        //    52: dup            
        //    53: invokespecial   java/lang/StringBuilder.<init>:()V
        //    56: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //    59: bipush          83
        //    61: aaload         
        //    62: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    65: aload_0        
        //    66: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    69: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    72: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    75: new             Lcom/whatsapp/util/av;
        //    78: dup            
        //    79: invokespecial   com/whatsapp/util/av.<init>:()V
        //    82: athrow         
        //    83: astore          8
        //    85: aload           8
        //    87: athrow         
        //    88: astore          6
        //    90: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //    93: bipush          82
        //    95: aaload         
        //    96: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    99: aload           5
        //   101: invokevirtual   java/io/InputStream.close:()V
        //   104: aload           6
        //   106: athrow         
        //   107: astore          9
        //   109: aload           9
        //   111: athrow         
        //   112: astore          10
        //   114: aload           10
        //   116: athrow         
        //   117: aload           4
        //   119: ifnull          169
        //   122: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   125: bipush          86
        //   127: aaload         
        //   128: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   131: aload           7
        //   133: iconst_0       
        //   134: iconst_0       
        //   135: aload           7
        //   137: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   140: aload           7
        //   142: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   145: aload           4
        //   147: iconst_1       
        //   148: invokestatic    android/graphics/Bitmap.createBitmap:(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
        //   151: astore          29
        //   153: aload           7
        //   155: aload           29
        //   157: if_acmpeq       165
        //   160: aload           7
        //   162: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   165: aload           29
        //   167: astore          7
        //   169: iload_2        
        //   170: ifle            451
        //   173: aload           7
        //   175: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   178: istore          15
        //   180: iload           15
        //   182: iload_2        
        //   183: if_icmpgt       199
        //   186: aload           7
        //   188: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   191: istore          27
        //   193: iload           27
        //   195: iload_2        
        //   196: if_icmple       451
        //   199: new             Ljava/lang/StringBuilder;
        //   202: dup            
        //   203: invokespecial   java/lang/StringBuilder.<init>:()V
        //   206: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   209: bipush          80
        //   211: aaload         
        //   212: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   215: aload           7
        //   217: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   220: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   223: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   226: bipush          81
        //   228: aaload         
        //   229: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   232: aload           7
        //   234: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   237: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   240: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   243: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   246: aload           7
        //   248: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   251: i2f            
        //   252: iload_1        
        //   253: i2f            
        //   254: fdiv           
        //   255: aload           7
        //   257: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   260: i2f            
        //   261: iload_1        
        //   262: i2f            
        //   263: fdiv           
        //   264: invokestatic    java/lang/Math.max:(FF)F
        //   267: fstore          16
        //   269: new             Landroid/graphics/Rect;
        //   272: dup            
        //   273: iconst_0       
        //   274: iconst_0       
        //   275: aload           7
        //   277: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   280: i2f            
        //   281: fload           16
        //   283: fdiv           
        //   284: f2i            
        //   285: aload           7
        //   287: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   290: i2f            
        //   291: fload           16
        //   293: fdiv           
        //   294: f2i            
        //   295: invokespecial   android/graphics/Rect.<init>:(IIII)V
        //   298: astore          17
        //   300: aload           17
        //   302: aload           17
        //   304: getfield        android/graphics/Rect.right:I
        //   307: iconst_1       
        //   308: invokestatic    java/lang/Math.max:(II)I
        //   311: putfield        android/graphics/Rect.right:I
        //   314: aload           17
        //   316: aload           17
        //   318: getfield        android/graphics/Rect.bottom:I
        //   321: iconst_1       
        //   322: invokestatic    java/lang/Math.max:(II)I
        //   325: putfield        android/graphics/Rect.bottom:I
        //   328: new             Landroid/graphics/Rect;
        //   331: dup            
        //   332: iconst_0       
        //   333: iconst_0       
        //   334: aload           7
        //   336: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   339: aload           7
        //   341: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   344: invokespecial   android/graphics/Rect.<init>:(IIII)V
        //   347: astore          18
        //   349: aload           7
        //   351: invokevirtual   android/graphics/Bitmap.getConfig:()Landroid/graphics/Bitmap$Config;
        //   354: astore          19
        //   356: aload           17
        //   358: invokevirtual   android/graphics/Rect.width:()I
        //   361: istore          22
        //   363: aload           17
        //   365: invokevirtual   android/graphics/Rect.height:()I
        //   368: istore          23
        //   370: aload           19
        //   372: ifnonnull       380
        //   375: getstatic       android/graphics/Bitmap$Config.ARGB_8888:Landroid/graphics/Bitmap$Config;
        //   378: astore          19
        //   380: iload           22
        //   382: iload           23
        //   384: aload           19
        //   386: invokestatic    android/graphics/Bitmap.createBitmap:(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
        //   389: astore          24
        //   391: new             Landroid/graphics/Canvas;
        //   394: dup            
        //   395: aload           24
        //   397: invokespecial   android/graphics/Canvas.<init>:(Landroid/graphics/Bitmap;)V
        //   400: astore          25
        //   402: new             Landroid/graphics/Paint;
        //   405: dup            
        //   406: invokespecial   android/graphics/Paint.<init>:()V
        //   409: astore          26
        //   411: aload           26
        //   413: iconst_1       
        //   414: invokevirtual   android/graphics/Paint.setAntiAlias:(Z)V
        //   417: aload           26
        //   419: iconst_1       
        //   420: invokevirtual   android/graphics/Paint.setFilterBitmap:(Z)V
        //   423: aload           26
        //   425: iconst_1       
        //   426: invokevirtual   android/graphics/Paint.setDither:(Z)V
        //   429: aload           25
        //   431: aload           7
        //   433: aload           18
        //   435: aload           17
        //   437: aload           26
        //   439: invokevirtual   android/graphics/Canvas.drawBitmap:(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
        //   442: aload           7
        //   444: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   447: aload           24
        //   449: astore          7
        //   451: aload           7
        //   453: areturn        
        //   454: astore          28
        //   456: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   459: bipush          84
        //   461: aaload         
        //   462: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   465: aload           7
        //   467: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   470: aload           28
        //   472: athrow         
        //   473: astore          30
        //   475: aload           30
        //   477: athrow         
        //   478: astore          13
        //   480: aload           13
        //   482: athrow         
        //   483: astore          14
        //   485: aload           14
        //   487: athrow         
        //   488: astore          20
        //   490: aload           20
        //   492: athrow         
        //   493: astore          21
        //   495: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   498: bipush          85
        //   500: aaload         
        //   501: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   504: aload           7
        //   506: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   509: aload           21
        //   511: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  6      20     88     107    Ljava/lang/OutOfMemoryError;
        //  25     32     107    112    Ljava/lang/OutOfMemoryError;
        //  37     44     112    117    Ljava/lang/OutOfMemoryError;
        //  49     83     83     88     Ljava/lang/OutOfMemoryError;
        //  109    112    112    117    Ljava/lang/OutOfMemoryError;
        //  114    117    83     88     Ljava/lang/OutOfMemoryError;
        //  131    153    454    473    Ljava/lang/OutOfMemoryError;
        //  160    165    473    478    Ljava/lang/OutOfMemoryError;
        //  173    180    478    483    Ljava/lang/OutOfMemoryError;
        //  186    193    483    488    Ljava/lang/OutOfMemoryError;
        //  356    370    488    493    Ljava/lang/OutOfMemoryError;
        //  375    380    488    493    Ljava/lang/OutOfMemoryError;
        //  380    391    493    512    Ljava/lang/OutOfMemoryError;
        //  480    483    483    488    Ljava/lang/OutOfMemoryError;
        //  490    493    493    512    Ljava/lang/OutOfMemoryError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 244, Size: 244
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
    
    public static Bitmap a(final Uri p0, final File p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_2       
        //     2: iconst_1       
        //     3: istore_3       
        //     4: aload_1        
        //     5: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //     8: astore          4
        //    10: aload           4
        //    12: ifnull          21
        //    15: aload           4
        //    17: invokevirtual   java/io/File.mkdirs:()Z
        //    20: pop            
        //    21: aload_0        
        //    22: invokestatic    com/whatsapp/util/br.a:(Landroid/net/Uri;)Landroid/graphics/Matrix;
        //    25: astore          5
        //    27: aload_0        
        //    28: getstatic       com/whatsapp/ym.j:I
        //    31: invokestatic    com/whatsapp/util/br.a:(Landroid/net/Uri;I)Landroid/graphics/BitmapFactory$Options;
        //    34: astore          6
        //    36: aload           5
        //    38: ifnonnull       268
        //    41: aload           6
        //    43: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //    46: istore          16
        //    48: getstatic       com/whatsapp/ym.j:I
        //    51: istore          17
        //    53: iload           16
        //    55: iload           17
        //    57: if_icmpgt       268
        //    60: aload           6
        //    62: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //    65: istore          18
        //    67: getstatic       com/whatsapp/ym.j:I
        //    70: istore          19
        //    72: iload           18
        //    74: iload           19
        //    76: if_icmpgt       268
        //    79: aload_0        
        //    80: invokestatic    com/whatsapp/util/br.d:(Landroid/net/Uri;)Z
        //    83: istore          20
        //    85: iload           20
        //    87: ifeq            268
        //    90: new             Ljava/lang/StringBuilder;
        //    93: dup            
        //    94: invokespecial   java/lang/StringBuilder.<init>:()V
        //    97: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   100: bipush          47
        //   102: aaload         
        //   103: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   106: aload_0        
        //   107: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   110: ldc_w           " "
        //   113: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   116: aload           6
        //   118: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //   121: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   124: ldc_w           "x"
        //   127: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   130: aload           6
        //   132: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //   135: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   138: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   141: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   144: new             Ljava/io/FileOutputStream;
        //   147: dup            
        //   148: aload_1        
        //   149: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   152: astore          21
        //   154: aload_0        
        //   155: invokestatic    com/whatsapp/util/br.f:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   158: astore_2       
        //   159: aload_2        
        //   160: aload           21
        //   162: invokestatic    com/whatsapp/util/br.a:(Ljava/io/InputStream;Ljava/io/OutputStream;)I
        //   165: istore          25
        //   167: iload           25
        //   169: ifeq            195
        //   172: iload           25
        //   174: i2l            
        //   175: lstore          27
        //   177: getstatic       com/whatsapp/ym.l:I
        //   180: istore          31
        //   182: lload           27
        //   184: ldc2_w          1024
        //   187: iload           31
        //   189: i2l            
        //   190: lmul           
        //   191: lcmp           
        //   192: ifle            414
        //   195: new             Ljava/lang/StringBuilder;
        //   198: dup            
        //   199: invokespecial   java/lang/StringBuilder.<init>:()V
        //   202: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   205: bipush          43
        //   207: aaload         
        //   208: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   211: iload           25
        //   213: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   216: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   219: bipush          45
        //   221: aaload         
        //   222: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   225: getstatic       com/whatsapp/ym.l:I
        //   228: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   231: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   234: bipush          48
        //   236: aaload         
        //   237: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   240: iload_3        
        //   241: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   244: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   247: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   250: aload_2        
        //   251: ifnull          258
        //   254: aload_2        
        //   255: invokevirtual   java/io/InputStream.close:()V
        //   258: aload           21
        //   260: ifnull          268
        //   263: aload           21
        //   265: invokevirtual   java/io/OutputStream.close:()V
        //   268: iload_3        
        //   269: ifeq            505
        //   272: aload_0        
        //   273: getstatic       com/whatsapp/ym.j:I
        //   276: getstatic       com/whatsapp/ym.j:I
        //   279: aload           6
        //   281: aload           5
        //   283: invokestatic    com/whatsapp/util/br.a:(Landroid/net/Uri;IILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Matrix;)Landroid/graphics/Bitmap;
        //   286: astore          12
        //   288: aload           12
        //   290: astore          8
        //   292: new             Ljava/io/FileOutputStream;
        //   295: dup            
        //   296: aload_1        
        //   297: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   300: astore          9
        //   302: aload           8
        //   304: getstatic       android/graphics/Bitmap$CompressFormat.JPEG:Landroid/graphics/Bitmap$CompressFormat;
        //   307: getstatic       com/whatsapp/ym.p:I
        //   310: aload           9
        //   312: invokevirtual   android/graphics/Bitmap.compress:(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
        //   315: istore          10
        //   317: aload           9
        //   319: invokevirtual   java/io/OutputStream.close:()V
        //   322: aload           8
        //   324: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   327: iload           10
        //   329: ifne            505
        //   332: invokestatic    com/whatsapp/App.C:()J
        //   335: sipush          1024
        //   338: getstatic       com/whatsapp/ym.l:I
        //   341: imul           
        //   342: i2l            
        //   343: lcmp           
        //   344: ifge            497
        //   347: new             Ljava/io/IOException;
        //   350: dup            
        //   351: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   354: bipush          46
        //   356: aaload         
        //   357: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   360: athrow         
        //   361: astore          11
        //   363: aload           11
        //   365: athrow         
        //   366: astore          13
        //   368: aload           13
        //   370: athrow         
        //   371: astore          14
        //   373: aload           14
        //   375: athrow         
        //   376: astore          15
        //   378: aload           15
        //   380: athrow         
        //   381: astore          29
        //   383: aload           29
        //   385: athrow         
        //   386: astore          30
        //   388: aload           30
        //   390: athrow         
        //   391: astore          22
        //   393: aload_2        
        //   394: ifnull          401
        //   397: aload_2        
        //   398: invokevirtual   java/io/InputStream.close:()V
        //   401: aload           21
        //   403: ifnull          411
        //   406: aload           21
        //   408: invokevirtual   java/io/OutputStream.close:()V
        //   411: aload           22
        //   413: athrow         
        //   414: iconst_0       
        //   415: istore_3       
        //   416: goto            195
        //   419: astore          26
        //   421: aload           26
        //   423: athrow         
        //   424: astore          24
        //   426: aload           24
        //   428: athrow         
        //   429: astore          23
        //   431: aload           23
        //   433: athrow         
        //   434: astore          7
        //   436: aload           6
        //   438: iconst_2       
        //   439: aload           6
        //   441: getfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   444: imul           
        //   445: putfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   448: new             Ljava/lang/StringBuilder;
        //   451: dup            
        //   452: invokespecial   java/lang/StringBuilder.<init>:()V
        //   455: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   458: bipush          44
        //   460: aaload         
        //   461: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   464: aload           6
        //   466: getfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   469: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   472: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   475: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   478: aload_0        
        //   479: getstatic       com/whatsapp/ym.j:I
        //   482: getstatic       com/whatsapp/ym.j:I
        //   485: aload           6
        //   487: aload           5
        //   489: invokestatic    com/whatsapp/util/br.a:(Landroid/net/Uri;IILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Matrix;)Landroid/graphics/Bitmap;
        //   492: astore          8
        //   494: goto            292
        //   497: new             Ljava/io/IOException;
        //   500: dup            
        //   501: invokespecial   java/io/IOException.<init>:()V
        //   504: athrow         
        //   505: aload_0        
        //   506: bipush          100
        //   508: bipush          100
        //   510: invokestatic    com/whatsapp/util/br.a:(Landroid/net/Uri;II)Landroid/graphics/Bitmap;
        //   513: areturn        
        //   514: astore          22
        //   516: aconst_null    
        //   517: astore_2       
        //   518: aconst_null    
        //   519: astore          21
        //   521: goto            393
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  41     53     366    371    Ljava/lang/OutOfMemoryError;
        //  60     72     371    376    Ljava/lang/OutOfMemoryError;
        //  79     85     376    381    Ljava/lang/OutOfMemoryError;
        //  144    154    514    524    Any
        //  154    167    391    393    Any
        //  177    182    381    391    Ljava/lang/OutOfMemoryError;
        //  177    182    391    393    Any
        //  195    250    391    393    Any
        //  263    268    419    424    Ljava/lang/OutOfMemoryError;
        //  272    288    434    497    Ljava/lang/OutOfMemoryError;
        //  332    361    361    366    Ljava/lang/OutOfMemoryError;
        //  368    371    371    376    Ljava/lang/OutOfMemoryError;
        //  373    376    376    381    Ljava/lang/OutOfMemoryError;
        //  383    386    386    391    Ljava/lang/OutOfMemoryError;
        //  383    386    391    393    Any
        //  388    391    391    393    Any
        //  397    401    424    429    Ljava/lang/OutOfMemoryError;
        //  406    411    429    434    Ljava/lang/OutOfMemoryError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 245, Size: 245
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
    
    private static BitmapFactory$Options a(final Uri uri, final int n) {
        final boolean l = Log.l;
        Label_0022: {
            if (uri == null) {
                break Label_0022;
            }
            try {
                if (TextUtils.isEmpty((CharSequence)uri.toString())) {
                    try {
                        throw new FileNotFoundException(br.z[144] + uri);
                    }
                    catch (NoSuchFieldError noSuchFieldError) {
                        throw noSuchFieldError;
                    }
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                throw noSuchFieldError2;
            }
        }
        final InputStream f = f(uri);
        if (f == null) {
            try {
                Log.e(br.z[145]);
                throw new FileNotFoundException(br.z[146] + uri);
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                throw noSuchFieldError3;
            }
        }
        final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
        Label_0214: {
            try {
                bitmapFactory$Options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(f, (Rect)null, bitmapFactory$Options);
                f.close();
                if (bitmapFactory$Options.outWidth > 0) {
                    if (bitmapFactory$Options.outHeight > 0) {
                        break Label_0214;
                    }
                }
                try {
                    Log.i(br.z[143] + uri);
                    throw new av();
                }
                catch (NoSuchFieldError noSuchFieldError4) {
                    throw noSuchFieldError4;
                }
            }
            catch (NoSuchFieldError noSuchFieldError5) {
                throw noSuchFieldError5;
            }
        }
        bitmapFactory$Options.inSampleSize = 1;
        int max = Math.max(bitmapFactory$Options.outWidth, bitmapFactory$Options.outHeight);
        while (max / 2 > n * 8 / 10) {
            max /= 2;
            bitmapFactory$Options.inSampleSize *= 2;
            if (l) {
                break;
            }
        }
        bitmapFactory$Options.inDither = true;
        bitmapFactory$Options.inJustDecodeBounds = false;
        bitmapFactory$Options.inScaled = false;
        Log.i(br.z[141] + bitmapFactory$Options.outWidth + br.z[147] + bitmapFactory$Options.outHeight + br.z[142] + bitmapFactory$Options.inSampleSize);
        try {
            if (Build$VERSION.SDK_INT >= 10) {
                bitmapFactory$Options.inPreferQualityOverSpeed = true;
            }
            return bitmapFactory$Options;
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            Log.w(br.z[148] + Build$VERSION.SDK_INT);
            return bitmapFactory$Options;
        }
    }
    
    public static Matrix a(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                final Matrix matrix = new Matrix();
                matrix.setRotate(90.0f);
                return matrix;
            }
            case 3: {
                final Matrix matrix2 = new Matrix();
                matrix2.setRotate(180.0f);
                return matrix2;
            }
            case 8: {
                final Matrix matrix3 = new Matrix();
                matrix3.setRotate(270.0f);
                return matrix3;
            }
            case 2: {
                final Matrix matrix4 = new Matrix();
                matrix4.setValues(new float[] { -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f });
                return matrix4;
            }
            case 4: {
                final Matrix matrix5 = new Matrix();
                matrix5.setValues(new float[] { 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f });
                return matrix5;
            }
            case 5: {
                final Matrix matrix6 = new Matrix();
                matrix6.setValues(new float[] { 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f });
                return matrix6;
            }
            case 7: {
                final Matrix matrix7 = new Matrix();
                matrix7.setValues(new float[] { 0.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f });
                return matrix7;
            }
        }
    }
    
    public static Matrix a(final Uri p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: ifnull          18
        //     8: aload_0        
        //     9: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //    12: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    15: ifeq            52
        //    18: new             Ljava/io/FileNotFoundException;
        //    21: dup            
        //    22: new             Ljava/lang/StringBuilder;
        //    25: dup            
        //    26: invokespecial   java/lang/StringBuilder.<init>:()V
        //    29: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //    32: bipush          33
        //    34: aaload         
        //    35: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    38: aload_0        
        //    39: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    42: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    45: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //    48: athrow         
        //    49: astore_2       
        //    50: aload_2        
        //    51: athrow         
        //    52: aload_0        
        //    53: invokestatic    com/whatsapp/util/br.c:(Landroid/net/Uri;)I
        //    56: invokestatic    com/whatsapp/util/br.a:(I)Landroid/graphics/Matrix;
        //    59: astore_3       
        //    60: aload_0        
        //    61: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //    64: bipush          31
        //    66: aaload         
        //    67: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //    70: ifnull          309
        //    73: new             Landroid/graphics/Matrix;
        //    76: dup            
        //    77: invokespecial   android/graphics/Matrix.<init>:()V
        //    80: astore          4
        //    82: aload           4
        //    84: bipush          9
        //    86: newarray        F
        //    88: dup            
        //    89: iconst_0       
        //    90: ldc_w           -1.0
        //    93: fastore        
        //    94: dup            
        //    95: iconst_1       
        //    96: fconst_0       
        //    97: fastore        
        //    98: dup            
        //    99: iconst_2       
        //   100: fconst_0       
        //   101: fastore        
        //   102: dup            
        //   103: iconst_3       
        //   104: fconst_0       
        //   105: fastore        
        //   106: dup            
        //   107: iconst_4       
        //   108: fconst_1       
        //   109: fastore        
        //   110: dup            
        //   111: iconst_5       
        //   112: fconst_0       
        //   113: fastore        
        //   114: dup            
        //   115: bipush          6
        //   117: fconst_0       
        //   118: fastore        
        //   119: dup            
        //   120: bipush          7
        //   122: fconst_0       
        //   123: fastore        
        //   124: dup            
        //   125: bipush          8
        //   127: fconst_1       
        //   128: fastore        
        //   129: invokevirtual   android/graphics/Matrix.setValues:([F)V
        //   132: aload_3        
        //   133: ifnonnull       143
        //   136: iload_1        
        //   137: ifeq            153
        //   140: aload           4
        //   142: astore_3       
        //   143: aload_3        
        //   144: aload           4
        //   146: invokevirtual   android/graphics/Matrix.postConcat:(Landroid/graphics/Matrix;)Z
        //   149: pop            
        //   150: aload_3        
        //   151: astore          4
        //   153: aload_0        
        //   154: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   157: bipush          34
        //   159: aaload         
        //   160: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //   163: ifnull          246
        //   166: new             Landroid/graphics/Matrix;
        //   169: dup            
        //   170: invokespecial   android/graphics/Matrix.<init>:()V
        //   173: astore          7
        //   175: aload           7
        //   177: bipush          9
        //   179: newarray        F
        //   181: dup            
        //   182: iconst_0       
        //   183: fconst_1       
        //   184: fastore        
        //   185: dup            
        //   186: iconst_1       
        //   187: fconst_0       
        //   188: fastore        
        //   189: dup            
        //   190: iconst_2       
        //   191: fconst_0       
        //   192: fastore        
        //   193: dup            
        //   194: iconst_3       
        //   195: fconst_0       
        //   196: fastore        
        //   197: dup            
        //   198: iconst_4       
        //   199: ldc_w           -1.0
        //   202: fastore        
        //   203: dup            
        //   204: iconst_5       
        //   205: fconst_0       
        //   206: fastore        
        //   207: dup            
        //   208: bipush          6
        //   210: fconst_0       
        //   211: fastore        
        //   212: dup            
        //   213: bipush          7
        //   215: fconst_0       
        //   216: fastore        
        //   217: dup            
        //   218: bipush          8
        //   220: fconst_1       
        //   221: fastore        
        //   222: invokevirtual   android/graphics/Matrix.setValues:([F)V
        //   225: aload           4
        //   227: ifnonnull       238
        //   230: iload_1        
        //   231: ifeq            302
        //   234: aload           7
        //   236: astore          4
        //   238: aload           4
        //   240: aload           7
        //   242: invokevirtual   android/graphics/Matrix.postConcat:(Landroid/graphics/Matrix;)Z
        //   245: pop            
        //   246: aload_0        
        //   247: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   250: bipush          32
        //   252: aaload         
        //   253: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //   256: astore          10
        //   258: aload           10
        //   260: ifnull          289
        //   263: aload           4
        //   265: ifnonnull       277
        //   268: new             Landroid/graphics/Matrix;
        //   271: dup            
        //   272: invokespecial   android/graphics/Matrix.<init>:()V
        //   275: astore          4
        //   277: aload           4
        //   279: aload           10
        //   281: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   284: i2f            
        //   285: invokevirtual   android/graphics/Matrix.postRotate:(F)Z
        //   288: pop            
        //   289: aload           4
        //   291: areturn        
        //   292: astore          5
        //   294: aload           5
        //   296: athrow         
        //   297: astore          8
        //   299: aload           8
        //   301: athrow         
        //   302: aload           7
        //   304: astore          4
        //   306: goto            246
        //   309: aload_3        
        //   310: astore          4
        //   312: goto            153
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  8      18     49     52     Ljava/lang/NumberFormatException;
        //  18     49     49     52     Ljava/lang/NumberFormatException;
        //  143    150    292    297    Ljava/lang/NumberFormatException;
        //  238    246    297    302    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0238:
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
    
    public static File a(final Context context, final byte b, final String s) {
        br.d = a(context, s, b, 0, false);
        final SharedPreferences$Editor edit = context.getSharedPreferences(br.z[22], 0).edit();
        try {
            edit.putString(br.z[20], br.d.getAbsolutePath());
            if (!edit.commit()) {
                Log.e(br.z[21]);
            }
            return br.d;
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
    }
    
    public static File a(final Context context, final File file, final byte b, final int n, final boolean b2) {
        final String absolutePath = file.getAbsolutePath();
        int lastIndex = absolutePath.lastIndexOf(".");
        if (absolutePath.lastIndexOf(File.separator) > lastIndex) {
            lastIndex = -1;
        }
        while (true) {
            Label_0066: {
                if (lastIndex < 0) {
                    break Label_0066;
                }
                try {
                    final String substring = absolutePath.substring(lastIndex);
                    return a(context, substring, b, n, b2);
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
            }
            final String substring = "";
            continue;
        }
    }
    
    public static File a(final Context context, final String s, final byte b, final int n, final boolean b2) {
        final boolean l = Log.l;
        File a = null;
        int n2 = 0;
        while (true) {
            if (n2 >= 100) {
                return a;
            }
            a = App.a(a(context, b, n) + s, b, n, b2);
            try {
                if (a.exists() || l) {
                    ++n2;
                    if (!l) {
                        continue;
                    }
                }
                return a;
            }
            catch (NumberFormatException ex) {
                try {
                    throw ex;
                }
                catch (NumberFormatException ex2) {
                    throw ex2;
                }
            }
        }
    }
    
    private static String a(final int n, final int n2) {
        switch (n) {
            default: {
                return null;
            }
            case 2: {
                if (n2 == 1) {
                    try {
                        return br.z[77];
                    }
                    catch (NumberFormatException ex) {
                        throw ex;
                    }
                }
                return br.z[78];
            }
            case 3: {
                return br.z[76];
            }
            case 1: {
                return br.z[79];
            }
        }
    }
    
    private static String a(final Context p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: ldc             Lcom/whatsapp/util/br;.class
        //     2: monitorenter   
        //     3: aload_0        
        //     4: invokestatic    com/whatsapp/util/br.a:(Landroid/content/Context;)V
        //     7: aload_0        
        //     8: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //    11: bipush          39
        //    13: aaload         
        //    14: iconst_0       
        //    15: invokevirtual   android/content/Context.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //    18: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //    23: astore          4
        //    25: invokestatic    com/whatsapp/util/b6.a:()Ljava/lang/String;
        //    28: astore          5
        //    30: aload           5
        //    32: getstatic       com/whatsapp/util/br.b:Ljava/lang/String;
        //    35: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    38: ifne            67
        //    41: iconst_0       
        //    42: putstatic       com/whatsapp/util/br.c:I
        //    45: aload           5
        //    47: putstatic       com/whatsapp/util/br.b:Ljava/lang/String;
        //    50: aload           4
        //    52: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //    55: bipush          38
        //    57: aaload         
        //    58: getstatic       com/whatsapp/util/br.b:Ljava/lang/String;
        //    61: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //    66: pop            
        //    67: new             Ljava/lang/StringBuilder;
        //    70: dup            
        //    71: invokespecial   java/lang/StringBuilder.<init>:()V
        //    74: iload_1        
        //    75: iload_2        
        //    76: invokestatic    com/whatsapp/util/br.a:(II)Ljava/lang/String;
        //    79: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    82: ldc_w           "-"
        //    85: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    88: getstatic       com/whatsapp/util/br.b:Ljava/lang/String;
        //    91: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    94: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //    97: bipush          37
        //    99: aaload         
        //   100: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   103: getstatic       com/whatsapp/util/br.e:Ljava/text/DecimalFormat;
        //   106: getstatic       com/whatsapp/util/br.c:I
        //   109: i2l            
        //   110: invokevirtual   java/text/DecimalFormat.format:(J)Ljava/lang/String;
        //   113: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   116: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   119: astore          7
        //   121: iconst_1       
        //   122: getstatic       com/whatsapp/util/br.c:I
        //   125: iadd           
        //   126: putstatic       com/whatsapp/util/br.c:I
        //   129: aload           4
        //   131: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   134: bipush          42
        //   136: aaload         
        //   137: getstatic       com/whatsapp/util/br.c:I
        //   140: invokeinterface android/content/SharedPreferences$Editor.putInt:(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
        //   145: pop            
        //   146: aload           4
        //   148: invokeinterface android/content/SharedPreferences$Editor.commit:()Z
        //   153: ifne            165
        //   156: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   159: bipush          41
        //   161: aaload         
        //   162: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   165: new             Ljava/lang/StringBuilder;
        //   168: dup            
        //   169: invokespecial   java/lang/StringBuilder.<init>:()V
        //   172: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   175: bipush          40
        //   177: aaload         
        //   178: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   181: aload           7
        //   183: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   186: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   189: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   192: ldc             Lcom/whatsapp/util/br;.class
        //   194: monitorexit    
        //   195: aload           7
        //   197: areturn        
        //   198: astore          6
        //   200: aload           6
        //   202: athrow         
        //   203: astore_3       
        //   204: ldc             Lcom/whatsapp/util/br;.class
        //   206: monitorexit    
        //   207: aload_3        
        //   208: athrow         
        //   209: astore          8
        //   211: aload           8
        //   213: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  3      30     203    209    Any
        //  30     67     198    203    Ljava/lang/NumberFormatException;
        //  30     67     203    209    Any
        //  67     121    203    209    Any
        //  121    165    209    214    Ljava/lang/NumberFormatException;
        //  121    165    203    209    Any
        //  165    192    203    209    Any
        //  200    203    203    209    Any
        //  211    214    203    209    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0165:
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
    
    public static String a(final URL url) {
        if (url == null) {
            return null;
        }
        try {
            if (App.aV >= 2) {
                return url.toString();
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        final String path = url.getPath();
        while (true) {
            Label_0147: {
                if (path == null) {
                    break Label_0147;
                }
                try {
                    if (path.length() > 25) {
                        final String substring = path.substring(0, -25 + path.length());
                        final Uri$Builder uri$Builder = new Uri$Builder();
                        uri$Builder.scheme(url.getProtocol()).authority(url.getHost()).path(substring + br.z[75] + path.substring(-4 + path.length())).encodedQuery(url.getQuery());
                        return uri$Builder.build().toString();
                    }
                }
                catch (NumberFormatException ex2) {
                    throw ex2;
                }
            }
            final String substring = "";
            continue;
        }
    }
    
    public static void a() {
    }
    // monitorenter(br.class)
    // monitorexit(br.class)
    
    public static void a(final int p0, final Activity p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_2       
        //     4: new             Ljava/util/ArrayList;
        //     7: dup            
        //     8: invokespecial   java/util/ArrayList.<init>:()V
        //    11: astore_3       
        //    12: iload_0        
        //    13: lookupswitch {
        //                4: 232
        //                5: 346
        //               21: 113
        //               22: 113
        //               23: 191
        //          default: 64
        //        }
        //    64: aconst_null    
        //    65: astore          4
        //    67: aload           4
        //    69: aconst_null    
        //    70: invokestatic    android/content/Intent.createChooser:(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;
        //    73: astore          5
        //    75: aload_3        
        //    76: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //    79: ifne            105
        //    82: aload           5
        //    84: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //    87: bipush          70
        //    89: aaload         
        //    90: aload_3        
        //    91: iconst_0       
        //    92: anewarray       Landroid/content/Intent;
        //    95: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //    98: checkcast       [Landroid/os/Parcelable;
        //   101: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;[Landroid/os/Parcelable;)Landroid/content/Intent;
        //   104: pop            
        //   105: aload_1        
        //   106: aload           5
        //   108: iload_0        
        //   109: invokevirtual   android/app/Activity.startActivityForResult:(Landroid/content/Intent;I)V
        //   112: return         
        //   113: iload_0        
        //   114: bipush          22
        //   116: if_icmpne       170
        //   119: new             Landroid/content/Intent;
        //   122: dup            
        //   123: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   126: bipush          60
        //   128: aaload         
        //   129: getstatic       android/provider/MediaStore$Images$Media.INTERNAL_CONTENT_URI:Landroid/net/Uri;
        //   132: aload_1        
        //   133: ldc_w           Lcom/whatsapp/gallerypicker/GalleryPicker;.class
        //   136: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;Landroid/net/Uri;Landroid/content/Context;Ljava/lang/Class;)V
        //   139: astore          4
        //   141: aload           4
        //   143: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   146: bipush          49
        //   148: aaload         
        //   149: bipush          10
        //   151: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   154: pop            
        //   155: aload           4
        //   157: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   160: bipush          69
        //   162: aaload         
        //   163: invokevirtual   android/content/Intent.setType:(Ljava/lang/String;)Landroid/content/Intent;
        //   166: pop            
        //   167: goto            67
        //   170: new             Landroid/content/Intent;
        //   173: dup            
        //   174: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   177: bipush          56
        //   179: aaload         
        //   180: getstatic       android/provider/MediaStore$Images$Media.INTERNAL_CONTENT_URI:Landroid/net/Uri;
        //   183: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;Landroid/net/Uri;)V
        //   186: astore          4
        //   188: goto            155
        //   191: new             Landroid/content/Intent;
        //   194: dup            
        //   195: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   198: bipush          50
        //   200: aaload         
        //   201: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //   204: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   207: bipush          52
        //   209: aaload         
        //   210: aload_1        
        //   211: iconst_1       
        //   212: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   215: bipush          53
        //   217: aaload         
        //   218: invokestatic    com/whatsapp/util/br.a:(Landroid/content/Context;BLjava/lang/String;)Ljava/io/File;
        //   221: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //   224: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //   227: astore          4
        //   229: goto            67
        //   232: new             Landroid/content/Intent;
        //   235: dup            
        //   236: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   239: bipush          73
        //   241: aaload         
        //   242: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //   245: astore          4
        //   247: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   250: istore          33
        //   252: iload           33
        //   254: bipush          18
        //   256: if_icmpne       300
        //   259: getstatic       android/os/Build.MODEL:Ljava/lang/String;
        //   262: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   265: bipush          54
        //   267: aaload         
        //   268: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   271: ifeq            300
        //   274: aload           4
        //   276: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   279: bipush          62
        //   281: aaload         
        //   282: aload_1        
        //   283: iconst_3       
        //   284: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   287: bipush          51
        //   289: aaload         
        //   290: invokestatic    com/whatsapp/util/br.a:(Landroid/content/Context;BLjava/lang/String;)Ljava/io/File;
        //   293: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //   296: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //   299: pop            
        //   300: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   303: bipush          9
        //   305: if_icmpge       67
        //   308: aload           4
        //   310: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   313: bipush          64
        //   315: aaload         
        //   316: ldc2_w          1048576
        //   319: getstatic       com/whatsapp/ym.k:I
        //   322: i2l            
        //   323: lmul           
        //   324: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;J)Landroid/content/Intent;
        //   327: pop            
        //   328: goto            67
        //   331: astore          34
        //   333: aload           34
        //   335: athrow         
        //   336: astore          31
        //   338: aload           31
        //   340: athrow         
        //   341: astore          32
        //   343: aload           32
        //   345: athrow         
        //   346: invokestatic    com/whatsapp/Voip.d:()Z
        //   349: ifeq            373
        //   352: new             Landroid/content/Intent;
        //   355: dup            
        //   356: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   359: bipush          57
        //   361: aaload         
        //   362: getstatic       android/provider/MediaStore$Audio$Media.EXTERNAL_CONTENT_URI:Landroid/net/Uri;
        //   365: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;Landroid/net/Uri;)V
        //   368: astore          4
        //   370: goto            67
        //   373: new             Ljava/util/ArrayList;
        //   376: dup            
        //   377: invokespecial   java/util/ArrayList.<init>:()V
        //   380: astore          8
        //   382: aload           8
        //   384: new             Landroid/content/Intent;
        //   387: dup            
        //   388: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   391: bipush          63
        //   393: aaload         
        //   394: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //   397: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   400: bipush          68
        //   402: aaload         
        //   403: invokevirtual   android/content/Intent.setType:(Ljava/lang/String;)Landroid/content/Intent;
        //   406: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   409: bipush          74
        //   411: aaload         
        //   412: ldc2_w          1048576
        //   415: getstatic       com/whatsapp/ym.k:I
        //   418: i2l            
        //   419: lmul           
        //   420: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;J)Landroid/content/Intent;
        //   423: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   426: pop            
        //   427: aload           8
        //   429: new             Landroid/content/Intent;
        //   432: dup            
        //   433: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   436: bipush          55
        //   438: aaload         
        //   439: getstatic       android/provider/MediaStore$Audio$Media.EXTERNAL_CONTENT_URI:Landroid/net/Uri;
        //   442: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;Landroid/net/Uri;)V
        //   445: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   448: pop            
        //   449: new             Ljava/util/HashSet;
        //   452: dup            
        //   453: invokespecial   java/util/HashSet.<init>:()V
        //   456: astore          11
        //   458: aload           8
        //   460: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   463: astore          12
        //   465: aload           12
        //   467: invokeinterface java/util/Iterator.hasNext:()Z
        //   472: ifeq            728
        //   475: aload           12
        //   477: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   482: checkcast       Landroid/content/Intent;
        //   485: astore          13
        //   487: aload_1        
        //   488: invokevirtual   android/app/Activity.getPackageManager:()Landroid/content/pm/PackageManager;
        //   491: aload           13
        //   493: iconst_0       
        //   494: invokevirtual   android/content/pm/PackageManager.queryIntentActivities:(Landroid/content/Intent;I)Ljava/util/List;
        //   497: astore          14
        //   499: aload           14
        //   501: ifnull          724
        //   504: aload           14
        //   506: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   511: astore          15
        //   513: aload           15
        //   515: invokeinterface java/util/Iterator.hasNext:()Z
        //   520: ifeq            724
        //   523: aload           15
        //   525: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   530: checkcast       Landroid/content/pm/ResolveInfo;
        //   533: getfield        android/content/pm/ResolveInfo.activityInfo:Landroid/content/pm/ActivityInfo;
        //   536: astore          16
        //   538: aload           16
        //   540: getfield        android/content/pm/ActivityInfo.applicationInfo:Landroid/content/pm/ApplicationInfo;
        //   543: getfield        android/content/pm/ApplicationInfo.packageName:Ljava/lang/String;
        //   546: astore          17
        //   548: new             Ljava/lang/StringBuilder;
        //   551: dup            
        //   552: invokespecial   java/lang/StringBuilder.<init>:()V
        //   555: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   558: bipush          71
        //   560: aaload         
        //   561: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   564: aload           17
        //   566: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   569: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   572: bipush          65
        //   574: aaload         
        //   575: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   578: aload           16
        //   580: getfield        android/content/pm/ActivityInfo.name:Ljava/lang/String;
        //   583: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   586: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   589: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   592: aload           17
        //   594: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   597: bipush          66
        //   599: aaload         
        //   600: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   603: istore          22
        //   605: iload           22
        //   607: ifne            660
        //   610: aload           17
        //   612: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   615: bipush          58
        //   617: aaload         
        //   618: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   621: istore          29
        //   623: iload           29
        //   625: ifne            660
        //   628: aload           17
        //   630: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   633: bipush          72
        //   635: aaload         
        //   636: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   639: istore          30
        //   641: iload           30
        //   643: ifne            660
        //   646: aload           17
        //   648: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   651: bipush          59
        //   653: aaload         
        //   654: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   657: ifeq            720
        //   660: aload           11
        //   662: aload           17
        //   664: invokevirtual   java/util/HashSet.contains:(Ljava/lang/Object;)Z
        //   667: istore          23
        //   669: iload           23
        //   671: ifne            720
        //   674: aload           13
        //   676: invokevirtual   android/content/Intent.clone:()Ljava/lang/Object;
        //   679: checkcast       Landroid/content/Intent;
        //   682: astore          24
        //   684: aload           24
        //   686: aload           17
        //   688: aload           16
        //   690: getfield        android/content/pm/ActivityInfo.name:Ljava/lang/String;
        //   693: invokevirtual   android/content/Intent.setClassName:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   696: pop            
        //   697: aload           24
        //   699: aload           17
        //   701: invokevirtual   android/content/Intent.setPackage:(Ljava/lang/String;)Landroid/content/Intent;
        //   704: pop            
        //   705: aload_3        
        //   706: aload           24
        //   708: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   711: pop            
        //   712: aload           11
        //   714: aload           17
        //   716: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   719: pop            
        //   720: iload_2        
        //   721: ifeq            513
        //   724: iload_2        
        //   725: ifeq            465
        //   728: new             Landroid/content/Intent;
        //   731: dup            
        //   732: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   735: bipush          61
        //   737: aaload         
        //   738: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //   741: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   744: bipush          67
        //   746: aaload         
        //   747: invokevirtual   android/content/Intent.setType:(Ljava/lang/String;)Landroid/content/Intent;
        //   750: astore          4
        //   752: goto            67
        //   755: astore          18
        //   757: aload           18
        //   759: athrow         
        //   760: astore          19
        //   762: aload           19
        //   764: athrow         
        //   765: astore          20
        //   767: aload           20
        //   769: athrow         
        //   770: astore          21
        //   772: aload           21
        //   774: athrow         
        //   775: astore          6
        //   777: aload           6
        //   779: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  75     105    775    780    Ljava/lang/NumberFormatException;
        //  247    252    336    341    Ljava/lang/NumberFormatException;
        //  259    300    341    346    Ljava/lang/NumberFormatException;
        //  300    328    331    336    Ljava/lang/NumberFormatException;
        //  338    341    341    346    Ljava/lang/NumberFormatException;
        //  548    605    755    760    Ljava/lang/NumberFormatException;
        //  610    623    760    765    Ljava/lang/NumberFormatException;
        //  628    641    765    770    Ljava/lang/NumberFormatException;
        //  646    660    770    775    Ljava/lang/NumberFormatException;
        //  660    669    770    775    Ljava/lang/NumberFormatException;
        //  757    760    760    765    Ljava/lang/NumberFormatException;
        //  762    765    765    770    Ljava/lang/NumberFormatException;
        //  767    770    770    775    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 332, Size: 332
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
    
    public static void a(final Activity activity, final String s) {
        final Intent intent = new Intent(br.z[137], MediaStore$Images$Media.INTERNAL_CONTENT_URI, (Context)activity, (Class)GalleryPicker.class);
        intent.putExtra(br.z[138], 10);
        intent.putExtra(br.z[140], s);
        intent.setType(br.z[139]);
        activity.startActivityForResult(intent, 22);
    }
    
    public static void a(final Context context) {
        while (true) {
            // monitorenter(br.class)
            SharedPreferences sharedPreferences = null;
            Label_0024: {
                try {
                    if (br.c >= 0) {
                        return;
                    }
                    break Label_0024;
                }
                catch (NumberFormatException ex) {
                    throw ex;
                    final SharedPreferences sharedPreferences2;
                    sharedPreferences = (sharedPreferences2 = context.getSharedPreferences(br.z[4], 0));
                    final String[] array = br.z;
                    final int n = 2;
                    final String s = array[n];
                    final int n2 = -1;
                    br.c = sharedPreferences2.getInt(s, n2);
                    final SharedPreferences sharedPreferences3 = sharedPreferences;
                    final String[] array2 = br.z;
                    final int n3 = 5;
                    final String s2 = array2[n3];
                    final String s3 = null;
                    br.b = sharedPreferences3.getString(s2, s3);
                    final int c = br.c;
                    final int c2 = c;
                    // iftrue(Label_0142:, c2 < 0)
                    while (true) {
                        Block_7: {
                            break Block_7;
                            final StringBuilder sb = new StringBuilder();
                            final String[] array3 = br.z;
                            final int n4 = 3;
                            final String s4 = array3[n4];
                            final StringBuilder sb2 = sb.append(s4);
                            final int n5 = br.c;
                            final StringBuilder sb3 = sb2.append(n5);
                            final String[] array4 = br.z;
                            final int n6 = 9;
                            final String s5 = array4[n6];
                            final StringBuilder sb4 = sb3.append(s5);
                            final String s6 = br.b;
                            final StringBuilder sb5 = sb4.append(s6);
                            final String s7 = sb5.toString();
                            Log.i(s7);
                            return;
                        }
                        final String s8 = br.b;
                        final boolean b = TextUtils.isEmpty((CharSequence)s8);
                        continue;
                    }
                }
                // iftrue(Label_0142:, b)
            }
            try {
                final SharedPreferences sharedPreferences2 = sharedPreferences;
                final String[] array = br.z;
                final int n = 2;
                final String s = array[n];
                final int n2 = -1;
                br.c = sharedPreferences2.getInt(s, n2);
                final SharedPreferences sharedPreferences3 = sharedPreferences;
                final String[] array2 = br.z;
                final int n3 = 5;
                final String s2 = array2[n3];
                final String s3 = null;
                br.b = sharedPreferences3.getString(s2, s3);
                final int c2;
                final int c = c2 = br.c;
                if (c2 >= 0) {
                    try {
                        final String s8 = br.b;
                        final boolean b = TextUtils.isEmpty((CharSequence)s8);
                        if (!b) {
                            final StringBuilder sb = new StringBuilder();
                            final String[] array3 = br.z;
                            final int n4 = 3;
                            final String s4 = array3[n4];
                            final StringBuilder sb2 = sb.append(s4);
                            final int n5 = br.c;
                            final StringBuilder sb3 = sb2.append(n5);
                            final String[] array4 = br.z;
                            final int n6 = 9;
                            final String s5 = array4[n6];
                            final StringBuilder sb4 = sb3.append(s5);
                            final String s6 = br.b;
                            final StringBuilder sb5 = sb4.append(s6);
                            final String s7 = sb5.toString();
                            Log.i(s7);
                            return;
                        }
                    }
                    catch (NumberFormatException ex2) {
                        throw ex2;
                    }
                }
            }
            catch (NumberFormatException ex5) {
                throw;
            }
            Label_0142: {
                br.b = b6.a();
            }
            final long currentTimeMillis = System.currentTimeMillis();
            br.c = -1;
            br.c = Math.max(br.c, a(br.b, (byte)2, 0, true));
            br.c = Math.max(br.c, a(br.b, (byte)2, 0, false));
            br.c = Math.max(br.c, a(br.b, (byte)2, 1, true));
            br.c = Math.max(br.c, a(br.b, (byte)2, 1, false));
            br.c = Math.max(br.c, a(br.b, (byte)3, 0, true));
            br.c = Math.max(br.c, a(br.b, (byte)3, 0, false));
            br.c = Math.max(br.c, a(br.b, (byte)1, 0, true));
            br.c = Math.max(br.c, a(br.b, (byte)1, 0, false));
            ++br.c;
            final SharedPreferences$Editor edit = sharedPreferences.edit();
            try {
                edit.putInt(br.z[6], br.c);
                edit.putString(br.z[0], br.b);
                if (!edit.commit()) {
                    Log.e(br.z[7]);
                }
                Log.i(br.z[10] + br.c + br.z[1] + br.b + br.z[8] + (System.currentTimeMillis() - currentTimeMillis));
            }
            catch (NumberFormatException ex4) {
                throw ex4;
            }
        }
    }
    
    public static void a(final Context context, final Uri data) {
        context.sendBroadcast(new Intent(br.z[90]).setData(data));
    }
    
    public static void a(final Context context, final bi bi) {
        Label_0027: {
            try {
                if (bi.I != 2) {
                    break Label_0027;
                }
                final bi bi2 = bi;
                final int n = bi2.E;
                final boolean b = true;
                if (n == (b ? 1 : 0)) {
                    return;
                }
                break Label_0027;
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
            try {
                final bi bi2 = bi;
                final int n = bi2.E;
                final boolean b = true;
                if (n == (b ? 1 : 0)) {
                    return;
                }
            }
            catch (NumberFormatException ex2) {
                throw ex2;
            }
        }
        final File file = ((MediaData)bi.N).file;
        if (file != null) {
            try {
                if (file.exists()) {
                    a(context, Uri.fromFile(file));
                }
            }
            catch (NumberFormatException ex3) {
                throw ex3;
            }
        }
    }
    
    public static void a(final Context p0, final String p1, final Uri p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Lcom/whatsapp/MediaData;
        //     3: dup            
        //     4: invokespecial   com/whatsapp/MediaData.<init>:()V
        //     7: astore_3       
        //     8: aload_0        
        //     9: aload_2        
        //    10: aload_3        
        //    11: invokestatic    com/whatsapp/util/br.a:(Landroid/content/Context;Landroid/net/Uri;Lcom/whatsapp/MediaData;)[B
        //    14: astore          4
        //    16: aload_2        
        //    17: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //    20: bipush          11
        //    22: aaload         
        //    23: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //    26: astore          5
        //    28: invokestatic    android/os/Looper.myLooper:()Landroid/os/Looper;
        //    31: astore          8
        //    33: aload_0        
        //    34: invokevirtual   android/content/Context.getMainLooper:()Landroid/os/Looper;
        //    37: astore          9
        //    39: aload           8
        //    41: aload           9
        //    43: if_acmpne       64
        //    46: aload_1        
        //    47: aload           4
        //    49: aload_3        
        //    50: iconst_1       
        //    51: iconst_0       
        //    52: aload           5
        //    54: aconst_null    
        //    55: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;[BLcom/whatsapp/MediaData;BILjava/lang/String;Landroid/net/Uri;)V
        //    58: getstatic       com/whatsapp/util/Log.l:Z
        //    61: ifeq            103
        //    64: new             Landroid/os/Handler;
        //    67: dup            
        //    68: aload_0        
        //    69: invokevirtual   android/content/Context.getMainLooper:()Landroid/os/Looper;
        //    72: invokespecial   android/os/Handler.<init>:(Landroid/os/Looper;)V
        //    75: new             Lcom/whatsapp/util/bh;
        //    78: dup            
        //    79: aload_1        
        //    80: aload           4
        //    82: aload_3        
        //    83: aload           5
        //    85: invokespecial   com/whatsapp/util/bh.<init>:(Ljava/lang/String;[BLcom/whatsapp/MediaData;Ljava/lang/String;)V
        //    88: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //    91: pop            
        //    92: return         
        //    93: astore          6
        //    95: aload           6
        //    97: athrow         
        //    98: astore          7
        //   100: aload           7
        //   102: athrow         
        //   103: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  28     39     93     98     Ljava/lang/NumberFormatException;
        //  46     64     98     103    Ljava/lang/NumberFormatException;
        //  64     92     98     103    Ljava/lang/NumberFormatException;
        //  95     98     98     103    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0064:
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
    
    public static void a(final Uri uri, final Bitmap bitmap) {
        if (bitmap != null) {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap$CompressFormat.JPEG, 80, (OutputStream)byteArrayOutputStream);
            br.f.put(uri, ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
        }
    }
    
    public static void a(final File p0, final File p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/FileInputStream;
        //     3: dup            
        //     4: aload_0        
        //     5: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //     8: astore_2       
        //     9: aload_1        
        //    10: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //    13: astore          5
        //    15: aload           5
        //    17: ifnull          26
        //    20: aload           5
        //    22: invokevirtual   java/io/File.mkdirs:()Z
        //    25: pop            
        //    26: aload_2        
        //    27: new             Ljava/io/FileOutputStream;
        //    30: dup            
        //    31: aload_1        
        //    32: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    35: invokestatic    com/whatsapp/util/br.a:(Ljava/io/InputStream;Ljava/io/OutputStream;)I
        //    38: pop            
        //    39: aload_2        
        //    40: ifnull          47
        //    43: aload_2        
        //    44: invokevirtual   java/io/InputStream.close:()V
        //    47: return         
        //    48: astore_3       
        //    49: aconst_null    
        //    50: astore_2       
        //    51: aload_2        
        //    52: ifnull          59
        //    55: aload_2        
        //    56: invokevirtual   java/io/InputStream.close:()V
        //    59: aload_3        
        //    60: athrow         
        //    61: astore          4
        //    63: aload           4
        //    65: athrow         
        //    66: astore_3       
        //    67: goto            51
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      9      48     51     Any
        //  9      15     66     70     Any
        //  20     26     66     70     Any
        //  26     39     66     70     Any
        //  55     59     61     66     Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0026:
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
    
    public static void a(final String s, final Uri uri) {
        final MediaData mediaData = new MediaData();
        final ByteBuffer byteBuffer = br.f.get(uri.buildUpon().query((String)null).build());
        byte[] byteArray2 = null;
        Label_0166: {
            if (byteBuffer != null) {
                final byte[] array = byteBuffer.array();
                final String queryParameter = uri.getQueryParameter(br.z[157]);
                while (true) {
                    Label_0243: {
                        if (queryParameter == null) {
                            break Label_0243;
                        }
                        final Matrix matrix = new Matrix();
                        matrix.postRotate((float)Integer.parseInt(queryParameter));
                        final Bitmap decodeByteArray = BitmapFactory.decodeByteArray(array, 0, array.length);
                        Bitmap bitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                        if (bitmap != decodeByteArray) {
                            decodeByteArray.recycle();
                        }
                        else {
                            bitmap = decodeByteArray;
                        }
                        if (bitmap == null) {
                            break Label_0243;
                        }
                        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmap.compress(Bitmap$CompressFormat.JPEG, 80, (OutputStream)byteArrayOutputStream);
                        final byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bitmap.recycle();
                        byteArray2 = byteArray;
                        break Label_0166;
                    }
                    final byte[] byteArray = array;
                    continue;
                }
            }
            final Bitmap a = a(uri, 100, 100);
            byteArray2 = null;
            if (a != null) {
                final ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                a.compress(Bitmap$CompressFormat.JPEG, 80, (OutputStream)byteArrayOutputStream2);
                byteArray2 = byteArrayOutputStream2.toByteArray();
                a.recycle();
            }
        }
        App.a(s, byteArray2, mediaData, (byte)1, 0, uri.getQueryParameter(br.z[158]), uri);
    }
    
    public static void a(final byte[] p0, final File p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: ifnull          33
        //     4: new             Ljava/io/BufferedOutputStream;
        //     7: dup            
        //     8: new             Ljava/io/FileOutputStream;
        //    11: dup            
        //    12: aload_1        
        //    13: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    16: invokespecial   java/io/BufferedOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    19: astore_2       
        //    20: aload_2        
        //    21: aload_0        
        //    22: invokevirtual   java/io/OutputStream.write:([B)V
        //    25: aload_2        
        //    26: ifnull          33
        //    29: aload_2        
        //    30: invokevirtual   java/io/OutputStream.close:()V
        //    33: return         
        //    34: astore_3       
        //    35: aconst_null    
        //    36: astore_2       
        //    37: aload_2        
        //    38: ifnull          45
        //    41: aload_2        
        //    42: invokevirtual   java/io/OutputStream.close:()V
        //    45: aload_3        
        //    46: athrow         
        //    47: astore          5
        //    49: aload           5
        //    51: athrow         
        //    52: astore          6
        //    54: return         
        //    55: astore          4
        //    57: goto            45
        //    60: astore_3       
        //    61: goto            37
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      20     34     37     Any
        //  20     25     60     64     Any
        //  29     33     52     55     Ljava/io/IOException;
        //  41     45     55     60     Ljava/io/IOException;
        //  41     45     47     52     Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0033:
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
    
    public static boolean a(final Activity activity, final gu gu, final File file, final byte b) {
        try {
            Log.i(br.z[130] + file.getAbsolutePath());
            if (file.length() <= 1048576L * ym.k) {
                return true;
            }
            final StringBuilder sb = new StringBuilder();
            final String[] array = br.z;
            final int n = 131;
            final String s = array[n];
            final StringBuilder sb2 = sb.append(s);
            final File file2 = file;
            final long n2 = file2.length();
            final StringBuilder sb3 = sb2.append(n2);
            final String s2 = sb3.toString();
            Log.w(s2);
            final boolean b2 = false;
            final gu gu2 = gu;
            if (gu2 != null) {
                final int n3 = 1;
                final Object[] array2 = new Object[n3];
                final Object[] array4;
                final Object[] array3 = array4 = array2;
                final int n4 = 0;
                final int n5 = ym.k;
                final Integer n6 = n5;
                array4[n4] = n6;
                final gu gu3 = gu;
                final Activity activity2 = activity;
                final int n7 = 2131231127;
                final Object[] array5 = array3;
                final String s3 = activity2.getString(n7, array5);
                gu3.f(s3);
                return false;
            }
            return b2;
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        try {
            final StringBuilder sb = new StringBuilder();
            final String[] array = br.z;
            final int n = 131;
            final String s = array[n];
            final StringBuilder sb2 = sb.append(s);
            final File file2 = file;
            final long n2 = file2.length();
            final StringBuilder sb3 = sb2.append(n2);
            final String s2 = sb3.toString();
            Log.w(s2);
            final boolean b2 = false;
            final gu gu2 = gu;
            if (gu2 != null) {
                final int n3 = 1;
                final Object[] array2 = new Object[n3];
                final Object[] array4;
                final Object[] array3 = array4 = array2;
                final int n4 = 0;
                final int n5 = ym.k;
                final Integer n6 = n5;
                array4[n4] = n6;
                final gu gu3 = gu;
                final Activity activity2 = activity;
                final int n7 = 2131231127;
                final Object[] array5 = array3;
                final String s3 = activity2.getString(n7, array5);
                gu3.f(s3);
                return false;
            }
            return b2;
        }
        catch (NumberFormatException ex2) {
            throw ex2;
        }
        return true;
    }
    
    public static boolean a(final Activity activity, final gu gu, final String s, final File file, final byte b, final int n, final boolean b2) {
        return a(activity, gu, s, file, b, 0, b2, null);
    }
    
    public static boolean a(final Activity activity, final gu gu, final String s, final File file, final byte b, final int n, final boolean b2, final String s2) {
        try {
            if (!a(activity, gu, file, b)) {
                return false;
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        return a((Context)activity, s, file, b, n, b2, s2);
    }
    
    public static boolean a(final Activity activity, final gu gu, final String s, final File file, final byte b, final boolean b2) {
        return a(activity, gu, s, file, b, 0, b2);
    }
    
    public static boolean a(final Context context, final String s, final File file, final byte b, final int n, final boolean b2) {
        return a(context, s, file, b, n, b2, null);
    }
    
    public static boolean a(final Context p0, final String p1, final File p2, final byte p3, final int p4, final boolean p5, final String p6) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //    10: bipush          105
        //    12: aaload         
        //    13: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    16: aload_2        
        //    17: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    20: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    23: ldc_w           " "
        //    26: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    29: aload_2        
        //    30: invokevirtual   java/io/File.length:()J
        //    33: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    36: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    39: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    42: iload           5
        //    44: ifne            111
        //    47: new             Lcom/whatsapp/MediaData;
        //    50: dup            
        //    51: invokespecial   com/whatsapp/MediaData.<init>:()V
        //    54: astore          8
        //    56: aload           8
        //    58: aload_2        
        //    59: putfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //    62: iload_3        
        //    63: iconst_3       
        //    64: if_icmpne       96
        //    67: aload_1        
        //    68: aload           8
        //    70: getfield        com/whatsapp/MediaData.file:Ljava/io/File;
        //    73: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    76: invokestatic    com/whatsapp/util/br.a:(Ljava/lang/String;)[B
        //    79: aload           8
        //    81: iload_3        
        //    82: iload           4
        //    84: aload           6
        //    86: aconst_null    
        //    87: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;[BLcom/whatsapp/MediaData;BILjava/lang/String;Landroid/net/Uri;)V
        //    90: getstatic       com/whatsapp/util/Log.l:Z
        //    93: ifeq            109
        //    96: aload_1        
        //    97: aconst_null    
        //    98: aload           8
        //   100: iload_3        
        //   101: iload           4
        //   103: aload           6
        //   105: aconst_null    
        //   106: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;[BLcom/whatsapp/MediaData;BILjava/lang/String;Landroid/net/Uri;)V
        //   109: iconst_1       
        //   110: ireturn        
        //   111: aload_0        
        //   112: aload_2        
        //   113: iload_3        
        //   114: iload           4
        //   116: iconst_1       
        //   117: invokestatic    com/whatsapp/util/br.a:(Landroid/content/Context;Ljava/io/File;BIZ)Ljava/io/File;
        //   120: astore          7
        //   122: new             Ljava/lang/StringBuilder;
        //   125: dup            
        //   126: invokespecial   java/lang/StringBuilder.<init>:()V
        //   129: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   132: bipush          106
        //   134: aaload         
        //   135: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   138: aload           7
        //   140: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   143: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   146: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   149: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   152: aload_2        
        //   153: aload           7
        //   155: invokestatic    com/whatsapp/util/br.a:(Ljava/io/File;Ljava/io/File;)V
        //   158: aload           7
        //   160: astore_2       
        //   161: goto            47
        //   164: astore          9
        //   166: aload           9
        //   168: athrow         
        //   169: astore          10
        //   171: aload           10
        //   173: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  56     62     164    169    Ljava/lang/NumberFormatException;
        //  67     96     169    174    Ljava/lang/NumberFormatException;
        //  96     109    169    174    Ljava/lang/NumberFormatException;
        //  166    169    169    174    Ljava/lang/NumberFormatException;
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
    
    public static boolean a(final Context context, final String s, final File file, final byte b, final boolean b2) {
        return a(context, s, file, b, 0, b2, null);
    }
    
    public static boolean a(final File p0, final MediaData p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Landroid/graphics/BitmapFactory$Options;
        //     3: dup            
        //     4: invokespecial   android/graphics/BitmapFactory$Options.<init>:()V
        //     7: astore_2       
        //     8: aload_2        
        //     9: iconst_1       
        //    10: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //    13: aload_0        
        //    14: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    17: aload_2        
        //    18: invokestatic    android/graphics/BitmapFactory.decodeFile:(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //    21: pop            
        //    22: aload_2        
        //    23: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //    26: istore          4
        //    28: aload_2        
        //    29: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //    32: istore          5
        //    34: aload_2        
        //    35: aload_2        
        //    36: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //    39: sipush          400
        //    42: idiv           
        //    43: aload_2        
        //    44: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //    47: sipush          400
        //    50: idiv           
        //    51: invokestatic    java/lang/Math.max:(II)I
        //    54: putfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //    57: aload_2        
        //    58: iconst_0       
        //    59: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //    62: aload_2        
        //    63: iconst_1       
        //    64: putfield        android/graphics/BitmapFactory$Options.inInputShareable:Z
        //    67: aload_2        
        //    68: iconst_1       
        //    69: putfield        android/graphics/BitmapFactory$Options.inPurgeable:Z
        //    72: aload_2        
        //    73: getstatic       android/graphics/Bitmap$Config.RGB_565:Landroid/graphics/Bitmap$Config;
        //    76: putfield        android/graphics/BitmapFactory$Options.inPreferredConfig:Landroid/graphics/Bitmap$Config;
        //    79: aload_0        
        //    80: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    83: aload_2        
        //    84: invokestatic    android/graphics/BitmapFactory.decodeFile:(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //    87: astore          6
        //    89: aload           6
        //    91: ifnonnull       96
        //    94: iconst_0       
        //    95: ireturn        
        //    96: iconst_1       
        //    97: aload           6
        //    99: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   102: iand           
        //   103: iconst_1       
        //   104: if_icmpne       336
        //   107: aload           6
        //   109: iconst_0       
        //   110: iconst_0       
        //   111: iconst_m1      
        //   112: aload           6
        //   114: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   117: iadd           
        //   118: aload           6
        //   120: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   123: invokestatic    android/graphics/Bitmap.createBitmap:(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
        //   126: astore          7
        //   128: aload           6
        //   130: aload           7
        //   132: if_acmpeq       140
        //   135: aload           6
        //   137: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   140: new             Landroid/media/FaceDetector;
        //   143: dup            
        //   144: aload           7
        //   146: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   149: aload           7
        //   151: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   154: iconst_1       
        //   155: invokespecial   android/media/FaceDetector.<init>:(III)V
        //   158: astore          8
        //   160: iconst_1       
        //   161: anewarray       Landroid/media/FaceDetector$Face;
        //   164: astore          9
        //   166: aload           8
        //   168: aload           7
        //   170: aload           9
        //   172: invokevirtual   android/media/FaceDetector.findFaces:(Landroid/graphics/Bitmap;[Landroid/media/FaceDetector$Face;)I
        //   175: ifle            262
        //   178: aload           9
        //   180: iconst_0       
        //   181: aaload         
        //   182: invokevirtual   android/media/FaceDetector$Face.confidence:()F
        //   185: fstore          17
        //   187: fload           17
        //   189: ldc_w           0.3
        //   192: fcmpl          
        //   193: ifle            262
        //   196: new             Landroid/graphics/PointF;
        //   199: dup            
        //   200: invokespecial   android/graphics/PointF.<init>:()V
        //   203: astore          18
        //   205: aload           9
        //   207: iconst_0       
        //   208: aaload         
        //   209: aload           18
        //   211: invokevirtual   android/media/FaceDetector$Face.getMidPoint:(Landroid/graphics/PointF;)V
        //   214: aload_1        
        //   215: aload           18
        //   217: getfield        android/graphics/PointF.x:F
        //   220: iload           4
        //   222: i2f            
        //   223: fmul           
        //   224: aload           7
        //   226: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   229: i2f            
        //   230: fdiv           
        //   231: f2i            
        //   232: putfield        com/whatsapp/MediaData.faceX:I
        //   235: aload_1        
        //   236: aload           18
        //   238: getfield        android/graphics/PointF.y:F
        //   241: iload           5
        //   243: i2f            
        //   244: fmul           
        //   245: aload           7
        //   247: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   250: i2f            
        //   251: fdiv           
        //   252: f2i            
        //   253: putfield        com/whatsapp/MediaData.faceY:I
        //   256: getstatic       com/whatsapp/util/Log.l:Z
        //   259: ifeq            272
        //   262: aload_1        
        //   263: iconst_m1      
        //   264: putfield        com/whatsapp/MediaData.faceX:I
        //   267: aload_1        
        //   268: iconst_m1      
        //   269: putfield        com/whatsapp/MediaData.faceY:I
        //   272: aload           7
        //   274: invokevirtual   android/graphics/Bitmap.recycle:()V
        //   277: aload_1        
        //   278: getfield        com/whatsapp/MediaData.faceX:I
        //   281: istore          13
        //   283: iload           13
        //   285: ifgt            299
        //   288: aload_1        
        //   289: getfield        com/whatsapp/MediaData.faceY:I
        //   292: istore          15
        //   294: iload           15
        //   296: ifle            330
        //   299: iconst_1       
        //   300: istore          14
        //   302: iload           14
        //   304: ireturn        
        //   305: astore          19
        //   307: aload           19
        //   309: athrow         
        //   310: astore          16
        //   312: aload           16
        //   314: athrow         
        //   315: astore          10
        //   317: aload           10
        //   319: athrow         
        //   320: astore          11
        //   322: aload           11
        //   324: athrow         
        //   325: astore          12
        //   327: aload           12
        //   329: athrow         
        //   330: iconst_0       
        //   331: istore          14
        //   333: goto            302
        //   336: aload           6
        //   338: astore          7
        //   340: goto            140
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  135    140    305    310    Ljava/lang/NumberFormatException;
        //  178    187    310    315    Ljava/lang/NumberFormatException;
        //  205    262    315    320    Ljava/lang/NumberFormatException;
        //  262    272    315    320    Ljava/lang/NumberFormatException;
        //  272    283    320    325    Ljava/lang/NumberFormatException;
        //  288    294    325    330    Ljava/lang/NumberFormatException;
        //  322    325    325    330    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 176, Size: 176
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
    
    public static byte[] a(final Context context, final Uri uri, final MediaData mediaData) {
        final File a = a(context, br.z[13], (byte)1, 0, true);
        Bitmap a2;
        try {
            a2 = a(uri, a);
            if (a2 == null) {
                try {
                    Log.e(br.z[14]);
                    throw new av();
                }
                catch (SecurityException ex) {
                    throw ex;
                }
            }
        }
        catch (SecurityException ex2) {
            Log.e(br.z[12] + ex2.getMessage());
            throw ex2;
        }
        mediaData.file = a;
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a2.compress(Bitmap$CompressFormat.JPEG, 80, (OutputStream)byteArrayOutputStream);
        final byte[] byteArray = byteArrayOutputStream.toByteArray();
        while (true) {
            try {
                if (a2.getHeight() > a2.getWidth()) {
                    a(mediaData.file, mediaData);
                }
                a2.recycle();
                return byteArray;
            }
            catch (Exception ex3) {
                continue;
            }
            break;
        }
    }
    
    public static byte[] a(Bitmap bitmap) {
        byte[] byteArray = null;
        if (bitmap == null) {
            return byteArray;
        }
        while (true) {
            while (true) {
                Label_0203: {
                    try {
                        Log.i(br.z[89] + bitmap.getWidth() + br.z[88] + bitmap.getHeight());
                        if (bitmap.getWidth() != 100 || bitmap.getHeight() != 100) {
                            Log.i(br.z[87]);
                            if (bitmap.getWidth() <= bitmap.getHeight()) {
                                break Label_0203;
                            }
                            final Matrix matrix = new Matrix();
                            final float n = 100.0f / bitmap.getHeight();
                            matrix.setScale(n, n);
                            final Bitmap bitmap2 = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - bitmap.getHeight()) / 2, 0, bitmap.getHeight(), bitmap.getHeight(), matrix, true);
                            bitmap.recycle();
                            bitmap = bitmap2;
                        }
                        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmap.compress(Bitmap$CompressFormat.JPEG, 80, (OutputStream)byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                        bitmap.recycle();
                        return byteArray;
                    }
                    catch (NumberFormatException ex) {
                        throw ex;
                    }
                }
                final Matrix matrix2 = new Matrix();
                final float n2 = 100.0f / bitmap.getWidth();
                matrix2.setScale(n2, n2);
                final Bitmap bitmap2 = Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() - bitmap.getWidth()) / 2, bitmap.getWidth(), bitmap.getWidth(), matrix2, true);
                continue;
            }
        }
    }
    
    public static byte[] a(final String s) {
        return a(b(s));
    }
    
    public static byte[] a(final String dataSource, final long n) {
        if (n == 0L) {
            try {
                return a(dataSource);
            }
            catch (Exception ex) {
                throw ex;
            }
        }
        final MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(dataSource);
            return a(mediaMetadataRetriever.getFrameAtTime(n));
        }
        catch (NoSuchMethodError noSuchMethodError) {}
        catch (Exception ex2) {
            goto Label_0048;
        }
    }
    
    public static Bitmap b(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //     3: bipush          122
        //     5: aaload         
        //     6: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //     9: astore          35
        //    11: aload           35
        //    13: astore          9
        //    15: aload           9
        //    17: invokevirtual   java/lang/Class.newInstance:()Ljava/lang/Object;
        //    20: astore          38
        //    22: aload           38
        //    24: astore          8
        //    26: aload           9
        //    28: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //    31: bipush          112
        //    33: aaload         
        //    34: iconst_1       
        //    35: anewarray       Ljava/lang/Class;
        //    38: dup            
        //    39: iconst_0       
        //    40: ldc             Ljava/lang/String;.class
        //    42: aastore        
        //    43: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    46: aload           8
        //    48: iconst_1       
        //    49: anewarray       Ljava/lang/Object;
        //    52: dup            
        //    53: iconst_0       
        //    54: aload_0        
        //    55: aastore        
        //    56: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    59: pop            
        //    60: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    63: bipush          9
        //    65: if_icmpgt       272
        //    68: aload           9
        //    70: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //    73: bipush          109
        //    75: aaload         
        //    76: iconst_0       
        //    77: anewarray       Ljava/lang/Class;
        //    80: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    83: aload           8
        //    85: iconst_0       
        //    86: anewarray       Ljava/lang/Object;
        //    89: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    92: checkcast       Landroid/graphics/Bitmap;
        //    95: astore          43
        //    97: aload           43
        //    99: ifnull          239
        //   102: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   105: istore          49
        //   107: iload           49
        //   109: bipush          11
        //   111: if_icmpge       239
        //   114: aload           43
        //   116: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   119: istore          50
        //   121: aload           43
        //   123: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   126: istore          51
        //   128: iload           50
        //   130: iload           51
        //   132: if_icmple       239
        //   135: new             Lcom/whatsapp/util/bb;
        //   138: dup            
        //   139: invokespecial   com/whatsapp/util/bb.<init>:()V
        //   142: astore          52
        //   144: aload           52
        //   146: new             Ljava/io/File;
        //   149: dup            
        //   150: aload_0        
        //   151: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   154: invokevirtual   com/whatsapp/util/bb.a:(Ljava/io/File;)V
        //   157: aload           52
        //   159: invokevirtual   com/whatsapp/util/bb.a:()Lcom/whatsapp/util/an;
        //   162: astore          54
        //   164: aload           54
        //   166: ifnull          239
        //   169: aload           54
        //   171: invokevirtual   com/whatsapp/util/an.a:()I
        //   174: istore          57
        //   176: iload           57
        //   178: ifle            239
        //   181: aload           54
        //   183: invokevirtual   com/whatsapp/util/an.b:()Z
        //   186: istore          58
        //   188: iload           58
        //   190: ifeq            239
        //   193: new             Ljava/lang/StringBuilder;
        //   196: dup            
        //   197: invokespecial   java/lang/StringBuilder.<init>:()V
        //   200: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   203: bipush          120
        //   205: aaload         
        //   206: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   209: aload           54
        //   211: invokevirtual   com/whatsapp/util/an.a:()I
        //   214: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   217: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   220: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   223: aload           43
        //   225: aload           54
        //   227: invokevirtual   com/whatsapp/util/an.a:()I
        //   230: invokestatic    com/whatsapp/util/b8.a:(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
        //   233: astore          59
        //   235: aload           59
        //   237: astore          43
        //   239: aload           8
        //   241: ifnull          269
        //   244: aload           9
        //   246: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   249: bipush          110
        //   251: aaload         
        //   252: iconst_0       
        //   253: anewarray       Ljava/lang/Class;
        //   256: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   259: aload           8
        //   261: iconst_0       
        //   262: anewarray       Ljava/lang/Object;
        //   265: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   268: pop            
        //   269: aload           43
        //   271: areturn        
        //   272: aload           9
        //   274: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   277: bipush          119
        //   279: aaload         
        //   280: iconst_0       
        //   281: anewarray       Ljava/lang/Class;
        //   284: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   287: aload           8
        //   289: iconst_0       
        //   290: anewarray       Ljava/lang/Object;
        //   293: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   296: checkcast       [B
        //   299: checkcast       [B
        //   302: astore          42
        //   304: aload           42
        //   306: ifnull          974
        //   309: aload           42
        //   311: iconst_0       
        //   312: aload           42
        //   314: arraylength    
        //   315: invokestatic    android/graphics/BitmapFactory.decodeByteArray:([BII)Landroid/graphics/Bitmap;
        //   318: astore          43
        //   320: aload           43
        //   322: ifnonnull       97
        //   325: aload           9
        //   327: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   330: bipush          121
        //   332: aaload         
        //   333: iconst_0       
        //   334: anewarray       Ljava/lang/Class;
        //   337: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   340: aload           8
        //   342: iconst_0       
        //   343: anewarray       Ljava/lang/Object;
        //   346: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   349: checkcast       Landroid/graphics/Bitmap;
        //   352: astore          43
        //   354: goto            97
        //   357: astore          47
        //   359: aload           47
        //   361: athrow         
        //   362: astore          48
        //   364: aload           48
        //   366: athrow         
        //   367: astore          40
        //   369: aload           8
        //   371: astore_2       
        //   372: aload           9
        //   374: astore_3       
        //   375: aload_2        
        //   376: ifnull          402
        //   379: aload_3        
        //   380: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   383: bipush          118
        //   385: aaload         
        //   386: iconst_0       
        //   387: anewarray       Ljava/lang/Class;
        //   390: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   393: aload_2        
        //   394: iconst_0       
        //   395: anewarray       Ljava/lang/Object;
        //   398: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   401: pop            
        //   402: aconst_null    
        //   403: areturn        
        //   404: astore          55
        //   406: aload           55
        //   408: athrow         
        //   409: astore          56
        //   411: aload           56
        //   413: athrow         
        //   414: astore          53
        //   416: aload           53
        //   418: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   421: goto            239
        //   424: astore          39
        //   426: aload           8
        //   428: ifnull          402
        //   431: aload           9
        //   433: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   436: bipush          111
        //   438: aaload         
        //   439: iconst_0       
        //   440: anewarray       Ljava/lang/Class;
        //   443: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   446: aload           8
        //   448: iconst_0       
        //   449: anewarray       Ljava/lang/Object;
        //   452: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   455: pop            
        //   456: goto            402
        //   459: astore          11
        //   461: aload           11
        //   463: athrow         
        //   464: astore          10
        //   466: goto            402
        //   469: astore          45
        //   471: aload           45
        //   473: athrow         
        //   474: astore          44
        //   476: aload           43
        //   478: areturn        
        //   479: astore          5
        //   481: aload           5
        //   483: athrow         
        //   484: astore          4
        //   486: goto            402
        //   489: astore          32
        //   491: aconst_null    
        //   492: astore          8
        //   494: aconst_null    
        //   495: astore          9
        //   497: aload           32
        //   499: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   502: aload           8
        //   504: ifnull          402
        //   507: aload           9
        //   509: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   512: bipush          113
        //   514: aaload         
        //   515: iconst_0       
        //   516: anewarray       Ljava/lang/Class;
        //   519: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   522: aload           8
        //   524: iconst_0       
        //   525: anewarray       Ljava/lang/Object;
        //   528: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   531: pop            
        //   532: goto            402
        //   535: astore          33
        //   537: goto            402
        //   540: astore          29
        //   542: aconst_null    
        //   543: astore          8
        //   545: aconst_null    
        //   546: astore          9
        //   548: aload           29
        //   550: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   553: aload           8
        //   555: ifnull          402
        //   558: aload           9
        //   560: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   563: bipush          115
        //   565: aaload         
        //   566: iconst_0       
        //   567: anewarray       Ljava/lang/Class;
        //   570: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   573: aload           8
        //   575: iconst_0       
        //   576: anewarray       Ljava/lang/Object;
        //   579: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   582: pop            
        //   583: goto            402
        //   586: astore          30
        //   588: goto            402
        //   591: astore          26
        //   593: aconst_null    
        //   594: astore          8
        //   596: aconst_null    
        //   597: astore          9
        //   599: aload           26
        //   601: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   604: aload           8
        //   606: ifnull          402
        //   609: aload           9
        //   611: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   614: bipush          107
        //   616: aaload         
        //   617: iconst_0       
        //   618: anewarray       Ljava/lang/Class;
        //   621: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   624: aload           8
        //   626: iconst_0       
        //   627: anewarray       Ljava/lang/Object;
        //   630: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   633: pop            
        //   634: goto            402
        //   637: astore          27
        //   639: goto            402
        //   642: astore          23
        //   644: aconst_null    
        //   645: astore          8
        //   647: aconst_null    
        //   648: astore          9
        //   650: aload           23
        //   652: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   655: aload           8
        //   657: ifnull          402
        //   660: aload           9
        //   662: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   665: bipush          108
        //   667: aaload         
        //   668: iconst_0       
        //   669: anewarray       Ljava/lang/Class;
        //   672: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   675: aload           8
        //   677: iconst_0       
        //   678: anewarray       Ljava/lang/Object;
        //   681: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   684: pop            
        //   685: goto            402
        //   688: astore          24
        //   690: goto            402
        //   693: astore          20
        //   695: aconst_null    
        //   696: astore          8
        //   698: aconst_null    
        //   699: astore          9
        //   701: aload           20
        //   703: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   706: aload           8
        //   708: ifnull          402
        //   711: aload           9
        //   713: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   716: bipush          116
        //   718: aaload         
        //   719: iconst_0       
        //   720: anewarray       Ljava/lang/Class;
        //   723: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   726: aload           8
        //   728: iconst_0       
        //   729: anewarray       Ljava/lang/Object;
        //   732: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   735: pop            
        //   736: goto            402
        //   739: astore          21
        //   741: goto            402
        //   744: astore          17
        //   746: aconst_null    
        //   747: astore          8
        //   749: aconst_null    
        //   750: astore          9
        //   752: aload           17
        //   754: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   757: aload           8
        //   759: ifnull          402
        //   762: aload           9
        //   764: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   767: bipush          114
        //   769: aaload         
        //   770: iconst_0       
        //   771: anewarray       Ljava/lang/Class;
        //   774: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   777: aload           8
        //   779: iconst_0       
        //   780: anewarray       Ljava/lang/Object;
        //   783: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   786: pop            
        //   787: goto            402
        //   790: astore          18
        //   792: goto            402
        //   795: astore          13
        //   797: aconst_null    
        //   798: astore          8
        //   800: aconst_null    
        //   801: astore          9
        //   803: aload           8
        //   805: ifnull          833
        //   808: aload           9
        //   810: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   813: bipush          117
        //   815: aaload         
        //   816: iconst_0       
        //   817: anewarray       Ljava/lang/Class;
        //   820: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   823: aload           8
        //   825: iconst_0       
        //   826: anewarray       Ljava/lang/Object;
        //   829: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   832: pop            
        //   833: aload           13
        //   835: athrow         
        //   836: astore          15
        //   838: aload           15
        //   840: athrow         
        //   841: astore          14
        //   843: goto            833
        //   846: astore          13
        //   848: aconst_null    
        //   849: astore          8
        //   851: goto            803
        //   854: astore          13
        //   856: goto            803
        //   859: astore          17
        //   861: aconst_null    
        //   862: astore          8
        //   864: goto            752
        //   867: astore          17
        //   869: goto            752
        //   872: astore          20
        //   874: aconst_null    
        //   875: astore          8
        //   877: goto            701
        //   880: astore          20
        //   882: goto            701
        //   885: astore          23
        //   887: aconst_null    
        //   888: astore          8
        //   890: goto            650
        //   893: astore          23
        //   895: goto            650
        //   898: astore          26
        //   900: aconst_null    
        //   901: astore          8
        //   903: goto            599
        //   906: astore          26
        //   908: goto            599
        //   911: astore          29
        //   913: aconst_null    
        //   914: astore          8
        //   916: goto            548
        //   919: astore          29
        //   921: goto            548
        //   924: astore          32
        //   926: aconst_null    
        //   927: astore          8
        //   929: goto            497
        //   932: astore          32
        //   934: goto            497
        //   937: astore          7
        //   939: aconst_null    
        //   940: astore          8
        //   942: aconst_null    
        //   943: astore          9
        //   945: goto            426
        //   948: astore          37
        //   950: aconst_null    
        //   951: astore          8
        //   953: goto            426
        //   956: astore_1       
        //   957: aconst_null    
        //   958: astore_2       
        //   959: aconst_null    
        //   960: astore_3       
        //   961: goto            375
        //   964: astore          36
        //   966: aload           9
        //   968: astore_3       
        //   969: aconst_null    
        //   970: astore_2       
        //   971: goto            375
        //   974: aconst_null    
        //   975: astore          43
        //   977: goto            320
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  0      11     956    964    Ljava/lang/IllegalArgumentException;
        //  0      11     937    948    Ljava/lang/RuntimeException;
        //  0      11     489    497    Ljava/lang/InstantiationException;
        //  0      11     540    548    Ljava/lang/reflect/InvocationTargetException;
        //  0      11     591    599    Ljava/lang/ClassNotFoundException;
        //  0      11     642    650    Ljava/lang/NoSuchMethodException;
        //  0      11     693    701    Ljava/lang/IllegalAccessException;
        //  0      11     744    752    Ljava/lang/LinkageError;
        //  0      11     795    803    Any
        //  15     22     964    974    Ljava/lang/IllegalArgumentException;
        //  15     22     948    956    Ljava/lang/RuntimeException;
        //  15     22     924    932    Ljava/lang/InstantiationException;
        //  15     22     911    919    Ljava/lang/reflect/InvocationTargetException;
        //  15     22     898    906    Ljava/lang/ClassNotFoundException;
        //  15     22     885    893    Ljava/lang/NoSuchMethodException;
        //  15     22     872    880    Ljava/lang/IllegalAccessException;
        //  15     22     859    867    Ljava/lang/LinkageError;
        //  15     22     846    854    Any
        //  26     97     367    375    Ljava/lang/IllegalArgumentException;
        //  26     97     424    426    Ljava/lang/RuntimeException;
        //  26     97     932    937    Ljava/lang/InstantiationException;
        //  26     97     919    924    Ljava/lang/reflect/InvocationTargetException;
        //  26     97     906    911    Ljava/lang/ClassNotFoundException;
        //  26     97     893    898    Ljava/lang/NoSuchMethodException;
        //  26     97     880    885    Ljava/lang/IllegalAccessException;
        //  26     97     867    872    Ljava/lang/LinkageError;
        //  26     97     854    859    Any
        //  102    107    357    362    Ljava/io/IOException;
        //  102    107    367    375    Ljava/lang/IllegalArgumentException;
        //  102    107    424    426    Ljava/lang/RuntimeException;
        //  102    107    932    937    Ljava/lang/InstantiationException;
        //  102    107    919    924    Ljava/lang/reflect/InvocationTargetException;
        //  102    107    906    911    Ljava/lang/ClassNotFoundException;
        //  102    107    893    898    Ljava/lang/NoSuchMethodException;
        //  102    107    880    885    Ljava/lang/IllegalAccessException;
        //  102    107    867    872    Ljava/lang/LinkageError;
        //  102    107    854    859    Any
        //  114    128    362    367    Ljava/io/IOException;
        //  114    128    367    375    Ljava/lang/IllegalArgumentException;
        //  114    128    424    426    Ljava/lang/RuntimeException;
        //  114    128    932    937    Ljava/lang/InstantiationException;
        //  114    128    919    924    Ljava/lang/reflect/InvocationTargetException;
        //  114    128    906    911    Ljava/lang/ClassNotFoundException;
        //  114    128    893    898    Ljava/lang/NoSuchMethodException;
        //  114    128    880    885    Ljava/lang/IllegalAccessException;
        //  114    128    867    872    Ljava/lang/LinkageError;
        //  114    128    854    859    Any
        //  135    164    414    424    Ljava/io/IOException;
        //  135    164    367    375    Ljava/lang/IllegalArgumentException;
        //  135    164    424    426    Ljava/lang/RuntimeException;
        //  135    164    932    937    Ljava/lang/InstantiationException;
        //  135    164    919    924    Ljava/lang/reflect/InvocationTargetException;
        //  135    164    906    911    Ljava/lang/ClassNotFoundException;
        //  135    164    893    898    Ljava/lang/NoSuchMethodException;
        //  135    164    880    885    Ljava/lang/IllegalAccessException;
        //  135    164    867    872    Ljava/lang/LinkageError;
        //  135    164    854    859    Any
        //  169    176    404    409    Ljava/io/IOException;
        //  169    176    367    375    Ljava/lang/IllegalArgumentException;
        //  169    176    424    426    Ljava/lang/RuntimeException;
        //  169    176    932    937    Ljava/lang/InstantiationException;
        //  169    176    919    924    Ljava/lang/reflect/InvocationTargetException;
        //  169    176    906    911    Ljava/lang/ClassNotFoundException;
        //  169    176    893    898    Ljava/lang/NoSuchMethodException;
        //  169    176    880    885    Ljava/lang/IllegalAccessException;
        //  169    176    867    872    Ljava/lang/LinkageError;
        //  169    176    854    859    Any
        //  181    188    409    414    Ljava/io/IOException;
        //  181    188    367    375    Ljava/lang/IllegalArgumentException;
        //  181    188    424    426    Ljava/lang/RuntimeException;
        //  181    188    932    937    Ljava/lang/InstantiationException;
        //  181    188    919    924    Ljava/lang/reflect/InvocationTargetException;
        //  181    188    906    911    Ljava/lang/ClassNotFoundException;
        //  181    188    893    898    Ljava/lang/NoSuchMethodException;
        //  181    188    880    885    Ljava/lang/IllegalAccessException;
        //  181    188    867    872    Ljava/lang/LinkageError;
        //  181    188    854    859    Any
        //  193    235    414    424    Ljava/io/IOException;
        //  193    235    367    375    Ljava/lang/IllegalArgumentException;
        //  193    235    424    426    Ljava/lang/RuntimeException;
        //  193    235    932    937    Ljava/lang/InstantiationException;
        //  193    235    919    924    Ljava/lang/reflect/InvocationTargetException;
        //  193    235    906    911    Ljava/lang/ClassNotFoundException;
        //  193    235    893    898    Ljava/lang/NoSuchMethodException;
        //  193    235    880    885    Ljava/lang/IllegalAccessException;
        //  193    235    867    872    Ljava/lang/LinkageError;
        //  193    235    854    859    Any
        //  244    269    469    474    Ljava/lang/LinkageError;
        //  244    269    474    479    Ljava/lang/Exception;
        //  272    304    367    375    Ljava/lang/IllegalArgumentException;
        //  272    304    424    426    Ljava/lang/RuntimeException;
        //  272    304    932    937    Ljava/lang/InstantiationException;
        //  272    304    919    924    Ljava/lang/reflect/InvocationTargetException;
        //  272    304    906    911    Ljava/lang/ClassNotFoundException;
        //  272    304    893    898    Ljava/lang/NoSuchMethodException;
        //  272    304    880    885    Ljava/lang/IllegalAccessException;
        //  272    304    867    872    Ljava/lang/LinkageError;
        //  272    304    854    859    Any
        //  309    320    367    375    Ljava/lang/IllegalArgumentException;
        //  309    320    424    426    Ljava/lang/RuntimeException;
        //  309    320    932    937    Ljava/lang/InstantiationException;
        //  309    320    919    924    Ljava/lang/reflect/InvocationTargetException;
        //  309    320    906    911    Ljava/lang/ClassNotFoundException;
        //  309    320    893    898    Ljava/lang/NoSuchMethodException;
        //  309    320    880    885    Ljava/lang/IllegalAccessException;
        //  309    320    867    872    Ljava/lang/LinkageError;
        //  309    320    854    859    Any
        //  325    354    367    375    Ljava/lang/IllegalArgumentException;
        //  325    354    424    426    Ljava/lang/RuntimeException;
        //  325    354    932    937    Ljava/lang/InstantiationException;
        //  325    354    919    924    Ljava/lang/reflect/InvocationTargetException;
        //  325    354    906    911    Ljava/lang/ClassNotFoundException;
        //  325    354    893    898    Ljava/lang/NoSuchMethodException;
        //  325    354    880    885    Ljava/lang/IllegalAccessException;
        //  325    354    867    872    Ljava/lang/LinkageError;
        //  325    354    854    859    Any
        //  359    362    362    367    Ljava/io/IOException;
        //  359    362    367    375    Ljava/lang/IllegalArgumentException;
        //  359    362    424    426    Ljava/lang/RuntimeException;
        //  359    362    932    937    Ljava/lang/InstantiationException;
        //  359    362    919    924    Ljava/lang/reflect/InvocationTargetException;
        //  359    362    906    911    Ljava/lang/ClassNotFoundException;
        //  359    362    893    898    Ljava/lang/NoSuchMethodException;
        //  359    362    880    885    Ljava/lang/IllegalAccessException;
        //  359    362    867    872    Ljava/lang/LinkageError;
        //  359    362    854    859    Any
        //  364    367    367    375    Ljava/lang/IllegalArgumentException;
        //  364    367    424    426    Ljava/lang/RuntimeException;
        //  364    367    932    937    Ljava/lang/InstantiationException;
        //  364    367    919    924    Ljava/lang/reflect/InvocationTargetException;
        //  364    367    906    911    Ljava/lang/ClassNotFoundException;
        //  364    367    893    898    Ljava/lang/NoSuchMethodException;
        //  364    367    880    885    Ljava/lang/IllegalAccessException;
        //  364    367    867    872    Ljava/lang/LinkageError;
        //  364    367    854    859    Any
        //  379    402    479    484    Ljava/lang/LinkageError;
        //  379    402    484    489    Ljava/lang/Exception;
        //  406    409    409    414    Ljava/io/IOException;
        //  406    409    367    375    Ljava/lang/IllegalArgumentException;
        //  406    409    424    426    Ljava/lang/RuntimeException;
        //  406    409    932    937    Ljava/lang/InstantiationException;
        //  406    409    919    924    Ljava/lang/reflect/InvocationTargetException;
        //  406    409    906    911    Ljava/lang/ClassNotFoundException;
        //  406    409    893    898    Ljava/lang/NoSuchMethodException;
        //  406    409    880    885    Ljava/lang/IllegalAccessException;
        //  406    409    867    872    Ljava/lang/LinkageError;
        //  406    409    854    859    Any
        //  411    414    414    424    Ljava/io/IOException;
        //  411    414    367    375    Ljava/lang/IllegalArgumentException;
        //  411    414    424    426    Ljava/lang/RuntimeException;
        //  411    414    932    937    Ljava/lang/InstantiationException;
        //  411    414    919    924    Ljava/lang/reflect/InvocationTargetException;
        //  411    414    906    911    Ljava/lang/ClassNotFoundException;
        //  411    414    893    898    Ljava/lang/NoSuchMethodException;
        //  411    414    880    885    Ljava/lang/IllegalAccessException;
        //  411    414    867    872    Ljava/lang/LinkageError;
        //  411    414    854    859    Any
        //  416    421    367    375    Ljava/lang/IllegalArgumentException;
        //  416    421    424    426    Ljava/lang/RuntimeException;
        //  416    421    932    937    Ljava/lang/InstantiationException;
        //  416    421    919    924    Ljava/lang/reflect/InvocationTargetException;
        //  416    421    906    911    Ljava/lang/ClassNotFoundException;
        //  416    421    893    898    Ljava/lang/NoSuchMethodException;
        //  416    421    880    885    Ljava/lang/IllegalAccessException;
        //  416    421    867    872    Ljava/lang/LinkageError;
        //  416    421    854    859    Any
        //  431    456    459    464    Ljava/lang/LinkageError;
        //  431    456    464    469    Ljava/lang/Exception;
        //  461    464    464    469    Ljava/lang/Exception;
        //  471    474    474    479    Ljava/lang/Exception;
        //  481    484    484    489    Ljava/lang/Exception;
        //  497    502    854    859    Any
        //  507    532    535    540    Ljava/lang/Exception;
        //  548    553    854    859    Any
        //  558    583    586    591    Ljava/lang/Exception;
        //  599    604    854    859    Any
        //  609    634    637    642    Ljava/lang/Exception;
        //  650    655    854    859    Any
        //  660    685    688    693    Ljava/lang/Exception;
        //  701    706    854    859    Any
        //  711    736    739    744    Ljava/lang/Exception;
        //  752    757    854    859    Any
        //  762    787    790    795    Ljava/lang/Exception;
        //  808    833    836    841    Ljava/lang/LinkageError;
        //  808    833    841    846    Ljava/lang/Exception;
        //  838    841    841    846    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:3035)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
    
    public static File b(final Context context) {
        Label_0045: {
            if (br.d != null) {
                break Label_0045;
            }
            final String string = context.getSharedPreferences(br.z[35], 0).getString(br.z[36], (String)null);
            if (string == null) {
                break Label_0045;
            }
            try {
                br.d = new File(string);
                return br.d;
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
        }
    }
    
    public static File b(final Uri p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_1       
        //     2: getstatic       com/whatsapp/util/Log.l:Z
        //     5: istore_2       
        //     6: aload_0        
        //     7: invokevirtual   android/net/Uri.getScheme:()Ljava/lang/String;
        //    10: ifnull          34
        //    13: aload_0        
        //    14: invokevirtual   android/net/Uri.getScheme:()Ljava/lang/String;
        //    17: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //    20: sipush          135
        //    23: aaload         
        //    24: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    27: istore          5
        //    29: iload           5
        //    31: ifeq            53
        //    34: new             Ljava/io/File;
        //    37: dup            
        //    38: aload_0        
        //    39: invokevirtual   android/net/Uri.getPath:()Ljava/lang/String;
        //    42: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    45: astore          4
        //    47: aload           4
        //    49: areturn        
        //    50: astore_3       
        //    51: aload_3        
        //    52: athrow         
        //    53: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //    56: astore          27
        //    58: iconst_1       
        //    59: anewarray       Ljava/lang/String;
        //    62: astore          28
        //    64: aload           28
        //    66: iconst_0       
        //    67: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //    70: sipush          136
        //    73: aaload         
        //    74: aastore        
        //    75: aload           27
        //    77: aload_0        
        //    78: aload           28
        //    80: aconst_null    
        //    81: aconst_null    
        //    82: aconst_null    
        //    83: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    86: astore          29
        //    88: aload           29
        //    90: astore          7
        //    92: aload           7
        //    94: ifnull          395
        //    97: aload           7
        //    99: invokeinterface android/database/Cursor.getColumnCount:()I
        //   104: istore          20
        //   106: iload           20
        //   108: ifle            386
        //   111: aload           7
        //   113: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   118: istore          25
        //   120: iload           25
        //   122: ifeq            386
        //   125: aload           7
        //   127: iconst_0       
        //   128: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   133: astore          21
        //   135: aload           21
        //   137: ifnull          199
        //   140: new             Ljava/io/File;
        //   143: dup            
        //   144: aload           21
        //   146: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   149: astore          22
        //   151: aload           22
        //   153: invokevirtual   java/io/File.exists:()Z
        //   156: ifne            202
        //   159: new             Ljava/io/FileNotFoundException;
        //   162: dup            
        //   163: aload           21
        //   165: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //   168: athrow         
        //   169: astore          26
        //   171: aload           26
        //   173: athrow         
        //   174: astore          19
        //   176: aload           7
        //   178: invokeinterface android/database/Cursor.close:()V
        //   183: aload           19
        //   185: athrow         
        //   186: astore          6
        //   188: aconst_null    
        //   189: astore          7
        //   191: goto            92
        //   194: astore          24
        //   196: aload           24
        //   198: athrow         
        //   199: aconst_null    
        //   200: astore          22
        //   202: aload           7
        //   204: invokeinterface android/database/Cursor.close:()V
        //   209: aload           21
        //   211: astore          23
        //   213: aload           22
        //   215: astore          4
        //   217: aload           23
        //   219: astore          8
        //   221: aload           8
        //   223: ifnonnull       47
        //   226: invokestatic    com/whatsapp/util/br.c:()Ljava/lang/String;
        //   229: invokestatic    com/whatsapp/App.D:(Ljava/lang/String;)Ljava/io/File;
        //   232: astore          4
        //   234: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //   237: aload_0        
        //   238: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   241: astore          13
        //   243: new             Ljava/io/FileOutputStream;
        //   246: dup            
        //   247: aload           4
        //   249: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   252: astore          14
        //   254: sipush          4096
        //   257: newarray        B
        //   259: astore          15
        //   261: aload           13
        //   263: aload           15
        //   265: iconst_0       
        //   266: aload           15
        //   268: arraylength    
        //   269: invokevirtual   java/io/InputStream.read:([BII)I
        //   272: istore          16
        //   274: iload           16
        //   276: iflt            293
        //   279: aload           14
        //   281: aload           15
        //   283: iconst_0       
        //   284: iload           16
        //   286: invokevirtual   java/io/OutputStream.write:([BII)V
        //   289: iload_2        
        //   290: ifeq            261
        //   293: aload           13
        //   295: ifnull          303
        //   298: aload           13
        //   300: invokevirtual   java/io/InputStream.close:()V
        //   303: aload           14
        //   305: ifnull          47
        //   308: aload           13
        //   310: invokevirtual   java/io/InputStream.close:()V
        //   313: aload           4
        //   315: areturn        
        //   316: astore          17
        //   318: aload           17
        //   320: athrow         
        //   321: astore          18
        //   323: aload           18
        //   325: athrow         
        //   326: astore          9
        //   328: aconst_null    
        //   329: astore          10
        //   331: aload           10
        //   333: ifnull          341
        //   336: aload           10
        //   338: invokevirtual   java/io/InputStream.close:()V
        //   341: aload_1        
        //   342: ifnull          350
        //   345: aload           10
        //   347: invokevirtual   java/io/InputStream.close:()V
        //   350: aload           9
        //   352: athrow         
        //   353: astore          12
        //   355: aload           12
        //   357: athrow         
        //   358: astore          11
        //   360: aload           11
        //   362: athrow         
        //   363: astore          9
        //   365: aload           13
        //   367: astore          10
        //   369: aconst_null    
        //   370: astore_1       
        //   371: goto            331
        //   374: astore          9
        //   376: aload           14
        //   378: astore_1       
        //   379: aload           13
        //   381: astore          10
        //   383: goto            331
        //   386: aconst_null    
        //   387: astore          21
        //   389: aconst_null    
        //   390: astore          22
        //   392: goto            202
        //   395: aconst_null    
        //   396: astore          4
        //   398: aconst_null    
        //   399: astore          8
        //   401: goto            221
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  6      29     50     53     Ljava/lang/IllegalArgumentException;
        //  53     88     186    194    Ljava/lang/IllegalArgumentException;
        //  97     106    174    186    Any
        //  111    120    194    199    Ljava/lang/IllegalArgumentException;
        //  111    120    174    186    Any
        //  125    135    174    186    Any
        //  140    151    174    186    Any
        //  151    169    169    174    Ljava/lang/IllegalArgumentException;
        //  151    169    174    186    Any
        //  171    174    174    186    Any
        //  196    199    174    186    Any
        //  226    243    326    331    Any
        //  243    254    363    374    Any
        //  254    261    374    386    Any
        //  261    274    374    386    Any
        //  279    289    374    386    Any
        //  298    303    321    326    Ljava/lang/IllegalArgumentException;
        //  308    313    316    321    Ljava/lang/IllegalArgumentException;
        //  336    341    353    358    Ljava/lang/IllegalArgumentException;
        //  345    350    358    363    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 194, Size: 194
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
    
    public static String b(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_1       
        //     4: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //     7: bipush          127
        //     9: aaload         
        //    10: invokestatic    java/security/MessageDigest.getInstance:(Ljava/lang/String;)Ljava/security/MessageDigest;
        //    13: astore          17
        //    15: aload           17
        //    17: astore_3       
        //    18: aload_3        
        //    19: ifnonnull       74
        //    22: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //    25: sipush          128
        //    28: aaload         
        //    29: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    32: aconst_null    
        //    33: areturn        
        //    34: astore_2       
        //    35: new             Ljava/lang/StringBuilder;
        //    38: dup            
        //    39: invokespecial   java/lang/StringBuilder.<init>:()V
        //    42: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //    45: bipush          125
        //    47: aaload         
        //    48: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    51: aload_2        
        //    52: invokevirtual   java/security/NoSuchAlgorithmException.toString:()Ljava/lang/String;
        //    55: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    58: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    61: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    64: aconst_null    
        //    65: astore_3       
        //    66: goto            18
        //    69: astore          16
        //    71: aload           16
        //    73: athrow         
        //    74: sipush          8192
        //    77: newarray        B
        //    79: astore          4
        //    81: new             Ljava/io/FileInputStream;
        //    84: dup            
        //    85: aload_0        
        //    86: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    89: astore          5
        //    91: aload           5
        //    93: aload           4
        //    95: invokevirtual   java/io/InputStream.read:([B)I
        //    98: istore          12
        //   100: iload           12
        //   102: ifle            118
        //   105: aload_3        
        //   106: aload           4
        //   108: iconst_0       
        //   109: iload           12
        //   111: invokevirtual   java/security/MessageDigest.update:([BII)V
        //   114: iload_1        
        //   115: ifeq            91
        //   118: aload           5
        //   120: ifnull          128
        //   123: aload           5
        //   125: invokevirtual   java/io/InputStream.close:()V
        //   128: aload_3        
        //   129: invokevirtual   java/security/MessageDigest.digest:()[B
        //   132: iconst_2       
        //   133: invokestatic    android/backport/util/Base64.encodeToString:([BI)Ljava/lang/String;
        //   136: areturn        
        //   137: astore          14
        //   139: aload           14
        //   141: athrow         
        //   142: astore          13
        //   144: new             Ljava/lang/StringBuilder;
        //   147: dup            
        //   148: invokespecial   java/lang/StringBuilder.<init>:()V
        //   151: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   154: bipush          124
        //   156: aaload         
        //   157: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   160: aload           13
        //   162: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   165: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   168: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   171: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   174: goto            128
        //   177: astore          6
        //   179: aconst_null    
        //   180: astore          5
        //   182: new             Ljava/lang/StringBuilder;
        //   185: dup            
        //   186: invokespecial   java/lang/StringBuilder.<init>:()V
        //   189: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   192: bipush          123
        //   194: aaload         
        //   195: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   198: aload           6
        //   200: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   203: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   206: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   209: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   212: aload           5
        //   214: ifnull          32
        //   217: aload           5
        //   219: invokevirtual   java/io/InputStream.close:()V
        //   222: aconst_null    
        //   223: areturn        
        //   224: astore          11
        //   226: new             Ljava/lang/StringBuilder;
        //   229: dup            
        //   230: invokespecial   java/lang/StringBuilder.<init>:()V
        //   233: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   236: sipush          129
        //   239: aaload         
        //   240: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   243: aload           11
        //   245: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   248: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   251: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   254: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   257: aconst_null    
        //   258: areturn        
        //   259: astore          10
        //   261: aload           10
        //   263: athrow         
        //   264: astore          15
        //   266: aconst_null    
        //   267: astore          5
        //   269: aload           15
        //   271: astore          7
        //   273: aload           5
        //   275: ifnull          283
        //   278: aload           5
        //   280: invokevirtual   java/io/InputStream.close:()V
        //   283: aload           7
        //   285: athrow         
        //   286: astore          9
        //   288: aload           9
        //   290: athrow         
        //   291: astore          8
        //   293: new             Ljava/lang/StringBuilder;
        //   296: dup            
        //   297: invokespecial   java/lang/StringBuilder.<init>:()V
        //   300: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   303: bipush          126
        //   305: aaload         
        //   306: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   309: aload           8
        //   311: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   314: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   317: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   320: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   323: goto            283
        //   326: astore          7
        //   328: goto            273
        //   331: astore          6
        //   333: goto            182
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                    
        //  -----  -----  -----  -----  ----------------------------------------
        //  4      15     34     69     Ljava/security/NoSuchAlgorithmException;
        //  22     32     69     74     Ljava/security/NoSuchAlgorithmException;
        //  81     91     177    182    Ljava/io/IOException;
        //  81     91     264    273    Any
        //  91     100    331    336    Ljava/io/IOException;
        //  91     100    326    331    Any
        //  105    114    331    336    Ljava/io/IOException;
        //  105    114    326    331    Any
        //  123    128    142    177    Ljava/io/IOException;
        //  123    128    137    142    Ljava/security/NoSuchAlgorithmException;
        //  182    212    326    331    Any
        //  217    222    224    259    Ljava/io/IOException;
        //  217    222    259    264    Ljava/security/NoSuchAlgorithmException;
        //  278    283    291    326    Ljava/io/IOException;
        //  278    283    286    291    Ljava/security/NoSuchAlgorithmException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0032:
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
    
    public static void b() {
        Log.e(br.z[132] + Debug.getNativeHeapAllocatedSize() / 1024L + br.z[133]);
        App.Z.trimToSize(0);
    }
    
    public static int c(final Uri p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: invokevirtual   android/net/Uri.getScheme:()Ljava/lang/String;
        //     8: ifnull          31
        //    11: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //    14: bipush          92
        //    16: aaload         
        //    17: aload_0        
        //    18: invokevirtual   android/net/Uri.getScheme:()Ljava/lang/String;
        //    21: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    24: istore          23
        //    26: iload           23
        //    28: ifeq            447
        //    31: new             Landroid/media/ExifInterface;
        //    34: dup            
        //    35: aload_0        
        //    36: invokevirtual   android/net/Uri.getPath:()Ljava/lang/String;
        //    39: invokespecial   android/media/ExifInterface.<init>:(Ljava/lang/String;)V
        //    42: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //    45: bipush          99
        //    47: aaload         
        //    48: iconst_1       
        //    49: invokevirtual   android/media/ExifInterface.getAttributeInt:(Ljava/lang/String;I)I
        //    52: istore_3       
        //    53: iload_1        
        //    54: ifeq            310
        //    57: iload_3        
        //    58: istore          4
        //    60: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //    63: bipush          96
        //    65: aaload         
        //    66: aload_0        
        //    67: invokevirtual   android/net/Uri.getScheme:()Ljava/lang/String;
        //    70: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    73: istore          7
        //    75: iload           7
        //    77: ifeq            441
        //    80: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //    83: bipush          95
        //    85: aaload         
        //    86: aload_0        
        //    87: invokevirtual   android/net/Uri.getAuthority:()Ljava/lang/String;
        //    90: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    93: istore          8
        //    95: iload           8
        //    97: ifeq            441
        //   100: iconst_2       
        //   101: anewarray       Ljava/lang/String;
        //   104: astore          9
        //   106: aload           9
        //   108: iconst_0       
        //   109: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   112: bipush          94
        //   114: aaload         
        //   115: aastore        
        //   116: aload           9
        //   118: iconst_1       
        //   119: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   122: bipush          98
        //   124: aaload         
        //   125: aastore        
        //   126: aload_0        
        //   127: invokevirtual   android/net/Uri.buildUpon:()Landroid/net/Uri$Builder;
        //   130: aconst_null    
        //   131: invokevirtual   android/net/Uri$Builder.query:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   134: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //   137: astore          10
        //   139: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //   142: aload           10
        //   144: aload           9
        //   146: aconst_null    
        //   147: aconst_null    
        //   148: aconst_null    
        //   149: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   152: astore          11
        //   154: aload           11
        //   156: ifnull          435
        //   159: aload           11
        //   161: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   166: istore          17
        //   168: iload           17
        //   170: ifeq            429
        //   173: aload           11
        //   175: invokeinterface android/database/Cursor.getColumnCount:()I
        //   180: istore          19
        //   182: iload           19
        //   184: iconst_2       
        //   185: if_icmpne       423
        //   188: aload           11
        //   190: iconst_0       
        //   191: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   196: astore          21
        //   198: aload           21
        //   200: ifnull          417
        //   203: new             Landroid/media/ExifInterface;
        //   206: dup            
        //   207: aload           21
        //   209: invokespecial   android/media/ExifInterface.<init>:(Ljava/lang/String;)V
        //   212: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   215: bipush          93
        //   217: aaload         
        //   218: iconst_1       
        //   219: invokevirtual   android/media/ExifInterface.getAttributeInt:(Ljava/lang/String;I)I
        //   222: istore_3       
        //   223: iload_1        
        //   224: ifeq            272
        //   227: aload           11
        //   229: iconst_1       
        //   230: invokeinterface android/database/Cursor.getInt:(I)I
        //   235: istore          22
        //   237: iload           22
        //   239: lookupswitch {
        //               90: 378
        //              180: 385
        //              270: 391
        //          default: 272
        //        }
        //   272: iload_1        
        //   273: ifeq            298
        //   276: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   279: bipush          100
        //   281: aaload         
        //   282: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   285: iload_1        
        //   286: ifeq            298
        //   289: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   292: bipush          97
        //   294: aaload         
        //   295: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   298: aload           11
        //   300: ifnull          310
        //   303: aload           11
        //   305: invokeinterface android/database/Cursor.close:()V
        //   310: new             Ljava/lang/StringBuilder;
        //   313: dup            
        //   314: invokespecial   java/lang/StringBuilder.<init>:()V
        //   317: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //   320: bipush          101
        //   322: aaload         
        //   323: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   326: iload_3        
        //   327: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   330: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   333: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   336: iload_3        
        //   337: ireturn        
        //   338: astore_2       
        //   339: aload_2        
        //   340: athrow         
        //   341: astore          5
        //   343: aload           5
        //   345: athrow         
        //   346: astore          6
        //   348: aload           6
        //   350: athrow         
        //   351: astore          15
        //   353: aload           15
        //   355: athrow         
        //   356: astore          16
        //   358: aload           16
        //   360: athrow         
        //   361: astore          13
        //   363: aload           11
        //   365: ifnull          375
        //   368: aload           11
        //   370: invokeinterface android/database/Cursor.close:()V
        //   375: aload           13
        //   377: athrow         
        //   378: bipush          6
        //   380: istore_3       
        //   381: iload_1        
        //   382: ifeq            272
        //   385: iconst_3       
        //   386: istore_3       
        //   387: iload_1        
        //   388: ifeq            272
        //   391: bipush          8
        //   393: istore_3       
        //   394: goto            272
        //   397: astore          20
        //   399: aload           20
        //   401: athrow         
        //   402: astore          18
        //   404: aload           18
        //   406: athrow         
        //   407: astore          12
        //   409: aload           12
        //   411: athrow         
        //   412: astore          14
        //   414: aload           14
        //   416: athrow         
        //   417: iload           4
        //   419: istore_3       
        //   420: goto            227
        //   423: iload           4
        //   425: istore_3       
        //   426: goto            276
        //   429: iload           4
        //   431: istore_3       
        //   432: goto            289
        //   435: iload           4
        //   437: istore_3       
        //   438: goto            298
        //   441: iload           4
        //   443: istore_3       
        //   444: goto            310
        //   447: iconst_0       
        //   448: istore          4
        //   450: goto            60
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      26     338    341    Ljava/lang/NumberFormatException;
        //  60     75     341    346    Ljava/lang/NumberFormatException;
        //  80     95     346    351    Ljava/lang/NumberFormatException;
        //  159    168    351    356    Ljava/lang/NumberFormatException;
        //  159    168    361    378    Any
        //  173    182    356    361    Ljava/lang/NumberFormatException;
        //  173    182    361    378    Any
        //  188    198    361    378    Any
        //  203    223    361    378    Any
        //  227    237    361    378    Any
        //  276    285    397    402    Ljava/lang/NumberFormatException;
        //  276    285    361    378    Any
        //  289    298    402    407    Ljava/lang/NumberFormatException;
        //  289    298    361    378    Any
        //  303    310    407    412    Ljava/lang/NumberFormatException;
        //  343    346    346    351    Ljava/lang/NumberFormatException;
        //  353    356    356    361    Ljava/lang/NumberFormatException;
        //  353    356    361    378    Any
        //  358    361    361    378    Any
        //  368    375    412    417    Ljava/lang/NumberFormatException;
        //  399    402    402    407    Ljava/lang/NumberFormatException;
        //  399    402    361    378    Any
        //  404    407    361    378    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 205, Size: 205
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
    
    public static String c() {
        return al5.d(App.aX.jabber_id + System.currentTimeMillis());
    }
    
    public static String c(String s) {
        if (s == null) {
            s = null;
        }
        else {
            try {
                if (App.aV < 2) {
                    final String s2 = s;
                    final URL url = new URL(s2);
                    final String a = a(url);
                    return a;
                }
                return s;
            }
            catch (MalformedURLException ex) {
                throw ex;
            }
            try {
                final String s2 = s;
                final URL url = new URL(s2);
                final String a2;
                final String a = a2 = a(url);
                return a2;
            }
            catch (MalformedURLException ex3) {
                try {
                    Log.w(br.z[149]);
                    if (s.length() <= 25) {
                        return br.z[150];
                    }
                }
                catch (MalformedURLException ex2) {
                    throw ex2;
                }
                return s.substring(0, -25 + s.length()) + br.z[151];
            }
        }
        return s;
    }
    
    public static void c(final Context context) {
        synchronized (br.class) {
            if (br.c <= 0) {
                return;
            }
            final SharedPreferences$Editor edit = context.getSharedPreferences(br.z[103], 0).edit();
            try {
                --br.c;
                edit.putInt(br.z[104], br.c);
                if (!edit.commit()) {
                    Log.e(br.z[102]);
                }
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
        }
    }
    
    private static boolean d(final Uri p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/DataInputStream;
        //     3: dup            
        //     4: aload_0        
        //     5: invokestatic    com/whatsapp/util/br.f:(Landroid/net/Uri;)Ljava/io/InputStream;
        //     8: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //    11: astore_1       
        //    12: aload_1        
        //    13: invokevirtual   java/io/DataInputStream.readInt:()I
        //    16: istore          10
        //    18: iload           10
        //    20: ldc_w           -2555936
        //    23: if_icmpeq       45
        //    26: iconst_0       
        //    27: istore          7
        //    29: aload_1        
        //    30: ifnull          37
        //    33: aload_1        
        //    34: invokevirtual   java/io/DataInputStream.close:()V
        //    37: iload           7
        //    39: ireturn        
        //    40: astore          12
        //    42: aload           12
        //    44: athrow         
        //    45: aload_1        
        //    46: invokevirtual   java/io/DataInputStream.readShort:()S
        //    49: pop            
        //    50: aload_1        
        //    51: invokevirtual   java/io/DataInputStream.readInt:()I
        //    54: istore          15
        //    56: iconst_0       
        //    57: istore          7
        //    59: iload           15
        //    61: ldc_w           1246120262
        //    64: if_icmpne       70
        //    67: iconst_1       
        //    68: istore          7
        //    70: aload_1        
        //    71: ifnull          37
        //    74: aload_1        
        //    75: invokevirtual   java/io/DataInputStream.close:()V
        //    78: iload           7
        //    80: ireturn        
        //    81: astore          17
        //    83: iload           7
        //    85: ireturn        
        //    86: astore          13
        //    88: aload           13
        //    90: athrow         
        //    91: astore          5
        //    93: aload_1        
        //    94: astore          6
        //    96: iconst_0       
        //    97: istore          7
        //    99: aload           6
        //   101: ifnull          37
        //   104: aload           6
        //   106: invokevirtual   java/io/DataInputStream.close:()V
        //   109: iconst_0       
        //   110: ireturn        
        //   111: astore          9
        //   113: iconst_0       
        //   114: ireturn        
        //   115: astore          16
        //   117: aload           16
        //   119: athrow         
        //   120: astore          8
        //   122: aload           8
        //   124: athrow         
        //   125: astore_2       
        //   126: aconst_null    
        //   127: astore_1       
        //   128: aload_1        
        //   129: ifnull          136
        //   132: aload_1        
        //   133: invokevirtual   java/io/DataInputStream.close:()V
        //   136: aload_2        
        //   137: athrow         
        //   138: astore          4
        //   140: aload           4
        //   142: athrow         
        //   143: astore          11
        //   145: iconst_0       
        //   146: ireturn        
        //   147: astore_3       
        //   148: goto            136
        //   151: astore_2       
        //   152: goto            128
        //   155: astore          18
        //   157: aconst_null    
        //   158: astore          6
        //   160: goto            96
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      12     155    163    Ljava/io/IOException;
        //  0      12     125    128    Any
        //  12     18     91     96     Ljava/io/IOException;
        //  12     18     151    155    Any
        //  33     37     143    147    Ljava/io/IOException;
        //  33     37     40     45     Ljava/lang/NumberFormatException;
        //  45     56     86     91     Ljava/io/IOException;
        //  45     56     151    155    Any
        //  74     78     81     86     Ljava/io/IOException;
        //  74     78     115    120    Ljava/lang/NumberFormatException;
        //  88     91     91     96     Ljava/io/IOException;
        //  88     91     151    155    Any
        //  104    109    111    115    Ljava/io/IOException;
        //  104    109    120    125    Ljava/lang/NumberFormatException;
        //  132    136    147    151    Ljava/io/IOException;
        //  132    136    138    143    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 91, Size: 91
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
    
    public static byte e(final Uri uri) {
        String s = App.i.getType(uri);
        if (s == null) {
            final String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.getPath());
            if (fileExtensionFromUrl != null) {
                s = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
            }
        }
        if (s != null) {
            try {
                if (s.startsWith(br.z[152])) {
                    return 2;
                }
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
            try {
                if (s.startsWith(br.z[154])) {
                    return 3;
                }
            }
            catch (NumberFormatException ex2) {
                throw ex2;
            }
            try {
                if (s.startsWith(br.z[156])) {
                    return 1;
                }
            }
            catch (NumberFormatException ex3) {
                throw ex3;
            }
            try {
                if (s.startsWith(br.z[153])) {
                    return 4;
                }
            }
            catch (NumberFormatException ex4) {
                throw ex4;
            }
            try {
                if (s.startsWith(br.z[155])) {
                    return 0;
                }
            }
            catch (NumberFormatException ex5) {
                throw ex5;
            }
        }
        return -1;
    }
    
    public static InputStream f(final Uri p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   android/net/Uri.buildUpon:()Landroid/net/Uri$Builder;
        //     4: aconst_null    
        //     5: invokevirtual   android/net/Uri$Builder.query:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //     8: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //    11: astore_1       
        //    12: aload_1        
        //    13: invokevirtual   android/net/Uri.getScheme:()Ljava/lang/String;
        //    16: astore          4
        //    18: aload           4
        //    20: ifnull          40
        //    23: aload_1        
        //    24: invokevirtual   android/net/Uri.getScheme:()Ljava/lang/String;
        //    27: getstatic       com/whatsapp/util/br.z:[Ljava/lang/String;
        //    30: sipush          134
        //    33: aaload         
        //    34: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    37: ifeq            65
        //    40: new             Ljava/io/FileInputStream;
        //    43: dup            
        //    44: new             Ljava/io/File;
        //    47: dup            
        //    48: aload_1        
        //    49: invokevirtual   android/net/Uri.getPath:()Ljava/lang/String;
        //    52: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    55: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    58: areturn        
        //    59: astore_2       
        //    60: aload_2        
        //    61: athrow         
        //    62: astore_3       
        //    63: aload_3        
        //    64: athrow         
        //    65: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //    68: aload_1        
        //    69: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //    72: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  12     18     59     62     Ljava/lang/NumberFormatException;
        //  23     40     62     65     Ljava/lang/NumberFormatException;
        //  40     59     62     65     Ljava/lang/NumberFormatException;
        //  60     62     62     65     Ljava/lang/NumberFormatException;
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
    
    public static Bitmap g(final Uri uri) {
        return a(uri, ym.j, ym.j);
    }
}
