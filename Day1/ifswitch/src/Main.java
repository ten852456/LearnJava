public class Main {
    public static String stormType(int speed){
        String stormname = "";
        if (speed < 63){
            stormname = "Depression";
        } else if (speed >= 63 && speed < 108){
            stormname = "Tropical Storm";
        }else stormname = "Typhoon";
        return stormname;
    }
    public static String zodiac(int buddhistyear){
        int z=buddhistyear%12;
        String s="";
        switch (z){
        case 0: s="มะเส็ง";break;
        case 1: s="มะเมีย";break;
        case 2: s="มะแม";break;
        case 3: s="วอก";break;
        case 4: s="ระกา";break;
        case 5: s="จอ";break;
        case 6: s="กุน";break;
        case 7: s="ชวด";break;
        case 8: s="ฉลู";break;
        case 9: s="ขาน";break;
        case 10: s="เถาะ";break;
        case 11: s="มะโรง";break;}
        return s;
    }
    public static void main(String[] args) {
	// write your code here
        System.out.println(stormType(100));
        System.out.println(zodiac(2556));
    }
}
