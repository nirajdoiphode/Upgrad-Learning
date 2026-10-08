package jsonReading;
import java.io.File;
import java.util.List;

import collection_frmwk.Food;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ReadJSON {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        List<Food> items=null;
        try {
            items = mapper.readValue(
                    //new File("D:\\EclipseJavaprogs2\\Test\\json\\employee.json"),	      //absolute path
                   // new File("src/main/java/collection_frmwk/players.json"),									  //relative path
                    new File("src/main/java/collection_frmwk/fastFood.json"),
                    new TypeReference< List<Food>>() {}
            );



        } catch (Exception e) {
            e.printStackTrace();
        }

        for(Food x:items)
            System.out.println(x);

    }

}
