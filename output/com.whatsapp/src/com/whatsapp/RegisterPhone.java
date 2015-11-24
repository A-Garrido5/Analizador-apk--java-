// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import android.view.Menu;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import android.text.style.StyleSpan;
import android.text.SpannableStringBuilder;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import android.content.SharedPreferences$Editor;
import com.whatsapp.util.Log;
import android.widget.EditText;
import android.app.Dialog;

public class RegisterPhone extends EnterPhoneNumber
{
    private static final String[] H;
    private Runnable B;
    private Dialog C;
    private boolean D;
    private boolean E;
    private boolean F;
    private String G;
    
    static {
        final String[] h = new String[81];
        String s = "'\u001e\u000b9";
        int n = -1;
        String[] array = h;
        int n2 = 0;
        String intern = null;
    Label_2057:
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
                        c2 = '\u0002';
                        break;
                    }
                    case 1: {
                        c2 = '.';
                        break;
                    }
                    case 2: {
                        c2 = '9';
                        break;
                    }
                    case 3: {
                        c2 = 'a';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "*@L\r8+";
                    n2 = 1;
                    array = h;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "pK^\b'vKKL$jAW\u0004g";
                    n2 = 2;
                    array = h;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = h;
                    s = "3\u001b\fTa0\u001f\u0001Pg7";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "pK^\b'vKKN$jAW\u0004{fGX\r;e\u0001[\u0000:";
                    n = 3;
                    array = h;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "pK^\b'vKKN$jAW\u0004{fGX\r;e\u0001W\u00149]MV\u000f2k\\T";
                    n = 4;
                    array = h;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\b$";
                    n = 5;
                    array = h;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "1\u001f\tXm7\u001e\tQd2\u001e\tQd";
                    n = 6;
                    array = h;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "pK^\b'vKKL$jAW\u0004f";
                    n = 7;
                    array = h;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "pK^\b'vKKN$jAW\u0004{fGX\r;e\u0001L\u000f&gMV\u00171pO[\r1/KK\u0013;p";
                    n = 8;
                    array = h;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "pK^\b'vKKN$jAW\u0004{w@K\u00047mX\\\u00135`B\\N$m]J\b6nK\u0014\u00155`B\\\u0015";
                    n = 9;
                    array = h;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "pK^\b'vKKL$jAW\u0004`\"";
                    n = 10;
                    array = h;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "pK^\b'vKKL$jAW\u0004";
                    n = 11;
                    array = h;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "pK^\b'vKKN$jAW\u0004{aAL\u000f pW\u0003";
                    n = 12;
                    array = h;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\"HX\b8gJ\u0019\u0015;\"BV\u000e?w^z\u000e!lZK\u0018\u0015`LK#-LOT\u0004td\\V\ftAAL\u000f pWi\t;lKp\u000f2m";
                    n = 13;
                    array = h;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "pK^\b'vKKN$jAW\u0004{dAK\f5vZ\\\u0013ygVZ\u0004$vGV\u000f";
                    n = 14;
                    array = h;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "pK^\b'vKKN$jAW\u0004{aAL\u000f pW\u0003";
                    n = 15;
                    array = h;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "pK^\b'vKKN$jAW\u0004{dAK\f5vZ\\\u0013ygVZ\u0004$vGV\u000f";
                    n = 16;
                    array = h;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\"R\u0019";
                    n = 17;
                    array = h;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000Z\r1c\\f\u0011<m@\\>:wC[\u0004&";
                    n = 18;
                    array = h;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "pK^\b'vKKN$jAW\u0004{aBV\u0002?/YK\u000e:e";
                    n = 19;
                    array = h;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000K\u0004'gZJ\u00155vK";
                    n = 20;
                    array = h;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000P\u000f$wZf\u0002;w@M\u0013-]MV\u00051";
                    n = 21;
                    array = h;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "pK^\b'vKKN$jAW\u0004{k@I\u0014 ]MZN7mCT\b \"HX\b8gJ";
                    n = 22;
                    array = h;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "pK^\b'vKKN$jAW\u0004{nGW\n{k@J\u0015&wMM\b;l]\u0016\u0005=cBV\u0006";
                    n = 23;
                    array = h;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "pK^\b'vKKN$jAW\u0004{qY\u0014\u0004,rGK\u00040";
                    n = 24;
                    array = h;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000M\u0000$rK]>'o]f\r=lE";
                    n = 25;
                    array = h;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000P\u000f$wZf\u0002;w@M\u0013-]MV\u00051";
                    n = 26;
                    array = h;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "pK^\b'vKKN$jAW\u0004{k]V[t";
                    n = 27;
                    array = h;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "pK^\b'vKKN$jAW\u0004{a\\\\\u0000 g";
                    n = 28;
                    array = h;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "pK^\b'vKKN$jAW\u0004{a\\\\\u0000 g\u0001N\u0013;lI\u0014\u0012 cZ\\A6m[W\u00021\"ZVA9cGW";
                    n = 29;
                    array = h;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "\"HX\b8gJ\u0019\u0015;\"BV\u000e?w^z\u00008nGW\u0006\u0017mJ\\A2pATA\u0017m[W\u0015&{~Q\u000e:ggW\u0007;";
                    n = 30;
                    array = h;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "pK^\b'vKKN$jAW\u0004{pKJ\u0004 /]M\u0000 g";
                    n = 31;
                    array = h;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000P\u000f$wZf\u0011<m@\\>:wC[\u0004&";
                    n = 32;
                    array = h;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000O\u0004&kHP\u00025vGV\u000f\u000bqZX\u00151";
                    n = 33;
                    array = h;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000I\t;lKf\u000f!oL\\\u0013\u000brAJ\b kAW";
                    n = 34;
                    array = h;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000I\t;lKf\u000f!oL\\\u0013";
                    n = 35;
                    array = h;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000Z\u000e!lZK\u0018\u000baA]\u0004";
                    n = 36;
                    array = h;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "pK^\b'vKKN$jAW\u0004{rOL\u00121-MV\f9kZ\u0019\u00075kB\\\u0005";
                    n = 37;
                    array = h;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "pK^\b'vKKN$jAW\u0004{rOL\u00121\"";
                    n = 38;
                    array = h;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000Z\u000e!lZK\u0018\u000baA]\u0004\u000brAJ\b kAW";
                    n = 39;
                    array = h;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000P\u000f$wZf\u0002;w@M\u0013-]MV\u00051";
                    n = 40;
                    array = h;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000W\u000e\u000bqKU\u0007\u000bqKW\u0005";
                    n = 41;
                    array = h;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000I\u00131tqI\t;lKf\u000f!oL\\\u0013";
                    n = 42;
                    array = h;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "pK^\b'vKK\u0011<m@\\N'cX\\\u0011&gXI\t;lKW\u00149-MV\f9kZ\u0019\u00075kB\\\u0005";
                    n = 43;
                    array = h;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000I\u00131tqI\t;lKf\u000f!oL\\\u0013";
                    n = 44;
                    array = h;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    s = "pK^\b'vKKN$jAW\u0004{fKJ\u0015&mW";
                    n = 45;
                    n2 = 46;
                    array = h;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    array = h;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000P\u000f$wZf\u0002;w@M\u0013-]MV\u00051";
                    n = 46;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "pK^\b'vKKN$jAW\u0004{pKJ\u00149g\u000e";
                    n = 47;
                    array = h;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000Z\u000e!lZK\u0018\u000baA]\u0004\u000brAJ\b kAW";
                    n = 48;
                    array = h;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000O\u0004&kHP\u00025vGV\u000f\u000bqZX\u00151";
                    n = 49;
                    array = h;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000Z\u000e!lZK\u0018\u000baA]\u0004";
                    n = 50;
                    array = h;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000P\u000f$wZf\u0011<m@\\>:wC[\u0004&";
                    n = 51;
                    array = h;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "pK^\b'vKKN$jAW\u0004{pKJ\u0004 /]M\u0000 g";
                    n = 52;
                    array = h;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000I\t;lKf\u000f!oL\\\u0013\u000brAJ\b kAW";
                    n = 53;
                    array = h;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000I\t;lKf\u000f!oL\\\u0013";
                    n = 54;
                    array = h;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000W\u000e\u000bqKU\u0007\u000bqKW\u0005";
                    n = 55;
                    array = h;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    s = "pK^\b'vKK\u0011<m@\\N'cX\\\u0012 cZ\\N7mCT\b \"HX\b8gJ";
                    n = 56;
                    n2 = 57;
                    array = h;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    array = h;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000O\u0004&kHP\u00025vGV\u000f\u000bqZX\u00151";
                    n = 57;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "FKU\u0004 g\u000ek\u00047mX\\\u0013-";
                    n = 58;
                    array = h;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "PKJ\u0004 ";
                    n = 59;
                    array = h;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    n2 = 61;
                    s = "NA^A\u0006gMV\u00171pW";
                    n = 60;
                    array = h;
                    continue;
                }
                case 60: {
                    array[n2] = intern;
                    n2 = 62;
                    s = "A\\\\\u0000 g\u000ek\u00047mX\\\u0013-";
                    n = 61;
                    array = h;
                    continue;
                }
                case 61: {
                    array[n2] = intern;
                    n2 = 63;
                    s = "pK^\b'vKKL$jAW\u0004tpM\u0004";
                    n = 62;
                    array = h;
                    continue;
                }
                case 62: {
                    array[n2] = intern;
                    n2 = 64;
                    s = "^j";
                    n = 63;
                    array = h;
                    continue;
                }
                case 63: {
                    array[n2] = intern;
                    n2 = 65;
                    s = "^j";
                    n = 64;
                    array = h;
                    continue;
                }
                case 64: {
                    array[n2] = intern;
                    n2 = 66;
                    s = "^j";
                    n = 65;
                    array = h;
                    continue;
                }
                case 65: {
                    array[n2] = intern;
                    n2 = 67;
                    s = "^j";
                    n = 66;
                    array = h;
                    continue;
                }
                case 66: {
                    array[n2] = intern;
                    n2 = 68;
                    s = "pK^\b'vKK\u0011<m@\\N'cX\\\u0011&gXZ\u0002{aAT\f=v\u000e_\u0000=nK]";
                    n = 67;
                    array = h;
                    continue;
                }
                case 67: {
                    array[n2] = intern;
                    n2 = 69;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000I\u00131tqZ\u000e!lZK\u0018\u000baA]\u0004";
                    n = 68;
                    array = h;
                    continue;
                }
                case 68: {
                    array[n2] = intern;
                    n2 = 70;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000I\u00131tqZ\u000e!lZK\u0018\u000baA]\u0004";
                    n = 69;
                    array = h;
                    continue;
                }
                case 69: {
                    array[n2] = intern;
                    n2 = 71;
                    s = "pK^\b'vKKN$jAW\u0004{lKN\b:vKW\u0015{nGW\n{k@J\u0015&wMM\b;l]\u0016\u0005=cBV\u0006";
                    n = 70;
                    array = h;
                    continue;
                }
                case 70: {
                    array[n2] = intern;
                    n2 = 72;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000M\u0000$rK]>'o]f\r=lE";
                    n = 71;
                    array = h;
                    continue;
                }
                case 71: {
                    array[n2] = intern;
                    n2 = 73;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000I\t;lKf\u000f!oL\\\u0013\u000brAJ\b kAW";
                    n = 72;
                    array = h;
                    continue;
                }
                case 72: {
                    array[n2] = intern;
                    n2 = 74;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000P\u000f$wZf\u0002;w@M\u0013-]MV\u00051";
                    n = 73;
                    array = h;
                    continue;
                }
                case 73: {
                    array[n2] = intern;
                    n2 = 75;
                    s = "aAL\u000f pWf\u000f5oK";
                    n = 74;
                    array = h;
                    continue;
                }
                case 74: {
                    array[n2] = intern;
                    n2 = 76;
                    s = "pK^\b'vKK\u0011<m@\\N5aZK\u0004'wBMN7mCT\b \"HX\b8gJ";
                    n = 75;
                    array = h;
                    continue;
                }
                case 75: {
                    array[n2] = intern;
                    n2 = 77;
                    s = "aM";
                    n = 76;
                    array = h;
                    continue;
                }
                case 76: {
                    array[n2] = intern;
                    n2 = 78;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000Z\u000e!lZK\u0018\u000baA]\u0004";
                    n = 77;
                    array = h;
                    continue;
                }
                case 77: {
                    array[n2] = intern;
                    n2 = 79;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000I\t;lKf\u000f!oL\\\u0013\u000brAJ\b kAW";
                    n = 78;
                    array = h;
                    continue;
                }
                case 78: {
                    array[n2] = intern;
                    n2 = 80;
                    s = "aATO#jOM\u00125r^\u001731eGJ\u00151p~Q\u000e:g\u0000Z\u000e!lZK\u0018\u000baA]\u0004\u000brAJ\b kAW";
                    n = 79;
                    array = h;
                    continue;
                }
                case 79: {
                    break Label_2057;
                }
            }
        }
        array[n2] = intern;
        H = h;
    }
    
    public RegisterPhone() {
        this.E = false;
        this.F = false;
    }
    
    public static int a(final EditText p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_1       
        //     2: getstatic       com/whatsapp/App.I:Z
        //     5: istore_2       
        //     6: aload_0        
        //     7: invokevirtual   android/widget/EditText.isFocused:()Z
        //    10: istore          4
        //    12: iload           4
        //    14: ifne            26
        //    17: iconst_m1      
        //    18: istore          6
        //    20: iload           6
        //    22: ireturn        
        //    23: astore_3       
        //    24: aload_3        
        //    25: athrow         
        //    26: aload_0        
        //    27: invokevirtual   android/widget/EditText.getText:()Landroid/text/Editable;
        //    30: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    33: astore          5
        //    35: iconst_0       
        //    36: istore          6
        //    38: iload_1        
        //    39: aload_0        
        //    40: invokevirtual   android/widget/EditText.getSelectionEnd:()I
        //    43: if_icmpge       20
        //    46: aload           5
        //    48: invokevirtual   java/lang/String.length:()I
        //    51: istore          11
        //    53: iload_1        
        //    54: iload           11
        //    56: if_icmple       63
        //    59: iload_2        
        //    60: ifeq            20
        //    63: aload           5
        //    65: iload_1        
        //    66: invokevirtual   java/lang/String.charAt:(I)C
        //    69: istore          12
        //    71: iload           12
        //    73: bipush          57
        //    75: if_icmpgt       96
        //    78: aload           5
        //    80: iload_1        
        //    81: invokevirtual   java/lang/String.charAt:(I)C
        //    84: istore          13
        //    86: iload           13
        //    88: bipush          48
        //    90: if_icmplt       96
        //    93: iinc            6, 1
        //    96: iinc            1, 1
        //    99: iload_2        
        //   100: ifeq            38
        //   103: iload           6
        //   105: ireturn        
        //   106: astore          7
        //   108: aload           7
        //   110: athrow         
        //   111: astore          8
        //   113: aload           8
        //   115: athrow         
        //   116: astore          9
        //   118: aload           9
        //   120: athrow         
        //   121: astore          10
        //   123: aload           10
        //   125: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  6      12     23     26     Ljava/lang/NullPointerException;
        //  46     53     106    116    Ljava/lang/NullPointerException;
        //  63     71     116    121    Ljava/lang/NullPointerException;
        //  78     86     121    126    Ljava/lang/NullPointerException;
        //  108    111    111    116    Ljava/lang/NullPointerException;
        //  113    116    116    121    Ljava/lang/NullPointerException;
        //  118    121    121    126    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 66, Size: 66
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
    
    static Dialog a(final RegisterPhone registerPhone, final Dialog c) {
        return registerPhone.C = c;
    }
    
    private static String a(final byte[] array) {
        final boolean i = App.I;
        if (array == null) {
            try {
                return RegisterPhone.H[1];
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        final StringBuilder sb = new StringBuilder();
        final int length = array.length;
        int j = 0;
        while (j < length) {
            sb.append(String.format(RegisterPhone.H[0], array[j]));
            ++j;
            if (i) {
                break;
            }
        }
        return sb.toString();
    }
    
    private static void a(final EditText p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_2       
        //     2: getstatic       com/whatsapp/App.I:Z
        //     5: istore_3       
        //     6: aload_0        
        //     7: invokevirtual   android/widget/EditText.getText:()Landroid/text/Editable;
        //    10: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    13: astore          4
        //    15: iconst_0       
        //    16: istore          5
        //    18: iload_2        
        //    19: aload           4
        //    21: invokevirtual   java/lang/String.length:()I
        //    24: if_icmpge       74
        //    27: iload_1        
        //    28: ifle            74
        //    31: aload           4
        //    33: iload_2        
        //    34: invokevirtual   java/lang/String.charAt:(I)C
        //    37: istore          8
        //    39: iload           8
        //    41: bipush          57
        //    43: if_icmpgt       64
        //    46: aload           4
        //    48: iload_2        
        //    49: invokevirtual   java/lang/String.charAt:(I)C
        //    52: istore          9
        //    54: iload           9
        //    56: bipush          48
        //    58: if_icmplt       64
        //    61: iinc            1, -1
        //    64: iinc            5, 1
        //    67: iinc            2, 1
        //    70: iload_3        
        //    71: ifeq            18
        //    74: aload_0        
        //    75: iload           5
        //    77: invokevirtual   android/widget/EditText.setSelection:(I)V
        //    80: return         
        //    81: astore          6
        //    83: aload           6
        //    85: athrow         
        //    86: astore          7
        //    88: aload           7
        //    90: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  31     39     81     86     Ljava/lang/NullPointerException;
        //  46     54     86     91     Ljava/lang/NullPointerException;
        //  83     86     86     91     Ljava/lang/NullPointerException;
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
    
    static void a(final RegisterPhone registerPhone) {
        registerPhone.h();
    }
    
    static void a(final RegisterPhone registerPhone, final String s) {
        registerPhone.a(s);
    }
    
    private void a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //    10: bipush          16
        //    12: aaload         
        //    13: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    16: aload_1        
        //    17: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    20: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //    23: bipush          18
        //    25: aaload         
        //    26: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    29: aload_1        
        //    30: invokestatic    com/whatsapp/vi.f:(Ljava/lang/String;)Ljava/lang/String;
        //    33: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    36: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    39: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    42: aload_0        
        //    43: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //    46: getfield        com/whatsapp/tw.c:Landroid/text/TextWatcher;
        //    49: ifnull          69
        //    52: aload_0        
        //    53: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //    56: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //    59: aload_0        
        //    60: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //    63: getfield        com/whatsapp/tw.c:Landroid/text/TextWatcher;
        //    66: invokevirtual   android/widget/EditText.removeTextChangedListener:(Landroid/text/TextWatcher;)V
        //    69: aload_0        
        //    70: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //    73: new             Lcom/whatsapp/ahr;
        //    76: dup            
        //    77: aload_1        
        //    78: invokestatic    com/whatsapp/vi.f:(Ljava/lang/String;)Ljava/lang/String;
        //    81: invokespecial   com/whatsapp/ahr.<init>:(Ljava/lang/String;)V
        //    84: putfield        com/whatsapp/tw.c:Landroid/text/TextWatcher;
        //    87: aload_0        
        //    88: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //    91: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //    94: aload_0        
        //    95: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //    98: getfield        com/whatsapp/tw.c:Landroid/text/TextWatcher;
        //   101: invokevirtual   android/widget/EditText.addTextChangedListener:(Landroid/text/TextWatcher;)V
        //   104: return         
        //   105: astore_2       
        //   106: new             Ljava/lang/StringBuilder;
        //   109: dup            
        //   110: invokespecial   java/lang/StringBuilder.<init>:()V
        //   113: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   116: bipush          13
        //   118: aaload         
        //   119: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   122: aload_1        
        //   123: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   126: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   129: bipush          14
        //   131: aaload         
        //   132: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   135: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   138: aload_2        
        //   139: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   142: goto            42
        //   145: astore          4
        //   147: aload           4
        //   149: athrow         
        //   150: astore_3       
        //   151: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   154: bipush          15
        //   156: aaload         
        //   157: aload_3        
        //   158: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   161: return         
        //   162: astore          5
        //   164: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   167: bipush          17
        //   169: aaload         
        //   170: aload           5
        //   172: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   175: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      42     105    145    Ljava/io/IOException;
        //  42     69     145    150    Ljava/io/IOException;
        //  42     69     150    162    Ljava/lang/NullPointerException;
        //  69     104    150    162    Ljava/lang/NullPointerException;
        //  69     104    162    176    Ljava/io/IOException;
        //  147    150    150    162    Ljava/lang/NullPointerException;
        //  147    150    162    176    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 80, Size: 80
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
    
    static boolean a(final RegisterPhone registerPhone, final boolean d) {
        return registerPhone.D = d;
    }
    
    static Runnable b(final RegisterPhone registerPhone) {
        return registerPhone.B;
    }
    
    public static void b(final EditText p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokevirtual   android/widget/EditText.getText:()Landroid/text/Editable;
        //     8: invokeinterface android/text/Editable.length:()I
        //    13: istore_3       
        //    14: iload_1        
        //    15: iconst_m1      
        //    16: if_icmple       38
        //    19: iload_1        
        //    20: iload_3        
        //    21: if_icmpgt       38
        //    24: aload_0        
        //    25: invokevirtual   android/widget/EditText.requestFocus:()Z
        //    28: pop            
        //    29: aload_0        
        //    30: iload_1        
        //    31: invokestatic    com/whatsapp/RegisterPhone.a:(Landroid/widget/EditText;I)V
        //    34: iload_2        
        //    35: ifeq            62
        //    38: iload_1        
        //    39: iload_3        
        //    40: if_icmple       57
        //    43: aload_0        
        //    44: invokevirtual   android/widget/EditText.requestFocus:()Z
        //    47: pop            
        //    48: aload_0        
        //    49: iload_3        
        //    50: invokevirtual   android/widget/EditText.setSelection:(I)V
        //    53: iload_2        
        //    54: ifeq            62
        //    57: aload_0        
        //    58: iload_3        
        //    59: invokevirtual   android/widget/EditText.setSelection:(I)V
        //    62: return         
        //    63: astore          6
        //    65: aload           6
        //    67: athrow         
        //    68: astore          7
        //    70: aload           7
        //    72: athrow         
        //    73: astore          4
        //    75: aload           4
        //    77: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  24     34     63     73     Ljava/lang/NullPointerException;
        //  43     53     73     78     Ljava/lang/NullPointerException;
        //  57     62     73     78     Ljava/lang/NullPointerException;
        //  65     68     68     73     Ljava/lang/NullPointerException;
        //  70     73     73     78     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0057:
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
    
    static String c(final RegisterPhone registerPhone) {
        return registerPhone.G;
    }
    
    static String d(final RegisterPhone registerPhone) {
        return registerPhone.j();
    }
    
    private void e() {
        final SharedPreferences$Editor edit = this.getPreferences(0).edit();
        try {
            edit.putString(RegisterPhone.H[69], RegisterPhone.z);
            if (!edit.commit()) {
                Log.w(RegisterPhone.H[68]);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    static void e(final RegisterPhone registerPhone) {
        registerPhone.e();
    }
    
    private String f() {
        return this.getPreferences(0).getString(RegisterPhone.H[70], "");
    }
    
    static String f(final RegisterPhone registerPhone) {
        return registerPhone.f();
    }
    
    static void g(final RegisterPhone registerPhone) {
        registerPhone.i();
    }
    
    private void h() {
        Log.i(RegisterPhone.H[32]);
        RegisterPhone.s = 7;
        this.b();
        this.c("");
        RegisterPhone.v = null;
        RegisterPhone.u = 0L;
        this.b(false);
        App.b((Context)App.aq, VerifyNumber.a(RegisterPhone.v));
        App.f((Context)App.aq, null);
    }
    
    static boolean h(final RegisterPhone registerPhone) {
        return registerPhone.D;
    }
    
    static Dialog i(final RegisterPhone registerPhone) {
        return registerPhone.C;
    }
    
    private void i() {
        final SharedPreferences$Editor edit = this.getPreferences(0).edit();
        try {
            edit.putString(RegisterPhone.H[45], RegisterPhone.w);
            if (!edit.commit()) {
                Log.w(RegisterPhone.H[44]);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    private String j() {
        return this.getPreferences(0).getString(RegisterPhone.H[43], "");
    }
    
    private void k() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/RegisterPhone.A:Ljava/lang/String;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnull          45
        //     9: aload_0        
        //    10: new             Ljava/lang/StringBuilder;
        //    13: dup            
        //    14: invokespecial   java/lang/StringBuilder.<init>:()V
        //    17: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //    20: bipush          11
        //    22: aaload         
        //    23: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    26: aload_0        
        //    27: getfield        com/whatsapp/RegisterPhone.A:Ljava/lang/String;
        //    30: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    33: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    36: invokespecial   com/whatsapp/EnterPhoneNumber.g:(Ljava/lang/String;)V
        //    39: getstatic       com/whatsapp/App.I:Z
        //    42: ifeq            62
        //    45: aload_0        
        //    46: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //    49: bipush          12
        //    51: aaload         
        //    52: invokespecial   com/whatsapp/EnterPhoneNumber.g:(Ljava/lang/String;)V
        //    55: return         
        //    56: astore_1       
        //    57: aload_1        
        //    58: athrow         
        //    59: astore_2       
        //    60: aload_2        
        //    61: athrow         
        //    62: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      5      56     59     Ljava/lang/NullPointerException;
        //  9      45     59     62     Ljava/lang/NullPointerException;
        //  45     55     59     62     Ljava/lang/NullPointerException;
        //  57     59     59     62     Ljava/lang/NullPointerException;
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
    
    @Override
    protected void b() {
        final SharedPreferences$Editor edit = this.getPreferences(0).edit();
        try {
            edit.putInt(RegisterPhone.H[58], RegisterPhone.s);
            if (!edit.commit()) {
                Log.w(RegisterPhone.H[57]);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    @Override
    protected void c(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getstatic       com/whatsapp/RegisterPhone.z:Ljava/lang/String;
        //     4: getstatic       com/whatsapp/RegisterPhone.w:Ljava/lang/String;
        //     7: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
        //    10: bipush          7
        //    12: putstatic       com/whatsapp/RegisterPhone.s:I
        //    15: aload_0        
        //    16: invokevirtual   com/whatsapp/RegisterPhone.b:()V
        //    19: iload_1        
        //    20: ifeq            44
        //    23: aload_0        
        //    24: getfield        com/whatsapp/RegisterPhone.q:Z
        //    27: istore          5
        //    29: iload           5
        //    31: ifeq            44
        //    34: aload_0        
        //    35: invokevirtual   com/whatsapp/RegisterPhone.f:()V
        //    38: getstatic       com/whatsapp/App.I:Z
        //    41: ifeq            64
        //    44: aload_0        
        //    45: iconst_2       
        //    46: invokestatic    com/whatsapp/App.b:(Landroid/content/Context;I)V
        //    49: aload_0        
        //    50: new             Landroid/content/Intent;
        //    53: dup            
        //    54: aload_0        
        //    55: ldc_w           Lcom/whatsapp/RegisterName;.class
        //    58: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //    61: invokevirtual   com/whatsapp/RegisterPhone.startActivity:(Landroid/content/Intent;)V
        //    64: aload_0        
        //    65: invokevirtual   com/whatsapp/RegisterPhone.finish:()V
        //    68: return         
        //    69: astore_2       
        //    70: aload_2        
        //    71: athrow         
        //    72: astore_3       
        //    73: aload_3        
        //    74: athrow         
        //    75: astore          4
        //    77: aload           4
        //    79: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      19     69     72     Ljava/lang/NullPointerException;
        //  23     29     72     75     Ljava/lang/NullPointerException;
        //  34     44     75     80     Ljava/lang/NullPointerException;
        //  44     64     75     80     Ljava/lang/NullPointerException;
        //  70     72     72     75     Ljava/lang/NullPointerException;
        //  73     75     75     80     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 41, Size: 41
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
    protected void onActivityResult(final int p0, final int p1, final Intent p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iload_1        
        //     1: ifne            195
        //     4: iload_2        
        //     5: iconst_m1      
        //     6: if_icmpne       190
        //     9: aload_3        
        //    10: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //    13: bipush          77
        //    15: aaload         
        //    16: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    19: putstatic       com/whatsapp/RegisterPhone.z:Ljava/lang/String;
        //    22: aload_0        
        //    23: aload_3        
        //    24: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //    27: bipush          75
        //    29: aaload         
        //    30: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    33: putfield        com/whatsapp/RegisterPhone.G:Ljava/lang/String;
        //    36: aload_0        
        //    37: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //    40: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //    43: getstatic       com/whatsapp/RegisterPhone.z:Ljava/lang/String;
        //    46: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //    49: aload_0        
        //    50: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //    53: getfield        com/whatsapp/tw.f:Landroid/widget/TextView;
        //    56: aload_0        
        //    57: getfield        com/whatsapp/RegisterPhone.G:Ljava/lang/String;
        //    60: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    63: aload_0        
        //    64: aload_0        
        //    65: getfield        com/whatsapp/RegisterPhone.G:Ljava/lang/String;
        //    68: invokespecial   com/whatsapp/RegisterPhone.a:(Ljava/lang/String;)V
        //    71: aload_0        
        //    72: iconst_0       
        //    73: invokevirtual   com/whatsapp/RegisterPhone.getPreferences:(I)Landroid/content/SharedPreferences;
        //    76: astore          4
        //    78: aload           4
        //    80: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //    85: astore          5
        //    87: aload           5
        //    89: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //    92: bipush          74
        //    94: aaload         
        //    95: getstatic       com/whatsapp/RegisterPhone.z:Ljava/lang/String;
        //    98: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //   103: pop            
        //   104: aload           5
        //   106: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   109: bipush          78
        //   111: aaload         
        //   112: getstatic       com/whatsapp/RegisterPhone.z:Ljava/lang/String;
        //   115: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //   120: pop            
        //   121: aload           4
        //   123: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   126: bipush          73
        //   128: aaload         
        //   129: iconst_m1      
        //   130: invokeinterface android/content/SharedPreferences.getInt:(Ljava/lang/String;I)I
        //   135: iconst_m1      
        //   136: if_icmpne       156
        //   139: aload           5
        //   141: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   144: bipush          79
        //   146: aaload         
        //   147: ldc_w           2147483647
        //   150: invokeinterface android/content/SharedPreferences$Editor.putInt:(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
        //   155: pop            
        //   156: aload           5
        //   158: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   161: bipush          80
        //   163: aaload         
        //   164: iconst_m1      
        //   165: invokeinterface android/content/SharedPreferences$Editor.putInt:(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
        //   170: pop            
        //   171: aload           5
        //   173: invokeinterface android/content/SharedPreferences$Editor.commit:()Z
        //   178: ifne            190
        //   181: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   184: bipush          76
        //   186: aaload         
        //   187: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   190: aload_0        
        //   191: iconst_0       
        //   192: putfield        com/whatsapp/RegisterPhone.D:Z
        //   195: aload_0        
        //   196: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   199: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   202: aload_0        
        //   203: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   206: getfield        com/whatsapp/tw.g:Landroid/text/TextWatcher;
        //   209: invokevirtual   android/widget/EditText.addTextChangedListener:(Landroid/text/TextWatcher;)V
        //   212: return         
        //   213: astore          6
        //   215: aload           6
        //   217: athrow         
        //   218: astore          9
        //   220: aload           9
        //   222: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  87     156    213    218    Ljava/lang/NullPointerException;
        //  156    190    218    223    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0156:
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
    
    @Override
    protected void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //     7: bipush          29
        //     9: aaload         
        //    10: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    13: aload_0        
        //    14: aload_1        
        //    15: invokespecial   com/whatsapp/EnterPhoneNumber.onCreate:(Landroid/os/Bundle;)V
        //    18: aload_0        
        //    19: aload_0        
        //    20: invokevirtual   com/whatsapp/RegisterPhone.getLayoutInflater:()Landroid/view/LayoutInflater;
        //    23: ldc_w           2130903211
        //    26: aconst_null    
        //    27: iconst_0       
        //    28: iconst_1       
        //    29: newarray        I
        //    31: dup            
        //    32: iconst_0       
        //    33: ldc_w           2131755346
        //    36: iastore        
        //    37: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z[I)Landroid/view/View;
        //    40: invokevirtual   com/whatsapp/RegisterPhone.setContentView:(Landroid/view/View;)V
        //    43: aload_0        
        //    44: invokestatic    com/whatsapp/App.c:(Landroid/content/Context;)I
        //    47: iconst_1       
        //    48: if_icmpeq       80
        //    51: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //    54: bipush          30
        //    56: aaload         
        //    57: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //    60: aload_0        
        //    61: new             Landroid/content/Intent;
        //    64: dup            
        //    65: aload_0        
        //    66: ldc_w           Lcom/whatsapp/Main;.class
        //    69: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //    72: invokevirtual   com/whatsapp/RegisterPhone.startActivity:(Landroid/content/Intent;)V
        //    75: aload_0        
        //    76: invokevirtual   com/whatsapp/RegisterPhone.finish:()V
        //    79: return         
        //    80: aload_0        
        //    81: invokevirtual   com/whatsapp/RegisterPhone.getIntent:()Landroid/content/Intent;
        //    84: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //    87: ifnull          206
        //    90: aload_0        
        //    91: invokevirtual   com/whatsapp/RegisterPhone.getIntent:()Landroid/content/Intent;
        //    94: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //    97: bipush          21
        //    99: aaload         
        //   100: iconst_0       
        //   101: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   104: istore          28
        //   106: iload           28
        //   108: ifeq            115
        //   111: aload_0        
        //   112: invokespecial   com/whatsapp/RegisterPhone.h:()V
        //   115: aload_0        
        //   116: invokevirtual   com/whatsapp/RegisterPhone.getIntent:()Landroid/content/Intent;
        //   119: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   122: bipush          19
        //   124: aaload         
        //   125: iconst_0       
        //   126: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   129: ifeq            141
        //   132: aload_0        
        //   133: iconst_1       
        //   134: putfield        com/whatsapp/RegisterPhone.F:Z
        //   137: iload_2        
        //   138: ifeq            146
        //   141: aload_0        
        //   142: iconst_0       
        //   143: putfield        com/whatsapp/RegisterPhone.F:Z
        //   146: aload_0        
        //   147: invokevirtual   com/whatsapp/RegisterPhone.getIntent:()Landroid/content/Intent;
        //   150: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   153: bipush          26
        //   155: aaload         
        //   156: iconst_0       
        //   157: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   160: ifeq            211
        //   163: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   166: bipush          24
        //   168: aaload         
        //   169: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   172: iconst_1       
        //   173: anewarray       Ljava/lang/Object;
        //   176: astore          32
        //   178: aload           32
        //   180: iconst_0       
        //   181: aload_0        
        //   182: ldc_w           2131231435
        //   185: invokevirtual   com/whatsapp/RegisterPhone.getString:(I)Ljava/lang/String;
        //   188: aastore        
        //   189: aload_0        
        //   190: aload_0        
        //   191: ldc_w           2131231565
        //   194: aload           32
        //   196: invokevirtual   com/whatsapp/RegisterPhone.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   199: invokevirtual   com/whatsapp/RegisterPhone.f:(Ljava/lang/String;)V
        //   202: iload_2        
        //   203: ifeq            211
        //   206: aload_0        
        //   207: iconst_0       
        //   208: putfield        com/whatsapp/RegisterPhone.F:Z
        //   211: getstatic       com/whatsapp/App.h:Landroid/telephony/TelephonyManager;
        //   214: aload_0        
        //   215: getfield        com/whatsapp/RegisterPhone.r:Landroid/telephony/PhoneStateListener;
        //   218: sipush          1535
        //   221: invokevirtual   android/telephony/TelephonyManager.listen:(Landroid/telephony/PhoneStateListener;I)V
        //   224: aload_0        
        //   225: new             Lcom/whatsapp/tw;
        //   228: dup            
        //   229: invokespecial   com/whatsapp/tw.<init>:()V
        //   232: putfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   235: aload_0        
        //   236: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   239: aload_0        
        //   240: ldc_w           2131755347
        //   243: invokevirtual   com/whatsapp/RegisterPhone.findViewById:(I)Landroid/view/View;
        //   246: checkcast       Landroid/widget/EditText;
        //   249: putfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   252: aload_0        
        //   253: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   256: aload_0        
        //   257: ldc_w           2131755533
        //   260: invokevirtual   com/whatsapp/RegisterPhone.findViewById:(I)Landroid/view/View;
        //   263: checkcast       Landroid/widget/TextView;
        //   266: putfield        com/whatsapp/tw.f:Landroid/widget/TextView;
        //   269: aload_0        
        //   270: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   273: aload_0        
        //   274: ldc_w           2131755348
        //   277: invokevirtual   com/whatsapp/RegisterPhone.findViewById:(I)Landroid/view/View;
        //   280: checkcast       Landroid/widget/EditText;
        //   283: putfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   286: aload_0        
        //   287: ldc_w           2131755532
        //   290: invokevirtual   com/whatsapp/RegisterPhone.findViewById:(I)Landroid/view/View;
        //   293: checkcast       Landroid/widget/TextView;
        //   296: aload_0        
        //   297: ldc_w           2131231547
        //   300: invokevirtual   com/whatsapp/RegisterPhone.getString:(I)Ljava/lang/String;
        //   303: invokevirtual   java/lang/String.toUpperCase:()Ljava/lang/String;
        //   306: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   309: aload_0        
        //   310: ldc_w           2131755534
        //   313: invokevirtual   com/whatsapp/RegisterPhone.findViewById:(I)Landroid/view/View;
        //   316: checkcast       Landroid/widget/TextView;
        //   319: aload_0        
        //   320: ldc_w           2131231548
        //   323: invokevirtual   com/whatsapp/RegisterPhone.getString:(I)Ljava/lang/String;
        //   326: invokevirtual   java/lang/String.toUpperCase:()Ljava/lang/String;
        //   329: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   332: iconst_1       
        //   333: anewarray       Landroid/text/InputFilter;
        //   336: astore          6
        //   338: aload           6
        //   340: iconst_0       
        //   341: new             Landroid/text/InputFilter$LengthFilter;
        //   344: dup            
        //   345: iconst_3       
        //   346: invokespecial   android/text/InputFilter$LengthFilter.<init>:(I)V
        //   349: aastore        
        //   350: aload_0        
        //   351: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   354: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   357: aload           6
        //   359: invokevirtual   android/widget/EditText.setFilters:([Landroid/text/InputFilter;)V
        //   362: iconst_1       
        //   363: anewarray       Landroid/text/InputFilter;
        //   366: astore          7
        //   368: aload           7
        //   370: iconst_0       
        //   371: new             Landroid/text/InputFilter$LengthFilter;
        //   374: dup            
        //   375: bipush          17
        //   377: invokespecial   android/text/InputFilter$LengthFilter.<init>:(I)V
        //   380: aastore        
        //   381: aload_0        
        //   382: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   385: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   388: aload           7
        //   390: invokevirtual   android/widget/EditText.setFilters:([Landroid/text/InputFilter;)V
        //   393: aload_0        
        //   394: iconst_0       
        //   395: invokevirtual   com/whatsapp/RegisterPhone.getPreferences:(I)Landroid/content/SharedPreferences;
        //   398: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   401: bipush          22
        //   403: aaload         
        //   404: aconst_null    
        //   405: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   410: ifnonnull       489
        //   413: getstatic       com/whatsapp/App.h:Landroid/telephony/TelephonyManager;
        //   416: invokevirtual   android/telephony/TelephonyManager.getNetworkCountryIso:()Ljava/lang/String;
        //   419: astore          21
        //   421: aload           21
        //   423: ifnull          489
        //   426: aload           21
        //   428: invokestatic    com/whatsapp/vi.c:(Ljava/lang/String;)Ljava/lang/String;
        //   431: astore          27
        //   433: aload           27
        //   435: astore          23
        //   437: aload           23
        //   439: ifnull          489
        //   442: aload_0        
        //   443: iconst_0       
        //   444: invokevirtual   com/whatsapp/RegisterPhone.getPreferences:(I)Landroid/content/SharedPreferences;
        //   447: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //   452: astore          24
        //   454: aload           24
        //   456: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   459: bipush          27
        //   461: aaload         
        //   462: aload           23
        //   464: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //   469: pop            
        //   470: aload           24
        //   472: invokeinterface android/content/SharedPreferences$Editor.commit:()Z
        //   477: ifne            489
        //   480: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   483: bipush          23
        //   485: aaload         
        //   486: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   489: aload_0        
        //   490: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   493: new             Lcom/whatsapp/ld;
        //   496: dup            
        //   497: aload_0        
        //   498: invokespecial   com/whatsapp/ld.<init>:(Lcom/whatsapp/RegisterPhone;)V
        //   501: putfield        com/whatsapp/tw.g:Landroid/text/TextWatcher;
        //   504: aload_0        
        //   505: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   508: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   511: aload_0        
        //   512: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   515: getfield        com/whatsapp/tw.g:Landroid/text/TextWatcher;
        //   518: invokevirtual   android/widget/EditText.addTextChangedListener:(Landroid/text/TextWatcher;)V
        //   521: new             Lcom/whatsapp/a0b;
        //   524: dup            
        //   525: aload_0        
        //   526: invokespecial   com/whatsapp/a0b.<init>:(Lcom/whatsapp/RegisterPhone;)V
        //   529: astore          8
        //   531: aload_0        
        //   532: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   535: getfield        com/whatsapp/tw.f:Landroid/widget/TextView;
        //   538: aload           8
        //   540: invokevirtual   android/widget/TextView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   543: aload_0        
        //   544: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   547: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   550: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   553: pop            
        //   554: aload_0        
        //   555: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   558: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   561: iconst_1       
        //   562: invokevirtual   android/widget/EditText.setCursorVisible:(Z)V
        //   565: aload_0        
        //   566: new             Lcom/whatsapp/as9;
        //   569: dup            
        //   570: aload_0        
        //   571: invokespecial   com/whatsapp/as9.<init>:(Lcom/whatsapp/RegisterPhone;)V
        //   574: putfield        com/whatsapp/RegisterPhone.B:Ljava/lang/Runnable;
        //   577: aload_0        
        //   578: ldc_w           2131755535
        //   581: invokevirtual   com/whatsapp/RegisterPhone.findViewById:(I)Landroid/view/View;
        //   584: checkcast       Landroid/widget/Button;
        //   587: astore          10
        //   589: aload           10
        //   591: new             Lcom/whatsapp/a0g;
        //   594: dup            
        //   595: aload_0        
        //   596: invokespecial   com/whatsapp/a0g.<init>:(Lcom/whatsapp/RegisterPhone;)V
        //   599: invokevirtual   android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   602: getstatic       com/whatsapp/RegisterPhone.z:Ljava/lang/String;
        //   605: ifnull          621
        //   608: aload_0        
        //   609: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   612: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   615: getstatic       com/whatsapp/RegisterPhone.z:Ljava/lang/String;
        //   618: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //   621: aload_0        
        //   622: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   625: getfield        com/whatsapp/tw.f:Landroid/widget/TextView;
        //   628: invokevirtual   android/widget/TextView.getText:()Ljava/lang/CharSequence;
        //   631: invokeinterface java/lang/CharSequence.toString:()Ljava/lang/String;
        //   636: astore          12
        //   638: aload           12
        //   640: ifnull          657
        //   643: aload           12
        //   645: invokevirtual   java/lang/String.length:()I
        //   648: ifle            657
        //   651: aload_0        
        //   652: aload           12
        //   654: invokespecial   com/whatsapp/RegisterPhone.a:(Ljava/lang/String;)V
        //   657: aload_0        
        //   658: aload_0        
        //   659: invokevirtual   com/whatsapp/RegisterPhone.f:()Z
        //   662: putfield        com/whatsapp/RegisterPhone.t:Z
        //   665: aload_0        
        //   666: invokevirtual   com/whatsapp/RegisterPhone.getWindowManager:()Landroid/view/WindowManager;
        //   669: invokeinterface android/view/WindowManager.getDefaultDisplay:()Landroid/view/Display;
        //   674: invokevirtual   android/view/Display.getHeight:()I
        //   677: sipush          480
        //   680: if_icmpgt       691
        //   683: aload_0        
        //   684: invokevirtual   com/whatsapp/RegisterPhone.getWindow:()Landroid/view/Window;
        //   687: iconst_3       
        //   688: invokevirtual   android/view/Window.setSoftInputMode:(I)V
        //   691: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   694: invokevirtual   com/whatsapp/App.D:()Z
        //   697: istore          17
        //   699: iload           17
        //   701: ifeq            722
        //   704: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   707: bipush          20
        //   709: aaload         
        //   710: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   713: aload_0        
        //   714: invokevirtual   com/whatsapp/RegisterPhone.a:()Z
        //   717: pop            
        //   718: iload_2        
        //   719: ifeq            79
        //   722: invokestatic    com/whatsapp/App.w:()Z
        //   725: ifeq            79
        //   728: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   731: bipush          25
        //   733: aaload         
        //   734: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   737: aload_0        
        //   738: invokevirtual   com/whatsapp/RegisterPhone.d:()Z
        //   741: pop            
        //   742: return         
        //   743: astore          16
        //   745: aload           16
        //   747: athrow         
        //   748: astore_3       
        //   749: aload_3        
        //   750: athrow         
        //   751: astore          4
        //   753: aload           4
        //   755: athrow         
        //   756: astore          29
        //   758: aload           29
        //   760: athrow         
        //   761: astore          30
        //   763: aload           30
        //   765: athrow         
        //   766: astore          31
        //   768: aload           31
        //   770: athrow         
        //   771: astore          5
        //   773: aload           5
        //   775: athrow         
        //   776: astore          22
        //   778: new             Ljava/lang/StringBuilder;
        //   781: dup            
        //   782: invokespecial   java/lang/StringBuilder.<init>:()V
        //   785: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   788: bipush          28
        //   790: aaload         
        //   791: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   794: aload           21
        //   796: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   799: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   802: bipush          31
        //   804: aaload         
        //   805: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   808: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   811: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   814: aconst_null    
        //   815: astore          23
        //   817: goto            437
        //   820: astore          25
        //   822: aload           25
        //   824: athrow         
        //   825: astore          11
        //   827: aload           11
        //   829: athrow         
        //   830: astore          20
        //   832: aload           20
        //   834: athrow         
        //   835: astore          13
        //   837: aload           13
        //   839: athrow         
        //   840: astore          14
        //   842: aload           14
        //   844: athrow         
        //   845: astore          15
        //   847: aload           15
        //   849: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  80     106    748    751    Ljava/io/IOException;
        //  111    115    751    756    Ljava/io/IOException;
        //  115    137    756    761    Ljava/io/IOException;
        //  141    146    761    766    Ljava/io/IOException;
        //  146    202    766    771    Ljava/io/IOException;
        //  206    211    771    776    Ljava/io/IOException;
        //  426    433    776    820    Ljava/io/IOException;
        //  454    489    820    825    Ljava/io/IOException;
        //  589    621    825    830    Ljava/io/IOException;
        //  643    657    830    835    Ljava/io/IOException;
        //  657    691    835    840    Ljava/io/IOException;
        //  691    699    840    845    Ljava/io/IOException;
        //  704    718    845    850    Ljava/io/IOException;
        //  722    742    743    748    Ljava/io/IOException;
        //  749    751    751    756    Ljava/io/IOException;
        //  758    761    761    766    Ljava/io/IOException;
        //  768    771    771    776    Ljava/io/IOException;
        //  842    845    845    850    Ljava/io/IOException;
        //  847    850    743    748    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 392, Size: 392
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
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 21: {
                Log.i(RegisterPhone.H[5]);
                final String string = this.getString(2131231551, new Object[] { alm.a(VerifyNumber.b(RegisterPhone.z, RegisterPhone.w)) });
                final SpannableStringBuilder message = new SpannableStringBuilder((CharSequence)string);
                message.setSpan((Object)new StyleSpan(1), 0, string.length(), 33);
                final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)this.getString(2131231435));
                spannableStringBuilder.setSpan((Object)new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
                (this.C = new AlertDialog$Builder((Context)this).setMessage((CharSequence)message).setCancelable(false).setPositiveButton((CharSequence)spannableStringBuilder, (DialogInterface$OnClickListener)new ads(this)).setNeutralButton(2131231537, (DialogInterface$OnClickListener)new r8(this)).create()).setOnDismissListener((DialogInterface$OnDismissListener)new q2(this));
                return this.C;
            }
            case 22: {
                Log.w(RegisterPhone.H[9]);
                String message2 = this.getString(2131231572);
                String s = RegisterPhone.H[8];
                try {
                    if (RegisterPhone.H[3].equals(VerifyNumber.a()) && RegisterPhone.H[7].equals(App.h.getSubscriberId())) {
                        message2 = message2 + RegisterPhone.H[6] + this.getString(2131231098);
                        Log.i(RegisterPhone.H[10]);
                        s = RegisterPhone.H[2];
                    }
                    return new AlertDialog$Builder((Context)this).setMessage(message2).setPositiveButton(2131231536, (DialogInterface$OnClickListener)new a6u(this, s)).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new ng(this)).create();
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
            }
            case 23: {
                Log.w(RegisterPhone.H[4]);
                return new AlertDialog$Builder((Context)this).setMessage(this.getString(2131231575) + "\n" + alm.a(VerifyNumber.b(RegisterPhone.z, RegisterPhone.w)) + "\n" + this.getString(2131231574)).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new aru(this)).create();
            }
        }
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        menu.add(0, 0, 0, 2131231536).setIcon(2130838789);
        if (App.aV == 3) {
            menu.add(0, 1, 0, (CharSequence)RegisterPhone.H[60]);
            menu.add(0, 2, 0, (CharSequence)RegisterPhone.H[62]);
            menu.add(0, 3, 0, (CharSequence)RegisterPhone.H[59]);
            menu.add(0, 4, 0, (CharSequence)RegisterPhone.H[61]);
        }
        return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    protected void onDestroy() {
        Log.i(RegisterPhone.H[46]);
        App.h.listen(this.r, 0);
        this.E = true;
        super.onDestroy();
    }
    
    @Override
    protected void onNewIntent(final Intent intent) {
        try {
            super.onNewIntent(intent);
            if (intent.getBooleanExtra(RegisterPhone.H[72], false)) {
                Log.i(RegisterPhone.H[71]);
                this.f(this.getString(2131231565, new Object[] { this.getString(2131231435) }));
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        Label_0160: {
            Label_0155: {
                Label_0069: {
                    try {
                        switch (menuItem.getItemId()) {
                            default: {
                                return super.onOptionsItemSelected(menuItem);
                            }
                            case 0: {
                                this.k();
                                return true;
                            }
                            case 1: {
                                break;
                            }
                            case 2: {
                                break Label_0069;
                            }
                            case 3: {
                                break Label_0155;
                            }
                            case 4: {
                                break Label_0160;
                            }
                        }
                    }
                    catch (NullPointerException ex) {
                        throw ex;
                    }
                    App.k((Context)this);
                    this.finish();
                    return true;
                }
                al5.a(al5.k(), App.n(this.y.a.getText().toString().replaceAll(RegisterPhone.H[66], "") + this.y.d.getText().toString().replaceAll(RegisterPhone.H[65], "")));
                return true;
            }
            al5.a();
            return true;
        }
        Log.i(RegisterPhone.H[63] + a(al5.b(App.n(this.y.a.getText().toString().replaceAll(RegisterPhone.H[64], "") + this.y.d.getText().toString().replaceAll(RegisterPhone.H[67], "")))));
        return true;
    }
    
    @Override
    public void onPause() {
        super.onPause();
        Log.i(RegisterPhone.H[39] + RegisterPhone.s);
        final SharedPreferences$Editor edit = this.getPreferences(0).edit();
        try {
            edit.putString(RegisterPhone.H[37], RegisterPhone.z);
            edit.putString(RegisterPhone.H[36], RegisterPhone.w);
            edit.putInt(RegisterPhone.H[34], RegisterPhone.s);
            edit.putString(RegisterPhone.H[33], this.y.d.getText().toString());
            edit.putString(RegisterPhone.H[41], this.y.a.getText().toString());
            edit.putBoolean(RegisterPhone.H[42], this.t);
            edit.putInt(RegisterPhone.H[40], a(this.y.a));
            edit.putInt(RegisterPhone.H[35], a(this.y.d));
            if (!edit.commit()) {
                Log.w(RegisterPhone.H[38]);
            }
            App.b((Context)App.aq, VerifyNumber.a(RegisterPhone.v));
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    @Override
    public void onResume() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: invokespecial   com/whatsapp/EnterPhoneNumber.onResume:()V
        //     8: aload_0        
        //     9: iconst_0       
        //    10: invokevirtual   com/whatsapp/RegisterPhone.getPreferences:(I)Landroid/content/SharedPreferences;
        //    13: astore_2       
        //    14: aload_2        
        //    15: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //    18: bipush          51
        //    20: aaload         
        //    21: aconst_null    
        //    22: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    27: putstatic       com/whatsapp/RegisterPhone.z:Ljava/lang/String;
        //    30: aload_2        
        //    31: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //    34: bipush          55
        //    36: aaload         
        //    37: aconst_null    
        //    38: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    43: putstatic       com/whatsapp/RegisterPhone.w:Ljava/lang/String;
        //    46: aload_2        
        //    47: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //    50: bipush          50
        //    52: aaload         
        //    53: bipush          7
        //    55: invokeinterface android/content/SharedPreferences.getInt:(Ljava/lang/String;I)I
        //    60: putstatic       com/whatsapp/RegisterPhone.s:I
        //    63: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    66: invokestatic    com/whatsapp/App.y:(Landroid/content/Context;)Ljava/lang/String;
        //    69: invokestatic    com/whatsapp/RegisterPhone.b:(Ljava/lang/String;)Ljava/lang/String;
        //    72: putstatic       com/whatsapp/RegisterPhone.v:Ljava/lang/String;
        //    75: aload_0        
        //    76: aload_2        
        //    77: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //    80: bipush          56
        //    82: aaload         
        //    83: iconst_0       
        //    84: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //    89: putfield        com/whatsapp/RegisterPhone.t:Z
        //    92: aload_0        
        //    93: getfield        com/whatsapp/RegisterPhone.F:Z
        //    96: istore          5
        //    98: iload           5
        //   100: ifeq            125
        //   103: aload_0        
        //   104: iconst_0       
        //   105: putfield        com/whatsapp/RegisterPhone.F:Z
        //   108: aload_0        
        //   109: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   112: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   115: ldc_w           ""
        //   118: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //   121: iload_1        
        //   122: ifeq            148
        //   125: aload_0        
        //   126: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   129: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   132: aload_2        
        //   133: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   136: bipush          52
        //   138: aaload         
        //   139: aconst_null    
        //   140: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   145: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //   148: aload_0        
        //   149: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   152: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   155: aload_2        
        //   156: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   159: bipush          47
        //   161: aaload         
        //   162: aconst_null    
        //   163: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   168: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //   171: aload_0        
        //   172: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   175: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   178: aload_2        
        //   179: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   182: bipush          54
        //   184: aaload         
        //   185: iconst_m1      
        //   186: invokeinterface android/content/SharedPreferences.getInt:(Ljava/lang/String;I)I
        //   191: invokestatic    com/whatsapp/RegisterPhone.b:(Landroid/widget/EditText;I)V
        //   194: aload_0        
        //   195: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   198: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   201: aload_2        
        //   202: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   205: bipush          49
        //   207: aaload         
        //   208: iconst_m1      
        //   209: invokeinterface android/content/SharedPreferences.getInt:(Ljava/lang/String;I)I
        //   214: invokestatic    com/whatsapp/RegisterPhone.b:(Landroid/widget/EditText;I)V
        //   217: new             Ljava/lang/StringBuilder;
        //   220: dup            
        //   221: invokespecial   java/lang/StringBuilder.<init>:()V
        //   224: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   227: bipush          48
        //   229: aaload         
        //   230: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   233: getstatic       com/whatsapp/RegisterPhone.s:I
        //   236: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   239: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   242: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   245: getstatic       com/whatsapp/RegisterPhone.s:I
        //   248: istore          10
        //   250: iload           10
        //   252: tableswitch {
        //               30: 297
        //          default: 272
        //        }
        //   272: aload_0        
        //   273: invokestatic    android/support/v4/app/NotificationManagerCompat.from:(Landroid/content/Context;)Landroid/support/v4/app/NotificationManagerCompat;
        //   276: iconst_1       
        //   277: invokevirtual   android/support/v4/app/NotificationManagerCompat.cancel:(I)V
        //   280: aload_0        
        //   281: iconst_1       
        //   282: invokestatic    com/whatsapp/App.b:(Landroid/content/Context;I)V
        //   285: invokestatic    com/whatsapp/z8.i:()V
        //   288: return         
        //   289: astore_3       
        //   290: aload_3        
        //   291: athrow         
        //   292: astore          4
        //   294: aload           4
        //   296: athrow         
        //   297: getstatic       com/whatsapp/RegisterPhone.z:Ljava/lang/String;
        //   300: astore          11
        //   302: aload           11
        //   304: ifnull          317
        //   307: getstatic       com/whatsapp/RegisterPhone.w:Ljava/lang/String;
        //   310: astore          12
        //   312: aload           12
        //   314: ifnonnull       339
        //   317: getstatic       com/whatsapp/RegisterPhone.H:[Ljava/lang/String;
        //   320: bipush          53
        //   322: aaload         
        //   323: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   326: bipush          7
        //   328: putstatic       com/whatsapp/RegisterPhone.s:I
        //   331: aload_0        
        //   332: invokevirtual   com/whatsapp/RegisterPhone.b:()V
        //   335: iload_1        
        //   336: ifeq            272
        //   339: aload_0        
        //   340: bipush          21
        //   342: invokevirtual   com/whatsapp/RegisterPhone.showDialog:(I)V
        //   345: goto            272
        //   348: astore          9
        //   350: aload           9
        //   352: athrow         
        //   353: astore          6
        //   355: aload           6
        //   357: athrow         
        //   358: astore          7
        //   360: aload           7
        //   362: athrow         
        //   363: astore          8
        //   365: aload           8
        //   367: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  14     98     289    292    Ljava/lang/NullPointerException;
        //  103    121    292    297    Ljava/lang/NullPointerException;
        //  125    148    292    297    Ljava/lang/NullPointerException;
        //  148    250    353    358    Ljava/lang/NullPointerException;
        //  290    292    292    297    Ljava/lang/NullPointerException;
        //  297    302    358    363    Ljava/lang/NullPointerException;
        //  307    312    363    368    Ljava/lang/NullPointerException;
        //  317    335    348    353    Ljava/lang/NullPointerException;
        //  339    345    348    353    Ljava/lang/NullPointerException;
        //  355    358    358    363    Ljava/lang/NullPointerException;
        //  360    363    363    368    Ljava/lang/NullPointerException;
        //  365    368    348    353    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 160, Size: 160
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
