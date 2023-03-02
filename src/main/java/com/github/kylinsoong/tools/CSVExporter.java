package com.github.kylinsoong.tools;

import java.io.IOException;

import com.github.odiszapc.nginxparser.NgxBlock;
import com.github.odiszapc.nginxparser.NgxConfig;

public class CSVExporter {
	
	
	
	public static void main(String[] args) throws IOException {
		
		NgxConfig conf = NgxConfig.read("/Users/ksong/Documents/docs/3_HXB/202301-nginx/conf/jzcg.conf");
		
		conf.getEntries().forEach(e -> {
			NgxBlock b = (NgxBlock) e;
			System.out.println(b + " " + b.getEntries());
		});
		
		
	}

}
