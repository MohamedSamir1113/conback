package com.example.toolsprojectphase1.controller;
import com.example.toolsprojectphase1.entities.Admin;
import com.example.toolsprojectphase1.entities.Station;
import com.example.toolsprojectphase1.entities.Trip;
import com.example.toolsprojectphase1.services.AdminService;
import com.example.toolsprojectphase1.services.StationService;
import com.example.toolsprojectphase1.services.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/trip")
@CrossOrigin(origins = "http://localhost:4200")
public class TripController {
    @Autowired
    TripService tripService;

    @PostMapping("/createTrip")
    @CrossOrigin(origins = "http://localhost:4200")
    public void createTrip(@RequestBody Trip t){
        tripService.createTrip(t);

    }

    @GetMapping("/getTrip/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Trip getTripById(@PathVariable Long id)
    {
        return tripService.getTrip(id);
    }

    @GetMapping("/getAll")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Trip> getAllTrips(){
        return tripService.getAllTrips();
    }

    @DeleteMapping("/deleteTrip/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void deleteTrip(@PathVariable Long id){
        tripService.deleteTrip(id);
    }

    @PutMapping("/updateTrip/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Trip updateTrip(@RequestBody Trip body ,@PathVariable Long id){
        return tripService.updateTrip(body, id);
    }

}