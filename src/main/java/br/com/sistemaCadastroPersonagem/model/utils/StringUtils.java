package br.com.sistemaCadastroPersonagem.model.utils;

public class StringUtils {
	
	public static boolean isNullorEmpty(String string) {
			
		if(string.isEmpty() || string == null) {
			return false;
		}
		
		return true;
	}

}
