package fr.CodeGrandoz.json;

import static fr.CodeGrandoz.utils.References.*;

import java.io.*;

import javax.json.*;

import fr.CodeGrandoz.json.variables.Player;

public class JSONReader {
	
	public static Player getPlayer(String pseudo) {
		
		try {
			
			InputStream fis = new FileInputStream(JSON_MONEY_FILE);
			JsonReader jsonReader = Json.createReader(fis);
			
			JsonObject jsonObject = jsonReader.readObject();
			
			jsonReader.close();
			fis.close();
			
			Player player = new Player(jsonObject.getString("player"), jsonObject.getInt("money"));
			
			if(player.getPseudo().equals(null))
				JSONWriter.setPlayer(new Player(pseudo, 0));
			
			return player;
		} catch (IOException e) {
			
			e.printStackTrace();
			return null;
		}
	}
}
