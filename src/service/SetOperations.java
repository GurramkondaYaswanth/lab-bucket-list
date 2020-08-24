package service;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import model.TouristPlace;

public class SetOperations{
	HashSet<TouristPlace> Hset = new HashSet<TouristPlace>();
	TreeSet<TouristPlace> Tset = new TreeSet<TouristPlace>();
	
	public HashSet<TouristPlace> add(TouristPlace places){
		Hset.add(places);
		return Hset;
		
	}
	
	public HashSet<TouristPlace> remove(TouristPlace places){
		Hset.remove(places);
		return Hset;
	}
	
	public Object sortByDestination(HashSet<TouristPlace> places) {
		TreeSet<TouristPlace> sbd=new TreeSet<>((d1,d2)->d1.getDestination().compareTo(d2.getDestination()));
		return sbd;
	}
	public Object sortByRank(HashSet<TouristPlace> places) {
		TreeSet<TouristPlace> sbr=new TreeSet<>((d1,d2)->d1.getRank().compareTo(d2.getRank()));
		return sbr;
	}
	public Object reset(HashSet<TouristPlace> places) {
		Hset.clear();
		return Hset;
	}
}
