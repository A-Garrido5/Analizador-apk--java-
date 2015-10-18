// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import com.whatsapp.util.cq;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import android.os.Build$VERSION;
import android.content.Context;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View$OnClickListener;
import java.util.Comparator;
import android.support.v4.view.ViewPager;
import java.util.ArrayList;

public class bi
{
    private static final int[] b;
    private static final int[] c;
    private static final int[] k;
    private static int o;
    private static final int[] p;
    private static final k1[] q;
    private static final int[] t;
    private static ArrayList u;
    private static int v;
    private static int w;
    private static final String[] z;
    private int a;
    private ViewPager d;
    private int e;
    private Comparator f;
    private View$OnClickListener g;
    private io[] h;
    private LayoutInflater i;
    private eu j;
    private vz l;
    private ViewGroup m;
    private ImageView n;
    private Context r;
    private int s;
    
    static {
        final String[] z2 = new String[3];
        String s = "LUWleTkGmvLUZfb";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = '\u0010';
                        break;
                    }
                    case 0: {
                        c3 = ' ';
                        break;
                    }
                    case 1: {
                        c3 = '4';
                        break;
                    }
                    case 2: {
                        c3 = '.';
                        break;
                    }
                    case 3: {
                        c3 = '\u0003';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "EYAiyP]MhuR\u001b\\fqDFK`uN@\u000e";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "EYAiy";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        bi.o = 500;
        bi.w = 50;
        if (Build$VERSION.SDK_INT >= 12) {
            bi.o = ViewConfiguration.getKeyRepeatTimeout();
            bi.w = ViewConfiguration.getKeyRepeatDelay();
        }
        c = new int[] { 58389, 57431, 128512, 57430, 58388, 58373, 57606, 58392, 58391, 128535, 128537, 57605, 58377, 128539, 58381, 58372, 58371, 58378, 58382, 57432, 58374, 58387, 58386, 58385, 58376, 58369, 58383, 128517, 57608, 128553, 128555, 58379, 57607, 57433, 58390, 128548, 58375, 128518, 128523, 58380, 128526, 128564, 128565, 58384, 128543, 128550, 128551, 128520, 57626, 128558, 128556, 128528, 128533, 128559, 128566, 128519, 58370, 128529, 58646, 58647, 57682, 58651, 58654, 58650, 57345, 57346, 57348, 57349, 58648, 58649, 58645, 57422, 58652, 128570, 128568, 128571, 128573, 128572, 128576, 128575, 128569, 128574, 128121, 128122, 128584, 128585, 128586, 57628, 57612, 57434, 57629, 58158, 58165, 128171, 128165, 58164, 58161, 128167, 57660, 58160, 58395, 58393, 58394, 128069, 58396, 57358, 58401, 58400, 57357, 57360, 57361, 58398, 57362, 58402, 57902, 57903, 57905, 57904, 58407, 58397, 57359, 58399, 57676, 57857, 57621, 58655, 58408, 128106, 128108, 128109, 57617, 58405, 58409, 58404, 58403, 57939, 128587, 58142, 58143, 58141, 128112, 128590, 128589, 58406, 58627, 57614, 58136, 57351, 128094, 58138, 57662, 58139, 57350, 58114, 128090, 58137, 127933, 128086, 58145, 58146, 57630, 58147, 128093, 128091, 128083, 58132, 58428, 58140, 58156, 58154, 58157, 58155, 57378, 57379, 58152, 58151, 128149, 128150, 128158, 58153, 128140, 57347, 57396, 57397, 128100, 128101, 128172, 58678, 128173 };
        p = new int[] { 57426, 58666, 57423, 57427, 58660, 58668, 58673, 57424, 58663, 57425, 57611, 128061, 58667, 58671, 57609, 58664, 57370, 58665, 58662, 128060, 57429, 58657, 58659, 128037, 128035, 58670, 58669, 128034, 58661, 128029, 128028, 128030, 128012, 57610, 58433, 58658, 57369, 58656, 57428, 128011, 128004, 128015, 128000, 128003, 128005, 128007, 128009, 57652, 128016, 128019, 128021, 128022, 128001, 128002, 128050, 128033, 128010, 58672, 128042, 128006, 128008, 128041, 128062, 58118, 57392, 58116, 57616, 57394, 58117, 58115, 57624, 58439, 57625, 127807, 58436, 127812, 58120, 58119, 127794, 127795, 127792, 127793, 127804, 127760, 127774, 127773, 127770, 127761, 127762, 127763, 127764, 127765, 127766, 127767, 127768, 127772, 127771, 57420, 127757, 127758, 127759, 127755, 127756, 127776, 58159, 57418, 9925, 57417, 57661, 57419, 10052, 57416, 58435, 127745, 58444, 58430 };
        t = new int[] { 58422, 58423, 58424, 58426, 58425, 58427, 57623, 58432, 58434, 58438, 58437, 57627, 58440, 57395, 57618, 127883, 58130, 127882, 58128, 57667, 128302, 57405, 57352, 128249, 57641, 57638, 57639, 58134, 128190, 57356, 57354, 57353, 128222, 128223, 57355, 57675, 57642, 57640, 57665, 128265, 128264, 128263, 58149, 128277, 57666, 58135, 9203, 8987, 9200, 8986, 57669, 57668, 128271, 128272, 57407, 128270, 57615, 128294, 128262, 128261, 128268, 128267, 57620, 128705, 57663, 128703, 57664, 128295, 128297, 57622, 128682, 58126, 58129, 57619, 128298, 58127, 57659, 57647, 128180, 128181, 128183, 128182, 128179, 128184, 57604, 128231, 128229, 128228, 9993, 57603, 128232, 128239, 57601, 128234, 128236, 128237, 57602, 128230, 58113, 128196, 128195, 128209, 128202, 128200, 128201, 128220, 128203, 128197, 128198, 128199, 128193, 128194, 58131, 128204, 128206, 10002, 9999, 128207, 128208, 128213, 128215, 128216, 128217, 128211, 128212, 128210, 128218, 57672, 128278, 128219, 128300, 128301, 128240, 58626, 58148, 57404, 58122, 127932, 57406, 58150, 127929, 127931, 57410, 57408, 57409, 57643, 127918, 127183, 127924, 57645, 127922, 57648, 58411, 58410, 57368, 57366, 57365, 58412, 127945, 127923, 57364, 128693, 128692, 57650, 127943, 57649, 57363, 127938, 58413, 57367, 127907, 57413, 58168, 58123, 127868, 57415, 58124, 57412, 127865, 127863, 57411, 127829, 57632, 58171, 127831, 127830, 58175, 58177, 127844, 58188, 58180, 127845, 58178, 58173, 58174, 58176, 58189, 58179, 58172, 57671, 58169, 127849, 127854, 58170, 127848, 58431, 58187, 57414, 127850, 127851, 127852, 127853, 127855, 58181, 127823, 58182, 127819, 127826, 127815, 58184, 58183, 127825, 127816, 127820, 127824, 127821, 127840, 58186, 58185, 127805 };
        b = new int[] { 57398, 127969, 57687, 57400, 57683, 57685, 57677, 57686, 58625, 57688, 58429, 57399, 58628, 127972, 58442, 57670, 58629, 58630, 57634, 58632, 58633, 128510, 57403, 57421, 58441, 58443, 58653, 127753, 127904, 57636, 57633, 58419, 57858, 57372, 57653, 128675, 9875, 57613, 57373, 57631, 128641, 128642, 128650, 57401, 128670, 128646, 58421, 57375, 128648, 58420, 128669, 128651, 57374, 128654, 57689, 128653, 58414, 128664, 57371, 57690, 128662, 128667, 58415, 128680, 58418, 128660, 58416, 58417, 128656, 57654, 128673, 128671, 128672, 128668, 58144, 57680, 57637, 128678, 57678, 57938, 57655, 57865, 57402, 127982, 57651, 57635, 128511, 127914, 127917, 128205, 128681, 60417, 58638, 60419, 60418, 58641, 58639, 58640, 60420, 60421, 60439, 60422, 58636, 60424, 60423, 58642, 60425, 60427, 60426, 60428, 60430, 60429, 60432, 60431, 60437, 60435, 60434, 58637, 60438, 60433, 60436, 58643, 58644, 58635, 60453, 60459, 60440, 60455, 60457, 60448, 60456, 60454, 60441, 60446, 60449, 60443, 60451, 60460, 60458, 60461, 60452, 60450, 60442, 60447, 60444, 60445, 60462 };
        k = new int[] { 57884, 57885, 57886, 57887, 57888, 57889, 57890, 57891, 57892, 57893, 128287, 128290, 57872, 128291, 57906, 57907, 57909, 57908, 128288, 128289, 128292, 57910, 57911, 57912, 57913, 8596, 8597, 128260, 57915, 57914, 128316, 128317, 8617, 8618, 8505, 57917, 57916, 9195, 9196, 10549, 10548, 57933, 128256, 128257, 128258, 57874, 57875, 57876, 127379, 127382, 57867, 58631, 57859, 57900, 57899, 57898, 127540, 127538, 57894, 57895, 57901, 57877, 57878, 57681, 57656, 57657, 57658, 58121, 128688, 128686, 57679, 57866, 57864, 57879, 57880, 57896, 9410, 128706, 128708, 128709, 128707, 127569, 58133, 58125, 127377, 127384, 57897, 128683, 57863, 128245, 128687, 128689, 128691, 128695, 128696, 9940, 57862, 10055, 10062, 9989, 57861, 57860, 57646, 57936, 57937, 58674, 58675, 58676, 58677, 128160, 57873, 9851, 57919, 57920, 57921, 57922, 57923, 57924, 57925, 57926, 57927, 57928, 57929, 57930, 57931, 57918, 57684, 57674, 128178, 57673, 57934, 57935, 58679, 57644, 12336, 57932, 128282, 128281, 128283, 128284, 58163, 58162, 57377, 57376, 58167, 58166, 128259, 57391, 128359, 57380, 128348, 57381, 128349, 57382, 128350, 57383, 128351, 57384, 128352, 57385, 57386, 57387, 57388, 57389, 57390, 128353, 128354, 128355, 128356, 128357, 128358, 10006, 10133, 10134, 10135, 57870, 57868, 57871, 57869, 128174, 128175, 10004, 9745, 128280, 128279, 10160, 57393, 57882, 57883, 9724, 9723, 9726, 9725, 9642, 9643, 128314, 11036, 11035, 9899, 9898, 57881, 128309, 128315, 128310, 128311, 128312, 128313 };
        bi.v = 1;
        q = new k1[] { new kx(0, 2131755554, 2131755555, null), new k1(1, bi.c, 2131755556, 2131755557, null), new k1(2, bi.p, 2131755558, 2131755559, null), new k1(3, bi.t, 2131755560, 2131755561, null), new k1(4, bi.b, 2131755562, 2131755563, null), new k1(5, bi.k, 2131755564, 2131755565, null) };
    }
    
