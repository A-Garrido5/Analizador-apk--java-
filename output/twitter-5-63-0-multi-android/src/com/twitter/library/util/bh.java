// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.util.Locale;
import android.telephony.TelephonyManager;
import android.content.Context;
import java.util.HashMap;

public class bh
{
    private static final HashMap a;
    private static String b;
    
    static {
        (a = new HashMap()).put("AF", "93");
        bh.a.put("AL", "355");
        bh.a.put("DZ", "213");
        bh.a.put("AD", "376");
        bh.a.put("AO", "244");
        bh.a.put("AQ", "672");
        bh.a.put("AR", "54");
        bh.a.put("AM", "374");
        bh.a.put("AW", "297");
        bh.a.put("AU", "61");
        bh.a.put("AT", "43");
        bh.a.put("AZ", "994");
        bh.a.put("BH", "973");
        bh.a.put("BD", "880");
        bh.a.put("BY", "375");
        bh.a.put("BE", "32");
        bh.a.put("BZ", "501");
        bh.a.put("BJ", "229");
        bh.a.put("BT", "975");
        bh.a.put("BO", "591");
        bh.a.put("BA", "387");
        bh.a.put("BW", "267");
        bh.a.put("BR", "55");
        bh.a.put("BN", "673");
        bh.a.put("BG", "359");
        bh.a.put("BF", "226");
        bh.a.put("MM", "95");
        bh.a.put("BI", "257");
        bh.a.put("KH", "855");
        bh.a.put("CM", "237");
        bh.a.put("CA", "1");
        bh.a.put("CV", "238");
        bh.a.put("CF", "236");
        bh.a.put("TD", "235");
        bh.a.put("CL", "56");
        bh.a.put("CN", "86");
        bh.a.put("CX", "61");
        bh.a.put("CC", "61");
        bh.a.put("CO", "57");
        bh.a.put("KM", "269");
        bh.a.put("CG", "242");
        bh.a.put("CD", "243");
        bh.a.put("CK", "682");
        bh.a.put("CR", "506");
        bh.a.put("HR", "385");
        bh.a.put("CU", "53");
        bh.a.put("CY", "357");
        bh.a.put("CZ", "420");
        bh.a.put("DK", "45");
        bh.a.put("DJ", "253");
        bh.a.put("TL", "670");
        bh.a.put("EC", "593");
        bh.a.put("EG", "20");
        bh.a.put("SV", "503");
        bh.a.put("GQ", "240");
        bh.a.put("ER", "291");
        bh.a.put("EE", "372");
        bh.a.put("ET", "251");
        bh.a.put("FK", "500");
        bh.a.put("FO", "298");
        bh.a.put("FJ", "679");
        bh.a.put("FI", "358");
        bh.a.put("FR", "33");
        bh.a.put("PF", "689");
        bh.a.put("GA", "241");
        bh.a.put("GM", "220");
        bh.a.put("GE", "995");
        bh.a.put("DE", "49");
        bh.a.put("GH", "233");
        bh.a.put("GI", "350");
        bh.a.put("GR", "30");
        bh.a.put("GL", "299");
        bh.a.put("GT", "502");
        bh.a.put("GN", "224");
        bh.a.put("GW", "245");
        bh.a.put("GY", "592");
        bh.a.put("HT", "509");
        bh.a.put("HN", "504");
        bh.a.put("HK", "852");
        bh.a.put("HU", "36");
        bh.a.put("IN", "91");
        bh.a.put("ID", "62");
        bh.a.put("IR", "98");
        bh.a.put("IQ", "964");
        bh.a.put("IE", "353");
        bh.a.put("IM", "44");
        bh.a.put("IL", "972");
        bh.a.put("IT", "39");
        bh.a.put("CI", "225");
        bh.a.put("JP", "81");
        bh.a.put("JO", "962");
        bh.a.put("KZ", "7");
        bh.a.put("KE", "254");
        bh.a.put("KI", "686");
        bh.a.put("KW", "965");
        bh.a.put("KG", "996");
        bh.a.put("LA", "856");
        bh.a.put("LV", "371");
        bh.a.put("LB", "961");
        bh.a.put("LS", "266");
        bh.a.put("LR", "231");
        bh.a.put("LY", "218");
        bh.a.put("LI", "423");
        bh.a.put("LT", "370");
        bh.a.put("LU", "352");
        bh.a.put("MO", "853");
        bh.a.put("MK", "389");
        bh.a.put("MG", "261");
        bh.a.put("MW", "265");
        bh.a.put("MY", "60");
        bh.a.put("MV", "960");
        bh.a.put("ML", "223");
        bh.a.put("MT", "356");
        bh.a.put("MH", "692");
        bh.a.put("MR", "222");
        bh.a.put("MU", "230");
        bh.a.put("YT", "262");
        bh.a.put("MX", "52");
        bh.a.put("FM", "691");
        bh.a.put("MD", "373");
        bh.a.put("MC", "377");
        bh.a.put("MN", "976");
        bh.a.put("ME", "382");
        bh.a.put("MA", "212");
        bh.a.put("MZ", "258");
        bh.a.put("NA", "264");
        bh.a.put("NR", "674");
        bh.a.put("NP", "977");
        bh.a.put("NL", "31");
        bh.a.put("AN", "599");
        bh.a.put("NC", "687");
        bh.a.put("NZ", "64");
        bh.a.put("NI", "505");
        bh.a.put("NE", "227");
        bh.a.put("NG", "234");
        bh.a.put("NU", "683");
        bh.a.put("KP", "850");
        bh.a.put("NO", "47");
        bh.a.put("OM", "968");
        bh.a.put("PK", "92");
        bh.a.put("PW", "680");
        bh.a.put("PA", "507");
        bh.a.put("PG", "675");
        bh.a.put("PY", "595");
        bh.a.put("PE", "51");
        bh.a.put("PH", "63");
        bh.a.put("PN", "870");
        bh.a.put("PL", "48");
        bh.a.put("PT", "351");
        bh.a.put("PR", "1");
        bh.a.put("QA", "974");
        bh.a.put("RO", "40");
        bh.a.put("RU", "7");
        bh.a.put("RW", "250");
        bh.a.put("BL", "590");
        bh.a.put("WS", "685");
        bh.a.put("SM", "378");
        bh.a.put("ST", "239");
        bh.a.put("SA", "966");
        bh.a.put("SN", "221");
        bh.a.put("RS", "381");
        bh.a.put("SC", "248");
        bh.a.put("SL", "232");
        bh.a.put("SG", "65");
        bh.a.put("SK", "421");
        bh.a.put("SI", "386");
        bh.a.put("SB", "677");
        bh.a.put("SO", "252");
        bh.a.put("ZA", "27");
        bh.a.put("KR", "82");
        bh.a.put("ES", "34");
        bh.a.put("LK", "94");
        bh.a.put("SH", "290");
        bh.a.put("PM", "508");
        bh.a.put("SD", "249");
        bh.a.put("SR", "597");
        bh.a.put("SZ", "268");
        bh.a.put("SE", "46");
        bh.a.put("CH", "41");
        bh.a.put("SY", "963");
        bh.a.put("TW", "886");
        bh.a.put("TJ", "992");
        bh.a.put("TZ", "255");
        bh.a.put("TH", "66");
        bh.a.put("TG", "228");
        bh.a.put("TK", "690");
        bh.a.put("TO", "676");
        bh.a.put("TN", "216");
        bh.a.put("TR", "90");
        bh.a.put("TM", "993");
        bh.a.put("TV", "688");
        bh.a.put("AE", "971");
        bh.a.put("UG", "256");
        bh.a.put("GB", "44");
        bh.a.put("UA", "380");
        bh.a.put("UY", "598");
        bh.a.put("US", "1");
        bh.a.put("UZ", "998");
        bh.a.put("VU", "678");
        bh.a.put("VA", "39");
        bh.a.put("VE", "58");
        bh.a.put("VN", "84");
        bh.a.put("WF", "681");
        bh.a.put("YE", "967");
        bh.a.put("ZM", "260");
        bh.a.put("ZW", "263");
    }
    
    public static String a(final Context context) {
        if (bh.b == null) {
            bh.b = b(context);
        }
        return bh.b;
    }
    
    private static String b(final Context context) {
        try {
            final TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
            final String simCountryIso = telephonyManager.getSimCountryIso();
            if (simCountryIso != null && simCountryIso.length() == 2) {
                return simCountryIso.toLowerCase(Locale.US);
            }
            if (telephonyManager.getPhoneType() != 2) {
                final String networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (networkCountryIso != null && networkCountryIso.length() == 2) {
                    return networkCountryIso.toLowerCase(Locale.US);
                }
            }
        }
        catch (Exception ex) {}
        return null;
    }
}
