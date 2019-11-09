package classbook.shapes.six;
import java.util.Scanner;

/**
 * @author :lfm
 * description:抽象类
 * Date:2019-11-7
 */
class Square extends Shapes {

    void draw(){
      System.out.println("你好,美女！");
    }

    void erase(){
        System.out.println("你好，帅哥！");
    }

}
public class Circle extends Shapes {
    void draw(){
        System.out.println("你好，大爷！");
    }
    void erase(){
        System.out.println("你好，大妈！");
    }
}


abstract class Shape{
    /**
     *
     */
    abstract void draw();
    abstract void erase();
}

public class Shapes {
    int number;
    public static void main(String[] args){
        Square square = new Square();
        Circle circle = new Circle();
        System.out.println("输入数字0至3）");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        switch (number){
            case 0:
                square.draw();
                break;
            case 1:
                square.erase();
                break;
            case 2:
                circle.draw();
                break;
            case 3:
                circle.erase();
                break;
            default:
                System.out.println("数字有误，结束进程！");
        }

    }
}
