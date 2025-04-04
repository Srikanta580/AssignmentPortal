package in.sp.main.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import in.sp.main.model.Faculty;

public interface  FacultyDao extends JpaRepository<Faculty, Integer> {
    
}
