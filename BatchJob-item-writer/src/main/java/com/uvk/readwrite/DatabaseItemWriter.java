package com.uvk.readwrite;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.uvk.model.Vendor;

public class DatabaseItemWriter implements ItemWriter<Vendor>{

	public void write(List<? extends Vendor> vendor) throws Exception {
		
		
		System.out.println("Vendor in writer : "+vendor);
	}

}
