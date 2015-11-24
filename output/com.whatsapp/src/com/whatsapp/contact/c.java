// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.contact;

import android.database.sqlite.SQLiteException;
import com.whatsapp.DialogToastActivity;
import android.database.Cursor;
import android.content.ContentValues;
import com.whatsapp.util.Log;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.b9;
import android.os.Build$VERSION;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

class c extends SQLiteOpenHelper
{
    private static final String[] z;
    private final Context a;
    
    static {
        final String[] z2 = new String[52];
        String s = "Jiy\\H";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1332:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '-';
                        break;
                    }
                    case 0: {
                        c2 = '<';
                        break;
                    }
                    case 1: {
                        c2 = '\b';
                        break;
                    }
                    case 2: {
                        c2 = '\u0015';
                        break;
                    }
                    case 3: {
                        c2 = ')';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "Jg|Y";
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    s = "KiJJBR|tJYcktYL^ay@YUmf";
                    n = 1;
                    array = z2;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "_ieHOUd|]T";
                    n = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "IxqHYYlJHY";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "Vaq";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "oMYlnh(\u007f@I\u0010(vHAPiw@AU|l\tknGX\tZ]WvFCHiv]^\u001c_]l\u007fy(vHAPiw@AU|l\tdo([fy\u001cF@ea";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "Qar[LHa{N\r_iyEL^ay@YE(aF\r_ieHOUd|]DY{5]L^dp\tKSz5JBR|tJYO(qHY]jtZH\u001c~p[^Ug{\t\u001a";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    s = "\u0011\u007ftE";
                    n = 7;
                    n2 = 8;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    array = z2;
                    s = "Ug5LU_me]DSf5MXNa{N\rXiaHO]{p\tNSxl";
                    n = 8;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "ZayL\rRga\tKS}{M\rZgg\tI]|tKLOm5JBLq";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u007fg{]L_|f\tI]|tKLOm5@^\u001cm{J_ExaLI\u0012(GL@S~|GJ\u0012&;";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "SfVF_N}e]DSf";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u007fg{]L_|f\tI]|tKLOm5@^\u001ckz[_Ixa\u0007\rzg`GI\u001c~|H\ro|tJFs~p[KPgbl_Ngg\u0007\rnmxF[Ufr\u0007\u0003\u0012";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "ZayL\rU{5LC_zlYYYl";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u007fg{]L_|f\tI]|tKLOm5@^\u001ckz[_Ixa\u0007\rnmxF[Ufr\u0007\u0003\u0012";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "o|tJFs~p[KPgbl_Ngg\tIIz|GJ\u001clw\tDRaa\tNTmvB";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "XmyLYUfr\tNSfaHNH(qHY]jtZH\u0012&;";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "XmyLYYl5JBR|tJY\u001clt]L^ifL\r\u0014zpZXP|(";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\u0011bz\\_Riy";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\u001c|z\t";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    s = "xgbGJNiq@C[(vFCHiv]^\u001clt]L^ifL\rZzzD\rJmgZDSf5";
                    n = 20;
                    n2 = 21;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    array = z2;
                    s = "o|tJFs~p[KPgbl_Ngg\tIIz|GJ\u001clw\tDRaa\tNTmvB";
                    n = 21;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "ZayL\rU{5LC_zlYYYl";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u007fd|LCH(tJYIiyET\u001cgeLCYl5MLHiwH^Y(tZ\rNmtM\u0000SfyP\r]fq\tN]f2]\rIxr[LXm;\t~KaaJEUfr\tYS(b[DHiwEH\u0012&;";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "\u007fg{]L_|f\tI]|tKLOm5@^\u001cm{J_ExaLI\u0012(GL@S~|GJ\u0012&;";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "Ixr[LXm5[H]l8FCPq5MLHiwH^Y";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "SfVF_N}e]DSf";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "\u007fg{]L_|f\tI]|tKLOm5@^\u001ckz[_Ixa\u0007\rzg`GI\u001c~|H\ro|tJFs~p[KPgbl_Ngg\u0007\rnmxF[Ufr\u0007\u0003\u0012";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "\u007fg{]L_|f\tI]|tKLOm5@^\u001ckz[_Ixa\u0007\rnmxF[Ufr\u0007\u0003\u0012";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "Ki;MO";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "Vaq";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "_ieHOUd|]T";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "\u001c|z\t";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "}DAl\u007f\u001c\\Tkay(bHr_g{]L_|f\tlxL5ZY]|`ZrHaxL^HixY\ruFAljyZ";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "xZZy\ruFQlu\u001c\u007ftvNSfaHNHWvH]]j|EDHapZrVaqvDRlpQ";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "Vaq\t\u0010\u001c75hcx(vH]]j|EDHq5\u0014\r\u0003";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "KiJJBR|tJYcktYL^ay@YUmf";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "ixr[LXa{N\r_g{]L_|f\tI]|tKLOm5O_Se5_HN{|FC\u001c";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "}DAl\u007f\u001c\\Tkay(bHr_g{]L_|f\tlxL5JLPdtKDPaaP\rhMM}";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "ifgLNSo{@WYl5FAX(qHY]jtZH\u001c~p[^Ug{";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    s = "KiJJBR|tJYcktYL^ay@YUmf";
                    n = 40;
                    n2 = 41;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    array = z2;
                    s = "\u007fZPhyy(@gdm]P\tdrLPq\rKiJJBR|tJYcktYL^ay@YUmfvGUlJJLLiw@AU|lvDRlpQ\rsF5^LckzGY]kavN]xtKDPaa@HO \u007f@I\u0010ktYL^ay@YE!";
                    n = 41;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "Ki;MO";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "\u007fZPhyy(AhopM5^LckzGY]kavN]xtKDPaa@HO(=vDX(\\gyyOP{\rlZ\\dlnQ5bhe(T|ysA[j\u007fyEPgy\u0010(\u007f@I\u001c\\Pqy\u001cFZ}\rr]Ye\u0001\u001cktYL^ay@YE(Aluh([fy\u001cF@ea\u0010(cHAIm5}hd\\5gbh([|ap$5\\]XiaLIcia\tdr\\Pnhn([fy\u001cF@ea\u0015";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    s = "xZZy\rhIWeh\u001cAS\thdAF}~\u001c\u007ftvNSfaHNHWvH]]j|EDHapZ";
                    n = 44;
                    n2 = 45;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    array = z2;
                    s = "_zpHYUfr\tNSfaHNH(vH]]j|EDHapZ\rHiwEH\u001cnz[\r_g{]L_|f\tI]|tKLOm5_HN{|FC\u001c?";
                    n = 45;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "xZZy\rhIWeh\u001cAS\thdAF}~\u001c\u007ftvNSfaHNH{";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "\u007fZPhyy(AhopM5^LckzGY]kaZ\r\u0014W|M\ruFAljyZ5y\u007fuET{t\u001cCPp\r}]AfdrKGl`yFA\u0005\rVaq\tyyPA\tcs\\5gxpD9\tDOWbALH{tY]c}fL_\u001cJZfayI[\tcs\\5gxpD9\t^Hia\\^\u001c\\Pqy\u0010(f]LH}fvYUepZY]ee\tdr\\Pnhn$5GXQjp[\rhMM}\u0001\u001czt^r_g{]L_|J@I\u001cA[}h{MG\u0005\rXafYA]qJGLQm5}hd\\9\t]Tg{LrHqeL\ruFAljyZ9\t]Tg{LrPiwLA\u001c\\Pqy\u0010(`G^Ym{v@OoJJBIfa\tdr\\Pnhn$5YES|zvYO(\\gyyOP{\u0001\u001c|}\\@^WaZ\ruFAljyZ9\t]TgaFrUlJ]DQmf]LQx5`chMRl\u007f\u0010(r@[YfJGLQm5}hd\\9\tK]e|ETcftDH\u001c\\Pqy\u0010(bHrRixL\rhMM}\u0001\u001c{z[YcftDH\u001c\\Pqy\u0010(vHAPiw@AU|l\tyyPA\u0000";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "\u007fZPhyy(\\giyP5@^c\u007ftvDRlpQ\rsF5^LckzGY]kaZ\u0005U{J^E]|fH]LW`ZHN!.";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "_zpHYUfr\tNSfaHNH{5MLHiwH^Y(cL_OazG\r\u000b";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "\u007fZPhyy(\\giyP5CDXW|GIYp5fc\u001c\u007ftvNSfaHNH{=CDX!.";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    break Label_1332;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public c(final Context a) {
        super(a, c.z[43], (SQLiteDatabase$CursorFactory)null, 7);
        Label_0033: {
            if (Build$VERSION.SDK_INT < 16) {
                break Label_0033;
            }
            try {
                if (!b9.a()) {
                    this.setWriteAheadLoggingEnabled(true);
                }
                this.a = a;
            }
            catch (SQLiteDatabaseCorruptException ex) {
                throw ex;
            }
        }
    }
    
    private File a() {
        final File c = this.c();
        return new File(c.getPath(), c.getName() + com.whatsapp.contact.c.z[19]);
    }
    
    private void a(final SQLiteDatabase sqLiteDatabase) {
        Log.i(c.z[46]);
        sqLiteDatabase.execSQL(c.z[45]);
        sqLiteDatabase.execSQL(c.z[44]);
        this.c(sqLiteDatabase);
    }
    
    private void b(final SQLiteDatabase sqLiteDatabase) {
        final int g = ContactProvider.g;
        Log.i(c.z[7]);
        final Cursor rawQuery = sqLiteDatabase.rawQuery(c.z[6], (String[])null);
        try {
            final long currentTimeMillis = System.currentTimeMillis();
            final ContentValues contentValues = new ContentValues();
            contentValues.put(c.z[3], c.z[1]);
            contentValues.put(c.z[4], currentTimeMillis);
            while (rawQuery.moveToNext()) {
                final String string = rawQuery.getString(0);
                final String string2 = rawQuery.getString(1);
                contentValues.put(c.z[5], string);
                contentValues.put(c.z[0], string2);
                sqLiteDatabase.insert(c.z[2], (String)null, contentValues);
                if (g != 0) {
                    break;
                }
            }
        }
        finally {
            rawQuery.close();
        }
    }
    
    private File c() {
        return this.a.getDatabasePath(c.z[30]);
    }
    
    private void c(final SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(c.z[42]);
    }
    
    private File d() {
        final File c = this.c();
        return new File(c.getPath(), c.getName() + com.whatsapp.contact.c.z[8]);
    }
    
    void a(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_2       
        //     2: aload_0        
        //     3: monitorenter   
        //     4: aload_0        
        //     5: invokevirtual   com/whatsapp/contact/c.close:()V
        //     8: new             Ljava/io/FileInputStream;
        //    11: dup            
        //    12: aload_0        
        //    13: invokespecial   com/whatsapp/contact/c.c:()Ljava/io/File;
        //    16: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    19: invokevirtual   java/io/FileInputStream.getChannel:()Ljava/nio/channels/FileChannel;
        //    22: astore          20
        //    24: aload           20
        //    26: astore          5
        //    28: aload_1        
        //    29: invokevirtual   java/io/File.exists:()Z
        //    32: istore          21
        //    34: aconst_null    
        //    35: astore_2       
        //    36: iload           21
        //    38: ifne            48
        //    41: aload_1        
        //    42: invokevirtual   java/io/File.createNewFile:()Z
        //    45: invokestatic    com/whatsapp/util/Log.b:(Z)V
        //    48: new             Ljava/io/FileOutputStream;
        //    51: dup            
        //    52: aload_1        
        //    53: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    56: invokevirtual   java/io/FileOutputStream.getChannel:()Ljava/nio/channels/FileChannel;
        //    59: astore          22
        //    61: aload           22
        //    63: aload           5
        //    65: lconst_0       
        //    66: aload           5
        //    68: invokevirtual   java/nio/channels/FileChannel.size:()J
        //    71: invokevirtual   java/nio/channels/FileChannel.transferFrom:(Ljava/nio/channels/ReadableByteChannel;JJ)J
        //    74: pop2           
        //    75: aload           5
        //    77: ifnull          85
        //    80: aload           5
        //    82: invokevirtual   java/nio/channels/FileChannel.close:()V
        //    85: aload           22
        //    87: ifnull          95
        //    90: aload           22
        //    92: invokevirtual   java/nio/channels/FileChannel.close:()V
        //    95: aload_0        
        //    96: monitorexit    
        //    97: return         
        //    98: astore          29
        //   100: aload           29
        //   102: athrow         
        //   103: astore_3       
        //   104: aload_0        
        //   105: monitorexit    
        //   106: aload_3        
        //   107: athrow         
        //   108: astore          14
        //   110: aconst_null    
        //   111: astore          15
        //   113: getstatic       com/whatsapp/contact/c.z:[Ljava/lang/String;
        //   116: bipush          10
        //   118: aaload         
        //   119: aload           14
        //   121: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   124: aload_2        
        //   125: ifnull          132
        //   128: aload_2        
        //   129: invokevirtual   java/nio/channels/FileChannel.close:()V
        //   132: aload           15
        //   134: ifnull          95
        //   137: aload           15
        //   139: invokevirtual   java/nio/channels/FileChannel.close:()V
        //   142: goto            95
        //   145: astore          18
        //   147: goto            95
        //   150: astore          17
        //   152: aload           17
        //   154: athrow         
        //   155: astore          10
        //   157: aconst_null    
        //   158: astore          5
        //   160: getstatic       com/whatsapp/contact/c.z:[Ljava/lang/String;
        //   163: bipush          9
        //   165: aaload         
        //   166: aload           10
        //   168: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   171: aload           5
        //   173: ifnull          181
        //   176: aload           5
        //   178: invokevirtual   java/nio/channels/FileChannel.close:()V
        //   181: aload_2        
        //   182: ifnull          95
        //   185: aload_2        
        //   186: invokevirtual   java/nio/channels/FileChannel.close:()V
        //   189: goto            95
        //   192: astore          12
        //   194: goto            95
        //   197: astore          11
        //   199: aload           11
        //   201: athrow         
        //   202: astore          4
        //   204: aconst_null    
        //   205: astore          5
        //   207: aload           5
        //   209: ifnull          217
        //   212: aload           5
        //   214: invokevirtual   java/nio/channels/FileChannel.close:()V
        //   217: aload_2        
        //   218: ifnull          225
        //   221: aload_2        
        //   222: invokevirtual   java/nio/channels/FileChannel.close:()V
        //   225: aload           4
        //   227: athrow         
        //   228: astore          9
        //   230: aload           9
        //   232: athrow         
        //   233: astore          7
        //   235: aload           7
        //   237: athrow         
        //   238: astore          30
        //   240: goto            85
        //   243: astore          28
        //   245: goto            95
        //   248: astore          19
        //   250: goto            132
        //   253: astore          13
        //   255: goto            181
        //   258: astore          8
        //   260: goto            217
        //   263: astore          6
        //   265: goto            225
        //   268: astore          4
        //   270: goto            207
        //   273: astore          25
        //   275: aload           22
        //   277: astore_2       
        //   278: aload           25
        //   280: astore          4
        //   282: goto            207
        //   285: astore          4
        //   287: aload           15
        //   289: astore          16
        //   291: aload_2        
        //   292: astore          5
        //   294: aload           16
        //   296: astore_2       
        //   297: goto            207
        //   300: astore          10
        //   302: aconst_null    
        //   303: astore_2       
        //   304: goto            160
        //   307: astore          24
        //   309: aload           22
        //   311: astore_2       
        //   312: aload           24
        //   314: astore          10
        //   316: goto            160
        //   319: astore          14
        //   321: aload           5
        //   323: astore_2       
        //   324: aconst_null    
        //   325: astore          15
        //   327: goto            113
        //   330: astore          23
        //   332: aload           5
        //   334: astore_2       
        //   335: aload           22
        //   337: astore          15
        //   339: aload           23
        //   341: astore          14
        //   343: goto            113
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                    
        //  -----  -----  -----  -----  --------------------------------------------------------
        //  4      8      103    108    Any
        //  8      24     108    113    Ljava/io/FileNotFoundException;
        //  8      24     155    160    Ljava/io/IOException;
        //  8      24     202    207    Any
        //  28     34     319    330    Ljava/io/FileNotFoundException;
        //  28     34     300    307    Ljava/io/IOException;
        //  28     34     268    273    Any
        //  41     48     319    330    Ljava/io/FileNotFoundException;
        //  41     48     300    307    Ljava/io/IOException;
        //  41     48     268    273    Any
        //  48     61     319    330    Ljava/io/FileNotFoundException;
        //  48     61     300    307    Ljava/io/IOException;
        //  48     61     268    273    Any
        //  61     75     330    346    Ljava/io/FileNotFoundException;
        //  61     75     307    319    Ljava/io/IOException;
        //  61     75     273    285    Any
        //  80     85     238    243    Ljava/io/IOException;
        //  80     85     103    108    Any
        //  90     95     243    248    Ljava/io/IOException;
        //  90     95     98     103    Landroid/database/sqlite/SQLiteDatabaseCorruptException;
        //  90     95     103    108    Any
        //  95     97     103    108    Any
        //  100    103    103    108    Any
        //  104    106    103    108    Any
        //  113    124    285    300    Any
        //  128    132    248    253    Ljava/io/IOException;
        //  128    132    103    108    Any
        //  137    142    145    150    Ljava/io/IOException;
        //  137    142    150    155    Landroid/database/sqlite/SQLiteDatabaseCorruptException;
        //  137    142    103    108    Any
        //  152    155    103    108    Any
        //  160    171    268    273    Any
        //  176    181    253    258    Ljava/io/IOException;
        //  176    181    103    108    Any
        //  185    189    192    197    Ljava/io/IOException;
        //  185    189    197    202    Landroid/database/sqlite/SQLiteDatabaseCorruptException;
        //  185    189    103    108    Any
        //  199    202    103    108    Any
        //  212    217    258    263    Ljava/io/IOException;
        //  212    217    228    233    Landroid/database/sqlite/SQLiteDatabaseCorruptException;
        //  212    217    103    108    Any
        //  221    225    263    268    Ljava/io/IOException;
        //  221    225    233    238    Landroid/database/sqlite/SQLiteDatabaseCorruptException;
        //  221    225    103    108    Any
        //  225    228    103    108    Any
        //  230    233    103    108    Any
        //  235    238    103    108    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 172, Size: 172
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
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
    
    boolean b() {
        final int g = ContactProvider.g;
        synchronized (this) {
            this.close();
            Log.i(c.z[17]);
            final boolean delete = this.c().delete();
            this.a().delete();
            this.d().delete();
            Log.i(c.z[18] + delete + ')');
            // monitorexit(this)
            if (g == 0) {
                return delete;
            }
            while (true) {
                while (true) {
                    try {
                        if (DialogToastActivity.h) {
                            final boolean h = false;
                            DialogToastActivity.h = h;
                            return delete;
                        }
                    }
                    catch (SQLiteDatabaseCorruptException ex) {
                        throw ex;
                    }
                    final boolean h = true;
                    continue;
                }
            }
        }
    }
    
    public SQLiteDatabase getReadableDatabase() {
        final int g = ContactProvider.g;
        try {
            return super.getReadableDatabase();
        }
        catch (SQLiteDatabaseCorruptException ex5) {
            Log.w(c.z[29]);
            this.b();
            return super.getReadableDatabase();
        }
        catch (SQLiteException ex) {
            final String string = ex.toString();
            try {
                if (string.contains(c.z[23])) {
                    Log.w(c.z[25]);
                    this.b();
                    return super.getReadableDatabase();
                }
            }
            catch (SQLiteDatabaseCorruptException ex2) {
                throw ex2;
            }
            try {
                if (string.contains(c.z[26])) {
                    Log.w(c.z[24]);
                    return this.getWritableDatabase();
                }
            }
            catch (SQLiteDatabaseCorruptException ex3) {
                throw ex3;
            }
            throw ex;
        }
        catch (StackOverflowError stackOverflowError) {
            Log.w(c.z[22]);
            final StackTraceElement[] stackTrace = stackOverflowError.getStackTrace();
            final int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                final StackTraceElement stackTraceElement = stackTrace[i];
                try {
                    if (stackTraceElement.getMethodName().equals(c.z[27])) {
                        Log.w(c.z[28]);
                        this.b();
                        return super.getReadableDatabase();
                    }
                }
                catch (SQLiteDatabaseCorruptException ex4) {
                    throw ex4;
                }
                ++i;
                if (g != 0) {
                    break;
                }
            }
            throw stackOverflowError;
        }
    }
    
    public SQLiteDatabase getWritableDatabase() {
        final int g = ContactProvider.g;
        try {
            return super.getWritableDatabase();
        }
        catch (SQLiteDatabaseCorruptException ex4) {
            Log.w(c.z[15]);
            this.b();
            return super.getWritableDatabase();
        }
        catch (SQLiteException ex) {
            try {
                if (ex.toString().contains(c.z[14])) {
                    Log.w(c.z[11]);
                    this.b();
                    return super.getWritableDatabase();
                }
            }
            catch (SQLiteDatabaseCorruptException ex2) {
                throw ex2;
            }
            throw ex;
        }
        catch (StackOverflowError stackOverflowError) {
            Log.w(c.z[16]);
            final StackTraceElement[] stackTrace = stackOverflowError.getStackTrace();
            final int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                final StackTraceElement stackTraceElement = stackTrace[i];
                try {
                    if (stackTraceElement.getMethodName().equals(c.z[12])) {
                        Log.w(c.z[13]);
                        this.b();
                        return super.getWritableDatabase();
                    }
                }
                catch (SQLiteDatabaseCorruptException ex3) {
                    throw ex3;
                }
                ++i;
                if (g != 0) {
                    break;
                }
            }
            throw stackOverflowError;
        }
    }
    
    public void onCreate(final SQLiteDatabase sqLiteDatabase) {
        Log.i(c.z[50]);
        sqLiteDatabase.execSQL(c.z[47]);
        sqLiteDatabase.execSQL(c.z[48]);
        sqLiteDatabase.execSQL(c.z[49]);
        sqLiteDatabase.execSQL(c.z[51]);
        this.a(sqLiteDatabase);
    }
    
    public void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        Log.w(c.z[21] + n + c.z[20] + n2);
        this.onCreate(sqLiteDatabase);
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
        //  -----  -----  -----  -----  --------------------------------------------------------
        //  0      10     41     44     Landroid/database/sqlite/SQLiteDatabaseCorruptException;
        //  17     22     44     47     Landroid/database/sqlite/SQLiteDatabaseCorruptException;
        //  29     40     47     52     Landroid/database/sqlite/SQLiteDatabaseCorruptException;
        //  42     44     44     47     Landroid/database/sqlite/SQLiteDatabaseCorruptException;
        //  45     47     47     52     Landroid/database/sqlite/SQLiteDatabaseCorruptException;
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
    
    public void onUpgrade(final SQLiteDatabase p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/contact/ContactProvider.g:I
        //     3: istore          4
        //     5: new             Ljava/lang/StringBuilder;
        //     8: dup            
        //     9: invokespecial   java/lang/StringBuilder.<init>:()V
        //    12: getstatic       com/whatsapp/contact/c.z:[Ljava/lang/String;
        //    15: bipush          38
        //    17: aaload         
        //    18: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    21: iload_2        
        //    22: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    25: getstatic       com/whatsapp/contact/c.z:[Ljava/lang/String;
        //    28: bipush          33
        //    30: aaload         
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    34: iload_3        
        //    35: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    38: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    41: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    44: iload_2        
        //    45: tableswitch {
        //                6: 91
        //                7: 101
        //                8: 111
        //                9: 126
        //          default: 76
        //        }
        //    76: getstatic       com/whatsapp/contact/c.z:[Ljava/lang/String;
        //    79: bipush          40
        //    81: aaload         
        //    82: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    85: aload_0        
        //    86: aload_1        
        //    87: invokevirtual   com/whatsapp/contact/c.onCreate:(Landroid/database/sqlite/SQLiteDatabase;)V
        //    90: return         
        //    91: aload_1        
        //    92: getstatic       com/whatsapp/contact/c.z:[Ljava/lang/String;
        //    95: bipush          34
        //    97: aaload         
        //    98: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //   101: aload_1        
        //   102: getstatic       com/whatsapp/contact/c.z:[Ljava/lang/String;
        //   105: bipush          39
        //   107: aaload         
        //   108: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //   111: aload_0        
        //   112: aload_1        
        //   113: invokespecial   com/whatsapp/contact/c.a:(Landroid/database/sqlite/SQLiteDatabase;)V
        //   116: aload_0        
        //   117: aload_1        
        //   118: invokespecial   com/whatsapp/contact/c.b:(Landroid/database/sqlite/SQLiteDatabase;)V
        //   121: iload           4
        //   123: ifeq            90
        //   126: aload_1        
        //   127: getstatic       com/whatsapp/contact/c.z:[Ljava/lang/String;
        //   130: bipush          35
        //   132: aaload         
        //   133: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;)V
        //   136: new             Ljava/util/HashSet;
        //   139: dup            
        //   140: invokespecial   java/util/HashSet.<init>:()V
        //   143: astore          6
        //   145: getstatic       com/whatsapp/contact/c.z:[Ljava/lang/String;
        //   148: bipush          41
        //   150: aaload         
        //   151: astore          7
        //   153: iconst_2       
        //   154: anewarray       Ljava/lang/String;
        //   157: astore          8
        //   159: aload           8
        //   161: iconst_0       
        //   162: getstatic       com/whatsapp/contact/c.z:[Ljava/lang/String;
        //   165: bipush          31
        //   167: aaload         
        //   168: aastore        
        //   169: aload           8
        //   171: iconst_1       
        //   172: getstatic       com/whatsapp/contact/c.z:[Ljava/lang/String;
        //   175: bipush          32
        //   177: aaload         
        //   178: aastore        
        //   179: aload_1        
        //   180: aload           7
        //   182: aload           8
        //   184: aconst_null    
        //   185: aconst_null    
        //   186: aconst_null    
        //   187: aconst_null    
        //   188: aconst_null    
        //   189: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   192: astore          9
        //   194: aload           9
        //   196: invokeinterface android/database/Cursor.moveToNext:()Z
        //   201: ifeq            285
        //   204: aload           9
        //   206: iconst_0       
        //   207: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   212: astore          12
        //   214: aload           9
        //   216: iconst_1       
        //   217: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   222: astore          13
        //   224: aload           6
        //   226: new             Landroid/util/Pair;
        //   229: dup            
        //   230: aload           12
        //   232: aload           13
        //   234: invokespecial   android/util/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   237: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   242: istore          14
        //   244: iload           14
        //   246: ifne            280
        //   249: aload_1        
        //   250: getstatic       com/whatsapp/contact/c.z:[Ljava/lang/String;
        //   253: bipush          37
        //   255: aaload         
        //   256: getstatic       com/whatsapp/contact/c.z:[Ljava/lang/String;
        //   259: bipush          36
        //   261: aaload         
        //   262: iconst_2       
        //   263: anewarray       Ljava/lang/String;
        //   266: dup            
        //   267: iconst_0       
        //   268: aload           12
        //   270: aastore        
        //   271: dup            
        //   272: iconst_1       
        //   273: aload           13
        //   275: aastore        
        //   276: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   279: pop            
        //   280: iload           4
        //   282: ifeq            194
        //   285: aload           9
        //   287: invokeinterface android/database/Cursor.close:()V
        //   292: aload_0        
        //   293: aload_1        
        //   294: invokespecial   com/whatsapp/contact/c.c:(Landroid/database/sqlite/SQLiteDatabase;)V
        //   297: iload           4
        //   299: ifeq            90
        //   302: goto            76
        //   305: astore          5
        //   307: aload           5
        //   309: athrow         
        //   310: astore          15
        //   312: aload           15
        //   314: athrow         
        //   315: astore          10
        //   317: aload           9
        //   319: invokeinterface android/database/Cursor.close:()V
        //   324: aload           10
        //   326: athrow         
        //   327: astore          11
        //   329: aload           11
        //   331: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                    
        //  -----  -----  -----  -----  --------------------------------------------------------
        //  5      44     305    310    Landroid/database/sqlite/SQLiteDatabaseCorruptException;
        //  76     90     327    332    Landroid/database/sqlite/SQLiteDatabaseCorruptException;
        //  91     101    305    310    Landroid/database/sqlite/SQLiteDatabaseCorruptException;
        //  194    244    315    327    Any
        //  249    280    310    315    Landroid/database/sqlite/SQLiteDatabaseCorruptException;
        //  249    280    315    327    Any
        //  292    297    327    332    Landroid/database/sqlite/SQLiteDatabaseCorruptException;
        //  312    315    315    327    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0076:
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
