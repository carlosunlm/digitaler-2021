package com.digitalers.clase6;

public class ParserManager {

	public static IFileParser getParser(TipoEnum tipo) throws ParserException {
		
		if(tipo == null) {
			throw new ParserException("Debe informar un parser valido");
		}
		
		IFileParser parser;
		
		if(TipoEnum.CSV.equals(tipo)) {
			parser = new CSVFileParser();
		}else if(TipoEnum.XLS.equals(tipo)) {
			parser = new XLSFileParser();
		}else {
			parser = new PDFFileParser();
		}
		return parser;
	}
}
