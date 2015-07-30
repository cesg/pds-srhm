package cl.ufro.srhm.openmrs;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class HttpClientTest {

	@Ignore
	@Test
	public void test() {
		UnirestHttpClient httpClient = new UnirestHttpClient();
		System.out.println(httpClient.getPerson("Super"));
	}

	@Ignore
	@Test
	public void testEncounter() {
		UnirestHttpClient httpClient = new UnirestHttpClient();
		System.out.println(httpClient.getEncounters("26cb4460-e967-4e5c-a582-44963f81f208"));
	}

    @Ignore
	@Test
	public void testVisit() {
		UnirestHttpClient httpClient = new UnirestHttpClient();
		System.out.println(httpClient.getVisits("dda9727b-1691-11df-97a5-7038c432aabf"));
	}

	@Test
    public void testPacientes() {
        UnirestHttpClient httpClient = new UnirestHttpClient();
        System.out.print(httpClient.getPacientes("Juan"));
    }
}
