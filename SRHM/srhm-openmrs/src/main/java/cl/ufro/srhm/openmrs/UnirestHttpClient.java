package cl.ufro.srhm.openmrs;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestHttpClient implements OpenmrsHttpClient {

    private static final Logger _logger = LoggerFactory.getLogger(UnirestHttpClient.class);

    private static final String AUTH_USER = "admin";
    private final static String AUTH_PASSWORD = "Secret123";
    private static final String OPENMRS_REST_URL = "http://localhost:8080/openmrs/ws/rest/v1/";

    public String getPerson(String name) {
        try {
            HttpResponse<JsonNode> response = Unirest.get(OPENMRS_REST_URL.concat("person"))
                    .basicAuth(AUTH_USER, AUTH_PASSWORD).queryString("q", name).asJson();

            _logger.debug("getUser(String name) Status-text:{}", response.getStatusText());

            if (response.getStatus() != 200) {
                return response.getStatusText();
            }

            Unirest.shutdown();

            return response.getBody().toString();

        } catch (IOException | UnirestException e) {
            _logger.error("", e);
        }
        return null;
    }

    @Override
    public String getPacientes(String query) {
        String jsonResponse = "";

        try {
            HttpResponse<JsonNode> response = Unirest.get(OPENMRS_REST_URL.concat("patient"))
                    .basicAuth(AUTH_USER, AUTH_PASSWORD)
                    .queryString("q", query)
                    .asJson();
            _logger.debug("getPacientes() Status-text:{}", response.getStatusText());

            if (response.getStatus() != 200) {
                jsonResponse = response.getStatusText();
            } else {
                jsonResponse = response.getBody().toString();
            }
        } catch (UnirestException e) {
            _logger.error("", e);
        }

        return jsonResponse;
    }

    @Override
    public String getEncounters(String patientUUID) {
        try {
            HttpResponse<JsonNode> response = Unirest.get(OPENMRS_REST_URL.concat("encounter"))
                    .basicAuth(AUTH_USER, AUTH_PASSWORD)
                    .queryString("patient", patientUUID)
                    .asJson();

            _logger.debug("getEncounters(String patientUUID) Status-text:{}", response.getStatusText());

            if (response.getStatus() != 200) {
                return response.getStatusText();
            }

//			Unirest.shutdown();

            return response.getBody().toString();

        } catch (/*IOException|*/UnirestException e) {
            _logger.error("", e);
        }
        return null;
    }

    @Override
    public String getVisits(String patientUUID) {
        try {
            HttpResponse<JsonNode> response = Unirest.get(OPENMRS_REST_URL.concat("visit"))
                    .basicAuth(AUTH_USER, AUTH_PASSWORD).queryString("patient", patientUUID).asJson();

            _logger.debug("getVisits(String patientUUID) Status-text:{}", response.getStatusText());

            if (response.getStatus() != 200) {
                return response.getStatusText();
            }

//			Unirest.shutdown();

            return response.getBody().toString();

        } catch (/*IOException|*/UnirestException e) {
            _logger.error("", e);
        }
        return null;
    }
}
