import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> ho_ads = new ArrayList();
        ho_ads.add("3121");
        ho_ads.add("1232");
        List<String> ho_ad = new ArrayList();
        ho_ad.add("baktybek");
        ho_ad.add("1;ljkl;");
        ho_ads.addAll(ho_ad);
        System.out.println(ho_ads.get(3));
        System.out.println(ho_ads.size());
        int d = 2 * 18;
        int i = d - 18;
        int j = d - 18;
        int k = 1;
//        while (ho_ads.size() < j && ho_cat.size() > k) {
//            if (ho_ads.size() - j < 18) {
//                int l = 0;
//                while (l <)
//                    ho_ads.addAll(ho_ad_Service.find(ho_cat.get(k)));
//            }
//        }
    }
}
