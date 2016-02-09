import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;
import java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {
    staticFileLocation("/public");

    get("/", (request, response) -> {
      HashMap model = new HashMap();
      return new ModelAndView(model, "templates/pingpong.vtl");
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      HashMap model = new HashMap();
      String userNumber = request.queryParams("user-number");
      Integer userInt = Integer.parseInt(userNumber);
      ArrayList<Object> results = makeArr(userInt);
      
      model.put("userNumber", results);
      return new ModelAndView(model, "templates/pingpong.vtl");
    }, new VelocityTemplateEngine());
  }

    public static ArrayList makeArr(Integer countTo){
      ArrayList<Object> countArr = new ArrayList<Object>();{
        for(Integer i=1; i<=countTo; i++){
          if(i % 15 == 0){
            countArr.add("pingpong");
          }else if (i % 5 ==0) {
            countArr.add("pong");
          }else if (i % 3 == 0){
            countArr.add("ping");
          }else {
            countArr.add(i.toString());
          }
        }
          return countArr;
      }
    }
  }
