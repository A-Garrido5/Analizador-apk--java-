import com.twitter.library.featureswitch.d;

// 
// Decompiled by Procyon v0.5.30
// 

public class fg
{
    public static boolean a() {
        return d.e("adaptive_media_android_v3_star_3363") || d.e("adaptive_media_android_v3_heart_3376");
    }
    
    public static int b() {
        int n = -1;
        final String a = d.a("adaptive_media_android_v3_heart_3376");
        int n2 = 0;
        Label_0058: {
            switch (a.hashCode()) {
                case 951543133: {
                    if (a.equals("control")) {
                        n2 = 0;
                        break Label_0058;
                    }
                    break;
                }
                case -395080240: {
                    if (a.equals("control_2")) {
                        n2 = 1;
                        break Label_0058;
                    }
                    break;
                }
                case 3075958: {
                    if (a.equals("dark")) {
                        n2 = 2;
                        break Label_0058;
                    }
                    break;
                }
                case -1360216880: {
                    if (a.equals("circle")) {
                        n2 = 3;
                        break Label_0058;
                    }
                    break;
                }
            }
            n2 = n;
        }
        switch (n2) {
            default: {
                final String a2 = d.a("adaptive_media_android_v3_star_3363");
                switch (a2.hashCode()) {
                    case -395080240: {
                        if (a2.equals("control_2")) {
                            n = 0;
                            break;
                        }
                        break;
                    }
                    case 3075958: {
                        if (a2.equals("dark")) {
                            n = 1;
                            break;
                        }
                        break;
                    }
                    case 1926928973: {
                        if (a2.equals("filled_circle")) {
                            n = 2;
                            break;
                        }
                        break;
                    }
                    case -1360216880: {
                        if (a2.equals("circle")) {
                            n = 3;
                            break;
                        }
                        break;
                    }
                    case 1337878494: {
                        if (a2.equals("circle_full_square")) {
                            n = 4;
                            break;
                        }
                        break;
                    }
                    case 601107459: {
                        if (a2.equals("big_outline")) {
                            n = 5;
                            break;
                        }
                        break;
                    }
                    case -166616431: {
                        if (a2.equals("big_outline_full_square")) {
                            n = 6;
                            break;
                        }
                        break;
                    }
                }
                switch (n) {
                    default: {
                        return 0;
                    }
                    case 0: {
                        return 2131492919;
                    }
                    case 1: {
                        return 2131492921;
                    }
                    case 2: {
                        return 2131492923;
                    }
                    case 3:
                    case 4: {
                        return 2131492917;
                    }
                    case 5:
                    case 6: {
                        return 2131492915;
                    }
                }
                break;
            }
            case 0: {
                return 0;
            }
            case 1: {
                return 2131492919;
            }
            case 2: {
                return 2131492913;
            }
            case 3: {
                return 2131492911;
            }
        }
    }
}
