package com.runage.breweryprojectservice.web.pages;

import java.util.List;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import com.runage.breweryprojectservice.web.dto.BeerDTO;

@SuppressWarnings("serial")
public class BeerPagedList extends PageImpl<BeerDTO>{

	public BeerPagedList(List<BeerDTO> content, Pageable pageable, long total) {
		super(content, pageable, total);
	}
	
	public BeerPagedList(List<BeerDTO> content) {
		super(content);
	}

}
