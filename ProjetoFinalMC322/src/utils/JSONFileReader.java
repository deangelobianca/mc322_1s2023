package src.utils;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JSONFileReader {
    public static JSONObject readJSONFromFile(String filePath) throws IOException, JSONException {
        StringBuilder jsonString = new StringBuilder();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                jsonString.append(line);
            }
        }

        return new JSONObject(jsonString.toString());
    }

    public static void main(String[] args) {
        String fileName = "data.json"; // Substitua pelo caminho do seu arquivo JSON

        try {
            JSONObject jsonObject = readJSONFromFile(fileName);

            // Utilize o objeto JSONObject conforme necessário
            System.out.println(jsonObject.toString());
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }
}
