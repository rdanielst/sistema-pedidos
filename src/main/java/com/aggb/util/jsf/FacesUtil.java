package com.aggb.util.jsf;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class FacesUtil {

	public static void addSuccessMessage(String message) {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, message, message));
	}

	public static void addErrorMessage(String message) {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_ERROR, message, message));
	}
	
	public static void addWarmMessage(String message) {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_WARN, message, message));
	}
	
	public static String getBeaseDir(){
		//return "/home/alphagr/public_html/upload/fgv_v2/";
		return "C:/fgv_v2/";
		//return "/Users/danieltartaglia/Documents/fgv/";
	}
	
	
	public static String getBeaseDirImagensPerfil(){
		//return "/home/alphagr/public_html/upload/fgv_v2/imagens/";
		return "C:/fgv_v2/imagens/";
		//return "/Users/danieltartaglia/Documents/fgv/imagens/";
	}

}