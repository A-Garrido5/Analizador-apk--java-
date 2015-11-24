import java.util.Arrays;
import com.twitter.library.api.moments.d;
import com.twitter.library.api.moments.Moment;
import com.twitter.library.api.moments.b;
import com.twitter.android.moments.viewmodels.MomentTweetTextPage;
import com.twitter.library.api.moments.ThemeData;
import com.twitter.android.moments.viewmodels.MomentTweetPhotoPage;
import com.twitter.library.provider.ad;
import com.twitter.library.api.Entity;
import com.twitter.library.api.ag;
import com.twitter.library.api.MediaEntityList;
import com.twitter.library.api.ax;
import com.twitter.library.api.MediaEntity$Type;
import com.twitter.internal.android.util.Size;
import com.twitter.library.api.af;
import com.twitter.android.moments.viewmodels.Capsule;
import com.twitter.library.api.moments.CropData;
import com.twitter.android.moments.viewmodels.MomentPage;
import com.twitter.library.provider.Tweet;
import com.twitter.library.api.TweetEntities;
import com.twitter.library.api.MediaEntity;
import java.util.List;
import com.twitter.android.moments.viewmodels.CarouselImageHeroMomentModule;
import com.twitter.android.moments.viewmodels.ListMomentModule;

// 
// Decompiled by Procyon v0.5.30
// 

public class gt
{
    public static final ListMomentModule A;
    public static final ListMomentModule B;
    public static final CarouselImageHeroMomentModule C;
    public static final CarouselImageHeroMomentModule D;
    public static final CarouselImageHeroMomentModule E;
    public static final List F;
    public static final List G;
    public static final MediaEntity a;
    public static final MediaEntity b;
    public static final MediaEntity c;
    public static final MediaEntity d;
    public static final MediaEntity e;
    public static final TweetEntities f;
    public static final MediaEntity g;
    public static final TweetEntities h;
    public static final TweetEntities i;
    public static final Tweet j;
    public static final Tweet k;
    public static final Tweet l;
    public static final Tweet m;
    public static final Tweet n;
    public static final MomentPage o;
    public static final MomentPage p;
    public static final MomentPage q;
    public static final CropData r;
    public static final MomentPage s;
    public static final MomentPage t;
    public static final MomentPage u;
    public static final MomentPage v;
    public static final MomentPage w;
    public static final Capsule x;
    public static final Capsule y;
    public static final Capsule z;
    
    static {
        a = new MediaEntity(new af().a(99L).a(Size.a(1200, 899)).a(MediaEntity$Type.b).a("http://static4.businessinsider.com/image/525d58a369beddee57df33d5-1200-924/dick-costolo-24.jpg"));
        b = new MediaEntity(new af().a(1L).a(Size.a(5212, 3468)).a(MediaEntity$Type.b).a("http://upload.wikimedia.org/wikipedia/commons/8/85/Dick_Costolo.jpg"));
        c = new MediaEntity(new af().a(2L).a(Size.a(1645, 1097)).a(MediaEntity$Type.b).a("https://thenypost.files.wordpress.com/2013/10/twittermain.jpg"));
        d = new MediaEntity(new af().a(3L).a(Size.a(400, 300)).a(MediaEntity$Type.b).a("https://tctechcrunch2011.files.wordpress.com/2011/06/dick-costolo.jpeg"));
        e = new MediaEntity(new af().a(4L).a(Size.a(2200, 1186)).a(MediaEntity$Type.b).a("http://www.google.com/nexus/new/images/nexus6/N6-moreeverything-1600.jpg"));
        f = (TweetEntities)new ax().a((MediaEntityList)((ag)((ag)((ag)((ag)new ag().a(gt.b)).a(gt.c)).a(gt.d)).a(gt.a)).f()).f();
        g = new MediaEntity(new af().a(Size.a(600, 450)).a(MediaEntity$Type.b).a("https://pbs.twimg.com/media/B-BE9iwCEAM8NW9.jpg"));
        h = (TweetEntities)new ax().a((MediaEntityList)((ag)new ag().a(gt.g)).f()).f();
        i = (TweetEntities)new ax().a((MediaEntityList)((ag)new ag().a(gt.e)).f()).f();
        j = new ad().e(1L).d("Bill Clinton").f("billclinton").a("Welcome to @Twitter, @POTUS! One question: Does that username stay with the office? #askingforafriend").a();
        k = new ad().e(2L).d("Barack Obama").f("POTUS").a("Good question, @billclinton. The handle comes with the house. Know anyone interested in @FLOTUS?").a();
        l = new ad().e(3L).d("User Name").f("username").a("This is an image tweet! Hopefully the layout looks decent").a(gt.f).a();
        m = new ad().e(4L).d("dick costolo").f("dickc").a("Yesterday's conversation:\nMe: so is it broken?\nNurse: see what you think (shows me x-Ray)\nMe: I'm guessing that's bad ").a(gt.h).a();
        n = new ad().e(5L).d("User Name").f("username").a("This text won't be shown").a(gt.i).a();
        o = new MomentTweetPhotoPage(gt.n, true, gt.e.id, null);
        p = new MomentTweetTextPage(gt.j, false, new ThemeData(-16777216, -1));
        q = new MomentTweetTextPage(gt.k, false, new ThemeData(-1, -9154902));
        r = (CropData)new b().a(600).b(0).c(400).d(600).a(gt.a.size).f();
        s = new MomentTweetPhotoPage(gt.l, false, gt.b.id, null);
        t = new MomentTweetPhotoPage(gt.l, false, gt.c.id, null);
        u = new MomentTweetPhotoPage(gt.l, false, gt.d.id, null);
        v = new MomentTweetPhotoPage(gt.l, false, gt.a.id, gt.r);
        w = new MomentTweetPhotoPage(gt.m, false, gt.g.id, null);
        x = new com.twitter.android.moments.viewmodels.b().a((Moment)new d().a("Kevin's Moment").b(true).d("This is a description of something. What am I describing?").f()).a(Arrays.asList(gt.o, gt.p, gt.w, gt.q, gt.s, gt.t, gt.u, gt.v)).a(9).a();
        y = new com.twitter.android.moments.viewmodels.b().a((Moment)new d().a("A Heroic Moment").a(true).b(true).f()).a(Arrays.asList(gt.o)).a();
        z = new com.twitter.android.moments.viewmodels.b().a((Moment)new d().a("A Subscribable Moment").a(true).f()).a(Arrays.asList(gt.o)).a();
        A = new ListMomentModule(gt.x.a(), "https://recodetech.files.wordpress.com/2014/02/dick_costolo_1.png?w=300", Size.a(300, 255));
        B = new ListMomentModule(gt.z.a(), "http://www.afroreports.com/images/twitter.jpg", Size.a(630, 420));
        C = new CarouselImageHeroMomentModule(gt.z.a(), gt.a, gt.r);
        D = new CarouselImageHeroMomentModule(gt.x.a(), gt.a, gt.r);
        E = new CarouselImageHeroMomentModule(gt.y.a(), gt.b, null);
        F = Arrays.asList(gt.B, gt.A, gt.A, gt.B, gt.A);
        G = Arrays.asList(gt.C, gt.D, gt.C, gt.C, gt.C);
    }
}
