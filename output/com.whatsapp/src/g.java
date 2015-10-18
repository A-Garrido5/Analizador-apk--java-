import com.whatsapp.util.Log;
import java.util.List;
import java.util.ArrayList;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.Collection;
import java.util.Arrays;
import java.io.BufferedReader;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.5.30
// 

public class g
{
    private static final String[] A;
    private static final HashSet d;
    static boolean j;
    private static final HashSet m;
    private static final HashSet o;
    static String q;
    private static final HashSet v;
    private int a;
    private long b;
    private long c;
    private long e;
    private boolean f;
    protected HashSet g;
    protected s h;
    private String i;
    private long k;
    protected String l;
    private long n;
    private long p;
    private long r;
    private long s;
    private long t;
    private long u;
    private long w;
    protected final String x;
    protected BufferedReader y;
    private long z;
    
    static {
        final String[] a = new String[151];
        String s = "5\u0013\u001aqP9\u0013\u001e";
        int n = -1;
        String[] array = a;
        int n2 = 0;
        String intern = null;
    Label_3872:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0014';
                        break;
                    }
                    case 0: {
                        c2 = 'p';
                        break;
                    }
                    case 1: {
                        c2 = ']';
                        break;
                    }
                    case 2: {
                        c2 = 'Y';
                        break;
                    }
                    case 3: {
                        c2 = '>';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "%32P{\u00073y[z\u00132=Wz\u0017}{";
                    n2 = 1;
                    array = a;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "(p";
                    n2 = 2;
                    array = a;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "<\u001c\u0017yA1\u001a\u001c";
                    n2 = 3;
                    array = a;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "%32P{\u00073yJm\u00008y\u001c";
                    n2 = 4;
                    array = a;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = a;
                    s = "3\u0015\u0018lG5\t";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "$\u0004\t{";
                    n = 5;
                    array = a;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "(p";
                    n = 6;
                    array = a;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "&\u001c\u0015kQ";
                    n = 7;
                    array = a;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "5\u0013\u001aqP9\u0013\u001e";
                    n = 8;
                    array = a;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "645[4\u00153=[pP9,L}\u001e:yNu\u0002.0PsP\u001f\u0018mQFiy\\}\u001e<+G";
                    n = 9;
                    array = a;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "(p";
                    n = 10;
                    array = a;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = " /6Nq\u0002) \u001ez\u00110<\u001ea\u001e.,Nd\u001f/-[pP? \u001eb3<+Z4Bsh\u00044";
                    n = 11;
                    array = a;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "2\u0018\u001ewZ";
                    n = 12;
                    array = a;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "H\u001f\u0010j";
                    n = 13;
                    array = a;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "$50M4\u0006\u001e8LpP58M4\u001e8*Jq\u0014}/}u\u00029yZu\u0004<yWzP4-\u0010";
                    n = 14;
                    array = a;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "%32P{\u00073y|Q7\u0014\u0017\u001e`\t-<\u00044";
                    n = 15;
                    array = a;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "&\u001e\u0018lP";
                    n = 16;
                    array = a;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "P|d\u001e";
                    n = 17;
                    array = a;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "93/_x\u00199yR}\u001e8y\u001c";
                    n = 18;
                    array = a;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "1\u001a\u001cp@";
                    n = 19;
                    array = a;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "&\u0018\u000bm]?\u0013";
                    n = 20;
                    array = a;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "?\u000f\u001e";
                    n = 21;
                    array = a;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "%32P{\u00073yNf\u001f-<L`\t}7_y\u0015gy\u001c";
                    n = 22;
                    array = a;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "1\u0019\u000b";
                    n = 23;
                    array = a;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "93:Qy\u0000<-Wv\u001c8yHq\u0002.0QzJ}";
                    n = 24;
                    array = a;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\u0019)<S";
                    n = 25;
                    array = a;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "5\u0013\u001d";
                    n = 26;
                    array = a;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "XPSB\u0019\fW%4\u0019Y";
                    n = 27;
                    array = a;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "(p\u0018|U4\u000f";
                    n = 28;
                    array = a;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "\u0004$)[";
                    n = 29;
                    array = a;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "1\u0019\u000b";
                    n = 30;
                    array = a;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "5\u0013\u001d";
                    n = 31;
                    array = a;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "93/_x\u00199yR}\u001e8c\u001e6";
                    n = 32;
                    array = a;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "$$)[4\u00053*Kd\u00002+Jq\u0014};G4\u0006\u001e8LpPow\u000f.P";
                    n = 33;
                    array = a;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "$\u0004\t{";
                    n = 34;
                    array = a;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "(p";
                    n = 35;
                    array = a;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "Bsh";
                    n = 36;
                    array = a;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "}W";
                    n = 37;
                    array = a;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "645[4\u00153=[pP9,L}\u001e:yNu\u0002.0PsP,,Q`\u00159tNf\u00193-_v\u001c8ym`\u000247Y";
                    n = 38;
                    array = a;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "}W";
                    n = 39;
                    array = a;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "!\b\u0016jQ4p\tl]>\t\u0018|X5";
                    n = 40;
                    array = a;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "1\u0019\u000b";
                    n = 41;
                    array = a;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "<\u001c\u0017yA1\u001a\u001c";
                    n = 42;
                    array = a;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "93/_x\u00199yru\u001e:,_s\u0015gy\u001c";
                    n = 43;
                    array = a;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "93/_x\u00199yru\u001e:,_s\u0015gy\u001c";
                    n = 44;
                    array = a;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "93/_x\u00199yru\u001e:,_s\u0015gy\u001c";
                    n = 45;
                    array = a;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "3\u0015\u0018lG5\t";
                    n = 46;
                    array = a;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "G\u001f\u0010j";
                    n = 47;
                    array = a;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "\u0006>8Lp\u0000<+Mq\u0002r6K`]2?\u0013y\u001506LmP";
                    n = 48;
                    array = a;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "!\b\u0016jQ4p\tl]>\t\u0018|X5";
                    n = 49;
                    array = a;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "(p";
                    n = 50;
                    array = a;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "Rs";
                    n = 51;
                    array = a;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "$5<\u001eq\u001e>6Z}\u001e:yKz\u0003()N{\u0002)<Z4\u0012$yHW\u0011/=\u001eg\u00008:\u00044R";
                    n = 52;
                    array = a;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "2\u001c\n{\"D";
                    n = 53;
                    array = a;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "H\u001f\u0010j";
                    n = 54;
                    array = a;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "\"88]|\u00159y[z\u0014}6X4\u0012(?Xq\u0002s";
                    n = 55;
                    array = a;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "\"88]|\u00159y[z\u0014}6X4\u0012(?Xq\u0002s";
                    n = 56;
                    array = a;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "5\u0013\u001d";
                    n = 57;
                    array = a;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "5%)[w\u00048=\u001eQ>\u0019chW1\u000f\u001d\u001ec\u0011.yP{\u0004}?Qa\u001e9w";
                    n = 58;
                    array = a;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "5\u0013\u001d\u0004B3\u001c\u000bz4Q`y\u001c";
                    n = 59;
                    array = a;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    n2 = 61;
                    s = "&\u001e\u0018lP";
                    n = 60;
                    array = a;
                    continue;
                }
                case 60: {
                    array[n2] = intern;
                    n2 = 62;
                    s = "H\u001f\u0010j";
                    n = 61;
                    array = a;
                    continue;
                }
                case 61: {
                    array[n2] = intern;
                    n2 = 63;
                    s = "&\u001e\u0018lP";
                    n = 62;
                    array = a;
                    continue;
                }
                case 62: {
                    array[n2] = intern;
                    n2 = 64;
                    s = "R}:_y\u0015t";
                    n = 63;
                    array = a;
                    continue;
                }
                case 63: {
                    array[n2] = intern;
                    n2 = 65;
                    s = "5%)[w\u00048=\u001eG\u0004/0PsP\u007f\u001b{S9\u0013chW1\u000f\u001d\u001c4\u00144=\u001ez\u001f)y]{\u001d8y\u0016]\u001e.-[u\u0014qy\u001c";
                    n = 64;
                    array = a;
                    continue;
                }
                case 64: {
                    array[n2] = intern;
                    n2 = 66;
                    s = "2\u0018\u001ewZ";
                    n = 65;
                    array = a;
                    continue;
                }
                case 65: {
                    array[n2] = intern;
                    n2 = 67;
                    s = "\"88]|\u00159yI|\u0015/<\u001ey\u0005.-\u001ez\u001f)y\\qP/<_w\u00188=\u0010";
                    n = 66;
                    array = a;
                    continue;
                }
                case 66: {
                    array[n2] = intern;
                    n2 = 68;
                    s = "&\u001c\u0015kQ";
                    n = 67;
                    array = a;
                    continue;
                }
                case 67: {
                    array[n2] = intern;
                    n2 = 69;
                    s = "%32P{\u00073yHu\u001c(<\u001e6";
                    n = 68;
                    array = a;
                    continue;
                }
                case 68: {
                    array[n2] = intern;
                    n2 = 70;
                    s = "(p";
                    n = 69;
                    array = a;
                    continue;
                }
                case 69: {
                    array[n2] = intern;
                    n2 = 71;
                    s = "&\u001e\u0018lP";
                    n = 70;
                    array = a;
                    continue;
                }
                case 70: {
                    array[n2] = intern;
                    n2 = 72;
                    s = "1\u001a\u001cp@P\r+Qd\u0015/-G4\u0019.yP{\u0004}*Kd\u00002+Jq\u0014s";
                    n = 71;
                    array = a;
                    continue;
                }
                case 71: {
                    array[n2] = intern;
                    n2 = 73;
                    s = "4\u0014\u001b";
                    n = 72;
                    array = a;
                    continue;
                }
                case 72: {
                    array[n2] = intern;
                    n2 = 74;
                    s = " \u001c\u001e{F";
                    n = 73;
                    array = a;
                    continue;
                }
                case 73: {
                    array[n2] = intern;
                    n2 = 75;
                    s = "$\u0018\u0015";
                    n = 74;
                    array = a;
                    continue;
                }
                case 74: {
                    array[n2] = intern;
                    n2 = 76;
                    s = "\"\u0012\u0015{";
                    n = 75;
                    array = a;
                    continue;
                }
                case 75: {
                    array[n2] = intern;
                    n2 = 77;
                    s = "<\u001c\u001b{X";
                    n = 76;
                    array = a;
                    continue;
                }
                case 76: {
                    array[n2] = intern;
                    n2 = 78;
                    s = "H\u001f\u0010j";
                    n = 77;
                    array = a;
                    continue;
                }
                case 77: {
                    array[n2] = intern;
                    n2 = 79;
                    s = "=\u001e\u0010sU9\u0011";
                    n = 78;
                    array = a;
                    continue;
                }
                case 78: {
                    array[n2] = intern;
                    n2 = 80;
                    s = "3\u001c\u000b";
                    n = 79;
                    array = a;
                    continue;
                }
                case 79: {
                    array[n2] = intern;
                    n2 = 81;
                    s = " \u0012\njU<";
                    n = 80;
                    array = a;
                    continue;
                }
                case 80: {
                    array[n2] = intern;
                    n2 = 82;
                    s = " \u0019\u001f";
                    n = 81;
                    array = a;
                    continue;
                }
                case 81: {
                    array[n2] = intern;
                    n2 = 83;
                    s = "$\u0014\rrQ";
                    n = 82;
                    array = a;
                    continue;
                }
                case 82: {
                    array[n2] = intern;
                    n2 = 84;
                    s = "2\u001f\n";
                    n = 83;
                    array = a;
                    continue;
                }
                case 83: {
                    array[n2] = intern;
                    n2 = 85;
                    s = "&\u0014\u001d{[";
                    n = 84;
                    array = a;
                    continue;
                }
                case 84: {
                    array[n2] = intern;
                    n2 = 86;
                    s = "8\u0012\u0014{";
                    n = 85;
                    array = a;
                    continue;
                }
                case 85: {
                    array[n2] = intern;
                    n2 = 87;
                    s = "\"\u0018\u000f";
                    n = 86;
                    array = a;
                    continue;
                }
                case 86: {
                    array[n2] = intern;
                    n2 = 88;
                    s = "3\u0012\u0017jQ>\ttwP";
                    n = 87;
                    array = a;
                    continue;
                }
                case 87: {
                    array[n2] = intern;
                    n2 = 89;
                    s = "3\u0014\u001d";
                    n = 88;
                    array = a;
                    continue;
                }
                case 88: {
                    array[n2] = intern;
                    n2 = 90;
                    s = "(ii\u000e";
                    n = 89;
                    array = a;
                    continue;
                }
                case 89: {
                    array[n2] = intern;
                    n2 = 91;
                    s = "=\u000e\u001e";
                    n = 90;
                    array = a;
                    continue;
                }
                case 90: {
                    array[n2] = intern;
                    n2 = 92;
                    s = "$\u0007";
                    n = 91;
                    array = a;
                    continue;
                }
                case 91: {
                    array[n2] = intern;
                    n2 = 93;
                    s = "2\u0019\u0018g";
                    n = 92;
                    array = a;
                    continue;
                }
                case 92: {
                    array[n2] = intern;
                    n2 = 94;
                    s = " \u0014\u001aj";
                    n = 93;
                    array = a;
                    continue;
                }
                case 93: {
                    array[n2] = intern;
                    n2 = 95;
                    s = "'\u001c\u000f{";
                    n = 94;
                    array = a;
                    continue;
                }
                case 94: {
                    array[n2] = intern;
                    n2 = 96;
                    s = "1\u0012\u0015";
                    n = 95;
                    array = a;
                    continue;
                }
                case 95: {
                    array[n2] = intern;
                    n2 = 97;
                    s = "9\u0013\u0015wZ5";
                    n = 96;
                    array = a;
                    continue;
                }
                case 96: {
                    array[n2] = intern;
                    n2 = 98;
                    s = "6\u0013";
                    n = 97;
                    array = a;
                    continue;
                }
                case 97: {
                    array[n2] = intern;
                    n2 = 99;
                    s = "$\u0011\u0001";
                    n = 98;
                    array = a;
                    continue;
                }
                case 98: {
                    array[n2] = intern;
                    n2 = 100;
                    s = "9\u0013\r{F>\u0018\r";
                    n = 99;
                    array = a;
                    continue;
                }
                case 99: {
                    array[n2] = intern;
                    n2 = 101;
                    s = "7\u0014\u001f";
                    n = 100;
                    array = a;
                    continue;
                }
                case 100: {
                    array[n2] = intern;
                    n2 = 102;
                    s = "=\r\u001cy&";
                    n = 101;
                    array = a;
                    continue;
                }
                case 101: {
                    array[n2] = intern;
                    n2 = 103;
                    s = "=\u001c\u0010rQ\"";
                    n = 102;
                    array = a;
                    continue;
                }
                case 102: {
                    array[n2] = intern;
                    n2 = 104;
                    s = "1\u000b\u0010";
                    n = 103;
                    array = a;
                    continue;
                }
                case 103: {
                    array[n2] = intern;
                    n2 = 105;
                    s = ":\r\u001cy";
                    n = 104;
                    array = a;
                    continue;
                }
                case 104: {
                    array[n2] = intern;
                    n2 = 106;
                    s = "9\u0013\rr";
                    n = 105;
                    array = a;
                    continue;
                }
                case 105: {
                    array[n2] = intern;
                    n2 = 107;
                    s = "2\u0010\t";
                    n = 106;
                    array = a;
                    continue;
                }
                case 106: {
                    array[n2] = intern;
                    n2 = 108;
                    s = "=\u0012\u001d{Y";
                    n = 107;
                    array = a;
                    continue;
                }
                case 107: {
                    array[n2] = intern;
                    n2 = 109;
                    s = " \u0012\u000e{F#\u0015\u0018lQ";
                    n = 108;
                    array = a;
                    continue;
                }
                case 108: {
                    array[n2] = intern;
                    n2 = 110;
                    s = "9\u000e\u001dp";
                    n = 109;
                    array = a;
                    continue;
                }
                case 109: {
                    array[n2] = intern;
                    n2 = 111;
                    s = "9\u001f\u0014sU9\u0011";
                    n = 110;
                    array = a;
                    continue;
                }
                case 110: {
                    array[n2] = intern;
                    n2 = 112;
                    s = "2\u001c\n{\"D";
                    n = 111;
                    array = a;
                    continue;
                }
                case 111: {
                    array[n2] = intern;
                    n2 = 113;
                    s = "2\u0018\u001ewZ";
                    n = 112;
                    array = a;
                    continue;
                }
                case 112: {
                    array[n2] = intern;
                    n2 = 114;
                    s = " \u0010\u001b";
                    n = 113;
                    array = a;
                    continue;
                }
                case 113: {
                    array[n2] = intern;
                    n2 = 115;
                    s = " \u001a\t";
                    n = 114;
                    array = a;
                    continue;
                }
                case 114: {
                    array[n2] = intern;
                    n2 = 116;
                    s = "<\u0012\u001eq";
                    n = 115;
                    array = a;
                    continue;
                }
                case 115: {
                    array[n2] = intern;
                    n2 = 117;
                    s = "!\b\u0016jQ4p\tl]>\t\u0018|X5";
                    n = 116;
                    array = a;
                    continue;
                }
                case 116: {
                    array[n2] = intern;
                    n2 = 118;
                    s = "&\u0012\u0010}Q";
                    n = 117;
                    array = a;
                    continue;
                }
                case 117: {
                    array[n2] = intern;
                    n2 = 119;
                    s = "=\r\u001cy";
                    n = 118;
                    array = a;
                    continue;
                }
                case 118: {
                    array[n2] = intern;
                    n2 = 120;
                    s = "!\t\u0010sQ";
                    n = 119;
                    array = a;
                    continue;
                }
                case 119: {
                    array[n2] = intern;
                    n2 = 121;
                    s = "&\u0018\u000bm]?\u0013";
                    n = 120;
                    array = a;
                    continue;
                }
                case 120: {
                    array[n2] = intern;
                    n2 = 122;
                    s = " \u001c\u000b}Q<";
                    n = 121;
                    array = a;
                    continue;
                }
                case 121: {
                    array[n2] = intern;
                    n2 = 123;
                    s = " \u000f\u001cx";
                    n = 122;
                    array = a;
                    continue;
                }
                case 122: {
                    array[n2] = intern;
                    n2 = 124;
                    s = "'\u0010\u001f";
                    n = 123;
                    array = a;
                    continue;
                }
                case 123: {
                    array[n2] = intern;
                    n2 = 125;
                    s = " \u000e";
                    n = 124;
                    array = a;
                    continue;
                }
                case 124: {
                    array[n2] = intern;
                    n2 = 126;
                    s = "3\u0018\u0015r";
                    n = 125;
                    array = a;
                    continue;
                }
                case 125: {
                    array[n2] = intern;
                    n2 = 127;
                    s = " \u0015\u0016j[";
                    n = 126;
                    array = a;
                    continue;
                }
                case 126: {
                    array[n2] = intern;
                    n2 = 128;
                    s = "3\u0014\n";
                    n = 127;
                    array = a;
                    continue;
                }
                case 127: {
                    array[n2] = intern;
                    n2 = 129;
                    s = "5\n\u0016lX4";
                    n = 128;
                    array = a;
                    continue;
                }
                case 128: {
                    array[n2] = intern;
                    n2 = 130;
                    s = "5\u0010\u0018wX";
                    n = 129;
                    array = a;
                    continue;
                }
                case 129: {
                    array[n2] = intern;
                    n2 = 131;
                    s = " \u001e\u0014";
                    n = 130;
                    array = a;
                    continue;
                }
                case 130: {
                    array[n2] = intern;
                    n2 = 132;
                    s = "#\u0012\fpP";
                    n = 131;
                    array = a;
                    continue;
                }
                case 131: {
                    array[n2] = intern;
                    n2 = 133;
                    s = ";\u0018\u0000";
                    n = 132;
                    array = a;
                    continue;
                }
                case 132: {
                    array[n2] = intern;
                    n2 = 134;
                    s = "1\r\trQ<\u0014\u0017u";
                    n = 133;
                    array = a;
                    continue;
                }
                case 133: {
                    array[n2] = intern;
                    n2 = 135;
                    s = "$\u0014\u001fx";
                    n = 134;
                    array = a;
                    continue;
                }
                case 134: {
                    array[n2] = intern;
                    n2 = 136;
                    s = "1\t\rsU9\u0011";
                    n = 135;
                    array = a;
                    continue;
                }
                case 135: {
                    array[n2] = intern;
                    n2 = 137;
                    s = "%\u000f\u0015";
                    n = 136;
                    array = a;
                    continue;
                }
                case 136: {
                    array[n2] = intern;
                    n2 = 138;
                    s = "4\u0012\u0014";
                    n = 137;
                    array = a;
                    continue;
                }
                case 137: {
                    array[n2] = intern;
                    n2 = 139;
                    s = " \u000f\u0016z]7\u0004";
                    n = 138;
                    array = a;
                    continue;
                }
                case 138: {
                    array[n2] = intern;
                    n2 = 140;
                    s = "=\u0018\r";
                    n = 139;
                    array = a;
                    continue;
                }
                case 139: {
                    array[n2] = intern;
                    n2 = 141;
                    s = "%\u000f\u0015";
                    n = 140;
                    array = a;
                    continue;
                }
                case 140: {
                    array[n2] = intern;
                    n2 = 142;
                    s = "3\u001a\u0014";
                    n = 141;
                    array = a;
                    continue;
                }
                case 141: {
                    array[n2] = intern;
                    n2 = 143;
                    s = ">\u0012\r{";
                    n = 142;
                    array = a;
                    continue;
                }
                case 142: {
                    array[n2] = intern;
                    n2 = 144;
                    s = "7\u0018\u0016";
                    n = 143;
                    array = a;
                    continue;
                }
                case 143: {
                    array[n2] = intern;
                    n2 = 145;
                    s = "'\u0012\u000bu";
                    n = 144;
                    array = a;
                    continue;
                }
                case 144: {
                    array[n2] = intern;
                    n2 = 146;
                    s = "6\u001c\u0001";
                    n = 145;
                    array = a;
                    continue;
                }
                case 145: {
                    array[n2] = intern;
                    n2 = 147;
                    s = "%\u0014\u001d";
                    n = 146;
                    array = a;
                    continue;
                }
                case 146: {
                    array[n2] = intern;
                    n2 = 148;
                    s = "1\u0014\u001fx";
                    n = 147;
                    array = a;
                    continue;
                }
                case 147: {
                    array[n2] = intern;
                    n2 = 149;
                    s = "(hi\u0007";
                    n = 148;
                    array = a;
                    continue;
                }
                case 148: {
                    array[n2] = intern;
                    n2 = 150;
                    s = "G\u001f\u0010j";
                    n = 149;
                    array = a;
                    continue;
                }
                case 149: {
                    break Label_3872;
                }
            }
        }
        array[n2] = intern;
        A = a;
        d = new HashSet((Collection<? extends E>)Arrays.asList(g.A[138], g.A[106], g.A[81], g.A[122], g.A[86], g.A[145], g.A[123], g.A[118], g.A[146], g.A[91], g.A[126], g.A[74], g.A[84], g.A[108], g.A[80], g.A[110], g.A[85], g.A[96], g.A[134], g.A[136], g.A[128], g.A[129], g.A[100], g.A[111], g.A[79], g.A[109], g.A[139], g.A[99], g.A[90], g.A[101], g.A[142], g.A[124], g.A[107], g.A[140], g.A[114], g.A[73], g.A[94], g.A[135], g.A[82], g.A[125], g.A[105], g.A[120], g.A[119], g.A[102], g.A[104], g.A[95], g.A[148], g.A[131], g.A[149], g.A[115]));
        m = new HashSet((Collection<? extends E>)Arrays.asList(g.A[97], g.A[137], g.A[88], g.A[89]));
        v = new HashSet((Collection<? extends E>)Arrays.asList(g.A[113], g.A[116], g.A[127], g.A[77], g.A[98], g.A[83], g.A[132], g.A[121], g.A[75], g.A[130], g.A[92], g.A[144], g.A[143], g.A[141], g.A[93], g.A[76], g.A[87], g.A[147], g.A[133], g.A[103]));
        o = new HashSet((Collection<? extends E>)Arrays.asList(g.A[150], g.A[78], g.A[117], g.A[112], "B"));
        g.j = false;
    }
    
    public g() {
        this.h = null;
        this.l = null;
        this.x = g.A[62];
        this.g = new HashSet();
    }
    
    private boolean a(final char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
    
    private boolean b(final boolean b) {
        final boolean b2 = o.b;
        boolean b3 = false;
        Label_0048: {
            if (b && this.a > 0) {
                int i = 0;
                b3 = false;
                while (i < this.a) {
                    if (!this.a(b3)) {
                        return false;
                    }
                    ++i;
                    if (b2) {
                        b3 = true;
                        break;
                    }
                    b3 = true;
                }
                break Label_0048;
            }
            b3 = false;
            break Label_0048;
        }
        if (this.a(b3)) {
            if (this.h != null) {
                final long currentTimeMillis = System.currentTimeMillis();
                this.h.a(g.A[71]);
                this.b += System.currentTimeMillis() - currentTimeMillis;
            }
            final long currentTimeMillis2 = System.currentTimeMillis();
            this.f();
            this.t += System.currentTimeMillis() - currentTimeMillis2;
            this.a(true, false);
            if (this.h != null) {
                final long currentTimeMillis3 = System.currentTimeMillis();
                this.h.c();
                this.u += System.currentTimeMillis() - currentTimeMillis3;
            }
            return true;
        }
        return false;
    }
    
    private String k(final String s) {
        final boolean b = o.b;
        final StringBuilder sb = new StringBuilder();
        int char1 = 64;
        int i = 1 + s.indexOf(".");
        while (i < s.length()) {
            Label_0110: {
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    sb.append(s.charAt(i));
                    char1 = s.charAt(i);
                    if (!b) {
                        break Label_0110;
                    }
                }
                if (s.charAt(i) != '-' || char1 != 88) {
                    break;
                }
                sb.append(s.charAt(i));
            }
            ++i;
            if (b) {
                break;
            }
        }
        return sb.toString();
    }
    
    protected String a() {
        g.q = null;
        g.q = this.c();
        if (g.q == null) {
            throw new a(g.A[56]);
        }
        final int length = g.q.trim().length();
        String q = null;
        if (length > 0) {
            g.j = true;
            q = g.q;
        }
        return q;
    }
    
    protected void a(final String s) {
        if (this.h != null) {
            this.h.c(g.A[47]);
            this.h.e(s);
        }
    }
    
    protected void a(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       o.b:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: getfield        g.l:Ljava/lang/String;
        //     8: getstatic       g.A:[Ljava/lang/String;
        //    11: bipush          50
        //    13: aaload         
        //    14: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //    17: ifeq            86
        //    20: invokestatic    java/lang/System.currentTimeMillis:()J
        //    23: lstore          27
        //    25: aload_0        
        //    26: aload_2        
        //    27: invokevirtual   g.c:(Ljava/lang/String;)Ljava/lang/String;
        //    30: astore          29
        //    32: aload_0        
        //    33: getfield        g.h:Ls;
        //    36: ifnull          67
        //    39: new             Ljava/util/ArrayList;
        //    42: dup            
        //    43: invokespecial   java/util/ArrayList.<init>:()V
        //    46: astore          30
        //    48: aload           30
        //    50: aload           29
        //    52: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    55: pop            
        //    56: aload_0        
        //    57: getfield        g.h:Ls;
        //    60: aload           30
        //    62: invokeinterface s.a:(Ljava/util/List;)V
        //    67: aload_0        
        //    68: aload_0        
        //    69: getfield        g.s:J
        //    72: invokestatic    java/lang/System.currentTimeMillis:()J
        //    75: lload           27
        //    77: lsub           
        //    78: ladd           
        //    79: putfield        g.s:J
        //    82: iload_3        
        //    83: ifeq            355
        //    86: aload_0        
        //    87: getfield        g.l:Ljava/lang/String;
        //    90: getstatic       g.A:[Ljava/lang/String;
        //    93: bipush          54
        //    95: aaload         
        //    96: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //    99: istore          6
        //   101: iload           6
        //   103: ifne            123
        //   106: aload_0        
        //   107: getfield        g.l:Ljava/lang/String;
        //   110: ldc_w           "B"
        //   113: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   116: istore          26
        //   118: iload           26
        //   120: ifeq            189
        //   123: invokestatic    java/lang/System.currentTimeMillis:()J
        //   126: lstore          7
        //   128: aload_0        
        //   129: aload_2        
        //   130: invokevirtual   g.f:(Ljava/lang/String;)Ljava/lang/String;
        //   133: astore          23
        //   135: aload_0        
        //   136: getfield        g.h:Ls;
        //   139: ifnull          170
        //   142: new             Ljava/util/ArrayList;
        //   145: dup            
        //   146: invokespecial   java/util/ArrayList.<init>:()V
        //   149: astore          24
        //   151: aload           24
        //   153: aload           23
        //   155: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   158: pop            
        //   159: aload_0        
        //   160: getfield        g.h:Ls;
        //   163: aload           24
        //   165: invokeinterface s.a:(Ljava/util/List;)V
        //   170: aload_0        
        //   171: aload_0        
        //   172: getfield        g.k:J
        //   175: invokestatic    java/lang/System.currentTimeMillis:()J
        //   178: lload           7
        //   180: lsub           
        //   181: ladd           
        //   182: putfield        g.k:J
        //   185: iload_3        
        //   186: ifeq            355
        //   189: aload_0        
        //   190: getfield        g.l:Ljava/lang/String;
        //   193: astore          16
        //   195: aload           16
        //   197: ifnull          297
        //   200: aload_0        
        //   201: getfield        g.l:Ljava/lang/String;
        //   204: getstatic       g.A:[Ljava/lang/String;
        //   207: bipush          48
        //   209: aaload         
        //   210: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   213: istore          21
        //   215: iload           21
        //   217: ifne            297
        //   220: aload_0        
        //   221: getfield        g.l:Ljava/lang/String;
        //   224: getstatic       g.A:[Ljava/lang/String;
        //   227: bipush          55
        //   229: aaload         
        //   230: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   233: istore          22
        //   235: iload           22
        //   237: ifne            297
        //   240: aload_0        
        //   241: getfield        g.l:Ljava/lang/String;
        //   244: invokevirtual   java/lang/String.toUpperCase:()Ljava/lang/String;
        //   247: getstatic       g.A:[Ljava/lang/String;
        //   250: bipush          51
        //   252: aaload         
        //   253: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   256: ifne            297
        //   259: new             Ljava/lang/StringBuilder;
        //   262: dup            
        //   263: invokespecial   java/lang/StringBuilder.<init>:()V
        //   266: getstatic       g.A:[Ljava/lang/String;
        //   269: bipush          53
        //   271: aaload         
        //   272: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   275: aload_0        
        //   276: getfield        g.l:Ljava/lang/String;
        //   279: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   282: getstatic       g.A:[Ljava/lang/String;
        //   285: bipush          52
        //   287: aaload         
        //   288: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   291: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   294: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   297: invokestatic    java/lang/System.currentTimeMillis:()J
        //   300: lstore          17
        //   302: aload_0        
        //   303: getfield        g.h:Ls;
        //   306: ifnull          340
        //   309: new             Ljava/util/ArrayList;
        //   312: dup            
        //   313: invokespecial   java/util/ArrayList.<init>:()V
        //   316: astore          19
        //   318: aload           19
        //   320: aload_0        
        //   321: aload_2        
        //   322: invokevirtual   g.i:(Ljava/lang/String;)Ljava/lang/String;
        //   325: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   328: pop            
        //   329: aload_0        
        //   330: getfield        g.h:Ls;
        //   333: aload           19
        //   335: invokeinterface s.a:(Ljava/util/List;)V
        //   340: aload_0        
        //   341: aload_0        
        //   342: getfield        g.c:J
        //   345: invokestatic    java/lang/System.currentTimeMillis:()J
        //   348: lload           17
        //   350: lsub           
        //   351: ladd           
        //   352: putfield        g.c:J
        //   355: return         
        //   356: astore          4
        //   358: aload           4
        //   360: athrow         
        //   361: astore          5
        //   363: aload           5
        //   365: athrow         
        //   366: astore          9
        //   368: new             Ljava/lang/StringBuilder;
        //   371: dup            
        //   372: invokespecial   java/lang/StringBuilder.<init>:()V
        //   375: getstatic       g.A:[Ljava/lang/String;
        //   378: bipush          49
        //   380: aaload         
        //   381: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   384: aload           9
        //   386: invokevirtual   java/lang/OutOfMemoryError.toString:()Ljava/lang/String;
        //   389: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   392: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   395: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   398: aload_0        
        //   399: getfield        g.h:Ls;
        //   402: ifnull          170
        //   405: aload_0        
        //   406: getfield        g.h:Ls;
        //   409: aconst_null    
        //   410: invokeinterface s.a:(Ljava/util/List;)V
        //   415: goto            170
        //   418: astore          10
        //   420: aload           10
        //   422: athrow         
        //   423: astore          11
        //   425: aload           11
        //   427: athrow         
        //   428: astore          12
        //   430: aload           12
        //   432: athrow         
        //   433: astore          13
        //   435: aload           13
        //   437: athrow         
        //   438: astore          14
        //   440: aload           14
        //   442: athrow         
        //   443: astore          15
        //   445: aload           15
        //   447: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  67     82     356    361    Ljava/lang/OutOfMemoryError;
        //  86     101    356    361    Ljava/lang/OutOfMemoryError;
        //  106    118    361    366    Ljava/lang/OutOfMemoryError;
        //  128    170    366    423    Ljava/lang/OutOfMemoryError;
        //  170    185    423    428    Ljava/lang/OutOfMemoryError;
        //  189    195    428    433    Ljava/lang/OutOfMemoryError;
        //  200    215    433    438    Ljava/lang/OutOfMemoryError;
        //  220    235    438    443    Ljava/lang/OutOfMemoryError;
        //  240    297    443    448    Ljava/lang/OutOfMemoryError;
        //  358    361    361    366    Ljava/lang/OutOfMemoryError;
        //  368    415    418    423    Ljava/lang/OutOfMemoryError;
        //  425    428    428    433    Ljava/lang/OutOfMemoryError;
        //  430    433    433    438    Ljava/lang/OutOfMemoryError;
        //  435    438    438    443    Ljava/lang/OutOfMemoryError;
        //  440    443    443    448    Ljava/lang/OutOfMemoryError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 207, Size: 207
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
    
    protected void a(boolean b, final boolean b2) {
        final boolean b3 = o.b;
        while (true) {
            String s = null;
            Label_0054: {
                if (b) {
                    s = this.i;
                    if (!b3) {
                        break Label_0054;
                    }
                }
                do {
                    s = this.c();
                    if (s == null) {
                        throw new a(g.A[59]);
                    }
                } while (s.trim().length() <= 0);
            }
            final String[] split = s.split(":", 2);
            if (split.length == 2 && split[0].trim().equalsIgnoreCase(g.A[58]) && split[1].trim().equalsIgnoreCase(g.A[61])) {
                break;
            }
            if (!b2) {
                throw new a(g.A[60] + this.i + "\"");
            }
            if (!b2) {
                break;
            }
            b = false;
        }
    }
    
    public boolean a(final InputStream inputStream, final String s, final s h) {
        this.y = new e(new InputStreamReader(inputStream, s));
        this.h = h;
        final long currentTimeMillis = System.currentTimeMillis();
        if (this.h != null) {
            this.h.a();
        }
        this.e();
        if (this.h != null) {
            this.h.e();
        }
        this.r += System.currentTimeMillis() - currentTimeMillis;
        return true;
    }
    
    protected boolean a(final boolean b) {
        while (true) {
            final String c = this.c();
            if (c == null) {
                return false;
            }
            if (c.trim().length() <= 0) {
                continue;
            }
            final String[] split = c.split(":", 2);
            if (split.length == 2 && split[0].trim().equalsIgnoreCase(g.A[66]) && split[1].trim().equalsIgnoreCase(g.A[63])) {
                return true;
            }
            if (!b) {
                if (this.a > 0) {
                    this.i = c;
                    return false;
                }
                throw new a(g.A[65] + c + g.A[64]);
            }
            else {
                if (!b) {
                    throw new a(g.A[67]);
                }
                continue;
            }
        }
    }
    
    protected String b(final char c) {
        if (c == '\\' || c == ';' || c == ':' || c == ',') {
            return String.valueOf(c);
        }
        return null;
    }
    
    protected void b(final String s) {
        if (g.m.contains(s.toUpperCase()) || s.startsWith(g.A[70])) {
            if (this.h != null) {
                this.h.c(g.A[68]);
                this.h.e(s);
                if (o.b) {
                    throw new a(g.A[69] + s + "\"");
                }
            }
            return;
        }
        throw new a(g.A[69] + s + "\"");
    }
    
    protected void b(final String s, String c) {
        final boolean b = o.b;
        if (this.l.equalsIgnoreCase(g.A[41])) {
            c = this.c(c);
        }
        if (this.h != null) {
            StringBuilder sb = new StringBuilder();
            final ArrayList<String> list = new ArrayList<String>();
            final int length = c.length();
            int i = 0;
            while (i < length) {
                final char char1 = c.charAt(i);
                Label_0201: {
                    if (char1 == '\\' && i < length - 1 && !s.equals(g.A[42])) {
                        final String b2 = this.b(c.charAt(i + 1));
                        Label_0146: {
                            if (b2 != null) {
                                sb.append(b2);
                                ++i;
                                if (!b) {
                                    break Label_0146;
                                }
                            }
                            sb.append(char1);
                        }
                        if (!b) {
                            break Label_0201;
                        }
                    }
                    final int n = i;
                    StringBuilder sb2;
                    if (char1 == ';') {
                        list.add(sb.toString());
                        sb2 = new StringBuilder();
                        if (!b) {
                            sb = sb2;
                            i = n;
                            break Label_0201;
                        }
                    }
                    else {
                        sb2 = sb;
                    }
                    sb2.append(char1);
                    sb = sb2;
                    i = n;
                }
                ++i;
                if (b) {
                    break;
                }
            }
            list.add(sb.toString());
            this.h.a(list);
        }
    }
    
    protected boolean b() {
        this.l = g.A[14];
        final String d = this.d();
        final long currentTimeMillis = System.currentTimeMillis();
        final String[] l = this.l(d);
        if (l == null) {
            return true;
        }
        if (l.length != 2) {
            throw new a(g.A[19] + d + "\"");
        }
        final String upperCase = l[0].toUpperCase();
        final String s = l[1];
        this.e += System.currentTimeMillis() - currentTimeMillis;
        if (this.h != null) {
            this.h.d(upperCase);
        }
        if (upperCase.equals(g.A[24]) || upperCase.equals(g.A[22]) || upperCase.equals("N")) {
            final long currentTimeMillis2 = System.currentTimeMillis();
            this.b(upperCase, s);
            this.w += System.currentTimeMillis() - currentTimeMillis2;
            return false;
        }
        if (upperCase.equals(g.A[20])) {
            this.n(s);
            return false;
        }
        if (!this.d(upperCase)) {
            throw new a(g.A[23] + upperCase + "\"");
        }
        if (upperCase.equals(g.A[13])) {
            if (s.equals(g.A[17])) {
                throw new b(g.A[15]);
            }
            throw new a(g.A[16] + s);
        }
        else {
            if (upperCase.equals(g.A[21]) && !s.equals(this.g())) {
                throw new c(g.A[25] + s + g.A[18] + this.g());
            }
            final long currentTimeMillis3 = System.currentTimeMillis();
            this.a(upperCase, s);
            this.p += System.currentTimeMillis() - currentTimeMillis3;
            return false;
        }
    }
    
    protected String c() {
        return this.y.readLine();
    }
    
    protected String c(String string) {
        final boolean b = o.b;
        if (string.trim().endsWith("=")) {
            final int n = -1 + string.length();
            while (string.charAt(n) != '=') {}
            final StringBuilder sb = new StringBuilder();
            sb.append(string.substring(0, n + 1));
            sb.append(g.A[38]);
            String c;
            do {
                c = this.c();
                if (c == null) {
                    throw new a(g.A[39]);
                }
                if (!c.trim().endsWith("=")) {
                    break;
                }
                final int n2 = -1 + c.length();
                while (c.charAt(n2) != '=') {}
                sb.append(c.substring(0, n2 + 1));
                sb.append(g.A[40]);
            } while (!b);
            sb.append(c);
            string = sb.toString();
        }
        return string;
    }
    
    protected void c(final String s, final String s2) {
        if (this.h != null) {
            this.h.c(s);
            this.h.e(s2);
        }
    }
    
    protected String d() {
        String s;
        if (g.j) {
            g.j = false;
            s = g.q;
        }
        else {
            s = this.c();
            if (s == null) {
                throw new a(g.A[57]);
            }
            if (s.trim().length() <= 0) {
                return null;
            }
        }
        return s;
    }
    
    protected boolean d(final String s) {
        if (!g.v.contains(s.toUpperCase()) && !s.startsWith(g.A[11]) && !this.g.contains(s)) {
            this.g.add(s);
            Log.w(g.A[12] + s);
        }
        return true;
    }
    
    protected void e() {
        final boolean b = o.b;
        for (boolean b2 = true; (!this.f || b) && (this.b(b2) || b) && !b; b2 = false) {}
        if (this.a > 0) {
            int i = 0;
            boolean b3 = true;
            while (i < this.a) {
                this.a(b3, true);
                ++i;
                if (b) {
                    break;
                }
                b3 = false;
            }
        }
    }
    
    protected void e(final String s) {
        int i = 0;
        final boolean b = o.b;
        final String[] split = s.split("-");
        if (split.length > 2) {
            throw new a(g.A[45] + s + "\"");
        }
        final String s2 = split[0];
        final int length = s2.length();
        int j = 0;
        while (j < length) {
            if (!this.a(s2.charAt(j))) {
                throw new a(g.A[46] + s + "\"");
            }
            ++j;
            if (b) {
                break;
            }
        }
        if (split.length > 1) {
            final String s3 = split[1];
            while (i < s3.length()) {
                if (!this.a(s3.charAt(i))) {
                    throw new a(g.A[44] + s + "\"");
                }
                ++i;
                if (b) {
                    break;
                }
            }
        }
        if (this.h != null) {
            this.h.c(g.A[43]);
            this.h.e(s);
        }
    }
    
    protected String f(final String s) {
        final boolean b = o.b;
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        do {
            final String c = this.c();
            if (c == null) {
                throw new a(g.A[10]);
            }
            if (c.length() == 0 && !b) {
                break;
            }
            sb.append(c);
        } while (!b);
        return sb.toString();
    }
    
    protected void f() {
        final boolean b = o.b;
        if (this.h != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            this.h.d();
            this.n += System.currentTimeMillis() - currentTimeMillis;
        }
        boolean b2 = this.b();
        if (this.h != null && !b2) {
            final long currentTimeMillis2 = System.currentTimeMillis();
            this.h.b();
            this.z += System.currentTimeMillis() - currentTimeMillis2;
        }
        while (!b2) {
            if (this.h != null) {
                final long currentTimeMillis3 = System.currentTimeMillis();
                this.h.d();
                this.n += System.currentTimeMillis() - currentTimeMillis3;
            }
            b2 = this.b();
            if (this.h != null && !b2) {
                final long currentTimeMillis4 = System.currentTimeMillis();
                this.h.b();
                this.z += System.currentTimeMillis() - currentTimeMillis4;
                if (b) {
                    break;
                }
                continue;
            }
        }
    }
    
    protected String g() {
        return g.A[37];
    }
    
    protected void g(final String s) {
        final boolean b = o.b;
        final String[] split = s.split("=", 2);
        if (split.length == 2) {
            final String trim = split[0].trim();
            final String trim2 = split[1].trim();
            Label_0216: {
                if (trim.equalsIgnoreCase(g.A[6])) {
                    this.j(trim2);
                    if (!b) {
                        break Label_0216;
                    }
                }
                if (trim.equals(g.A[8])) {
                    this.b(trim2);
                    if (!b) {
                        break Label_0216;
                    }
                }
                if (trim.equals(g.A[9])) {
                    this.h(trim2);
                    if (!b) {
                        break Label_0216;
                    }
                }
                if (trim.equals(g.A[5])) {
                    this.a(trim2);
                    if (!b) {
                        break Label_0216;
                    }
                }
                if (trim.equals(g.A[3])) {
                    this.e(trim2);
                    if (!b) {
                        break Label_0216;
                    }
                }
                if (trim.startsWith(g.A[7])) {
                    this.c(trim, trim2);
                    if (!b) {
                        break Label_0216;
                    }
                }
                throw new a(g.A[4] + trim + "\"");
            }
            if (!b) {
                return;
            }
        }
        this.j(split[0]);
    }
    
    protected void h(final String l) {
        if (this.m(l) || l.startsWith(g.A[2])) {
            if (this.h != null) {
                this.h.c(g.A[0]);
                this.h.e(l);
            }
            this.l = l;
            if (!o.b) {
                return;
            }
        }
        throw new a(g.A[1] + l + "\"");
    }
    
    protected String i(final String s) {
        return s;
    }
    
    protected void j(final String s) {
        if (!g.d.contains(s) && !s.startsWith(g.A[36]) && !this.g.contains(s)) {
            this.g.add(s);
            Log.w(g.A[34] + s);
        }
        if (this.h != null) {
            this.h.c(g.A[35]);
            this.h.e(s);
        }
    }
    
    protected String[] l(final String s) {
        final boolean b = o.b;
        final int length = s.length();
        final String[] array = new String[2];
        if (!s.startsWith(g.A[26])) {
            int i = 0;
            int n = 0;
            int n2 = 0;
            while (i < length) {
                final char char1 = s.charAt(i);
                Label_0612: {
                    switch (n2) {
                        case 0: {
                            if (char1 == ':') {
                                final String substring = s.substring(n, i);
                                if (substring.equalsIgnoreCase(g.A[27])) {
                                    this.i = s;
                                    return null;
                                }
                                array[0] = substring;
                                if (i < length - 1) {
                                    array[1] = s.substring(i + 1);
                                    if (!b) {
                                        return array;
                                    }
                                }
                                array[1] = "";
                                return array;
                            }
                            else {
                                if (char1 == '.') {
                                    final String substring2 = s.substring(n, i);
                                    if (this.h != null) {
                                        this.h.b(substring2);
                                    }
                                    n = i + 1;
                                    if (!b) {
                                        break;
                                    }
                                }
                                if (char1 != ';') {
                                    break;
                                }
                                final String substring3 = s.substring(n, i);
                                if (substring3.equalsIgnoreCase(g.A[32])) {
                                    this.i = s;
                                    return null;
                                }
                                array[0] = substring3;
                                n = i + 1;
                                if (b) {
                                    n2 = 1;
                                    break Label_0612;
                                }
                                n2 = 1;
                                break;
                            }
                            break;
                        }
                        case 1: {
                            if (char1 == '\"') {
                                if (!b) {
                                    n2 = 2;
                                    break;
                                }
                                n2 = 2;
                            }
                            if (char1 == ';') {
                                this.g(s.substring(n, i));
                                n = i + 1;
                                if (!b) {
                                    break;
                                }
                            }
                            if (char1 == ':') {
                                this.g(s.substring(n, i));
                                if (i < length - 1) {
                                    array[1] = s.substring(i + 1);
                                    if (!b) {
                                        return array;
                                    }
                                }
                                array[1] = "";
                                return array;
                            }
                            break;
                        }
                        case 2: {
                            if (char1 == '\"') {
                                n2 = 1;
                                break;
                            }
                            break;
                        }
                    }
                }
                ++i;
                if (b) {
                    break;
                }
            }
            throw new a(g.A[33] + s + "\"");
        }
        final String[] split = s.split(":");
        if (split.length < 2) {
            return null;
        }
        array[0] = this.k(split[0]);
        array[1] = split[1].replaceAll(g.A[28], "");
        if (array[0].equals(g.A[31])) {
            int n3;
            if (s.contains(g.A[30])) {
                this.j(s.substring(1 + s.indexOf("="), s.indexOf(":")));
                n3 = 0;
            }
            else {
                n3 = 1;
            }
            final String a = this.a();
            if (a != null && a.contains(g.A[29])) {
                array[1] = array[1] + ";" + a.substring(1 + a.lastIndexOf(":"));
                g.j = false;
            }
            if (n3 != 0) {
                final String d = this.d();
                this.j(d.substring(1 + d.lastIndexOf(":")));
            }
            if (!b) {
                return array;
            }
        }
        if (split.length > 2) {
            int j = 2;
            while (j < split.length) {
                array[1] = array[1] + ":" + split[j];
                ++j;
                if (b) {
                    break;
                }
            }
        }
        final String d2 = this.d();
        this.j(d2.substring(1 + d2.lastIndexOf(":")));
        return array;
    }
    
    protected boolean m(final String s) {
        return g.o.contains(s.toUpperCase());
    }
    
    protected void n(final String s) {
        throw new a(g.A[72]);
    }
}
