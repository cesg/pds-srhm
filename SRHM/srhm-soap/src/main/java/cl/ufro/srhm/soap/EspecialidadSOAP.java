package cl.ufro.srhm.soap;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import cl.ufro.srhm.orm.Especialidad;
import cl.ufro.srhm.soap.vo.EspecialidadVO;


public class EspecialidadSOAP {
	
	public String obtenerEspecialidades() {
		
		String resultado = "No especialidades";
		
		try {
			List<Especialidad> lista =	cl.ufro.srhm.orm.EspecialidadDAO.queryEspecialidad(null, null);

			Gson gson = new Gson();
			
			List<EspecialidadVO> especialidadesVO = new ArrayList<>();
			
			for (Especialidad especialidad : lista) {
				especialidadesVO.add(EspecialidadVO.fromEspecialidad(especialidad));
			}
			
			resultado = gson.toJson(especialidadesVO);
			
		} catch (Exception e) {
			
		}
		return resultado;
	}
}
