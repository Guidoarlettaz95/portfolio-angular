package com.proyecto.guido.Service;


import com.proyecto.guido.Entity.Persona;
import com.proyecto.guido.Repository.IPersonasRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpPersonasService {
    
     @Autowired
    IPersonasRepository ipersonasRepository;
     
     public List<Persona> list(){
         return ipersonasRepository.findAll();
     }
     
     public Optional<Persona> getOne(int id){
         return ipersonasRepository.findById(id);
     }
     
     public Optional<Persona> getByNombre(String nombre){
         return ipersonasRepository.findByNombre(nombre);
     }
     
     public void save(Persona persona){
         ipersonasRepository.save(persona);
     }
     
     public void delete(int id){
         ipersonasRepository.deleteById(id);
     }
     
     public boolean existsById(int id){
         return ipersonasRepository.existsById(id);
     }
     
     public boolean existsByNombre(String nombre){
         return ipersonasRepository.existsByNombre(nombre);
     }
}
     
     

