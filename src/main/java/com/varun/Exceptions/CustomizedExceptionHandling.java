package com.varun.Exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomizedExceptionHandling{

    @ExceptionHandler(DoctorAlreadyExistsException.class)
    	public ResponseEntity<?> DoctorAlreadyExistsException(DoctorAlreadyExistsException ex) {
    		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(DoctorDoesNotExistException.class)
	public ResponseEntity<?> DoctorDoesNotExistException(DoctorDoesNotExistException ex) {
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
}
    @ExceptionHandler(AppointmentException.class)
   	public ResponseEntity<?> AppointmentException(AppointmentException ex) {
   		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
   }
    
    @ExceptionHandler(DoctorAppointmentException.class)
   	public ResponseEntity<?> DoctorAppointmentException(DoctorAppointmentException ex) {
   		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
   }
    
    @ExceptionHandler(HospitalsException.class)
   	public ResponseEntity<?> HospitalsException(HospitalsException ex) {
   		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
   }
    
    
    @ExceptionHandler(PatientException.class)
   	public ResponseEntity<?> PatientException(PatientException ex) {
   		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
   }
    
    @ExceptionHandler(ReporterException.class)
   	public ResponseEntity<?> ReporterException(ReporterException ex) {
   		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
   }
    
    @ExceptionHandler(UserAlreadyExistsException.class)
   	public ResponseEntity<?> UserAlreadyExistsException(UserAlreadyExistsException ex) {
   		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
   }


}
