package in.sp.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.main.model.Ca;
import in.sp.main.model.CaId;

public interface  CaDao extends JpaRepository<Ca, CaId> {
    
}
