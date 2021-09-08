package com.digitalers.clase6;

public class FileParserMain {

	public static void main(String[] args) throws ParserException {
			
		String tipoIngresadoPorUsuario = "pepe";
		
		TipoEnum tipoValido = TipoEnum.getEnum(tipoIngresadoPorUsuario);
		
		//if(tipoValido != null) {
			IFileParser unParser = ParserManager.getParser(tipoValido);
			String valorParseado = unParser.parse();
			System.out.println(valorParseado);
		/*}else {
			System.out.println("No existe el ENUM asociado a " + tipoIngresadoPorUsuario);
		}*/
	}

}
