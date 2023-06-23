package com.dsaurio.rooms.services;

import java.util.List;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import com.dsaurio.rooms.repository.RoomRepository;
import com.dsaurio.rooms.model.Room;

@Service
@AllArgsConstructor
public class RoomServiceImpl implements RoomService {
	
	private RoomRepository roomRepository;

	@Override
	public List<Room> search() {
		return (List<Room>) roomRepository.findAll();
	}

}
