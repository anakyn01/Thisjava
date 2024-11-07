package base.json;

//import org.json.simple.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Json {
	public static void main(String[] args) {
		JSONObject jsonob= new JSONObject();
		JSONArray jsonarr = new JSONArray();
		
		for  (int i=1; i < 3; i++) {
			
			JSONObject data = new JSONObject();
			data.put("이름", "인간_"+i);
			data.put("나이", 10+i);
			jsonarr.add(data);
		}
		jsonob.put("사람들", jsonarr);
		System.out.println(jsonob);
	}

}
