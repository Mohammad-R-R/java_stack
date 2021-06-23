package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.Song;
import com.example.demo.repo.LookfiyRepository;

@Service
public class LookifyService {
	private final LookfiyRepository lookfiyRepository;
	
	public LookifyService(LookfiyRepository lookfiyRepository) {
		this.lookfiyRepository = lookfiyRepository;
	}
	
	public List<Song> finaAllSongs(){
		return this.lookfiyRepository.findAll();
	}
	public Song finaSongById(Long id) {
		Optional<Song> optionalSong =  lookfiyRepository.findById(id);
		if(optionalSong.isPresent()) {
			return optionalSong.get();
		}
		return null;
	}
	public Song findSongById(Long id) {
		Optional<Song> optinalSong = this.lookfiyRepository.findById(id);
		if(optinalSong.isPresent()) {
			return optinalSong.get();
		}
		return null;	
	}
	public void deleteSong(Long id) {
		this.lookfiyRepository.deleteById(id);
	}
	public Song create(Song s) {
	return	this.lookfiyRepository.save(s);
	}
	
	public List<Song> findtop10() {
		return lookfiyRepository.findTop10ByOrderByRatingDesc();
	}
	public List<Song> search(String search){
		return lookfiyRepository.findByArtistContaining(search);
	}
//	public List<Song> findTop10(){
//		return lookfiyRepository.findTop10RatingByOrderByDesc();
//	}

//	public Object search(String serach) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
//	public List<Song> findArtist(String search) {
//		return lookfiyRepository.findByArtistContaining(search);
//	}
	
	
	
}
