import java.util.Scanner;

public class Main {
    public static int rectangle (int width,int height) {
        return width * height;
    }
    public static int square (int width,int height){
        return width * height;
    }

    public static void main(String[] args) {
	// write your code here
        //แบบที่ 1
        System.out.println(3*5);// พิมพ์ sout กด tab หรือ enter
        //แบบที่ 2
        System.out.println("Area = " + 3*5); // + คือเอา3*5 ต่อ string
        //แบบที่ 3
        int widht;//ตั้งค่าตัวแปร รับค่าได้ -2^31 to 2^31-1
        int height;
        int area;
//        ไม่รับค่าตัวแปร
//        widht=3;
//        height=5;
//        area = widht*height;
//        System.out.println("area = "+area);
//         รับค่าตัวแปร
        Scanner in = new Scanner(System.in);// in เป็นpackage ในนการรับค่า
        System.out.print("Enter Widht: ");
        widht = in.nextInt();//in รับค่าใส่ package
        System.out.print("Enter Height: ");
        height = in.nextInt();
//        area=widht*height;
        area = rectangle(widht,height); //เรียกใช้ function
        System.out.println("area ("+widht+"x"+height+") = "+area);// + คือตัวเชื่อม
    }
}
