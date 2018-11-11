package fr.CodeGrandoz.json;

import static fr.CodeGrandoz.utils.References.*;

import java.io.*;

import javax.json.*;

import fr.CodeGrandoz.json.variables.Player;

public class JSONWriter {
	
	public static void setPlayer(Player p) {
		
		try {
			
			JsonObjectBuilder playerBuilder = Json.createObjectBuilder();
			
			playerBuilder.add("pseudo", p.getPseudo()).add("money", p.getMoney());
			
			JsonObject playerJsonObject = playerBuilder.build();
			
			OutputStream os = new FileOutputStream(JSON_MONEY_FILE);
			JsonWriter jsonWriter = Json.createWriter(os);
			
			jsonWriter.writeObject(playerJsonObject);
			jsonWriter.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
