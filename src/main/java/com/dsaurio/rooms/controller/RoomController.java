package com.dsaurio.rooms.controller;

import java.util.List;

import com.dsaurio.rooms.services.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsaurio.rooms.model.Room;

@RestController
@AllArgsConstructor
public class RoomController {

	private RoomService service;
	
	@GetMapping("rooms")
	public List<Room> search(){
		return (List<Room>) this.service.search();	
	}
}
