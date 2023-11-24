package com.example.rentcar2.car;

import com.example.rentcar2.car.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
@Repository
public interface CarRepository extends JpaRepository<Car, UUID> {

@Query(value = "select c from Car c where c.dateReceiving>=:dateReceiving and c.returnDate>=:returnDate or c.returnDate<=:dateReceiving or c.returnDate=null" +
        "")
    List<Car>findByDate(@Param("dateReceiving") LocalDate dateReceiving, @Param("returnDate") LocalDate returnDate);
}
