package arrayofhash;
import java.util.ArrayList;
import java.util.HashMap;
public class arrayofHash {

        public static void main(String[] args) {
            ArrayList<HashMap<String, String>> myArrayMap = getHashMaps();

            for (int i = 0; i < myArrayMap.size(); i++) {
                System.out.println(myArrayMap.get(i).get("Key1") + ","
                        + "" + myArrayMap.get(i).get("Key2") + ","
                        + "" + myArrayMap.get(i).get("Key3") + ","
                        + "" + myArrayMap.get(i).get("Key4"));

                System.out.println(); // used as new blank line
            }
        }

    private static ArrayList<HashMap<String, String>> getHashMaps() {
        HashMap<String,String> myMap = new HashMap<String, String>();
        HashMap<String,String> myMap2 = new HashMap<String, String>();

        ArrayList<HashMap<String , String>> myArrayMap = new ArrayList<HashMap<String,String>>();

        myMap.put("Key1",   "Val0");
        myMap.put("Key2",   "Val1");
        myMap.put("Key3",   "Val2");
        myMap.put("Key4",   "Val3");

        myArrayMap.add(myMap);
        myMap2.put("Key1",   "Val4");
        myMap2.put("Key2",   "Val5");
        myMap2.put("Key3",   "Val6");
        myMap2.put("Key4",   "Val7");
        myArrayMap.add(myMap2);
        return myArrayMap;
    }
}
