public class MethodAboutString {
    public static void main(String[] args) {
        MethodAboutString test = new MethodAboutString();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
        test.test7();
        test.test8();
        test.test9();
        test.test10();
        test.test11();
        test.test12();
        test.test13();
        test.test14();
    }

    //把String和int，float，double的互相转化
    public void test1() {
        int a;
        float b;
        double c;
        String d = "1234566";
        String e = "123.456789";
        a = Integer.parseInt(d);
        b = Float.parseFloat(e);
        c = Double.parseDouble(e);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        d = e.toString();
        System.out.println(d);
    }

    //使用char数组建立一个String对象
    public void test2() {
        char[] a = {'a','b','c','d'};
        String b = new String(a);
        String c = new String(a,1,2);
        System.out.println(a);
        System.out.println(c);
    }

    //获取字符串长度
    public void test3() {
        String a = "123456789";
        System.out.println(a.length());
    }

    //取得字符串某一位置的字符
    public void test4() {
        String a = "123456789";
        System.out.println(a.charAt(3));
        System.out.println(a.charAt(8));
        System.out.println(a.subSequence(2,6));
    }

    //获取字符串某位置的字串
    public void test5() {
        String a = "1234567890";
        System.out.println(a.substring(5));
        System.out.println(a.substring(3,8));
    }


    //比较两个字符串
    public void test6() {
        String a = "abcdefghijk";
        String b = "abcdefghijk";
        String c = "abceefghijk";
        String d = "ABCDEFGHIJK";
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(d));
        System.out.println(c.compareTo(a));
        System.out.println(d.compareTo(a));
        System.out.println(d.compareToIgnoreCase(a));
    }

    //查找字符串
    public void test7() {
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "12345678987654321";
        //查找字符和字符串
        System.out.println(a.indexOf('b'));
        System.out.println(a.indexOf("efg"));
        System.out.println(a.indexOf("xyz"));

        //从指定位置，从前面和从后面查找
        System.out.println(b.indexOf("234",9));
        System.out.println(b.lastIndexOf("234",9));
    }

    //大小写转换
    public void test8() {
        String a = "aBcDeFGhIjKlM";
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
    }

    //去空格
    public void test9() {
        String a = "  kmcdkjdck  ";
        System.out.println(a);
        System.out.println(a.trim());
    }

    //切割字符
    public void test10() {
        String a = "a,bcd,efgh,ijk";
        for (String b: a.split(",")) {
            System.out.println(b);
        }
    }


    //替换字符串中所有的旧字符
    public void test11() {
        String a = "anvssjAnvsdkjssmAjemo;fvAjdmnfsoAd;jvnejf;dnjef;sdj;skfv;svk;";
        System.out.println(a.replace(';','1'));
        System.out.println(a.replaceAll("ss","99"));
        System.out.println(a.replaceFirst("ss", "GIAO"));

    }

    //判断字符串是否以什么开始结束
    public void test12() {
        String a = "abcdefghijkl";
        System.out.println(a.startsWith("abc"));
        System.out.println(a.startsWith("bcd"));
        System.out.println(a.startsWith("bcd",1));
        System.out.println(a.endsWith("kl"));
        System.out.println(a.endsWith("lk"));
    }

    //转化为char数组
    public void test13() {
        String a = "abcdefg";
        char[] b = a.toCharArray();
        for(char c : b) {
            System.out.println(c);
        }
    }

    //是否包含字符
    public void test14() {
        String a = "axnwdcnwndxj";
        System.out.println(a.contains("dcn"));
        System.out.println(a.contains("dcd"));
    }





}
