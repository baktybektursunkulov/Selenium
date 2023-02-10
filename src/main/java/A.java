

import java.io.IOException;

public class A {
    public static void main(String[] args) throws InterruptedException, IOException {

//        System.setProperty("webdriver.gecko.driver","geckodriver-v0.31.0-win64\\geckodriver.exe");
//
//        WebDriver webdriver=new FirefoxDriver();
//        webdriver.get("https://krisha.kz/a/show/676830679");
//
//        Thread.sleep(2000);
//        WebElement webElement=webdriver.findElement(By.className("show-phones"));
//        webElement.click();
//        Document doc= Jsoup.connect("https://krisha.kz/a/show/674885198").get();
//        Element element=doc.getElementById("jsdata");
//        String s= String.valueOf(element);
//        System.out.println(s);
//        String k="";
//        int d = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i)=='"'&&s.charAt(i+1)=='l'&&s.charAt(i+2)=='a'&&s.charAt(i+3)=='t'&&s.charAt(i+4)=='"'){
//                d=i+6;
//            }
//        }
//        for (int i = d; i < s.length(); i++) {
//            if (s.charAt(i)==',')break;
//            k+=s.charAt(i);
//        }
//        System.out.println(k);
//        System.out.println(s.substring(d,d+15));
//        String k1="";
//        int d1 = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i)=='"'&&s.charAt(i+1)=='l'&&s.charAt(i+2)=='o'&&s.charAt(i+3)=='n'&&s.charAt(i+4)=='"'){
//                d1=i+6;
//            }
//        }
//        for (int i = d1; i < s.length(); i++) {
//            if (s.charAt(i)==',')break;
//            k1+=s.charAt(i);
//        }
//        System.out.println(k1);
//        System.out.println(s.substring(d1,d1+15));

//        String s="5 bj 8";
//        int i = 0;
//        String d="";
//        while (true) {
//            if (s.charAt(i) == ' ') {
//
//                break;
//            }
//            d+=s.charAt(i);
//            i++;
//        }
//        i = i + 1;
//        String area = "";
//        while (i<s.length()) {
//            if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'
//                    ||s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9')
//                area+=s.charAt(i);
//            i++;
//        }
//        System.out.println(area+"jklj");
//        System.out.println(d+"hjkgj");
////        System.out.println(doc.getElementsByClass(" control-label").text());
//                for (Element inputElement : inputElements) {
//                    System.out.println(inputElement.text());
//                }

//
//        Elements inputElements = doc.getElementsByClass("offer__advert-short-info");
       // Elements inputElements = doc.getElementsByClass(" control-label");

//
//        Elements elements=doc.getElementsByClass("offer__info-title");
//        String[] s_elem=new String[elements.size()];
//        int iterator=0;
//        for (Element inElement : elements) {
//            s_elem[iterator]=inElement.text();
//            iterator++;
//        }
//        int iteratorx=0;
//        String[] s_elemx=new String[elements.size()];
//        for (Element inputElement : inputElements) {
//            s_elemx[iteratorx]=inputElement.text();
//            System.out.println(s_elemx[iteratorx]);
//            iteratorx++;
//        }
//        System.out.println("Tip doma");
//        for(int itip=0;itip<elements.size();itip++){
//            System.out.println(itip);
//            String tip = s_elem[itip];
//            if(tip.equals("Город"))
//                continue;
//            //for (Element inputElement : inputElements) {
//                String s =s_elemx[itip];
//
//                if(tip.equals("Тип дома")){
//
//                    System.out.println("Тип дома"+s);
//
//                }
//
//                else if(tip.equals("Жилой комплекс")){
//
//                    System.out.println("Жилой комплекс"+s);
//                }
//                else if(tip.equals("Парковка")){
//                    System.out.println("Парковка"+s);
//                }
//                else if(tip.equals("Состояние")){
//                    System.out.println("Состояние"+s);
//                }
//                else if(tip.equals("Интернет")){
//                    System.out.println("Интернет"+s);
//                }
//                else if(tip.equals("Санузел")){
//                    System.out.println("Санузел"+s);
//                }
//                else if(tip.equals("Балкон")){
//                    System.out.println("Балкон"+s);
//                }
//                else if(tip.equals("Пол")){
//                    System.out.println("Пол"+s);
//                }
//                else  if(tip.equals("Мебель")){
//                    System.out.println("Мебель"+s);
//                }
//                else  if(tip.equals("Телефон")){
//                    System.out.println("Телефон"+s);
//                }
//                else  if(tip.equals("Год постройки")){
//                    //ho_ad.setConstruction_year(Integer.parseInt(s));
//                    System.out.println("Год постройки"+s);
//                }
//                else if(tip.equals("Дверь")){
//
//                    System.out.println("Дверь"+s);
//                //}
//            }
//
//        }
//        System.out.println("god postroikiy");
//        String contact=doc.getElementsByClass("label-user-identified-specialist").first().text();
//        System.out.println(contact);

//                for (Element inputElement : elements) {
//                    if(inputElement.text().equals("Город"))
//                        continue;
//                    System.out.println(inputElement.text());
//                }
      //  System.out.println(document.getElementsByClass("offer__contacts-phones").first().child(1).text());


//        Document doc;
//        try {
//            doc =  Jsoup.connect("https://krisha.kz/a/show/676830679").get();
//            String r = doc.getElementsByClass("offer__advert-title").first().child(0).text();
//            String room = r.substring(0, 1);
//            System.out.println(room);
//            int i = 0;
//            while (true) {
//                if (r.charAt(i) == ',') {
//                    break;
//                }
//                i++;
//            }
//            i = i + 1;
//            String area = "";
//            while (true) {
//                if (r.charAt(i) == ',') {
//                    break;
//                }
//                i++;
//                area += r.charAt(i);
//
//            }
//            i = i + 1;
//            System.out.println(area);
//            area = area.substring(0, 3);
//            System.out.println(area);
//            String floor="";
//                 while(true){
//                  if(r.charAt(i)==','){
//                    break;
//                  }
//                     floor+=r.charAt(i);
//                  i++;
//                }
//                i=i+2;
//            System.out.println(floor);
//                String max_floor=floor.substring(3,4);
//            System.out.println(max_floor);
//                floor=floor.substring(1,2);
//            System.out.println(floor);
//
//            String street="";
//            while(i<r.length()){
//                street+=r.charAt(i);
//                i++;
//            }
//            System.out.println(street);
//           String street_num=street.substring(street.length()-4,street.length());
//            street=street.substring(0,street.length()-5);
//            int k=0;
//            String kl=doc.getElementsByClass("offer__price").text();
//            String kli=kl.substring(0,10);
//            String st = "";
//            while(k<kli.length()){
//                if(kli.charAt(k)!=' '){
//                    st+=kli.charAt(k);
//                }
//                k++;
//            }
//
//            System.out.println(st);
//
//            String  kll[]=kli.split(" ");
//            String o="";
//          //  System.out.println(kll);
//            for (String word : kll) {
//              o+=word;
//            }
//            //`````````````````````````System.out.println(Double.parseDouble(kll.toString()));
//           // System.out.println(o);
//            double d=Double.parseDouble(o);
//            Elements inputElements = doc.getElementsByClass("offer__advert-short-info");
//          int h=0;
//                for (Element inputElement : inputElements) {
//                    if (h == 1) {
//                        System.out.println(inputElement.text());
//                    }
//                    if(h==4) {
//                        String jk = inputElement.text();
//                        System.out.println(jk);
//                    }
//
//                    h++;
//                }
//            //System.out.println(d+90);
//
//
//
//        }
//    catch (
//    IOException ex) {
//        System.out.println("Error NUll");
//    }
////        System.out.println(document.getElementsByClass("offer__contacts-phones").first().child(0).text());
//        System.out.println(document.getElementsByClass("offer__contacts-phones").first().child(1).text());
//        Document doc;
//
//            try {
//                doc = Jsoup.connect("https://krisha.kz/a/show/676830679").get();
//                System.out.println(doc.getElementsByClass("offer__advert-title").first().child(0).text());
//                System.out.println(doc.getElementsByClass("offer__price").first().text());
//                System.out.println(doc.getElementsByClass("offer__location offer__advert-short-info").first().child(0).text());
//                Elements inputElements = doc.getElementsByClass("offer__advert-short-info");
//                for (Element inputElement : inputElements) {
//                    System.out.println(inputElement.text());
//                }
//                System.out.println(doc.getElementsByClass("owners__label owners__label--transparent label-user-identified-specialist").first().text());
//               // System.out.println(doc.getElementsByClass("owners__name").first().text());
//                //System.out.println(doc.getElementsByClass("offer__contacts-phones").first().child(0).text());
//                System.out.println(doc.getElementsByClass("offer__parameters").first().child(0).child(1).text());
//                System.out.println(doc.getElementsByClass("offer__parameters").first().child(1).child(1).text());
//                System.out.println(doc.getElementsByClass("a-text a-text-white-spaces").first().text());
//                System.out.println();
//            } catch (IOException ex) {
//                System.out.println("Error Null");
//            }

    }

}