    public bi(final Context p0, final ViewGroup p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokespecial   java/lang/Object.<init>:()V
        //     8: aload_0        
        //     9: getstatic       com/whatsapp/bi.q:[Lcom/whatsapp/k1;
        //    12: arraylength    
        //    13: anewarray       Lcom/whatsapp/io;
        //    16: putfield        com/whatsapp/bi.h:[Lcom/whatsapp/io;
        //    19: aload_0        
        //    20: new             Lcom/whatsapp/r0;
        //    23: dup            
        //    24: aload_0        
        //    25: invokespecial   com/whatsapp/r0.<init>:(Lcom/whatsapp/bi;)V
        //    28: putfield        com/whatsapp/bi.f:Ljava/util/Comparator;
        //    31: aload_0        
        //    32: aload_1        
        //    33: putfield        com/whatsapp/bi.r:Landroid/content/Context;
        //    36: getstatic       com/whatsapp/bi.u:Ljava/util/ArrayList;
        //    39: ifnonnull       145
        //    42: new             Ljava/io/File;
        //    45: dup            
        //    46: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    49: invokevirtual   com/whatsapp/App.getFilesDir:()Ljava/io/File;
        //    52: getstatic       com/whatsapp/bi.z:[Ljava/lang/String;
        //    55: iconst_2       
        //    56: aaload         
        //    57: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    60: astore          4
        //    62: aload           4
        //    64: invokevirtual   java/io/File.exists:()Z
        //    67: ifeq            113
        //    70: new             Lcom/whatsapp/alr;
        //    73: dup            
        //    74: aload_0        
        //    75: new             Ljava/io/FileInputStream;
        //    78: dup            
        //    79: aload           4
        //    81: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    84: invokespecial   com/whatsapp/alr.<init>:(Lcom/whatsapp/bi;Ljava/io/InputStream;)V
        //    87: astore          14
        //    89: aload           14
        //    91: invokevirtual   java/io/ObjectInputStream.readObject:()Ljava/lang/Object;
        //    94: checkcast       Ljava/util/ArrayList;
        //    97: checkcast       Ljava/util/ArrayList;
        //   100: putstatic       com/whatsapp/bi.u:Ljava/util/ArrayList;
        //   103: aload           14
        //   105: ifnull          113
        //   108: aload           14
        //   110: invokevirtual   java/io/ObjectInputStream.close:()V
        //   113: getstatic       com/whatsapp/bi.u:Ljava/util/ArrayList;
        //   116: astore          7
        //   118: aload           7
        //   120: ifnonnull       141
        //   123: new             Ljava/util/ArrayList;
        //   126: dup            
        //   127: invokespecial   java/util/ArrayList.<init>:()V
        //   130: putstatic       com/whatsapp/bi.u:Ljava/util/ArrayList;
        //   133: iconst_1       
        //   134: putstatic       com/whatsapp/bi.v:I
        //   137: iload_3        
        //   138: ifeq            145
        //   141: iconst_0       
        //   142: putstatic       com/whatsapp/bi.v:I
        //   145: aload_0        
        //   146: aload_2        
        //   147: ldc_w           2131755553
        //   150: invokevirtual   android/view/ViewGroup.findViewById:(I)Landroid/view/View;
        //   153: checkcast       Landroid/view/ViewGroup;
        //   156: putfield        com/whatsapp/bi.m:Landroid/view/ViewGroup;
        //   159: aload_0        
        //   160: new             Lcom/whatsapp/vz;
        //   163: dup            
        //   164: aload_0        
        //   165: aconst_null    
        //   166: invokespecial   com/whatsapp/vz.<init>:(Lcom/whatsapp/bi;Lcom/whatsapp/r0;)V
        //   169: putfield        com/whatsapp/bi.l:Lcom/whatsapp/vz;
        //   172: aload_0        
        //   173: aload_2        
        //   174: ldc_w           2131755397
        //   177: invokevirtual   android/view/ViewGroup.findViewById:(I)Landroid/view/View;
        //   180: checkcast       Landroid/support/v4/view/ViewPager;
        //   183: putfield        com/whatsapp/bi.d:Landroid/support/v4/view/ViewPager;
        //   186: aload_0        
        //   187: getfield        com/whatsapp/bi.d:Landroid/support/v4/view/ViewPager;
        //   190: bipush          6
        //   192: invokevirtual   android/support/v4/view/ViewPager.setOffscreenPageLimit:(I)V
        //   195: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   198: bipush          11
        //   200: if_icmplt       212
        //   203: aload_0        
        //   204: getfield        com/whatsapp/bi.d:Landroid/support/v4/view/ViewPager;
        //   207: iconst_1       
        //   208: aconst_null    
        //   209: invokevirtual   android/support/v4/view/ViewPager.setLayerType:(ILandroid/graphics/Paint;)V
        //   212: aload_0        
        //   213: getfield        com/whatsapp/bi.d:Landroid/support/v4/view/ViewPager;
        //   216: aload_0        
        //   217: getfield        com/whatsapp/bi.l:Lcom/whatsapp/vz;
        //   220: invokevirtual   android/support/v4/view/ViewPager.setAdapter:(Landroid/support/v4/view/PagerAdapter;)V
        //   223: aload_0        
        //   224: getfield        com/whatsapp/bi.d:Landroid/support/v4/view/ViewPager;
        //   227: new             Lcom/whatsapp/a2a;
        //   230: dup            
        //   231: aload_0        
        //   232: invokespecial   com/whatsapp/a2a.<init>:(Lcom/whatsapp/bi;)V
        //   235: invokevirtual   android/support/v4/view/ViewPager.setOnPageChangeListener:(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V
        //   238: aload_0        
        //   239: aload_1        
        //   240: getstatic       com/whatsapp/bi.z:[Ljava/lang/String;
        //   243: iconst_0       
        //   244: aaload         
        //   245: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   248: checkcast       Landroid/view/LayoutInflater;
        //   251: putfield        com/whatsapp/bi.i:Landroid/view/LayoutInflater;
        //   254: aload_0        
        //   255: aload_1        
        //   256: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   259: ldc_w           2131361909
        //   262: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   265: putfield        com/whatsapp/bi.s:I
        //   268: aload_0        
        //   269: aload_0        
        //   270: getfield        com/whatsapp/bi.s:I
        //   273: putfield        com/whatsapp/bi.e:I
        //   276: iconst_0       
        //   277: istore          9
        //   279: iload           9
        //   281: getstatic       com/whatsapp/bi.q:[Lcom/whatsapp/k1;
        //   284: arraylength    
        //   285: if_icmpge       328
        //   288: getstatic       com/whatsapp/bi.q:[Lcom/whatsapp/k1;
        //   291: iload           9
        //   293: aaload         
        //   294: astore          13
        //   296: aload_0        
        //   297: getfield        com/whatsapp/bi.m:Landroid/view/ViewGroup;
        //   300: aload           13
        //   302: invokestatic    com/whatsapp/k1.b:(Lcom/whatsapp/k1;)I
        //   305: invokevirtual   android/view/ViewGroup.findViewById:(I)Landroid/view/View;
        //   308: new             Lcom/whatsapp/awo;
        //   311: dup            
        //   312: aload_0        
        //   313: aload           13
        //   315: invokespecial   com/whatsapp/awo.<init>:(Lcom/whatsapp/bi;Lcom/whatsapp/k1;)V
        //   318: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   321: iinc            9, 1
        //   324: iload_3        
        //   325: ifeq            279
        //   328: invokestatic    com/whatsapp/App.ak:()Z
        //   331: ifeq            542
        //   334: getstatic       com/whatsapp/bi.v:I
        //   337: istore          11
        //   339: aload_0        
        //   340: getfield        com/whatsapp/bi.d:Landroid/support/v4/view/ViewPager;
        //   343: iload           11
        //   345: iconst_0       
        //   346: invokevirtual   android/support/v4/view/ViewPager.setCurrentItem:(IZ)V
        //   349: aload_0        
        //   350: getstatic       com/whatsapp/bi.v:I
        //   353: invokespecial   com/whatsapp/bi.c:(I)V
        //   356: aload_0        
        //   357: new             Lcom/whatsapp/kc;
        //   360: dup            
        //   361: aload_0        
        //   362: invokespecial   com/whatsapp/kc.<init>:(Lcom/whatsapp/bi;)V
        //   365: putfield        com/whatsapp/bi.g:Landroid/view/View$OnClickListener;
        //   368: aload_0        
        //   369: aload_2        
        //   370: ldc_w           2131755566
        //   373: invokevirtual   android/view/ViewGroup.findViewById:(I)Landroid/view/View;
        //   376: checkcast       Landroid/widget/ImageView;
        //   379: putfield        com/whatsapp/bi.n:Landroid/widget/ImageView;
        //   382: aload_0        
        //   383: getfield        com/whatsapp/bi.n:Landroid/widget/ImageView;
        //   386: ifnull          451
        //   389: new             Lcom/whatsapp/lz;
        //   392: dup            
        //   393: aload_0        
        //   394: invokespecial   com/whatsapp/lz.<init>:(Lcom/whatsapp/bi;)V
        //   397: astore          12
        //   399: aload_0        
        //   400: getfield        com/whatsapp/bi.n:Landroid/widget/ImageView;
        //   403: iconst_1       
        //   404: invokevirtual   android/widget/ImageView.setClickable:(Z)V
        //   407: aload_0        
        //   408: getfield        com/whatsapp/bi.n:Landroid/widget/ImageView;
        //   411: new             Lcom/whatsapp/ase;
        //   414: dup            
        //   415: aload_0        
        //   416: aload           12
        //   418: invokespecial   com/whatsapp/ase.<init>:(Lcom/whatsapp/bi;Landroid/os/Handler;)V
        //   421: invokevirtual   android/widget/ImageView.setOnTouchListener:(Landroid/view/View$OnTouchListener;)V
        //   424: aload_0        
        //   425: getfield        com/whatsapp/bi.n:Landroid/widget/ImageView;
        //   428: new             Lcom/whatsapp/util/m;
        //   431: dup            
        //   432: aload_0        
        //   433: getfield        com/whatsapp/bi.r:Landroid/content/Context;
        //   436: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   439: ldc_w           2130838677
        //   442: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   445: invokespecial   com/whatsapp/util/m.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   448: invokevirtual   android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   451: return         
        //   452: astore          15
        //   454: aconst_null    
        //   455: astore          14
        //   457: new             Ljava/lang/StringBuilder;
        //   460: dup            
        //   461: invokespecial   java/lang/StringBuilder.<init>:()V
        //   464: getstatic       com/whatsapp/bi.z:[Ljava/lang/String;
        //   467: iconst_1       
        //   468: aaload         
        //   469: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   472: aload           15
        //   474: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //   477: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   480: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   483: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   486: aload           14
        //   488: ifnull          113
        //   491: aload           14
        //   493: invokevirtual   java/io/ObjectInputStream.close:()V
        //   496: goto            113
        //   499: astore          18
        //   501: goto            113
        //   504: astore          16
        //   506: aconst_null    
        //   507: astore          14
        //   509: aload           14
        //   511: ifnull          519
        //   514: aload           14
        //   516: invokevirtual   java/io/ObjectInputStream.close:()V
        //   519: aload           16
        //   521: athrow         
        //   522: astore          5
        //   524: aload           5
        //   526: athrow         
        //   527: astore          6
        //   529: aload           6
        //   531: athrow         
        //   532: astore          8
        //   534: aload           8
        //   536: athrow         
        //   537: astore          10
        //   539: aload           10
        //   541: athrow         
        //   542: iconst_m1      
        //   543: aload_0        
        //   544: getfield        com/whatsapp/bi.h:[Lcom/whatsapp/io;
        //   547: arraylength    
        //   548: iadd           
        //   549: getstatic       com/whatsapp/bi.v:I
        //   552: isub           
        //   553: istore          11
        //   555: goto            339
        //   558: astore          19
        //   560: goto            113
        //   563: astore          17
        //   565: goto            519
        //   568: astore          16
        //   570: goto            509
        //   573: astore          15
        //   575: goto            457
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  70     89     452    457    Ljava/lang/Exception;
        //  70     89     504    509    Any
        //  89     103    573    578    Ljava/lang/Exception;
        //  89     103    568    573    Any
        //  108    113    558    563    Ljava/io/IOException;
        //  113    118    522    527    Ljava/io/IOException;
        //  123    137    527    532    Ljava/io/IOException;
        //  141    145    527    532    Ljava/io/IOException;
        //  145    212    532    537    Ljava/io/IOException;
        //  328    339    537    542    Ljava/io/IOException;
        //  457    486    568    573    Any
        //  491    496    499    504    Ljava/io/IOException;
        //  514    519    563    568    Ljava/io/IOException;
        //  524    527    527    532    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 265, Size: 265
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    static int a(final int v) {
        return bi.v = v;
    }
    
    private static Drawable a(final Context context, final int n) {
        switch (n) {
            default: {
                return cq.a(context, n);
            }
            case 57932: {
                return context.getResources().getDrawable(2130838978);
            }
            case 57934: {
                return context.getResources().getDrawable(2130838979);
            }
            case 57935: {
                return context.getResources().getDrawable(2130838980);
            }
            case 57673: {
                return context.getResources().getDrawable(2130838977);
            }
            case 58679: {
                return context.getResources().getDrawable(2130838981);
            }
            case 127932: {
                return context.getResources().getDrawable(2130838982);
            }
            case 128178: {
                return context.getResources().getDrawable(2130838985);
            }
            case 128282: {
                return context.getResources().getDrawable(2130838988);
            }
            case 128283: {
                return context.getResources().getDrawable(2130838989);
            }
            case 128284: {
                return context.getResources().getDrawable(2130838990);
            }
            case 128259: {
                return context.getResources().getDrawable(2130838986);
            }
            case 128281: {
                return context.getResources().getDrawable(2130838987);
            }
            case 10160: {
                return context.getResources().getDrawable(2130838996);
            }
            case 10004: {
                return context.getResources().getDrawable(2130838991);
            }
            case 10006: {
                return context.getResources().getDrawable(2130838992);
            }
            case 10133: {
                return context.getResources().getDrawable(2130838993);
            }
            case 10134: {
                return context.getResources().getDrawable(2130838994);
            }
            case 10135: {
                return context.getResources().getDrawable(2130838995);
            }
            case 12336: {
                return context.getResources().getDrawable(2130838997);
            }
            case 128028: {
                return context.getResources().getDrawable(2130838984);
            }
            case 128003: {
                return context.getResources().getDrawable(2130838983);
            }
        }
    }
    
    static eu a(final bi bi) {
        return bi.j;
    }
    
    static void a(final bi bi, final int n) {
        bi.c(n);
    }
    
    static k1[] a() {
        return bi.q;
    }
    
    static int b() {
        return bi.v;
    }
    
    static Drawable b(final Context context, final int n) {
        return a(context, n);
    }
    
    static View$OnClickListener b(final bi bi) {
        return bi.g;
    }
    
    static int c(final bi bi) {
        return bi.a;
    }
    
    static ArrayList c() {
        return bi.u;
    }
    
    private void c(final int n) {
        final boolean i = App.I;
        final k1[] q = bi.q;
        int n2;
        for (int length = q.length, j = 0; j < length; j = n2) {
            final k1 k1 = q[j];
            final View viewById = this.m.findViewById(com.whatsapp.k1.a(k1));
            final ImageView imageView = (ImageView)this.m.findViewById(com.whatsapp.k1.b(k1));
            Label_0117: {
                if (imageView != null) {
                    if (com.whatsapp.k1.c(k1) == n) {
                        imageView.setSelected(true);
                        viewById.setBackgroundColor(viewById.getContext().getResources().getColor(2131623942));
                        if (!i) {
                            break Label_0117;
                        }
                    }
                    imageView.setSelected(false);
                    viewById.setBackgroundColor(0);
                }
            }
            n2 = j + 1;
            if (i) {
                break;
            }
        }
    }
    
    static int d() {
        return bi.o;
    }
    
    static LayoutInflater d(final bi bi) {
        return bi.i;
    }
    
    static int e() {
        return bi.w;
    }
    
    static Comparator e(final bi bi) {
        return bi.f;
    }
    
    static int f(final bi bi) {
        return bi.s;
    }
    
    static Context g(final bi bi) {
        return bi.r;
    }
    
    static int h(final bi bi) {
        return bi.e;
    }
    
    static ViewPager i(final bi bi) {
        return bi.d;
    }
    
    static io[] j(final bi bi) {
        return bi.h;
    }
    
    public void a(final eu j) {
        this.j = j;
    }
    
    public void a(final boolean b) {
        if (this.n != null) {
            final ImageView n = this.n;
            int visibility;
            if (b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            n.setVisibility(visibility);
        }
    }
    
    public void b(final int a) {
        final boolean i = App.I;
        if (this.a != a) {
            this.a = a;
            int j = 1;
            while (j < this.h.length) {
                if (this.h[j] != null) {
                    this.h[j].notifyDataSetChanged();
                }
                ++j;
                if (i) {
                    break;
                }
            }
        }
        if (this.h[0] != null) {
            this.h[0].notifyDataSetChanged();
        }
    }
}
