package com.cinema.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AgeLimit {
	
	PG("0+"), PG_13("13+"), R("16+"), NC_17("18+");
	
	private String ageLimitStr;

}
