package service;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import model.TouristPlace;

public class MapOperations {
	Map<String,TouristPlace> map = new LinkedHashMap<String, TouristPlace>();
	Map<String,TouristPlace> Hashmap = new HashMap<String, TouristPlace>();
	Map<String,TouristPlace> Treemap = new TreeMap<String, TouristPlace>();
	
	public Map<String,TouristPlace> add(TouristPlace places){
		map.put(places.getRank(), places);  //to add
		return map;
	}
	//sortRandomly
	public Map<String,TouristPlace> sortRandomly(TouristPlace places){
		return Hashmap;	
	}
	// sortInEntryOrder
	public Map<String,TouristPlace> sortInEntryOrder(TouristPlace places){
		return map;
		
	}
	// sortAlphabetically
	public Map<String,TouristPlace> sortAlphabetically(TouristPlace places){
		return Treemap;
	}
	//Object reset(HashMap<String,TouristPlace> places)
	public Object reset(HashMap<String,TouristPlace> places) {
		Hashmap.clear();
		return Hashmap;
	}
	public Map<String,TouristPlace> remove(TouristPlace places){
		Hashmap.remove(places.getRank(),places);
		return Hashmap;
	}
}