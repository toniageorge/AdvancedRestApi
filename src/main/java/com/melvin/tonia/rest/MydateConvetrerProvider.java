package com.melvin.tonia.rest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Calendar;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

import com.melvin.tonia.model.MyDate;

@Provider
public class MydateConvetrerProvider implements ParamConverterProvider {

	public <T> ParamConverter<T> getConverter(final Class<T> rawType, Type genericType, Annotation[] annotations) {
		// TODO Auto-generated method stub
		
		if(rawType.getName().equals(MyDate.class.getName())){
			
			return new ParamConverter<T>(){

				public T fromString(String value) {
					Calendar cal = Calendar.getInstance();
					if("yesterday".equals(value)){
						
						cal.add(Calendar.DATE, -1);
						
					}
					else if("tommorow".equals(value)){
						cal.add(Calendar.DATE, 1);
					}
					MyDate date = new MyDate();
				
					date.setDay(cal.get(Calendar.DATE));
					date.setMonth(cal.get(Calendar.MONTH));
					date.setYear(cal.get(Calendar.YEAR));
					return rawType.cast(date);
				}

				public String toString(T value) {
					// TODO Auto-generated method stub
					if(value != null){
						value.toString();
					}
					return null;
				}
				
			};
		}
		return null;
	}
	
}
