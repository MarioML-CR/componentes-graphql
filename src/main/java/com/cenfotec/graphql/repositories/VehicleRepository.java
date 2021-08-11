package com.cenfotec.graphql.repositories;

import com.cenfotec.graphql.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
