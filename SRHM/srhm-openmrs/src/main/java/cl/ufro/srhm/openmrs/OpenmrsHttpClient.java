package cl.ufro.srhm.openmrs;

public interface OpenmrsHttpClient {
	
	String getPerson(String name);

	String getPacientes(String query);

	String getEncounters(String patientUUID);
	
	String getVisits(String patientUUID);
}
