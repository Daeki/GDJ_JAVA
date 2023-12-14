package com.winter.study4.lang.ex1;

public class WeatherService {
	
	private String datas;
	
	public WeatherService() {
		this.datas="서울-10-비-80-부산-25-맑음-50,대구-82-눈-12,제주.25,태풍.75";
	}
	
	//init
	public void init() {
		//1. 
		this.datas = this.datas.replace(",", "-");
		this.datas = this.datas.replace('.', '-');
		System.out.println(this.datas);
	}

}
