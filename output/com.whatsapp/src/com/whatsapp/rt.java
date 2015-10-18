// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import java.util.List;
import android.database.Cursor;
import org.whispersystems.z;
import org.whispersystems.a6;
import org.whispersystems.aS;
import com.whatsapp.util.Log;
import android.database.sqlite.SQLiteException;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.util.b9;
import android.os.Build$VERSION;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

final class rt extends SQLiteOpenHelper
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[55];
        String s = "\u000fRk93\u0013Yk";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1407:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'Z';
                        break;
                    }
                    case 0: {
                        c2 = '|';
                        break;
                    }
                    case 1: {
                        c2 = '7';
                        break;
                    }
                    case 2: {
                        c2 = '\u0018';
                        break;
                    }
                    case 3: {
                        c2 = 'J';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "={L\u000f\b\\cY\b\u00169\u0017k/)\u000f^w$)\\v\\\u000ez?xT\u001f\u00172\u0017l#7\u0019Dl+7\f\u0017Q\u0004\u000e9p]\u0018";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\b^u/)\bVu:";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\fEq<;\bRG!?\u0005";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "\fBz&3\u001fhs/#";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "\u0015S}$.\u0015Cq/)";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "?e]\u000b\u000e9\u0017L\u000b\u00180r8:(\u0019\\}3)\\\u001fG#>\\~V\u001e\u001f;rJj\n.~U\u000b\b%\u0017S\u000f\u0003\\vM\u001e\u00155y[\u0018\u001f1rV\u001ev\\Gj/1\u0019NG#>\\~V\u001e\u001f;rJj\u000f2~I\u001f\u001fP\u0017k/4\bhl%\u0005\u000fRj<?\u000e\u0017Z\u0005\u00150rY\u0004v\\E})5\u000eS8\b\u00163u1";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "?e]\u000b\u000e9\u0017L\u000b\u00180r89?\u000fDq%4\u000f\u00170\u00153\u0018\u0017Q\u0004\u000e9p]\u0018z,eQ\u0007\u001b.n8\u0001\u001f%\u0017Y\u001f\u000e3~V\t\b9z]\u0004\u000eP\u0017j/9\u0015Gq/4\bhq.z5yL\u000f\u001d9e8\u001f\u00145fM\u000fv\\E})5\u000eS8\b\u00163u4j.\u0015Z}9.\u001dZhj\u00132c]\r\u001f.\u001e";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u000eR\u007f#)\bEy>3\u0013YG#>";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u001dOw&5\b[8-?\u0012Rj+.\u0019S8xjL\u0017h8?\\\\}3)";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u001dOw&5\b[8#4\u000fRj>?\u0018\u0017k#=\u0012R|j*\u000eRs/#";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u000f^\u007f$?\u0018hh8?\u0017Ra9";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "?e]\u000b\u000e9\u0017L\u000b\u00180r8'?\u000fDy-?#Uy9?#\\}3zThq.z5yL\u000f\u001d9e8\u001a\b5zY\u0018\u0003\\|]\u0013z=bL\u0005\u00132tJ\u000f\u00179yLfz\u0011D\u007f\u00151\u0019NG8?\u0011Xl/\u0005\u0016^|j\u000e9oLj\u00143c8\u0004\u000f0{4j7\u000fPG!?\u0005h~85\u0011hu/z>xW\u0006\u001f=y8\u0004\u0015(\u0017V\u001f\u00160\u001b8')\u001bhs/##^|j\u000e9oLj\u00143c8\u0004\u000f0{4j6\u001dDl\u0015;\u0010^{/\u0005\u001eVk/\u0005\u0017Raj\u00180xZj\u00143c8\u0004\u000f0{4j.\u0015Z}9.\u001dZhj\u00132c]\r\u001f.\u001e";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u001fE}+.\u0015Y\u007fj;\u0004Xt%.\u0010\u0017|+.\u001dUy9?\\A}8)\u0015Xvjl";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\fE}!?\u0005hq.";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u001dOw&5\b[8#4\u000fRj>?\u0018\u0017q.?\u0012Cq>#\\\\}3z\fVq8";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\b^u/)\bVu:";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u000eR{%(\u0018";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u000eR{#*\u0015Rv>\u0005\u0015S";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "?e]\u000b\u000e9\u0017L\u000b\u00180r893\u001bY}.\u0005\fE}!?\u0005D8b\u0005\u0015S8\u0003\u0014(r_\u000f\b\\gJ\u0003\u0017=eAj\u00119n8\u000b\u000f(xQ\u0004\u0019.rU\u000f\u0014(\u001b8:(\u0019\\}3\u0005\u0015S8\u0003\u0014(r_\u000f\b\\bV\u0003\u000b)r4j.\u0015Z}9.\u001dZhj\u00132c]\r\u001f.\u001b88?\u001fXj.z>{W\bs";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\u001fE}+.\u0019S8+\"\u0013[w>6\\Sy>;\u001eVk/z\nRj93\u0013Y8|";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "?e]\u000b\u000e9\u0017M\u0004\u0013-b]j\u00132s]\u0012z\u000fRv.?\u000ehs/#\u000fhq.\"\\xVj)\u0019Y|/(#\\}3)\\\u001f\u007f85\tGG#>P\u0017k/4\u0018Rj\u00153\u0018\u001e";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "\b^u/)\bVu:";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "?e]\u000b\u000e9\u0017L\u000b\u00180r89?\u0012S}8\u0005\u0017Ra9zThq.z5yL\u000f\u001d9e8\u001a\b5zY\u0018\u0003\\|]\u0013z=bL\u0005\u00132tJ\u000f\u00179yLfz\u001bEw?*#^|j\u000e9oLj\u00143c8\u0004\u000f0{4j)\u0019Y|/(#^|j\u00132c]\r\u001f.\u0017V\u0005\u000e\\yM\u0006\u0016P\u0017j/9\u0013E|j\u00180xZj\u00143c8\u0004\u000f0{1";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    s = "?e]\u000b\u000e9\u0017M\u0004\u0013-b]j\u00132s]\u0012z\u0011Rk9;\u001bRG(;\u000fRG!?\u0005hq.\"\\xVj7\u0019Dk+=\u0019hz+)\u0019hs/#\\\u001fu9=#\\}3\u0005\u000eRu%.\u0019hr#>P\u0017u9=#\\}3\u0005\u001aEw'\u0005\u0011R4j7\u000fPG!?\u0005hq.s";
                    n = 23;
                    n2 = 24;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    array = z2;
                    s = "?e]\u000b\u000e9\u0017L\u000b\u00180r8#>\u0019Yl#.\u0015Rkjr#^|j\u00132c]\r\u001f.\u0017H\u0018\u00131vJ\u0013z7rAj\u001b)cW\u0003\u0014?e]\u0007\u001f2c4j(\u0019Tq:3\u0019Yl\u00153\u0018\u0017Q\u0004\u000e9p]\u0018z)yQ\u001b\u000f9\u001b88?\u001b^k>(\u001dCq%4#^|j\u00132c]\r\u001f.\u001b8:/\u001e[q)\u0005\u0017Raj\u00180xZfz\fEq<;\bRG!?\u0005\u0017Z\u0006\u0015>\u001b8$?\u0004CG:(\u0019\\}3\u0005\u0015S8\u0003\u0014(r_\u000f\bP\u0017l#7\u0019Dl+7\f\u0017Q\u0004\u000e9p]\u0018s";
                    n = 24;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\u0012R`>\u0005\fE}!?\u0005hq.";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "?e]\u000b\u000e9\u0017L\u000b\u00180r89?\u0012S}8\u0005\u0017Ra9zThq.z5yL\u000f\u001d9e8\u001a\b5zY\u0018\u0003\\|]\u0013z=bL\u0005\u00132tJ\u000f\u00179yLfz\u001bEw?*#^|j\u000e9oLj\u00143c8\u0004\u000f0{4j)\u0019Y|/(#^|j\u00132c]\r\u001f.\u0017V\u0005\u000e\\yM\u0006\u0016P\u0017j/9\u0013E|j\u00180xZj\u00143c8\u0004\u000f0{1";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "?e]\u000b\u000e9\u0017M\u0004\u0013-b]j\u00132s]\u0012z\u000fRv.?\u000ehs/#\u000fhq.\"\\xVj)\u0019Y|/(#\\}3)\\\u001f\u007f85\tGG#>P\u0017k/4\u0018Rj\u00153\u0018\u001e";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "8eW\u001az(vZ\u0006\u001f\\~^j\u001f$~K\u001e\t\\D}$>\u0019EG!?\u0005D";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "\u0012R`>\u0005\fE}!?\u0005hq.";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "\u000fRv>\u0005\bXG9?\u000eA}8";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "\u000eR{%(\u0018";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "\u0015S}$.\u0015Cq/)";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "\u0012R`>\u0005\fE}!?\u0005hq.";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "\u000eR{#*\u0015Rv>\u0005\u0015S8wzC";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "\fE}!?\u0005D";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "\u001dOw&5\b[8-?\u0012Rj+.\u0019S8xjL\u0017v/-\\Gj/1\u0019Nkj;\u0012S88?\u001fXj.?\u0018\u0017l\"?\u0011\u0017q$z\b_}j>\u001e";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "\fE}!?\u0005hq.";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "1^k93\u0012P8/4\bEaj<\u0013E89?\u0010Q8#4\\^|/4\b^l#?\u000f\u0017l+8\u0010R";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "\u001dOw&5\b[8-?\u0012Rj+.\u0015Y\u007fj*\u000eRs/#\\Uy>9\u0014\u0017k>;\u000eCq$=\\Qj%7\\";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "\u000eR{#*\u0015Rv>\u0005\u0015S8wzC";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "\u001dOw&5\b[8-?\u0012Rj+.\u0015Y\u007fjhL\u00078$?\u000b\u0017h8?\u0017Ra9z\u001dY|j(\u0019Tw8>\u0019S8>2\u0019Z8#4\\Cp/z\u0018U";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "\u0015S}$.\u0015Cq/)";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = ")Ys$5\u000bY8?*\u001bEy.?\\S}9.\u0015Yy>3\u0013Y8<?\u000eDq%4F\u0017";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "\\\u001a&j";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = ")Ys$5\u000bY8?*\u001bEy.?\\Qj%7\\";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "\\Cwj";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "\u001dOw&5\b[8?*\u001bEy.?\u0018\u0017k?9\u001fRk9<\t[t3";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "\u001dOw&5\b[8?*\u001bEy.3\u0012P8.8\\Qj%7\\";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "\\Cwj";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "?e]\u000b\u000e9\u0017M\u0004\u0013-b]j\u00132s]\u0012z5q8\u0004\u0015(\u0017]\u0012\u0013/cKj)\u0019Y|/(#\\}3)#^|2z3y89?\u0012S}8\u0005\u0017Ra9zTPj%/\fhq.v\\D}$>\u0019EG#>U";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "?e]\u000b\u000e9\u0017M\u0004\u0013-b]j\u00132s]\u0012z\u0011Rk9;\u001bRG(;\u000fRG!?\u0005hq.\"\\xVj7\u0019Dk+=\u0019hz+)\u0019hs/#\\\u001fu9=#\\}3\u0005\u000eRu%.\u0019hr#>P\u0017u9=#\\}3\u0005\u001aEw'\u0005\u0011R4j7\u000fPG!?\u0005hq.s";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "?e]\u000b\u000e9\u0017L\u000b\u00180r8'?\u000fDy-?#Uy9?#\\}3zThq.z5yL\u000f\u001d9e8\u001a\b5zY\u0018\u0003\\|]\u0013z=bL\u0005\u00132tJ\u000f\u00179yLfz\u0011D\u007f\u00151\u0019NG8?\u0011Xl/\u0005\u0016^|j\u000e9oLj\u00143c8\u0004\u000f0{4j7\u000fPG!?\u0005h~85\u0011hu/z>xW\u0006\u001f=y8\u0004\u0015(\u0017V\u001f\u00160\u001b8')\u001bhs/##^|j\u000e9oLj\u00143c8\u0004\u000f0{4j6\u001dDl\u0015;\u0010^{/\u0005\u001eVk/\u0005\u0017Raj\u00180xZj\u00143c8\u0004\u000f0{4j.\u0015Z}9.\u001dZhj\u00132c]\r\u001f.\u001e";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "\u001dOw&5\b[6.8";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    break Label_1407;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public rt(final Context context) {
        super(context, rt.z[54], (SQLiteDatabase$CursorFactory)null, 6);
        if (Build$VERSION.SDK_INT < 16) {
            return;
        }
        try {
            if (!b9.a()) {
                this.setWriteAheadLoggingEnabled(true);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
    
    private void a(final SQLiteDatabase sqLiteDatabase, final long n) {
        sqLiteDatabase.execSQL(rt.z[1]);
        final ContentValues contentValues = new ContentValues();
        contentValues.put(rt.z[2], n);
        sqLiteDatabase.update(rt.z[0], contentValues, (String)null, (String[])null);
    }
    
    private void b(final SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(rt.z[29]);
        sqLiteDatabase.execSQL(rt.z[27]);
        sqLiteDatabase.execSQL(rt.z[28]);
    }
    
    private void c(final SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(rt.z[53]);
        sqLiteDatabase.execSQL(rt.z[52]);
    }
    
    private void d(final SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(rt.z[51]);
    }
    
    public void a(final SQLiteDatabase sqLiteDatabase) {
        final int c = ha.c;
        sqLiteDatabase.beginTransaction();
        Cursor query;
        try {
            query = sqLiteDatabase.query(rt.z[43], new String[] { rt.z[30] }, rt.z[41], new String[] { String.valueOf(-1) }, (String)null, (String)null, (String)null);
            try {
                if (!query.moveToNext()) {
                    query.close();
                    throw new SQLiteException(rt.z[39]);
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
        finally {
            sqLiteDatabase.endTransaction();
        }
        final int int1 = query.getInt(0);
        Log.i(rt.z[40] + int1);
        query.close();
        final ContentValues contentValues = new ContentValues();
        contentValues.put(rt.z[34], 1 + (int1 + 200) % (-1 + aS.a));
        sqLiteDatabase.update(rt.z[33], contentValues, rt.z[35], new String[] { String.valueOf(-1) });
        sqLiteDatabase.setTransactionSuccessful();
        sqLiteDatabase.endTransaction();
        Log.i(rt.z[42]);
        final List a = a6.a(int1, 200);
        final ContentValues contentValues2 = new ContentValues();
        for (final z z : a) {
            contentValues2.clear();
            contentValues2.put(rt.z[38], z.b());
            contentValues2.put(rt.z[32], z.c());
            contentValues2.put(rt.z[31], false);
            sqLiteDatabase.insertOrThrow(rt.z[36], (String)null, contentValues2);
            if (c != 0) {
                break;
            }
        }
        try {
            Log.i(rt.z[37]);
            if (DialogToastActivity.h) {
                ha.c = c + 1;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
    }
    
    public void onCreate(final SQLiteDatabase p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/ha.c:I
        //     3: istore_2       
        //     4: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //     7: bipush          13
        //     9: aaload         
        //    10: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    13: aload_1        
        //    14: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //    17: bipush          25
        //    19: aaload         
        //    20: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //    23: aload_1        
        //    24: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //    27: bipush          6
        //    29: aaload         
        //    30: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //    33: aload_1        
        //    34: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //    37: bipush          7
        //    39: aaload         
        //    40: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //    43: aload_1        
        //    44: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //    47: bipush          19
        //    49: aaload         
        //    50: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //    53: aload_1        
        //    54: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //    57: bipush          12
        //    59: aaload         
        //    60: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //    63: aload_1        
        //    64: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //    67: bipush          24
        //    69: aaload         
        //    70: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //    73: aload_1        
        //    74: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //    77: bipush          23
        //    79: aaload         
        //    80: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //    83: aload_1        
        //    84: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //    87: bipush          21
        //    89: aaload         
        //    90: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //    93: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //    96: bipush          20
        //    98: aaload         
        //    99: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   102: invokestatic    org/whispersystems/a6.a:()Lorg/whispersystems/aY;
        //   105: astore_3       
        //   106: new             Landroid/content/ContentValues;
        //   109: dup            
        //   110: invokespecial   android/content/ContentValues.<init>:()V
        //   113: astore          4
        //   115: invokestatic    java/lang/System.currentTimeMillis:()J
        //   118: ldc2_w          1000
        //   121: ldiv           
        //   122: lstore          5
        //   124: aload           4
        //   126: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //   129: bipush          18
        //   131: aaload         
        //   132: iconst_m1      
        //   133: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   136: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   139: aload           4
        //   141: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //   144: bipush          8
        //   146: aaload         
        //   147: iconst_1       
        //   148: invokestatic    org/whispersystems/a6.a:(Z)I
        //   151: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   154: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   157: aload           4
        //   159: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //   162: iconst_4       
        //   163: aaload         
        //   164: aload_3        
        //   165: invokevirtual   org/whispersystems/aY.a:()Lorg/whispersystems/o;
        //   168: invokevirtual   org/whispersystems/o.b:()[B
        //   171: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;[B)V
        //   174: aload           4
        //   176: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //   179: iconst_3       
        //   180: aaload         
        //   181: aload_3        
        //   182: invokevirtual   org/whispersystems/aY.b:()Lorg/whispersystems/P;
        //   185: invokeinterface org/whispersystems/P.a:()[B
        //   190: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;[B)V
        //   193: aload           4
        //   195: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //   198: bipush          26
        //   200: aaload         
        //   201: iconst_1       
        //   202: iconst_m1      
        //   203: getstatic       org/whispersystems/aS.a:I
        //   206: iadd           
        //   207: invokestatic    org/whispersystems/a6.a:(I)I
        //   210: iadd           
        //   211: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   214: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   217: aload           4
        //   219: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //   222: bipush          16
        //   224: aaload         
        //   225: lload           5
        //   227: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   230: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //   233: aload_1        
        //   234: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //   237: iconst_5       
        //   238: aaload         
        //   239: aconst_null    
        //   240: aload           4
        //   242: invokevirtual   android/database/sqlite/SQLiteDatabase.insertOrThrow:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //   245: pop2           
        //   246: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //   249: bipush          15
        //   251: aaload         
        //   252: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   255: aload_3        
        //   256: iconst_0       
        //   257: invokestatic    org/whispersystems/a6.a:(Lorg/whispersystems/aY;I)Lorg/whispersystems/x;
        //   260: astore          10
        //   262: new             Landroid/content/ContentValues;
        //   265: dup            
        //   266: invokespecial   android/content/ContentValues.<init>:()V
        //   269: astore          11
        //   271: aload           11
        //   273: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //   276: bipush          14
        //   278: aaload         
        //   279: iconst_0       
        //   280: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   283: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   286: aload           11
        //   288: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //   291: bipush          22
        //   293: aaload         
        //   294: lload           5
        //   296: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   299: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //   302: aload           11
        //   304: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //   307: bipush          17
        //   309: aaload         
        //   310: aload           10
        //   312: invokevirtual   org/whispersystems/x.c:()[B
        //   315: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;[B)V
        //   318: aload_1        
        //   319: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //   322: bipush          11
        //   324: aaload         
        //   325: aconst_null    
        //   326: aload           11
        //   328: invokevirtual   android/database/sqlite/SQLiteDatabase.insertOrThrow:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //   331: pop2           
        //   332: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //   335: bipush          10
        //   337: aaload         
        //   338: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   341: aload_0        
        //   342: aload_1        
        //   343: invokevirtual   com/whatsapp/rt.a:(Landroid/database/sqlite/SQLiteDatabase;)V
        //   346: getstatic       com/whatsapp/rt.z:[Ljava/lang/String;
        //   349: bipush          9
        //   351: aaload         
        //   352: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   355: iload_2        
        //   356: ifeq            377
        //   359: getstatic       com/whatsapp/DialogToastActivity.h:Z
        //   362: istore          16
        //   364: iconst_0       
        //   365: istore          17
        //   367: iload           16
        //   369: ifeq            400
        //   372: iload           17
        //   374: putstatic       com/whatsapp/DialogToastActivity.h:Z
        //   377: return         
        //   378: astore          9
        //   380: new             Ljava/lang/RuntimeException;
        //   383: dup            
        //   384: aload           9
        //   386: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/Throwable;)V
        //   389: athrow         
        //   390: astore          12
        //   392: aload           12
        //   394: athrow         
        //   395: astore          13
        //   397: aload           13
        //   399: athrow         
        //   400: iconst_1       
        //   401: istore          17
        //   403: goto            372
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                   
        //  -----  -----  -----  -----  -----------------------
        //  255    262    378    390    Lorg/whispersystems/aA;
        //  271    355    390    395    Lorg/whispersystems/aA;
        //  359    364    395    400    Lorg/whispersystems/aA;
        //  392    395    395    400    Lorg/whispersystems/aA;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 196, Size: 196
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
    
    public void onOpen(final SQLiteDatabase p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: invokespecial   android/database/sqlite/SQLiteOpenHelper.onOpen:(Landroid/database/sqlite/SQLiteDatabase;)V
        //     5: getstatic       android/os/Build$VERSION.SDK_INT:I
        //     8: istore          5
        //    10: iload           5
        //    12: bipush          11
        //    14: if_icmplt       40
        //    17: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    20: istore          6
        //    22: iload           6
        //    24: bipush          16
        //    26: if_icmpge       40
        //    29: invokestatic    com/whatsapp/util/b9.a:()Z
        //    32: ifne            40
        //    35: aload_1        
        //    36: invokevirtual   android/database/sqlite/SQLiteDatabase.enableWriteAheadLogging:()Z
        //    39: pop            
        //    40: return         
        //    41: astore_2       
        //    42: aload_2        
        //    43: athrow         
        //    44: astore_3       
        //    45: aload_3        
        //    46: athrow         
        //    47: astore          4
        //    49: aload           4
        //    51: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      10     41     44     Ljava/lang/RuntimeException;
        //  17     22     44     47     Ljava/lang/RuntimeException;
        //  29     40     47     52     Ljava/lang/RuntimeException;
        //  42     44     44     47     Ljava/lang/RuntimeException;
        //  45     47     47     52     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 28, Size: 28
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
    
    public void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        try {
            Log.i(rt.z[49] + n + rt.z[47] + n2);
            if (n2 != 6) {
                throw new SQLiteException(rt.z[44] + n + rt.z[45] + n2);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        final long n3 = System.currentTimeMillis() / 1000L;
        while (true) {
        Label_0201_Outer:
            while (true) {
            Label_0206_Outer:
                while (true) {
                    while (true) {
                        switch (n) {
                            case 1: {
                                try {
                                    this.a(sqLiteDatabase, n3);
                                    this.c(sqLiteDatabase);
                                    this.b(sqLiteDatabase);
                                    this.d(sqLiteDatabase);
                                    if (ha.c == 0) {
                                        Log.i(rt.z[48]);
                                        return;
                                    }
                                    break;
                                }
                                catch (RuntimeException ex2) {
                                    throw ex2;
                                }
                                break;
                            }
                            case 2: {
                                continue Label_0201_Outer;
                            }
                            case 3:
                            case 4: {
                                continue Label_0206_Outer;
                            }
                            case 5: {
                                continue;
                            }
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            try {
                throw new SQLiteException(rt.z[46] + n + rt.z[50] + n2);
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
            continue;
        }
    }
}
