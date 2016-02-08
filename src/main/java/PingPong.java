import static spark.Spark.*;
import java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {}

    public static ArrayList makeArr(Integer countTo){
      ArrayList<Object> countArr = new ArrayList<Object>();{
        for(Integer i=1; i<=countTo; i++){
          if(i%15 == 0){
            countArr.add("pingpong");
          }else if (i%5 ==0) {
            countArr.add("pong");
          }else if (i%3 == 0){
            countArr.add("ping");
          }else {
            countArr.add(i.toString());
          }
        }
          //System.out.println(countArr);
          return countArr;
      }
    }
  }
