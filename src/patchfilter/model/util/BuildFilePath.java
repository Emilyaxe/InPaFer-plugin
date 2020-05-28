package patchfilter.model.util;

import patchfilter.model.entity.Subject;

import patchfilter.model.config.Constant;

/*
 * 这个类主要是为 patch 或者 class file build 各种 record file path
 * 比如 cache file 或者是 tmp file
 */
public class BuildFilePath {
	//private String fileString;
	//private Subject subject;
	
	public static String cacheModifiedMethodName(String fileString, Subject subject) {
		return Constant.CACHE + "/" + subject.getName() + "/" + subject.getId() + "/" + fileString;
 	}
	public static String cacheModifiedMethodContent(String fileString, Subject subject) {
		return Constant.CACHE + "/" + subject.getName() + "/" + subject.getId() + "/" + fileString + "_method";
 	}
	public static String cacheModifiedMethodRange(String fileString, Subject subject) {
		return Constant.CACHE + "/" + subject.getName() + "/" + subject.getId() + "/" + fileString ;
 	}
	
	public static String tmpLine(String fileString, Subject subject) {
		return Constant.Record + "/" + subject.getName() + "/" + subject.getId()  + Constant.INSTRUMENT_LINE_DIR +  fileString + Constant.INSTRUMENT_LINE_SEPARATORINIT ;
 	}
	public static String tmpMapTraceLine(String fileString, Subject subject) {
		return Constant.Record + "/" + subject.getName() + "/" + subject.getId()  + Constant.INSTRUMENT_LINE_DIR +  fileString + Constant.INSTRUMENT_LINE_SEPARATORINIT 
				+ Constant.MAPTRACE;
	}
	public static String tmpMapLine( Subject subject) {
		return Constant.Record + "/" + subject.getName() + "/" + subject.getId()  + Constant.INSTRUMENT_LINE_DIR +  "map";
	}
	
	
	public static String tmpState(String fileString, Subject subject) {
		return Constant.Record + "/" + subject.getName() + "/" + subject.getId()  + Constant.INSTRUMENT_STATE_DIR +  fileString + Constant.INSTRUMENT_STATE_SEPARATORINIT ;
 	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
