package com.runage.breweryprojectservice.web.dto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import com.runage.breweryprojectservice.util.BeerStyleEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDTO {

	private UUID id;
	private Integer version;
	
	private OffsetDateTime createdDate;
	private OffsetDateTime lastModifiedDate;
	
	private String beerName;
	private BeerStyleEnum beerStyle;
	private Long upc;
	
	private BigDecimal price;
	private Integer quantityOnHand;
}
