package service;

import java.util.ArrayList;
import java.util.List;
import model.TouristPlace;


public class ListOperations {
	List<TouristPlace> list = new ArrayList<TouristPlace>();
	public List<TouristPlace> add(TouristPlace places){
		list.add(places);
		return list;
		
	}
	
	public List<TouristPlace> remove(TouristPlace places){
		list.remove(places);
		return list;
		
	}
	
	public Object sortByDestination(List<TouristPlace> places) {
		list.sort((TouristPlace TP1, TouristPlace TP2) -> TP1.getDestination().compareTo(TP2.getDestination()));
		return list;
		
	}
	
	public Object sortByRank(List<TouristPlace> places) {
		list.sort((TouristPlace TP1,TouristPlace TP2) ->TP1.getRank().compareTo(TP2.getRank()));
		return list;
	}
	
	public Object reset(List<TouristPlace> places) {
		list.clear();
		return list;
	}


}