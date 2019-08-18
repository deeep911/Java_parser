package information;


//import com.fasterxml.jackson.core.JsonParseException;
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.DeserializationFeature;
//import com.fasterxml.jackson.databind.JsonMappingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.io.*;
//import java.util.List;
//public class Main{
//    public static void main (String [] args){
//
//        try {
//            ObjectMapper mapper = new ObjectMapper();
//            mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
//            InputStream inputStream = new FileInputStream(new File("/Users/rajdeepbhasin/Downloads/FinalFile/src/test/java/Tweet.json"));
//            TypeReference <List<Details>> typeReference = new TypeReference<List<Details>>(){};
//            List<Details> details = mapper.readValue(inputStream, typeReference);
//            if (details != null)
//                for(Details d: details)
//            {
//                System.out.println("Nam is "+ d.getCreated_at());
//
//
//            }
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
//        catch (JsonMappingException e){
//            e.printStackTrace();
//        }
//        catch (JsonParseException e){
//            e.printStackTrace();
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }
//
//    }
//}

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String x[]){
        String FileName="/Users/rajdeepbhasin/Downloads/FinalFile/src/test/java/Tweet.json";
        try {
            ArrayList<JSONObject> jsons=ReadJSON(new File("/Users/rajdeepbhasin/Downloads/FinalFile/src/test/java/Tweet.json"),"UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public static synchronized ArrayList<JSONObject> ReadJSON(File MyFile,String Encoding) throws FileNotFoundException, ParseException {
        Scanner scn=new Scanner(MyFile,Encoding);
        ArrayList<JSONObject> json=new ArrayList<JSONObject>();
//Reading and Parsing Strings to Json
        while(scn.hasNext()){
            JSONObject obj= (JSONObject) new JSONParser().parse(scn.nextLine());
            json.add(obj);
        }
//Here Printing Json Objects
        for(JSONObject obj : json){
            System.out.println((String)obj.get("date")+" , "+(String)obj.get("screen_name"));
        }
        return json;
    }

}