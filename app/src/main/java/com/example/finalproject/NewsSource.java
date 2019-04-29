import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Personalized news retrieval.
 */
public class NewsEvents {
    /**
     * Makes an instance of NewsEvents.
     */
    public NewsEvents() {

    }

    /**
     * Retrieve the title of a news event.
     * @param json
     * @return
     */
    public static String getEventTitle(final java.lang.String json) {
        if (json == null) {
            return null;
        }

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(json).getAsJsonObject();

        if (result.get("data") == null) {
            return null;
        }

        JsonObject data = result.get("data").getAsJsonObject();

        if (data.get("Events") == null) {
            return null;
        }

        JsonObject events = data.get("Events.java").getAsJsonObject();

        if (events.get("text") == null) {
            return null;
        }

        JsonArray title = events.get("text").getAsJsonArray().getAsString();

        return title;
    }


    /**
     * Retrieve the name and basic description of someone's birth.
     * @param json
     * @return
     */
    public static String getBirthName(final java.lang.String json) {
        if (json == null) {
            return null;
        }

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(json).getAsJsonObject();

        if (result.get("data") == null) {
            return null;
        }

        JsonObject data = result.get("data").getAsJsonObject();

        if (data.get("Births") == null) {
            return null;
        }

        JsonObject births = data.get("Births").getAsJsonObject();

        if (births.get("text") == null) {
            return null;
        }

        JsonArray birthPerson = birthPerson.get("text").getAsJsonArray().getAsString();

        return birthPerson;
    }

    /**
     *
     * @param json
     * @return
     */
    public static String getDeathName(final java.lang.String json) {
        if (json == null) {
            return null;
        }

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(json).getAsJsonObject();

        if (result.get("data") == null) {
            return null;
        }

        JsonObject data = result.get("data").getAsJsonObject();

        if (data.get("Deaths") == null) {
            return null;
        }

        JsonObject deaths = data.get("Deaths").getAsJsonObject();

        if (deaths.get("text") == null) {
            return null;
        }

        JsonArray deathName = deaths.get("text").getAsJsonArray().getAsString();

        return deathName;
    }
}
