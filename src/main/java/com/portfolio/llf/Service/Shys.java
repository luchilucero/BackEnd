package com.portfolio.llf.Service;

import com.portfolio.llf.Entity.hys;
import com.portfolio.llf.Repository.Rhys;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@Transactional
@Service
@CrossOrigin(origins = {"https://frontend-llf.web.app", "http://localhost:4200"})
public class Shys {
    @Autowired
    Rhys rhys;
    
    public List<hys> list(){
        return rhys.findAll();
    }
    
    public Optional<hys> getOne(int id){
        return rhys.findById(id);
    }
    
    public Optional<hys> getByNombre(String nombre){
        return rhys.findByNombre(nombre);
    }
    
    public void save(hys skill){
        rhys.save(skill);
    }
    
    public void delete (int id){
        rhys.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rhys.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rhys.existsByNombre(nombre);
    }
    
}
