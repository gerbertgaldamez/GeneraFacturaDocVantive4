package com.qitcorp.util;

import java.util.List;

//import com.qitcorp.model.CBParametrosModel;
import com.qitcorp.model.TcFacturasVantiveModel;

public class Tools {
	
	
	//public static final String facturasVantive = "src/main/resources/config.properties";
	public static final String facturasVantive = "config.properties";
	
	public static final String obtenerFacturasVantiveParametros = " SELECT bill_ref_no, tcgncid, url "
			+ "FROM WS_DOC1_NC_HEADER_VW "
			+ "where bill_ref_no  >= (SELECT TO_NUMBER(VALOR) FROM TC_MIGRACION_PARAMETROS WHERE PARAMETRO = 'TCNCHEADERID' ) "
			+ "and ind_provision = 1 "
			+ "AND url is null ";
	
	
	public static final String actualizaTcgNcHeader  =  "update tcg_nc_header set URL = ? where TCGNCID  = ? ";
	//
	//+ " and b.dispositivo is null "
	
	//Obtener parametro para WS
		/*public static String obtenerParametro(String parametro, List<TcFacturasVantiveModel> parametros) {

			if (parametros != null && parametros.size() > 0) {
				for (TcFacturasVantiveModel item : parametros) {
					if (item.getObjeto().equals(parametro)) {
						logger.info("OBJETO => "+item.getObjeto()+" - VALOR OBJETO1 => "+item.getValorObjeto1());
						return item.getValorObjeto1();
					}
				}
			} else {
				return "";
			}

			return "";
		}*/
		
						
}
