import android.provider.ContactsContract$CommonDataKinds$Phone;
import android.provider.ContactsContract$CommonDataKinds$Im;
import android.telephony.PhoneNumberUtils;
import com.whatsapp.DialogToastActivity;
import android.database.Cursor;
import android.provider.ContactsContract$Data;
import java.util.Iterator;
import android.provider.ContactsContract$CommonDataKinds$StructuredPostal;
import android.provider.ContactsContract$CommonDataKinds$Email;
import com.whatsapp.util.Log;
import android.text.TextUtils;
import java.util.ArrayList;
import android.content.Context;
import java.util.Map;
import java.util.List;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.5.30
// 

public class o
{
    public static HashMap a;
    public static boolean b;
    public static HashMap c;
    private static final String[] z;
    public List d;
    public List e;
    public k f;
    public List g;
    public Map h;
    public byte[] i;
    public List j;
    public String k;
    public String l;
    private Context m;
    
    static {
        final String[] z2 = new String[122];
        String s = "\u0000d\u0016\u0017b";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_3082:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'P';
                        break;
                    }
                    case 0: {
                        c2 = 'd';
                        break;
                    }
                    case 1: {
                        c2 = '\u0005';
                        break;
                    }
                    case 2: {
                        c2 = 'b';
                        break;
                    }
                    case 3: {
                        c2 = 'v';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0000d\u0016\u0017a";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\rv=\u0006\"\rh\u0003\u0004)";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0000d\u0016\u0017c";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "\u0007j\f\u00021\u0007q=\u001f4D8BI";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    s = "\u0007j\f\u00021\u0007q=\u001f4D8BIp%K&V=\rh\u0007\u0002)\u0014`BKp[%";
                    n = 4;
                    n2 = 5;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    array = z2;
                    s = "\u0000d\u0016\u0017a";
                    n = 5;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0012k\u0006X1\na\u0010\u00199\u0000+\u0001\u0003\"\u0017j\u0010X9\u0010`\u000fY9\t";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0000d\u0016\u0017e";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0007j\f\u00021\u0007q=\u001f4D8BIp%K&V=\rh\u0007\u0002)\u0014`BKp[%";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0000d\u0016\u0017aQ";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0012k\u0006X1\na\u0010\u00199\u0000+\u0001\u0003\"\u0017j\u0010X9\u0010`\u000fY \fj\u0016\u0019";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u0007j\f\u00021\u0007q=\u001f4D8BI";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u0000d\u0016\u0017d";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u0000d\u0016\u0017b";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u0000d\u0016\u0017i";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\u0007j\f\u00021\u0007q=\u001f4D8BIp%K&V=\rh\u0007\u0002)\u0014`_I";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u0012k\u0006X1\na\u0010\u00199\u0000+\u0001\u0003\"\u0017j\u0010X9\u0010`\u000fY>\u0005h\u0007";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u0000d\u0016\u0017e";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\u0000d\u0016\u0017f";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\u0000d\u0016\u0017f";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\u0000d\u0016\u0017i";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "\u0000d\u0016\u0017d";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "\u0000d\u0016\u0017c";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u0000d\u0016\u0017e";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "\u0000d\u0016\u0017b";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\u0000d\u0016\u0017g";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "\u0000d\u0016\u0017c";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "\u0000d\u0016\u0017g";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "6@4";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "0L6:\u0015";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "4W'0";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "4D%3\u0002";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "*j\fV\u0006'D02p\u0000d\u0016\u0017p\rvB\u001f>\u0017`\u0010\u00025\u0000+";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = " J/";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "7J78\u0014";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "<(";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "<(";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "4J1\"\u0011(";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "'J/&\u0011*\\";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "<(";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "0_";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "4W-0\u0019(@";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = ",J/3";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "\nd\u000f\u0013\u007f(J%9\u007f\u0013`=\u0012?\n\"\u0016)#\u0011u\u0012\u0019\"\u0010";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "4W-2\u0019 ";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "3J0=";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "%A0";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = ",J/3";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "2J+5\u0015";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "\"D:";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = ",J/3";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "\"K";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "1W.";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "-K6:";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "4D05\u0015(";
                    n = 54;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "'@.:";
                    n = 55;
                    array = z2;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "6J.3";
                    n = 56;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "#@-";
                    n = 57;
                    array = z2;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "<(2>\u001f*@6?\u0013II#%\u0004IK#;\u0015";
                    n = 58;
                    array = z2;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "4W'0";
                    n = 59;
                    array = z2;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    n2 = 61;
                    s = "4M-\"\u001f";
                    n = 60;
                    array = z2;
                    continue;
                }
                case 60: {
                    array[n2] = intern;
                    n2 = 62;
                    s = "<(2>\u001f*@6?\u0013IC+$\u00030(,7\u001d!";
                    n = 61;
                    array = z2;
                    continue;
                }
                case 61: {
                    array[n2] = intern;
                    n2 = 63;
                    s = "'@.:";
                    n = 62;
                    array = z2;
                    continue;
                }
                case 62: {
                    array[n2] = intern;
                    n2 = 64;
                    s = "/@;";
                    n = 63;
                    array = z2;
                    continue;
                }
                case 63: {
                    array[n2] = intern;
                    n2 = 65;
                    s = "7J0\"}7Q0?\u001e#";
                    n = 64;
                    array = z2;
                    continue;
                }
                case 64: {
                    array[n2] = intern;
                    n2 = 66;
                    s = "0@.";
                    n = 65;
                    array = z2;
                    continue;
                }
                case 65: {
                    array[n2] = intern;
                    n2 = 67;
                    s = "<(+$\u001d'(,";
                    n = 66;
                    array = z2;
                    continue;
                }
                case 66: {
                    array[n2] = intern;
                    n2 = 68;
                    s = "<(2>\u001f*@6?\u0013IH+2\u0014(@O8\u0011)@";
                    n = 67;
                    array = z2;
                    continue;
                }
                case 67: {
                    array[n2] = intern;
                    n2 = 69;
                    s = "\u0007j\f\u0005$\u0016p\u0001\u00023\u000bk\u0016\u00173\u0010c\u0010\u0019=\u0012k\r\u00125KP\f\u00151\u0011b\n\u0002p!}\u0001\u0013 \u0010l\r\u0018\u007f'j\f\u00021\u0007q1\u0002\"\u0011f\u0016L";
                    n = 68;
                    array = z2;
                    continue;
                }
                case 68: {
                    array[n2] = intern;
                    n2 = 70;
                    s = ",J/3";
                    n = 69;
                    array = z2;
                    continue;
                }
                case 69: {
                    array[n2] = intern;
                    n2 = 71;
                    s = "*D/3";
                    n = 70;
                    array = z2;
                    continue;
                }
                case 70: {
                    array[n2] = intern;
                    n2 = 72;
                    s = "1L&";
                    n = 71;
                    array = z2;
                    continue;
                }
                case 71: {
                    array[n2] = intern;
                    n2 = 73;
                    s = "2@0%\u0019+K";
                    n = 72;
                    array = z2;
                    continue;
                }
                case 72: {
                    array[n2] = intern;
                    n2 = 74;
                    s = "3J0=";
                    n = 73;
                    array = z2;
                    continue;
                }
                case 73: {
                    array[n2] = intern;
                    n2 = 75;
                    s = ")V%";
                    n = 74;
                    array = z2;
                    continue;
                }
                case 74: {
                    array[n2] = intern;
                    n2 = 76;
                    s = "'D63\u0017+W+3\u0003";
                    n = 75;
                    array = z2;
                    continue;
                }
                case 75: {
                    array[n2] = intern;
                    n2 = 77;
                    s = "*L!=\u001e%H'";
                    n = 76;
                    array = z2;
                    continue;
                }
                case 76: {
                    array[n2] = intern;
                    n2 = 78;
                    s = "+W%";
                    n = 77;
                    array = z2;
                    continue;
                }
                case 77: {
                    array[n2] = intern;
                    n2 = 79;
                    s = "3J0=";
                    n = 78;
                    array = z2;
                    continue;
                }
                case 78: {
                    array[n2] = intern;
                    n2 = 80;
                    s = "4W'0";
                    n = 79;
                    array = z2;
                    continue;
                }
                case 79: {
                    array[n2] = intern;
                    n2 = 81;
                    s = "!H#?\u001c";
                    n = 80;
                    array = z2;
                    continue;
                }
                case 80: {
                    array[n2] = intern;
                    n2 = 82;
                    s = "3J0=";
                    n = 81;
                    array = z2;
                    continue;
                }
                case 81: {
                    array[n2] = intern;
                    n2 = 83;
                    s = "*J63";
                    n = 82;
                    array = z2;
                    continue;
                }
                case 82: {
                    array[n2] = intern;
                    n2 = 84;
                    s = "7J7$\u0013!";
                    n = 83;
                    array = z2;
                    continue;
                }
                case 83: {
                    array[n2] = intern;
                    n2 = 85;
                    s = "(J%9";
                    n = 84;
                    array = z2;
                    continue;
                }
                case 84: {
                    array[n2] = intern;
                    n2 = 86;
                    s = "'I#%\u0003";
                    n = 85;
                    array = z2;
                    continue;
                }
                case 85: {
                    array[n2] = intern;
                    n2 = 87;
                    s = "4W'0";
                    n = 86;
                    array = z2;
                    continue;
                }
                case 86: {
                    array[n2] = intern;
                    n2 = 88;
                    s = "2F#$\u0014";
                    n = 87;
                    array = z2;
                    continue;
                }
                case 87: {
                    array[n2] = intern;
                    n2 = 89;
                    s = "&A#/";
                    n = 88;
                    array = z2;
                    continue;
                }
                case 88: {
                    array[n2] = intern;
                    n2 = 90;
                    s = ")D+:\u00156";
                    n = 89;
                    array = z2;
                    continue;
                }
                case 89: {
                    array[n2] = intern;
                    n2 = 91;
                    s = "\u0000d\u0016\u0017a";
                    n = 90;
                    array = z2;
                    continue;
                }
                case 90: {
                    array[n2] = intern;
                    n2 = 92;
                    s = "\u0000d\u0016\u0017g";
                    n = 91;
                    array = z2;
                    continue;
                }
                case 91: {
                    array[n2] = intern;
                    n2 = 93;
                    s = "\u0000d\u0016\u0017aT";
                    n = 92;
                    array = z2;
                    continue;
                }
                case 92: {
                    array[n2] = intern;
                    n2 = 94;
                    s = "\u0000d\u0016\u0017d";
                    n = 93;
                    array = z2;
                    continue;
                }
                case 93: {
                    array[n2] = intern;
                    n2 = 95;
                    s = "L\bh\n]\u0018\u000f\u001e|]M";
                    n = 94;
                    array = z2;
                    continue;
                }
                case 94: {
                    array[n2] = intern;
                    n2 = 96;
                    s = "\u0000d\u0016\u0017i";
                    n = 95;
                    array = z2;
                    continue;
                }
                case 95: {
                    array[n2] = intern;
                    n2 = 97;
                    s = "\rv=\u0006\"\rh\u0003\u0004)";
                    n = 96;
                    array = z2;
                    continue;
                }
                case 96: {
                    array[n2] = intern;
                    n2 = 98;
                    s = "\u0000d\u0016\u0017h";
                    n = 97;
                    array = z2;
                    continue;
                }
                case 97: {
                    array[n2] = intern;
                    n2 = 99;
                    s = "\u0000d\u0016\u0017c";
                    n = 98;
                    array = z2;
                    continue;
                }
                case 98: {
                    array[n2] = intern;
                    n2 = 100;
                    s = "\u0000d\u0016\u0017b";
                    n = 99;
                    array = z2;
                    continue;
                }
                case 99: {
                    array[n2] = intern;
                    n2 = 101;
                    s = "\u0000d\u0016\u0017c";
                    n = 100;
                    array = z2;
                    continue;
                }
                case 100: {
                    array[n2] = intern;
                    n2 = 102;
                    s = "\u0007j\f\u00021\u0007q=\u001f4D8BI";
                    n = 101;
                    array = z2;
                    continue;
                }
                case 101: {
                    array[n2] = intern;
                    n2 = 103;
                    s = "\rv=\u0006\"\rh\u0003\u0004)";
                    n = 102;
                    array = z2;
                    continue;
                }
                case 102: {
                    array[n2] = intern;
                    n2 = 104;
                    s = "\u0000d\u0016\u0017b";
                    n = 103;
                    array = z2;
                    continue;
                }
                case 103: {
                    array[n2] = intern;
                    n2 = 105;
                    s = "\u0000d\u0016\u0017a";
                    n = 104;
                    array = z2;
                    continue;
                }
                case 104: {
                    array[n2] = intern;
                    n2 = 106;
                    s = "*L!=\u001e%H'";
                    n = 105;
                    array = z2;
                    continue;
                }
                case 105: {
                    array[n2] = intern;
                    n2 = 107;
                    s = "\u0007j\f\u00021\u0007q=\u001f4D8BIp%K&V=\rh\u0007\u0002)\u0014`BKp[";
                    n = 106;
                    array = z2;
                    continue;
                }
                case 106: {
                    array[n2] = intern;
                    n2 = 108;
                    s = "\u0000d\u0016\u0017a";
                    n = 107;
                    array = z2;
                    continue;
                }
                case 107: {
                    array[n2] = intern;
                    n2 = 109;
                    s = "\u0012k\u0006X1\na\u0010\u00199\u0000+\u0001\u0003\"\u0017j\u0010X9\u0010`\u000fY>\rf\t\u00181\t`";
                    n = 108;
                    array = z2;
                    continue;
                }
                case 108: {
                    array[n2] = intern;
                    n2 = 110;
                    s = "\u0000d\u0016\u0017a";
                    n = 109;
                    array = z2;
                    continue;
                }
                case 109: {
                    array[n2] = intern;
                    n2 = 111;
                    s = "\u0012k\u0006X1\na\u0010\u00199\u0000+\u0001\u0003\"\u0017j\u0010X9\u0010`\u000fY?\u0016b\u0003\u00189\u001ed\u0016\u001f?\n";
                    n = 110;
                    array = z2;
                    continue;
                }
                case 110: {
                    array[n2] = intern;
                    n2 = 112;
                    s = "\u0000d\u0016\u0017e";
                    n = 111;
                    array = z2;
                    continue;
                }
                case 111: {
                    array[n2] = intern;
                    n2 = 113;
                    s = "\rv=\u0006\"\rh\u0003\u0004)";
                    n = 112;
                    array = z2;
                    continue;
                }
                case 112: {
                    array[n2] = intern;
                    n2 = 114;
                    s = "\u0007j\f\u00021\u0007q=\u001f4D8BIp%K&V=\rh\u0007\u0002)\u0014`BKp[";
                    n = 113;
                    array = z2;
                    continue;
                }
                case 113: {
                    array[n2] = intern;
                    n2 = 115;
                    s = "\u0000d\u0016\u0017d";
                    n = 114;
                    array = z2;
                    continue;
                }
                case 114: {
                    array[n2] = intern;
                    n2 = 116;
                    s = "&A#/";
                    n = 115;
                    array = z2;
                    continue;
                }
                case 115: {
                    array[n2] = intern;
                    n2 = 117;
                    s = "\u0012k\u0006X1\na\u0010\u00199\u0000+\u0001\u0003\"\u0017j\u0010X9\u0010`\u000fY3\u000bk\u0016\u00173\u0010Z\u0007\u00005\nq";
                    n = 116;
                    array = z2;
                    continue;
                }
                case 116: {
                    array[n2] = intern;
                    n2 = 118;
                    s = "\u0007j\f\u00021\u0007q=\u001f4D8BIp%K&V=\rh\u0007\u0002)\u0014`BKp[%#8\u0014Da\u0003\u00021V%_Ip";
                    n = 117;
                    array = z2;
                    continue;
                }
                case 117: {
                    array[n2] = intern;
                    n2 = 119;
                    s = "\u0000d\u0016\u0017a";
                    n = 118;
                    array = z2;
                    continue;
                }
                case 118: {
                    array[n2] = intern;
                    n2 = 120;
                    s = "'j\u0017\u001a4Dk\r\u0002p\u0014d\u0010\u00055Ds!\u0017\"\u0000%\u0004\u001f<\u0001?B";
                    n = 119;
                    array = z2;
                    continue;
                }
                case 119: {
                    array[n2] = intern;
                    n2 = 121;
                    s = "1Q$[h";
                    n = 120;
                    array = z2;
                    continue;
                }
                case 120: {
                    break Label_3082;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        o.a = new HashMap();
        o.c = new HashMap();
        HashMap hashMap = o.a;
        String s2 = "<(#?\u001d";
        int n4 = -1;
        String intern2 = null;
        String intern3 = null;
    Label_4154:
        while (true) {
            final char[] charArray2 = s2.toCharArray();
            for (int j = charArray2.length, n5 = 0; j > n5; ++n5) {
                final char c3 = charArray2[n5];
                char c4 = '\0';
                switch (n5 % 5) {
                    default: {
                        c4 = 'P';
                        break;
                    }
                    case 0: {
                        c4 = 'd';
                        break;
                    }
                    case 1: {
                        c4 = '\u0005';
                        break;
                    }
                    case 2: {
                        c4 = 'b';
                        break;
                    }
                    case 3: {
                        c4 = 'v';
                        break;
                    }
                }
                charArray2[n5] = (char)(c4 ^ c3);
            }
            intern2 = new String(charArray2).intern();
            String s3 = null;
            int n6 = 0;
            switch (n4) {
                default: {
                    hashMap.put(intern2, 0);
                    hashMap = o.a;
                    s2 = "<(/%\u001e";
                    n4 = 0;
                    continue;
                }
                case 7: {
                    s3 = "%L/";
                    n6 = -1;
                    break;
                }
                case 0: {
                    hashMap.put(intern2, 1);
                    hashMap = o.a;
                    s2 = "<(;7\u0018+J";
                    n4 = 1;
                    continue;
                }
                case 1: {
                    hashMap.put(intern2, 2);
                    hashMap = o.a;
                    s2 = "<(%9\u001f#I'[\u0004%I)";
                    n4 = 2;
                    continue;
                }
                case 2: {
                    hashMap.put(intern2, 5);
                    hashMap = o.a;
                    s2 = "<(%9\u001f#I'V\u0004%I";
                    n4 = 3;
                    continue;
                }
                case 3: {
                    hashMap.put(intern2, 5);
                    hashMap = o.a;
                    s2 = "<(+5\u0001";
                    n4 = 4;
                    continue;
                }
                case 4: {
                    hashMap.put(intern2, 6);
                    hashMap = o.a;
                    s2 = "<((7\u0012&@0";
                    n4 = 5;
                    continue;
                }
                case 5: {
                    hashMap.put(intern2, 7);
                    hashMap = o.a;
                    s2 = "<(1=\t4@O#\u0003!W,7\u001d!";
                    n4 = 6;
                    continue;
                }
                case 6: {
                    hashMap.put(intern2, 3);
                    hashMap = o.c;
                    s2 = "<(#?\u001d";
                    n4 = 7;
                    continue;
                }
                case 8: {
                    s3 = "3l\f\u0012?\u0013vB:9\u0012`";
                    n6 = 0;
                    break;
                }
                case 9: {
                    s3 = "=D*9\u001f";
                    n6 = 1;
                    break;
                }
                case 10: {
                    s3 = "#j\r\u0011<\u0001%6\u0017<\u000f";
                    n6 = 2;
                    break;
                }
                case 11: {
                    s3 = "#j\r\u0011<\u0001%6\u0017<\u000f";
                    n6 = 3;
                    break;
                }
                case 12: {
                    s3 = "-F3";
                    n6 = 4;
                    break;
                }
                case 13: {
                    s3 = ".d\u0000\u00145\u0016";
                    n6 = 5;
                    break;
                }
                case 14: {
                    s3 = "7n\u001b\u00065";
                    n6 = 6;
                    break;
                }
                case 15: {
                    s3 = "*l\u0001\u001d>\u0005h\u0007";
                    n6 = 7;
                    break;
                }
                case 16: {
                    s3 = "&l\u0010\u00028\u0000d\u001b";
                    n6 = 8;
                    break;
                }
            }
            final char[] charArray3 = s3.toCharArray();
            for (int k = charArray3.length, n7 = 0; k > n7; ++n7) {
                final char c5 = charArray3[n7];
                char c6 = '\0';
                switch (n7 % 5) {
                    default: {
                        c6 = 'P';
                        break;
                    }
                    case 0: {
                        c6 = 'd';
                        break;
                    }
                    case 1: {
                        c6 = '\u0005';
                        break;
                    }
                    case 2: {
                        c6 = 'b';
                        break;
                    }
                    case 3: {
                        c6 = 'v';
                        break;
                    }
                }
                charArray3[n7] = (char)(c6 ^ c5);
            }
            intern3 = new String(charArray3).intern();
            switch (n6) {
                default: {
                    hashMap.put(intern2, intern3);
                    hashMap = o.c;
                    s2 = "<(/%\u001e";
                    n4 = 8;
                    continue;
                }
                case 0: {
                    hashMap.put(intern2, intern3);
                    hashMap = o.c;
                    s2 = "<(;7\u0018+J";
                    n4 = 9;
                    continue;
                }
                case 1: {
                    hashMap.put(intern2, intern3);
                    hashMap = o.c;
                    s2 = "<(%9\u001f#I'[\u0004%I)";
                    n4 = 10;
                    continue;
                }
                case 2: {
                    hashMap.put(intern2, intern3);
                    hashMap = o.c;
                    s2 = "<(%9\u001f#I'V\u0004%I";
                    n4 = 11;
                    continue;
                }
                case 3: {
                    hashMap.put(intern2, intern3);
                    hashMap = o.c;
                    s2 = "<(+5\u0001";
                    n4 = 12;
                    continue;
                }
                case 4: {
                    hashMap.put(intern2, intern3);
                    hashMap = o.c;
                    s2 = "<((7\u0012&@0";
                    n4 = 13;
                    continue;
                }
                case 5: {
                    hashMap.put(intern2, intern3);
                    hashMap = o.c;
                    s2 = "<(1=\t4@O#\u0003!W,7\u001d!";
                    n4 = 14;
                    continue;
                }
                case 6: {
                    hashMap.put(intern2, intern3);
                    hashMap = o.c;
                    s2 = "*L!=\u001e%H'";
                    n4 = 15;
                    continue;
                }
                case 7: {
                    hashMap.put(intern2, intern3);
                    hashMap = o.c;
                    s2 = "&A#/";
                    n4 = 16;
                    continue;
                }
                case 8: {
                    break Label_4154;
                }
            }
        }
        hashMap.put(intern2, intern3);
    }
    
    public o() {
        this.f = new k();
        this.g = new ArrayList();
    }
    
    public o(final Context m) {
        this.f = new k();
        this.g = new ArrayList();
        this.m = m;
    }
    
    public static o a(final r r, final int n, final String s) {
        final boolean b = o.b;
        if (r.c.equals(o.z[88])) {
            final o o = new o();
            final Iterator<q> iterator = (Iterator<q>)r.b.iterator();
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
        Label_0065:
            while (true) {
                q q;
                String d;
                int n6 = 0;
                int n7 = 0;
                int n8 = 0;
                int n9 = 0;
                StringBuilder sb;
                String f;
                int length;
                int i;
                char char1;
                Iterator iterator2;
                int n10;
                int n11;
                int n12;
                String substring;
                Iterator iterator3;
                int n13;
                boolean b2;
                String s2;
                boolean b3;
                String s3;
                int n14;
                int n15;
                boolean b4;
                boolean b5;
                int n16 = 0;
                int n17;
                String s4;
                List h;
                l l;
                String s5;
                Iterator iterator4;
                boolean b6;
                boolean b7;
                List h2;
                StringBuilder sb2;
                Iterator<String> iterator5;
                Iterator iterator6;
                int n18;
                String substring2;
                boolean b8;
                String s6;
                int n19;
                boolean b9;
                String s7;
                boolean b10;
                String s8;
                int n20;
                Iterator iterator7;
                int n21;
                String substring3;
                boolean b11;
                int n22;
                String s9;
                int n23;
                boolean b12;
                String s10;
                int n24;
                boolean b13;
                int n25;
                Label_0708_Outer:Label_1676_Outer:Label_2009_Outer:
                while (iterator.hasNext()) {
                    q = iterator.next();
                    d = q.d;
                    if (!TextUtils.isEmpty((CharSequence)q.f) || b) {
                        Label_0139: {
                            if (d.equals(o.z[73])) {
                                n6 = n2;
                                n7 = n4;
                                n8 = n5;
                                n9 = n3;
                            }
                            else {
                                Label_2952: {
                                    if (d.equals(o.z[52])) {
                                        o.f.e = q.f;
                                        if (!b) {
                                            break Label_2952;
                                        }
                                    }
                                    if (d.equals(o.z[71]) && o.f.e == null) {
                                        o.f.e = q.f;
                                        if (!b) {
                                            break Label_2952;
                                        }
                                    }
                                    if (d.equals("N")) {
                                        a(o.f, q.h, n);
                                        if (!b) {
                                            break Label_2952;
                                        }
                                    }
                                    if (d.equals(o.z[65])) {
                                        o.l = q.f;
                                        if (!b) {
                                            break Label_2952;
                                        }
                                    }
                                    if (d.equals(o.z[35])) {
                                        if (q.b.contains(o.z[67]) && o.l == null) {
                                            sb = new StringBuilder();
                                            f = q.f;
                                            length = f.length();
                                            i = 0;
                                            while (i < length) {
                                                char1 = f.charAt(i);
                                                if (char1 != ';') {
                                                    sb.append(char1);
                                                }
                                                ++i;
                                                if (b) {
                                                    break;
                                                }
                                            }
                                            o.l = sb.toString();
                                            if (!b) {
                                                break Label_2952;
                                            }
                                        }
                                        o.a(q);
                                        if (!b) {
                                            break Label_2952;
                                        }
                                    }
                                    Label_2725: {
                                        Label_1171: {
                                            if (d.equals(o.z[47])) {
                                                iterator2 = q.h.iterator();
                                                n10 = 1;
                                            Label_0708:
                                                while (true) {
                                                Label_0911_Outer:
                                                    while (iterator2.hasNext()) {
                                                        if (iterator2.next().length() > 0) {
                                                            n11 = 0;
                                                            if (!b) {
                                                                break Label_0708;
                                                            }
                                                        }
                                                        else {
                                                            n11 = n10;
                                                        }
                                                        if (!b) {
                                                            n10 = n11;
                                                            continue Label_0708_Outer;
                                                        }
                                                        if (n11 == 0 || b) {
                                                            n12 = -1;
                                                            substring = "";
                                                            iterator3 = q.b.iterator();
                                                            n13 = n5;
                                                            b2 = false;
                                                            while (true) {
                                                                while (iterator3.hasNext()) {
                                                                    s2 = iterator3.next();
                                                                    while (true) {
                                                                        Label_2867: {
                                                                            if (s2.equals(o.z[60]) && n13 == 0) {
                                                                                n13 = 1;
                                                                                b2 = true;
                                                                                if (!b) {
                                                                                    break Label_2867;
                                                                                }
                                                                            }
                                                                            if (s2.equalsIgnoreCase(o.z[43])) {
                                                                                n12 = 1;
                                                                                substring = "";
                                                                                if (!b) {
                                                                                    break Label_2867;
                                                                                }
                                                                            }
                                                                            if (s2.equalsIgnoreCase(o.z[46]) || s2.equalsIgnoreCase(o.z[39])) {
                                                                                n12 = 2;
                                                                                substring = "";
                                                                                if (!b) {
                                                                                    break Label_2867;
                                                                                }
                                                                            }
                                                                            if (s2.equalsIgnoreCase(o.z[38])) {
                                                                                b3 = b2;
                                                                                s3 = substring;
                                                                                n14 = n12;
                                                                                n15 = n13;
                                                                            }
                                                                            else {
                                                                                if (s2.equalsIgnoreCase(o.z[55]) || s2.equalsIgnoreCase(o.z[34])) {
                                                                                    break Label_2867;
                                                                                }
                                                                                if (s2.equalsIgnoreCase(o.z[54])) {
                                                                                    b3 = b2;
                                                                                    s3 = substring;
                                                                                    n14 = n12;
                                                                                    n15 = n13;
                                                                                }
                                                                                else {
                                                                                    if (s2.toUpperCase().startsWith(o.z[40]) && n12 < 0) {
                                                                                        substring = s2.substring(2);
                                                                                        n12 = 0;
                                                                                        if (!b) {
                                                                                            break Label_2867;
                                                                                        }
                                                                                    }
                                                                                    if (n12 >= 0) {
                                                                                        break Label_2867;
                                                                                    }
                                                                                    n15 = n13;
                                                                                    b4 = b2;
                                                                                    s3 = s2;
                                                                                    b3 = b4;
                                                                                    n14 = 0;
                                                                                }
                                                                            }
                                                                            if (!b) {
                                                                                n13 = n15;
                                                                                n12 = n14;
                                                                                substring = s3;
                                                                                b2 = b3;
                                                                                continue Label_0708_Outer;
                                                                            }
                                                                            b5 = b3;
                                                                            n16 = n15;
                                                                            n17 = n14;
                                                                            s4 = s3;
                                                                            if (n17 < 0) {
                                                                                n17 = 1;
                                                                            }
                                                                            h = q.h;
                                                                            if (h.size() > 1) {
                                                                                l = new l();
                                                                                if (h.size() > 2) {
                                                                                    l.a = h.get(2);
                                                                                }
                                                                                if (h.size() > 3) {
                                                                                    l.f = h.get(3);
                                                                                }
                                                                                if (h.size() > 4) {
                                                                                    l.d = h.get(4);
                                                                                }
                                                                                if (h.size() > 5) {
                                                                                    l.e = h.get(5);
                                                                                }
                                                                                if (h.size() > 6) {
                                                                                    l.b = h.get(6);
                                                                                }
                                                                                Label_1142: {
                                                                                    if (h.size() > 7) {
                                                                                        l.c = h.get(7);
                                                                                        if (!b) {
                                                                                            break Label_1142;
                                                                                        }
                                                                                    }
                                                                                    Log.i(o.z[69] + s);
                                                                                }
                                                                                s5 = l.toString().trim();
                                                                            }
                                                                            else {
                                                                                s5 = q.f;
                                                                                l = null;
                                                                            }
                                                                            o.a(n17, s5, l, s4, b5);
                                                                            if (b) {
                                                                                break Label_1171;
                                                                            }
                                                                            break Label_2725;
                                                                        }
                                                                        b3 = b2;
                                                                        s3 = substring;
                                                                        n14 = n12;
                                                                        n15 = n13;
                                                                        continue Label_0911_Outer;
                                                                    }
                                                                }
                                                                n17 = n12;
                                                                n16 = n13;
                                                                b5 = b2;
                                                                s4 = substring;
                                                                continue;
                                                            }
                                                        }
                                                        continue Label_0065;
                                                    }
                                                    n11 = n10;
                                                    continue Label_0708;
                                                }
                                            }
                                            n16 = n5;
                                        }
                                        if (d.equals(o.z[78])) {
                                            iterator4 = q.b.iterator();
                                            b6 = false;
                                            while (iterator4.hasNext()) {
                                                if (iterator4.next().equals(o.z[80]) && n2 == 0) {
                                                    n2 = 1;
                                                    b7 = true;
                                                }
                                                else {
                                                    b7 = b6;
                                                }
                                                if (b) {
                                                    b6 = b7;
                                                    break;
                                                }
                                                b6 = b7;
                                            }
                                            h2 = q.h;
                                            sb2 = new StringBuilder();
                                            iterator5 = h2.iterator();
                                            while (iterator5.hasNext()) {
                                                sb2.append(iterator5.next());
                                                if (iterator5.hasNext()) {
                                                    sb2.append(' ');
                                                    if (b) {
                                                        break;
                                                    }
                                                    continue;
                                                }
                                            }
                                            o.a(1, sb2.toString(), "", b6);
                                            if (!b) {
                                                break Label_2725;
                                            }
                                        }
                                        if (d.equals(o.z[30])) {
                                            o.i(q.f);
                                            if (!b) {
                                                break Label_2725;
                                            }
                                        }
                                        if (d.equals(o.z[57])) {
                                            o.i(q.f);
                                            if (!b) {
                                                break Label_2725;
                                            }
                                        }
                                        if (d.equals(o.z[61])) {
                                            o.i = q.f.getBytes();
                                            if (!b) {
                                                break Label_2725;
                                            }
                                        }
                                        if (d.equals(o.z[85])) {
                                            Log.e(o.z[44]);
                                            if (!b) {
                                                break Label_2725;
                                            }
                                        }
                                        Label_1707: {
                                            if (d.equals(o.z[81])) {
                                                iterator6 = q.b.iterator();
                                                n18 = -1;
                                                substring2 = null;
                                                b8 = false;
                                                while (true) {
                                                Label_1660_Outer:
                                                    while (iterator6.hasNext()) {
                                                        s6 = iterator6.next();
                                                        while (true) {
                                                            Label_2808: {
                                                                if (s6.equals(o.z[87]) && n3 == 0) {
                                                                    n3 = 1;
                                                                    b8 = true;
                                                                    if (!b) {
                                                                        break Label_2808;
                                                                    }
                                                                }
                                                                if (s6.equalsIgnoreCase(o.z[48])) {
                                                                    n18 = 1;
                                                                    if (!b) {
                                                                        break Label_2808;
                                                                    }
                                                                }
                                                                if (s6.equalsIgnoreCase(o.z[82])) {
                                                                    n18 = 2;
                                                                    if (!b) {
                                                                        break Label_2808;
                                                                    }
                                                                }
                                                                if (s6.equalsIgnoreCase(o.z[63])) {
                                                                    n18 = 4;
                                                                    if (!b) {
                                                                        break Label_2808;
                                                                    }
                                                                }
                                                                if (s6.toUpperCase().startsWith(o.z[36]) && n18 < 0) {
                                                                    substring2 = s6.substring(2);
                                                                    n18 = 0;
                                                                    if (!b) {
                                                                        break Label_2808;
                                                                    }
                                                                }
                                                                if (n18 >= 0) {
                                                                    break Label_2808;
                                                                }
                                                                n19 = 0;
                                                                b9 = b8;
                                                                s7 = s6;
                                                                if (!b) {
                                                                    n18 = n19;
                                                                    substring2 = s7;
                                                                    b8 = b9;
                                                                    continue Label_1660_Outer;
                                                                }
                                                                b10 = b9;
                                                                s8 = s7;
                                                                n20 = n19;
                                                                if (n20 < 0) {
                                                                    n20 = 3;
                                                                }
                                                                o.a(ContactsContract$CommonDataKinds$Email.class, n20, q.f, s8, b10);
                                                                if (b) {
                                                                    break Label_1707;
                                                                }
                                                                break Label_2725;
                                                            }
                                                            b9 = b8;
                                                            s7 = substring2;
                                                            n19 = n18;
                                                            continue Label_1676_Outer;
                                                        }
                                                    }
                                                    b10 = b8;
                                                    n20 = n18;
                                                    s8 = substring2;
                                                    continue;
                                                }
                                            }
                                        }
                                        Label_2037: {
                                            if (d.equals(o.z[66])) {
                                                iterator7 = q.b.iterator();
                                                n21 = -1;
                                                substring3 = null;
                                                b11 = false;
                                                n22 = 0;
                                                while (true) {
                                                Label_1993_Outer:
                                                    while (iterator7.hasNext()) {
                                                        s9 = iterator7.next();
                                                        if (n22 != 0) {
                                                            if (s9.equals(o.z[70])) {
                                                                n21 = 5;
                                                                if (!b) {
                                                                    break;
                                                                }
                                                            }
                                                            if (!s9.equals(o.z[79])) {
                                                                break;
                                                            }
                                                            n21 = 4;
                                                            if (!b) {
                                                                break;
                                                            }
                                                        }
                                                        while (true) {
                                                            Label_2763: {
                                                                if (s9.equals(o.z[31]) && n4 == 0) {
                                                                    n4 = 1;
                                                                    b11 = true;
                                                                    if (!b) {
                                                                        break Label_2763;
                                                                    }
                                                                }
                                                                if (s9.equalsIgnoreCase(o.z[51])) {
                                                                    n21 = 1;
                                                                    if (!b) {
                                                                        break Label_2763;
                                                                    }
                                                                }
                                                                if (s9.equalsIgnoreCase(o.z[74])) {
                                                                    n21 = 3;
                                                                    if (!b) {
                                                                        break Label_2763;
                                                                    }
                                                                }
                                                                if (s9.equalsIgnoreCase(o.z[56])) {
                                                                    n21 = 2;
                                                                    if (!b) {
                                                                        break Label_2763;
                                                                    }
                                                                }
                                                                if (s9.equalsIgnoreCase(o.z[32])) {
                                                                    n21 = 6;
                                                                    if (!b) {
                                                                        break Label_2763;
                                                                    }
                                                                }
                                                                if (s9.equalsIgnoreCase(o.z[50])) {
                                                                    n22 = 1;
                                                                    if (!b) {
                                                                        break Label_2763;
                                                                    }
                                                                }
                                                                if (s9.equalsIgnoreCase(o.z[49])) {
                                                                    break Label_2763;
                                                                }
                                                                if (s9.equalsIgnoreCase(o.z[75])) {
                                                                    n23 = n22;
                                                                    b12 = b11;
                                                                    s10 = substring3;
                                                                    n24 = n21;
                                                                }
                                                                else {
                                                                    if (s9.toUpperCase().startsWith(o.z[37]) && n21 < 0) {
                                                                        substring3 = s9.substring(2);
                                                                        n21 = 0;
                                                                        if (!b) {
                                                                            break Label_2763;
                                                                        }
                                                                    }
                                                                    if (n21 >= 0) {
                                                                        break Label_2763;
                                                                    }
                                                                    b13 = b11;
                                                                    s10 = s9;
                                                                    n23 = n22;
                                                                    b12 = b13;
                                                                    n24 = 0;
                                                                }
                                                                if (!b) {
                                                                    n21 = n24;
                                                                    substring3 = s10;
                                                                    b11 = b12;
                                                                    n22 = n23;
                                                                    continue Label_1993_Outer;
                                                                }
                                                                n25 = n24;
                                                                substring3 = s10;
                                                                b11 = b12;
                                                                if (n25 < 0) {
                                                                    n25 = 1;
                                                                }
                                                                o.b(n25, q.f, substring3, b11);
                                                                if (b) {
                                                                    break Label_2037;
                                                                }
                                                                break Label_2725;
                                                            }
                                                            n23 = n22;
                                                            b12 = b11;
                                                            s10 = substring3;
                                                            n24 = n21;
                                                            continue Label_2009_Outer;
                                                        }
                                                    }
                                                    n25 = n21;
                                                    continue;
                                                }
                                            }
                                        }
                                        if (d.equals(o.z[83])) {
                                            o.g.add(q.f);
                                            if (!b) {
                                                break Label_2725;
                                            }
                                        }
                                        if (d.equals(o.z[89])) {
                                            o.a(q);
                                            if (!b) {
                                                break Label_2725;
                                            }
                                        }
                                        if (d.equals(o.z[53])) {
                                            o.a(q);
                                            if (!b) {
                                                break Label_2725;
                                            }
                                        }
                                        if (d.equals(o.z[29])) {
                                            o.a(q);
                                            if (!b) {
                                                break Label_2725;
                                            }
                                        }
                                        if (d.equals(o.z[72])) {
                                            o.a(q);
                                            if (!b) {
                                                break Label_2725;
                                            }
                                        }
                                        if (d.equals(o.z[64])) {
                                            o.a(q);
                                            if (!b) {
                                                break Label_2725;
                                            }
                                        }
                                        if (d.equals(o.z[90])) {
                                            o.a(q);
                                            if (!b) {
                                                break Label_2725;
                                            }
                                        }
                                        if (d.equals(o.z[41])) {
                                            o.a(q);
                                            if (!b) {
                                                break Label_2725;
                                            }
                                        }
                                        if (d.equals(o.z[58])) {
                                            o.a(q);
                                            if (!b) {
                                                break Label_2725;
                                            }
                                        }
                                        if (d.equals(o.z[77])) {
                                            o.a(q);
                                            if (!b) {
                                                break Label_2725;
                                            }
                                        }
                                        if (d.equals(o.z[86])) {
                                            o.a(q);
                                            if (!b) {
                                                break Label_2725;
                                            }
                                        }
                                        if (d.equals(o.z[42])) {
                                            o.a(q);
                                            if (!b) {
                                                break Label_2725;
                                            }
                                        }
                                        if (d.equals(o.z[76])) {
                                            o.a(q);
                                            if (!b) {
                                                break Label_2725;
                                            }
                                        }
                                        if (d.equals(o.z[84])) {
                                            o.a(q);
                                            if (!b) {
                                                break Label_2725;
                                            }
                                        }
                                        if (d.equals(o.z[45])) {
                                            o.a(q);
                                            if (!b) {
                                                break Label_2725;
                                            }
                                        }
                                        if (d.equals(o.z[62])) {
                                            o.f.f = q.f;
                                            if (!b) {
                                                break Label_2725;
                                            }
                                        }
                                        if (d.equals(o.z[68])) {
                                            n6 = n2;
                                            n9 = n3;
                                            n7 = n4;
                                            n8 = n16;
                                            break Label_0139;
                                        }
                                        if (d.equals(o.z[59])) {
                                            o.f.a = q.f;
                                            if (!b) {
                                                break Label_2725;
                                            }
                                        }
                                        o.a(q);
                                    }
                                    n6 = n2;
                                    n9 = n3;
                                    n7 = n4;
                                    n8 = n16;
                                    break Label_0139;
                                }
                                n6 = n2;
                                n7 = n4;
                                n8 = n5;
                                n9 = n3;
                            }
                        }
                        if (b) {
                            n2 = n6;
                            if (n7 == 0 && o.e != null && o.e.size() > 0) {
                                ((d)o.e.get(0)).a = true;
                            }
                            if (n8 == 0 && o.d != null) {
                                for (final m m : o.d) {
                                    if (m.b == ContactsContract$CommonDataKinds$StructuredPostal.class) {
                                        m.d = true;
                                        if (!b) {
                                            break;
                                        }
                                    }
                                    if (b) {
                                        break;
                                    }
                                }
                            }
                            if (n9 == 0 && o.d != null) {
                                for (final m j : o.d) {
                                    if (j.b == ContactsContract$CommonDataKinds$Email.class) {
                                        j.d = true;
                                        if (!b) {
                                            break;
                                        }
                                    }
                                    if (b) {
                                        break;
                                    }
                                }
                            }
                            if (n2 == 0 && o.j != null && o.j.size() > 0) {
                                ((n)o.j.get(0)).a = true;
                                return o;
                            }
                            return o;
                        }
                        else {
                            n2 = n6;
                            n3 = n9;
                            n4 = n7;
                            n5 = n8;
                        }
                    }
                }
                n7 = n4;
                n8 = n5;
                n9 = n3;
                continue;
            }
        }
        Log.e(o.z[33]);
        return null;
    }
    
    private static void a(final k k, final List list, final int n) {
        final int size = list.size();
        if (size > 1) {
            k.h = list.get(0);
            k.d = list.get(1);
            if (size > 2 && list.get(2).length() > 0) {
                k.b = list.get(2);
            }
            if (size > 3 && list.get(3).length() > 0) {
                k.g = list.get(3);
            }
            if (size > 4 && list.get(4).length() > 0) {
                k.c = list.get(4);
            }
        }
    }
    
    public static byte[] a(final Context context, final String s) {
        final Cursor query = context.getContentResolver().query(ContactsContract$Data.CONTENT_URI, new String[] { o.z[10] }, o.z[9], new String[] { s, o.z[11] }, (String)null);
        final boolean moveToFirst = query.moveToFirst();
        byte[] blob = null;
        if (moveToFirst) {
            blob = query.getBlob(0);
        }
        return blob;
    }
    
    public static o h(final String s) {
        if (s != null) {
            final f f = new f();
            final j j = new j();
            if (!f.a(s, o.z[121], j)) {
                Log.w(o.z[120] + s);
            }
            final Iterator iterator = j.c.iterator();
            if (iterator.hasNext()) {
                return a(iterator.next(), 0, s);
            }
        }
        return null;
    }
    
    public String a() {
        final boolean b = o.b;
        if (this.f.e != null) {
            return this.f.e;
        }
        if (this.d != null && this.d.size() > 0) {
            for (final m m : this.d) {
                if (m.b == ContactsContract$CommonDataKinds$Email.class && m.d) {
                    return m.e;
                }
                if (b) {
                    break;
                }
            }
        }
        if (this.e != null && this.e.size() > 0) {
            for (final d d : this.e) {
                if (d.a) {
                    return d.d;
                }
                if (b) {
                    break;
                }
            }
        }
        return "";
    }
    
    public void a(final int b, final String c, final String d, final boolean a) {
        if (this.j == null) {
            this.j = new ArrayList();
        }
        final n n = new n();
        n.b = b;
        n.c = c;
        n.d = d;
        n.a = a;
        this.j.add(n);
    }
    
    public void a(final int f, final String e, final l a, final String c, final boolean d) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        final m m = new m();
        m.b = ContactsContract$CommonDataKinds$StructuredPostal.class;
        m.f = f;
        m.e = e;
        m.a = a;
        m.c = c;
        m.d = d;
        this.d.add(m);
    }
    
    public void a(final Cursor cursor) {
        final boolean b = o.b;
        if (this.d == null) {
            this.d = new ArrayList();
        }
        final m m = new m();
        m.b = ContactsContract$CommonDataKinds$StructuredPostal.class;
        m.f = cursor.getInt(cursor.getColumnIndex(o.z[100]));
        m.e = cursor.getString(cursor.getColumnIndex(o.z[91]));
        m.a = new l();
        final String string = cursor.getString(cursor.getColumnIndex(o.z[94]));
        if (string != null) {
            m.a.a = string.replaceAll(o.z[95], " ");
        }
        m.a.f = cursor.getString(cursor.getColumnIndex(o.z[92]));
        m.a.d = cursor.getString(cursor.getColumnIndex(o.z[98]));
        m.a.e = cursor.getString(cursor.getColumnIndex(o.z[96]));
        m.a.b = cursor.getString(cursor.getColumnIndex(o.z[93]));
        m.c = cursor.getString(cursor.getColumnIndex(o.z[99]));
        m.d = (cursor.getInt(cursor.getColumnIndex(o.z[97])) == 1);
        this.d.add(m);
        if (b) {
            final boolean h = DialogToastActivity.h;
            boolean h2 = false;
            if (!h) {
                h2 = true;
            }
            DialogToastActivity.h = h2;
        }
    }
    
    public void a(final Class b, final int f, final String e, final String c, final boolean d) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        final m m = new m();
        m.b = b;
        m.f = f;
        m.e = e;
        m.c = c;
        m.d = d;
        this.d.add(m);
    }
    
    public void a(final String s) {
        final Cursor query = this.m.getContentResolver().query(ContactsContract$Data.CONTENT_URI, (String[])null, o.z[118], new String[] { s, o.z[117], String.valueOf(3) }, (String)null);
        if (query.moveToFirst()) {
            final q q = new q();
            q.d = o.z[116];
            q.f = query.getString(query.getColumnIndex(o.z[119]));
            this.a(q);
        }
        query.close();
    }
    
    public void a(final q q) {
        if (q.f == null || q.f.length() == 0) {
            return;
        }
        final String d = q.d;
        if (this.h == null) {
            this.h = new HashMap();
        }
        List<q> list = null;
        Label_0094: {
            if (!this.h.containsKey(d)) {
                list = new ArrayList<q>();
                this.h.put(d, list);
                if (!o.b) {
                    break Label_0094;
                }
            }
            list = this.h.get(d);
        }
        list.add(q);
    }
    
    public void b(final int b, final String s, final String c, final boolean a) {
        final boolean b2 = o.b;
        if (this.e == null) {
            this.e = new ArrayList();
        }
        final d d = new d();
        d.b = b;
        final StringBuilder sb = new StringBuilder();
        final String trim = s.trim();
        final int length = trim.length();
        int i = 0;
        while (i < length) {
            final char char1 = trim.charAt(i);
            if (('0' <= char1 && char1 <= '9') || (i == 0 && char1 == '+') || char1 == ',') {
                sb.append(char1);
            }
            ++i;
            if (b2) {
                break;
            }
        }
        d.d = PhoneNumberUtils.formatNumber(sb.toString());
        d.c = c;
        d.a = a;
        this.e.add(d);
    }
    
    public void b(final String s) {
        final Cursor query = this.m.getContentResolver().query(ContactsContract$Data.CONTENT_URI, (String[])null, o.z[114], new String[] { s, o.z[111] }, (String)null);
        if (query.moveToFirst()) {
            final String string = query.getString(query.getColumnIndex(o.z[110]));
            final String string2 = query.getString(query.getColumnIndex(o.z[112]));
            final StringBuilder append = new StringBuilder().append(string);
            String string3;
            if (string2 == null || string2.length() == 0) {
                string3 = "";
            }
            else {
                string3 = ";" + string2;
            }
            this.a(1, append.append(string3).toString(), query.getString(query.getColumnIndex(o.z[115])), query.getInt(query.getColumnIndex(o.z[113])) == 1);
        }
        query.close();
    }
    
    public void c(final String s) {
        final boolean b = o.b;
        final Cursor query = this.m.getContentResolver().query(ContactsContract$CommonDataKinds$Email.CONTENT_URI, (String[])null, o.z[102], new String[] { s }, (String)null);
        while (query.moveToNext()) {
            this.a(ContactsContract$CommonDataKinds$Email.class, query.getInt(query.getColumnIndex(o.z[104])), query.getString(query.getColumnIndex(o.z[105])), query.getString(query.getColumnIndex(o.z[101])), query.getInt(query.getColumnIndex(o.z[103])) == 1);
            if (b) {
                break;
            }
        }
        query.close();
    }
    
    public void d(final String s) {
        final boolean b = o.b;
        final Cursor query = this.m.getContentResolver().query(ContactsContract$Data.CONTENT_URI, (String[])null, o.z[5], new String[] { s, o.z[7] }, (String)null);
        while (query.moveToNext()) {
            final int int1 = query.getInt(query.getColumnIndex(o.z[8]));
            final q q = new q();
            q.f = query.getString(query.getColumnIndex(o.z[6]));
            final String string = this.m.getString(ContactsContract$CommonDataKinds$Im.getProtocolLabelResource(int1));
            for (final Map.Entry<String, V> entry : o.c.entrySet()) {
                if (((String)entry.getValue()).equalsIgnoreCase(string)) {
                    q.d = entry.getKey();
                }
                if (b) {
                    break;
                }
            }
            q.a(this.m.getString(ContactsContract$CommonDataKinds$Im.getTypeLabelResource(int1)));
            this.a(q);
            if (b) {
                break;
            }
        }
        query.close();
    }
    
    public void e(final String s) {
        final boolean b = o.b;
        final Cursor query = this.m.getContentResolver().query(ContactsContract$Data.CONTENT_URI, new String[] { o.z[14], o.z[23], o.z[24], o.z[22], o.z[19], o.z[28], o.z[21] }, o.z[16], new String[] { s, o.z[17] }, (String)null);
        while (query.moveToNext()) {
            this.f.d = query.getString(query.getColumnIndex(o.z[25]));
            this.f.h = query.getString(query.getColumnIndex(o.z[27]));
            this.f.b = query.getString(query.getColumnIndex(o.z[18]));
            this.f.g = query.getString(query.getColumnIndex(o.z[13]));
            this.f.c = query.getString(query.getColumnIndex(o.z[20]));
            this.f.f = query.getString(query.getColumnIndex(o.z[26]));
            this.f.a = query.getString(query.getColumnIndex(o.z[15]));
            if (b) {
                break;
            }
        }
        query.close();
    }
    
    public void f(final String s) {
        final Cursor query = this.m.getContentResolver().query(ContactsContract$Data.CONTENT_URI, (String[])null, o.z[107], new String[] { s, o.z[109] }, (String)null);
        if (query.moveToFirst()) {
            final q q = new q();
            q.d = o.z[106];
            q.f = query.getString(query.getColumnIndex(o.z[108]));
            this.a(q);
        }
        query.close();
    }
    
    public void g(final String s) {
        final boolean b = o.b;
        final Cursor query = this.m.getContentResolver().query(ContactsContract$CommonDataKinds$StructuredPostal.CONTENT_URI, (String[])null, o.z[12], new String[] { s }, (String)null);
        while (query.moveToNext()) {
            this.a(query);
            if (b) {
                break;
            }
        }
        query.close();
    }
    
    public void i(final String d) {
        if (this.j == null) {
            this.j = new ArrayList();
        }
        int size = this.j.size();
        if (size == 0) {
            this.a(2, "", null, false);
            size = 1;
        }
        ((n)this.j.get(size - 1)).d = d;
    }
    
    public void j(final String s) {
        final boolean b = o.b;
        final Cursor query = this.m.getContentResolver().query(ContactsContract$CommonDataKinds$Phone.CONTENT_URI, (String[])null, o.z[4], new String[] { s }, (String)null);
        while (query.moveToNext()) {
            this.b(query.getInt(query.getColumnIndex(o.z[0])), query.getString(query.getColumnIndex(o.z[1])), query.getString(query.getColumnIndex(o.z[3])), query.getInt(query.getColumnIndex(o.z[2])) == 1);
            if (b) {
                break;
            }
        }
        query.close();
    }
}
